public class class113 extends class535 {
   public static int field2016 = 1;
   public static int field2017 = 3;
   public static int field2018 = 4;
   public static int field2019 = 0;
   public static int field2020 = 2;

   int method2273(int var1, int var2) {
      return 1;
   }

   public class113(int var1, class838 var2) {
      super(var1, var2);
   }

   public void method1406(int var1) {
      try {
         if (-1598873795 * this.field3708 < 0 || -1598873795 * this.field3708 > 4) {
            this.field3708 = this.method2272(843701468) * 1886334997;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aeg.s(" + ')');
      }
   }

   int method2272(int var1) {
      return 0;
   }

   void method2271(int var1) {
      this.field3708 = 1886334997 * var1;
   }

   int method2276() {
      return 0;
   }

   public int method1407(int var1) {
      try {
         return this.field3708 * -1598873795;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aeg.z(" + ')');
      }
   }

   public class113(class838 var1) {
      super(var1);
   }

   void method2275(int var1, int var2) {
      try {
         this.field3708 = 1886334997 * var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aeg.p(" + ')');
      }
   }

   int method2277(int var1) {
      return 1;
   }

   static final void method1408(int var0) {
      try {
         if (class615.field8903.field9131.method5267(-2013953489) == 2) {
            byte[][][] var1 = class730.field2697.method5284(899241973);
            byte var2 = (byte)(-1953789277 * class730.field2758 - 4 & 255);
            int var3 = -1953789277 * class730.field2758 % class730.field2697.method5271(-2129604944);

            int var4;
            int var5;
            for(var4 = 0; var4 < 4; ++var4) {
               for(var5 = 0; var5 < class730.field2697.method5272(-605085367); ++var5) {
                  var1[var4][var3][var5] = var2;
               }
            }

            if (class899.field9552 * 1855729883 != 3) {
               for(var4 = 0; var4 < 2; ++var4) {
                  class730.field2774[var4] = -1000000;
                  class730.field2651[var4] = 1000000;
                  class730.field2776[var4] = 0;
                  class730.field2778[var4] = 1000000;
                  class730.field2622[var4] = 0;
               }

               class32 var18 = class923.field10295.method1511().field7637;
               var5 = (int)var18.field5296;
               int var6 = (int)var18.field5299;
               class153 var7 = class730.field2697.method5296(688600578);
               class545 var8 = class730.field2697.method5317(-1611682495);
               int var9;
               if (class563.field1083 * -863531439 != 4 && class495.field8099 * 1329981847 == -1) {
                  var9 = class679.method4271(class103.field205 * -1740717447, class7.field4918 * -299812095, class899.field9552 * 1855729883, -1780642340);
                  if (var9 - class184.field5230 * 1449634147 < 3200 && (var7.field5406[class899.field9552 * 1855729883][class103.field205 * -1740717447 >> 9][-299812095 * class7.field4918 >> 9] & 4) != 0) {
                     class762.method2812(var8.field3861, 1, class103.field205 * -1740717447 >> 9, -299812095 * class7.field4918 >> 9, false, -777988087);
                  }
               } else {
                  if (-863531439 * class563.field1083 != 4) {
                     var5 = 1329981847 * class495.field8099;
                     var6 = class516.field4332 * -1106950801;
                  }

                  if ((var7.field5406[1855729883 * class899.field9552][var5 >> 9][var6 >> 9] & 4) != 0) {
                     class762.method2812(var8.field3861, 0, var5 >> 9, var6 >> 9, false, -777988087);
                  } else if (class730.field2737 * -104436553 < 2560) {
                     var9 = -1740717447 * class103.field205 >> 9;
                     int var10 = class7.field4918 * -299812095 >> 9;
                     int var11 = var5 >> 9;
                     int var12 = var6 >> 9;
                     int var13;
                     if (var11 > var9) {
                        var13 = var11 - var9;
                     } else {
                        var13 = var9 - var11;
                     }

                     int var14;
                     if (var12 > var10) {
                        var14 = var12 - var10;
                     } else {
                        var14 = var10 - var12;
                     }

                     if ((var13 != 0 || var14 != 0) && var13 > -class730.field2697.method5271(-1952640446) && var13 < class730.field2697.method5271(-2135239698) && var14 > -class730.field2697.method5272(115807107) && var14 < class730.field2697.method5272(-1212701794)) {
                        int var16;
                        int var19;
                        if (var13 > var14) {
                           var19 = var14 * 65536 / var13;
                           var16 = 32768;

                           while(var11 != var9) {
                              if (var9 < var11) {
                                 ++var9;
                              } else if (var9 > var11) {
                                 --var9;
                              }

                              if ((var7.field5406[1855729883 * class899.field9552][var9][var10] & 4) != 0) {
                                 class762.method2812(var8.field3861, 1, var9, var10, false, -777988087);
                                 break;
                              }

                              var16 += var19;
                              if (var16 >= 65536) {
                                 var16 -= 65536;
                                 if (var10 < var12) {
                                    ++var10;
                                 } else if (var10 > var12) {
                                    --var10;
                                 }

                                 if ((var7.field5406[1855729883 * class899.field9552][var9][var10] & 4) != 0) {
                                    class762.method2812(var8.field3861, 1, var9, var10, false, -777988087);
                                    break;
                                 }
                              }
                           }
                        } else {
                           var19 = 65536 * var13 / var14;
                           var16 = 32768;

                           while(var10 != var12) {
                              if (var10 < var12) {
                                 ++var10;
                              } else if (var10 > var12) {
                                 --var10;
                              }

                              if ((var7.field5406[class899.field9552 * 1855729883][var9][var10] & 4) != 0) {
                                 class762.method2812(var8.field3861, 1, var9, var10, false, -777988087);
                                 break;
                              }

                              var16 += var19;
                              if (var16 >= 65536) {
                                 var16 -= 65536;
                                 if (var9 < var11) {
                                    ++var9;
                                 } else if (var9 > var11) {
                                    --var9;
                                 }

                                 if ((var7.field5406[1855729883 * class899.field9552][var9][var10] & 4) != 0) {
                                    class762.method2812(var8.field3861, 1, var9, var10, false, -777988087);
                                    break;
                                 }
                              }
                           }
                        }
                     } else {
                        class389 var15 = class730.field2697.method5270(681479919);
                        class764.method2747(var9 + class822.field9050 + var10 + " " + var11 + class822.field9050 + var12 + " " + var15.field1521 * -1760580017 + class822.field9050 + var15.field1522 * 283514611, new RuntimeException(), (short)-16769);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "aeg.io(" + ')');
      }
   }

   public static void method1409(String var0, short var1) {
      try {
         class702.method1969(0, 0, "", "", "", var0, -1848058692);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aeg.f(" + ')');
      }
   }
}
