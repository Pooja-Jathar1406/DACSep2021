class TowerOfHanoi{
	
	static void towerOfHanoi(int n, char s, char inter, char d){
		if(n==1)
			System.out.println(s+" to "+d);
		else{
			towerOfHanoi(n-1,s,d,inter);
			System.out.println(s+" to "+d);
			towerOfHanoi(n-1,inter,s,d);
			System.out.println();
		}
	}
	
	public static void main (String args[]){
		int n=4;
		
		towerOfHanoi(n, 'A', 'B','C');
	}
}