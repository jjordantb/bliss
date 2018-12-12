public class class736 extends class345 {
   static int[] field3115 = new int[256];
   static double field3116 = -1.0D;
   class347 field3117;
   class347 field3118;
   class347 field3119;
   int[] field3120;
   class347[] field3121;
   int[] field3122;

   boolean method1838(class180 var1, class478 var2, byte var3) {
      try {
         int var4;
         if (class43.field5089 >= 0) {
            for(var4 = 0; var4 < this.field3122.length; ++var4) {
               if (!var1.method3260(class43.field5089, this.field3122[var4], -416567288)) {
                  return false;
               }
            }
         } else {
            for(var4 = 0; var4 < this.field3122.length; ++var4) {
               if (!var1.method3280(this.field3122[var4], -457216440)) {
                  return false;
               }
            }
         }

         for(var4 = 0; var4 < this.field3120.length; ++var4) {
            if (!var2.method4621(this.field3120[var4], (short)5558)) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ail.a(" + ')');
      }
   }

   int[] method1839(class180 var1, class478 var2, double var3, int var5, int var6, boolean var7, int var8) {
      try {
         class43.field5088 = var1;
         class134.field1399 = var2;

         for(int var9 = 0; var9 < this.field3121.length; ++var9) {
            this.field3121[var9].method202(var5, var6, -1661668864);
         }

         class279.method6615(var3);
         class322.method815(var5, var6, (byte)24);
         int[] var22 = new int[var5 * var6];
         int var10 = 0;

         int var11;
         for(var11 = 0; var11 < var6; ++var11) {
            int[] var12;
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3118.field268) {
               var12 = this.field3118.method203(var11, -1060810232);
               var13 = var12;
               var14 = var12;
               var15 = var12;
            } else {
               int[][] var23 = this.field3118.method204(var11, (byte)-23);
               var13 = var23[0];
               var14 = var23[1];
               var15 = var23[2];
            }

            if (this.field3117.field268) {
               var12 = this.field3117.method203(var11, 991664315);
            } else {
               var12 = this.field3117.method204(var11, (byte)-109)[0];
            }

            if (var7) {
               var10 = var11;
            }

            for(int var16 = var5 - 1; var16 >= 0; --var16) {
               int var17 = var13[var16] >> 4;
               if (var17 > 255) {
                  var17 = 255;
               }

               if (var17 < 0) {
                  var17 = 0;
               }

               int var18 = var14[var16] >> 4;
               if (var18 > 255) {
                  var18 = 255;
               }

               if (var18 < 0) {
                  var18 = 0;
               }

               int var19 = var15[var16] >> 4;
               if (var19 > 255) {
                  var19 = 255;
               }

               if (var19 < 0) {
                  var19 = 0;
               }

               var17 = field3115[var17];
               var18 = field3115[var18];
               var19 = field3115[var19];
               int var20;
               if (var17 == 0 && var18 == 0 && var19 == 0) {
                  var20 = 0;
               } else {
                  var20 = var12[var16] >> 4;
                  if (var20 > 255) {
                     var20 = 255;
                  }

                  if (var20 < 0) {
                     var20 = 0;
                  }
               }

               var22[var10++] = (var20 << 24) + (var17 << 16) + (var18 << 8) + var19;
               if (var7) {
                  var10 += var5 - 1;
               }
            }
         }

         for(var11 = 0; var11 < this.field3121.length; ++var11) {
            this.field3121[var11].method200(1881168514);
         }

         return var22;
      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "ail.b(" + ')');
      }
   }

   float[] method1840(class180 var1, class478 var2, int var3, int var4, boolean var5, int var6) {
      try {
         class43.field5088 = var1;
         class134.field1399 = var2;

         for(int var7 = 0; var7 < this.field3121.length; ++var7) {
            this.field3121[var7].method202(var3, var4, -1661668864);
         }

         class322.method815(var3, var4, (byte)24);
         float[] var19 = new float[var3 * var4 * 4];
         int var8 = 0;

         int var9;
         for(var9 = 0; var9 < var4; ++var9) {
            int[] var10;
            int[] var11;
            int[] var12;
            int[] var13;
            if (this.field3118.field268) {
               var10 = this.field3118.method203(var9, 376891989);
               var11 = var10;
               var12 = var10;
               var13 = var10;
            } else {
               int[][] var20 = this.field3118.method204(var9, (byte)-81);
               var11 = var20[0];
               var12 = var20[1];
               var13 = var20[2];
            }

            if (this.field3117.field268) {
               var10 = this.field3117.method203(var9, 1373971312);
            } else {
               var10 = this.field3117.method204(var9, (byte)-16)[0];
            }

            int[] var14;
            if (this.field3119.field268) {
               var14 = this.field3119.method203(var9, -306931016);
            } else {
               var14 = this.field3119.method204(var9, (byte)-17)[0];
            }

            if (var5) {
               var8 = var9 << 2;
            }

            for(int var15 = var3 - 1; var15 >= 0; --var15) {
               float var16 = (float)var10[var15] / 4096.0F;
               float var17 = ((float)var14[var15] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
               if (var16 < 0.0F) {
                  var16 = 0.0F;
               } else if (var16 > 1.0F) {
                  var16 = 1.0F;
               }

               var19[var8++] = var17 * (float)var11[var15];
               var19[var8++] = (float)var12[var15] * var17;
               var19[var8++] = var17 * (float)var13[var15];
               var19[var8++] = var16;
               if (var5) {
                  var8 += (var3 << 2) - 4;
               }
            }
         }

         for(var9 = 0; var9 < this.field3121.length; ++var9) {
            this.field3121[var9].method200(1881168514);
         }

         return var19;
      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "ail.p(" + ')');
      }
   }

   class736(InputStream var1) {
      int var2 = var1.method6371();
      int var3 = 0;
      int var4 = 0;
      int[][] var5 = new int[var2][];
      this.field3121 = new class347[var2];

      int var6;
      class347 var7;
      int var8;
      int var9;
      for(var6 = 0; var6 < var2; ++var6) {
         var7 = class490.method4435(var1, -1133567452);
         if (var7.method207((short)-979) >= 0) {
            ++var3;
         }

         if (var7.method208((byte)13) >= 0) {
            ++var4;
         }

         var8 = var7.field257.length;
         var5[var6] = new int[var8];

         for(var9 = 0; var9 < var8; ++var9) {
            var5[var6][var9] = var1.method6371();
         }

         this.field3121[var6] = var7;
      }

      this.field3122 = new int[var3];
      var3 = 0;
      this.field3120 = new int[var4];
      var4 = 0;

      for(var6 = 0; var6 < var2; ++var6) {
         var7 = this.field3121[var6];
         var8 = var7.field257.length;

         for(var9 = 0; var9 < var8; ++var9) {
            var7.field257[var9] = this.field3121[var5[var6][var9]];
         }

         var9 = var7.method207((short)-3617);
         int var10 = var7.method208((byte)1);
         if (var9 > 0) {
            this.field3122[var3++] = var9;
         }

         if (var10 > 0) {
            this.field3120[var4++] = var10;
         }

         var5[var6] = null;
      }

      this.field3118 = this.field3121[var1.method6371()];
      this.field3117 = this.field3121[var1.method6371()];
      this.field3119 = this.field3121[var1.method6371()];
      Object var11 = null;
   }

   int[] method1841(class180 var1, class478 var2, double var3, int var5, int var6, boolean var7, boolean var8, int var9) {
      try {
         class43.field5088 = var1;
         class134.field1399 = var2;

         for(int var10 = 0; var10 < this.field3121.length; ++var10) {
            this.field3121[var10].method202(var5, var6, -1661668864);
         }

         class279.method6615(var3);
         class322.method815(var5, var6, (byte)24);
         int[] var25 = new int[var5 * var6];
         int var11;
         int var12;
         byte var13;
         if (var7) {
            var11 = var5 - 1;
            var12 = -1;
            var13 = -1;
         } else {
            var11 = 0;
            var12 = var5;
            var13 = 1;
         }

         int var14 = 0;

         int var15;
         for(var15 = 0; var15 < var6; ++var15) {
            int[] var17;
            int[] var18;
            int[] var19;
            if (this.field3118.field268) {
               int[] var16 = this.field3118.method203(var15, 1662825531);
               var17 = var16;
               var18 = var16;
               var19 = var16;
            } else {
               int[][] var26 = this.field3118.method204(var15, (byte)-95);
               var17 = var26[0];
               var18 = var26[1];
               var19 = var26[2];
            }

            if (var8) {
               var14 = var15;
            }

            for(int var27 = var11; var12 != var27; var27 += var13) {
               int var20 = var17[var27] >> 4;
               if (var20 > 255) {
                  var20 = 255;
               }

               if (var20 < 0) {
                  var20 = 0;
               }

               int var21 = var18[var27] >> 4;
               if (var21 > 255) {
                  var21 = 255;
               }

               if (var21 < 0) {
                  var21 = 0;
               }

               int var22 = var19[var27] >> 4;
               if (var22 > 255) {
                  var22 = 255;
               }

               if (var22 < 0) {
                  var22 = 0;
               }

               var20 = field3115[var20];
               var21 = field3115[var21];
               var22 = field3115[var22];
               int var23 = var22 + (var20 << 16) + (var21 << 8);
               if (var23 != 0) {
                  var23 |= -16777216;
               }

               var25[var14++] = var23;
               if (var8) {
                  var14 += var5 - 1;
               }
            }
         }

         for(var15 = 0; var15 < this.field3121.length; ++var15) {
            this.field3121[var15].method200(1881168514);
         }

         return var25;
      } catch (RuntimeException var24) {
         throw class158.method3445(var24, "ail.f(" + ')');
      }
   }
}
