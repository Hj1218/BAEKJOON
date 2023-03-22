import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //성의 세로
        int M = in.nextInt(); //성의 가로
        int count1=0; //행에 필요한 경비원 수
        int count2=0; //열에 필요한 경비원 수
        char [][] arr=new char[N][M]; //성의 상태
        for(int i=0;i<N;i++){ //성의 크기에 해당하는 문자열을 입력받아
            String c=in.next();
            for(int j=0;j<M;j++){ //문자로 나눠 배열에 저장
                arr[i][j]=c.charAt(j);
            }
        }
        for(int i=0;i<N;i++){ //행에 존재하는 경비원 수 구하기
            int state1 = 0; //경비원의 존재 여부를 위한 변수
            for(int j=0;j<M;j++){
                if(arr[i][j]=='X'){ //경비원이 존재한다면
                    state1 = 1;
                    break;
                }
            }
            if(state1==0){ //경비원이 존재하지 않는 경우
                count1 ++; //필요한 경비원 수 증가
            }
        }
        for(int j=0;j<M;j++){ //열에 존재하는 경비원 수 구하기
            int state2 = 0; //경비원의 존재 여부를 위한 변수
            for(int i=0;i<N;i++){
                if(arr[i][j]=='X'){ //경비원이 존재한다면
                    state2 = 1;
                    break;
                }
            }
            if(state2==0){ //경비원이 존재하지 않는 경우
                count2 ++; //필요한 경비원 수 증가
            }
        }
        if(count1==count2){
            System.out.println(count2);
        }else if(count1>count2){
            System.out.println(count1);
        }else{
            System.out.println(count2);
        }
    }
}