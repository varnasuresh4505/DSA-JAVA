import java.util.*;
public class linearSearch 
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
         System.out.print(linearsearch(arr,target));
    }
    public static int linearsearch(int[] arr,int target) 
    {
        for(int i=0;i<arr.length;i++) 
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
