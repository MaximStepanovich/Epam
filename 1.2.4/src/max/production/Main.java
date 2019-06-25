package max.production;

import java.util.Scanner;

public class Main {
    public static int function_min(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
    public static int function_max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }
    public static int function_sr(int a, int b, int c){
        return a + b + c - Math.min(Math.min(a,b),c) - Math.max(Math.max(a,b),c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter brick size(x, y, z) ");
        int x = in.nextInt(),
                y = in.nextInt(),
                z = in.nextInt();
        System.out.println("enter hole size(A, B) ");
        int A = in.nextInt(),
                B = in.nextInt();
        if(Math.min(A, B) >= function_min(x, y, z) && Math.max(A, B) >= function_sr(x, y, z))
            System.out.println("All is well");
        else
            System.out.println("All is bad");
    }
}
