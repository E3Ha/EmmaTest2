public class Practice4 {

    public static void main(String[] args){

        double initialBalance = 1000;
        double INTEREST = 1.05;

        initialBalance = initialBalance * INTEREST;

        System.out.println("First Month:" + initialBalance);

        initialBalance = initialBalance * INTEREST;

        System.out.println("Second Month:" + initialBalance);

        initialBalance = initialBalance * INTEREST;

        System.out.println("Third Month:" + initialBalance);


    }

}
