package EasyArray;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    static boolean check(int [] arr){
        for(int i = 1 ; i < arr.length;i++){
           if(arr[i-1] > arr[i]){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
}
