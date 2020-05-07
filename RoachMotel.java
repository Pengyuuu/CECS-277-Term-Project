import java.util.ArrayList;

public class RoachMotel {
	
	private static RoachMotel unique;
	private ArrayList rooms;

	private int capacity;

	
	private RoachMotel() {
		
		capacity = 10;
	}

	public void createRooms() {

		for (int i = 0; i < capacity; i++){
			rooms.add("10"+(i+1));
		}
	}

	
	public static RoachMotel getInstance() {
		
		if (unique == null) {
			
			unique = new RoachMotel();
		}
		
		return unique;
	}

	public MotelRoom checkIn(RoachColony r, String type, String AmenitiesToFix) {

		MotelRoom rm = null;
		if (type.equals("Basic"))
			rm = new BasicRoom();
		else if (type.equals("Deluxe"))
			rm = new DeluxeRoom();
		else if (type.equals("Suite"))
			rm = new SuiteRoom();

		capacity --;

		return rm;
	}

	public double checkOut(MotelRoom r, int days, String payType) {

		return r.calculateTotal();

	}



	@Override
	public String toString() {

		for (int i = 0; i < capacity; i ++) {

			System.out.println(i);
		}
		return "";
	}

}
