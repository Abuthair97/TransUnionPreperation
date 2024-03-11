package EasyArray;

import java.util.Scanner;

public class linearSearch {
    static int search(int [] arr ,int num){
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr  = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(search(arr,num));
    }

}
