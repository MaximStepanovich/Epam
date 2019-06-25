import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("input a ");
        double a =in.nextDouble();

        System.out.println("input b ");
        double b =in.nextDouble();

        System.out.println("input c ");
        double c =in.nextDouble();

        double z = ((a-3)*b/2)+c;

        System.out.println("Function z= "+z);
    }
}
