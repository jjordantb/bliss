public class class707 extends class347 {
   static boolean field3317 = false;
   static int field3318 = 32768;
   int field3319 = 32768;

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field3319 = var2.method6374() << 4;
            break;
         case 1:
            super.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahh.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)67);
         if (super.field266.field211) {
            int[] var4 = this.method201(1, var1, -1887337990);
            int[] var5 = this.method201(2, var1, -1887337990);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];

            for(int var9 = 0; var9 < class322.field831; ++var9) {
               int var10 = 255 * var4[var9] >> 12 & 255;
               int var11 = var5[var9] * this.field3319 >> 12;
               int var12 = class322.field839[var10] * var11 >> 12;
               int var13 = class322.field837[var10] * var11 >> 12;
               int var14 = var9 + (var12 >> 12) & class322.field829;
               int var15 = (var13 >> 12) + var1 & class322.field834;
               int[][] var16 = this.method206(0, var15, (byte)8);
               var6[var9] = var16[0][var14];
               var7[var9] = var16[1][var14];
               var8[var9] = var16[2][var14];
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "ahh.k(" + ')');
      }
   }

   void method205(int var1) {
      try {
         class322.method814((byte)90);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahh.x(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 868986810);
         if (super.field270.field6612) {
            int[] var4 = this.method201(1, var1, -1887337990);
            int[] var5 = this.method201(2, var1, -1887337990);

            for(int var6 = 0; var6 < class322.field831; ++var6) {
               int var7 = var4[var6] >> 4 & 255;
               int var8 = var5[var6] * this.field3319 >> 12;
               int var9 = var8 * class322.field839[var7] >> 12;
               int var10 = class322.field837[var7] * var8 >> 12;
               int var11 = (var9 >> 12) + var6 & class322.field829;
               int var12 = var1 + (var10 >> 12) & class322.field834;
               int[] var13 = this.method201(0, var12, -1887337990);
               var3[var6] = var13[var11];
            }
         }

         return var3;
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "ahh.i(" + ')');
      }
   }

   public class707() {
      super(3, false);
   }
}
