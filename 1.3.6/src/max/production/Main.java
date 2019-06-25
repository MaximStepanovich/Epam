package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol");
        char symbol = in.next(".").charAt(0);
        System.out.println("Number symbol ASCII="+(int)symbol);
    }
}
