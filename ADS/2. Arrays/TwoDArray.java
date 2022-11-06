import java.util.*;
class TwoDArray{
      
	public static void main (String args[]){
		int i, j, m, n;     // m=rows, n= cols
		
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		m = sc.nextInt();
		System.out.println("Enter no. of rows: ");
		n = sc.nextInt();
		
		int a1[][]= new int[m][n]; 
		
		System.out.println("Enter array elements: ");
		for (i=0; i<m;i++){
			for(j=0; j<n;j++){
				a1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entered array: ");
		for (i=0; i<m;i++){
			for(j=0; j<n;j++){
				System.out.print (a1[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
	}
}