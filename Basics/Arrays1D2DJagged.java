import java.util.*;
class Arrays1D2DJagged{
	public static void main(String args[]){
		
		//*************  1D ARRAY  ************
	
		System.out.println("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int size= sc.nextInt();
		int marks[]=new int[size];   //creating array of given size
		
		//**********Taking array elements from user
		System.out.println("Enter elements of array: ");
		Scanner elemtnts=new Scanner(System.in);
		for(int i=0; i<size;i++){
			marks[i]=sc.nextInt();
		}
		//Another way to assign array values
		//int marks[]={70, 89, 67, 75, 65};
		
		//************Priniting array elements
		System.out.print("Elements of array are: ");
		for(int i=0; i<size;i++){
			System.out.print(marks[i]+" ");
		}
		//****************length of array
		System.out.println("\nLength of given array is: "+marks.length);
		
		//*************  2D ARRAY  ************
		System.out.println("Enter number of rows of array: ");
		//Scanner sc1=new Scanner(System.in);
		int row= sc.nextInt();
		System.out.println("Enter number of cols of array: ");
		int col= sc.nextInt();
		
		int marks1[][]=new int[row][col];
		
		System.out.println("Enter elements of array: ");
		//Scanner elements=new Scanner(System.in);
		for(int i=0; i<row;i++){         //for row iteration
			for(int j=0;j<col;j++){        //for col iteration
				marks1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of array are: ");
		for(int i=0; i<size;i++){
			for(int j=0;j<col;j++){  
				System.out.print(marks1[i][j]+" ");
			}
			System.out.println();
		}
		
		//*************  JAGGED ARRAY  ************
		
		
		
	}
}