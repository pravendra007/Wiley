
public class SameElement {
	public static void main(String args[]) {
		int arr[] = {1,2,8,9,45,4,1};
		
		if(arr[0]==arr[arr.length-1])
			System.out.print("First and the last element of array are same");
		else
			System.out.print("First and the last element of array are not same");
	}
}
