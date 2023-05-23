import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //지방의 수 n
        String s = br.readLine(); //지방의 예산요청을 입력받은 줄을
        String[] ss = s.split(" "); //공백으로 쪼개
        int [] num = new int[n];
        long sum=0; //요청된 예산 합
        int start = 1;
        int end=0;
        int mid=0;
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(ss[i]); //저장
            sum+= num[i]; //요청한 예산 합
            end=Math.max(end,num[i]);
        }
        long m = Integer.parseInt(br.readLine()); //총 예산 m
        if(sum<=m){
            System.out.println(end);
        }
        else{
            while(start<=end){
                mid = (start+end)/2;
                int total=0;
                for(int j=0;j<n;j++){
                    if(num[j]<mid){ //상한가보다 작으면
                        total+=num[j]; //요청한 예산 더함
                    }
                    else{ //상한가보다 크거가 같으면
                        total+=mid; //상한가를 더함
                    }
                }
                if(total<=m){ //총합이 총 예산 m보다 작거나 같은 경우
                    start = mid+1;
                }
                else{ //총합이 총 예산 m보다 큰 경우
                    end=mid-1;
                }
            }
            System.out.println(end);
        }
    }
}