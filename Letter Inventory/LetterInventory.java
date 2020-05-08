/*Student(s): Mariam Khatib
 * IDE: Eclipse
 * Spring 2020
 * Lab 3: Letter Inventory
 * 
 * Letter Inventory is used to count the letters of the alphabet in a given input, 
 * the size changes when letters are either added or removed from the inventory or
 * combined with other inventories
 * 
 */



public class LetterInventory {
	
	
	public static final int MAX_LETTERS = 26; //cause there's only 26 letters in the English alphabet :D
	
	
	//constructs inventory for given letters
	public LetterInventory (String data) {
		
	}//letterInventory end
	
	
	//returns count of how many chars in inventory, 
	//throw an IllegalArgumentException for non alphabet chars.
	public int get (char letter) {
		
	}//get end
	
	
	//count for the given letter and the given value, 
	//throw an IllegalArgumentException for non alphabet chars
	public void set (char letter, int value){ 
		
		
	}//set end
	
	
	//returns the total number of characters in the letter inventory
	public int size(){
		
	}//end size
	
	//returns if the counts are all 0
	public boolean isEmpty (){
		
	}//end isEmpty
	
	// turns all the letters inventory into a string in lower case
	public String toString(){
		
	}//end toString
	
	//returns the LetterInvetory sum from two other letter objects
	public LetterInventory add (LetterInventory other){
		
	}//end add
	
	//returns the letter inventory of the difference of two objects, returns null if its less than 0
	public LetterInventory subtract (LetterInventory other){
		
	}//end subtract
	
	
	
	
	
	
}
