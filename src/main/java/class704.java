public class class704 extends class347 {
   static boolean field3372 = false;

   public class704() {
      super(3, false);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1169453050);
         if (this.field270.field6612) {
            int[] var4 = this.method201(0, var1, -1887337990);
            int[] var5 = this.method201(1, var1, -1887337990);
            int[] var6 = this.method201(2, var1, -1887337990);

            for(int var7 = 0; var7 < class322.field831 * -1474554145; ++var7) {
               int var8 = var6[var7];
               if (var8 == 4096) {
                  var3[var7] = var4[var7];
               } else if (var8 == 0) {
                  var3[var7] = var5[var7];
               } else {
                  var3[var7] = var4[var7] * var8 + (4096 - var8) * var5[var7] >> 12;
               }
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ahm.i(" + ')');
      }
   }

   int[][] method1984(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)26);
      if (this.field266.field211) {
         int[] var3 = this.method201(2, var1, -1887337990);
         int[][] var4 = this.method206(0, var1, (byte)8);
         int[][] var5 = this.method206(1, var1, (byte)8);
         int[] var6 = var2[0];
         int[] var7 = var2[1];
         int[] var8 = var2[2];
         int[] var9 = var4[0];
         int[] var10 = var4[1];
         int[] var11 = var4[2];
         int[] var12 = var5[0];
         int[] var13 = var5[1];
         int[] var14 = var5[2];

         for(int var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
            int var16 = var3[var15];
            if (4096 == var16) {
               var6[var15] = var9[var15];
               var7[var15] = var10[var15];
               var8[var15] = var11[var15];
            } else if (var16 == 0) {
               var6[var15] = var12[var15];
               var7[var15] = var13[var15];
               var8[var15] = var14[var15];
            } else {
               int var17 = 4096 - var16;
               var6[var15] = var12[var15] * var17 + var16 * var9[var15] >> 12;
               var7[var15] = var13[var15] * var17 + var16 * var10[var15] >> 12;
               var8[var15] = var11[var15] * var16 + var14[var15] * var17 >> 12;
            }
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         if (var1 == 0) {
            this.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahm.r(" + ')');
      }
   }

   int[] method1985(int var1) {
      int[] var2 = this.field270.method3546(var1, 6018124);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);
         int[] var4 = this.method201(1, var1, -1887337990);
         int[] var5 = this.method201(2, var1, -1887337990);

         for(int var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
            int var7 = var5[var6];
            if (var7 == 4096) {
               var2[var6] = var3[var6];
            } else if (var7 == 0) {
               var2[var6] = var4[var6];
            } else {
               var2[var6] = var3[var6] * var7 + (4096 - var7) * var4[var6] >> 12;
            }
         }
      }

      return var2;
   }

   int[] method1986(int var1) {
      int[] var2 = this.field270.method3546(var1, 1105475938);
      if (this.field270.field6612) {
         int[] var3 = this.method201(0, var1, -1887337990);
         int[] var4 = this.method201(1, var1, -1887337990);
         int[] var5 = this.method201(2, var1, -1887337990);

         for(int var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
            int var7 = var5[var6];
            if (var7 == 4096) {
               var2[var6] = var3[var6];
            } else if (var7 == 0) {
               var2[var6] = var4[var6];
            } else {
               var2[var6] = var3[var6] * var7 + (4096 - var7) * var4[var6] >> 12;
            }
         }
      }

      return var2;
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)117);
         if (this.field266.field211) {
            int[] var4 = this.method201(2, var1, -1887337990);
            int[][] var5 = this.method206(0, var1, (byte)8);
            int[][] var6 = this.method206(1, var1, (byte)8);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];

            for(int var16 = 0; var16 < -1474554145 * class322.field831; ++var16) {
               int var17 = var4[var16];
               if (4096 == var17) {
                  var7[var16] = var10[var16];
                  var8[var16] = var11[var16];
                  var9[var16] = var12[var16];
               } else if (var17 == 0) {
                  var7[var16] = var13[var16];
                  var8[var16] = var14[var16];
                  var9[var16] = var15[var16];
               } else {
                  int var18 = 4096 - var17;
                  var7[var16] = var13[var16] * var18 + var17 * var10[var16] >> 12;
                  var8[var16] = var14[var16] * var18 + var17 * var11[var16] >> 12;
                  var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
               }
            }
         }

         return var3;
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "ahm.k(" + ')');
      }
   }

   void method1987(int var1, class907 var2) {
      if (var1 == 0) {
         this.field268 = var2.method6371() == 1;
      }

   }

   int[][] method1988(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)59);
      if (this.field266.field211) {
         int[] var3 = this.method201(2, var1, -1887337990);
         int[][] var4 = this.method206(0, var1, (byte)8);
         int[][] var5 = this.method206(1, var1, (byte)8);
         int[] var6 = var2[0];
         int[] var7 = var2[1];
         int[] var8 = var2[2];
         int[] var9 = var4[0];
         int[] var10 = var4[1];
         int[] var11 = var4[2];
         int[] var12 = var5[0];
         int[] var13 = var5[1];
         int[] var14 = var5[2];

         for(int var15 = 0; var15 < -1474554145 * class322.field831; ++var15) {
            int var16 = var3[var15];
            if (4096 == var16) {
               var6[var15] = var9[var15];
               var7[var15] = var10[var15];
               var8[var15] = var11[var15];
            } else if (var16 == 0) {
               var6[var15] = var12[var15];
               var7[var15] = var13[var15];
               var8[var15] = var14[var15];
            } else {
               int var17 = 4096 - var16;
               var6[var15] = var12[var15] * var17 + var16 * var9[var15] >> 12;
               var7[var15] = var13[var15] * var17 + var16 * var10[var15] >> 12;
               var8[var15] = var11[var15] * var16 + var14[var15] * var17 >> 12;
            }
         }
      }

      return var2;
   }

   void method1989(int var1, class907 var2) {
      if (var1 == 0) {
         this.field268 = var2.method6371() == 1;
      }

   }
}
