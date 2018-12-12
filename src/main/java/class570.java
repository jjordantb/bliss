public class class570 extends class347 {
   static boolean field39 = false;
   static int field40 = 4;
   int field41 = 4;
   int field42 = 4;

   public class570() {
      super(1, false);
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field42 = var2.method6371();
            break;
         case 1:
            this.field41 = var2.method6371();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahe.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)34);
         if (super.field266.field211) {
            int var4 = class322.field831 / this.field42;
            int var5 = class322.field832 / this.field41;
            int[][] var7;
            if (var5 > 0) {
               int var6 = var1 % var5;
               var7 = this.method206(0, var6 * class322.field832 / var5, (byte)8);
            } else {
               var7 = this.method206(0, 0, (byte)8);
            }

            int[] var17 = var7[0];
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];

            for(int var13 = 0; var13 < class322.field831; ++var13) {
               int var15;
               if (var4 > 0) {
                  int var14 = var13 % var4;
                  var15 = class322.field831 * var14 / var4;
               } else {
                  var15 = 0;
               }

               var10[var13] = var17[var15];
               var11[var13] = var8[var15];
               var12[var13] = var9[var15];
            }
         }

         return var3;
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "ahe.k(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 1438029248);
         if (super.field270.field6612) {
            int var4 = class322.field831 / this.field42;
            int var5 = class322.field832 / this.field41;
            int var6;
            int[] var7;
            if (var5 > 0) {
               var6 = var1 % var5;
               var7 = this.method201(0, var6 * class322.field832 / var5, -1887337990);
            } else {
               var7 = this.method201(0, 0, -1887337990);
            }

            for(var6 = 0; var6 < class322.field831; ++var6) {
               if (var4 > 0) {
                  int var8 = var6 % var4;
                  var3[var6] = var7[var8 * class322.field831 / var4];
               } else {
                  var3[var6] = var7[0];
               }
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ahe.i(" + ')');
      }
   }
}
