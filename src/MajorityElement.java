public class MajorityElement {
    public static void main(String [] args){
        int [] a = {2,2,1,2,5,5,6,6,6,6,6,6,6,6};
        int ans = majorityEl(a, a.length);
        System.out.println(ans);
    }
    public static int majorityEl(int[]a,int n){
        int majEl=0,count=0,count1=0;
        for(int i =0;i<n;i++){
            if(count==0){
                majEl=a[i];
                count=1;
            }else if(a[i]==majEl) count++;
            else count--;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==majEl)
                count1++;
        }
        if(count1>n/2)
            return majEl;



        return 0;
    }
}
