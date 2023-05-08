import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int E = in.nextInt(); //지구
        int S = in.nextInt(); //태양
        int M = in.nextInt(); //달
        int e = 1;
        int s = 1;
        int m = 1;
        int year=1; //연도
        while(true){
            if((e==E)&&(s==S)&&(m==M)){ 
                break;
            }
            e++; //1년 증가
            if(e==16){ //범위를 벗어난 경우
                e=1; //다시 1
            }
            s++; //1년 증가
            if(s==29){ //범위를 벗어난 경우
                s=1; //다시 1
            }
            m++; //1년 증가
            if(m==20){ //범위를 벗어난 경우
                m=1; //다시 1
            }
            year++; //1년 증가
        }
        System.out.print(year); //연도 출력
    }
}