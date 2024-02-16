package hackerRank;

class HCF {
	  // A recursive method to find the HCF of two numbers
	  static int hcf(int a, int b) {
	    // Base case: if one of the numbers is zero, return the other number
	    if (a == 0) return b;
	    if (b == 0) return a;
	    // Recursive case: find the HCF of the smaller number and the remainder of the larger number divided by the smaller number
	    if (a > b) return hcf(b, a % b);
	    return hcf(a, b % a);
	  }

	  public static void main(String[] args) {
	    // Test the method with some sample inputs
	    System.out.println("HCF of 50 and 100 is: " + hcf(50, 100)); // Output: 50
	    System.out.println("HCF of 47 and 91 is: " + hcf(47, 91)); // Output: 1
	    System.out.println("HCF of 25 and 50 is: " + hcf(25, 50)); // Output: 25
	    System.out.println("HCF of 25 and 50 is: " + hcf(9, 21)); // Output: 3
	  }
	}

