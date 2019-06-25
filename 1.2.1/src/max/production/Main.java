package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input please 2 corners");
        double alfa = in.nextDouble(),
                beta = in.nextDouble();

        if(alfa + beta < 180) {
            if (alfa + beta == 90)
                System.out.println("Right triangle");
            else
                System.out.println("The triangle exists");
        }
        else
            System.out.println("The triangle does not exists");
    }
}
