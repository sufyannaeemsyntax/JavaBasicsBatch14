package HomeworkPractice;

public class quizhelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			char array_variable [] = new char[10];
			for (int i = 0; i < 10; ++i) {
			         array_variable[i] = 'i';
			         System.out.print(array_variable[i] + " ");
			}
			int[] array = { 1, 4, 3, 6, 8, 2, 5 };

			int what = array[0];

			for (int index = 0; index < array.length; index++) {

			       if (array[index] > what) {

			                  what = array[index];

			        }

			}

			System.out.println(what);
			System.out.println("----------------");
			int[] zip = new int[5];

			zip[0] = 7;
			zip[1] = 3;
			zip[2] = 4;
			zip[3] = 1;
			zip[4] = 9;

			System.out.println( zip[ 2 + 1 ] );
			System.out.println("---------------");
			for(int i=1; i<15; i=i+3) {

			    
			}
		     int count = 0;
		     while (count++ < 10) {
		     System.out.println("Welcome to Java");
		     }
		     int k=3, tot=0;

		     do{

		        tot=tot+k;

		        k++;

		     } while(k<11);

		     System.out.print(tot);
		     System.out.println("---------------");
		     int x=1;

		     do{

		        x++;

		        System.out.print(x);

		     }while(x<5);
		     int z=2, sum=0;

		     while(z<9) {

		        z++;

		        sum=sum+z;

		     }

		     System.out.print(sum);
		     System.out.println("------------------");
		     int m=2, total=0;

		     while(m<6) {

		        total=total+m;

		        m++;

		     }

		     System.out.print(total);
		     System.out.println("-------------------------");
		     int nums[] = { 12, 15, 16, 17, 19 };

		     for (int i = nums.length-1; i >0; i--) {

		        System.out.println(nums[i]);

		      }
		     int i = 50;

		     int[] a = new int[10];

		     System.out.println(a.length);

		     a = new int[100];

		     System.out.println(a.length);

		     a = new int[i];

		     System.out.println(a.length);
		     System.out.println("--------------------------");
		     {}
		     int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		     for ( int index= 0 ; index < 5 ; index++ ) {
		            System.out.print( egArray[ index ] + " " );
		     }
		   for(int s=1; s<15; s=s+3) {
			   System.out.println(s);
		   }
		   int v = 0;
		   for (int f = 0; f < 10; ++f) {
		   v += 1;
		  System.out.println(v);
		   }
		   int q=1;

		   do{

		      q++;

		      System.out.print(q);

		   }while(q<5);
	}

}
