
public class TimNghiem {
	public static void main(String args[]) {
		float[][] matrix = { { 1, -1, 2, 1 }, { 2, 1, -3, 5 }, { 3, -2, 1, 1 }, };
		int Size = matrix.length;
		float D[] = new float[Size + 1];
		float[][] array = new float[Size][Size];
		float[][] xx = new float[Size][Size];
		float[] array2 = new float[Size];
		for (int i = 0; i < Size; i++) {
			for (int j = 0; j < Size; j++) {
				array[i][j] = matrix[i][j];
			}
			array2[i] = matrix[i][3];
		}
		for (int m = 1; m < Size + 1; m++) {
			bornArray(m, Size, array, array2, xx);
			D[m] = DT(xx);
		}
		float d = DT(array);
        int f = (int) d;
     
		System.out.println("Nghiem cua phuong trinh la:");
		for (int i = 1; i < Size + 1; i++) {
			System.out.print("x " + i + "= ") ;
			float t = D[i];
			int s = (int)t; 
			rutGonPhanSo(s,f);
			if (f == 1) {
	            System.out.print(s);
	           
	        }else{
	            System.out.print(s +"/" + f);
	        }
			System.out.println("");
		}

	}
	
	public static int uocChungLonNhat(int a, int b){
        if (a%b != 0) {
            return uocChungLonNhat(b, a%b);
        }else
        return b;
    }
	
	public static void rutGonPhanSo(int a, int b){
        int uc = uocChungLonNhat(a, b);
            a = a/uc;
            b = b/uc;
    }
	public static void bornArray(int x, int Size, float arr[][], float arr2[], float xx[][]) {
		for (int i = 0; i < Size; i++) {
			for (int j = 0; j < Size; j++) {
				if (j + 1 == x) {
					xx[i][j] = arr2[i];
				} else
					xx[i][j] = arr[i][j];
			}

		}
	}

	public static float DT(float[][] matrix) {
		int Size = matrix.length;
		float tmp[] = new float[Size];
		float tmp2[] = new float[Size];
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
			if (kt == 0)
				return 0;

			tmp2[i] = matrix[i][i];
			for (int j = i; j < Size; j++) {
				matrix[i][j] = matrix[i][j] / tmp2[i];
			}
			for (int j = i + 1; j < Size; j++) {
				float h = matrix[j][i] / matrix[i][i];
				for (int k = i; k < Size; k++) {
					matrix[j][k] = matrix[i][k] * (-h) + matrix[j][k];
				}
			}
			det = det*tmp2[i];
			if(i == Size-2)
			{
				det = det*matrix[Size-1][Size-1];
			}
		}
		if (sldh % 2 == 0) {
			return det;
		} else {
			return -det;
		}
	}

}
