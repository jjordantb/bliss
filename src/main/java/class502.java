public class class502 {
   class502() throws Throwable {
      throw new Error();
   }

   static final void method1894(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         if (var0.field3161[var0.field3156] > var0.field3161[var0.field3156 + 1]) {
            var0.field3176 += var0.field3174[var0.field3176];
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "me.aa(" + ')');
      }
   }

   static final void method1895(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         var0.field3161[++var0.field3156 - 1] = class1.method2987(var2, var3, true, (byte)12);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "me.tw(" + ')');
      }
   }

   static final void method1896(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class221.field7347;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "me.wc(" + ')');
      }
   }

   static final void method1897(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3169.field9701;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "me.xu(" + ')');
      }
   }

   static final void method1898(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9133.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "me.aon(" + ')');
      }
   }

   static void method1899(int var0, boolean var1, byte var2) {
      try {
         ItemNode var3 = class213.method3812(var0, var1, 1122460657);
         if (var3 != null) {
            for(int var4 = 0; var4 < var3.itemIds.length; ++var4) {
               var3.itemIds[var4] = -1;
               var3.itemStackSizes[var4] = 0;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "me.u(" + ')');
      }
   }

   static void method1900(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      try {
         if (var0 == var2 && var3 == var1 && var4 == var6 && var5 == var7) {
            class650.method5635(var0, var1, var6, var7, var8, -433526383);
         } else {
            int var10 = var0;
            int var11 = var1;
            int var12 = 3 * var0;
            int var13 = 3 * var1;
            int var14 = var2 * 3;
            int var15 = var3 * 3;
            int var16 = 3 * var4;
            int var17 = 3 * var5;
            int var18 = var6 - var16 + var14 - var0;
            int var19 = var7 - var17 + var15 - var1;
            int var20 = var12 + (var16 - var14 - var14);
            int var21 = var17 - var15 - var15 + var13;
            int var22 = var14 - var12;
            int var23 = var15 - var13;

            for(int var24 = 128; var24 <= 4096; var24 += 128) {
               int var25 = var24 * var24 >> 12;
               int var26 = var24 * var25 >> 12;
               int var27 = var18 * var26;
               int var28 = var26 * var19;
               int var29 = var25 * var20;
               int var30 = var25 * var21;
               int var31 = var24 * var22;
               int var32 = var23 * var24;
               int var33 = var0 + (var27 + var29 + var31 >> 12);
               int var34 = (var32 + var28 + var30 >> 12) + var1;
               class650.method5635(var10, var11, var33, var34, var8, -1007757292);
               var10 = var33;
               var11 = var34;
            }
         }

      } catch (RuntimeException var35) {
         throw class158.method3445(var35, "me.aa(" + ')');
      }
   }
}
