import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //케이스의 개수
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<n;i++){
            String s = br.readLine();
            String []ss=s.split(" "); //띄어쓰기를 기준으로 배열에 저장
            sb.append("Case #"+(i+1)+": "); //StringBuilder에 케이스 번호 저장
            for(int j=ss.length-1;j>=0;j--){
                sb.append(ss[j]+" "); //StringBuilder에 배열에 저장된 단어 거꾸로 저장
            }
            sb.append("\n");
        }
        System.out.print(sb); //StringBuilder 출력
    }
}