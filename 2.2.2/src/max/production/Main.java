package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        int [][]arr = new int [size][size];
        Random rand = new Random();
        for(int i = 0; i< size; i ++){
            for(int j = 0; j < size; j ++){
                arr[i][j] = Math.abs(rand.nextInt() % 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < size; i ++)
            System.out.print(arr[i][i] + " ");
    }
}
