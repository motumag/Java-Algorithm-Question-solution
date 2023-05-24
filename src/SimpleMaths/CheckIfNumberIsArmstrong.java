package SimpleMaths;

public class CheckIfNumberIsArmstrong {
    int isArmstrong(int n){
        int sum=0;
        int originalNumber=n;
        while(n>0){
            int ld=n%10;
            n=n/10;
            sum= sum+(int) Math.pow(ld,3);
        }
        if(originalNumber==sum){
            System.out.println("The number is Armstrong");
        }else {
            System.out.println("Not armstrong");
        }
        return sum;
    }
    public static void main(String[] args) {
        CheckIfNumberIsArmstrong armstrong=new CheckIfNumberIsArmstrong();
        int checkArm=armstrong.isArmstrong(371);

    }
}
