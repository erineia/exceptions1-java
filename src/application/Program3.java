package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

		System.out.print("Roon number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/YYYY): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/YYYY): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reeservation: ");
			System.out.print("Check-in date (dd/MM/YYYY)");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-in date (dd/MM/YYYY)");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reeservation dates for updates mus be future.");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}

		}
		sc.close();
	}

}
