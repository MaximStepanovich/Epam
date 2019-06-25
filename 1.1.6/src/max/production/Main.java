package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input coordinates");
        double point_x = in.nextDouble();
        double point_y = in.nextDouble();
        if(point_x >= -2 && point_x <= 2 && point_y >= 0 && point_y <= 4)
            System.out.println(true + " up");
        else if(point_x >= -4 && point_x <= 4 && point_y >= -3 && point_y <= 0){
            System.out.println(true + " down");
        }
        else{
            System.out.println(false);
        }

    }
}
