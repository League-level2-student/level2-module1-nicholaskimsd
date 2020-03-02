package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList <String> bob = new ArrayList<>();
		//2. Add five Strings to your list

bob.add("Bob");
bob.add("Beb Jr.");
bob.add("Bob Jr. Jr");
bob.add("Bob Jr. Jr. Jr.");
bob.add("Bob Jr. Jr. Jr. Jr.");
		//3. Print all the Strings using a standard for-loop

		//4. Print all the Strings using a for-each loop
		for(String name: bob) {
			System.out.println(name);
			
		}
		//5. Print only the even numbered elements in the list.
				for (int i = 0; i < bob.size(); i++) {
			if(i%2==0) {
				System.out.println(bob.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = bob.size()-1; i > 0; i--) {
			System.out.println(bob.get(i));
			for(int j=0;j>bob.get(i).length();j++) {
				if(bob.get(i).charAt(j)=='e') {
					System.out.println(bob.get(i));
				}
				
			}
		}
		//7. Print only the Strings that have the letter 'e' in them.
		
		
	}
}
