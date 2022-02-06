import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoteControl {
    private List<Move> moves = new ArrayList<>();

    private final Scanner scanner = new Scanner(System.in);

    public void preProgramDrone(Drone drone) {
        drone.setMoves(this.moves);
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void createMove() {
        if (moves.size() == 0) {
            this.createMove(MoveType.TAKEOFF);
        }
        String choose = "";
        while (true) {
            System.out.print("Do you want to add a move (y or n)? > ");
            choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("y")) {
                System.out.print("""
                        Please input the move type and required distance (if needed) by the following example:
                        \tmf,[d]: Move Forward with d distance (example: mf,1.1);
                        \tmb,[d]: Move Backward with d distance (example: mb,1.2);
                        \tmu,[d]: Move Up with d distance (example: mu,1.1);
                        \tmd,[d]: Move Down with d distance (example: md,1.2).
                        >\040""");
                choose = scanner.nextLine();
                String mvType = choose.split(",")[0];
                float distance = Float.parseFloat(choose.split(",")[1]);
                switch (mvType) {
                    case "mf" -> this.createMove(MoveType.MOVE_FORWARD, distance);
                    case "mb" -> this.createMove(MoveType.MOVE_BACKWARD, distance);
                    case "mu" -> this.createMove(MoveType.MOVE_UP, distance);
                    case "md" -> this.createMove(MoveType.MOVE_DOWN, distance);

                }
            } else {
                break;
            }
        }
        this.createMove(MoveType.LAND);

    }


    public void createMove(MoveType moveType) {
        this.moves.add(new Move(moveType, 0));
    }

    public void createMove(MoveType moveType, float distance) {
        this.moves.add(new Move(moveType, distance));
    }

    public void clearMoves() {
        System.out.println("Removed pre-program moves from the remote control.");
        this.moves.clear();
    }

}
