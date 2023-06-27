import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s,":");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int a = GCD(n,m);
        System.out.println(n/a+":"+m/a);
    }
    static int GCD(int a, int b) {
        if(a%b ==0) {
            return b;
        }
        return GCD(b, a%b);
    }
}