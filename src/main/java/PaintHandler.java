import java.awt.*;
import java.awt.image.BufferedImage;


/**
 * Handles all painting of the canvas
 *
 * @author Parametric
 */
public class PaintHandler {

    private final BufferedImage gameBuffer, paintBuffer;
    private String error = null;

    public PaintHandler() {
        this.gameBuffer = new BufferedImage(765, 503, BufferedImage.TYPE_INT_ARGB);
        this.paintBuffer = new BufferedImage(765, 503, BufferedImage.TYPE_INT_ARGB);
    }


    /**
     * Handle the double buffering of the canvas drawing
     *
     * @param g2 the graphics object to draw on
     * @return the graphics object that was drawn on
     */
    public Graphics run(final Graphics g2) {
        // Double buffering
        Graphics gg = this.paintBuffer.getGraphics();
        gg.drawImage(this.gameBuffer, 0, 0, null);
        // draw on all paint handlers
        try {
            Loader.paintCallback(gg);
        } catch (Exception e) {
            e.printStackTrace();
            if (error == null || !error.equals(e.getMessage())) {
                error = e.getMessage();
            }
        }
        gg.dispose();

        final Graphics g = g2.create();
        if (g != null) {
            g.drawImage(this.paintBuffer, 0, 0, null);
            g.dispose();
        }

        return this.gameBuffer.getGraphics();
    }

}
