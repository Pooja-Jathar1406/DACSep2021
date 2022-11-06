import java.util.*;
class ArrayRotation{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in); 
		
		int arr1[] =  {1, 2, 3, 4, 5, 6, 7 , 8 };
		int arr2[] =  new int[ arr1.length ];
		 
		System.out.println("Array elements before rotation: ");
		System.out.print(Arrays.toString(arr1));
		System.out.println();
		
		System.out.println("Enter position: ");
		int d = sc.nextInt();
		int j=0;
		for(int i = d; i<arr1.length; i++){
			arr2[ j ] =arr1[ i ];
			j++;
		}
		for(int i = 0; i<d; i++){
			arr2[ j ] =arr1[ i ];
			j++;
		}
		System.out.print("After rotation: "+Arrays.toString(arr2));
		
	}
}