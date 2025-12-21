package Lab4_15;

import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        if (logs == null) {
            this.logMessages = new String[0];
        } else if (logs.length > maxMessages) {
            this.logMessages = new String[maxMessages];
            for (int index = 0; index < maxMessages; index++) {
                this.logMessages[index] = logs[logs.length - maxMessages + index];
            }
        } else {
            this.logMessages = new String[logs.length];
            for (int index = 0; index < logs.length; index++) {
                this.logMessages[index] = logs[index];
            }
        }
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
        }
    }

    public AuditRecord addMessage(String message, String[] outputLogs, int messageIndex) {
        int currentLogCount = logMessages.length;
        if (currentLogCount < maxMessages) {
            String[] newLogMessages = new String[currentLogCount + 1];
            for (int i = 0; i < currentLogCount; i++) {
                newLogMessages[i] = logMessages[i];
            }
            newLogMessages[currentLogCount] = message;
            if (currentLogCount >= 1) {
                outputLogs[messageIndex] = message + " added.";
            } else {
                outputLogs[messageIndex] = null;
            }
            return new AuditRecord(user, newLogMessages);
        } else {
            outputLogs[messageIndex] = "Log is full.";
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int index = 0; index < logMessages.length; index++) {
            System.out.print(logMessages[index]);
            if (index < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxMessagesInput = Integer.parseInt(scanner.nextLine());
        AuditRecord.setMaxMessages(maxMessagesInput);
        
        String username = scanner.nextLine();
        AuditRecord auditRecord = new AuditRecord(username);
        
        int numberOfLogs = Integer.parseInt(scanner.nextLine());
        String[] outputLogs = new String[numberOfLogs + 1];
        
        outputLogs[0] = "Policy set to " + maxMessagesInput;
        for (int messageIndex = 0; messageIndex < numberOfLogs; messageIndex++) {
            String message = scanner.nextLine();
            auditRecord = auditRecord.addMessage(message, outputLogs, messageIndex + 1);
        }
        for (int i = 0; i < outputLogs.length; i++) {
            if (outputLogs[i] != null) {
                System.out.println(outputLogs[i]);
            }
        }
        auditRecord.displayLog();
        scanner.close();
    }
}
