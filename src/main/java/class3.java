import jaggl.OpenGL;
import java.awt.Canvas;

public class class3 {
   public static class848 method2967(Canvas var0, class478 var1, class180 var2, int var3) {
      try {
         boolean var4 = class325.method680();
         if (!var4) {
            throw new RuntimeException("");
         } else if (!class933.method6286(-1548451136).method3930("jaggl", 2093277458)) {
            throw new RuntimeException("");
         } else {
            class977.method1815(var0, (short)29057);
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(var0, 8, 8, 8, 24, 0, var3);
            if (var6 == 0L) {
               throw new RuntimeException("");
            } else {
               class608 var8 = new class608(var5, var0, var6, var1, var2, var3);
               var8.method561();
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw var10;
      } catch (Throwable var11) {
         throw new RuntimeException("");
      }
   }

   class3() throws Throwable {
      throw new Error();
   }
}
