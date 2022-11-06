import java.util.*;
class BinarySearchUsingRecursion{
	
	static int search(int[] arr, int target, int start, int end){
		if(start > end ){
			return -1;
		}
		int mid =(end + start )/2;
		if(arr[mid] == target ){
			return mid;
		}
		if (target < arr [mid]){
			return search(arr, target, start, mid-1);
		}
		return search(arr, target, mid+1, end);
	}
	
	public static void main(String args[]){
		int[] arr= {56, 3, 54, 6, 7, 8};
		Arrays.sort(arr );                          //array must be sorted for binary search
		int target = 54;
		System.out.println(search(arr, target, 0, arr.length-1));
	}
}