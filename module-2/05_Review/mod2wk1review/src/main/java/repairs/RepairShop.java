package repairs;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {

    public static void main(String[] args) {

        Vehicle ford = new Car(2034, 4, 4);
        Vehicle harley = new Motorcycle(500, 2);
        Vehicle honda = new Car(3201, 4, 2);

        List<Vehicle> vehiclesToRepair = new ArrayList<>();
        vehiclesToRepair.add(harley);
        vehiclesToRepair.add(honda);

        repair(ford);
        repair(harley);

//        Vehicle isuzu = new Motorcycle(500,2);
//        //isuzu.setKickStandRetracted(true);
//
//        Motorcycle isuzuM = (Motorcycle) isuzu;
//        isuzuM.setKickStandRetracted(false);

        System.out.println(ford instanceof Motorcycle);


    }

    public static void repair(Vehicle vehicleToRepair) {
        System.out.println("repaired!");



    }
}
