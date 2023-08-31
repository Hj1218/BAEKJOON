import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashSet<String> user = new HashSet<>();
        String userA, userB;
        user.add("ChongChong");
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            userA = st.nextToken();
            userB = st.nextToken();
            if(user.contains(userA)||user.contains(userB)){
                user.add(userA);
                user.add(userB);
            }
        }
        System.out.println(user.size());
    }
}