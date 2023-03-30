import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            String s  = in.next();
            int count=0;
            int sum=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='O'){
                    count++;
                }
                else{
                    count=0;
                }
                sum+=count;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}