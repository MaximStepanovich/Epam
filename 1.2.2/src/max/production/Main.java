package max.production;

import java.util.Scanner;

public class Main {

    public static int function_min(int a,int b){
        int min;
        if(a < b)
            min = a;
        else
            min = b;
        return min;
    }
    public static int function_max(int a,int b){
        int max;
        if(a > b)
            max = a;
        else
            max = b;
        return max;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 numbers(a,b)");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        System.out.println("Input 2 more numbers(c,d)");
        int number3 = in.nextInt();
        int number4 = in.nextInt();
        System.out.println("max {min(a,b), min(c,d)} = "+ function_max(function_min(number1,number2),function_min(number3,number4)));
    }
}
