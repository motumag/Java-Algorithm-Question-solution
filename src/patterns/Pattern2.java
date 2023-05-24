package patterns;

public class Pattern2 {
    void patternTwo(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Pattern2 p2=new Pattern2();
        p2.patternTwo(6);

    }
}
