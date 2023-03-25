import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<N;i++){
            num.add(in.nextInt());
        }
        Collections.sort(num);
        for(int j=0;j<num.size();j++){
            sb.append(num.get(j)).append("\n");
        }
        System.out.println(sb);
    }
}