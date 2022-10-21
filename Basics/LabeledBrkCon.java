class LabeledBrkCon {
	public static void main(String args[]){
		 //*******************************labeled break and continue***********************************   
	//--------------without using label-------------------
	/*
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.println(i+","+j);
				if(i==j){
					break;           //this break will take the control out of for loop (for j )
				}
			}
			System.out.println("Out of inner for");
        }
		System.out.println("Out of outer for");
	*/
	
/*
o/p:
1,1
Out of inner for
2,1
2,2
Out of inner for
3,1
3,2
3,3
Out of inner for
4,1
4,2
4,3
4,4
Out of inner for
5,1
5,2
5,3
5,4
5,5
Out of inner for
Out of outer for
*/

		//--------------------using label--------------------
		//label name can be anything without spaces(follow naming convention as small camel case)
/*		
		outer: for(int i=1;i<=5;i++){         // labeling the for loop with a lable name outer
			inner: for(int j=1;j<=5;j++){         // labeling the for loop with a label inner
				System.out.println(i+","+j);
				if(i==j){
					break outer;           //this break will take the control out of for loop (for i )
				}
			}
			System.out.println("Out of inner for");
        }
		System.out.println("Out of outer for");
*/
/*o/p:
1,1
Out of outer for
*/

	outer: for(int i=1;i<=5;i++){         // labeling the for loop with a lable name outer
			inner: for(int j=1;j<=5;j++){         // labeling the for loop with a label inner
			//System.out.println(i+","+j);       
				if(i==j){
					System.out.println(i+","+j);  
					continue outer;           //this break will take the control out of for loop (for i )    
				}
			}
			System.out.println("Out of inner for");
        }
		System.out.println("Out of outer for");
		
		
	}
}