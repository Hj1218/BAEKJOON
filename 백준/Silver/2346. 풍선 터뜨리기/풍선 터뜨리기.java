import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Balloon {
    int index;
    int num;
    public Balloon(int index, int num){
        this.index = index;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        Deque<Balloon> dq=new ArrayDeque<>();
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int a = in.nextInt();
            dq.add(new Balloon(i,a));
        }
        while(!dq.isEmpty()){
            sb.append(dq.getFirst().index+" ");
            int next = dq.poll().num;
            if(dq.isEmpty()){
                break;
            }
            if(next>0){
                for(int i=0;i<next-1;i++){
                    dq.addLast(dq.pollFirst());
                }
            }
            else{
                for(int i=0;i<Math.abs(next);i++){
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}