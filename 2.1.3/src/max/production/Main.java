package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 15, counter_minus = 0, counter_plus = 0, zero = 0;
        int [] arr = new int [N];
        Random rand = new Random();
        for(int i = 0; i < N; i++){
            arr[i] = rand.nextInt() % 100;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < N; i ++)
            if(arr[i] == 0)
                zero ++;
            else if(Math.abs(arr[i]) != arr[i])
                counter_minus ++;
            else if(Math.abs(arr[i]) == arr[i])
                counter_plus ++;
        System.out.println("Plus "+ counter_plus);
        System.out.println("Minus "+ counter_minus);
        System.out.println("Zero "+ zero);
    }
}
