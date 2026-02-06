package sorting;
import java.util.Arrays;
public class Mergesort {
    public static int[] Msort(int[] a,int[] b){
        int al=a.length;
        int bl=b.length;
        int[] res=new int[al+bl];
        int i=0,j=0,k=0;
        while(i<al&&j<bl){
            if(a[i]<b[j]){
                res[k++]=a[i];
                i++;
            }
            else if(b[j]<a[i]){
                res[k++]=b[j];
                j++;
            }
            else{
                res[k++]=a[i];
                res[k++]=b[j];
                i++;
                j++;
            }
        }
        while(i<al){
            res[k++]=a[i];
            i++;
        }
        while(j<bl){
            res[k++]=b[j];
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,6};
        int[] b={2,3,6,7,8};
        int[] res=Msort(a,b);
        System.out.print(Arrays.toString(res));
    }

}
