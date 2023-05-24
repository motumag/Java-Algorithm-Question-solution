package patterns;

public class Pattern4 {
    void patternFour(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==i+2){
                  continue;
                }
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
Pattern4 p4=new Pattern4();
p4.patternFour(7);
    }
}
