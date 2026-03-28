import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int n = 3;
        int m = 3;

        int[] ans = mergeSort1(num1,num2,m,n);


        //optimized solution
       int[]ans2= mergeSort2(num1,num2,m,n);
        Arrays.stream(num1).forEach(System.out::println);
    }
//optimized solution with o(n+m) with space o(1)
    public static int[] mergeSort2(int[]num1,int[]num2,int m, int n){
    int i=m-1;
    int j =n-1;
    int k = m + n-1;

    while(j>=0){
        if(i>=0 && num1[i]>num2[j]){
            num1[k]=num1[i];
            i--;
        }else{
            num1[k]=num2[j];
            j--;
        }
        k--;
    }
   return num1;
    }

//brute force with o(n+m) with o(n) space
    public static int[] mergeSort1(int[]num1,int[]num2,int m, int n){
     int left=0,right=0,index=0;
     int[] temp = new int[m+n];
     while(left<m && right<n){
     if(num1[left]<=num2[right])
     {
         temp[index]=num1[left];
         left++;
         index++;
     }
     else {
         temp[index]=num2[right];
         right++;
         index++;
     }
     }
     while(left<m)
         temp[index++]=num1[left++];

     while (right<n)
         temp[index++]=num2[right++];


     return temp;
    }
}
