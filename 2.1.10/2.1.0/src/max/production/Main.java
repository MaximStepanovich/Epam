package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int [] arr = new int [size];
        Random rand = new Random();
        for(int i = 0; i < size; i ++){
            arr[i] = Math.abs(rand.nextInt()%11);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0, j = 1; j < size; i++, j =2*i +1 )
            arr[i] = arr[j];

        for(int i = (int)(size/2); i<size; i ++)
            arr[i] = 0;
        for(int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
    }
}
