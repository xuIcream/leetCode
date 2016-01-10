 import java.util.Arrays;
 
 public class QuickSort{
 	
    private static int[] arrays = {
    	4, 2, 7, 5, 6, 1, 19, 10, 22, 100, 3
    };

 	public static void main(String[] args) {
 		quickSort(arrays, 0, arrays.length - 1);
 		System.out.print(Arrays.toString(arrays));
 	}

 	private	static void quickSort(int[] arrays, int left, int right) {
 		if (left < right) {
 			int mid = partition(arrays, left, right);
			quickSort(arrays, left, mid - 1);
			quickSort(arrays, mid + 1, right);
 		}
 		
 	}

 	private static int partition(int[] arrays, int left, int right) {
 		int media = media(arrays, left, right);
        swap(arrays, media, right-1);
        if (left >= right - 1) {
            return media;
        }
        int i = left;
        int j = right - 1;
        while(true) {
            while(arrays[++i]<arrays[right-1]) {
            }
            while(arrays[--j]>arrays[right-1]){
            }
            if (i < j) {
                swap(arrays, i, j);
            } else {
                break;
            }
        }
        swap(arrays, i, right-1);
        return i; 
 	}

    private static int media(int[] arrays, int left, int right) {
        int center = (left + right) / 2;
        if (arrays[left] > arrays[center]) {
            swap(arrays, left, center);
        }
        if (arrays[center] > arrays[right]) {
            swap(arrays, center, right);
        }
        if (arrays[left] > arrays[center]) {
            swap(arrays, left, center);
        }
        return center;
    }

    private static void swap(int[] arrays, int left, int right) {
        if (left == right) {
            return;
        }
        int tmp = arrays[left];
        arrays[left] = arrays[right];
        arrays[right] = tmp;
    }
 }