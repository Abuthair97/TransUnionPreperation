package EasyArray;

import java.util.Scanner;

public class SecondSmallestElement {
    static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                smallest = arr[i];
            }
        }
        return  secondSmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondSmallest(arr));
    }
}
