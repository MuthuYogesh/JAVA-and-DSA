import java.util.Arrays;

public class Merge {
    static void merge(int arr[], int start, int mid, int end){
         int fs=start;
         int ss=mid+1;
         int temp[]= new int[end-start+1]; // [0,0,0,0]
         int i=0;
         while(fs<=mid&&ss<=end){
            if(arr[fs]<arr[ss]){   // [3,4]   // 1,2
                temp[i]=arr[fs];
                i++;
                fs++;
            }else{
                temp[i]=arr[ss];  //[1,2,0,0]
                i++;
                ss++;
            }
         }
         while(fs<=mid){  // 
            temp[i]=arr[fs];  // [1,2,3,4]
            i++;
            fs++;
         }
         while(ss<=end){
            temp[i]=arr[ss];
            i++;
            ss++;
         }
         System.out.println("temp : "+Arrays.toString(temp));
         for(int j=0;j<temp.length;j++){
            arr[j+start]=temp[j];
         }
         System.out.println("arr: "+Arrays.toString(arr));


    }

    static void divide(int arr[], int start, int end){
         if(start>=end){
            return;
         }
         int mid= start+(end-start)/2;    // nlogn
         divide(arr, start, mid);  // for left array
         divide(arr, mid+1, end);  // for right array
         merge(arr,start,mid,end);  // merge
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,1};                                                                                                                    
        int start=0;
        int end= arr.length-1;
        divide(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
}
