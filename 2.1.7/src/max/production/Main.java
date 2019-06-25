package max.production;

public class Main {

    public static void main(String[] args) {
        int size = 10, max = 0;
        int [] arr = {1, 21, 32, 14, 55, 13, 71, 28, 19, 41};
        int [] arr1 = new int[size/2];
        for(int i = 0, j = size-1; i < size/2; i ++, j --){
            arr1[i]= arr[i] + arr[j];
            System.out.print(arr1[i] + " ");
        }
        for(int i =0; i < (size/2)-1; i ++)
            if(arr1[i] > arr1[i+1])
                max = arr1[i];
        System.out.println();
        System.out.println(max);
    }
}
