import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class class883 extends class749 {
   class325 field10193;

   class883(class325 var1) {
      this.field10193 = var1;
   }

   boolean method2484() {
      this.field10193.method591();
      return true;
   }

   void method2518(int var1, int var2) {
      if (this == this.field10193.method4800((short)-4714)) {
         this.field10193.method576();
      }

   }

   boolean method2486() {
      this.field10193.method591();
      return true;
   }

   static void method6181(int var0) {
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

   void method2519(int var1, int var2) {
      if (this == this.field10193.method4800((short)-20167)) {
         this.field10193.method576();
      }

   }
}
