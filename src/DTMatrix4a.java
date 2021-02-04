public class DTMatrix4a {
	public static void main(String args[]) {
//		float[][] matrix = { {1, -3, 0, 2}, 
//							{-2, 5, 3, -1}, 
//							{2, -4, -1, 5}, 
////							{3, -7, 4, 2}, };
//		float[][] matrix = { {1, 1, 2, 2}, 
//							 {-3, 1, 5, 1}, 
//							 {-2, 5, 0, 0}, 
//							 { 2, -1, 3, -1}, };
//		float[][] matrix = { {1, 2, 2}, 
//				 	{-3, 5, 1}, 
//				 	{2, 3, -1}, 
//		};
		float[][] matrix = { {10, 3, 7}, 
			 	{4, 5, 9}, 
			 	{8, 4, 6}, 
	};		 	
		int Size = matrix.length;
		float tmp[] = new float[Size];
	
		int sldc = 0;
		int kt = 1;
		float det = 1;
		int i = 0;
		while(i < Size-1) {
			if (matrix[i][Size - 1 - i] == 0) {
				kt = 0;
				int j = Size - i -2;
				while(j >= 0) 
					if (matrix[i][j] != 0) {
						int k = 0;
						while(k < Size) {
							tmp[k] = matrix[k][Size-1-i];
							matrix[k][Size-1-i] = matrix[k][Size -1 - j];
							matrix[k][Size-1-j] = tmp[k];
							k++;
						}
						sldc++;
						kt++;
						break;
					}j--;
				
			}
			if (kt == 0) {
				System.out.print(0);
				break;
		}
			int j = Size - i - 2; 
			while(j >= 0) {
				float h = matrix[i][j] / matrix[i][Size - 1 - i];
				int k = 1;
				while(k < Size) {
					matrix[k][j] = matrix[k][Size-1-i] * (-h) + matrix[k][j];
					k++;
				}j--;
			}
			
			det = det*matrix[i][Size - 1 - i];
			if(i == 2)
			{
				det = det*matrix[Size-1][0];
			}
			i++;
		}
		if(sldc%2 == 0)
		{
			System.out.println(Math.round(det));
		}else {
			System.out.println(-Math.round(det));
		}

	}
}