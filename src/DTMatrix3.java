public class DTMatrix3 {
	public static void main(String args[]) {
//		float[][] matrix = { {1, -3, 0, 2}, 
//							{-2, 5, 3, -1}, 
//							{2, -4, -1, 5}, 
//							{3, -7, 4, 2}, };
//		float[][] matrix = { {1, 1, 2, 2}, 
//							 {-3, 1, 5, 1}, 
//							 {-2, 5, 0, 0}, 
//							 { 2, -1, 3, -1}, };
		float[][] matrix = { {10, 3, 7}, 
				 	{4, 5, 9}, 
				 	{8, 4, 6}, 
		};
				 	
		int Size = matrix.length;
		float tmp[] = new float[Size];
	
		int sldc = 0;
		int kt = 1;
		float det = 1;
		for (int i = Size-1; i > 0; i--) {
			if (matrix[i][Size - 1 - i] == 0) {
				kt = 0;
				for (int j = Size - i; j < Size; j++) 
					if (matrix[i][j] != 0) {
						for (int k = 0; k < Size; k++) {
							tmp[k] = matrix[k][Size -1-i];
							matrix[k][Size -1-i] = matrix[k][j];
							matrix[k][j] = tmp[k];
						}
						sldc++;
						kt++;
						break;
					}
				
			}
			if (kt == 0) {
				System.out.print(0);
				break;
		}
		
			for (int j = Size - i; j < Size; j++) {
				float h = matrix[i][j] / matrix[i][Size - 1 - i];
				for (int k = 0; k < Size-1; k++) {
					matrix[k][j] = matrix[k][Size-1-i] * (-h) + matrix[k][j];
				}
			}
			
			det = det*matrix[i][Size - 1 - i];
			if(i == 1)
			{
				det = det*matrix[0][Size-1];
			}
		}
		if(sldc%2 == 0)
		{
			System.out.println(Math.round(det));
		}else {
			System.out.println(-Math.round(det));
		}

	}
}