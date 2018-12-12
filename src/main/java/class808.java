public class class808 {
   static short field4596;
   public static class180 field4597;
   public static class247 field4598;

   class808() throws Throwable {
      throw new Error();
   }

   static final void method2889(class744 var0, byte var1) {
      try {
         class22.method3439(var0.field3161[--var0.field3156], 255, 50, 36344261);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ca.ss(" + ')');
      }
   }

   static final void method2890(class744 var0, short var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         int var3 = var0.field3161[--var0.field3156];
         class725.method1747(var2, var3, 1245128483);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ca.vr(" + ')');
      }
   }

   static final void method2892(class513 var0, int var1) {
      try {
         var0.method2650(1910675333);
         int var2 = class730.field2623;
         Player var3 = class923.local = class730.loaded[var2] = new Player(class730.field2697.method5317(-1611682495));
         var3.field4028 = var2;
         int var4 = var0.method2647(30);
         byte var5 = (byte)(var4 >> 28);
         int var6 = var4 >> 14 & 16383;
         int var7 = var4 & 16383;
         class389 var8 = class730.field2697.method5270(681479919);
         var3.field4085[0] = var6 - var8.field1521;
         var3.field4055[0] = var7 - var8.field1522;
         var3.method1515((float)((var3.field4085[0] << 9) + (var3.method2550() << 8)), var3.method1517().field7637.field5300, (float)((var3.field4055[0] << 9) + (var3.method2550() << 8)));
         class899.field9552 = var3.field3639 = var3.field3640 = var5;
         if (class730.field2697.method5296(1740552362).method3386(var3.field4085[0], var3.field4055[0], -14939637)) {
            ++var3.field3640;
         }

         if (class498.field8106[var2] != null) {
            var3.method1990(class498.field8106[var2], (byte)3);
         }

         class498.field8102 = 0;
         class498.field8108[++class498.field8102 - 1] = var2;
         class498.field8104[var2] = 0;
         class498.field8103 = 0;

         for(int var9 = 1; var9 < 2048; ++var9) {
            if (var2 != var9) {
               int var10 = var0.method2647(18);
               int var11 = var10 >> 16;
               int var12 = var10 >> 8 & 255;
               int var13 = var10 & 255;
               class370 var14 = class498.field8111[var9] = new class370();
               var14.field1095 = (var12 << 14) + (var11 << 28) + var13;
               var14.field1093 = 0;
               var14.field1092 = -1;
               var14.field1094 = false;
               var14.field1096 = false;
               class498.field8107[++class498.field8103 - 1] = var9;
               class498.field8104[var9] = 0;
            }
         }

         var0.method2648((byte)109);
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "ca.a(" + ')');
      }
   }

   static final void method2893(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9116.method1098(-254007730);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ca.ajh(" + ')');
      }
   }

   public static boolean method2894(CharSequence var0, int var1) {
      try {
         return class978.method1844(var0, 10, true, -1628070489);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ca.b(" + ')');
      }
   }
}
