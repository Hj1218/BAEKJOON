import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mul=1;
        for(int i=0;i<3;i++){
            int n = in.nextInt();
            mul*=n;
        }
        String s=String.valueOf(mul);
        for(int k=0;k<10;k++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if((s.charAt(j)-'0')==k){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}