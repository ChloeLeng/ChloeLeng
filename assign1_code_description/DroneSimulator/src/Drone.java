import java.util.List;

public class Drone implements CaptureActions {
    private List<Move> moves;

    public Drone() {
    }

    public Drone(List<Move> moves) {
        this.moves = moves;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    @Override
    public void capturePicture(Format format, String fileName) {
        System.out.printf("Store on %s with %s format.%n", fileName, format);
    }

    @Override
    public void focus(CaptureThing captureThing, Format format, String fileName) {
        captureThing.setFocus(true);
        System.out.printf("Focusing on %s%n", captureThing.getName());
        if (captureThing.isFocus()) {
            System.out.printf("%s is focused.%n", captureThing.getName());
            System.out.printf("Capturing for %s%n", captureThing.getName());
            this.capturePicture(format, fileName);
        }
    }

    public void droneFly() {
        System.out.println();
        for (Move move : this.moves) {
            move.action();
        }
        System.out.println();
    }
}
