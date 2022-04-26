public class Main {
	/*
	 * Test cases for the adversarial key finder and percentage methods
	 */
	public static void main(String[] args) {
		AdversarialKeyFinder akf = new AdversarialKeyFinder();
		
		// Testing for m = n = 10, p = 101 with S(2,2) S(3,3), S(1,0), and S(10,10)
		System.out.println("m = n = 10, p = 101");
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(2,2,101,10,10));
		System.out.println(akf.percentage(2,2,101,10,10));
		System.out.println("");
		
		
		System.out.println(akf.adversaryKeys(3,3,101,10,10));
		System.out.println(akf.percentage(3,3,101,10,10));
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(1,0,101,10,10));
		System.out.println(akf.percentage(1,0,101,10,10));
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(10,10,101,10,10));
		System.out.println(akf.percentage(10,10,101,10,10));
		System.out.println("");
		
		System.out.println("-----------------------------------------------------------------");
		
		// Testing for m = n = 20, p = 401 with S(10,5) and S(17,19)
		System.out.println("");
		System.out.println("m = n = 20, p = 401");
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(10,5,401,20,20));
		System.out.println(akf.percentage(10,5,401,20,20));
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(17,19,401,20,20));
		System.out.println(akf.percentage(17,19,401,20,20));
		System.out.println("");
		
		System.out.println("-----------------------------------------------------------------");
		
		// Testing for m = n = 30, p = 911 with S(10,5) and S(13,29)
		System.out.println("");
		System.out.println("m = n = 30, p = 911");
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(10,5,911,30,30));
		System.out.println(akf.percentage(10,5,911,30,30));
		System.out.println("");
		
		System.out.println(akf.adversaryKeys(13,29,911,30,30));
		System.out.println(akf.percentage(13,29,911,30,30));
		System.out.println("");
	}
}
