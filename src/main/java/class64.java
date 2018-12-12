public class class64 {
   public int[] field1684;
   public int field1685;
   public int[] field1686;

   public class64(int var1) {
      this.field1685 = 526813095 * var1;
      this.field1684 = new int[this.field1685 * -1407078377];
      this.field1686 = new int[this.field1685 * -1407078377];
   }

   static final void method1261(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class282 var3 = class906.field10363.method2713(var2, (short)-22209);
         if (var3.field10617 == null) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field10617.length;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mi.acn(" + ')');
      }
   }

   public static long method1262(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         class308.field418.clear();
         class308.field418.set(var5, var4, var3, var2, var1, var0);
         return class308.field418.getTime().getTime();
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "mi.x(" + ')');
      }
   }

   static final void method1263(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9127.method4421(-919235605) == 1 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mi.ajl(" + ')');
      }
   }

   static final void method1264(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[var0.field3176 * 1883543357];
         var0.field3158 -= var2 * 969361751;
         String var3 = class23.method3428(var0.field3157, -203050393 * var0.field3158, var2, (byte)0);
         var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mi.aw(" + ')');
      }
   }

   static final void method1265(class744 var0, byte var1) {
      try {
         var0.field3158 -= 1938723502;
         var0.field3156 -= -783761378;
         class637.method5939((String)var0.field3157[var0.field3158 * -203050393], (String)var0.field3157[-203050393 * var0.field3158 + 1], var0.field3161[var0.field3156 * 681479919], 1 == var0.field3161[1 + 681479919 * var0.field3156], -1761866879);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mi.age(" + ')');
      }
   }

   static void method1266(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = 0;
         int var7 = var3;
         int var8 = var2 * var2;
         int var9 = var3 * var3;
         int var10 = var9 << 1;
         int var11 = var8 << 1;
         int var12 = var3 << 1;
         int var13 = (1 - var12) * var8 + var10;
         int var14 = var9 - var11 * (var12 - 1);
         int var15 = var8 << 2;
         int var16 = var9 << 2;
         int var17 = var10 * ((var6 << 1) + 3);
         int var18 = var11 * ((var3 << 1) - 3);
         int var19 = var16 * (1 + var6);
         int var20 = var15 * (var3 - 1);
         int var21;
         int var22;
         if (var1 >= class465.field1414 * 1155384281 && var1 <= class465.field1415 * -1062447355) {
            var21 = class972.method1776(var2 + var0, class465.field1416 * -1424479739, class465.field1413 * 1135094847, -1212608691);
            var22 = class972.method1776(var0 - var2, class465.field1416 * -1424479739, class465.field1413 * 1135094847, -1212608691);
            class484.method4769(class465.field1412[var1], var22, var21, var4, 1327265891);
         }

         while(var7 > 0) {
            if (var13 < 0) {
               while(var13 < 0) {
                  var13 += var17;
                  var14 += var19;
                  var17 += var16;
                  var19 += var16;
                  ++var6;
               }
            }

            if (var14 < 0) {
               var13 += var17;
               var14 += var19;
               var17 += var16;
               var19 += var16;
               ++var6;
            }

            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            --var7;
            var21 = var1 - var7;
            var22 = var7 + var1;
            if (var22 >= class465.field1414 * 1155384281 && var21 <= class465.field1415 * -1062447355) {
               int var23 = class972.method1776(var0 + var6, -1424479739 * class465.field1416, 1135094847 * class465.field1413, -1212608691);
               int var24 = class972.method1776(var0 - var6, -1424479739 * class465.field1416, class465.field1413 * 1135094847, -1212608691);
               if (var21 >= 1155384281 * class465.field1414) {
                  class484.method4769(class465.field1412[var21], var24, var23, var4, -2141002125);
               }

               if (var22 <= -1062447355 * class465.field1415) {
                  class484.method4769(class465.field1412[var22], var24, var23, var4, 1394048143);
               }
            }
         }

      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "mi.ah(" + ')');
      }
   }
}
