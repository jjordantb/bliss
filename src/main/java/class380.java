import java.util.Random;

public class class380 {
   static int[] field1467;
   class753 field1468;
   class753 field1469;
   class753 field1470;
   class753 field1471;
   class753 field1472;
   int field1473 = 100;
   class753 field1474;
   int[] field1475 = new int[5];
   int[] field1476 = new int[5];
   int[] field1477 = new int[5];
   int field1478 = 0;
   class777 field1479;
   static int[] field1480;
   static int[] field1481;
   int field1482 = 500;
   int field1483 = 0;
   static int[] field1484;
   static int[] field1485 = new int['耀'];
   class753 field1486;
   class753 field1487;
   class753 field1488;
   static int[] field1489;
   static int[] field1490;
   static int[] field1491;
   static double field1492 = 1.0057929410678534D;

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1485[var1] = (var0.nextInt() & 2) - 1;
      }

      field1480 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1480[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1484 = new int[220500];
      field1467 = new int[5];
      field1489 = new int[5];
      field1490 = new int[5];
      field1491 = new int[5];
      field1481 = new int[5];
   }

   final int method1114(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field1480[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field1485[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method1115(InputStream var1) {
      this.field1486 = new class753();
      this.field1486.method2618(var1);
      this.field1468 = new class753();
      this.field1468.method2618(var1);
      int var2 = var1.method6371();
      if (var2 != 0) {
         --var1.field10376;
         this.field1469 = new class753();
         this.field1469.method2618(var1);
         this.field1470 = new class753();
         this.field1470.method2618(var1);
      }

      var2 = var1.method6371();
      if (var2 != 0) {
         --var1.field10376;
         this.field1471 = new class753();
         this.field1471.method2618(var1);
         this.field1472 = new class753();
         this.field1472.method2618(var1);
      }

      var2 = var1.method6371();
      if (var2 != 0) {
         --var1.field10376;
         this.field1488 = new class753();
         this.field1488.method2618(var1);
         this.field1474 = new class753();
         this.field1474.method2618(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method6382(1723054621);
         if (var4 == 0) {
            break;
         }

         this.field1475[var3] = var4;
         this.field1476[var3] = var1.method6422(590991010);
         this.field1477[var3] = var1.method6382(1723054621);
      }

      this.field1478 = var1.method6382(1723054621);
      this.field1473 = var1.method6382(1723054621);
      this.field1482 = var1.method6374();
      this.field1483 = var1.method6374();
      this.field1479 = new class777();
      this.field1487 = new class753();
      this.field1479.method2285(var1, this.field1487);
   }

   final int[] method1116(int var1, int var2) {
      class901.method6356(field1484, 0, var1);
      if (var2 < 10) {
         return field1484;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.field1486.method2620();
         this.field1468.method2620();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field1469 != null) {
            this.field1469.method2620();
            this.field1470.method2620();
            var5 = (int)((double)(this.field1469.field4154 - this.field1469.field4153) * 32.768D / var3);
            var6 = (int)((double)this.field1469.field4153 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field1471 != null) {
            this.field1471.method2620();
            this.field1472.method2620();
            var8 = (int)((double)(this.field1471.field4154 - this.field1471.field4153) * 32.768D / var3);
            var9 = (int)((double)this.field1471.field4153 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field1475[var11] != 0) {
               field1467[var11] = 0;
               field1489[var11] = (int)((double)this.field1477[var11] * var3);
               field1490[var11] = (this.field1475[var11] << 14) / 100;
               field1491[var11] = (int)((double)(this.field1486.field4154 - this.field1486.field4153) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1476[var11]) / var3);
               field1481[var11] = (int)((double)this.field1486.field4153 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field1486.method2617(var1);
            var13 = this.field1468.method2617(var1);
            if (this.field1469 != null) {
               var14 = this.field1469.method2617(var1);
               var15 = this.field1470.method2617(var1);
               var12 += this.method1114(var7, var15, this.field1469.field4155) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field1471 != null) {
               var14 = this.field1471.method2617(var1);
               var15 = this.field1472.method2617(var1);
               var13 = var13 * ((this.method1114(var10, var15, this.field1471.field4155) >> 1) + '耀') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field1475[var14] != 0) {
                  var15 = var11 + field1489[var14];
                  if (var15 < var1) {
                     field1484[var15] += this.method1114(field1467[var14], var13 * field1490[var14] >> 15, this.field1486.field4155);
                     field1467[var14] += (var12 * field1491[var14] >> 16) + field1481[var14];
                  }
               }
            }
         }

         int var16;
         int var17;
         if (this.field1488 != null) {
            this.field1488.method2620();
            this.field1474.method2620();
            var11 = 0;
            boolean var18 = false;
            boolean var19 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field1488.method2617(var1);
               var16 = this.field1474.method2617(var1);
               if (var19) {
                  var17 = this.field1488.field4153 + ((this.field1488.field4154 - this.field1488.field4153) * var15 >> 8);
               } else {
                  var17 = this.field1488.field4153 + ((this.field1488.field4154 - this.field1488.field4153) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var17) {
                  var11 = 0;
                  var19 = !var19;
               }

               if (var19) {
                  field1484[var14] = 0;
               }
            }
         }

         if (this.field1478 > 0 && this.field1473 > 0) {
            var11 = (int)((double)this.field1478 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               field1484[var12] += field1484[var12 - var11] * this.field1473 / 100;
            }
         }

         if (this.field1479.field3714[0] > 0 || this.field1479.field3714[1] > 0) {
            this.field1487.method2620();
            var11 = this.field1487.method2617(var1 + 1);
            var12 = this.field1479.method2286(0, (float)var11 / 65536.0F);
            var13 = this.field1479.method2286(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               while(var14 < var15) {
                  var16 = (int)((long)field1484[var14 + var12] * (long)class777.field3713 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field1484[var14 + var12 - 1 - var17] * (long)class777.field3716[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field1484[var14 - 1 - var17] * (long)class777.field3716[1][var17] >> 16);
                  }

                  field1484[var14] = var16;
                  var11 = this.field1487.method2617(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  while(var14 < var15) {
                     var16 = (int)((long)field1484[var14 + var12] * (long)class777.field3713 >> 16);

                     for(var17 = 0; var17 < var12; ++var17) {
                        var16 += (int)((long)field1484[var14 + var12 - 1 - var17] * (long)class777.field3716[0][var17] >> 16);
                     }

                     for(var17 = 0; var17 < var13; ++var17) {
                        var16 -= (int)((long)field1484[var14 - 1 - var17] * (long)class777.field3716[1][var17] >> 16);
                     }

                     field1484[var14] = var16;
                     var11 = this.field1487.method2617(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var16 = 0;

                        for(var17 = var14 + var12 - var1; var17 < var12; ++var17) {
                           var16 += (int)((long)field1484[var14 + var12 - 1 - var17] * (long)class777.field3716[0][var17] >> 16);
                        }

                        for(var17 = 0; var17 < var13; ++var17) {
                           var16 -= (int)((long)field1484[var14 - 1 - var17] * (long)class777.field3716[1][var17] >> 16);
                        }

                        field1484[var14] = var16;
                        this.field1487.method2617(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field1479.method2286(0, (float)var11 / 65536.0F);
                  var13 = this.field1479.method2286(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field1484[var11] < -32768) {
               field1484[var11] = -32768;
            }

            if (field1484[var11] > 32767) {
               field1484[var11] = 32767;
            }
         }

         return field1484;
      }
   }
}
