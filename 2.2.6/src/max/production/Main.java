package max.production;

public class Main {

    public static void main(String[] args) {
        int size = 9;
        int [][] arr = new int [size][size];              //верхняя четверть
        for(int i = 0; i < size; i ++)
            for( int j = i; j < size - i; j ++) {
                arr[i][j] = 1;
                arr[size - 1- i][j] = 1;
            }

        for(int i = 0; i < size; i ++){
                for( int j = 0; j < size; j ++)
                    System.out.print(arr[i][j]+ " ");
                System.out.println();
        }
    }
}
