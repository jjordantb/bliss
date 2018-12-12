public class class234 extends class347 {
   int field8292 = 1343647744;
   static boolean field8293 = true;
   boolean field8294 = true;
   static int field8295 = 4096;

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)96);
         if (this.field266.field211) {
            int[] var4 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
            int[] var5 = this.method201(0, var1, -1887337990);
            int[] var6 = this.method201(0, var1 + 1 & -289063255 * class322.field834, -1887337990);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];

            for(int var10 = 0; var10 < -1474554145 * class322.field831; ++var10) {
               int var11 = (var6[var10] - var4[var10]) * 347966039 * this.field8292;
               int var12 = this.field8292 * 347966039 * (var5[var10 + 1 & -901777799 * class322.field829] - var5[var10 - 1 & -901777799 * class322.field829]);
               int var13 = var12 >> 12;
               int var14 = var11 >> 12;
               int var15 = var13 * var13 >> 12;
               int var16 = var14 * var14 >> 12;
               int var17 = (int)(Math.sqrt((double)((float)(4096 + var16 + var15) / 4096.0F)) * 4096.0D);
               int var18;
               int var19;
               int var20;
               if (var17 != 0) {
                  var18 = var12 / var17;
                  var19 = var11 / var17;
                  var20 = 16777216 / var17;
               } else {
                  var18 = 0;
                  var19 = 0;
                  var20 = 0;
               }

               if (this.field8294) {
                  var18 = (var18 >> 1) + 2048;
                  var19 = (var19 >> 1) + 2048;
                  var20 = 2048 + (var20 >> 1);
               }

               var7[var10] = var18;
               var8[var10] = var19;
               var9[var10] = var20;
            }
         }

         return var3;
      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "ahx.k(" + ')');
      }
   }

   public class234() {
      super(1, false);
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field8292 = var2.method6374() * 1837433191;
            break;
         case 1:
            this.field8294 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahx.r(" + ')');
      }
   }

   void method4687(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field8292 = var2.method6374() * 1837433191;
         break;
      case 1:
         this.field8294 = var2.method6371() == 1;
      }

   }

   void method4688(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field8292 = var2.method6374() * 1837433191;
         break;
      case 1:
         this.field8294 = var2.method6371() == 1;
      }

   }

   int[][] method4689(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)99);
      if (this.field266.field211) {
         int[] var3 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
         int[] var4 = this.method201(0, var1, -1887337990);
         int[] var5 = this.method201(0, var1 + 1 & -289063255 * class322.field834, -1887337990);
         int[] var6 = var2[0];
         int[] var7 = var2[1];
         int[] var8 = var2[2];

         for(int var9 = 0; var9 < -1474554145 * class322.field831; ++var9) {
            int var10 = (var5[var9] - var3[var9]) * 347966039 * this.field8292;
            int var11 = this.field8292 * 347966039 * (var4[var9 + 1 & -901777799 * class322.field829] - var4[var9 - 1 & -901777799 * class322.field829]);
            int var12 = var11 >> 12;
            int var13 = var10 >> 12;
            int var14 = var12 * var12 >> 12;
            int var15 = var13 * var13 >> 12;
            int var16 = (int)(Math.sqrt((double)((float)(4096 + var15 + var14) / 4096.0F)) * 4096.0D);
            int var17;
            int var18;
            int var19;
            if (var16 != 0) {
               var17 = var11 / var16;
               var18 = var10 / var16;
               var19 = 16777216 / var16;
            } else {
               var17 = 0;
               var18 = 0;
               var19 = 0;
            }

            if (this.field8294) {
               var17 = (var17 >> 1) + 2048;
               var18 = (var18 >> 1) + 2048;
               var19 = 2048 + (var19 >> 1);
            }

            var6[var9] = var17;
            var7[var9] = var18;
            var8[var9] = var19;
         }
      }

      return var2;
   }

   int[][] method4690(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)97);
      if (this.field266.field211) {
         int[] var3 = this.method201(0, var1 - 1 & -289063255 * class322.field834, -1887337990);
         int[] var4 = this.method201(0, var1, -1887337990);
         int[] var5 = this.method201(0, var1 + 1 & -289063255 * class322.field834, -1887337990);
         int[] var6 = var2[0];
         int[] var7 = var2[1];
         int[] var8 = var2[2];

         for(int var9 = 0; var9 < -1474554145 * class322.field831; ++var9) {
            int var10 = (var5[var9] - var3[var9]) * 347966039 * this.field8292;
            int var11 = this.field8292 * 347966039 * (var4[var9 + 1 & -901777799 * class322.field829] - var4[var9 - 1 & -901777799 * class322.field829]);
            int var12 = var11 >> 12;
            int var13 = var10 >> 12;
            int var14 = var12 * var12 >> 12;
            int var15 = var13 * var13 >> 12;
            int var16 = (int)(Math.sqrt((double)((float)(4096 + var15 + var14) / 4096.0F)) * 4096.0D);
            int var17;
            int var18;
            int var19;
            if (var16 != 0) {
               var17 = var11 / var16;
               var18 = var10 / var16;
               var19 = 16777216 / var16;
            } else {
               var17 = 0;
               var18 = 0;
               var19 = 0;
            }

            if (this.field8294) {
               var17 = (var17 >> 1) + 2048;
               var18 = (var18 >> 1) + 2048;
               var19 = 2048 + (var19 >> 1);
            }

            var6[var9] = var17;
            var7[var9] = var18;
            var8[var9] = var19;
         }
      }

      return var2;
   }
}
