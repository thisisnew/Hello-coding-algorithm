package Ch03;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(RecursionCount(10));
	}
	
	public static int RecursionCount(int value) {
		
		if(value>0) {
			return value + RecursionCount(value-1);
		} else {
			return 0; 
		}
	}
}
