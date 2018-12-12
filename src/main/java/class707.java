public class class707 extends class347 {
   static boolean field3317 = false;
   static int field3318 = 32768;
   int field3319 = 1905754112;

   void method1944(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field3319 = (var2.method6374() << 4) * 2104812335;
         break;
      case 1:
         this.field268 = var2.method6371() == 1;
      }

   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field3319 = (var2.method6374() << 4) * 2104812335;
            break;
         case 1:
            this.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahh.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)67);
         if (this.field266.field211) {
            int[] var4 = this.method201(1, var1, -1887337990);
            int[] var5 = this.method201(2, var1, -1887337990);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];

            for(int var9 = 0; var9 < class322.field831 * -1474554145; ++var9) {
               int var10 = 255 * var4[var9] >> 12 & 255;
               int var11 = var5[var9] * -1817623601 * this.field3319 >> 12;
               int var12 = class322.field839[var10] * var11 >> 12;
               int var13 = class322.field837[var10] * var11 >> 12;
               int var14 = var9 + (var12 >> 12) & -901777799 * class322.field829;
               int var15 = (var13 >> 12) + var1 & class322.field834 * -289063255;
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

   int[] method1945(int var1) {
      int[] var2 = this.field270.method3546(var1, 787804307);
      if (this.field270.field6612) {
         int[] var3 = this.method201(1, var1, -1887337990);
         int[] var4 = this.method201(2, var1, -1887337990);

         for(int var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
            int var6 = var3[var5] >> 4 & 255;
            int var7 = var4[var5] * this.field3319 * -1817623601 >> 12;
            int var8 = var7 * class322.field839[var6] >> 12;
            int var9 = class322.field837[var6] * var7 >> 12;
            int var10 = (var8 >> 12) + var5 & -901777799 * class322.field829;
            int var11 = var1 + (var9 >> 12) & -289063255 * class322.field834;
            int[] var12 = this.method201(0, var11, -1887337990);
            var2[var5] = var12[var10];
         }
      }

      return var2;
   }

   void method1946(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field3319 = (var2.method6374() << 4) * 2104812335;
         break;
      case 1:
         this.field268 = var2.method6371() == 1;
      }

   }

   int[] method1947(int var1) {
      int[] var2 = this.field270.method3546(var1, 1675766635);
      if (this.field270.field6612) {
         int[] var3 = this.method201(1, var1, -1887337990);
         int[] var4 = this.method201(2, var1, -1887337990);

         for(int var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
            int var6 = var3[var5] >> 4 & 255;
            int var7 = var4[var5] * this.field3319 * -1817623601 >> 12;
            int var8 = var7 * class322.field839[var6] >> 12;
            int var9 = class322.field837[var6] * var7 >> 12;
            int var10 = (var8 >> 12) + var5 & -901777799 * class322.field829;
            int var11 = var1 + (var9 >> 12) & -289063255 * class322.field834;
            int[] var12 = this.method201(0, var11, -1887337990);
            var2[var5] = var12[var10];
         }
      }

      return var2;
   }

   void method1948() {
      class322.method814((byte)11);
   }

   void method1949() {
      class322.method814((byte)-98);
   }

   int[][] method1950(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)35);
      if (this.field266.field211) {
         int[] var3 = this.method201(1, var1, -1887337990);
         int[] var4 = this.method201(2, var1, -1887337990);
         int[] var5 = var2[0];
         int[] var6 = var2[1];
         int[] var7 = var2[2];

         for(int var8 = 0; var8 < class322.field831 * -1474554145; ++var8) {
            int var9 = 255 * var3[var8] >> 12 & 255;
            int var10 = var4[var8] * -1817623601 * this.field3319 >> 12;
            int var11 = class322.field839[var9] * var10 >> 12;
            int var12 = class322.field837[var9] * var10 >> 12;
            int var13 = var8 + (var11 >> 12) & -901777799 * class322.field829;
            int var14 = (var12 >> 12) + var1 & class322.field834 * -289063255;
            int[][] var15 = this.method206(0, var14, (byte)8);
            var5[var8] = var15[0][var13];
            var6[var8] = var15[1][var13];
            var7[var8] = var15[2][var13];
         }
      }

      return var2;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 868986810);
         if (this.field270.field6612) {
            int[] var4 = this.method201(1, var1, -1887337990);
            int[] var5 = this.method201(2, var1, -1887337990);

            for(int var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
               int var7 = var4[var6] >> 4 & 255;
               int var8 = var5[var6] * this.field3319 * -1817623601 >> 12;
               int var9 = var8 * class322.field839[var7] >> 12;
               int var10 = class322.field837[var7] * var8 >> 12;
               int var11 = (var9 >> 12) + var6 & -901777799 * class322.field829;
               int var12 = var1 + (var10 >> 12) & -289063255 * class322.field834;
               int[] var13 = this.method201(0, var12, -1887337990);
               var3[var6] = var13[var11];
            }
         }

         return var3;
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "ahh.i(" + ')');
      }
   }

   void method1951() {
      class322.method814((byte)46);
   }

   public class707() {
      super(3, false);
   }

   int[][] method1952(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)10);
      if (this.field266.field211) {
         int[] var3 = this.method201(1, var1, -1887337990);
         int[] var4 = this.method201(2, var1, -1887337990);
         int[] var5 = var2[0];
         int[] var6 = var2[1];
         int[] var7 = var2[2];

         for(int var8 = 0; var8 < class322.field831 * -1474554145; ++var8) {
            int var9 = 255 * var3[var8] >> 12 & 255;
            int var10 = var4[var8] * -1817623601 * this.field3319 >> 12;
            int var11 = class322.field839[var9] * var10 >> 12;
            int var12 = class322.field837[var9] * var10 >> 12;
            int var13 = var8 + (var11 >> 12) & -901777799 * class322.field829;
            int var14 = (var12 >> 12) + var1 & class322.field834 * -289063255;
            int[][] var15 = this.method206(0, var14, (byte)8);
            var5[var8] = var15[0][var13];
            var6[var8] = var15[1][var13];
            var7[var8] = var15[2][var13];
         }
      }

      return var2;
   }
}
