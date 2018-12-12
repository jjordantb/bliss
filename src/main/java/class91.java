public class class91 {
   int field556;
   static int field557 = 7;
   static int field558 = 6;
   static int field559 = 14;
   int field560;
   int[][] field561;
   static class180 field562;

   byte[] method491(byte[] var1, int var2) {
      try {
         if (this.field561 != null) {
            int var3 = (int)((long)var1.length * (long)(this.field560 * 278980631) / (long)(this.field556 * -931883257)) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            for(var7 = 0; var7 < var1.length; ++var7) {
               byte var8 = var1[var7];
               int[] var9 = this.field561[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  var4[var5 + var10] += var9[var10] * var8;
               }

               var6 += this.field560 * 278980631;
               var10 = var6 / (-931883257 * this.field556);
               var5 += var10;
               var6 -= var10 * -931883257 * this.field556;
            }

            var1 = new byte[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               int var12 = var4[var7] + '耀' >> 16;
               if (var12 < -128) {
                  var1[var7] = -128;
               } else if (var12 > 127) {
                  var1[var7] = 127;
               } else {
                  var1[var7] = (byte)var12;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "lf.a(" + ')');
      }
   }

   public short[] method492(short[] var1, byte var2) {
      try {
         if (this.field561 != null) {
            int var3 = (int)((long)(this.field560 * 278980631) * (long)var1.length / (long)(this.field556 * -931883257)) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            for(var7 = 0; var7 < var1.length; ++var7) {
               short var8 = var1[var7];
               int[] var9 = this.field561[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  var4[var10 + var5] += var9[var10] * var8 >> 2;
               }

               var6 += this.field560 * 278980631;
               var10 = var6 / (-931883257 * this.field556);
               var5 += var10;
               var6 -= var10 * this.field556 * -931883257;
            }

            var1 = new short[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               int var12 = 8192 + var4[var7] >> 14;
               if (var12 < -32768) {
                  var1[var7] = -32768;
               } else if (var12 > 32767) {
                  var1[var7] = 32767;
               } else {
                  var1[var7] = (short)var12;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "lf.f(" + ')');
      }
   }

   int method493(int var1, int var2) {
      try {
         if (this.field561 != null) {
            var1 = (int)((long)(278980631 * this.field560) * (long)var1 / (long)(-931883257 * this.field556));
         }

         return var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lf.b(" + ')');
      }
   }

   int method494(int var1, int var2) {
      try {
         if (this.field561 != null) {
            var1 = (int)((long)(278980631 * this.field560) * (long)var1 / (long)(-931883257 * this.field556)) + 6;
         }

         return var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lf.p(" + ')');
      }
   }

   public class91(int var1, int var2) {
      if (var2 != var1) {
         int var3 = class56.method1549(var1, var2, -2115860934);
         var1 /= var3;
         var2 /= var3;
         this.field556 = var1 * 597370551;
         this.field560 = 1817366439 * var2;
         this.field561 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.field561[var4];
            double var6 = 6.0D + (double)var4 / (double)var1;
            int var8 = (int)Math.floor(var6 - 7.0D + 1.0D);
            if (var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(var6 + 7.0D);
            if (var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = ((double)var8 - var6) * 3.141592653589793D;
               double var14 = var10;
               if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
               var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D);
            }
         }
      }

   }

   static final void method495(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= -783761378;
         var0.field891 = -970389233 * var2.field3161[681479919 * var2.field3156];
         if (var0.field891 * 684246511 > 1867913305 * var0.field893 - var0.field881 * -2093041337) {
            var0.field891 = 1227329079 * var0.field893 - var0.field881 * 2072992297;
         }

         if (684246511 * var0.field891 < 0) {
            var0.field891 = 0;
         }

         var0.field892 = -1915192419 * var2.field3161[1 + 681479919 * var2.field3156];
         if (-1424956747 * var0.field892 > var0.field894 * 2053897963 - 457937409 * var0.field887) {
            var0.field892 = 2097037087 * var0.field894 - -900266595 * var0.field887;
         }

         if (var0.field892 * -1424956747 < 0) {
            var0.field892 = 0;
         }

         class814.method2932(var0, -830371764);
         if (-1 == var0.field879 * -1309843523 && !var1.field1101) {
            class17.method3694(var0.field867 * -440872681, -754597349);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lf.cq(" + ')');
      }
   }

   static final void method496(class744 var0, int var1) {
      try {
         if (class730.field2914 * -1333485389 >= 5 && -1333485389 * class730.field2914 <= 9) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1333485389 * class730.field2914;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lf.uo(" + ')');
      }
   }

   static final void method497(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[681479919 * var0.field3156 + 1];
         int var4 = var3 >> 14 & 16383;
         int var5 = var3 & 16383;
         int var6 = class897.method5625(var2, var4, var5, (short)-30782);
         if (var6 < 0) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var6;
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lf.aev(" + ')');
      }
   }

   public static final void method498(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (var0 >= class534.field1416 * -1424479739 && var1 <= 1135094847 * class534.field1413 && var2 >= class534.field1414 * 1155384281 && var3 <= -1062447355 * class534.field1415) {
            class237.method4655(var0, var1, var2, var3, var4, -1435817713);
         } else {
            class129.method863(var0, var1, var2, var3, var4, 1926849708);
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "lf.x(" + ')');
      }
   }

   static final void method499(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9132.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lf.aox(" + ')');
      }
   }

   static final void method500(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9129.method4618((byte)78) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lf.ann(" + ')');
      }
   }
}
