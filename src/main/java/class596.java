public class class596 {
   int field2140 = 377229199;
   static int field2141;
   int[] field2142;
   class346 field2143;
   long[] field2144;
   Object[] field2145;
   static int field2146;

   public static int method1456(int var0, int var1, int var2, int var3) {
      try {
         var2 &= 3;
         if (var2 == 0) {
            return var0;
         } else if (var2 == 1) {
            return var1;
         } else {
            return 2 == var2 ? 7 - var0 : 7 - var1;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qr.a(" + ')');
      }
   }
}
