package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter size matrix");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [][] arr = new int[size][size];
        for(int i = 0; i < size; i+=2)
            for(int j = 0; j < size; j ++)
                arr[i][j] = j + 1;

        for(int i = 1; i < size; i +=2)
            for(int j = 0; j < size; j ++)
                arr[i][j] = size - j;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }


    }
}
