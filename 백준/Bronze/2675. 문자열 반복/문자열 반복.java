import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            st=new StringTokenizer(s);
            int R = Integer.parseInt(st.nextToken());
            String ss = st.nextToken();
            for(int k=0;k<ss.length();k++){
                for(int j=0;j<R;j++){
                    sb.append(ss.charAt(k));
                }
            }
            sb2.append(sb).append("\n");
        }
        System.out.println(sb2);
    }
}