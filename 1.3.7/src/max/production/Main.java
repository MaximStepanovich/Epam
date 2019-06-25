package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a interval");
        int a = in.nextInt(),
                b = in.nextInt();
        for(int i = a; i <= b; i ++){
            System.out.println("Divisors " + i);
            for(int j = 2; j <= i / 2; j ++)
                if (i % j == 0)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}
