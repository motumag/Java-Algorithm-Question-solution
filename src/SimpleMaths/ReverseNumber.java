package SimpleMaths;

public class ReverseNumber {
    int reverseNumber(int n){
        int revno=0;
        while (n>0){
            int lastDigit=n%10;
            n=n/10;
            revno=(revno*10)+lastDigit;
        }
        return revno;
    }
    public static void main(String[] args) {
        ReverseNumber rev=new ReverseNumber();
      int revDone=  rev.reverseNumber(171);
        System.out.println("Reversed number is: "+revDone);

    }
}
