public class NoteAssignment {


    public static void main(String[] args) {


        double INCHPAGEWIDTH = 8.5;
        int INCHPAGEHEIGHT = 11;
        double MILPERINCH = 25.4;
        double milPageWidth;
        double milPageHeight;

        milPageWidth = INCHPAGEWIDTH * MILPERINCH;
        milPageHeight = INCHPAGEHEIGHT * MILPERINCH;

        System.out.print("The dimensions of a letter-size sheet of paper are:" + milPageWidth + "x" + milPageHeight);


    }
}