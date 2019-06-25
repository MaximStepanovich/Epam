package max.production;

import java.math.BigInteger;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N =10;
   double [] arr = new double [N];
        Random rand = new Random();
        for(int i = 0; i < N; i++){
            arr[i] = rand.nextDouble();
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 1; i < N; i ++){
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime((int)Math.log(i));
            if(probablePrime)
                System.out.print(arr[i] + " ");
        }
    }
}
