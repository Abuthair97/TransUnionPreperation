package DSA_Basic_Maths;

public class sumOfAllDivisibles {
    static int sumDiv(int num){
        int ans = 0;
        for(int i = 1; i <= num ;i++){
            if(num % i == 0){
                ans=ans+i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sumDiv(5));
    }
}
