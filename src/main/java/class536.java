public class class536 extends class535 {
   public class536(int var1, class838 var2) {
      super(var1, var2);
   }

   public void method2326(byte var1) {
      try {
         if (super.field3708 < class900.field10372.field10373 || super.field3708 > class900.field10370.field10373) {
            super.field3708 = this.method2272(-231178603);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aei.s(" + ')');
      }
   }

   int method2272(int var1) {
      try {
         return class900.field10372.field10373;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aei.a(" + ')');
      }
   }

   int method2273(int var1, int var2) {
      return 1;
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aei.p(" + ')');
      }
   }

   public class536(class838 var1) {
      super(var1);
   }

   public int method2327(byte var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aei.z(" + ')');
      }
   }

   public static final void method2328(class564[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, byte var10) {
      try {
         class593.field1623.method4986(var2, var3, var4, var5);

         for(int var11 = 0; var11 < var0.length; ++var11) {
            class564 var12 = var0[var11];
            if (var12 == null) {
               if (var10 != 0) {
                  throw new IllegalStateException();
               }
            } else if (var12.field885 == var1 || -1412584499 == var1 && class730.field2832 == var12) {
               int var13;
               if (-1 == var8) {
                  class730.field2884[class730.field2667].setBounds(var6 + var12.field868, var7 + var12.field880, var12.field881, var12.field887);
                  var13 = ++class730.field2667 - 1;
               } else {
                  var13 = var8;
               }

               var12.field1028 = var13;
               var12.field858 = class730.field2866;
               if (class730.method1762(var12)) {
                  if (var10 != 0) {
                     break;
                  }
               } else {
                  if (var12.field870 != 0) {
                     class51.method1532(var12, (byte)-27);
                  }

                  int var14 = var6 + var12.field868;
                  int var15 = var12.field880 + var7;
                  int var16 = var12.field948;
                  if (class730.field2828 && (class730.method1761(var12).field2563 != 0 || var12.field869 == 0) && var16 > 127) {
                     var16 = 127;
                  }

                  int var17;
                  int var18;
                  if (class730.field2832 == var12) {
                     if (-1412584499 != var1 && (var12.field961 == class564.field931 || class564.field991 == var12.field961 || class730.method1761(var12).method1741(-1937782298))) {
                        class323.field630 = var0;
                        class82.field1111 = var6;
                        class6.field4929 = var7;
                        continue;
                     }

                     if (class730.field2845 && class730.field2837) {
                        var17 = class912.field10424.method5524((byte)-44);
                        var18 = class912.field10424.method5513((byte)-54);
                        var17 -= class730.field2715;
                        var18 -= class730.field2835;
                        if (var17 < class730.field2838) {
                           var17 = class730.field2838;
                        }

                        if (var12.field881 + var17 > class730.field2838 + class730.field2840) {
                           var17 = class730.field2840 + class730.field2838 - var12.field881;
                        }

                        if (var18 < class730.field2781) {
                           var18 = class730.field2781;
                        }

                        if (var18 + var12.field887 > class730.field2948 + class730.field2781) {
                           var18 = class730.field2948 + class730.field2781 - var12.field887;
                        }

                        if (class730.method1761(var12).method1741(-2131954525)) {
                           class431.method4254(var17, var18, var12.field881, var12.field887, (byte)2);
                        }

                        var14 = var17;
                        var15 = var18;
                     }

                     if (var12.field961 == class564.field991) {
                        var16 = 128;
                     }
                  }

                  int var19;
                  int var20;
                  int var21;
                  int var22;
                  if (var12.field869 == 2) {
                     var17 = var2;
                     var18 = var3;
                     var19 = var4;
                     var20 = var5;
                  } else {
                     var21 = var14 + var12.field881;
                     var22 = var15 + var12.field887;
                     if (var12.field869 == 9) {
                        ++var21;
                        ++var22;
                     }

                     var17 = var14 > var2 ? var14 : var2;
                     var18 = var15 > var3 ? var15 : var3;
                     var19 = var21 < var4 ? var21 : var4;
                     var20 = var22 < var5 ? var22 : var5;
                  }

                  if (var17 < var19) {
                     if (var18 >= var20) {
                        if (var10 != 0) {
                           break;
                        }
                     } else {
                        if (var12.field870 != 0) {
                           if (var12.field870 == class564.field994 || var12.field870 == class564.field848) {
                              class600.method5466(var14, var15, var12.field881, var12.field887, class564.field848 == var12.field870, -1462418855);
                              class114.method1295(var13, var17, var18, var19, var20, var14, var15, 220744183);
                              class593.field1623.method4824();
                              class593.field1623.method4986(var2, var3, var4, var5);
                              class730.field2882[var13] = true;
                              continue;
                           }

                           if (class564.field990 == var12.field870 && class730.field2705 == 3) {
                              if (var12.method826(class593.field1623, 824113013) != null) {
                                 class341.method252(-804120200);
                                 class848.method5069(class593.field1623, var12, var14, var15, (byte)-75);
                                 class593.field1623.method4986(var2, var3, var4, var5);
                              }
                              continue;
                           }

                           if (var12.field870 == class564.field856) {
                              class86.method943(class593.field1623, var14, var15, var12, 546414546);
                              continue;
                           }

                           if (class564.field857 == var12.field870) {
                              class227.method4015(class593.field1623, var14, var15, var12, var12.field895 % 64, 273010603);
                              continue;
                           }

                           if (var12.field870 == class564.field850) {
                              if (var12.method826(class593.field1623, 424684480) == null) {
                                 if (var10 != 0) {
                                    break;
                                 }
                              } else {
                                 class103.method154(var12, var14, var15, 65534);
                                 class593.field1623.method4986(var2, var3, var4, var5);
                              }
                              continue;
                           }

                           if (class564.field851 == var12.field870) {
                              class756.method2715(class593.field1623, class962.field3627, var14, var15, var12.field881, var12.field887, -1251589182);
                              class730.field2882[var13] = true;
                              class593.field1623.method4986(var2, var3, var4, var5);
                              continue;
                           }

                           if (class564.field852 == var12.field870) {
                              class47.method3086(class593.field1623, var14, var15, var12.field881, var12.field887, 1970711857);
                              class730.field2882[var13] = true;
                              class593.field1623.method4986(var2, var3, var4, var5);
                              continue;
                           }

                           if (var12.field870 == class564.field853) {
                              if (class730.field2648 || class730.field2649) {
                                 class389.method1152(var14, var15, var12, -1647202011);
                                 class730.field2882[var13] = true;
                              }
                              continue;
                           }
                        }

                        int var23;
                        int var24;
                        int var25;
                        if (var12.field869 == 0) {
                           if (var12.field870 == class564.field855 && class593.field1623.method4883()) {
                              class593.field1623.method4885(var14, var15, var12.field881, var12.field887);
                           }

                           method2328(var0, var12.field867, var17, var18, var19, var20, var14 - var12.field891, var15 - var12.field892, var13, var9, (byte)0);
                           if (var12.field1018 != null) {
                              method2328(var12.field1018, var12.field867, var17, var18, var19, var20, var14 - var12.field891, var15 - var12.field892, var13, var9, (byte)0);
                           }

                           class256 var34 = (class256)class730.field2823.method2942((long)var12.field867);
                           if (var34 != null) {
                              class873.method5870(var34.field8101, var17, var18, var19, var20, var14, var15, var13, 421170136);
                           }

                           if (class564.field855 == var12.field870) {
                              if (class593.field1623.method4883()) {
                                 class593.field1623.method4968();
                              }

                              if (class730.field2705 == 0) {
                                 var22 = class730.field2662;
                                 var23 = class730.field2712;
                                 var24 = class730.field2713;
                                 var25 = class730.field2701;
                                 if (class730.field2866 < class730.field2718) {
                                    float var26 = (float)(class730.field2866 - class730.field2709) * 1.0F / (float)(class730.field2718 - class730.field2709);
                                    var22 = (int)((1.0F - var26) * (float)class152.field5415 + (float)class730.field2662 * var26);
                                    var23 = (int)((float)class730.field2712 * var26 + (1.0F - var26) * (float)class220.field7357);
                                    var24 = (int)((1.0F - var26) * (float)class601.field9204 + (float)class730.field2713 * var26);
                                    var25 = (int)((1.0F - var26) * (float)class157.field6558 + (float)class730.field2701 * var26);
                                 }

                                 if (var22 > 0) {
                                    class593.field1623.method4833(var17, var18, var19 - var17, var20 - var18, var22 << 24 | var23 << 16 | var24 << 8 | var25, (byte)7);
                                 }
                              }
                           }

                           class593.field1623.method4986(var2, var3, var4, var5);
                        }

                        if (!class730.field2883[var13] && class730.field2938 <= 1) {
                           if (var10 != 0) {
                              throw new IllegalStateException();
                           }
                        } else if (var12.field869 == 3) {
                           if (var16 == 0) {
                              if (var12.field896) {
                                 class593.field1623.method4984(var14, var15, var12.field881, var12.field887, var12.field895, 0);
                              } else {
                                 class593.field1623.method4838(var14, var15, var12.field881, var12.field887, var12.field895, 0);
                              }
                           } else if (var12.field896) {
                              class593.field1623.method4984(var14, var15, var12.field881, var12.field887, 255 - (var16 & 255) << 24 | var12.field895 & 16777215, 1);
                           } else {
                              class593.field1623.method4838(var14, var15, var12.field881, var12.field887, 255 - (var16 & 255) << 24 | var12.field895 & 16777215, 1);
                           }
                        } else {
                           ItemDefinition var39;
                           if (4 == var12.field869) {
                              class727 var35 = var12.method822(class785.field3827, class730.field2681, 1828077661);
                              if (var35 == null) {
                                 if (class564.field864) {
                                    class814.method2932(var12, -1885159145);
                                 }
                              } else {
                                 var22 = var12.field895;
                                 String var37 = var12.field937;
                                 if (var12.field1005 != -1) {
                                    var39 = class85.field1121.method1566(var12.field1005);
                                    var37 = var39.name;
                                    if (var37 == null) {
                                       var37 = "null";
                                    }

                                    if ((var39.field4221 == 1 || 1 != var12.field1006) && -1 != var12.field1006) {
                                       var37 = class56.method1545(16748608, -1499496225) + var37 + class822.field9053 + " x" + class866.method5841(var12.field1006, 1886400109);
                                    }
                                 }

                                 if (-1 != var12.field1014) {
                                    var37 = class981.method1928(var12.field1014, (byte)-48);
                                    if (var37 == null) {
                                       var37 = "";
                                    }
                                 }

                                 if (var12 == class730.field2633) {
                                    var37 = class814.field4662.method2927(class321.field1066, -875414210);
                                    var22 = var12.field895;
                                 }

                                 if (class730.field2831) {
                                    class593.field1623.method4829(var14, var15, var14 + var12.field881, var12.field887 + var15);
                                 }

                                 if (var12.field971) {
                                    var35.method1673(var37, var14, var15, var12.field881, var12.field887, 255 - (var16 & 255) << 24 | var22, var12.field941 ? 255 - (var16 & 255) << 24 : -1, var12.field939, var12.field849, class730.field2683, class880.field10188, class730.field2881, class324.field621, (int[])null, -1153250817);
                                 } else {
                                    var35.method1664(var37, var14, var15, var12.field881, var12.field887, 255 - (var16 & 255) << 24 | var22, var12.field941 ? 255 - (var16 & 255) << 24 : -1, var12.field939, var12.field849, var12.field916, var12.field942, class324.field621, (int[])null, (class23)null, 0, 0, -1416794725);
                                 }

                                 if (class730.field2831) {
                                    class593.field1623.method4986(var2, var3, var4, var5);
                                 }
                              }
                           } else {
                              int var27;
                              int var42;
                              if (var12.field869 == 5) {
                                 if (var12.field1008 >= 0) {
                                    var12.method831(class490.field7866, class527.field3690, 1661859058).method2360(class593.field1623, 0, var14, var15, var12.field881, var12.field887, var12.field966 << 3, var12.field977 << 3, 0, 0, -45056444);
                                 } else {
                                    class48 var36;
                                    if (var12.field1005 != -1) {
                                       class365 var40 = var12.field938 ? class923.local.field3388 : null;
                                       var36 = class85.field1121.method1570(class593.field1623, var12.field1005, var12.field1006, var12.field903, -16777216 | var12.field976, var12.field926, var40, 467134725);
                                    } else if (-1 != var12.field1014) {
                                       var36 = class831.method5383(class593.field1623, var12.field1014, (byte)39);
                                    } else {
                                       var36 = var12.method838(class593.field1623, -989509351);
                                    }

                                    if (var36 != null) {
                                       var22 = var36.method5594();
                                       var23 = var36.method3109();
                                       var24 = 255 - (var16 & 255) << 24 | (var12.field895 != 0 ? var12.field895 & 16777215 : 16777215);
                                       if (var12.field921) {
                                          class593.field1623.method4829(var14, var15, var14 + var12.field881, var15 + var12.field887);
                                          if (var12.field1031 == 0) {
                                             if (var12.field895 == 0 && var16 == 0) {
                                                var36.method3119(var14, var15, var12.field881, var12.field887);
                                             } else {
                                                var36.method3145(var14, var15, var12.field881, var12.field887, 0, var24, 1);
                                             }
                                          } else {
                                             var25 = (var12.field881 + (var22 - 1)) / var22;
                                             var42 = (var12.field887 + (var23 - 1)) / var23;

                                             for(var27 = 0; var27 < var25; ++var27) {
                                                for(int var28 = 0; var28 < var42; ++var28) {
                                                   if (var12.field895 != 0) {
                                                      var36.method3121((float)(var14 + var27 * var22) + (float)var22 / 2.0F, (float)var23 / 2.0F + (float)(var23 * var28 + var15), 4096, var12.field1031, 0, var24, 1);
                                                   } else {
                                                      var36.method3156((float)(var14 + var22 * var27) + (float)var22 / 2.0F, (float)var23 / 2.0F + (float)(var15 + var23 * var28), 4096, var12.field1031);
                                                   }
                                                }
                                             }
                                          }

                                          class593.field1623.method4986(var2, var3, var4, var5);
                                       } else if (var12.field895 == 0 && var16 == 0) {
                                          if (var12.field1031 != 0) {
                                             var36.method3156((float)var12.field881 / 2.0F + (float)var14, (float)var12.field887 / 2.0F + (float)var15, var12.field881 * 4096 / var22, var12.field1031);
                                          } else if (var12.field881 == var22 && var23 == var12.field887) {
                                             var36.method3128(var14, var15);
                                          } else {
                                             var36.method3116(var14, var15, var12.field881, var12.field887);
                                          }
                                       } else if (var12.field1031 != 0) {
                                          var36.method3121((float)var12.field881 / 2.0F + (float)var14, (float)var15 + (float)var12.field887 / 2.0F, var12.field881 * 4096 / var22, var12.field1031, 0, var24, 1);
                                       } else if (var22 == var12.field881 && var12.field887 == var23) {
                                          var36.method3114(var14, var15, 0, var24, 1);
                                       } else {
                                          var36.method3117(var14, var15, var12.field881, var12.field887, 0, var24, 1);
                                       }
                                    } else if (class564.field864) {
                                       class814.method2932(var12, 1189683117);
                                    }
                                 }
                              } else if (6 == var12.field869) {
                                 class730.field2697.method5282((byte)-16).method5675((byte)-24);
                                 class879 var38 = null;
                                 var22 = 2048;
                                 if (var12.field922 != 0) {
                                    var22 |= 524288;
                                 }

                                 var23 = 0;
                                 if (var12.field1005 != -1) {
                                    var39 = class85.field1121.method1566(var12.field1005);
                                    if (var39 != null) {
                                       var39 = var39.method2676(var12.field1006, 1491142573);
                                       var38 = var39.method2675(class593.field1623, var22, 1, var12.field938 ? class923.local.field3388 : null, var12.field877, 0, 0, 0, 0, 1717387975);
                                       if (var38 != null) {
                                          var23 = -var38.method5976() >> 1;
                                       } else {
                                          class814.method2932(var12, -1878363651);
                                       }
                                    }
                                 } else {
                                    Player var43;
                                    if (3 == var12.field909) {
                                       var24 = var12.field876;
                                       if (var24 >= 0 && var24 < 2048) {
                                          var43 = class730.loaded[var24];
                                          if (var43 != null && (class730.field2623 == var24 || class904.method6336(var43.field3374, (byte)125) == var12.field865)) {
                                             var38 = var12.method834(class593.field1623, var22, class283.field10614, class662.field9736, class258.field7913, class85.field1121, class936.field10313, class827.field9037, var12.field877, var43.field3388, -297118329);
                                             if (var38 == null && class564.field864) {
                                                class814.method2932(var12, 398619747);
                                             }
                                          }
                                       }
                                    } else if (var12.field909 == 5) {
                                       var24 = var12.field876;
                                       if (var24 >= 0 && var24 < 2048) {
                                          var43 = class730.loaded[var24];
                                          if (var43 != null && (var24 == class730.field2623 || class904.method6336(var43.field3374, (byte)127) == var12.field865)) {
                                             var38 = var43.field3388.method1643(class593.field1623, var22, class283.field10614, class662.field9736, class258.field7913, class85.field1121, class936.field10313, class827.field9037, var12.field877, (Animator)null, (Animator[])null, (int[])null, 0, true, class413.field9412, -933937677);
                                          }
                                       }
                                    } else if (8 != var12.field909 && var12.field909 != 9) {
                                       if (var12.field877 != null && var12.field877.method2775((byte)-99)) {
                                          var38 = var12.method834(class593.field1623, var22, class283.field10614, class662.field9736, class258.field7913, class85.field1121, class936.field10313, class827.field9037, var12.field877, class923.local.field3388, -1902556053);
                                          if (var38 == null && class564.field864) {
                                             class814.method2932(var12, 302421220);
                                          }
                                       } else {
                                          var38 = var12.method834(class593.field1623, var22, class283.field10614, class662.field9736, class258.field7913, class85.field1121, class936.field10313, class827.field9037, (Animator)null, class923.local.field3388, -347094263);
                                          if (var38 == null && class564.field864) {
                                             class814.method2932(var12, -91896348);
                                          }
                                       }
                                    } else {
                                       class163 var41 = class213.method3812(var12.field876, false, 2023314319);
                                       if (var41 != null) {
                                          var38 = var41.method3553(class593.field1623, var22, var12.field877, var12.field865, 9 == var12.field909, var12.field938 ? class923.local.field3388 : null, (byte)1);
                                       }
                                    }
                                 }

                                 if (var38 != null) {
                                    if (var12.field922 != 0) {
                                       var38.method5987(var12.field1003, var12.field932, var12.field933, var12.field922);
                                    }

                                    if (var12.field946 > 0) {
                                       var24 = (var12.field881 << 9) / var12.field946;
                                    } else {
                                       var24 = 512;
                                    }

                                    if (var12.field923 > 0) {
                                       var25 = (var12.field887 << 9) / var12.field923;
                                    } else {
                                       var25 = 512;
                                    }

                                    var42 = var14 + var12.field881 / 2;
                                    var27 = var15 + var12.field887 / 2;
                                    if (!var12.field912) {
                                       var42 += var24 * var12.field918 >> 9;
                                       var27 += var25 * var12.field919 >> 9;
                                    }

                                    class730.field2853.method1009();
                                    class593.field1623.method4867(class730.field2853);
                                    class344 var44 = class593.field1623.method4860();
                                    int var29 = class730.field2697.method5276((byte)-21);
                                    int var30 = class730.field2697.method5277(-176106849);
                                    if (var12.field924) {
                                       if (var12.field912) {
                                          var44.method280((float)var42, (float)var27, (float)var24, (float)var25, (float)var29, (float)var30, (float)class759.field4331, (float)class97.field614, (float)var12.field1009);
                                       } else {
                                          var44.method280((float)var42, (float)var27, (float)var24, (float)var25, (float)var29, (float)var30, (float)class759.field4331, (float)class97.field614, (float)(var12.field1009 << 2));
                                       }
                                    } else {
                                       var44.method279((float)var42, (float)var27, (float)var24, (float)var25, (float)var29, (float)var30, (float)class759.field4331, (float)class97.field614);
                                    }

                                    class593.field1623.method5054(var44);
                                    class593.field1623.method4831(2, 0);
                                    if (var12.field911) {
                                       class593.field1623.method4869(false);
                                    }

                                    if (var12.field912) {
                                       class730.field2950.method1013(1.0F, 0.0F, 0.0F, class703.method2002(var12.field915));
                                       class730.field2950.method1025(0.0F, 1.0F, 0.0F, class703.method2002(var12.field987));
                                       class730.field2950.method1025(0.0F, 0.0F, 1.0F, class703.method2002(var12.field917));
                                       class730.field2950.method1018((float)var12.field918, (float)var12.field919, (float)var12.field1007);
                                    } else {
                                       int var31 = class703.field3413[var12.field915 << 3] * (var12.field1009 << 2) >> 14;
                                       int var32 = class703.field3404[var12.field915 << 3] * (var12.field1009 << 2) >> 14;
                                       class730.field2950.method1013(0.0F, 0.0F, 1.0F, class703.method2002(-var12.field917 << 3));
                                       class730.field2950.method1025(0.0F, 1.0F, 0.0F, class703.method2002(var12.field987 << 3));
                                       class730.field2950.method1018((float)(var12.field1022 << 2), (float)(var23 + var31 + (var12.field973 << 2)), (float)(var32 + (var12.field973 << 2)));
                                       class730.field2950.method1025(1.0F, 0.0F, 0.0F, class703.method2002(var12.field915 << 3));
                                    }

                                    var12.method824(class593.field1623, var38, class730.field2950, class730.field2866, 1739448532);
                                    if (class730.field2831) {
                                       class593.field1623.method4829(var14, var15, var14 + var12.field881, var15 + var12.field887);
                                    }

                                    var38.method5965(class730.field2950, (class211)null, 1);
                                    if (!var12.field924 && var12.field943 != null) {
                                       class593.field1623.method4866(var12.field943.method1726());
                                    }

                                    if (class730.field2831) {
                                       class593.field1623.method4986(var2, var3, var4, var5);
                                    }

                                    if (var12.field911) {
                                       class593.field1623.method4869(true);
                                    }
                                 }
                              } else if (var12.field869 == 9) {
                                 if (var12.field899) {
                                    var21 = var14;
                                    var22 = var15 + var12.field887;
                                    var23 = var12.field881 + var14;
                                    var24 = var15;
                                 } else {
                                    var21 = var14;
                                    var22 = var15;
                                    var23 = var12.field881 + var14;
                                    var24 = var15 + var12.field887;
                                 }

                                 if (1 == var12.field898) {
                                    class593.field1623.method4934(var21, var22, var23, var24, var12.field895, 0);
                                 } else {
                                    class593.field1623.method4811(var21, var22, var23, var24, var12.field895, var12.field898, 0);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var33) {
         throw class158.method3445(var33, "aei.kk(" + ')');
      }
   }
}
