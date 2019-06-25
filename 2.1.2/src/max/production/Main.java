package max.production;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length arr");
        int N = in.nextInt();
        int [] arr = new int [N];
        Random rand = new Random();
        int Z = 11;
        for(int i = 0; i < N; i ++){
            arr[i] = Math.abs(rand.nextInt() % 15);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < N; i ++){
            if(arr[i] > Z)
                arr[i] = Z;
            System.out.print(arr[i]+" ");
        }
    }
}
