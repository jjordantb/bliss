public class class836 extends class347 {
   int field9179 = -938414935;
   int field9180 = -804145351;
   static boolean field9181 = false;
   static int field9182 = 1;

   public class836() {
      super(1, false);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 936289557);
         if (this.field270.field6612) {
            int var4 = 1 + 1615726345 * this.field9180 + 1615726345 * this.field9180;
            int var5 = 65536 / var4;
            int var6 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];

            int var9;
            for(var9 = var1 - 1615726345 * this.field9180; var9 <= this.field9180 * 1615726345 + var1; ++var9) {
               int[] var10 = this.method201(0, var9 & class322.field834 * -289063255, -1887337990);
               int[] var11 = new int[class322.field831 * -1474554145];
               int var12 = 0;

               int var13;
               for(var13 = -(this.field9179 * 484472729); var13 <= 484472729 * this.field9179; ++var13) {
                  var12 += var10[var13 & -901777799 * class322.field829];
               }

               for(var13 = 0; var13 < class322.field831 * -1474554145; var12 += var10[var13 + 484472729 * this.field9179 & class322.field829 * -901777799]) {
                  var11[var13] = var7 * var12 >> 16;
                  var12 -= var10[var13 - 484472729 * this.field9179 & -901777799 * class322.field829];
                  ++var13;
               }

               var8[1615726345 * this.field9180 + var9 - var1] = var11;
            }

            for(var9 = 0; var9 < class322.field831 * -1474554145; ++var9) {
               int var15 = 0;

               for(int var16 = 0; var16 < var4; ++var16) {
                  var15 += var8[var16][var9];
               }

               var3[var9] = var15 * var5 >> 16;
            }
         }

         return var3;
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "ahq.i(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)5);
         if (this.field266.field211) {
            int var4 = 1615726345 * this.field9180 + 1615726345 * this.field9180 + 1;
            int var5 = 65536 / var4;
            int var6 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];

            int var12;
            int var13;
            int var14;
            for(int var9 = var1 - 1615726345 * this.field9180; var9 <= 1615726345 * this.field9180 + var1; ++var9) {
               int[][] var10 = this.method206(0, var9 & class322.field834 * -289063255, (byte)8);
               int[][] var11 = new int[3][class322.field831 * -1474554145];
               var12 = 0;
               var13 = 0;
               var14 = 0;
               int[] var15 = var10[0];
               int[] var16 = var10[1];
               int[] var17 = var10[2];

               for(int var18 = -(484472729 * this.field9179); var18 <= 484472729 * this.field9179; ++var18) {
                  int var19 = var18 & -901777799 * class322.field829;
                  var12 += var15[var19];
                  var13 += var16[var19];
                  var14 += var17[var19];
               }

               int[] var30 = var11[0];
               int[] var31 = var11[1];
               int[] var20 = var11[2];

               int var22;
               for(int var21 = 0; var21 < class322.field831 * -1474554145; var14 += var17[var22]) {
                  var30[var21] = var12 * var7 >> 16;
                  var31[var21] = var7 * var13 >> 16;
                  var20[var21] = var7 * var14 >> 16;
                  var22 = var21 - 484472729 * this.field9179 & class322.field829 * -901777799;
                  var12 -= var15[var22];
                  var13 -= var16[var22];
                  var14 -= var17[var22];
                  ++var21;
                  var22 = var21 + 484472729 * this.field9179 & class322.field829 * -901777799;
                  var12 += var15[var22];
                  var13 += var16[var22];
               }

               var8[1615726345 * this.field9180 + var9 - var1] = var11;
            }

            int[] var24 = var3[0];
            int[] var25 = var3[1];
            int[] var26 = var3[2];

            for(var12 = 0; var12 < class322.field831 * -1474554145; ++var12) {
               var13 = 0;
               var14 = 0;
               int var27 = 0;

               for(int var28 = 0; var28 < var4; ++var28) {
                  int[][] var29 = var8[var28];
                  var13 += var29[0][var12];
                  var14 += var29[1][var12];
                  var27 += var29[2][var12];
               }

               var24[var12] = var5 * var13 >> 16;
               var25[var12] = var5 * var14 >> 16;
               var26[var12] = var5 * var27 >> 16;
            }
         }

         return var3;
      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "ahq.k(" + ')');
      }
   }

   int[] method5434(int var1) {
      int[] var2 = this.field270.method3546(var1, 1014754656);
      if (this.field270.field6612) {
         int var3 = 1 + 1615726345 * this.field9180 + 1615726345 * this.field9180;
         int var4 = 65536 / var3;
         int var5 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
         int var6 = 65536 / var5;
         int[][] var7 = new int[var3][];

         int var8;
         for(var8 = var1 - 1615726345 * this.field9180; var8 <= this.field9180 * 1615726345 + var1; ++var8) {
            int[] var9 = this.method201(0, var8 & class322.field834 * -289063255, -1887337990);
            int[] var10 = new int[class322.field831 * -1474554145];
            int var11 = 0;

            int var12;
            for(var12 = -(this.field9179 * 484472729); var12 <= 484472729 * this.field9179; ++var12) {
               var11 += var9[var12 & -901777799 * class322.field829];
            }

            for(var12 = 0; var12 < class322.field831 * -1474554145; var11 += var9[var12 + 484472729 * this.field9179 & class322.field829 * -901777799]) {
               var10[var12] = var6 * var11 >> 16;
               var11 -= var9[var12 - 484472729 * this.field9179 & -901777799 * class322.field829];
               ++var12;
            }

            var7[1615726345 * this.field9180 + var8 - var1] = var10;
         }

         for(var8 = 0; var8 < class322.field831 * -1474554145; ++var8) {
            int var13 = 0;

            for(int var14 = 0; var14 < var3; ++var14) {
               var13 += var7[var14][var8];
            }

            var2[var8] = var13 * var4 >> 16;
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field9179 = var2.method6371() * -938414935;
            break;
         case 1:
            this.field9180 = var2.method6371() * -804145351;
            break;
         case 2:
            this.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahq.r(" + ')');
      }
   }

   int[][] method5435(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)41);
      if (this.field266.field211) {
         int var3 = 1615726345 * this.field9180 + 1615726345 * this.field9180 + 1;
         int var4 = 65536 / var3;
         int var5 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
         int var6 = 65536 / var5;
         int[][][] var7 = new int[var3][][];

         int var11;
         int var12;
         int var13;
         for(int var8 = var1 - 1615726345 * this.field9180; var8 <= 1615726345 * this.field9180 + var1; ++var8) {
            int[][] var9 = this.method206(0, var8 & class322.field834 * -289063255, (byte)8);
            int[][] var10 = new int[3][class322.field831 * -1474554145];
            var11 = 0;
            var12 = 0;
            var13 = 0;
            int[] var14 = var9[0];
            int[] var15 = var9[1];
            int[] var16 = var9[2];

            for(int var17 = -(484472729 * this.field9179); var17 <= 484472729 * this.field9179; ++var17) {
               int var18 = var17 & -901777799 * class322.field829;
               var11 += var14[var18];
               var12 += var15[var18];
               var13 += var16[var18];
            }

            int[] var28 = var10[0];
            int[] var29 = var10[1];
            int[] var19 = var10[2];

            int var21;
            for(int var20 = 0; var20 < class322.field831 * -1474554145; var13 += var16[var21]) {
               var28[var20] = var11 * var6 >> 16;
               var29[var20] = var6 * var12 >> 16;
               var19[var20] = var6 * var13 >> 16;
               var21 = var20 - 484472729 * this.field9179 & class322.field829 * -901777799;
               var11 -= var14[var21];
               var12 -= var15[var21];
               var13 -= var16[var21];
               ++var20;
               var21 = var20 + 484472729 * this.field9179 & class322.field829 * -901777799;
               var11 += var14[var21];
               var12 += var15[var21];
            }

            var7[1615726345 * this.field9180 + var8 - var1] = var10;
         }

         int[] var22 = var2[0];
         int[] var23 = var2[1];
         int[] var24 = var2[2];

         for(var11 = 0; var11 < class322.field831 * -1474554145; ++var11) {
            var12 = 0;
            var13 = 0;
            int var25 = 0;

            for(int var26 = 0; var26 < var3; ++var26) {
               int[][] var27 = var7[var26];
               var12 += var27[0][var11];
               var13 += var27[1][var11];
               var25 += var27[2][var11];
            }

            var22[var11] = var4 * var12 >> 16;
            var23[var11] = var4 * var13 >> 16;
            var24[var11] = var4 * var25 >> 16;
         }
      }

      return var2;
   }

   void method5436(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field9179 = var2.method6371() * -938414935;
         break;
      case 1:
         this.field9180 = var2.method6371() * -804145351;
         break;
      case 2:
         this.field268 = var2.method6371() == 1;
      }

   }

   void method5437(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field9179 = var2.method6371() * -938414935;
         break;
      case 1:
         this.field9180 = var2.method6371() * -804145351;
         break;
      case 2:
         this.field268 = var2.method6371() == 1;
      }

   }

   int[] method5438(int var1) {
      int[] var2 = this.field270.method3546(var1, 1055902862);
      if (this.field270.field6612) {
         int var3 = 1 + 1615726345 * this.field9180 + 1615726345 * this.field9180;
         int var4 = 65536 / var3;
         int var5 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
         int var6 = 65536 / var5;
         int[][] var7 = new int[var3][];

         int var8;
         for(var8 = var1 - 1615726345 * this.field9180; var8 <= this.field9180 * 1615726345 + var1; ++var8) {
            int[] var9 = this.method201(0, var8 & class322.field834 * -289063255, -1887337990);
            int[] var10 = new int[class322.field831 * -1474554145];
            int var11 = 0;

            int var12;
            for(var12 = -(this.field9179 * 484472729); var12 <= 484472729 * this.field9179; ++var12) {
               var11 += var9[var12 & -901777799 * class322.field829];
            }

            for(var12 = 0; var12 < class322.field831 * -1474554145; var11 += var9[var12 + 484472729 * this.field9179 & class322.field829 * -901777799]) {
               var10[var12] = var6 * var11 >> 16;
               var11 -= var9[var12 - 484472729 * this.field9179 & -901777799 * class322.field829];
               ++var12;
            }

            var7[1615726345 * this.field9180 + var8 - var1] = var10;
         }

         for(var8 = 0; var8 < class322.field831 * -1474554145; ++var8) {
            int var13 = 0;

            for(int var14 = 0; var14 < var3; ++var14) {
               var13 += var7[var14][var8];
            }

            var2[var8] = var13 * var4 >> 16;
         }
      }

      return var2;
   }

   int[][] method5439(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)82);
      if (this.field266.field211) {
         int var3 = 1615726345 * this.field9180 + 1615726345 * this.field9180 + 1;
         int var4 = 65536 / var3;
         int var5 = 1 + this.field9179 * 484472729 + 484472729 * this.field9179;
         int var6 = 65536 / var5;
         int[][][] var7 = new int[var3][][];

         int var11;
         int var12;
         int var13;
         for(int var8 = var1 - 1615726345 * this.field9180; var8 <= 1615726345 * this.field9180 + var1; ++var8) {
            int[][] var9 = this.method206(0, var8 & class322.field834 * -289063255, (byte)8);
            int[][] var10 = new int[3][class322.field831 * -1474554145];
            var11 = 0;
            var12 = 0;
            var13 = 0;
            int[] var14 = var9[0];
            int[] var15 = var9[1];
            int[] var16 = var9[2];

            for(int var17 = -(484472729 * this.field9179); var17 <= 484472729 * this.field9179; ++var17) {
               int var18 = var17 & -901777799 * class322.field829;
               var11 += var14[var18];
               var12 += var15[var18];
               var13 += var16[var18];
            }

            int[] var28 = var10[0];
            int[] var29 = var10[1];
            int[] var19 = var10[2];

            int var21;
            for(int var20 = 0; var20 < class322.field831 * -1474554145; var13 += var16[var21]) {
               var28[var20] = var11 * var6 >> 16;
               var29[var20] = var6 * var12 >> 16;
               var19[var20] = var6 * var13 >> 16;
               var21 = var20 - 484472729 * this.field9179 & class322.field829 * -901777799;
               var11 -= var14[var21];
               var12 -= var15[var21];
               var13 -= var16[var21];
               ++var20;
               var21 = var20 + 484472729 * this.field9179 & class322.field829 * -901777799;
               var11 += var14[var21];
               var12 += var15[var21];
            }

            var7[1615726345 * this.field9180 + var8 - var1] = var10;
         }

         int[] var22 = var2[0];
         int[] var23 = var2[1];
         int[] var24 = var2[2];

         for(var11 = 0; var11 < class322.field831 * -1474554145; ++var11) {
            var12 = 0;
            var13 = 0;
            int var25 = 0;

            for(int var26 = 0; var26 < var3; ++var26) {
               int[][] var27 = var7[var26];
               var12 += var27[0][var11];
               var13 += var27[1][var11];
               var25 += var27[2][var11];
            }

            var22[var11] = var4 * var12 >> 16;
            var23[var11] = var4 * var13 >> 16;
            var24[var11] = var4 * var25 >> 16;
         }
      }

      return var2;
   }
}
