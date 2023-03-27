import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt(); //입력받을 문자열의 개수
        String[] ss=new String[num]; //문자열의 개수만큼 배열 생성
        for(int i=0;i<num;i++){
            String s=in.next(); //문자열을 입력 받아
            ss[i]=s; //배열에 저장
        }
        Arrays.sort(ss); //문자열을 사전순으로 정렬
        Arrays.sort(ss,Comparator.comparing(String::length)); //길이를 오름차순으로 정렬
        System.out.println(ss[0]); 
        for(int j=1;j< ss.length;j++){
            if(ss[j].equals(ss[j-1])){ //앞 배열과 같은 문자열을 가지면
                continue; //넘어감
            }
            else { //다른경우
                System.out.println(ss[j]); //출력
            }
        }
    }
}