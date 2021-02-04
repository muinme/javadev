
public class NhanMatrix {
	public static void main(String args[]) {
		int[][] array1 = {
				  {1, 2, 3},
				  {4, 5, 6},
				  {7, 8, 9},
				  {10, 11, 12},
				};
		int[][] array2 = {
				  {12, 11, 10, 9},
				  {8, 7, 6, 5},
				  {4, 3, 2, 1},
//		int[][] array1 = {
//				{1, 0, 1},
//				{0, 1, -1},
//				{1, 1, 1},
//				};
//		int[][] array2 = {
//				{1, 0, 1},
//				{0, 1, 1},
//				{1, -1, 1},
		};
		
		int dong = array1.length;
		int cotarr1 = array1[0].length;
		int cot = array2[0].length; 
		int[][] arraynhan = new int[dong][cot];
		for(int i = 0; i < dong; i++)
		{
			for(int j = 0; j < cot; j++)
			{
				arraynhan[i][j] = 0;
				for (int k = 0; k < cotarr1; k++)
				arraynhan[i][j] +=array1[i][k]*array2[k][j];
				
			}
			
		}
		for(int i = 0; i < dong; i++)
		{
			for(int j = 0; j < dong; j++)
			{
				System.out.print(arraynhan[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
