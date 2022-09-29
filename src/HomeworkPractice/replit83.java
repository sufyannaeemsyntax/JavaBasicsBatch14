package HomeworkPractice;

public class replit83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	    int sum=0;
	    int sum1=0;
	    for(int i=0; i<a.length; i++) {
	      for(int c=0; c<a[i].length; c++) {
	        sum1+=a[i][c];
	      }
	      System.out.println(sum1);
	      sum+=sum1;
	      sum1=0;
	    }
	    System.out.println(sum);
	    
		
	}

}
