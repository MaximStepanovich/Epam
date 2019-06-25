package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter date in seconds");
        int date = in.nextInt();

        int hours = date / 3600,
                minutes = (date - hours * 3600) / 60,
                seconds = date - hours * 3600 - minutes * 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");
    }
}
