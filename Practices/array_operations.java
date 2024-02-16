package mooy;
import java.nio.file.FileSystem;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static boolean checkkarray(int[] arr,int checkvalue)
	{					//checks whether a value is present in an array
		for(int i:arr)
		{
			if(i==checkvalue)
				return true;
		}
		return false;
	}
	
	public static int[] duplicate(int[] arr)//duplicates an array
	{
		int[] arra=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arra[i]=arr[i];
		}
		return arra;
	}
	
	
	public static int min(int[] arr)
	{
		int max,min;
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		return min;
	}public static int max(int[] arr)
	{
		int max;
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static int secondmin(int[] arr)
	{
		int min,min2;
		min=arr[0];
		min2=arr[1];
		
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(min2>arr[i] &&  min2>min)
				min2=arr[i];
		}
		return min2;
	}
	
	
	

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	
	int[] array= {5,454,645,6,64,4,4,5,565,-45,555,26,22};
	System.out.println("minimum :"+min(array));
	System.out.println("maximum :"+max(array));
	System.out.println(secondmin(array));
}
}
