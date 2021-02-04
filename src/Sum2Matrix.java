public class Sum2Matrix {
	public static void main(String args[]) {
	int[][] array1 = {
			  {1, 2, 3},
			  {4, 5, 6},
			  {7, 8, 9},
			  {10, 11, 12},
			};
	int[][] array2 = {
			  {12, 11, 10},
			  {9, 8, 7},
			  {6, 5, 4},
			  {3, 2, 1},
			};
	int dong = array1.length;
	int cot = array1[0].length; 
	int[][] arraysum = new int[dong][cot];
	for(int i = 0; i < dong; i++)
	{
		for(int j = 0; j < cot; j++)
		{
			arraysum[i][j] = array1[i][j] + array2[i][j];
		}
	}
	for(int i = 0; i < dong; i++)
	{
		for(int j = 0; j < cot; j++)
		{
			System.out.print(arraysum[i][j]+" ");
		}
		System.out.println("");
	}
}
}
