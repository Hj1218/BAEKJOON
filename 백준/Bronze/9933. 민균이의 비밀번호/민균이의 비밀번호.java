import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //단어의 개수 n
        String [] s = new String[n]; //단어를 저장할 배열
        for(int i=0;i<n;i++){
            s[i]=in.next(); //배열에 단어 저장
        }
        boolean flag=false;
        for(int j=0;j<s.length;j++){ //단어
            for(int k=0;k<s.length;k++){ //뒤집은 단어
                StringBuilder sb = new StringBuilder(s[k]); //단어를 뒤집기 위한 StringBuilder 사용
                if(s[j].equals(sb.reverse().toString())&&!flag){ //reverse()를 사용해 단어 뒤집기, 단어와 뒤집은 단어가 같다면
                    flag = true;
                    System.out.print(s[j].length()+" "+s[j].charAt(s[j].length()/2));//비밀번호 길이, 가운데 글자 출력
                }
            }
        }
    }
}