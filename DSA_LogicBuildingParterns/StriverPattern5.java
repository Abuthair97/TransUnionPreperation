package DSA_LogicBuildingParterns;

public class StriverPattern5 {
    static void pattern5(int num){
        for(int i = 1; i<num;i++){
            for(int j = num; j > i ;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     pattern5(4);
    }
}
