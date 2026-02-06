package sorting;
import java.util.Arrays;
public class Mergesort {
    public static void Msort(int[] a,int start,int mid,int end){
        int[] res=new int[a.length];
        int i=start,j=mid,k=0;
        while(i<mid&&j<end){//bcoz mid=4(a.length/2)
            if(a[i]<a[j]){
                res[k++]=a[i];
                i++;
            }
            else if(a[j]<a[i]){
                res[k++]=a[j];
                j++;
            }
            else{
                res[k++]=a[i];
                res[k++]=a[j];
                i++;
                j++;
            }
        }
        while(i<mid){
            res[k++]=a[i];
            i++;
        }
        while(j<end){
            res[k++]=a[j];
            j++;
        }
       for(int itr=0;itr<res.length;itr++){
           a[itr]=res[itr];
       }
    }
    public static void main(String[] args) {
        int[] a={1,3,5,6,2,7,8,10};
        int mid=a.length/2;
        Msort(a,0,mid,a.length);
        System.out.print(Arrays.toString(a));
    }

}
