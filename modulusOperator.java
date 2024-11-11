public class Program {
    public static void main(String[] args) {

	// Modulud Operator

		//System.out.println(123/10);
		// System.out.println((float)123/10);
    // System.out.println(123 % 10);

    //even numbers
    // System.out.println(8 % 2);
    // System.out.println(24 % 2);

    //odd numbers
    // System.out.println(7 % 2);
    // System.out.println(9 % 2);

    // if(8 % 2 == 0){
    //   System.out.println("even number");
    // }

    // if(21 % 7 == 0){
    //   System.out.println(
    //     "21 is disible by 7"
    //   );
    // }

    int no = 123;
    int digit = no % 10;
    System.out.println(digit);

    no = no / 10;
    System.out.println(no);

    digit = no % 10;
    System.out.println(digit);

    }
  
}
