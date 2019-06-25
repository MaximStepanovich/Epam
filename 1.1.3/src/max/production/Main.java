package max.production;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Input x");
            double x = in.nextDouble();
            System.out.println("Input y");
            double y=in.nextDouble();
            System.out.println((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        }
        catch (Exception t) {
            System.out.println("ERROR");
        }
        }


    }

