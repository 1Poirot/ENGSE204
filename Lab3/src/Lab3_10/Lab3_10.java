package Lab3_10;

import java.util.Scanner;

class SystemLogger {

    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        if (level == 1) return "INFO";
        if (level == 2) return "DEBUG";
        if (level == 3) return "ERROR";
        return "UNKNOWN";
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class Lab3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter : ");
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String command = input.nextLine().trim();

            if (command.equals("SET")) {
                int level = Integer.parseInt(input.nextLine().trim());
                SystemLogger.setLogLevel(level);
            }
            else if (command.equals("LOG")) {
                int level = Integer.parseInt(input.nextLine().trim());
                String message = input.nextLine();
                SystemLogger.log(level, message);
            }
        }
    }
}
