import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(); //k개의 정사각형
        int chocoSize = 1;
        while(true){
            if(chocoSize>=k){ //초콜릿의 크기가 k보다 크면
                break; //반복문 종료
            }
            chocoSize*=2; //초콜릿의 크기는 2의 제곱 형태
        }
        System.out.print(chocoSize+" "); //구매해야하는 가장 작은 초콜릿의 크기
        int count = 0; //쪼개는 수
        while(true){
            if(k==0){ 
                break;
            }
            else if (k<chocoSize) { //초콜릿 크기가 k보다 크면
                chocoSize/=2; //초콜릿을 반으로 쪼개고
                count++; //카운트 증가
            }
            else{ //초콜릿 크기가 k보다 작거나 같은 경우
                k-=chocoSize; //k는 초콜릿 크기를 뺀 값
            }
        }
        System.out.print(count); //최소 쪼개는 수
    }
}