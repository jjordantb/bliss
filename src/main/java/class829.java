public class class829 extends Node {
   int field9040;
   String field9041;

   static final void method5359(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class904.field10357 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abp.amd(" + ')');
      }
   }

   static final String method5360(String var0, String var1, String var2, int var3) {
      try {
         for(int var4 = var0.indexOf(var1); var4 != -1; var4 = var0.indexOf(var1, var4 + var2.length())) {
            var0 = var0.substring(0, var4) + var2 + var0.substring(var4 + var1.length());
         }

         return var0;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "abp.i(" + ')');
      }
   }
}
