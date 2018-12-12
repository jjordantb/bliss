import java.awt.Frame;

public class class701 extends class568 {
   public class513 field3364;
   int field3365;
   static int field3366;
   public int field3367;
   static int field3368 = 0;
   class643 field3369;
   static class701[] field3370 = new class701[300];
   public static Frame field3371;

   public void method1972(int var1) {
      try {
         if (field3368 < field3370.length) {
            field3370[++field3368 - 1] = this;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abu.p(" + ')');
      }
   }

   public static final void method1973(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (var2 < 1) {
            var2 = 1;
         }

         if (var3 < 1) {
            var3 = 1;
         }

         int var6 = var3 - 334;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 100) {
            var6 = 100;
         }

         int var7 = class730.field2910 + (class730.field2911 - class730.field2910) * var6 / 100;
         int var8 = var3 * var7 * 512 / (var2 * 334);
         int var9;
         int var10;
         short var12;
         if (var8 < class730.field2916) {
            var12 = class730.field2916;
            var7 = var2 * var12 * 334 / (512 * var3);
            if (var7 > class730.field2724) {
               var7 = class730.field2724;
               var9 = var3 * var7 * 512 / (var12 * 334);
               var10 = (var2 - var9) / 2;
               if (var4) {
                  class593.field1623.method4827();
                  class593.field1623.method4833(var0, var1, var10, var3, -16777216, (byte)7);
                  class593.field1623.method4833(var2 + var0 - var10, var1, var10, var3, -16777216, (byte)7);
               }

               var0 += var10;
               var2 -= var10 * 2;
            }
         } else if (var8 > class730.field2917) {
            var12 = class730.field2917;
            var7 = var2 * var12 * 334 / (var3 * 512);
            if (var7 < class730.field2821) {
               var7 = class730.field2821;
               var9 = var2 * var12 * 334 / (var7 * 512);
               var10 = (var3 - var9) / 2;
               if (var4) {
                  class593.field1623.method4827();
                  class593.field1623.method4833(var0, var1, var2, var10, -16777216, (byte)7);
                  class593.field1623.method4833(var0, var1 + var3 - var10, var2, var10, -16777216, (byte)7);
               }

               var1 += var10;
               var3 -= var10 * 2;
            }
         }

         class730.field2922 = var7 * var3 / 334;
         class730.field2918 = var0;
         class730.field2728 = var1;
         class730.field2645 = (short)var2;
         class730.field2921 = (short)var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "abu.iy(" + ')');
      }
   }
}
