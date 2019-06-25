package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int [] arr = new int [size];
        Random rand  = new Random();
        for(int i = 0; i < size; i ++){
            arr[i] = rand.nextInt() % 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0], index = 0;
        for (int i = 1; i < size; i++)
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        for(int i = 0; i < index; i ++)
            System.out.print(arr[i] + " ");
        for (int i = index+1; i < size; i ++)
            System.out.print(arr[i] + " ");
    }
}
