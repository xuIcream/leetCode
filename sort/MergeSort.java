 import java.util.Arrays;
 

 public class MergeSort{
 	
    private static int[] arrays = {
    	4, 2, 7, 5, 6, 1, 19, 10, 22, 100, 3
    };

 	public static void main(String[] args) {
 		int[] tmpArray = new int[arrays.length];
 		mergeSort(arrays, tmpArray, 0, arrays.length - 1);
 		System.out.print(Arrays.toString(arrays));

 	}

 	private	static void mergeSort(int[] arrays, int[] tmpArray, int left, int right) {
 		if (left < right) {
 			int mid = (left + right) / 2;
			mergeSort(arrays, tmpArray, left, mid);
			mergeSort(arrays, tmpArray, mid + 1, right);
			merge(arrays, tmpArray, left, mid + 1, right);
 		}
 		
 	}

 	private static void merge(int[] arrays, int[] tmpArray, int left, int right, int rightEnd) {
 		
        int leftEnd = right - 1;
 		int pos = left;
 		int count = rightEnd - left + 1;
        while (left <= leftEnd && right <= rightEnd) {
        	if (arrays[left] < arrays[right]) {
        		tmpArray[pos++] = arrays[left++];

        	} else {
        		tmpArray[pos++] = arrays[right++];
        	}
        }
        
        while(left <= leftEnd) {
       		tmpArray[pos++] = arrays[left++];
        }
        while(right < rightEnd) {
        	tmpArray[pos++] = arrays[right++];
        }
        for (int i = 0; i < count ; i++) {
        	arrays[rightEnd] = tmpArray[rightEnd--];
        }
 	}
 }