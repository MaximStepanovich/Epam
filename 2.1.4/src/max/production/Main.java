package max.production;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 10, index_max=0, index_min=0, max = 0,min = 0;
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++){
            arr[i] = rand.nextInt() % 16;
            System.out.print(arr[i]+" ");
        }
        max = arr[0];
        for(int i = 0; i < N-1; i++){
            if(arr[i+1] > max){
                index_max = i+1;
                max = arr[i+1];
            }

        }
        min = arr[0];
        for(int i = 0; i < N - 1; i++){
            if(arr[i+1] < min) {
                index_min = i + 1;
                min = arr[i + 1];
            }
        }
        arr[index_max] = min;
        arr[index_min] = max;
        System.out.println();
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
      //  System.out.println("max="+index_max+"; min="+index_min);
    }
}
