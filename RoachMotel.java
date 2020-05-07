import java.util.ArrayList;

public class RoachMotel {
	
	private static RoachMotel unique;
	private ArrayList<MotelRoom> rooms;

	private int capacity;

	
	private RoachMotel() {
		//rooms = null;
		rooms = new ArrayList<MotelRoom>();
		capacity = 10;
	}

	public void createRooms() {

		for (int i = 0; i < capacity; i++){
			rooms.add(null);
		}
	}

	
	public static RoachMotel getInstance() {
		
		if (unique == null) {
			
			unique = new RoachMotel();
		}
		
		return unique;
	}

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
