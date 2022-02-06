public class Drone implements Movement {

    final private String name;
    private Flight flight;

    /**
     * Constructor
     *
     * @param name of the drone
     */
    public Drone(String name) {
        this.name = name;
    }

    /**
     * Name getter
     *
     * @return drone name
     */
    public String getName() {
        return this.name;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public void execute() {
        for (Trick trick : flight.getTricks()) {
            trick.execute();
        }
    }
}
