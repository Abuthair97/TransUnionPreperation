package DSA_Basic_Maths;

import java.util.Scanner;

public class ArmStromNumber {
    static String armStrongNumber(int number){
        int x = number;
        int armNumber =0;
        while(x != 0){
            int rem = x % 10;
            armNumber =armNumber +  (rem*rem*rem);
            x/=10;
        }
        if(number == armNumber){
            return "Its ArmStrongNumber";
        }
        return "Its not ArmStrongNumber";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       String ans = armStrongNumber(num);
       System.out.println(ans);
    }
}
