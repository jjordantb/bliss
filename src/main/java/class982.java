public class class982 extends class347 {
   int field3215 = -1384673280;
   static int field3216 = 4096;

   void method209(int var1, class907 var2, byte var3) {
      try {
         if (var1 == 0) {
            this.field3215 = var2.method6374() * 1334499193;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agb.r(" + ')');
      }
   }

   int[] method1921(int var1) {
      int[] var2 = this.field270.method3546(var1, 750969634);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
         int[] var4 = this.method201(0, var1, -1887337990);
         int[] var5 = this.method201(0, var1 + 1 & class322.field834 * -289063255, -1887337990);

         for(int var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
            int var7 = 585425609 * this.field3215 * (var5[var6] - var3[var6]);
            int var8 = 585425609 * this.field3215 * (var4[var6 + 1 & class322.field829 * -901777799] - var4[var6 - 1 & -901777799 * class322.field829]);
            int var9 = var8 >> 12;
            int var10 = var7 >> 12;
            int var11 = var9 * var9 >> 12;
            int var12 = var10 * var10 >> 12;
            int var13 = (int)(Math.sqrt((double)((float)(var11 + var12 + 4096) / 4096.0F)) * 4096.0D);
            int var14 = var13 != 0 ? 16777216 / var13 : 0;
            var2[var6] = 4096 - var14;
         }
      }

      return var2;
   }

   public class982() {
      super(1, true);
   }

   int[] method1922(int var1) {
      int[] var2 = this.field270.method3546(var1, 287257269);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
         int[] var4 = this.method201(0, var1, -1887337990);
         int[] var5 = this.method201(0, var1 + 1 & class322.field834 * -289063255, -1887337990);

         for(int var6 = 0; var6 < -1474554145 * class322.field831; ++var6) {
            int var7 = 585425609 * this.field3215 * (var5[var6] - var3[var6]);
            int var8 = 585425609 * this.field3215 * (var4[var6 + 1 & class322.field829 * -901777799] - var4[var6 - 1 & -901777799 * class322.field829]);
            int var9 = var8 >> 12;
            int var10 = var7 >> 12;
            int var11 = var9 * var9 >> 12;
            int var12 = var10 * var10 >> 12;
            int var13 = (int)(Math.sqrt((double)((float)(var11 + var12 + 4096) / 4096.0F)) * 4096.0D);
            int var14 = var13 != 0 ? 16777216 / var13 : 0;
            var2[var6] = 4096 - var14;
         }
      }

      return var2;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 377633232);
         if (this.field270.field6612) {
            int[] var4 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
            int[] var5 = this.method201(0, var1, -1887337990);
            int[] var6 = this.method201(0, var1 + 1 & class322.field834 * -289063255, -1887337990);

            for(int var7 = 0; var7 < -1474554145 * class322.field831; ++var7) {
               int var8 = 585425609 * this.field3215 * (var6[var7] - var4[var7]);
               int var9 = 585425609 * this.field3215 * (var5[var7 + 1 & class322.field829 * -901777799] - var5[var7 - 1 & -901777799 * class322.field829]);
               int var10 = var9 >> 12;
               int var11 = var8 >> 12;
               int var12 = var10 * var10 >> 12;
               int var13 = var11 * var11 >> 12;
               int var14 = (int)(Math.sqrt((double)((float)(var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
               int var15 = var14 != 0 ? 16777216 / var14 : 0;
               var3[var7] = 4096 - var15;
            }
         }

         return var3;
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "agb.i(" + ')');
      }
   }

   void method1923(int var1, class907 var2) {
      if (var1 == 0) {
         this.field3215 = var2.method6374() * 1334499193;
      }

   }

   void method1924(int var1, class907 var2) {
      if (var1 == 0) {
         this.field3215 = var2.method6374() * 1334499193;
      }

   }
}
