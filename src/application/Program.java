package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print(" Room Number : ");
			int number = sc.nextInt();

			System.out.print("Check-In (dd/MM/yyy) : \n");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Check-out (dd/MM/yyyy) : \n");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation : " + reservation);
			System.out.println("*****************************************");

			System.out.println("Enter data to update the Reservation");
			System.out.println("Check-In Date : (dd/MM/yyy)");
			checkIn = sdf.parse(sc.next());

			System.out.println("Check-Out Date : (dd/MM/yyy) : ");
			checkOut = sdf.parse(sc.next());

		} catch (ParseException e) {

			System.out.println("Invalid date Format");

		} catch (IllegalArgumentException e) {
			System.out.println("Error in Reservation: " + e.getMessage());
		}

		sc.close();
	}

}
