public class LinkedEntry {
	int key, val, count;
	LinkedEntry prev, next;
	
	/*
	 * Constructs a new linked node
	 * 
	 * @param k the key of the node
	 * @param v the value of the node
	 */
	public LinkedEntry(int k, int v){
		this.key = k;
		this.val = v;
		this.count = 1;
		this.prev = null;
		this.next = null;
	}
	
	/*
	 * Returns the value of the node
	 * 
	 * @return the value of the node
	 */
	public int getValue() {
		return this.val;
	}
	
	/*
	 * Sets the value of the node
	 * 
	 * @param v the new value of the node
	 */
	public void setValue(int v) {
		this.val = v;
	}
	
	/*
	 * Gets the key of the node
	 * 
	 * @return the key of the node
	 */
	public int getKey() {
		return this.key;
	}
	
	/*
	 * Gets the node next to this node
	 * 
	 * @return the node next to the current node
	 */
	public LinkedEntry getNext() {
		return this.next;
	}
	
	/*
	 * Sets the node next to this node
	 * 
	 * @param n the new node to be the current node's next node
	 */
	public void setNext(LinkedEntry n) {
		this.next = n;
	}
	
	/*
	 * Gets the node before this node
	 * 
	 * @return the previous node of the current node
	 */
	public LinkedEntry getPrev() {
		return this.prev;
	}
	
	/*
	 * Sets the node previous to this node
	 * 
	 * @param n the new node to be the current node's prev node
	 */
	public void setPrev(LinkedEntry p) {
		this.prev = p;
		if(this.getPrev() == null)
			count = 1;
		else
			count = this.getPrev().count + 1;
	}
}
