package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int m = 5, n = 8;
        int[][] arr = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = Math.abs(rand.nextInt() % 10);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        for(int j =1; j < n-1; j +=2)
            for(int i = 0; i < m; i++)
                if(arr[i][j] > arr[i][n-1])
                    System.out.print(arr[i][j]+" ");
    }
}
