import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = 1; //case 번호
        while(true){
            String s = in.nextLine(); //String으로 입력받아
            if(s.equals("0 0 0")){ //0 0 0이 입력되면 종료
                break;
            }
            String [] ss = s.split(" "); //공백으로 구분
            int L = Integer.parseInt(ss[0]);
            int P = Integer.parseInt(ss[1]);
            int V = Integer.parseInt(ss[2]);

            int day=0; //최대 사용 가능한 날
            int a = V/P;
            if(V-(P*a)>L){ //휴가 v일에서 p일 x a를 뺀 값이 l일보다 큰 경우
                day = L*(a+1);
            }
            else{ 
                day = L*a+(V-P*a); 
            }
            sb.append("Case "+count+": "+day).append("\n");
            count++;
        }
        System.out.print(sb);
    }
}