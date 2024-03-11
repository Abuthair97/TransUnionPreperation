package DSA_Basic_Maths;

public class PrintAllDivisorable {
    static void divisibles(int num){

        for(int i = 1; i <= num ; i++){
            if(num % i == 0){
                System.out.print(i +"  ");
            }
        }
    }

    public static void main(String[] args) {
     divisibles(20);
    }
}
