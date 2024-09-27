package HelloApp;

public class Practice1 {

	public static void main(String[] args) {
		int[] k = {1, 2, 3, 5, 1, 4, 7, 5, 9, 6, 5};
		int max_count = 0;
		int max_freq = 0;
		for(int i = 0; i<k.length; i++) {
			int count= 0;
			for(int j = 0; j< k.length; j++) {
				if(k[i] == k[j]) {
					count++;
				}
			}
			if(count > max_count) {
				max_count = count;
				max_freq = k[i];
			}
		}
		System.out.print("Most frequent element is: " + max_freq);
	}

}
