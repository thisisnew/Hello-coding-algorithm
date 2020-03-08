package Ch01;

public class BinarySearch {
	public static void main(String[] args) {
		int[] myList = {1,3,5,7,9};
		
		int searchAnswer = BinarySearch(myList, 3) + 1;
		
		System.out.println("정답은 : " + searchAnswer +"번째 수입니다.");
		
	}
	
	public static int BinarySearch(int[] list, int answer) {
		int low = 0;
		int high = list.length - 1;
		int result = 0;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = list[mid];
			
			if(guess == answer) {
				result = mid;
				break;
			} else if (guess > answer) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return result;
	}
	
}
