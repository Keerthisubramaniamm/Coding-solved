// Trapping rain water using two pointer : time O(n) & space O(1)
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n=z.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        System.out.print(Rainwater(arr));
    }
    public static int Rainwater(int arr[]){
        int left=1;
        int right=arr.length-2;
        int lmax=arr[left-1];
        int rmax=arr[right+1];
        int res=0;
        while(left<=right){
            if(rmax<=lmax){
                res+=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right--;
            }
            else{
                res+=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left++;
            }
        }
        return res;
    }
}
