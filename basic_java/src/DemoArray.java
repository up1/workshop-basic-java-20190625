
public class DemoArray {

	public static void main(String[] args) {
	
		int[] as = new int[5];
		as[0] = 1;
		System.out.println(as.length);
		
		int[] a2 = {1,2,3};
		System.out.println(a2.length);
		
		int[] a3 = new int[] {1,2,3,4,5};
		System.out.println(a3.length);
		
		int[][] data = new int[1000][1000];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				System.out.println(data[i][j]); // 1
				System.out.println(data[j][i]); // 2
			}
		}

	}

}
