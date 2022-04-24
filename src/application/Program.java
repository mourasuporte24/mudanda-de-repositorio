package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		
		

		System.out.print(" Room Number : ");
		int number = sc.nextInt();

		System.out.print("Check-In (dd/MM/yyy) : \n");

		Date checkIn = sdf.parse(sc.next());

		System.out.print("Check-out (dd/MM/yyyy) : \n");

		Date checkOut = sdf.parse(sc.next());

		if (checkOut.before(checkIn)) {

			System.out.println("Error in Reservation : Check-Out Date must be after check-In date");

		} else {

			Reservation reservation = new Reservation(number, checkIn, checkOut);

			System.out.println("Reservation :" + reservation);

			System.out.println();

			System.out.println("Enter data to update the Reservation : ");
			System.out.println("Check-In date : (dd/MM/yyyy) : ");
			checkIn = sdf.parse(sc.next());

			System.out.println("Check-Out date : (dd/MM/yyy) : ");
			checkOut = sdf.parse(sc.next());
		
			
			System.out.print("Updates: " + updateDates(checkOut, checkOut) );
			

		}

		sc.close();

	}

	private static String updateDates(Date checkOut, Date checkOut2) {
		// TODO Auto-generated method stub
		return null;
	}

}
