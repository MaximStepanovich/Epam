package max.production;

public class Main {

    public static void main(String[] args) {
        int size = 5;
        int [][] arr = new int [size][size];
        for(int i = 0; i < size; i ++)
            for(int j =0; j < size - i; j ++)
                arr[i][j] = i+1;
        for(int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
