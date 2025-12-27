package Lab5_11;

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab5_11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text title: ");
        String t1 = input.nextLine();
        System.out.print("Enter word count: ");
        int w1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter PDF title: ");
        String p1 = input.nextLine();
        System.out.print("Enter page count: ");
        int pg1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter Text title: ");
        String t2 = input.nextLine();
        System.out.print("Enter word count: ");
        int w2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter PDF title: ");
        String p2 = input.nextLine();
        System.out.print("Enter page count: ");
        int pg2 = input.nextInt();

        Document[] docs = new Document[4];
        docs[0] = new TextDocument(t1, w1);
        docs[1] = new PDFDocument(p1, pg1);
        docs[2] = new TextDocument(t2, w2);
        docs[3] = new PDFDocument(p2, pg2);

        int totalPages = 0;

        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
    }
}
