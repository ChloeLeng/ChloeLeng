public class CaptureThing {
    private boolean isFocus;
    private String name;

    public CaptureThing(String name) {
        this.name = name;
    }

    public boolean isFocus() {
        return isFocus;
    }

    public void setFocus(boolean focus) {
        isFocus = focus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
