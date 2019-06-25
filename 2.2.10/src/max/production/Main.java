package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        Random rand = new Random();
        int [][] arr = new int [size][size];

        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                arr[i][j] = rand.nextInt() % 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < size; i ++)
            if(arr[i][i] > 0)
                System.out.print(arr[i][i] + " ");
    }
}
