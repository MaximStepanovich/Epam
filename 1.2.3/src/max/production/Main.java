package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 3 points");
        int x1 = in.nextInt(),
                y1 = in.nextInt(),
                x2 = in.nextInt(),
                y2 = in.nextInt(),
                x3 = in.nextInt(),
                y3 = in.nextInt();
        if((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))
            System.out.println("Yes");
        else
            System.out.println("NO");
    }
}
