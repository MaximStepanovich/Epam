package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int M = 10, N = 20, search = 5, counter = 0;
        int [][] arr = new int [M][N];
        Random rand = new Random();
        for(int i = 0; i < M; i ++){
            for(int j = 0; j < N; j ++){
                arr[i][j] = Math.abs(rand.nextInt() % 16);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < M; i ++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == search)
                    counter++;
            }
            if(counter >=3)
                System.out.println("line " + (i+1));
            counter = 0;
        }
    }
}
