package DSA_Basic_Maths;

import java.util.Scanner;

public class ReverseNumber {
    static int reverse(int number){
        int x = number;
        int rev = 0;
        while(x != 0){
            int rem = x % 10 ;
            rev = rev*10+rem;
            x/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int ans = reverse(num);
       System.out.println(ans);
    }
}
