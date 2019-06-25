package max.production;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        for(int i=1; i <= 100; i++)
            total += i * i;
        System.out.println(total);
    }
}
