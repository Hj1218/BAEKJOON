import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count =0;
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            if(check()){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(){
        boolean []c = new boolean[26];
        int z =0;
        String s = in.next();
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            if(z!=a){
                if(!c[a-'a']){
                    c[a-'a']=true;
                    z=a;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}