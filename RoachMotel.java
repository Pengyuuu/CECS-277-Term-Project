/**@authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Creates a motel with rooms that roaches can stay in
 */

import java.util.ArrayList;

public class RoachMotel {
	
	/** One instance of a RoachMotel */
	private static RoachMotel unique;
	
	/** List of rooms the motel will have */
	private ArrayList<MotelRoom> rooms;

	/** How many rooms the motel has */
	private int capacity;

	/**
	 * Creates a roach motel 
	 */
	private RoachMotel() {
		//rooms = null;
		rooms = new ArrayList<MotelRoom>();
		capacity = 10;
	}

	/**
	 * Creates the rooms in the motel
	 */
	public void createRooms() {

		for (int i = 0; i < capacity; i++){
			rooms.add(null);
		}
	}

	/**
	 * Creates a unique roach motel
	 * @return	a single roach motel
	 */
	public static RoachMotel getInstance() {
		
		if (unique == null) {
			
			unique = new RoachMotel();
		}
		
		return unique;
	}

	/**
	 * Allows the roach colony to check in
	 * @param r				roach colony checking in
	 * @param type			type of room they want
	 * @param amenities		what amenities are given
	 * @return				room that they roach will be staying in
	 */
	public MotelRoom checkIn(RoachColony r, String type, ArrayList amenities) {
		if (capacity != 0) {
			RoomFactory factory = new RoomFactory();
			MotelRoom room = factory.getRoom(type);

			for (int i = 0; i < rooms.size(); i++) {

				if (rooms.get(i) == null) {

					if (amenities.contains("shower")) {
						double newGrowth = (r.getGrowth() + 1) * .25;
						r.setGrowth(newGrowth);
					} else {
						double newGrowth = (r.getGrowth() + 1) * .5;
						r.setGrowth(newGrowth);
					}

					room = room.addAmenities(amenities, room);
					room.setRoachCol(r);
					rooms.set(i, room);
					capacity--;
					break;
				}
			}

			return room;
		}
		else {
			System.out.println("Motel is full.");
			return null;
		}
	}

	/**
	 * Allows a colony to check out of their room
	 * @param r			type of room
	 * @param days		how many days they spent
	 * @param payType	payment method
	 * @return			amount needed to pay
	 */
	public double checkOut(MotelRoom r, int days, String payType) {

		double total = r.calculateTotal(days);

		if (payType.equals("MasterRoach")) {
			PaymentStrategy card = new MasterRoach("Roach", "1234", "567", "4/28/20");
			r.pay(card);
		}
		else if (payType.equals("RoachPal")) {
			PaymentStrategy paypal = new RoachPal("roachster@aol.com","roach4life");
			r.pay(paypal);
		}

		for (int i = 0; i < rooms.size(); i++){
			if (rooms.get(i) != null) {
				if (rooms.get(i).getDescription().equals(r.getDescription())) {
					System.out.println("Room number is: 10" + (i));

					rooms.set(i, null);
					capacity++;
					break;
				}
			}
		}
		return total;

	}

	/**
	 * Prints out the rooms available in the roach motel
	 */
	@Override
	public String toString() {
		String s = "";
		String available = "Available: [";
		int count = 0;
		for (int i = 0; i < rooms.size(); i ++) {
            if (rooms.get(i) != null) {
            	if (i != 0) {
					s += (", " + rooms.get(i).getDescription() + " = " + rooms.get(i).getRoachCol() + " ");
				}
            	else {
					s += (rooms.get(i).getDescription() + " = " + rooms.get(i).getRoachCol() + " ");
				}
            }
            else {
            	if (count != 0) {
					available += (", 10" + (i) + " " );
				}
            	else {
					available += ("10" + (i) + "" );
					count ++;
				}
            }
		}

		return "Motel: {" + s + " } " + available + "]" + '\n' + available + "]";
	}

}
