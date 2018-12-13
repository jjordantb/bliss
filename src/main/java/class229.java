public class class229 implements class311 {
   class180 field8209;
   String field8210;
   static int field8211;
   public static class754 field8212;

   public int method444(int var1) {
      try {
         return this.field8209.method3283(this.field8210, 1689280899) ? 100 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jz.a(" + ')');
      }
   }

   public class972 method448(int var1) {
      try {
         return class972.field2960;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jz.f(" + ')');
      }
   }

   class229(class180 var1, String var2) {
      this.field8209 = var1;
      this.field8210 = var2;
   }

   public static class64 method4579(class180 var0, String var1, boolean var2, int var3) {
      try {
         int var4 = var0.method3281(var1, -912375473);
         if (-1 == var4) {
            return new class64(0);
         } else {
            int[] var5 = var0.method3277(var4, -2131857689);
            class64 var6 = new class64(var5.length);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               while(var7 < var6.field1685) {
                  InputStream var9 = new InputStream(var0.method3285(var4, var5[var8++], (byte)-34));
                  int var10 = var9.method6420((byte)101);
                  int var11 = var9.method6374();
                  int var12 = var9.method6371();
                  if (!var2 && var12 == 1) {
                     --var6.field1685;
                  } else {
                     var6.field1684[var7] = var10;
                     var6.field1686[var7] = var11;
                     ++var7;
                  }
               }

               return var6;
            }
         }
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "jz.a(" + ')');
      }
   }

   static final void method4580(class744 var0, int var1) {
      try {
         class392 var2 = class806.method2843(-1558918044);
         if (var2 == null) {
            var0.field3161[++var0.field3156 - 1] = -1;
            var0.field3161[++var0.field3156 - 1] = -1;
         } else {
            var0.field3161[++var0.field3156 - 1] = var2.field5396;
            int var3 = var2.field5393 << 28 | class491.field7820 + var2.field5395 << 14 | class491.field7813 + var2.field5398;
            var0.field3161[++var0.field3156 - 1] = var3;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jz.adg(" + ')');
      }
   }

   static final void method4581(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2792 && !class730.field2793 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jz.amz(" + ')');
      }
   }

   static class362 method4582(InputStream var0, byte var1) {
      try {
         int var2 = var0.method6371();
         int var3 = var0.method6371();
         return new class362(var2, var3);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jz.p(" + ')');
      }
   }

   public static void method4583(int var0) {
      try {
         class317.method472(2037731231);
         class237.method4658(22050, class615.field8903.field9152.method4766((byte)39) == 1, 2, 1903660565);
         class540.field3925 = class456.method3791(class837.field9161, 0, 22050, -1188056324);
         class396.method3495(true, class342.method220((class272)null, -1296770048), 1539003934);
         class95.field607 = class456.method3791(class837.field9161, 1, 2048, -1833287234);
         class95.field607.method2625(class56.field2321, 2098926435);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "jz.b(" + ')');
      }
   }

   public static void method4584(int var0, byte var1) {
      try {
         Widget.field860.method2976(var0, -450593639);
         Widget.field863.method2976(var0, -631173514);
         Widget.field861.method2976(var0, -826447089);
         Widget.field1021.method2976(var0, -1629354763);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jz.e(" + ')');
      }
   }

   static void method4585(int var0, int var1, int var2, int var3, short var4) {
      try {
         class682 var5 = class370.method881(19, (long)var1 << 32 | (long)var0);
         var5.method4340((byte)2);
         var5.field7687 = var2;
         var5.field7685 = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "jz.bd(" + ')');
      }
   }
}
