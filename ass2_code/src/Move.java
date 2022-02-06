import java.util.Locale;

public class Move implements MoveActions, Movement {
    private Direction direction;
    private float distance;
    private Speed speed;

    public Move(Direction direction, float distance, Speed speed) {
        this.direction = direction;
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public void execute() {
        switch (this.direction) {
//            case TAKEOFF -> this.takeOff();
            case FORWARD -> this.moveForward(distance, speed);
            case BACKWARD -> this.moveBackwards(distance, speed);
            case UP -> this.moveUp(distance, speed);
            case DOWN -> this.moveDown(distance, speed);
            case RIGHT -> this.moveDown(distance, speed);
            case LEFT -> this.moveDown(distance, speed);
//            case LAND -> this.land();
            default -> System.out.println("Invalid Move!");
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

//
//    @Override
//    public void takeOff() {
//        System.out.println("Taking Off.");
//    }
//
//    @Override
//    public void land() {
//        System.out.println("Landing.");
//    }

    @Override
    public void moveForward(float distance, Speed speed) {
        System.out.println(getStringSimulator("forward"));
    }

    @Override
    public void moveBackwards(float distance, Speed speed) {
        System.out.println(getStringSimulator("backward"));
    }

    @Override
    public void moveUp(float distance, Speed speed) {
        System.out.println(getStringSimulator("up"));
    }

    @Override
    public void moveDown(float distance, Speed speed) {
        System.out.println(getStringSimulator("down"));

    }

    @Override
    public void moveRight(float distance, Speed speed) {
        System.out.println(getStringSimulator("right"));
    }

    @Override
    public void moveLeft(float distance, Speed speed) {
        System.out.println(getStringSimulator("left"));
    }

    private String getStringSimulator(String direction) {
        return String.format("Move %s %.2f distance at %s speed", direction, distance, speed.name().toLowerCase(Locale.ROOT));

    }
}
