class OptimizedBubbleSort{
	//print the array
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  " );
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		
		int arr[] = {5,7,1,3,8,2};
		boolean swapped= false;
		//bubble sort
		//time complexity:  O(n^2)
		for (int i =0; i<arr.length-1; i++){   //for passes  -- run for n-1 times i.e n
			for(int j=0; j<arr.length-i-1; j++){   // for comaprison  --  run for n-1 times i.e n
				//swap
				if(arr [ j ]> arr[ j+1]){
					int temp = arr[ j ];
					arr[ j ] = arr[ j+1];
					arr[ j+1] = temp;
					swapped = true;
				}
			}
			if (swapped= false)
				return;
		}
		
		printArray(arr);
		
	}
}