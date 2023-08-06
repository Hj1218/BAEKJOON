import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int l,c;
    static char []w;
    static char []s;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        c = in.nextInt();
        w = new char[c];
        s = new char[l];
        for(int i=0;i<c;i++){
            w[i]=in.next().charAt(0);
        }
        Arrays.sort(w);
        check(0,0);
    }
    static void check(int n,int index){
        if(index==l){
            if(isChecked()){
                System.out.println(s);
            }
            return;
        }
        for(int i=n;i<c;i++){
            s[index]=w[i];
            check(i+1,index+1);
        }
    }
    static boolean isChecked(){
        int mo=0;
        int ja=0;
        for(char x : s){
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                mo++;
            }
            else{
                ja++;
            }
        }
        return mo >= 1 && ja >= 2;
    }
}