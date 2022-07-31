import java.util.*;
public class MyClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        StringBuilder number = new StringBuilder();
        for(int i=0; i<str.length(); i++)
            if(Character.isDigit(str.charAt(i)))
                number.append(str.charAt(i));
        String sentence = str.substring(number.length());
        System.out.println(sentence);
        if(sentence.length() == Integer.parseInt(number.toString()))
            System.out.println("TRUE "+number);
        else
            System.out.println("FALSE "+number);
    }
}
