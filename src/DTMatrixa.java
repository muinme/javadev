
public class DTMatrixa {
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
		int i = 0;
		while (i < Size - 1) {
			if (matrix[i][i] == 0) {
				kt = 0;
				int j = i + 1;
				while(j < Size) 
					if (matrix[i][j] != 0) {
						int k = 0;
						while (k < Size) {
							tmp[k] = matrix[i][k];
							matrix[i][k] = matrix[j][k];
							matrix[j][k] = tmp[k];
							k++;
						}
						sldh++;
						kt++;
						break;
					}
				j++;
			}
			if (kt == 0) {
				System.out.print(0);
				break;
		}
			int j =  i+1;
			while (j < Size) {
				float h = matrix[j][i] / matrix[i][i];
				int k = i + 1;
				while(k < Size) {
					matrix[j][k] = matrix[i][k] * (-h) + matrix[j][k];
					k++;
				}
				j++;
			}
			
			det = det*matrix[i][i];
			if(i == Size-2)
			{
				det = det*matrix[Size-1][Size-1];
			}
			i++;
		}
		if(sldh%2 == 0)
		{
			System.out.println(Math.round(det));
		}else {
			System.out.println(-Math.round(det));
		}

	}
}
