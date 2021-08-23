
//find consucative duplicate in an Array


import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicateArray {

    public static ArrayList<Integer> removeConsucativeDuplicate(int arr[]){

        ArrayList ans= new ArrayList<Integer>();
        ans.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                ans.add(arr[i]);

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int []arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans= new ArrayList<Integer>();
        ans=removeConsucativeDuplicate(arr);
        ans.stream().forEach(System.out::print);
    }
}
