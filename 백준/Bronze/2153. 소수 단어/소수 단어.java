import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        char [] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i<c.length;i++){
            map.put(c[i],i+1);
        }
        String s = in.next();
        int sum=0;
        for(int j=0;j<s.length();j++){
            sum+=map.get(s.charAt(j));
        }
        boolean flag = false;
        for(int k=2;k<sum;k++){
            if(sum%k==0){
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.print("It is not a prime word.");
        }else{
            System.out.print("It is a prime word.");
        }
    }
}