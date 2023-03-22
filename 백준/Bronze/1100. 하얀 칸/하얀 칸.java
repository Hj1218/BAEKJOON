import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for(int i =0;i<8;i++){
            String s = in.next();
            for(int j =0;j<8;j++){
                char [] a=s.toCharArray();
                if(i%2==0){
                    if(j%2==0&&a[j]=='F'){
                        count++;
                    }
                }
                else{
                    if(j%2==1&&a[j]=='F'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}