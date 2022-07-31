import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int number = s.nextInt();
        s.close();
        int temp = 0, finalOutput = 0;
        for(int i=1; i<=str.length(); i++){
            temp = temp+Integer.parseInt(String.valueOf(str.charAt(i-1)));
            if(i%number == 0){
                if(finalOutput < temp){
                    finalOutput = temp;
                    temp = 0;
                }
                else{
                    temp = 0;
                }
            }
            if(i==str.length() && finalOutput < temp){
                finalOutput = temp;
            }
        }
        System.out.println(finalOutput);
    }
}
