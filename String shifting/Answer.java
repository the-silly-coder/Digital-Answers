import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String s1 = leftRotate(str,1);
        String s2 = rightRotate(str,1);
        if(s1.equalsIgnoreCase(s2))
            System.out.println("1");
        else
            System.out.println("0");
    }
    public static String leftRotate(String str, int div){
        String result = str.substring(div) + str.substring(0, div);
        return result;
    }
    public static String rightRotate(String str, int div){
        return leftRotate(str, str.length()-div);
    }
}
