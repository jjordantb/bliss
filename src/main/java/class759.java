public class class759 {
   static class1 field4330 = new class1(32);
   public static int field4331;

   class759() throws Throwable {
      throw new Error();
   }

   static String method2721(String var0, int var1) {
      try {
         if (class273.field10567.startsWith("win")) {
            return var0 + ".dll";
         } else if (class273.field10567.startsWith("linux")) {
            return "lib" + var0 + ".so";
         } else {
            return class273.field10567.startsWith("mac") ? "lib" + var0 + ".dylib" : null;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "t.a(" + ')');
      }
   }

   static final void method2722(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-48);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class614.method5188(var3, var4, var0, (byte)106);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "t.ce(" + ')');
      }
   }

   static final void method2723(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class881.field10166;
         var0.field3161[++var0.field3156 - 1] = class881.field10160;
         var0.field3161[++var0.field3156 - 1] = class881.field10178;
         class881.field10166 = -2;
         class881.field10160 = -1;
         class881.field10178 = -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "t.ahz(" + ')');
      }
   }

   static final void method2724(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = (var2 & 1 << var3) != 0 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "t.zh(" + ')');
      }
   }
}
