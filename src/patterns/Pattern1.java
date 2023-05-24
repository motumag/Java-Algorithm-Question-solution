package patterns;

public class Pattern1 {
    void patternOne(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);//u can use here also * to print
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Pattern1 p1=new Pattern1();
        p1.patternOne(5); //test cases
        p1.patternOne(7);//test cases

    }
}
