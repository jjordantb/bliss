public class class904 {
   static int field10352 = 0;
   static int field10353 = 3;
   static int field10354 = 0;
   static class51 field10355;
   static class235 field10356;
   public static boolean field10357;

   class904() throws Throwable {
      throw new Error();
   }

   static final void method6335(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field973;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "z.pa(" + ')');
      }
   }

   public static int method6336(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) - var3 + var0.charAt(var4);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "z.q(" + ')');
      }
   }

   static final void method6337(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9127.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "z.aoe(" + ')');
      }
   }
}
