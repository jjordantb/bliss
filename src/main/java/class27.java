public class class27 {
   public String field6485;
   public String field6486;
   static class180 field6487;
   public static class180 field6488;

   void method3466(class501 var1, int var2) {
      try {
         this.field6486 = var1.method1905(1509343502);
         this.field6485 = var1.method1905(1509343502);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ey.a(" + ')');
      }
   }

   public static class980 method3467(InputStream var0, byte var1) {
      try {
         String var2 = var0.method6379(-564007296);
         class971 var3 = class812.method2915((byte)112)[var0.method6371()];
         class49 var4 = class147.method1146(722680550)[var0.method6371()];
         int var5 = var0.method6367(1872216088);
         int var6 = var0.method6367(2093452439);
         int var7 = var0.method6371();
         int var8 = var0.method6371();
         int var9 = var0.method6371();
         int var10 = var0.method6374();
         int var11 = var0.method6374();
         int var12 = var0.method6423(1235052657);
         int var13 = var0.method6420((byte)69);
         int var14 = var0.method6420((byte)57);
         return new class980(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "ey.a(" + ')');
      }
   }

   public static final synchronized long resetTimer(byte var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < class323.field629) {
            class323.field628 += class323.field629 - var1;
         }

         class323.field629 = var1;
         return class323.field628 + var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ey.a(" + ')');
      }
   }

   static final void method3469(Actor var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         int var10 = var1.method2555((byte)1);
         if (var10 != -1) {
            Object var11 = null;
            class48 var12 = (class48)class730.field2678.method2974((long)var10);
            if (var12 == null) {
               class922[] var13 = class922.method6248(class562.field827, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class593.field1623.method4982(var13[0], true);
               class730.field2678.method2984(var12, (long)var10);
            }

            class32 var18 = var0.method1511().field7637;
            class176.method3171(var0.field3639, (int)var18.field5296, (int)var18.field5299, var0.method2550() * 256, 0, false, 2131920659);
            int var14 = (int)((float)var3 + class730.field2873[0] - 18.0F);
            int var15 = (int)((float)var4 + class730.field2873[1] - 16.0F - 54.0F);
            var14 += var2 / 4 * 18;
            var15 += 18 * (var2 % 4);
            var12.method3128(var14, var15);
            if (var0 == var1) {
               class593.field1623.method4832(var14 - 1, var15 - 1, 18, 18, -256, -769094548);
            }

            class356 var16 = class791.method396((byte)60);
            var16.field1794 = var1;
            var16.field1793 = var14;
            var16.field1797 = var15;
            var16.field1798 = var14 + 16;
            var16.field1799 = var15 + 16;
            class730.field2762.method5209(var16, -69122600);
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "ey.jp(" + ')');
      }
   }

   static final void method3470(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9114.method5154((byte)92);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ey.akg(" + ')');
      }
   }

   static final void method3471(class744 var0, short var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         var0.field3161[++var0.field3156 - 1] = var2 < var3 ? var2 : var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ey.or(" + ')');
      }
   }
}
