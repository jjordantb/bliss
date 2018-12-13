import java.awt.Canvas;
import java.awt.Graphics;

public final class MyCanvas extends Canvas {

    private final PaintHandler paintHandler = new PaintHandler();

    @Override
    public Graphics getGraphics() {
        return this.paintHandler.run(super.getGraphics());
    }

}
