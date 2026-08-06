//Kadane's Algorithm  Time:O(n) & Space:O(1)
import java.util.*;
class Solution{
public static void main(String[] argh){
  Scanner z= new Scanner(System.in);
  int n=z.nextInt();
  int arr[] =new int[n];
  for(int i=0;i<n;i++){
    arr[i]=z.nextInt();
  }
  System.out.print(SubarraySum(arr));
}
public static int SubarraySum(int arr[]){
   int n=arr.length;
  int max=arr[0];
  int res=arr[0];
  for(int i=1;i<n;i++){
      max=Math.max(max+arr[i],arr[i]);
      res=Math.max(max,res);
  }
  return res;
    }
}
