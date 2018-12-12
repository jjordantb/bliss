import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class CanvasImpl extends Canvas {
   Component field3742;

   public final void update(Graphics var1) {
      try {
         this.field3742.update(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajk.update(" + ')');
      }
   }

    @Override
    public Graphics getGraphics() {
        return super.getGraphics();
    }

    public final void paint(Graphics var1) {
      try {
         this.field3742.paint(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajk.paint(" + ')');
      }
   }

   CanvasImpl(Component var1) {
      this.field3742 = var1;
   }
}
