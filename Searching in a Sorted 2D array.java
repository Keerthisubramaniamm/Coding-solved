//Searching in 2D sorted Array using binary search time:O(n logm) & Space:O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n=z.nextInt();
        int m =z.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=z.nextInt();
            }
        }
        int x=z.nextInt();
        System.out.print(Search(arr,x));
        
    }
    public static boolean Search(int arr[][],int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(BinarySearch(arr[i],x)){
                return true;
            }
        }
        return false;
    }
    public static Boolean BinarySearch(int arr[],int x){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x)
               return true;
            else if(arr[mid]<x){
                s=mid+1;
            }
            else 
               e=mid-1;
        }
        return false;
    }
}
