package DSA_Basic_Maths;

import java.util.Scanner;

public class GreatCommonDecimal {
    static int gcd(int a,int b){
        int ans = 1;
        for(int i = 1; i <= Math.min(a,b);i++){
            if(a % i == 0 && b % i == 0){
                ans =i;
            }
        }
return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int   a = sc.nextInt();
        int b = sc.nextInt();
        int ans = gcd(a,b);
        System.out.println(ans);
    }
}
