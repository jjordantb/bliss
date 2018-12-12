import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class797 extends class770 implements class297 {
   long field474;

   public native void method6550(boolean var1);

   class797(class955 var1) {
   }

   static void method413(int var0) {
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

   public native void method6551(boolean var1);
}
