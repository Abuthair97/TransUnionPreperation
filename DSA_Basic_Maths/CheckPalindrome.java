package DSA_Basic_Maths;

import java.util.Scanner;

public class CheckPalindrome {
    static boolean checkPalindrome(int number){
        int x = number;
        int rev = 0;
        while(x != 0 ){
          int rem =  x % 10 ;
          rev= rev*10 +rem;
          x/=10;
        }
        if(rev == number){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       System.out.println( checkPalindrome(num));

    }
}
