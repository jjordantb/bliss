import java.awt.*;

public final class MyCanvas extends Canvas {

    private final PaintHandler paintHandler = new PaintHandler();

    @Override
    public Graphics getGraphics() {
        return this.paintHandler.run(super.getGraphics());
    }

}
