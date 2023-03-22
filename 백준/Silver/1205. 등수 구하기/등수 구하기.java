import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //리스트에 있는 점수 개수
        int score = in.nextInt(); //새로운 점수
        int P = in.nextInt(); //리스트에 올라 갈 수 있는 점수의 개수
        int [] arr=new int[P]; //점수를 저장할 배열
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt(); //배열에 점수 저장
        }
        if(N<P){ //리스트에 올라 갈 수 있는 경우
            int count1=1; //등수
            for(int j=0;j<arr.length;j++){
                if(score<arr[j]){ //새 점수가 리스트에 존재하는 점수보다 작으면
                    count1++; //등수 증가
                }
            }
            System.out.print(count1); //등수 출력
        }
        else if(N==P){ //리스트가 꽉 찬 경우
            Arrays.sort(arr); //배열 오름차순 정렬
            if(score<=arr[0]){
                System.out.print(-1);
            }
            else{
                int count2=1; //등수
                for(int k=arr.length-1;k>=0;k--){ 
                    //배열이 오름차순으로 정렬되어 있기 때문에 k는 arr.length-1부터 감소하도록 함
                    if(score<arr[k]){ //새 점수가 리스트에 존재하는 점수보다 작으면
                        count2++; //등수 증가
                    }
                }
                System.out.print(count2); //등수 출력
            }
        }
    }
}