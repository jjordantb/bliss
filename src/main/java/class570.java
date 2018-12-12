public class class570 extends class347 {
   static boolean field39 = false;
   static int field40 = 4;
   int field41 = -882583092;
   int field42 = 1743781396;

   int[][] method30(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)75);
      if (this.field266.field211) {
         int var3 = -1474554145 * class322.field831 / (-277601971 * this.field42);
         int var4 = class322.field832 * 461985445 / (1955421883 * this.field41);
         int[][] var6;
         if (var4 > 0) {
            int var5 = var1 % var4;
            var6 = this.method206(0, var5 * 461985445 * class322.field832 / var4, (byte)8);
         } else {
            var6 = this.method206(0, 0, (byte)8);
         }

         int[] var15 = var6[0];
         int[] var7 = var6[1];
         int[] var8 = var6[2];
         int[] var9 = var2[0];
         int[] var10 = var2[1];
         int[] var11 = var2[2];

         for(int var12 = 0; var12 < class322.field831 * -1474554145; ++var12) {
            int var14;
            if (var3 > 0) {
               int var13 = var12 % var3;
               var14 = -1474554145 * class322.field831 * var13 / var3;
            } else {
               var14 = 0;
            }

            var9[var12] = var15[var14];
            var10[var12] = var7[var14];
            var11[var12] = var8[var14];
         }
      }

      return var2;
   }

   public class570() {
      super(1, false);
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field42 = var2.method6371() * -637796475;
            break;
         case 1:
            this.field41 = var2.method6371() * 853096051;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahe.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)34);
         if (this.field266.field211) {
            int var4 = -1474554145 * class322.field831 / (-277601971 * this.field42);
            int var5 = class322.field832 * 461985445 / (1955421883 * this.field41);
            int[][] var7;
            if (var5 > 0) {
               int var6 = var1 % var5;
               var7 = this.method206(0, var6 * 461985445 * class322.field832 / var5, (byte)8);
            } else {
               var7 = this.method206(0, 0, (byte)8);
            }

            int[] var17 = var7[0];
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];

            for(int var13 = 0; var13 < class322.field831 * -1474554145; ++var13) {
               int var15;
               if (var4 > 0) {
                  int var14 = var13 % var4;
                  var15 = -1474554145 * class322.field831 * var14 / var4;
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

   int[] method31(int var1) {
      int[] var2 = this.field270.method3546(var1, 1514427827);
      if (this.field270.field6612) {
         int var3 = class322.field831 * -1474554145 / (-277601971 * this.field42);
         int var4 = class322.field832 * 461985445 / (1955421883 * this.field41);
         int var5;
         int[] var6;
         if (var4 > 0) {
            var5 = var1 % var4;
            var6 = this.method201(0, var5 * class322.field832 * 461985445 / var4, -1887337990);
         } else {
            var6 = this.method201(0, 0, -1887337990);
         }

         for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
            if (var3 > 0) {
               int var7 = var5 % var3;
               var2[var5] = var6[var7 * -1474554145 * class322.field831 / var3];
            } else {
               var2[var5] = var6[0];
            }
         }
      }

      return var2;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1438029248);
         if (this.field270.field6612) {
            int var4 = class322.field831 * -1474554145 / (-277601971 * this.field42);
            int var5 = class322.field832 * 461985445 / (1955421883 * this.field41);
            int var6;
            int[] var7;
            if (var5 > 0) {
               var6 = var1 % var5;
               var7 = this.method201(0, var6 * class322.field832 * 461985445 / var5, -1887337990);
            } else {
               var7 = this.method201(0, 0, -1887337990);
            }

            for(var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
               if (var4 > 0) {
                  int var8 = var6 % var4;
                  var3[var6] = var7[var8 * -1474554145 * class322.field831 / var4];
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

   void method32(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field42 = var2.method6371() * -637796475;
         break;
      case 1:
         this.field41 = var2.method6371() * 853096051;
      }

   }

   void method33(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field42 = var2.method6371() * -637796475;
         break;
      case 1:
         this.field41 = var2.method6371() * 853096051;
      }

   }

   int[] method34(int var1) {
      int[] var2 = this.field270.method3546(var1, 20761856);
      if (this.field270.field6612) {
         int var3 = class322.field831 * -1474554145 / (-277601971 * this.field42);
         int var4 = class322.field832 * 461985445 / (1955421883 * this.field41);
         int var5;
         int[] var6;
         if (var4 > 0) {
            var5 = var1 % var4;
            var6 = this.method201(0, var5 * class322.field832 * 461985445 / var4, -1887337990);
         } else {
            var6 = this.method201(0, 0, -1887337990);
         }

         for(var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
            if (var3 > 0) {
               int var7 = var5 % var3;
               var2[var5] = var6[var7 * -1474554145 * class322.field831 / var3];
            } else {
               var2[var5] = var6[0];
            }
         }
      }

      return var2;
   }

   int[][] method35(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)53);
      if (this.field266.field211) {
         int var3 = -1474554145 * class322.field831 / (-277601971 * this.field42);
         int var4 = class322.field832 * 461985445 / (1955421883 * this.field41);
         int[][] var6;
         if (var4 > 0) {
            int var5 = var1 % var4;
            var6 = this.method206(0, var5 * 461985445 * class322.field832 / var4, (byte)8);
         } else {
            var6 = this.method206(0, 0, (byte)8);
         }

         int[] var15 = var6[0];
         int[] var7 = var6[1];
         int[] var8 = var6[2];
         int[] var9 = var2[0];
         int[] var10 = var2[1];
         int[] var11 = var2[2];

         for(int var12 = 0; var12 < class322.field831 * -1474554145; ++var12) {
            int var14;
            if (var3 > 0) {
               int var13 = var12 % var3;
               var14 = -1474554145 * class322.field831 * var13 / var3;
            } else {
               var14 = 0;
            }

            var9[var12] = var15[var14];
            var10[var12] = var7[var14];
            var11[var12] = var8[var14];
         }
      }

      return var2;
   }
}
