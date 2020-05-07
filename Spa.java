
public class Spa extends AmenityDecorator {

	MotelRoom room;
	
	public Spa() {
		
	}

	public Spa (MotelRoom room) {

		this.room = room;
	}
	
	public String getDescription() {
		
		return room.getDescription() + ", with a spa ";
	}
	
	public double cost() {
		
		return room.cost() + 20;
	}

	@Override
	public String toString() {
		return "Spa";
	}
}
