import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<k;i++){
            int n = in.nextInt();
            if(n==0){
                s.pop();
            }
            else{
                s.push(n);
            }
        }
        int sum=0;
        int size = s.size();
        for(int j=0;j<size;j++){
            int a = s.peek();
            s.pop();
            sum=sum+a;
        }
        System.out.print(sum);
    }
}