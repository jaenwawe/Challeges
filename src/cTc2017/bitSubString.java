package cTc2017;

public class bitSubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 0b10000000000;
		  System.out.println(Integer.toBinaryString(n));

		  int i = 2; /*3 shifts*/
		  int j= 6;
		  
		  int m = 0b10101;
		  System.out.println(Integer.toBinaryString(m));

		  m = m<<2;	  //shift m two slots and then add them to the value n since there only 0s there.
		  int solution = m +n;
		  System.out.println("The between 0b10000000000 &  0b1010100 is " + Integer.toBinaryString(solution)); 
	}
}
