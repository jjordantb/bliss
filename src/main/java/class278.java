public class class278 {
   static int field10600 = 0;
   int[] field10601;
   static int field10602 = 2;
   int[] field10603;

   class278(class907 var1) {
      int var2 = var1.method6382(1723054621);
      this.field10601 = new int[var2];
      this.field10603 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1.method6371();
         this.field10601[var3] = var4;
         int var5 = var1.method6374();
         int var6 = var1.method6374();
         this.field10603[var3] = var6 + (var5 << 16);
      }

   }

   void method6625(class283 var1, int var2, int var3) {
      try {
         int var4 = this.field10603[0];
         var1.method6638(var2, var4 >>> 16, var4 & '\uffff', -1002380279);
         class746 var5 = var1.method6636(1609800550);
         var5.field4084 = 0;

         for(int var6 = this.field10601.length - 1; var6 >= 0; --var6) {
            int var7 = this.field10601[var6];
            int var8 = this.field10603[var6];
            var5.field4085[var5.field4084 * 2050671733] = var8 >> 16;
            var5.field4055[2050671733 * var5.field4084] = var8 & '\uffff';
            byte var9 = class647.field9228.field9230;
            if (var7 == 0) {
               var9 = class647.field9233.field9230;
            } else if (2 == var7) {
               var9 = class647.field9229.field9230;
            }

            var5.field4074[var5.field4084 * 2050671733] = var9;
            var5.field4084 += -1013322787;
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "df.a(" + ')');
      }
   }

   public static class562 method6626(class907 var0, short var1) {
      try {
         int var2 = var0.method6423(1235052657);
         class971 var3 = class812.method2915((byte)44)[var0.method6371()];
         class49 var4 = class147.method1146(126968516)[var0.method6371()];
         int var5 = var0.method6367(1556136554);
         int var6 = var0.method6367(1903752417);
         return new class562(var2, var3, var4, var5, var6);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "df.a(" + ')');
      }
   }

   static final void method6627(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)76);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field887 * 457937409;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "df.qn(" + ')');
      }
   }

   static final void method6628(byte var0) {
      try {
         for(class356 var1 = (class356) Client.field2762.method5210((byte)3); var1 != null; var1 = (class356) Client.field2762.method5210((byte)3)) {
            class76.method1112(var1, -1638035740);
         }

         byte var5 = 0;
         byte var2 = 3;
         int var3;
         if (Client.field2705 * 1596783995 == 0) {
            for(var3 = var5; var3 <= var2; ++var3) {
               Client.method1757(var3);
            }

            Client.method1759();
         } else {
            Client.method1755();

            for(var3 = var5; var3 <= var2; ++var3) {
               Client.method1767();
               Client.method1756(var3);
               Client.method1757(var3);
            }

            Client.method1758();
            Client.method1759();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "df.ii(" + ')');
      }
   }

   static final void method6629(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         var0.field3156 -= -783761378;
         int var3 = var0.field3161[681479919 * var0.field3156];
         int var4 = var0.field3161[681479919 * var0.field3156 + 1];
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var2.substring(var3, var4);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "df.aas(" + ')');
      }
   }
}
