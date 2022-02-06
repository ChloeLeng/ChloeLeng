import java.util.*;

public class RemoteControl {
    private List<Flight> flights;
    private String basedSortType;
    private final Scanner scanner = new Scanner(System.in);

    public RemoteControl(List<Flight> flights) {
        this.flights = flights;
    }

    public RemoteControl() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public String getBasedSortType() {
        return basedSortType;
    }

    public void setBasedSortType(String basedSortType) {
        this.basedSortType = basedSortType;
        Direction direction = null;
        switch (basedSortType) {
            case "uu" -> direction = Direction.UP;
            case "ud" -> direction = Direction.DOWN;
            case "uf" -> direction = Direction.FORWARD;
            case "ub" -> direction = Direction.BACKWARD;
            case "ur" -> direction = Direction.RIGHT;
            case "ul" -> direction = Direction.LEFT;
        }
        for (Flight flight : this.flights) {
            flight.getUniqueDirectionCounter(direction);
        }
        this.sortByNumbers();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void sortByNumbers() {
        this.flights.sort((flight, flight1) -> {
            int score1 = flight.getCounter();
            int score2 = flight1.getCounter();
            return Objects.compare(score1, score2, Comparator.naturalOrder());
        });
    }

    public void chooseSortType() {
        String choose = "";
        while (true) {
            System.out.print("Do you want to add a move (y or n)? > ");
            choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("y")) {
                System.out.print("""
                        Please input the sorted type:
                        \tnt: number of tricks;
                        \tuu: number of unique up;
                        \tud: number of unique down;
                        \tuf: number of unique forward;
                        \tub: number of unique backward;
                        \tur: number of unique right;
                        \tul: number of unique left.
                        >\040""");
                choose = scanner.nextLine();
                Direction direction = null;
                this.setBasedSortType(choose);

            } else {
                break;
            }

        }

    }

    public static void main(String[] args) {

    }
}
