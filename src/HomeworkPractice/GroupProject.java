package HomeworkPractice;

public class GroupProject {

	public static void main(String[] args) {
		//3. Create a 2D array of integer values. Print the sum of
		//all numbers.

		int [] arr= {10,20,30,40,50,60,70,80,90,100};
		int sum=0; //sum is declared as 0
		for(int i=0; i<arr.length;i++) { //starting at beginning of array till the end
			sum=sum+arr[i];  //0+value is equal to sum
		}
		System.out.println(sum); //the sum is printed
		}
			
	}


