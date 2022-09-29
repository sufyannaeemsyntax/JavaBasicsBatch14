package HomeworkPractice;

import java.util.Scanner;

public class replitex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		   int x=in.nextInt();

		   for(int y=0; y<x; y++) {
		     System.out.print (y+" ");
		     
		     System.out.println("-------");
		   }
			   char array_variable [] = new char[10];
			   for (int i = 0; i < 10; ++i) {
			            array_variable[i] = 'i';
			            System.out.print(array_variable[i] + " ");
			   }
	}

}
