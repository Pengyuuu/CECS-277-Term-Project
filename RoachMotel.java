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
		//rooms = new ArrayList<MotelRoom>(10);
	}

	
	public static RoachMotel getInstance() {
		
		if (unique == null) {
			
			unique = new RoachMotel();
		}
		
		return unique;
	}

	public MotelRoom checkIn(RoachColony r, String type, ArrayList amenities) {

		RoomFactory factory = new RoomFactory();
		MotelRoom room = factory.getRoom(type);

        for (int i = 0; i < rooms.size(); i++){

			if (rooms.get(i) == null) {

                room.addAmenities(amenities, room);
                capacity --;
                rooms.set(i, room);
				System.out.println(room.getDescription());
                System.out.println("Added room");
                break;
            }
        }
		return room;
	}

	public double checkOut(MotelRoom r, int days, String payType) {

		double total = r.calculateTotal() * days;

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

				}
			}
		}


		return total;

	}



	@Override
	public String toString() {
		String s = "";
		String available = "Available: [";
		for (int i = 0; i < rooms.size(); i ++) {
            if (rooms.get(i) != null) {
            	//System.out.println(rooms.get(i).getDescription());
                s += (rooms.get(i).getDescription());
            }
            else {
                available += ("10" + (i) + " " );
            }
		}
		return "Motel: {" + s + " } " + available + "]";
	}

}
