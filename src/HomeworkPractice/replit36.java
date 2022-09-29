package HomeworkPractice;

import java.util.Scanner;

public class replit36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input= new Scanner(System.in);
		  String outcome;
		  System.out.println("word1");
		  String word1=input.next();
		  System.out.println("word2");
		  String word2=input.next();
		  System.out.println("int1");
		  int int1=input.nextInt();
		  System.out.println("int2");
		  int int2=input.nextInt();
		  if (word1==word2 && int1==int2)
		  outcome="AND";
		  else if (word1==word2 || int1==int2)
		  outcome="OR";
		  else
		    outcome="NONE";
		    System.out.println(outcome);
		  
		    

		}
	}
