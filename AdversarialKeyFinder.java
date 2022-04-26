import java.util.ArrayList;

public class AdversarialKeyFinder {
	double x,y,d;
	HashTable h;
	
	/*
	 * Constructor a new adversarial key finder
	 */
	public AdversarialKeyFinder(){
		
	}
	
	/*
	 * Returns the adversarial keys from the hash table's arraylist storing them in a string format
	 * 
	 * @param a an integer such that 1 <= a <= p - 1
	 * @param b an integer such that 0 <= b <= p - 1
	 * @param p the smallest prime number that's larger than mn-1
	 * @param m the size of the hash table
	 * @param n the number of keys
	 * @return the adversary keys
	 */
	public String adversaryKeys(int a, int b, int p, int m, int n) {
		this.h = new HashTable(a,b,p,m,n);
		
		String s = "(" + a + ", " + b + "): [";
		for(int i = 0; i < h.adversarialKeys.size(); i++) {
			int k = h.adversarialKeys.get(i).getKey();
			if(i == h.adversarialKeys.size() - 1)
				s += k + "]";
			else
				s += k + ", ";
		}
		return s;
	}
	
	/*
	 * Computes the percentage of the hash functions that map at least 10 keys to a fixed value
	 * 
	 * @param p the smallest prime number that's larger than mn-1
	 * @param m the size of the hash table
	 * @param n the number of keys
	 * @return the percentage of the hash functions that map at least 10 keys to a fixed value 
	 */
	public String percentage(int ogA, int ogB, int p, int m, int n) {
		ArrayList<LinkedEntry> adKeys = new HashTable(ogA,ogB,p,m,n).adversarialKeys;
		x = 0;
		// Loop through a values
		for(int a = 1; a <= p - 1; a++) {
			// Loop through b values
			for(int b = 0; b <= p - 1; b++) {
				// Initialize a hash table of size m
				h = new HashTable(m);
				// Loop through the adversarial keys
				for(LinkedEntry k : adKeys) {
					int hash = (((a * k.getKey()) + b) % p) % m;
					LinkedEntry l = new LinkedEntry(a, hash);
					if(h.table[hash] == null)
						h.table[hash] = l;
					else {
						LinkedEntry current = h.table[hash];
						 while(current.getNext() != null) {
							 current = current.getNext();
						 }	
						 current.setNext(l);
						 l.setPrev(current);
						 if(l.count >= 10) {
							 x += 1;
							 break;
						 }
					}
				}
			}
		}
		y =  (float) (p * (p - 1));
		d = 100.0 * (x/y);
		String percentage = String.format("%.2f",d);
		String s = "Percentage: " + percentage + "%";
		return s;
	}
}
