public abstract class class106 extends class568 {
   abstract void method168(InputStream var1, int var2);

   abstract void method170(class420 var1, byte var2);

   static final void method173(class744 var0, byte var1) {
      try {
         var0.field3156 -= 3;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[2 + var0.field3156];
         class564 var5 = class449.method3756(var4, (byte)7);
         class317.method470(var5, var2, var3, 1882686738);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aby.sq(" + ')');
      }
   }
}
