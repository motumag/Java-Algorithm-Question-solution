package SimpleMaths;

public class PrimeNumbers {
    void isPrimeNumber(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Is prime");
        }else {
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        PrimeNumbers pri=new PrimeNumbers();
        pri.isPrimeNumber(19);
    }
}
