package com.java.tripservice.trip;

import java.util.List;

import com.java.tripservice.exception.DependendClassCallDuringUnitTestException;
import com.java.tripservice.user.User;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new DependendClassCallDuringUnitTestException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}