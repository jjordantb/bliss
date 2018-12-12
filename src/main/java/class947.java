import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class947 extends RuntimeException {
   static class180 field3314;
   static class403[] field3315;

   static void method1942(int var0) {
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
}
