package HelloApp;
import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		int[][] matrix = {
				{3, 5, 2},
				{1, 8, 2},
				{2, 5, 9}
		};
		System.out.println("Your matrix was: ");
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" "); 
		}
		System.out.println("Your matrix now: ");
		
		// Sorting the matrix rows based on the first element
        Arrays.sort(matrix, (row1, row2) -> Integer.compare(row1[0], row2[0]));

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

	}

}
