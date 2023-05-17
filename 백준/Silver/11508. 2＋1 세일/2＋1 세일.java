import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //유제품 N개
        int []price=new int[N+1]; //가격을 저장할 배열
        for(int i=1;i<=N;i++){
            price[i]=Integer.parseInt(br.readLine()); //각각의 가격을 입력받아 저장
        }
        Arrays.sort(price); //오름차순 정렬
        int min=0; //최소비용
        for(int j=N;j>0;j--){
            if(N%3==1){
                if(j%3==1||j%3==0){
                    min+=price[j];
                }
            }
            else if (N%3==2) {
                if(j%3==1||j%3==2){
                    min+=price[j];
                }
            }
            else{
                if(j%3==2||j%3==0){
                    min+=price[j];
                }
            }
        }
        System.out.print(min);
    }
}