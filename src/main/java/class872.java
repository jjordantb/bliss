import java.applet.Applet;
import netscape.javascript.JSObject;

public class class872 {
   public static void method5893(Applet var0, String var1, int var2) throws Throwable {
      try {
         JSObject.getWindow(var0).eval(var1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tf.a(" + ')');
      }
   }

   public static Object method5894(Applet var0, String var1, short var2) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, (Object[])null);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "tf.f(" + ')');
      }
   }

   public static Object method5895(Applet var0, String var1, Object[] var2, byte var3) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, var2);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "tf.b(" + ')');
      }
   }

   class872() throws Throwable {
      throw new Error();
   }
}
