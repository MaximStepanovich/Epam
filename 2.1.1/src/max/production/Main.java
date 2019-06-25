package max.production;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
         final int N = 10;
         int [] arr = new int[N];
         int K = 2, summa = 0;

         Random rand = new Random();
         for(int i = 0; i < N; i ++){
             arr[i] = Math.abs(rand.nextInt() % 16);
             System.out.print(arr[i]+" ");
             if(arr[i] % K == 0)
                 summa += arr[i];
         }
        System.out.println(" Summa = "+summa);
    }
}
