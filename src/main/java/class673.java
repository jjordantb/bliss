public final class class673 {
   static class391 field7507 = new class391();
   static class741 field7508 = new class741();
   static short field7509;
   static class351 field7510 = new class351();
   static class164 field7511 = new class164();
   static class860 field7512 = new class860();
   static class670 field7513 = new class670();

   class673() throws Throwable {
      throw new Error();
   }

   public static int method4257(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (1 == (var5 & 1)) {
            int var7 = var3;
            var3 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if (var2 == 0) {
            return var1;
         } else if (var2 == 1) {
            return 7 - var0 - (var3 - 1);
         } else {
            return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "nd.k(" + ')');
      }
   }

   static final void method4258(class307 var0, short var1) {
      try {
         class513 var2 = class730.field2692.field7768;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (class307.field425 == var0) {
            var3 = var2.method6410((byte)109);
            var4 = var2.method6395(-1014855659);
            var5 = var4 >> 2;
            var6 = var4 & 3;
            var7 = class730.field2720[var5];
            var8 = var2.method6396((short)-10129);
            var9 = class420.field9722 + (var8 >> 4 & 7);
            var10 = (var8 & 7) + class82.field1109;
            if (class730.field2697.method5316(-586078948) != class335.field44) {
               class814.method2933(class509.field4023, var9, var10, var7, var5, var6, var3, -1921538188);
            }
         } else {
            int var11;
            int var12;
            int var13;
            int var14;
            int var16;
            int var17;
            int var18;
            if (class307.field432 == var0) {
               var3 = var2.method6397((byte)112);
               var4 = var3 >> 2;
               var5 = class730.field2720[var4];
               var6 = var2.method6397((byte)92);
               var7 = (var6 >> 4 & 7) + class420.field9722;
               var8 = (var6 & 7) + class82.field1109;
               var9 = var2.method6409(-1682120369);
               ObjectDefinition var26 = class730.field2697.method5283(-527347356).method4713(var9);
               var11 = var2.method6395(-1014855659);
               if (var4 == class15.field6912.field6921) {
                  var4 = class15.field6919.field6921;
               }

               var12 = 0;
               if (var26.field2262 != null) {
                  var13 = -1;

                  for(var14 = 0; var14 < var26.field2262.length; ++var14) {
                     if (var4 == var26.field2262[var14]) {
                        var13 = var14;
                        break;
                     }
                  }

                  var12 = var26.field2206[var13].length;
               }

               var13 = 0;
               if (var26.field2199 != null) {
                  var13 = var26.field2199.length;
               }

               var14 = 0;
               if (var26.field2205 != null) {
                  var14 = var26.field2205.length;
               }

               if (1 == (var11 & 1)) {
                  class337.method78(class509.field4023, var7, var8, var5, var9, var4, (class552)null, (byte)-43);
               } else {
                  int[] var15 = null;
                  if ((var11 & 2) == 2) {
                     var15 = new int[var12];

                     for(var16 = 0; var16 < var12; ++var16) {
                        var15[var16] = var2.method6420((byte)-37);
                     }
                  }

                  short[] var38 = null;
                  if (4 == (var11 & 4)) {
                     var38 = new short[var13];

                     for(var17 = 0; var17 < var13; ++var17) {
                        var38[var17] = (short)var2.method6374();
                     }
                  }

                  short[] var41 = null;
                  if (8 == (var11 & 8)) {
                     var41 = new short[var14];

                     for(var18 = 0; var18 < var14; ++var18) {
                        var41[var18] = (short)var2.method6374();
                     }
                  }

                  class337.method78(class509.field4023, var7, var8, var5, var9, var4, new class552(class563.field1082, var15, var38, var41), (byte)8);
                  ++class563.field1082;
               }
            } else if (var0 == class307.field423) {
               var3 = var2.method6396((short)-27580);
               var4 = var3 >> 2;
               var5 = var3 & 3;
               var6 = class730.field2720[var4];
               var7 = var2.method6395(-1014855659);
               var8 = (var7 >> 4 & 7) + class420.field9722;
               var9 = (var7 & 7) + class82.field1109;
               if (class730.field2697.method5316(99999280).method37((byte)-3) || var8 >= 0 && var9 >= 0 && var8 < class730.field2697.method5271(-1871735876) && var9 < class730.field2697.method5272(-164212893)) {
                  class965.method1716(class509.field4023, var8, var9, var6, -1, var4, var5, 322889547);
               }
            } else {
               int var37;
               if (class307.field433 == var0) {
                  var3 = var2.method6371();
                  boolean var22 = (var3 & 128) != 0;
                  var5 = class420.field9722 + (var3 >> 3 & 7);
                  var6 = (var3 & 7) + class82.field1109;
                  var7 = var5 + var2.method6372(-12558881);
                  var8 = var6 + var2.method6372(-12558881);
                  var9 = var2.method6367(1998351313);
                  var10 = var2.method6374();
                  var11 = var2.method6371() * 4;
                  var12 = var2.method6371() * 4;
                  var13 = var2.method6374();
                  var14 = var2.method6374();
                  var37 = var2.method6371();
                  var16 = var2.method6374();
                  if (var37 == 255) {
                     var37 = -1;
                  }

                  if (class730.field2697.method5316(-135283377) != class335.field44 && var5 >= 0 && var6 >= 0 && var5 < class730.field2697.method5271(-2115187525) && var6 < class730.field2697.method5272(1222512663) && var7 >= 0 && var8 >= 0 && var7 < class730.field2697.method5271(-2121627992) && var8 < class730.field2697.method5272(-2081531222) && var10 != 65535) {
                     var5 = 256 + 512 * var5;
                     var6 = 256 + 512 * var6;
                     var7 = 256 + var7 * 512;
                     var8 = var8 * 512 + 256;
                     var11 <<= 2;
                     var12 <<= 2;
                     var16 <<= 2;
                     class214 var42 = new class214(class730.field2697.method5317(-1611682495), var10, class509.field4023, class509.field4023, var5, var6, var11, var13 + class730.field2866, class730.field2866 + var14, var37, var16, 0, var9, var12, var22, -1);
                     var42.method3782(var7, var8, class679.method4271(var7, var8, class509.field4023, -1671970391) - var12, class730.field2866 + var13, -53743739);
                     class730.field2805.method897(new class107(var42), 719403792);
                  }
               } else {
                  class389 var23;
                  if (var0 == class307.field429) {
                     var3 = var2.method6395(-1014855659);
                     var23 = class730.field2697.method5270(681479919);
                     var5 = (var3 & 7) + class82.field1109;
                     var6 = var5 + var23.field1522;
                     var7 = class420.field9722 + (var3 >> 4 & 7);
                     var8 = var23.field1521 + var7;
                     var9 = var2.method6403(1478539457);
                     var10 = var2.method6401((byte)-118);
                     boolean var30 = var7 >= 0 && var5 >= 0 && var7 < class730.field2697.method5271(-2010293889) && var5 < class730.field2697.method5272(-747226515);
                     if (var30 || class730.field2697.method5316(131556130).method37((byte)-65)) {
                        class469.method4018(class509.field4023, var8, var6, new class31(var10, var9), -369193084);
                        if (var30) {
                           class526.method2225(class509.field4023, var7, var5, 1649431547);
                        }
                     }
                  } else if (var0 == class307.field426) {
                     var3 = var2.method6420((byte)-12);
                     var4 = var2.method6371();
                     class730.field2697.method5283(267585287).method4713(var3).method1481(var4, (byte)28);
                  } else if (class307.field435 == var0) {
                     var3 = var2.method6371();
                     var23 = class730.field2697.method5270(681479919);
                     var5 = class82.field1109 + (var3 & 7);
                     var6 = var23.field1522 + var5;
                     var7 = (var3 >> 4 & 7) + class420.field9722;
                     var8 = var7 + var23.field1521;
                     var9 = var2.method6374();
                     var10 = var2.method6374();
                     var11 = var2.method6374();
                     if (class730.field2666 != null) {
                        class508 var32 = (class508)class730.field2666.method2942((long)(class509.field4023 << 28 | var6 << 14 | var8));
                        if (var32 != null) {
                           for(class31 var36 = (class31)var32.field3966.method901(1766612795); var36 != null; var36 = (class31)var32.field3966.method906(49146)) {
                              if (var36.field5319 == (var9 & 32767) && var36.field5318 == var10) {
                                 var36.method545(-1460969981);
                                 var36.field5318 = var11;
                                 class469.method4018(class509.field4023, var8, var6, var36, -2035381169);
                                 break;
                              }
                           }

                           if (var7 >= 0 && var5 >= 0 && var7 < class730.field2697.method5271(-2131588637) && var5 < class730.field2697.method5272(-523876912)) {
                              class526.method2225(class509.field4023, var7, var5, 1760601086);
                           }
                        }
                     }
                  } else if (var0 == class307.field430) {
                     var2.method6371();
                     var3 = var2.method6371();
                     var4 = (var3 >> 4 & 7) + class420.field9722;
                     var5 = (var3 & 7) + class82.field1109;
                     var6 = var2.method6374();
                     var7 = var2.method6371();
                     var8 = var2.method6390((byte)-11);
                     String var28 = var2.method6379(-844550451);
                     if (class730.field2697.method5316(1533260419) != class335.field44) {
                        class540.method2466(class509.field4023, var4, var5, var7, var6, var8, var28, 1332190940);
                     }
                  } else if (var0 == class307.field428) {
                     var3 = var2.method6371();
                     var4 = class420.field9722 + (var3 >> 4 & 7);
                     var5 = class82.field1109 + (var3 & 7);
                     var6 = var2.method6371();
                     var7 = var6 >> 2;
                     var8 = var6 & 3;
                     var9 = class730.field2720[var7];
                     var10 = var2.method6409(-1674329814);
                     if (class730.field2697.method5316(39788259).method37((byte)29) || var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-2063854515) && var5 < class730.field2697.method5272(-1828303048)) {
                        class965.method1716(class509.field4023, var4, var5, var9, var10, var7, var8, 2010363527);
                     }
                  } else if (class307.field421 == var0) {
                     var3 = var2.method6402(1457639602);
                     var4 = var2.method6401((byte)22);
                     var5 = var2.method6374();
                     var6 = var2.method6371();
                     class389 var24 = class730.field2697.method5270(681479919);
                     var8 = class82.field1109 + (var6 & 7);
                     var9 = var24.field1522 + var8;
                     var10 = class420.field9722 + (var6 >> 4 & 7);
                     var11 = var24.field1521 + var10;
                     if (var3 != class730.field2623) {
                        boolean var33 = var10 >= 0 && var8 >= 0 && var10 < class730.field2697.method5271(-2004210913) && var8 < class730.field2697.method5272(133385720);
                        if (var33 || class730.field2697.method5316(1297675002).method37((byte)-41)) {
                           class469.method4018(class509.field4023, var11, var9, new class31(var4, var5), 1214818737);
                           if (var33) {
                              class526.method2225(class509.field4023, var10, var8, 1328737922);
                           }
                        }
                     }
                  } else if (class307.field424 == var0) {
                     var3 = var2.method6371();
                     var4 = class420.field9722 * 2 + (var3 >> 4 & 15);
                     var5 = class82.field1109 * 2 + (var3 & 15);
                     var6 = var2.method6371();
                     boolean var27 = (var6 & 1) != 0;
                     boolean var29 = (var6 & 2) != 0;
                     var9 = var29 ? var6 >> 2 : -1;
                     var10 = var4 + var2.method6372(-12558881);
                     var11 = var5 + var2.method6372(-12558881);
                     var12 = var2.method6367(1793836109);
                     var13 = var2.method6367(1964039723);
                     var14 = var2.method6374();
                     var37 = var2.method6371();
                     if (var29) {
                        var37 = (byte)var37;
                     } else {
                        var37 *= 4;
                     }

                     var16 = var2.method6371() * 4;
                     var17 = var2.method6374();
                     var18 = var2.method6374();
                     int var19 = var2.method6371();
                     int var20 = var2.method6374();
                     if (var19 == 255) {
                        var19 = -1;
                     }

                     if (class730.field2697.method5316(781301439) != class335.field44 && var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-2097499815) * 2 && var5 < class730.field2697.method5271(-1925634796) * 2 && var10 >= 0 && var11 >= 0 && var10 < class730.field2697.method5272(-2066893296) * 2 && var11 < class730.field2697.method5272(1895360083) * 2 && 65535 != var14) {
                        var4 *= 256;
                        var5 *= 256;
                        var10 *= 256;
                        var11 *= 256;
                        var37 <<= 2;
                        var16 <<= 2;
                        var20 <<= 2;
                        NodeTable.method2948(var14, var12, var13, var9, var37, var16, var4, var5, var10, var11, var17, var18, var19, var20, var27, 618819500);
                     }
                  } else if (class307.field431 == var0) {
                     var3 = var2.method6371();
                     var4 = class420.field9722 + (var3 >> 4 & 7);
                     var5 = class82.field1109 + (var3 & 7);
                     var6 = var2.method6374();
                     if (65535 == var6) {
                        var6 = -1;
                     }

                     var7 = var2.method6371();
                     var8 = var7 >> 4 & 15;
                     var9 = var7 & 7;
                     var10 = var2.method6371();
                     var11 = var2.method6371();
                     var12 = var2.method6374();
                     if (class730.field2697.method5316(569302746) != class335.field44 && var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-2099610751) && var5 < class730.field2697.method5272(-358830712)) {
                        var13 = 1 + var8;
                        if (class923.local.field4085[0] >= var4 - var13 && class923.local.field4085[0] <= var13 + var4 && class923.local.field4055[0] >= var5 - var13 && class923.local.field4055[0] <= var13 + var5) {
                           class874.method5852(var6, var9, var10, var11, (class509.field4023 << 24) + (var4 << 16) + (var5 << 8) + var8, var12, -1062229425);
                        }
                     }
                  } else if (var0 == class307.field434) {
                     var3 = var2.method6371();
                     var4 = class420.field9722 + (var3 >> 4 & 7);
                     var5 = (var3 & 7) + class82.field1109;
                     var6 = var2.method6374();
                     if (var6 == 65535) {
                        var6 = -1;
                     }

                     var7 = var2.method6374();
                     var8 = var2.method6374();
                     var9 = var2.method6371();
                     if (class730.field2697.method5316(1544127575) != class335.field44 && var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-2060803867) && var5 < class730.field2697.method5272(210266167)) {
                        if (-1 == var6) {
                           class178 var31 = (class178)class730.field2806.method2942((long)(var4 << 16 | var5));
                           if (var31 != null) {
                              var31.field5225.method3377((byte)26);
                              var31.method545(-1460969981);
                           }
                        } else {
                           var10 = 256 + var4 * 512;
                           var11 = var5 * 512 + 256;
                           var12 = class509.field4023;
                           if (var12 < 3 && class730.field2697.method5296(1627070231).method3386(var4, var5, 575492228)) {
                              ++var12;
                           }

                           class150 var39 = new class150(class730.field2697.method5317(-1611682495), var6, var8, class509.field4023, var12, var10, class679.method4271(var10, var11, class509.field4023, -1861382449) - var7, var11, var4, var4, var5, var5, var9, false);
                           class730.field2806.method2947(new class178(var39), (long)(var4 << 16 | var5));
                        }
                     }
                  } else if (class307.field420 == var0) {
                     var3 = var2.method6371();
                     var4 = (var3 >> 4 & 7) + class420.field9722;
                     var5 = (var3 & 7) + class82.field1109;
                     var6 = var2.method6374();
                     if (65535 == var6) {
                        var6 = -1;
                     }

                     var7 = var2.method6371();
                     var8 = var7 >> 4 & 15;
                     var9 = var7 & 7;
                     var10 = var2.method6371();
                     var11 = var2.method6371();
                     var12 = var2.method6374();
                     boolean var40 = var2.method6371() == 1;
                     if (class730.field2697.method5316(39884684) != class335.field44 && var4 >= 0 && var5 >= 0 && var4 < class730.field2697.method5271(-2049168352) && var5 < class730.field2697.method5272(91496889)) {
                        var14 = var8 + 1;
                        if (class923.local.field4085[0] >= var4 - var14 && class923.local.field4085[0] <= var14 + var4 && class923.local.field4055[0] >= var5 - var14 && class923.local.field4055[0] <= var14 + var5) {
                           class741.method1886(var6, var9, var10, var11, (var4 << 16) + (class509.field4023 << 24) + (var5 << 8) + var8, var40, var12, -889648047);
                        }
                     }
                  } else if (var0 == class307.field422) {
                     var3 = var2.method6401((byte)67);
                     var4 = var2.method6397((byte)68);
                     class389 var25 = class730.field2697.method5270(681479919);
                     var6 = class82.field1109 + (var4 & 7);
                     var7 = var25.field1522 + var6;
                     var8 = class420.field9722 + (var4 >> 4 & 7);
                     var9 = var8 + var25.field1521;
                     class508 var34 = (class508)class730.field2666.method2942((long)(class509.field4023 << 28 | var7 << 14 | var9));
                     if (var34 != null) {
                        for(class31 var35 = (class31)var34.field3966.method901(1766612795); var35 != null; var35 = (class31)var34.field3966.method906(49146)) {
                           if ((var3 & 32767) == var35.field5319) {
                              var35.method545(-1460969981);
                              break;
                           }
                        }

                        if (var34.field3966.method908(-1293494081)) {
                           var34.method545(-1460969981);
                        }

                        if (var8 >= 0 && var6 >= 0 && var8 < class730.field2697.method5271(-1929078790) && var6 < class730.field2697.method5272(-999181271)) {
                           class526.method2225(class509.field4023, var8, var6, 547814341);
                        }
                     }
                  } else {
                     class764.method2747("" + var0, new RuntimeException(), (short)-20731);
                     class82.method920(false, (byte)28);
                  }
               }
            }
         }

      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "nd.jh(" + ')');
      }
   }

   static void method4259(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (var2 <= class381.field1415 && var3 >= class381.field1414) {
            boolean var6;
            if (var0 < class381.field1416) {
               var0 = class381.field1416;
               var6 = false;
            } else if (var0 > class381.field1413) {
               var0 = class381.field1413;
               var6 = false;
            } else {
               var6 = true;
            }

            boolean var7;
            if (var1 < class381.field1416) {
               var1 = class381.field1416;
               var7 = false;
            } else if (var1 > class381.field1413) {
               var1 = class381.field1413;
               var7 = false;
            } else {
               var7 = true;
            }

            if (var2 >= class381.field1414) {
               class484.method4769(class381.field1412[var2++], var0, var1, var4, -1668539966);
            } else {
               var2 = class381.field1414;
            }

            if (var3 <= class381.field1415) {
               class484.method4769(class381.field1412[var3--], var0, var1, var4, 172166528);
            } else {
               var3 = class381.field1415;
            }

            int var8;
            if (var6 && var7) {
               for(var8 = var2; var8 <= var3; ++var8) {
                  int[] var9 = class381.field1412[var8];
                  var9[var0] = var9[var1] = var4;
               }
            } else if (var6) {
               for(var8 = var2; var8 <= var3; ++var8) {
                  class381.field1412[var8][var0] = var4;
               }
            } else if (var7) {
               for(var8 = var2; var8 <= var3; ++var8) {
                  class381.field1412[var8][var1] = var4;
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "nd.h(" + ')');
      }
   }

   static final void method4260(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         class856.method5200(var2, 1637585593);
         int var7 = 0;
         int var8 = var2 - var5;
         if (var8 < 0) {
            var8 = 0;
         }

         int var9 = var2;
         int var10 = -var2;
         int var11 = var8;
         int var12 = -var8;
         int var13 = -1;
         int var14 = -1;
         int var16;
         int var17;
         int var18;
         int var19;
         if (var1 >= class381.field1414 && var1 <= class381.field1415) {
            int[] var15 = class381.field1412[var1];
            var16 = class972.method1776(var0 - var2, class381.field1416, class381.field1413, -1212608691);
            var17 = class972.method1776(var0 + var2, class381.field1416, class381.field1413, -1212608691);
            var18 = class972.method1776(var0 - var8, class381.field1416, class381.field1413, -1212608691);
            var19 = class972.method1776(var0 + var8, class381.field1416, class381.field1413, -1212608691);
            class484.method4769(var15, var16, var18, var4, 1255708006);
            class484.method4769(var15, var18, var19, var3, -1330979432);
            class484.method4769(var15, var19, var17, var4, 173830974);
         }

         while(var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
               --var11;
               var12 -= var11 << 1;
               class964.field3633[var11] = var7;
            }

            ++var7;
            int var20;
            int var21;
            int[] var22;
            int var24;
            if (var10 >= 0) {
               --var9;
               var10 -= var9 << 1;
               var24 = var1 - var9;
               var16 = var1 + var9;
               if (var16 >= class381.field1414 && var24 <= class381.field1415) {
                  if (var9 >= var8) {
                     var17 = class972.method1776(var7 + var0, class381.field1416, class381.field1413, -1212608691);
                     var18 = class972.method1776(var0 - var7, class381.field1416, class381.field1413, -1212608691);
                     if (var16 <= class381.field1415) {
                        class484.method4769(class381.field1412[var16], var18, var17, var4, -587973246);
                     }

                     if (var24 >= class381.field1414) {
                        class484.method4769(class381.field1412[var24], var18, var17, var4, 458640866);
                     }
                  } else {
                     var17 = class964.field3633[var9];
                     var18 = class972.method1776(var7 + var0, class381.field1416, class381.field1413, -1212608691);
                     var19 = class972.method1776(var0 - var7, class381.field1416, class381.field1413, -1212608691);
                     var20 = class972.method1776(var17 + var0, class381.field1416, class381.field1413, -1212608691);
                     var21 = class972.method1776(var0 - var17, class381.field1416, class381.field1413, -1212608691);
                     if (var16 <= class381.field1415) {
                        var22 = class381.field1412[var16];
                        class484.method4769(var22, var19, var21, var4, -328560892);
                        class484.method4769(var22, var21, var20, var3, 859736172);
                        class484.method4769(var22, var20, var18, var4, -1686922326);
                     }

                     if (var24 >= class381.field1414) {
                        var22 = class381.field1412[var24];
                        class484.method4769(var22, var19, var21, var4, 1196048570);
                        class484.method4769(var22, var21, var20, var3, -427208666);
                        class484.method4769(var22, var20, var18, var4, 1638963838);
                     }
                  }
               }
            }

            var24 = var1 - var7;
            var16 = var1 + var7;
            if (var16 >= class381.field1414 && var24 <= class381.field1415) {
               var17 = var9 + var0;
               var18 = var0 - var9;
               if (var17 >= class381.field1416 && var18 <= class381.field1413) {
                  var17 = class972.method1776(var17, class381.field1416, class381.field1413, -1212608691);
                  var18 = class972.method1776(var18, class381.field1416, class381.field1413, -1212608691);
                  if (var7 < var8) {
                     var19 = var11 < var7 ? class964.field3633[var7] : var11;
                     var20 = class972.method1776(var0 + var19, class381.field1416, class381.field1413, -1212608691);
                     var21 = class972.method1776(var0 - var19, class381.field1416, class381.field1413, -1212608691);
                     if (var16 <= class381.field1415) {
                        var22 = class381.field1412[var16];
                        class484.method4769(var22, var18, var21, var4, -1634458137);
                        class484.method4769(var22, var21, var20, var3, -656430266);
                        class484.method4769(var22, var20, var17, var4, -455567963);
                     }

                     if (var24 >= class381.field1414) {
                        var22 = class381.field1412[var24];
                        class484.method4769(var22, var18, var21, var4, -1604708462);
                        class484.method4769(var22, var21, var20, var3, 603923181);
                        class484.method4769(var22, var20, var17, var4, 1400336613);
                     }
                  } else {
                     if (var16 <= class381.field1415) {
                        class484.method4769(class381.field1412[var16], var18, var17, var4, -2102947655);
                     }

                     if (var24 >= class381.field1414) {
                        class484.method4769(class381.field1412[var24], var18, var17, var4, -372087596);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "nd.q(" + ')');
      }
   }

   public static final boolean method4261(byte var0) {
      try {
         return class881.field10168 != 1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "nd.k(" + ')');
      }
   }

   public static void method4262(int var0, int var1) {
      try {
         class310.field533 = var0;
         class105.field251 = new class105[var0];
         class19.field5364 = 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nd.ad(" + ')');
      }
   }
}
