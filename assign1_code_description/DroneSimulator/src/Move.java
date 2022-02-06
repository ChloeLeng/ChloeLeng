public class Move implements MoveActions {
    private MoveType moveType;
    private float distance;

    public Move(MoveType moveType, float distance) {
        this.moveType = moveType;
        this.distance = distance;
    }

    public void action() {
        switch (this.moveType) {
            case TAKEOFF -> this.takeOff();
            case MOVE_FORWARD -> this.moveForward(distance);
            case MOVE_BACKWARD -> this.moveBackwards(distance);
            case MOVE_UP -> this.moveUp(distance);
            case MOVE_DOWN -> this.moveDown(distance);
            case LAND -> this.land();
            default -> System.out.println("Invalid Move!");
        }
    }


    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public void takeOff() {
        System.out.println("Taking Off.");
    }

    @Override
    public void land() {
        System.out.println("Landing.");
    }

    @Override
    public void moveForward(float distance) {
        System.out.printf("Moving forward with %.2f meter.%n", distance);
    }

    @Override
    public void moveBackwards(float distance) {
        System.out.printf("Moving backward with %.2f meter.%n", distance);
    }

    @Override
    public void moveUp(float distance) {
        System.out.printf("Moving up with %.2f meter.%n", distance);
    }

    @Override
    public void moveDown(float distance) {
        System.out.printf("Moving down with %.2f meter.%n", distance);
    }
}
