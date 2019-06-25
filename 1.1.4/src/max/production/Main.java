package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input date(double) type ccc.ddd");
        float number = in.nextFloat();
        System.out.println((number*1000)%1000+(int)number/1000.);
    }
}
