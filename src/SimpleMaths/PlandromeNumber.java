package SimpleMaths;

public class PlandromeNumber {
    int reverseNumber(int n) {
        int checkPalnedrom = n;
        int revno = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            revno = (revno * 10) + lastDigit;
        }
        if (checkPalnedrom == revno) {
            System.out.println(true);
        } else {
            System.out.println("Not plandrome");
        }
        return revno;
    }
    public static void main(String[] args) {
        PlandromeNumber rev=new PlandromeNumber();
            int revDone=  rev.reverseNumber(1331);
            System.out.println("Reversed number is: "+revDone);
        }


}
