public interface CaptureActions {

    void capturePicture(Format format, String fileName);

    void focus(CaptureThing captureThing, Format format, String fileName);
}
