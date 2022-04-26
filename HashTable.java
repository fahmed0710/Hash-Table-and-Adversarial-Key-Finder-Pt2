import java.util.ArrayList;

public class HashTable {
	LinkedEntry[] table;
	ArrayList<LinkedEntry> adversarialKeys;
	
	/*
	 * Constructs a new hash table
	 * 
	 * @param m the size of the hash table
	 */
	public HashTable(int m) {
		table = new LinkedEntry[m];
	}
	
	/*
	 * Constructs a new hash table
	 * 
	 * @param a an integer such that 1 <= a <= p - 1
	 * @param b an integer such that 0 <= b <= p - 1
	 * @param p the smallest prime number that's larger than mn-1
	 * @param m the size of the hash table
	 * @param n the number of keys
	 */
	public HashTable(int a, int b, int p, int m, int n) {
		table = new LinkedEntry[m];
		adversarialKeys = new ArrayList<LinkedEntry>();
		
		for(int i = 0; i <= (m*n) - 1; i++) {
			
			int hash = (((a * i) + b) % p) % m;
			
			LinkedEntry l = new LinkedEntry(i, hash);
			
			if(table[hash] == null) {
				table[hash] = l;
			}
			else {
				LinkedEntry current = table[hash];
				 while(current.getNext() != null) {
					 current = current.getNext();
				 }	
				 current.setNext(l);
				 l.setPrev(current);
				 if(l.count == n) {
					 LinkedEntry adKey = table[hash];
					 adversarialKeys.add(adKey); 
					 while(adKey.getNext() != null) {
						 adKey = adKey.getNext();
						 adversarialKeys.add(adKey);
					 }
					 break;
				 }
			}
		}
	}
}
