import java.util.*;
public class binarySearch 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        } 
        int target=sc.nextInt();
        System.out.print(binarysearch(arr,target));   
    }
    public static int binarysearch(int[] arr,int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2; 
            if(arr[mid]==target)
            { 
                return mid;
            } 
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else 
            {
                right=mid-1;
            }
        }
        return -1;
    }
}

