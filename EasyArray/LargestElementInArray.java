package EasyArray;

import java.util.Scanner;

public class LargestElementInArray {
    static int findLargestElement(int[] arr){
        int largest = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0 ; i < 5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" Largest Element is : "+findLargestElement(arr));
    }

}
