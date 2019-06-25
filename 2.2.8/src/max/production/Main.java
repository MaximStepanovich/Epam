package max.production;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = 5, help;
        Random rand = new Random();
        int [][] arr = new int [size][size];

        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                arr[i][j] = Math.abs(rand.nextInt()% 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Change №");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),
                b = in.nextInt();
        for(int i = 0; i < size; i ++){
            help = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = help;
        }
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size;j ++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
