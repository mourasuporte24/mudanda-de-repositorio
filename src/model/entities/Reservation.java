package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtor Vazio
	public Reservation() {

	}

	// Construtor com argumentos
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {

		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkIn, Date checkOut) {

		Date now = new Date();

		if (checkIn.before(now) || checkOut.before(now)) {

			throw new IllegalArgumentException ("Reservation dates for update must be future");

		}

		if (checkOut.before(checkIn)) {

			throw new IllegalArgumentException("Check-Out Date must be after check-In date");

		} else {

			this.checkIn = checkIn;
			this.checkOut = checkOut;

		}

	}

	@Override
	public String toString() {
		return "RoomNumber :" + roomNumber + " Check -In Date :" + checkIn + sdf.format(checkIn) + "\n"
				+ " Check-Out Date :"

				+ checkOut + sdf.format(checkOut) + "\n" + "\n" + "Reservation : Room " + roomNumber + "\n"
				+ " Check-In :" + sdf.format(checkIn) + "\n" + " Check_out : " + sdf.format(checkOut) + "\n"
				+ duration() + " Nights ";

	}
}