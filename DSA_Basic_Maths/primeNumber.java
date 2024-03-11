package DSA_Basic_Maths;

public class primeNumber {
    static boolean isPrimeOrNot(int num){
        for(int i = 2 ; i <= Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       boolean ans = isPrimeOrNot(7);
       System.out.println(ans);
    }
}
