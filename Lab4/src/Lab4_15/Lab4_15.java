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
            for (int i = 0; i < maxMessages; i++) {
                this.logMessages[i] = logs[logs.length - maxMessages + i];
            }
        } else {
            this.logMessages = new String[logs.length];
            for (int i = 0; i < logs.length; i++) {
                this.logMessages[i] = logs[i];
            }
        }
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
        }
    }

    public AuditRecord addMessage(String message, String[] outputLogs, int outputIndex) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }
            newLogs[newLogs.length - 1] = message;
            if (logMessages.length > 0) {
                outputLogs[outputIndex] = message + " added.";
            } else {
                outputLogs[outputIndex] = null; // ข้อความแรกไม่โชว์ added
            }
            return new AuditRecord(user, newLogs);
        } else {
            outputLogs[outputIndex] = "Log is full.";
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.parseInt(sc.nextLine());
        AuditRecord.setMaxMessages(max);

        String username = sc.nextLine();
        AuditRecord record = new AuditRecord(username);

        int N = Integer.parseInt(sc.nextLine());

        String[] outputLogs = new String[N + 1]; 
        outputLogs[0] = "Policy set to " + max;

        for (int i = 0; i < N; i++) {
            String msg = sc.nextLine();
            record = record.addMessage(msg, outputLogs, i + 1);
        }

        for (int i = 0; i < outputLogs.length; i++) {
            if (outputLogs[i] != null) {
                System.out.println(outputLogs[i]);
            }
        }

        record.displayLog();
        sc.close();
    }
}
