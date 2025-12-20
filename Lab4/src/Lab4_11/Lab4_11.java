package Lab4_11;

import java.util.Scanner;

class Configuration {

    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {

        if (fontSize < 10) {
            fontSize = 10;
        } else if (fontSize > 20) {
            fontSize = 20;
        }

        this.theme = theme;
        this.fontSize = fontSize;
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.fontSize = base.fontSize;
        this.darkMode = user.darkMode;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize +", Dark: " + darkMode);
    }
}

public class Lab4_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base theme:");
        String baseTheme = input.nextLine();
        System.out.print("Enter base font size:");
        int baseFontSize = input.nextInt();
        System.out.print("Enter mode (true/false):");
        boolean baseDark = input.nextBoolean();

        input.nextLine();
        System.out.print("Enter user theme:");
        String userTheme = input.nextLine();
        System.out.print("Enter user font size:");
        int userFontSize = input.nextInt();
        System.out.print("Enter mode (true/false):");
        boolean userDark = input.nextBoolean();

        Configuration baseConfig =
            new Configuration(baseTheme, baseFontSize, baseDark);

        Configuration userConfig =
            new Configuration(userTheme, userFontSize, userDark);

        Configuration finalConfig =
            new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
    }
}
