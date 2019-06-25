package max.production;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("enter any positive integer");
            int number = in.nextInt(),
                    summa = 0;
            for(int i = 0; i < number; i++)
                summa += i;
            System.out.println("Summa="+summa);
        }
        catch(Exception t){
            System.out.println("check please your input");
        }
        }
}
