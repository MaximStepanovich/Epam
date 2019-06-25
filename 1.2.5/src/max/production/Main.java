package max.production;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        double x = in.nextDouble();

        if(x <= 3)
            System.out.println("F(x)="+(x*x-3*x+9));
        else
            System.out.println("F(x)="+(1/(x*x*x+6)));
    }
}
