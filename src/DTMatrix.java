public class DTMatrix {
	public static void main(String args[]) {
//		float[][] matrix = { {1, -3, 0, 2}, 
//							{-2, 5, 3, -1}, 
//							{2, -4, -1, 5}, 
//							{3, -7, 4, 2}, };
		float[][] matrix = { {1, 1, 2, 2}, 
							 {-3, 1, 5, 1}, 
							 {-2, 5, 0, 0}, 
							 { 2, -1, 3, -1}, };
//		float[][] matrix = { {1, 2, 2}, 
//				 	{-3, 5, 1}, 
//				 	{2, 3, -1}, 
//		};
				 	
		int Size = matrix.length;
		float tmp[] = new float[Size];
	
		int sldh = 0;
		int kt = 1;
		float det = 1;
		for (int i = 0; i < Size - 1; i++) {
			if (matrix[i][i] == 0) {
				kt = 0;
				for (int j = i + 1; j < Size; j++) 
					if (matrix[i][j] != 0) {
						for (int k = 0; k < Size; k++) {
							tmp[k] = matrix[i][k];
							matrix[i][k] = matrix[j][k];
							matrix[j][k] = tmp[k];
						}
						sldh++;
						kt++;
						break;
					}
				
			}
			if (kt == 0) {
				System.out.print(0);
				break;
		}
		
			for (int j = i + 1; j < Size; j++) {
				float h = matrix[j][i] / matrix[i][i];
				for (int k = i+1; k < Size; k++) {
					matrix[j][k] = matrix[i][k] * (-h) + matrix[j][k];
				}
			}
			
			det = det*matrix[i][i];
			if(i == Size-2)
			{
				det = det*matrix[Size-1][Size-1];
			}
			
		}
		if(sldh%2 == 0)
		{
			System.out.println(Math.round(det));
		}else {
			System.out.println(-Math.round(det));
		}

	}
}
