public class class364 extends class727 {
   class257 field2374;
   byte[][] field2375;
   int[] field2376;
   int[] field2377;
   int[] field2378;
   int[] field2379;

   void method1610(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class23 var13, int var14, int var15) {
      class924 var16 = (class924)var13;
      int[] var17 = var16.field10289;
      int[] var18 = var16.field10288;
      int var19 = var10 - this.field2374.field7921;
      int var20 = var11;
      if (var15 > var11) {
         var20 = var15;
         var5 += this.field2374.field7918 * (var15 - var11);
         var4 += (var15 - var11) * var12;
      }

      int var21 = var17.length + var15 < var11 + var7 ? var15 + var17.length : var11 + var7;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - var15] + var14;
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if (var19 > var23) {
            var26 = var19 - var23;
            if (var26 >= var24) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var19;
            if (var26 >= var6) {
               var4 += var9 + var6;
               var5 += var8 + var6;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if (var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = -var24; var27 < 0; ++var27) {
            int var28 = var1[var4++] & 255;
            if (var28 != 0) {
               int var29 = ((var3 & '\uff00') * var28 & 16711680) + ((var3 & 16711935) * var28 & -16711936) >> 8;
               var28 = 256 - var28;
               int var30 = var2[var5];
               var2[var5++] = (((var30 & 16711935) * var28 & -16711936) + (var28 * (var30 & '\uff00') & 16711680) >> 8) + var29;
            } else {
               ++var5;
            }
         }

         var4 += var9 + var26;
         var5 += var8 + var26;
      }

   }

   void method1611(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            int var12 = var1[var4++] & 255;
            if (var12 != 0) {
               int var13 = ((var3 & '\uff00') * var12 & 16711680) + (var12 * (var3 & 16711935) & -16711936) >> 8;
               var12 = 256 - var12;
               int var14 = var2[var5];
               var2[var5++] = ((var12 * (var14 & 16711935) & -16711936) + ((var14 & '\uff00') * var12 & 16711680) >> 8) + var13;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   class364(class257 var1, class230 var2, class922[] var3, int[] var4, int[] var5) {
      super(var1, var2);
      this.field2374 = var1;
      this.field2374 = var1;
      this.field2376 = var4;
      this.field2377 = var5;
      this.field2375 = new byte[var3.length][];
      this.field2378 = new int[var3.length];
      this.field2379 = new int[var3.length];

      for(int var6 = 0; var6 < var3.length; ++var6) {
         class922 var7 = var3[var6];
         if (var7.field10276 != null) {
            this.field2375[var6] = var7.field10276;
         } else {
            byte[] var8 = var7.field10275;
            byte[] var9 = this.field2375[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0 ? 0 : -1);
            }
         }

         this.field2378[var6] = var7.field10268;
         this.field2379[var6] = var7.field10272;
      }

   }

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      if (this.field2374.field7914 != null) {
         if (var6 == null) {
            this.method1680(var1, var2, var3, var4, var5);
         } else {
            var2 += this.field2379[var1];
            var3 += this.field2378[var1];
            int var9 = this.field2376[var1];
            int var10 = this.field2377[var1];
            int var11 = this.field2374.field7918;
            int var12 = var3 * var11 + var2;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if (var3 < this.field2374.field7923) {
               var16 = this.field2374.field7923 - var3;
               var10 -= var16;
               var3 = this.field2374.field7923;
               var15 += var9 * var16;
               var12 += var16 * var11;
            }

            if (var3 + var10 > this.field2374.field7924) {
               var10 -= var10 + var3 - this.field2374.field7924;
            }

            if (var2 < this.field2374.field7921) {
               var16 = this.field2374.field7921 - var2;
               var9 -= var16;
               var2 = this.field2374.field7921;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if (var2 + var9 > this.field2374.field7938) {
               var16 = var9 + var2 - this.field2374.field7938;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if (var9 > 0 && var10 > 0) {
               this.method1610(this.field2375[var1], this.field2374.field7914, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.field2376[var1], var6, var7, var8);
            }
         }
      }

   }

   void method1680(char var1, int var2, int var3, int var4, boolean var5) {
      if (this.field2374.field7914 != null) {
         var2 += this.field2379[var1];
         var3 += this.field2378[var1];
         int var6 = this.field2376[var1];
         int var7 = this.field2377[var1];
         int var8 = this.field2374.field7918;
         int var9 = var3 * var8 + var2;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if (var3 < this.field2374.field7923) {
            var13 = this.field2374.field7923 - var3;
            var7 -= var13;
            var3 = this.field2374.field7923;
            var12 += var6 * var13;
            var9 += var8 * var13;
         }

         if (var7 + var3 > this.field2374.field7924) {
            var7 -= var7 + var3 - this.field2374.field7924;
         }

         if (var2 < this.field2374.field7921) {
            var13 = this.field2374.field7921 - var2;
            var6 -= var13;
            var2 = this.field2374.field7921;
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if (var6 + var2 > this.field2374.field7938) {
            var13 = var6 + var2 - this.field2374.field7938;
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if (var6 > 0 && var7 > 0) {
            this.method1611(this.field2375[var1], this.field2374.field7914, var4, var12, var9, var6, var7, var10, var11);
         }
      }

   }

   static final void method1612(int var0) {
      try {
         class131.method896(1674101672);
         class730.field2697.method5308(-2068923271);

         int var1;
         for(var1 = 0; var1 < class730.field2851.length; ++var1) {
            class730.field2851[var1] = null;
         }

         for(var1 = 0; var1 < class730.field2652.length; ++var1) {
            class730.field2652[var1] = null;
         }

         class381.method1067(590983339);

         for(var1 = 0; var1 < 2048; ++var1) {
            class730.loaded[var1] = null;
         }

         class730.field2684 = 0;
         class730.field2677.method2941((byte)-66);
         class730.field2753 = 0;
         class730.field2666.method2941((byte)-127);
         class974.method1783(-1148860846);
         class730.field2694 = 0;
         class827.field9037.method5493(-1863575253);
         class823.field9045 = null;
         class640.field10201 = null;
         class509.field4024 = null;
         class507.field4015 = null;
         class454.field7230 = null;
         class547.field412 = 0L;
         class979.method1835(2025307040);
         class417.method5691((byte)83);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "xk.gs(" + ')');
      }
   }

   static void method1613(class719 var0, int var1, int var2, int var3, class879 var4, byte var5) {
      try {
         if (var4 != null) {
            var0.method2059(var1, var2, var3, var4.method5972(), var4.method6099(), var4.method6006(), var4.method5976(), var4.method5977(), var4.method5978(), var4.method5979());
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "xk.dd(" + ')');
      }
   }

   static final int method1614(int var0, int var1, short var2) {
      try {
         int var3 = class83.method886(var0 - 1, var1 - 1, 274655009) + class83.method886(1 + var0, var1 - 1, 274655009) + class83.method886(var0 - 1, var1 + 1, 274655009) + class83.method886(1 + var0, 1 + var1, 274655009);
         int var4 = class83.method886(var0 - 1, var1, 274655009) + class83.method886(var0 + 1, var1, 274655009) + class83.method886(var0, var1 - 1, 274655009) + class83.method886(var0, 1 + var1, 274655009);
         int var5 = class83.method886(var0, var1, 274655009);
         return var5 / 4 + var4 / 8 + var3 / 16;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "xk.o(" + ')');
      }
   }
}
