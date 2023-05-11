import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next(); //최대 10^5개의 숫자로 구성된 n 입력받아
        char [] num = n.toCharArray(); //쪼개서 char형 배열에 저장
        Arrays.sort(num); //오름차순 정렬
        int sum=0;
        //3의 배수는 각 자리수를 합한 값이 3의 배수
        for(int i=0;i<num.length;i++){
            int a = num[i]-'0';
            sum+=a;
        }
        if(num[0]-'0'!=0||sum%3!=0){ //0이 없거나 각 자리수를 합한 값이 3의 배수가 아닌 경우
            System.out.print(-1);
        }
        else{
            for(int j=num.length-1;j>=0;j--){
                System.out.print(num[j]-'0');
            }
        }
    }
}