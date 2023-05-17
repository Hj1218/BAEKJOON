import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //색을 칠해야 하는 문제의 수 N
        String s=in.next();
        char [] color = s.toCharArray();
        int blue=0;
        int red=0;
        if(color[0]=='B'){
            blue++;
        }
        else{
            red++;
        }
        for(int i=1;i<color.length;i++){
            if(color[i]==color[i-1]){
                continue;
            }
            else{
                if(color[i]=='B'){
                    blue++;
                }
                else{
                    red++;
                }
            }
        }
        if(red==blue){
            System.out.print(red+1);
        } else if (red>blue) {
            System.out.print(1+blue);
        }else{
            System.out.print(1+red);
        }
    }
}