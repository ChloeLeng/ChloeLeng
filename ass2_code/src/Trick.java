import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Trick implements Movement {
    private String trickName;
    private List<Move> moves;
    private boolean isRecord;
    private Format format;

    public String getTrickName() {
        return trickName;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    public Trick(String trickName) {
        this.trickName = trickName;
        this.moves = new ArrayList<>();
    }

    public void addMove(Move move) {
        this.moves.add(move);
    }

    public Trick(List<Move> moves) {
        this.moves = moves;
    }

    public Trick(List<Move> moves, boolean isRecord) {
        this.moves = moves;
        this.isRecord = isRecord;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public boolean isRecord() {
        return isRecord;
    }

    public void setRecord(boolean record) {
        isRecord = record;
    }

    @Override
    public void execute() {
        this.moves.forEach(Move::execute);
        if (this.isRecord) {
            System.out.println("Trick is recorded with " + format.name().toLowerCase(Locale.ROOT));
        }
    }
}
