import java.util.ArrayList;

public class TestRoom2 {


    public static void main(String args[]) {
        MotelRoom mr = new BasicRoom();
        System.out.println(mr.getDescription()
                + " $" + mr.cost());

        MotelRoom mr2 = new BasicRoom();
        mr2 = new FoodBar(mr2);
        mr2 = new Spa(mr2);
        mr2 = new AutoRefill(mr2);
        System.out.println(mr2.getDescription()
                + " $" + mr2.cost());

        MotelRoom mr3 = new BasicRoom();
        mr3 = new Spa(mr3);
        mr3 = new SprayResistantShower(mr3);
        mr3 = new FoodBar(mr3);
        System.out.println(mr3.getDescription()
                + " $" + mr3.cost());


        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);
        RoachColony rc1 = new  RoachColony("first colony",100,200);
        ArrayList amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        MotelRoom r1 = rm.checkIn(rc1,"Suite",amenities);
        System.out.println(rc1);
        System.out.println(rm);
        RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        ArrayList amenities2 = new ArrayList();
        amenities2.add("foodbar");
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        rc2.party();
        System.out.println(rc2);
        Double cost = rm.checkOut(r2,3,"MasterRoach");
        System.out.println("cost:" + cost);
        System.out.println(rm);
        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities2);
        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities2);
        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities2);
        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);
        cost = rm.checkOut(r3,3, "RoachPay");
        System.out.println("cost:" + cost);
        MotelRoom r6 = rm.checkIn(rc6,"Regular",amenities2);
    }
}