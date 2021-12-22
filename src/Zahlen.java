public class Zahlen {

	public static void main(String[] args) {
		int length = 9;
		
		for (int i = 1; i <= length; i++) 
	    {
	        String front = "";
	        String back = "";
	        int space = (length - i) - 1;
	        while (space >= 0) {
	            System.out.print(" ");
	            space--;
	        }
	        for (int j = i; j != 0; j--) {
	            front = j + front;
	            if (j != i) {
	                back = back + j;
	            }
	        }
	       System.out.println(front + back);
	     }
	}
}
