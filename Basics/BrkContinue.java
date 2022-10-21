import java.util.*;
class BrkContinue{
    public static void main(String args[]){
	double d1=(3.0*2/4);
/* 
    int x=9,y=12,z=3;
	
	int exp1=x-y/3+z*2-1;
	int exp2=(x-y)/3+((z*2)-1);
	System.out.println(d1);
	System.out.println(exp1);
	System.out.println(exp2);
*/
/*  
//---------------break--------------------
	int i=1;
	while(i<=10){
		System.out.println(i);
		if(i==5){
			break;
		}
		i++;
	}
	System.out.println("Out of loop");
*/
	
	//-----------------continue--------------------
/*	
	int i=1;
	while(i<=10){
		
		if(i==5){
			continue;
		}
		System.out.println(i);
		i++;
	}
	System.out.println("Out of loop");
*/
/*
o/p:
1
2
3
4
Infinite loop after printing 4- ctrl will go at the start of loop i.e while(i<=10)
*/

//But if we want all iteration xcept for i=5 then use like this:
/*
	int i=1;
	while(i<=10){
		
		if(i==5){
			i++;    //increment i before cotinue
			continue;
		}
		System.out.println(i);
		i++;
	}
	System.out.println("Out of loop");
	
*/
/*
o/p:
1
2
3
4
6
7
8
9
10
Out of loop
*/
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
//o/p:
//1,1
//Out of outer for

	}
}