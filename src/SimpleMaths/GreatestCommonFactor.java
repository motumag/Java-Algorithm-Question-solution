package SimpleMaths;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonFactor {
    void gcd(int n1,int n2){
        List<Integer> num=new ArrayList<>();
        int max=0;
        int greatesCommonDevison= 0;
        if(n1>n2){
            max=n1;
        }else {
            max=n2;
        }
        for(int i=1;i<=max;i++){
            if(n1%i==0 && n2%i==0){
                num.add(i);
            }
        }
        for (int i=0;i<num.size();i++){
            if(num.get(i)>greatesCommonDevison){
                greatesCommonDevison=num.get(i);
            }
        }
        System.out.println("GCD is: "+greatesCommonDevison);
    }
    public static void main(String[] args) {
      GreatestCommonFactor gcf=new GreatestCommonFactor();
      gcf.gcd(9,12);
    }
}
