/**
 * 
 */
package com.hotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prashant
 *
 */
public class HotelReservation {

	
	public List<Hotel> hotelList;
	
	public HotelReservation() {
		this.hotelList = new ArrayList<>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program!");
		HotelReservation hotelReservationSystem = new HotelReservation();
		hotelReservationSystem.addHotel("Lakewood",110,90,3,80,80);
		
	}

	private void addHotel(String hotelName, int weekdayRateForRegularCustomers, int weekendRateForRegularCustomers,
			int hotelRating, int weekDayRateForRewardCustomers, int weekendRateForRewardCustomers) {
		this.hotelList.add(new Hotel(hotelName,weekdayRateForRegularCustomers,weekendRateForRegularCustomers,hotelRating,weekDayRateForRewardCustomers,weekendRateForRewardCustomers));
		
	}

}
