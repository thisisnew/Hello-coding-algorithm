package Ch02;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {4,5,6,1,3,2};
		 
        sort(arr);
 
        for(int i=0; i<arr.length; i++){
            System.out.println("arr["+i+"] : " + arr[i]);
        }

	}
	
	public static void sort(int[] arr){
        int size = arr.length;
        int min;
        int temp;
        
        for(int i=0; i<size-1; i++){
            min = i;
            for(int j=i+1; j<size; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
