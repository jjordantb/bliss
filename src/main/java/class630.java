import java.util.Iterator;

public class class630 extends class568 {
   int field9804;
   int field9805;

   class630(int var1, int var2) {
      this.field9804 = var1;
      this.field9805 = var2;
   }

   public static void method5890(short var0) {
      try {
         class198.field7047 = new class6(8);
         class198.field7048 = 0;
         Iterator var1 = class198.field7046.iterator();

         while(var1.hasNext()) {
            class726 var2 = (class726)var1.next();
            var2.method1723();
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abl.p(" + ')');
      }
   }

   static final void method5891(class744 var0, short var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-1);
         var0.field3161[++var0.field3156 - 1] = var3.field893;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abl.rj(" + ')');
      }
   }

   static void method5892(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         int var8 = 0;
         int var9 = var3;
         int var10 = 0;
         int var11 = var2 - var6;
         int var12 = var3 - var6;
         int var13 = var2 * var2;
         int var14 = var3 * var3;
         int var15 = var11 * var11;
         int var16 = var12 * var12;
         int var17 = var14 << 1;
         int var18 = var13 << 1;
         int var19 = var16 << 1;
         int var20 = var15 << 1;
         int var21 = var3 << 1;
         int var22 = var12 << 1;
         int var23 = (1 - var21) * var13 + var17;
         int var24 = var14 - (var21 - 1) * var18;
         int var25 = (1 - var22) * var15 + var19;
         int var26 = var16 - (var22 - 1) * var20;
         int var27 = var13 << 2;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 * 3;
         int var32 = (var21 - 3) * var18;
         int var33 = 3 * var19;
         int var34 = (var22 - 3) * var20;
         int var35 = var28;
         int var36 = (var3 - 1) * var27;
         int var37 = var30;
         int var38 = (var12 - 1) * var29;
         int[] var39 = class381.field1412[var1];
         class484.method4769(var39, var0 - var2, var0 - var11, var5, 1244145704);
         class484.method4769(var39, var0 - var11, var11 + var0, var4, -1835753044);
         class484.method4769(var39, var11 + var0, var2 + var0, var5, 1505074315);

         while(var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
               if (var25 < 0) {
                  while(var25 < 0) {
                     var25 += var33;
                     var26 += var37;
                     var33 += var30;
                     var37 += var30;
                     ++var10;
                  }
               }

               if (var26 < 0) {
                  var25 += var33;
                  var26 += var37;
                  var33 += var30;
                  var37 += var30;
                  ++var10;
               }

               var25 += -var38;
               var26 += -var34;
               var34 -= var29;
               var38 -= var29;
            }

            if (var23 < 0) {
               while(var23 < 0) {
                  var23 += var31;
                  var24 += var35;
                  var31 += var28;
                  var35 += var28;
                  ++var8;
               }
            }

            if (var24 < 0) {
               var23 += var31;
               var24 += var35;
               var31 += var28;
               var35 += var28;
               ++var8;
            }

            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            --var9;
            int var41 = var1 - var9;
            int var42 = var1 + var9;
            int var43 = var0 + var8;
            int var44 = var0 - var8;
            if (var40) {
               int var45 = var10 + var0;
               int var46 = var0 - var10;
               class484.method4769(class381.field1412[var41], var44, var46, var5, -1836919463);
               class484.method4769(class381.field1412[var41], var46, var45, var4, -2035540755);
               class484.method4769(class381.field1412[var41], var45, var43, var5, -981316535);
               class484.method4769(class381.field1412[var42], var44, var46, var5, -235264647);
               class484.method4769(class381.field1412[var42], var46, var45, var4, -955018458);
               class484.method4769(class381.field1412[var42], var45, var43, var5, 614343007);
            } else {
               class484.method4769(class381.field1412[var41], var44, var43, var5, 2012650318);
               class484.method4769(class381.field1412[var42], var44, var43, var5, -1092242835);
            }
         }

      } catch (RuntimeException var47) {
         throw class158.method3445(var47, "abl.ad(" + ')');
      }
   }
}
