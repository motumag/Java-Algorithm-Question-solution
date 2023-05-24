package SimpleMaths;

public class CountNumberOfDigits {
    int countNumberOfDigts(int n){
        int count =0;
        while (n>0){
            int lastDigit=n%10;
            System.out.println("what is last digit: "+lastDigit);
            count=count+1;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        CountNumberOfDigits countNumber=new CountNumberOfDigits();
      int counted=  countNumber.countNumberOfDigts(987345);
        System.out.println(counted);

    }
}
