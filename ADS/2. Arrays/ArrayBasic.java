class ArrayBasic{
	
	public static void main (String args[]){
		
		int a1[];
		a1= new int[100];
		int i ;
		int count=0;
		
		a1[0] = 11;
		a1[1] = 77;
		a1[2] = 88;
		a1[3] = 66;
		a1[4] = 45;
		a1[5] = 33;
		a1[6] = 55;
		a1[7] = 23;
		a1[8] = 66;
		a1[9] = 49; 
		
		//display
		for( i=0; i<10; i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		
		//search
		int key = 111;
		for( i=0;i<10;i++){
			if(a1[i] == key){
				count++;
				System.out.println("element found at "+i+" index");
			}
		} 
		if(count==0){
			System.out.println("element not found");
		}

		//delete an element
		
		int key2= 45;
		//for deletion we need to first search the element and then delete
		for( i=0;i<10;i++){
			if(a1[i] == key2){              //element found
				break;
			}
		}
        for(int j = i; j<10; j++)	{
			a1[j] = a1[j+1];                       //replace deleted element with next element
		}
		System.out.println("after deleting "+key2+" : ");
		for( i=0; i<10; i++){
			System.out.print(a1[i]+" ");  
		}
		System.out.println();
	}
}
/*
o/p:
11 77 88 66 45 33 55 23 66 49
element found at 3 index
element found at 8 index
after deleting 45 :
11 77 88 66 33 55 23 66 49 0
*/