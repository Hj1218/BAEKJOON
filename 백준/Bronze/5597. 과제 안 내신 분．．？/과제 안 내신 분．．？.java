import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] num=new int[31];
        for(int i=1;i<=30;i++){
            num[i]=i;
        }
        for(int j=0;j<28;j++){
            num[in.nextInt()]=0;
        }
        for(int k=0;k<30;k++){
            if(num[k+1]!=0){
                System.out.println(num[k+1]);
            }
            else{
                continue;
            }
        }
    }
}