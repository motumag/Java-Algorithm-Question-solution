package SimpleMaths;

import java.util.Stack;

public class CheckAllDiviseions {
    void checkDevisons(int n){
        Stack s=new Stack<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s.push(i);
            }
        }
        for(int j=0;j<s.size();j++){
            System.out.print(s.get(j)+" ");
        }

    }
    public static void main(String[] args) {
        CheckAllDiviseions dv=new CheckAllDiviseions();
        dv.checkDevisons(36);
    }
}
