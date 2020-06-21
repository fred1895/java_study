package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Enter the number os room will be rent: ");
		int rooms = sc.nextInt();
		
		for (int i = 0; i < rooms; i++) {
			System.out.println("ROOM #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room number: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		for (int i = 0; i < vect.length ; i++) {
			if (vect[i] != null) {
				System.out.println("Room " + i + ": " + vect[i].getName() + ", "  + vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
