import java.util.*;
public class selectionSort 
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
        selectionsort(arr,size);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }

    }
    public static void selectionsort(int[] arr,int size)
    {
        for(int i=0;i<size-1;i++) 
        {
            int min=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min]) 
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i]; 
            arr[i]=temp;   
        }
    }
}
