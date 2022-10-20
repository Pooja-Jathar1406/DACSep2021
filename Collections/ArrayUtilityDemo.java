import java.util.*;

//**************** Arrays is an utility class just like Collections   *************
class ArrayUtilityDemo{
	
	public static void main(String args []){
		
		/*
		int myArr[]= new  int [5];
		Arrays.fill(myArr,1);                                                  //fills all array elements with 1
		*/
		//int myArr[]= {15, 10, 20, 4, 1, 40};                          //this is also correct way to define array
		int myArr[] = new int[]{15, 10, 20, 4, 1, 40};
		
		System.out.println("Elements of Array");
		for(int a : myArr){
			System.out.println(a);
		}
		System.out.println();
		
		//toString() method  --  gives String representation of array
		System.out.println(Arrays.toString(myArr));             // toString is a method present in Arrays class - o/p:  [15, 10, 20, 4, 1, 40]
		System.out.println();
		
		//sort()--  sorts the array in ascending order
		System.out.println("Elements of Array after sorting: ");
		Arrays.sort(myArr);
		System.out.println(Arrays.toString(myArr));              // [1, 4, 10, 15, 20, 40]  
		System.out.println();
		
		//shuffle()--  
		System.out.println("Elements of Array after shuffeling: ");
		List<Integer> intList = Arrays.asList(myArr);

		Collections.shuffle(intList);
		//Arrays.shuffle(myArr);
		System.out.println(Arrays.toString(myArr));              // [1, 4, 10, 15, 20, 40]  
		System.out.println();
		
	}
}