import java.util.*;
import java.lang.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array:");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.println("enter elements og the array");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		//Kadane's algorithm
		int max=0;
		//max_sub is the sum of the present sub array under consideration
		int max_sub=0;
		for(int j=0; j<n; j++)
		{
			max_sub = max_sub + arr[j];
			if(max < max_sub)
			{
				max = max_sub;
			}
			if(max_sub < 0)
			{
				max_sub = 0;
			}
		}

        if(max == 0)
        {
            int max1 = arr[0];
            for(int j=0; j<n; j++)
            {
                if(max < arr[j])
                {
                    max = arr[j];
                }
            }
            max = max1;
        }

		System.out.print("contiguous sub-array with maximum sum is: "+max);
	}
}