package Lab3_11;
import java.util.Scanner;

class SystemConfig {

    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return this.maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; ) {
            String command = input.nextLine().trim();

            if (command.startsWith("URL:") || command.startsWith("MAX:") || command.isEmpty()) {
                continue;
            }

            if (command.equals("SET_URL")) {
                String url = input.nextLine();
                SystemConfig.getInstance().setServerUrl(url);

            } else if (command.equals("SET_MAX")) {
                int max = Integer.parseInt(input.nextLine());
                SystemConfig.getInstance().setMaxConnections(max);         

            } else if (command.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
    }
}