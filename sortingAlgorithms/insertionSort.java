import java.util.*;
public class InsertionSort 
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
        insertionsort(arr,size);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }

    }
    public static void insertionsort(int[] arr,int size)
    {
        for(int i=1;i<size;i++)
		{
		    boolean isSwap=false;
		    for(int j=i;j>0;j--)
		    {
		        if(arr[j]<arr[j-1])
		        {
		            int temp=arr[j];
		            arr[j]=arr[j-1];
		            arr[j-1]=temp;
		            isSwap=true;
		        }
		        else
		        {
		            break;
		        }
		    }
		    if(isSwap)
		    {
		        prints(arr);
		    }
		}
    } 
    public static void prints(int[] arr)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	}
}
