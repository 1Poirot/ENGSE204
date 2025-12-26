package Lab5_6;

import java.util.Scanner;

class Media {

    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {

    protected int duration;
    public Video(int duration) {
        super("Unknown Video");
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {

    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {

    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Lab5_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter video duration: ");
        int duration = Integer.parseInt(input.nextLine());

        System.out.print("Enter audio title: ");
        String audioTitle = input.nextLine();

        System.out.print("Enter audio quality: ");
        String quality = input.nextLine();

        Video video = new Video(duration);
        Audio audio = new Audio(audioTitle, quality);

        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        input.close();
    }
}
