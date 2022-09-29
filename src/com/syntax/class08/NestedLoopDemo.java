package com.syntax.class08;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		for(int i=1; i<3; i++) { // -> outer loop controls inner loop

			System.out.println("Hello");  //this will print once and then go on to next loop

			for(int j=1; j<=3; j++) { //-> inner loop depends on outer loop

			System.out.println("Bye"); //this will print 3 times or until false and then go to first loop

			
			//Hello
			//Bye
			//Bye
			//Bye
			//Hello
			//Bye
			//Bye
			//Bye
	
	}
		}
		
		System.out.println("---------------");
		
		for (int i=0; i<=2; i++) { //this will register once then
			                       // proceed
			
			for(int j=1; j<4; j++) { //this will register 3 times then
				                     //proceed back and repeat 
				
				System.out.println(i+" " + j);
				
				//0 1  
				//0 2  
				//0 3   
				//1 1 
			    //1 2
	            //1 3 
	            //2 1
                //2 2
                //2 3
				//1 1 
			    //1 2
		        //1 3 
	            //2 1
				//2 2
                //2 3
			
			}
		}
	}
			}   

