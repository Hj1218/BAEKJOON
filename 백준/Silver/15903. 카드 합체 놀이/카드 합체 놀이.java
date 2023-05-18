import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken()); //카드의 개수 n
        int m = Integer.parseInt(st.nextToken()); //카드를 합체하는 횟수 m
        long [] num=new long[n+1]; //카드에 쓰여있는 수를 저장할 배열
        String s2 = br.readLine();
        String [] ss2 = s2.split(" ");
        for(int i=0;i< n;i++){
            num[i+1]= Long.parseLong(ss2[i]); //수 저장
        }
        for(int j=0;j<m;j++){ //m번 반복
            Arrays.sort(num); //오름차순 정렬
            long a = num[1]; //제일 작은 수와
            long b = num[2]; //다음으로 작은 수를
            long c = a+b; //더한 값을
            num[1]=c; //각 배열에 저장
            num[2]=c;
        }
        long sum=0; //카드에 적힌 수의 합
        for(int k=0;k<n;k++){
            sum+=num[k+1];
        }
        System.out.print(sum);
    }
}