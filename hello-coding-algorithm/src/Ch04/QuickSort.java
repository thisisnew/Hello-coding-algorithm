package Ch04;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] array = {1,3,2,4,0};
		QuickSort(array,0,array.length-1);
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void QuickSort(int[] data, int _left, int _right) {
        int left = _left;
        int right = _right;
        int pivot = data[(_left + _right) / 2];
 
        do {
            while (data[left] < pivot)
                left++;
            while (data[right] > pivot)
                right--;
 
            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);
 
        if (_left < right) {
            QuickSort(data, _left, right);
        }
        if (_right > left) {
            QuickSort(data, left, _right);
 
        }
    }
}
