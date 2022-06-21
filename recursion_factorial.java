import java.util.*;

class Solution {

    static int fac(int n){
        if (n==0) return 1;
        return n*fac(n-1);
    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n>=0){
            System.out.print(fac(n));
        }
        else{
            System.out.print("Error");
        }

    }
}
