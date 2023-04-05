import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char [] c = new char[s.length()];
        int []n=new int[10];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }
        for(int j=0;j<c.length;j++) {
            int a = c[j]-'0';
            if(a==6){
                n[9]++;
            }
            else{
                n[a]++;
            }
        }
        n[9]=(n[9]/2)+(n[9]%2);
        Arrays.sort(n);
        System.out.print(n[9]);
    }
}