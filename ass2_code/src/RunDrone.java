import java.util.List;

public class RunDrone {
    public static void main(String[] args) {
        // TODO: illustrate your implementations here
        // fly up at low speed -> fly up at moderate speed
        Trick trickTakeOff = new Trick("Take Off");
        Move moveUPLow = new Move(Direction.UP, 10, Speed.LOW);
        Move moveUPModerate = new Move(Direction.UP, 20, Speed.MODERATE);
        trickTakeOff.addMove(moveUPLow);
        trickTakeOff.addMove(moveUPModerate);
        // ; and a pucker trick can be
        //described as fly up -> turn left -> turn left -> turn left -> turn left -> fly down
        Trick pucker = new Trick("Pucker");
        pucker.setRecord(true);
        Move moveUPLowPucker = new Move(Direction.UP, 10, Speed.MODERATE);
        Move moveLeftLow = new Move(Direction.LEFT, 5, Speed.LOW);
        Move moveLeftMor = new Move(Direction.LEFT, 10, Speed.MODERATE);
        Move moveLeftHigh = new Move(Direction.LEFT, 15, Speed.HIGH);
        Move moveLeftLow1 = new Move(Direction.LEFT, 3, Speed.LOW);
        Move moveDownHigh = new Move(Direction.DOWN, 5, Speed.HIGH);
        pucker.addMove(moveUPLowPucker);
        pucker.addMove(moveLeftLow);
        pucker.addMove(moveLeftMor);
        pucker.addMove(moveLeftHigh);
        pucker.addMove(moveLeftLow1);
        pucker.addMove(moveDownHigh);
        // TWIZZLE STICK
        Trick twizzleStick = new Trick("Twizzle Stick");
        twizzleStick.setRecord(true);
        Move moveF = new Move(Direction.FORWARD, 10, Speed.MODERATE);
        Move moveB = new Move(Direction.BACKWARD, 5, Speed.LOW);
        Move moveR = new Move(Direction.RIGHT, 10, Speed.MODERATE);
        Move moveL1 = new Move(Direction.LEFT, 15, Speed.HIGH);
        Move moveL2 = new Move(Direction.LEFT, 3, Speed.LOW);
        Move moveD = new Move(Direction.DOWN, 5, Speed.HIGH);
        Move moveU1 = new Move(Direction.UP, 5, Speed.HIGH);
        twizzleStick.addMove(moveF);
        twizzleStick.addMove(moveB);
        twizzleStick.addMove(moveR);
        twizzleStick.addMove(moveL1);
        twizzleStick.addMove(moveL2);
        twizzleStick.addMove(moveD);
        twizzleStick.addMove(moveU1);
        //PINWHEEL
        Trick twizzlePinwheel = new Trick("Pinwheel");
        twizzlePinwheel.setRecord(true);
        Move moveF1 = new Move(Direction.FORWARD, 10, Speed.MODERATE);
        Move moveB2 = new Move(Direction.BACKWARD, 5, Speed.LOW);
        Move moveR1 = new Move(Direction.RIGHT, 10, Speed.MODERATE);
        Move moveL11 = new Move(Direction.LEFT, 15, Speed.HIGH);
        Move moveL21 = new Move(Direction.LEFT, 3, Speed.LOW);
        Move moveD1 = new Move(Direction.DOWN, 5, Speed.HIGH);
        Move moveD11 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU12 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU13 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU14 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU15 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU16 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU17 = new Move(Direction.UP, 5, Speed.HIGH);
        Move moveU18 = new Move(Direction.UP, 5, Speed.HIGH);
        twizzleStick.addMove(moveF1);
        twizzleStick.addMove(moveB2);
        twizzleStick.addMove(moveR1);
        twizzleStick.addMove(moveL11);
        twizzleStick.addMove(moveL21);
        twizzleStick.addMove(moveD1);
        twizzleStick.addMove(moveD11);
        twizzleStick.addMove(moveU12);
        twizzleStick.addMove(moveU13);
        twizzleStick.addMove(moveU14);
        twizzleStick.addMove(moveU15);
        twizzleStick.addMove(moveU16);
        twizzleStick.addMove(moveU17);
        twizzleStick.addMove(moveU18);

        // land
        Trick trickLand = new Trick("Land");
        Move md1 = new Move(Direction.DOWN, 3, Speed.LOW);
        Move md2 = new Move(Direction.DOWN, 4, Speed.LOW);
        trickLand.addMove(md1);
        trickLand.addMove(md2);

        Flight flight1 = new Flight("Flight 1");
        flight1.addTricks(trickTakeOff);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(pucker);
        flight1.addTricks(twizzleStick);
        flight1.addTricks(trickLand);

        Flight flight2 = new Flight("Flight 2");
        flight2.addTricks(trickTakeOff);
        flight2.addTricks(pucker);
        flight2.addTricks(pucker);
        flight2.addTricks(twizzlePinwheel);
        flight1.addTricks(trickLand);

        Flight flight3 = new Flight("Flight 3");
        flight3.addTricks(trickTakeOff);
        flight3.addTricks(pucker);
        flight3.addTricks(pucker);
        flight3.addTricks(twizzleStick);
        flight3.addTricks(twizzleStick);
        flight3.addTricks(trickLand);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addFlight(flight1);
        remoteControl.addFlight(flight2);
        remoteControl.addFlight(flight3);

        remoteControl.setBasedSortType("");
        System.out.println("Sorted based by the tricks numbers: ");
        List<Flight> flights = remoteControl.getFlights();
        for (int i = 0; i < flights.size(); i++) {
            System.out.printf("order %s: %s with numbers: %s%n", (i + 1), flights.get(i).getName(), flights.get(i).getCounter());
        }
        remoteControl.setBasedSortType("ud");
        System.out.println("Sorted based by the unique up numbers: ");
        flights = remoteControl.getFlights();
        for (int i = 0; i < flights.size(); i++) {
            System.out.printf("order %s: %s with numbers: %s%n", (i + 1), flights.get(i).getName(), flights.get(i).getCounter());
        }
        remoteControl.setBasedSortType("uu");
        System.out.println("Sorted based by the unique down numbers: ");
        flights = remoteControl.getFlights();
        for (int i = 0; i < flights.size(); i++) {
            System.out.printf("order %s: %s with numbers: %s%n", (i + 1), flights.get(i).getName(), flights.get(i).getCounter());
        }
    }
}
