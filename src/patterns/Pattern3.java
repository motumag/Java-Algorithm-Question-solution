package patterns;

public class Pattern3 {
    void patternThree(int n){
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
//                System.out.print(j);
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Pattern3 p3=new Pattern3();
        p3.patternThree(5);

    }
}
