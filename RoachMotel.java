
public class RoachMotel {
	
	private static RoachMotel unique;

	private int capacity;

	
	private RoachMotel() {
		
		capacity = 10;
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
		return rm;
	}

	public double checkOut(MotelRoom r, int days, String payType)_ {

		return r.calculateTotal();

	}


	@Override
	public String toString() {
		return "";
	}

}
