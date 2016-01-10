 import java.util.Arrays;
 

 public class InsertSort{
 	
    private static int[] arrays = {
    	4, 2, 7, 5, 6, 1, 19, 10, 22, 100, 3
    };

 	public static void main(String[] args) {
 		shellSort(arrays);
 		System.out.print(Arrays.toString(arrays));

 	}


 	private	static void insertSort(int[] arrays) {
 		for (int i =  1; i < arrays.length; i++) {
 			int tmp = arrays[i];
 			int j = i;
 			for ( ; j >= 1 && arrays[j - 1] > tmp; j--) {
 				arrays[j] = arrays[j - 1];

 			}
 			arrays[j] = tmp;
 		}
 	}

 	private	static void shellSort(int[] arrays) {
 		for (int gap =  arrays.length / 2; gap > 0; gap /= 2) {
 			for (int i = gap; i < arrays.length; i++) {
 				int tmp = arrays[i];
 				int j = i;
 				for (; j >= gap && arrays[j - gap] > tmp; j-=gap) {
 					arrays[j] = arrays[j - gap];
 				}
 				arrays[j] = tmp;
 			}
 		}
 	}

 }