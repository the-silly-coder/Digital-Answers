import java.util.*;
public class MyClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        s.close();
        for(int i=0; i<arr.length-1; i++){
            int sum = 0;
            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];
            }
            arr[i] = sum;
        }
        arr[arr.length-1] = 0;
        for(int i=0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
