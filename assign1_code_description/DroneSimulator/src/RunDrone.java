import java.util.ArrayList;
import java.util.List;

public class RunDrone {
    public static void main(String[] args) {
        // Test for the moves by hard code pre-program moves;
        System.out.println("<<<<< Test for the moves by hard code pre-program moves >>>>>");
        List<Move> moves = new ArrayList<>();
        moves.add(new Move(MoveType.TAKEOFF, 0));
        moves.add(new Move(MoveType.MOVE_BACKWARD, 1));
        moves.add(new Move(MoveType.MOVE_UP, 5));
        moves.add(new Move(MoveType.MOVE_FORWARD, 2));
        moves.add(new Move(MoveType.MOVE_BACKWARD, 2));
        moves.add(new Move(MoveType.MOVE_UP, 3));
        moves.add(new Move(MoveType.MOVE_DOWN, 1));
        moves.add(new Move(MoveType.MOVE_BACKWARD, 1));
        moves.add(new Move(MoveType.MOVE_DOWN, 1));
        moves.add(new Move(MoveType.MOVE_UP, 2));
        moves.add(new Move(MoveType.MOVE_FORWARD, 2));
        moves.add(new Move(MoveType.MOVE_FORWARD, 2));
        moves.add(new Move(MoveType.LAND, 0));
        RemoteControl remoteControl = new RemoteControl();
        Drone drone = new Drone();
        drone.focus(new CaptureThing("Flower"), Format.JPG, "dcim_001.jpg");
        remoteControl.setMoves(moves);
        remoteControl.preProgramDrone(drone);
        drone.droneFly();
        remoteControl.clearMoves();

        // Test for the Drone moves by someone self define.
        System.out.println("\n<<<<< Test for the Drone moves by someone self define >>>>>\n");
        drone.focus(new CaptureThing("Sky"), Format.PDF, "dcim_001.pdf");
        remoteControl.createMove();
        remoteControl.preProgramDrone(drone);
        drone.droneFly();
        remoteControl.clearMoves();


    }
}
