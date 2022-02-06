import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String name;
    private List<Trick> tricks;
    private int counter;

    public List<Trick> getTricks() {
        return tricks;
    }

    public Flight(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addTricks(Trick trick) {
        this.tricks.add(trick);
    }

    public void getUniqueDirectionCounter(Direction direction) {
        this.counter = 0;
        if (direction == null) {
            this.getUniqueDirectionCounter();
        } else {
            for (Trick trick : tricks) {
                for (Move move : trick.getMoves()) {
                    if (move.getDirection() == direction) {
                        this.counter += 1;
                    }
                }
            }
        }
    }

    public void getUniqueDirectionCounter() {

        this.setCounter(this.tricks.size());
    }
}
