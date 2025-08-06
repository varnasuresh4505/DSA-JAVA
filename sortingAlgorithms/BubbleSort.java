import java.util.*;
public class BubbleSort
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
		bubbleSort(arr,size);
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}
	public static void bubbleSort(int[] arr,int size)
    {
        boolean isSwap;
        for(int i=0;i<size-1;i++)
		{
		    isSwap=false;
		    for(int j=0;j<size-1-i;j++)
		    {
    		    if(arr[j]>arr[j+1])
    		    {
    		        int temp=arr[j];
    		        arr[j]=arr[j+1];
    		        arr[j+1]=temp;
    		        isSwap=true;
    		        
    		    }
		    }
		    if(!isSwap)
		    {
		        break;
		    }
		}
    }
}
