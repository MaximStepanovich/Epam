package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 5, max = 0, total = 0, number = 0;
        Random rand = new Random();
        int [][] arr = new int [size][size];

        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                arr[i][j] = Math.abs(rand.nextInt()% 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int j = 0; j < size; j ++){
            for(int i = 0; i < size; i ++){
                max += arr[i][j];
            }
            if(max > total) {
                total = max;
                number = j +1;
            }
            max = 0;
        }
        System.out.println(number + " is max. Summa = " + total);
    }
}
