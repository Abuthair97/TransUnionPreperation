package DSA_Basic_Maths;

import java.util.Scanner;

public class CountDigits {
    static int count(int number){
        int count = 0;
        while(number != 0 ){


           number= number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(count(num));
    }
}

