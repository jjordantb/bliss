public class class374 implements class925 {
   public int field1181;

   public class7 method6197(int var1) {
      try {
         return class7.field4912;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fw.f(" + ')');
      }
   }

   class374(int var1) {
      this.field1181 = var1;
   }

   static final void method999(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2826;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fw.ug(" + ')');
      }
   }

   static final void method1000(class744 var0, int var1) {
      try {
         if (class730.field2924 == 0) {
            var0.field3161[++var0.field3156 - 1] = -1;
         } else {
            var0.field3161[++var0.field3156 - 1] = class730.field2934;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fw.wl(" + ')');
      }
   }

   static final void method1001(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = var0.field3154.field1165[var2].field1498;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fw.yb(" + ')');
      }
   }

   static final void method1002(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = (int)(Math.random() * (double)(var2 + 1));
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fw.yg(" + ')');
      }
   }

   static final void method1003(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class205 var3 = class848.field8597.method3399(var2, 415666693);
         if (var3.field7621 == null) {
            var0.field3161[++var0.field3156 - 1] = 0;
         } else {
            var0.field3161[++var0.field3156 - 1] = var3.field7621.length;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fw.acm(" + ')');
      }
   }

   static final void method1004(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class593.method1231(var3, var4, var0, -919451749);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fw.ej(" + ')');
      }
   }

   static final void method1005(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         int[] var5 = class960.method2212(var4, var2, -1732377635);
         if (var5 != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field897 = class634.method5872(var4, var2, -2046058202);
         var0.field979 = var5;
         var0.field963 = true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fw.mg(" + ')');
      }
   }

   static final void method1006(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class572.method107(var3, var4, var0, (byte)-89);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fw.op(" + ')');
      }
   }

   static boolean method1007(class848 var0, int var1, int var2) {
      try {
         class27.resetTimer((byte)1);
         if (!var0.method4865(2085922748)) {
            return false;
         } else {
            int var3 = class730.field2697.method5271(-2086391246);
            int var4 = class730.field2697.method5272(-867392122);
            class153 var5 = class730.field2697.method5296(-202336440);
            class545 var6 = class730.field2697.method5317(-1611682495);
            int var7 = var3 / 2;
            byte var8 = 0;
            byte var9 = 0;
            boolean var10 = true;

            int var11;
            int var13;
            for(var11 = var8; var11 < var8 + var3; ++var11) {
               for(int var12 = var9; var12 < var9 + var4; ++var12) {
                  for(var13 = var1; var13 <= 3; ++var13) {
                     if (var5.method3387(var1, var13, var11, var12, (byte)-28)) {
                        int var14 = var13;
                        if (var5.method3386(var11, var12, -481959702)) {
                           var14 = var13 - 1;
                        }

                        if (var14 >= 0) {
                           var10 &= class528.method2242(var14, var11, var12, -1955757694);
                        }
                     }
                  }
               }
            }

            if (!var10) {
               return false;
            } else {
               var11 = var3 * 4 + 48 + 48;
               int[] var38 = new int[var11 * var11];

               for(var13 = 0; var13 < var38.length; ++var13) {
                  var38[var13] = -16777216;
               }

               class806 var39 = null;
               byte var40 = 0;
               byte var15 = 0;
               if (class95.field594) {
                  class379.field1139 = var0.method4852(var11, var11, false, true);
                  var39 = var0.method4942();
                  var39.method2839(0, class379.field1139.method3110());
                  class893 var16 = var0.method5058(var11, var11);
                  var39.method2834(var16);
                  var0.method5009(var39, (byte)38);
                  var7 = var3;
                  var40 = 48;
                  var15 = 48;
                  var0.method4831(1, 0);
               } else {
                  class379.field1139 = var0.method4854(var38, 0, var11, var11, var11, -1797507809);
               }

               class730.field2697.method5282((byte)105).method5675((byte)-128);
               int var41 = -16777216 | (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
               int var17 = -16777216 | 238 + (int)(Math.random() * 20.0D) - 10 << 16;
               int var18 = (int)(Math.random() * 8.0D) << 16 | (int)(Math.random() * 8.0D) << 8 | (int)(Math.random() * 8.0D);
               boolean[][] var19 = new boolean[1 + var7 + 2][2 + var7 + 1];

               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               int var29;
               int var31;
               int var32;
               int var33;
               int var34;
               for(int var20 = var8; var20 < var3 + var8; var20 += var7) {
                  for(var21 = var9; var21 < var4 + var9; var21 += var7) {
                     var22 = var40;
                     var23 = var15;
                     var24 = var20;
                     if (var20 > 0) {
                        var24 = var20 - 1;
                        var22 = var40 + 4;
                     }

                     var25 = var21;
                     if (var21 > 0) {
                        var25 = var21 - 1;
                     }

                     var26 = var7 + var20;
                     if (var26 < var3) {
                        ++var26;
                     }

                     var27 = var21 + var7;
                     if (var27 < var4) {
                        ++var27;
                        var23 = var15 + 4;
                     }

                     if (class95.field603) {
                        var0.method4827();
                     } else {
                        var0.method4986(0, 0, var7 * 4 + var22, var23 + 4 * var7);
                     }

                     var0.method4831(3, -16777216);
                     var28 = var7;
                     if (var7 > var3 - 1) {
                        var28 = var3 - 1;
                     }

                     int var30;
                     for(var29 = var1; var29 <= 3; ++var29) {
                        for(var30 = 0; var30 <= var28; ++var30) {
                           for(var31 = 0; var31 <= var28; ++var31) {
                              var19[var30][var31] = var5.method3387(var1, var29, var24 + var30, var25 + var31, (byte)-51);
                           }
                        }

                        var6.field3864[var29].method3886(var40, var15, 1024, var24, var25, var26, var27, var19);
                        if (!class95.field604) {
                           for(var30 = -4; var30 < var7; ++var30) {
                              for(var31 = -4; var31 < var7; ++var31) {
                                 var32 = var30 + var20;
                                 var33 = var21 + var31;
                                 if (var32 >= var8 && var33 >= var9 && var5.method3387(var1, var29, var32, var33, (byte)-109)) {
                                    var34 = var29;
                                    if (var5.method3386(var32, var33, 1967187214)) {
                                       var34 = var29 - 1;
                                    }

                                    if (var34 >= 0) {
                                       class917.method6449(var0, var34, var32, var33, var30 * 4 + var22, var23 + (var7 - var31) * 4 - 4, var41, var17, -2020733164);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (class95.field604) {
                        class262 var51 = class730.field2697.method5281(var1);

                        for(var30 = 0; var30 < var7; ++var30) {
                           for(var31 = 0; var31 < var7; ++var31) {
                              var32 = var20 + var30;
                              var33 = var21 + var31;
                              var34 = var51.field8183[var32 - var51.field8179][var33 - var51.field8180];
                              if ((var34 & 1076101120) != 0) {
                                 var0.method4833(4 * var30 + var22, var23 + 4 * (var7 - var31) - 4, 4, 4, -1713569622, (byte)7);
                              } else if ((var34 & 8388608) != 0) {
                                 var0.method4798(var30 * 4 + var22, var23 + 4 * (var7 - var31) - 4, 4, -1713569622, -1316601626);
                              } else if ((var34 & 33554432) != 0) {
                                 var0.method4858(var30 * 4 + var22 + 3, var23 + (var7 - var31) * 4 - 4, 4, -1713569622, (short)18813);
                              } else if ((var34 & 134217728) != 0) {
                                 var0.method4798(4 * var30 + var22, var23 + 4 * (var7 - var31) - 4 + 3, 4, -1713569622, -1813788528);
                              } else if ((var34 & 536870912) != 0) {
                                 var0.method4858(var22 + 4 * var30, (var7 - var31) * 4 + var23 - 4, 4, -1713569622, (short)29805);
                              }
                           }
                        }
                     }

                     var0.method4984(var22, var23, var7 * 4, 4 * var7, var18, 2);
                     if (!class95.field594) {
                        class379.field1139.method3158((var20 - var8) * 4 + 48, 4 * var4 + 48 - (var21 - var9) * 4 - var7 * 4, var7 * 4, 4 * var7, var22, var23);
                        if (class95.field603) {
                           class379.field1139.method3128(256, 0);

                           try {
                              var0.method4796((byte)-97);
                              class764.method2745(2000L);
                           } catch (Exception var36) {
                              ;
                           }
                        }
                     }
                  }
               }

               if (class95.field594) {
                  var0.method4818(var39, (byte)29);
                  if (class95.field603) {
                     class379.field1139.method3128(256, 0);

                     try {
                        var0.method4796((byte)39);
                        class764.method2745(2000L);
                     } catch (Exception var35) {
                        ;
                     }
                  }
               }

               var0.method4827();
               var0.method4831(1, 1);
               class881.method6172(-1595877635);
               class240 var42 = class730.field2697.method5283(-106767927);
               class95.field606 = 0;
               class95.field600.method905((byte)1);
               if (!class95.field604) {
                  for(var21 = var8; var21 < var3 + var8; ++var21) {
                     for(var22 = var9; var22 < var4 + var9; ++var22) {
                        for(var23 = var1; var23 <= 1 + var1 && var23 <= 3; ++var23) {
                           if (var5.method3387(var1, var23, var21, var22, (byte)-65)) {
                              class265 var44 = (class265)var6.method2452(var23, var21, var22, (byte)117);
                              if (var44 == null) {
                                 var44 = (class265)var6.method2429(var23, var21, var22, class730.field2942, -858481229);
                              }

                              if (var44 == null) {
                                 var44 = (class265)var6.method2425(var23, var21, var22, 2125922883);
                              }

                              if (var44 == null) {
                                 var44 = (class265)var6.method2427(var23, var21, var22, 1080081135);
                              }

                              if (var44 != null) {
                                 ObjectDefinition var46 = var42.method4713(var44.method4551((byte)-27));
                                 if (!var46.field2266 || class730.field2759) {
                                    var26 = var46.field2231;
                                    if (var46.field2198 != null) {
                                       for(var27 = 0; var27 < var46.field2198.length; ++var27) {
                                          if (var46.field2198[var27] != -1) {
                                             ObjectDefinition var48 = var42.method4713(var46.field2198[var27]);
                                             if (var48.field2231 >= 0) {
                                                var26 = var48.field2231;
                                             }
                                          }
                                       }
                                    }

                                    if (var26 >= 0) {
                                       boolean var47 = false;
                                       if (var26 >= 0) {
                                          class718 var49 = class333.field139.method5091(var26, -718907138);
                                          if (var49 != null && var49.field3506) {
                                             var47 = true;
                                          }
                                       }

                                       var28 = var21;
                                       var29 = var22;
                                       if (var47) {
                                          int[][] var52 = class730.field2697.method5281(var23).field8183;
                                          var31 = class730.field2697.method5281(var23).field8179;
                                          var32 = class730.field2697.method5281(var23).field8180;

                                          for(var33 = 0; var33 < 10; ++var33) {
                                             var34 = (int)(Math.random() * 4.0D);
                                             if (var34 == 0 && var28 > var8 && var28 > var21 - 3 && (var52[var28 - 1 - var31][var29 - var32] & 2883848) == 0) {
                                                --var28;
                                             }

                                             if (1 == var34 && var28 < var3 + var8 - 1 && var28 < var21 + 3 && (var52[1 + var28 - var31][var29 - var32] & 2883968) == 0) {
                                                ++var28;
                                             }

                                             if (var34 == 2 && var29 > var9 && var29 > var22 - 3 && (var52[var28 - var31][var29 - 1 - var32] & 2883842) == 0) {
                                                --var29;
                                             }

                                             if (var34 == 3 && var29 < var4 + var9 - 1 && var29 < 3 + var22 && (var52[var28 - var31][1 + var29 - var32] & 2883872) == 0) {
                                                ++var29;
                                             }
                                          }
                                       }

                                       class95.field599[class95.field606] = var46.field2197;
                                       class95.field597[class95.field606] = var28;
                                       class95.field598[class95.field606] = var29;
                                       ++class95.field606;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  class64 var43 = class730.field2697.method5273(1336735501);
                  if (var43 != null) {
                     class333.field139.method5094(1024, 64, 1140719584);
                     class389 var45 = class730.field2697.method5270(681479919);

                     for(var23 = 0; var23 < var43.field1685; ++var23) {
                        var24 = var43.field1684[var23];
                        if (class923.local.field3639 == var24 >> 28) {
                           var25 = (var24 >> 14 & 16383) - var45.field1521;
                           var26 = (var24 & 16383) - var45.field1522;
                           if (var25 >= 0 && var25 < var3 && var26 >= 0 && var26 < var4) {
                              class95.field600.method897(new class722(var23), 1131322080);
                           } else {
                              class718 var50 = class333.field139.method5091(var43.field1686[var23], -1340224758);
                              if (var50.field3518 != null && var25 + var50.field3508 >= 0 && var25 + var50.field3519 < var3 && var26 + var50.field3522 >= 0) {
                                 if (var26 + var50.field3520 >= var4) {
                                    if (var2 != 1177065502) {
                                       throw new IllegalStateException();
                                    }
                                 } else {
                                    class95.field600.method897(new class722(var23), 1459840700);
                                 }
                              }
                           }
                        }
                     }

                     class333.field139.method5094(128, 64, 139589541);
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var37) {
         throw class158.method3445(var37, "fw.i(" + ')');
      }
   }
}
