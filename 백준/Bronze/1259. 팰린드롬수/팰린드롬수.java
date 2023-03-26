import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num=""; //입력할 문자열(숫자)
        StringBuilder sb= new StringBuilder(); //결과 저장을 위한 StringBuilder
        while(true) { //입력한 문자열(숫자)가 0이 아닐 때까지
            StringBuilder check= new StringBuilder(); //팰린드롬수 확인을 위한 변수
            num=in.next();
            if(num.equals("0")){break;} //0을 입력받은 경우 종료
            else{ //0이 아닌 경우
                for(int i=num.length()-1;i>=0;i--){ //입력한 문자열(숫자)의 길이만큼
                    check.append(num.charAt(i)); //뒤집어서 check에 저장
                }
                if(num.equals(check.toString())){ //팰린드롬수인 경우
                    sb.append("yes").append("\n"); //StringBuilder에 yes+\n 저장
                }
                else{ //아닌 경우
                    sb.append("no").append("\n"); //StringBuilder에 no+\n 저장
                }
            }
        }
        System.out.print(sb); //StringBuilder에 저장된 값 출력
    }
}