import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //후보의 수
        int[] num =new int[n]; //득표수
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        int count = 0; //매수해야 하는 사람의 수
        while(true){
            for(int j=1;j<n;j++){
                int a = 0;
                int max = Arrays.stream(num).max().getAsInt();
                for(int i=1;i<n;i++){
                    if(num[i]==max){
                        a=i;
                    }
                }
                if(num[0]<max){ //다솜이 득표수보다 높은 득표수가 있다면
                    num[0]+=1; //다솜이 +1
                    num[a]-=1; //높은 득표수 -1
                    count++; //매수해야 하는 사람의 수 증가
                }
            }

            boolean flag = false; //다솜이 득표수가 가장 많은지 확인하기 위한 변수
            for(int k=1;k<n;k++){
                if(num[0]<num[k]){ //다솜이 득표수보다 높은 득표수가 있다면
                    flag=true;
                    break;
                }
            }

            if(!flag){ //다솜이 득표수보다 높은 득표수가 없는 경우
                for(int l=1;l<n;l++){
                    if(num[0]==num[l]){ //다솜이의 득표수와 같은 경우
                        num[0]+=1; //다솜이 +1
                        num[l]-=1; //같은 득표수 -1
                        count++; //매수해야 하는 사람의 수 증가
                    }
                }
                break;
            }
        }
        System.out.print(count); //매수해야 하는 사람 수 출력
    }
}