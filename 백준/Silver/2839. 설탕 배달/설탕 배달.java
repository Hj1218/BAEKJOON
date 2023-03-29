import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //설탕 N 킬로그램
        //설탕을 정확하게 N 킬로그램 배달이 가능한 경우
        if(N%5==0){
            System.out.print(N/5);
        } else if (N%5==3) {
            System.out.print(N/5+1);
        } else if (N%5==1) {
            System.out.print(N/5+1);
        } else if (N%5==2&&N!=7) {
            System.out.print(N/5+2);
        } else if (N%5==4 && N!=4) {
            System.out.print(N/5+2);
        }
        //아닌 경우
        else{
            System.out.print(-1); //-1 출력
        }
    }
}