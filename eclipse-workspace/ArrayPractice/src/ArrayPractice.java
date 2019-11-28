import java.util.Arrays;

public class ArrayPractice {
	public static void main(String [] args)
	{
		int [] my_array1 = {
				1789, 2035, 1899, 1456, 2013, 1458, 2458,
				1254,1472, 2365, 1465, 1456, 2165, 1457,
		};
		String[] my_array2 = {"Java", "Python", "PHP", "C#", "C programming", "C++"};
		System.out.println("Original numeric array : " +Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array: " + Arrays.toString(my_array1));
		System.out.println("Orginal string array: "+ Arrays.toString(my_array2));
		Arrays.parallelSort(my_array2);
		System.out.println("Sorted numeric array: " + Arrays.toString(my_array2));
	}

}


class SumOfArrays 
{
	 public static void main(String[] args)
	{
		int [] emma = {1,2,3,4,5,6,7,8,9,10};
		 int sum = 0;
		for(int i : emma)
			sum += i;
		System.out.println("The sum is " + sum);
		
	}
}

class ArrayGrid
{
	public static void main(String[] args)
	{
		int[][] a = new int [10][10];
		for(int i = 0; i < 10;)
		{
			for(int j = 0; j < 10;)
			{
				System.out.printf("2%d" , a[i][j]);
			}
		System.out.println();
		}
	}
}