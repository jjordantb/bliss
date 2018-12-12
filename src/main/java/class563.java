public final class class563 extends class568 {
   int field1067;
   int field1068;
   public int field1069;
   int field1070;
   public static class373 field1071 = new class373();
   int field1072;
   int field1073;
   public int field1074;
   int field1075;
   int field1076;
   class552 field1077;
   boolean field1078 = true;
   boolean field1079 = false;
   int field1080;
   public static class373 field1081 = new class373();
   static long field1082 = 2843605614692854059L;
   public static int field1083;

   public static int method861(int var0, int var1, boolean var2, boolean var3, int var4) {
      try {
         class163 var5 = class213.method3812(var0, var3, 1819104649);
         if (var5 == null) {
            return 0;
         } else {
            int var6 = 0;

            for(int var7 = 0; var7 < var5.field6619.length; ++var7) {
               if (var5.field6619[var7] >= 0 && var5.field6619[var7] < -888767613 * class85.field1121.field2328) {
                  class518 var8 = class85.field1121.method1566(var5.field6619[var7]);
                  int var9 = var8.method2683(var1, class452.field7216.method5148(var1, 1149077752).field3822 * -388931549, -2139054269);
                  if (var2) {
                     var6 += var5.field6620[var7] * var9;
                  } else {
                     var6 += var9;
                  }
               }
            }

            return var6;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aab.p(" + ')');
      }
   }

   static void method862(int var0, int var1, byte var2) {
      try {
         class682 var3 = class370.method881(5, (long)var0);
         var3.method4340((byte)35);
         var3.field7687 = var1 * 1274450087;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aab.az(" + ')');
      }
   }
}
