
public class MultipleChoiceTest {
	public static void main(String args[]) {
		String [][] arr = {
				{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
				{"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
				{"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
				{"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
				{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
				{"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
				{"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
				{"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
				};
		
		int dong = arr.length;
		int cot = arr[0].length;
		int [] student = new int[10];
		String [] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
				for(int i = 0; i < dong; i++)
				{	
					int diem = 0;
					for (int j = 0; j < cot; j++)
					{
						if(arr[i][j] == key[j])
						{
							diem++;
						}
					}
					student[i] = diem;
				}
				
				for(int i = 0; i < dong; i++)
				{
					System.out.println("Student "+ i +": "+student[i]);
				}
		}
}
	

