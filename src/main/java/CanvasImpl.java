import java.awt.*;

public final class CanvasImpl extends Canvas {

    private final PaintHandler paintHandler = new PaintHandler();

    Component field3742;

    CanvasImpl(Component var1) {
        this.field3742 = var1;
    }

    public final void update(Graphics var1) {
        try {
            this.field3742.update(var1);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajk.update(" + ')');
        }
    }

    @Override
    public Graphics getGraphics() {
        return this.paintHandler.run(super.getGraphics());
    }

    public final void paint(Graphics var1) {
        try {
            this.field3742.paint(var1);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajk.paint(" + ')');
        }
    }

}
