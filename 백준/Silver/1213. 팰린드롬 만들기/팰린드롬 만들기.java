import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        String s = in.nextLine();
        int []arr = new int[26];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A';
            arr[index]++;
        }
        int check=0;
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                check++;
                num=i;
            }
            if(check>=2){
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i]/2;j++){
                sb.append((char)(i+'A'));
            }
        }
        String result = sb.toString();
        if(check==1){
            result+=(char)(num+'A');
        }
        result+=sb.reverse().toString();
        System.out.println(result);
    }
}