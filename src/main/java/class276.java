public class class276 extends Node {
   int field10589;
   int field10590;

   class276(int var1, int var2) {
      this.field10589 = var1;
      this.field10590 = var2;
   }

   static void method6617(class497 var0, int var1, int var2) {
      try {
         if (class602.field8645) {
            class230 var3 = class600.method5467(-2115678267);
            int var4 = 0;

            int var6;
            for(MenuItem var5 = (MenuItem)var0.field8121.method2706(2119881606); var5 != null; var5 = (MenuItem)var0.field8121.method2707(-758930912)) {
               var6 = class631.method5861(var5, var3, 692106883);
               if (var6 > var4) {
                  var4 = var6;
               }
            }

            var4 += 8;
            int var10 = 21 + var0.field8120 * class602.field8634;
            class382.field1411 = (class602.field8663 ? 26 : 22) + class602.field8634 * var0.field8120;
            var6 = class809.field4595 + class622.field9006;
            if (var6 + var4 > class759.field4331) {
               var6 = class622.field9006 - var4;
            }

            if (var6 < 0) {
               var6 = 0;
            }

            int var7 = class602.field8663 ? 20 + var3.field8230 + 1 : 31;
            int var8 = 1 + var3.field8230 + (var1 - var7);
            if (var8 + var10 > class97.field614) {
               var8 = class97.field614 - var10;
            }

            if (var8 < 0) {
               var8 = 0;
            }

            class514.field4319 = var6;
            class936.field10310 = var8;
            class965.field2535 = var4;
            class602.field8639 = var0;
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "abx.q(" + ')');
      }
   }

   static void method6618(class848 var0, class392 var1, class718 var2, int var3, int var4, int var5, int var6, class219 var7, int var8) {
      try {
         int var9 = var4 - var6 / 2 - 5;
         int var10 = var5 + 2;
         if (var2.field3502 != 0) {
            var0.method4833(var9, var10, var6 + 10, var5 + var3 * var7.method3973() - var10 + 1, var2.field3502, (byte)7);
         }

         if (var2.field3517 != 0) {
            var0.method4832(var9, var10, var6 + 10, var5 + var3 * var7.method3973() - var10 + 1, var2.field3517, -1130300720);
         }

         int var11 = var2.field3496;
         if (var1.field5399 && var2.field3497 != -1) {
            var11 = var2.field3497;
         }

         for(int var12 = 0; var12 < var3; ++var12) {
            String var13 = class740.field3212[var12];
            if (var12 < var3 - 1) {
               var13 = var13.substring(0, var13.length() - 4);
            }

            var7.method3972(var0, var13, var4, var5, var11, true);
            var5 += var7.method3973();
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "abx.bj(" + ')');
      }
   }

   static final void method6619(int var0) {
      try {
         int var1 = 256 + class747.field4147 * 512;
         int var2 = 256 + class124.field2411 * 512;
         int var3 = class679.method4271(var1, var2, class899.field9552, -1586416356) - class607.field8561;
         if (class75.field1495 >= 100) {
            class103.field205 = 256 + class747.field4147 * 512;
            class7.field4918 = 256 + class124.field2411 * 512;
            class184.field5230 = class679.method4271(class103.field205, class7.field4918, class899.field9552, -1881231282) - class607.field8561;
         } else {
            if (class103.field205 < var1) {
               class103.field205 += class75.field1495 * (var1 - class103.field205) / 1000 + class83.field1100;
               if (class103.field205 > var1) {
                  class103.field205 = var1;
               }
            }

            if (class103.field205 > var1) {
               class103.field205 -= class83.field1100 + (class103.field205 - var1) * class75.field1495 / 1000;
               if (class103.field205 < var1) {
                  class103.field205 = var1;
               }
            }

            if (class184.field5230 < var3) {
               class184.field5230 += (var3 - class184.field5230) * class75.field1495 / 1000 + class83.field1100;
               if (class184.field5230 > var3) {
                  class184.field5230 = var3;
               }
            }

            if (class184.field5230 > var3) {
               class184.field5230 -= class83.field1100 + (class184.field5230 - var3) * class75.field1495 / 1000;
               if (class184.field5230 < var3) {
                  class184.field5230 = var3;
               }
            }

            if (class7.field4918 < var2) {
               class7.field4918 += class83.field1100 + class75.field1495 * (var2 - class7.field4918) / 1000;
               if (class7.field4918 > var2) {
                  class7.field4918 = var2;
               }
            }

            if (class7.field4918 > var2) {
               class7.field4918 -= class83.field1100 + (class7.field4918 - var2) * class75.field1495 / 1000;
               if (class7.field4918 < var2) {
                  class7.field4918 = var2;
               }
            }
         }

         var1 = 256 + class454.field7231 * 512;
         var2 = 256 + class764.field4349 * 512;
         var3 = class679.method4271(var1, var2, class899.field9552, -1098953725) - class637.field9857;
         int var4 = var1 - class103.field205;
         int var5 = var3 - class184.field5230;
         int var6 = var2 - class7.field4918;
         int var7 = (int)Math.sqrt((double)(var6 * var6 + var4 * var4));
         int var8 = (int)(Math.atan2((double)var5, (double)var7) * 2607.5945876176133D) & 16383;
         int var9 = (int)(Math.atan2((double)var4, (double)var6) * -2607.5945876176133D) & 16383;
         if (var8 < 1024) {
            var8 = 1024;
         }

         if (var8 > 3072) {
            var8 = 3072;
         }

         if (class730.field2737 < var8) {
            class730.field2737 += (var8 - class730.field2737 >> 3) * class617.field8843 / 1000 + class665.field9598 << 3;
            if (class730.field2737 > var8) {
               class730.field2737 = var8;
            }
         }

         if (class730.field2737 > var8) {
            class730.field2737 -= class617.field8843 * (class730.field2737 - var8 >> 3) / 1000 + class665.field9598 << 3;
            if (class730.field2737 < var8) {
               class730.field2737 = var8;
            }
         }

         int var10 = var9 - class232.field8266;
         if (var10 > 8192) {
            var10 -= 16384;
         }

         if (var10 < -8192) {
            var10 += 16384;
         }

         var10 >>= 3;
         if (var10 > 0) {
            class232.field8266 += class617.field8843 * var10 / 1000 + class665.field9598 << 3;
            class232.field8266 &= 16383;
         }

         if (var10 < 0) {
            class232.field8266 -= class665.field9598 + -var10 * class617.field8843 / 1000 << 3;
            class232.field8266 &= 16383;
         }

         int var11 = var9 - class232.field8266;
         if (var11 > 8192) {
            var11 -= 16384;
         }

         if (var11 < -8192) {
            var11 += 16384;
         }

         if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
            class232.field8266 = var9;
         }

         class791.field446 = 0;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "abx.ho(" + ')');
      }
   }

   static final void method6620(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1593702044) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field970 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "abx.lg(" + ')');
      }
   }
}
