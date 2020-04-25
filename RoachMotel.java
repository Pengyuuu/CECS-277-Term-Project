
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
}
