package DSA_LogicBuildingParterns;

public class StriverPattern4 {
    static void pattern4(int num){
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(4);
    }
}
