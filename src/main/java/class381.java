public class class381 {
   static int[][] field1412;
   static int field1413 = 100;
   static int field1414 = 0;
   static int field1415 = 100;
   static int field1416 = 0;
   public static class352 field1417;

   class381() throws Throwable {
      throw new Error();
   }

   static final void method1062(class744 var0, int var1) {
      try {
         var0.field3156 -= 4;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[var0.field3156 + 2];
         int var5 = var0.field3161[var0.field3156 + 3];
         class389 var6 = class730.field2697.method5270(681479919);
         class700.method6329((var2 >> 14 & 16383) - var6.field1521, (var2 & 16383) - var6.field1522, var3 << 2, var4, var5, false);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "pl.aga(" + ')');
      }
   }

   static final void method1063(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9135.method5225((byte)-30);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pl.aju(" + ')');
      }
   }

   public static boolean method1064(int var0, String var1, int var2) {
      try {
         class601.field9203 = new class764();
         class601.field9203.field4347 = var0;
         class601.field9203.field4343 = var1;
         if (class721.field3634 != class916.field10415) {
            class601.field9203.field4344 = 815680320 + class601.field9203.field4347 * 183093373;
            class601.field9203.field4345 = -52655920 + class601.field9203.field4347 * 1934452217;
         }

         return true;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pl.f(" + ')');
      }
   }

   public static class180 method1065(class200 var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         if (class593.field1624 == null) {
            class593.field1624 = new class702[class679.method4268(1608416895)];
         }

         class675 var5 = null;
         int var6 = var0.method4349(958180062);
         if (class69.field1816 != null) {
            var5 = new class675(var6, class69.field1816, class785.field3828[var6], 1500000);
         }

         class593.field1624[var6] = class117.field1868.method6183(var6, var5, class199.field7037, 311001416);
         class593.field1624[var6].method1965((byte)2);
         return new class180(class593.field1624[var6], var1, var2);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "pl.fz(" + ')');
      }
   }

   public static void method1066(class564[] var0, int var1, int var2, int var3, boolean var4, short var5) {
      try {
         for(int var6 = 0; var6 < var0.length; ++var6) {
            class564 var7 = var0[var6];
            if (var7 != null) {
               if (var7.field885 != var1) {
                  if (var5 == 255) {
                     break;
                  }
               } else {
                  class929.method6263(var7, var2, var3, var4, (byte)59);
                  class99.method537(var7, var2, var3, (byte)-3);
                  if (var7.field891 > var7.field893 - var7.field881) {
                     var7.field891 = var7.field893 - var7.field881;
                  }

                  if (var7.field891 < 0) {
                     var7.field891 = 0;
                  }

                  if (var7.field892 > var7.field894 - var7.field887) {
                     var7.field892 = var7.field894 - var7.field887;
                  }

                  if (var7.field892 < 0) {
                     var7.field892 = 0;
                  }

                  if (var7.field869 == 0) {
                     class118.method1465(var0, var7, var4, (short)319);
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "pl.ky(" + ')');
      }
   }

   static void method1067(int var0) {
      try {
         class498.field8102 = 0;

         for(int var1 = 0; var1 < 2048; ++var1) {
            class498.field8106[var1] = null;
            class498.field8105[var1] = class647.field9228.field9230;
            class498.field8111[var1] = null;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pl.x(" + ')');
      }
   }

   static final boolean method1068(int var0, int var1, int var2, class312 var3, class262 var4, byte var5) {
      try {
         int var6 = var0;
         int var7 = var1;
         byte var8 = 64;
         byte var9 = 64;
         int var10 = var0 - var8;
         int var11 = var1 - var9;
         class56.field2314[var8][var9] = 99;
         class56.field2318[var8][var9] = 0;
         byte var12 = 0;
         int var13 = 0;
         class56.field2315[var12] = var0;
         int var22 = var12 + 1;
         class56.field2312[var12] = var1;
         int[][] var14 = var4.field8183;

         label268:
         while(var13 != var22) {
            var6 = class56.field2315[var13];
            var7 = class56.field2312[var13];
            var13 = var13 + 1 & 4095;
            int var20 = var6 - var10;
            int var21 = var7 - var11;
            int var15 = var6 - var4.field8179;
            int var16 = var7 - var4.field8180;
            if (var3.method415(var2, var6, var7, var4, -16711936)) {
               class56.field2316 = var6;
               class78.field1500 = var7;
               return true;
            }

            int var17 = class56.field2318[var20][var21] + 1;
            int var18;
            if (var20 > 0 && class56.field2314[var20 - 1][var21] == 0) {
               if ((var14[var15 - 1][var16] & 1134821376) != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else if ((var14[var15 - 1][var2 + var16 - 1] & 1310982144) == 0) {
                  label274: {
                     for(var18 = 1; var18 < var2 - 1; ++var18) {
                        if ((var14[var15 - 1][var16 + var18] & 1336147968) != 0) {
                           if (var5 <= 36) {
                              throw new IllegalStateException();
                           }
                           break label274;
                        }
                     }

                     class56.field2315[var22] = var6 - 1;
                     class56.field2312[var22] = var7;
                     var22 = 1 + var22 & 4095;
                     class56.field2314[var20 - 1][var21] = 2;
                     class56.field2318[var20 - 1][var21] = var17;
                  }
               }
            }

            if (var20 < 128 - var2) {
               if (class56.field2314[1 + var20][var21] != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else if ((var14[var15 + var2][var16] & 1625554944) == 0 && (var14[var2 + var15][var2 + var16 - 1] & 2015625216) == 0) {
                  label276: {
                     for(var18 = 1; var18 < var2 - 1; ++var18) {
                        if ((var14[var2 + var15][var16 + var18] & 2028208128) != 0) {
                           if (var5 <= 36) {
                              throw new IllegalStateException();
                           }
                           break label276;
                        }
                     }

                     class56.field2315[var22] = 1 + var6;
                     class56.field2312[var22] = var7;
                     var22 = 1 + var22 & 4095;
                     class56.field2314[var20 + 1][var21] = 8;
                     class56.field2318[var20 + 1][var21] = var17;
                  }
               }
            }

            if (var21 > 0) {
               if (class56.field2314[var20][var21 - 1] != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else if ((var14[var15][var16 - 1] & 1134821376) != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else if ((var14[var15 + var2 - 1][var16 - 1] & 1625554944) == 0) {
                  var18 = 1;

                  while(true) {
                     if (var18 >= var2 - 1) {
                        class56.field2315[var22] = var6;
                        class56.field2312[var22] = var7 - 1;
                        var22 = 1 + var22 & 4095;
                        class56.field2314[var20][var21 - 1] = 1;
                        class56.field2318[var20][var21 - 1] = var17;
                        break;
                     }

                     if ((var14[var18 + var15][var16 - 1] & 1675886592) != 0) {
                        break;
                     }

                     ++var18;
                  }
               }
            }

            if (var21 < 128 - var2 && class56.field2314[var20][var21 + 1] == 0 && (var14[var15][var2 + var16] & 1310982144) == 0 && (var14[var15 + var2 - 1][var16 + var2] & 2015625216) == 0) {
               label279: {
                  for(var18 = 1; var18 < var2 - 1; ++var18) {
                     if ((var14[var18 + var15][var2 + var16] & 2116288512) != 0) {
                        if (var5 <= 36) {
                           throw new IllegalStateException();
                        }
                        break label279;
                     }
                  }

                  class56.field2315[var22] = var6;
                  class56.field2312[var22] = var7 + 1;
                  var22 = var22 + 1 & 4095;
                  class56.field2314[var20][1 + var21] = 4;
                  class56.field2318[var20][var21 + 1] = var17;
               }
            }

            if (var20 > 0 && var21 > 0) {
               if (class56.field2314[var20 - 1][var21 - 1] != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else if ((var14[var15 - 1][var16 - 1] & 1134821376) != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else {
                  var18 = 1;

                  while(true) {
                     if (var18 >= var2) {
                        class56.field2315[var22] = var6 - 1;
                        class56.field2312[var22] = var7 - 1;
                        var22 = var22 + 1 & 4095;
                        class56.field2314[var20 - 1][var21 - 1] = 3;
                        class56.field2318[var20 - 1][var21 - 1] = var17;
                        break;
                     }

                     if ((var14[var15 - 1][var16 - 1 + var18] & 1336147968) != 0 || (var14[var15 - 1 + var18][var16 - 1] & 1675886592) != 0) {
                        break;
                     }

                     ++var18;
                  }
               }
            }

            if (var20 < 128 - var2 && var21 > 0 && class56.field2314[1 + var20][var21 - 1] == 0 && (var14[var2 + var15][var16 - 1] & 1625554944) == 0) {
               label282: {
                  for(var18 = 1; var18 < var2; ++var18) {
                     if ((var14[var15 + var2][var16 - 1 + var18] & 2028208128) != 0) {
                        if (var5 <= 36) {
                           throw new IllegalStateException();
                        }
                        break label282;
                     }

                     if ((var14[var15 + var18][var16 - 1] & 1675886592) != 0) {
                        break label282;
                     }
                  }

                  class56.field2315[var22] = var6 + 1;
                  class56.field2312[var22] = var7 - 1;
                  var22 = var22 + 1 & 4095;
                  class56.field2314[var20 + 1][var21 - 1] = 9;
                  class56.field2318[var20 + 1][var21 - 1] = var17;
               }
            }

            if (var20 > 0 && var21 < 128 - var2 && class56.field2314[var20 - 1][1 + var21] == 0 && (var14[var15 - 1][var2 + var16] & 1310982144) == 0) {
               label284: {
                  for(var18 = 1; var18 < var2; ++var18) {
                     if ((var14[var15 - 1][var18 + var16] & 1336147968) != 0) {
                        if (var5 <= 36) {
                           throw new IllegalStateException();
                        }
                        break label284;
                     }

                     if ((var14[var18 + (var15 - 1)][var2 + var16] & 2116288512) != 0) {
                        break label284;
                     }
                  }

                  class56.field2315[var22] = var6 - 1;
                  class56.field2312[var22] = 1 + var7;
                  var22 = 1 + var22 & 4095;
                  class56.field2314[var20 - 1][1 + var21] = 6;
                  class56.field2318[var20 - 1][1 + var21] = var17;
               }
            }

            if (var20 < 128 - var2 && var21 < 128 - var2 && class56.field2314[1 + var20][1 + var21] == 0) {
               if ((var14[var2 + var15][var16 + var2] & 2015625216) != 0) {
                  if (var5 <= 36) {
                     throw new IllegalStateException();
                  }
               } else {
                  for(var18 = 1; var18 < var2; ++var18) {
                     if ((var14[var15 + var18][var16 + var2] & 2116288512) != 0 || (var14[var15 + var2][var18 + var16] & 2028208128) != 0) {
                        continue label268;
                     }
                  }

                  class56.field2315[var22] = var6 + 1;
                  class56.field2312[var22] = 1 + var7;
                  var22 = var22 + 1 & 4095;
                  class56.field2314[var20 + 1][1 + var21] = 12;
                  class56.field2318[var20 + 1][var21 + 1] = var17;
               }
            }
         }

         class56.field2316 = var6;
         class78.field1500 = var7;
         return false;
      } catch (RuntimeException var19) {
         throw class158.method3445(var19, "pl.p(" + ')');
      }
   }

   static void method1069(int var0, short var1) {
      try {
         class253.field7970 = var0;
         class921.field10285.method2977();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pl.f(" + ')');
      }
   }

   static void method1070(int var0) {
      try {
         class202.field7587 = null;
         class958.field3479 = null;
         class501.field3182 = null;
         class120.field2291 = null;
         class916.field10419 = null;
         class18.field6933 = null;
         class535.field3709 = null;
         class634.field9790 = null;
         class295.field10478 = null;
         class984.field3145 = null;
         class974.field2983 = null;
         class307.field427 = null;
         class324.field621 = null;
         class422.field9603 = null;
         class932.field10344 = null;
         class322.field842 = null;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pl.u(" + ')');
      }
   }
}
