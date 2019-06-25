package max.production;
//import static java.lang.Math.;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input a ");
        double a = in.nextDouble();

        System.out.println("Input b ");
        double b = in.nextDouble();

        System.out.println("Input c ");
        double c = in.nextDouble();

        System.out.println((b + Math.sqrt(b*b+4*a*c)) / 2 * a - Math.pow(a,3) * c + Math.pow(b,-2));

    }
}
