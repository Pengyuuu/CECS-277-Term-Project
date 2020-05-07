/**
 * @authors Erina Lara, Eric Truong
 * Date: May 6, 2020
 * Program: Tester to try out the roach motel and all it's functionalities
 */

import java.util.ArrayList;

public class TestRoom2 {


    public static void main(String args[]) {

        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);

        RoachColony rc1 = new  RoachColony("first colony",100,200);
        ArrayList<String> amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("autorefill");
        amenities.add("shower");
        String a = "In set amenities: [";
        for (int i =0; i < amenities.size(); i++) {
            if (i == amenities.size() - 1) {
                a += amenities.get(i) + " ";
            }
            else {
                a += amenities.get(i) + ", ";
            }
        }
        a += "]";
        System.out.println(a);
        MotelRoom r1 = rm.checkIn(rc1,"Suite",amenities);
        System.out.println(r1);
        System.out.println(rc1);
        System.out.println(rm);

        RoachColony rc2 = new RoachColony("Second colony",1000,0.2);
        ArrayList<String> amenities2 = new ArrayList();
        amenities2.add("foodbar");
        a = "In set amenities: [";
        for (int i =0; i < amenities2.size(); i++) {
            if (i == amenities2.size() - 1) {
                a += amenities2.get(i) + " ";
            }
            else {
                a += amenities2.get(i) + ", ";
            }
        }
        a += "]";
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        rc2.party();
        System.out.println(rc2);
        Double cost = rm.checkOut(r2,3,"MasterRoach");
        System.out.println("cost: " + cost);

        System.out.println(rm);

        RoachColony rc3 = new RoachColony("third colony",300,0.3);
        MotelRoom r3 = rm.checkIn(rc3,"Regular",amenities2);

        RoachColony rc4 = new RoachColony("fourth colony",400,0.4);
        MotelRoom r4 = rm.checkIn(rc4,"Regular",amenities2);

        RoachColony rc5 = new RoachColony("fifth colony",500,0.5);
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities2);

        RoachColony rc6 = new RoachColony("sixth colony",600,0.6);

        cost = rm.checkOut(r3,3, "RoachPal");

        System.out.println("cost: " + cost);
        MotelRoom r6 = rm.checkIn(rc6,"Regular",amenities2);


    }
}