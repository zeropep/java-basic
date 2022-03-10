package hotel;

import java.util.ArrayList;

public class HotelManager {

	public static void main(String[] args) {
		ArrayList<ArrayList<Rooms>> hotel = new ArrayList<>();
		new HotelMenu().runMenu(hotel);
	}

}
