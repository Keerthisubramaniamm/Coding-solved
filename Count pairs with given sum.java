//Count pairs with given sum
import java.util.Scanner;
class Solution {
     static int countPairs(int arr[], int target) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String [] argh){
        Scanner z= new Scanner(System.in);
        int n= z.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int t=z.nextInt();
        System.out.print(countPairs(arr,t));
    }
}
