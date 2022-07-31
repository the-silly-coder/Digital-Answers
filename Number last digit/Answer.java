import java.lang.*;
import java.util.*;
public class MyClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.close();
        long power = (long)Math.pow(N, 4);
        //System.out.println(power);
        if(N<10) {
            if (power % 10 == N)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }
        else if(N>10 && N<100){
            if(power%100 == N)
                System.out.println("TRUE");
            else
                System.out.println("FALSE");
        }
    }
}
