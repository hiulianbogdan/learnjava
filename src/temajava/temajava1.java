package temajava;
import java.util.Scanner;

class temajava1 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		animal animalObject = new animal();
		System.out.println("Enter an animal name here: ");
		String temp = input.nextLine();
		animalObject.setName(temp);
		animalObject.displayName();
		
		Scanner vulpe = new Scanner (System.in);
		vulpe vulpeObject = new vulpe();
		System.out.println("Introdu nr de picioare: ");
		vulpeObject.afiseazaPicioare(picioare);
	}

}
