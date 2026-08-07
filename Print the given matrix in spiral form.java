// Spiral matrix Boundary traversal : time O(m*n) & space O(1)
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        int mat [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer>res=Spiral(mat);
        for(int e:res){
            System.out.print(e+" ");
        }
    }
    public static ArrayList<Integer> Spiral(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int top=0;int bottom=m-1;
        int left=0;int right=n-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
