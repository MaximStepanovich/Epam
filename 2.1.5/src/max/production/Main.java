package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 10;
        int [] arr = new int [N];
        Random rand = new Random();
        for(int i = 0; i < N; i ++){
            arr[i] = rand.nextInt() % 21;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < N; i ++)
            if(arr[i] > i)
                System.out.print(arr[i] + " ");
    }
}
