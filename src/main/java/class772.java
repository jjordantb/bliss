import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class class772 extends Canvas {
   Component field3742;

   public final void update(Graphics var1) {
      try {
         this.field3742.update(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajk.update(" + ')');
      }
   }

   static void method2315(int var0) {
      try {
         Class var1 = ClassLoader.class;
         Field var2 = var1.getDeclaredField("nativeLibraries");
         Class var3 = AccessibleObject.class;
         Method var4 = var3.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var4.invoke(var2, Boolean.TRUE);
      } catch (Throwable var5) {
         ;
      }

   }

   public final void paint(Graphics var1) {
      try {
         this.field3742.paint(var1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajk.paint(" + ')');
      }
   }

   class772(Component var1) {
      this.field3742 = var1;
   }
}
