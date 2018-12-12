import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class932 {
   public int field10339;
   public class765 field10340;
   public int field10341 = -1313669563;
   public int field10342;
   public int field10343;
   static class48 field10344;

   class932(class746 var1) {
      this.field10340 = new class511(var1, false);
   }

   static void method6290(int var0) {
      try {
         Class var1 = ClassLoader.class;
         Field var2 = var1.getDeclaredField("nativeLibraries");
         Class var3 = AccessibleObject.class;
         Method var4 = var3.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var4.invoke(var2, Boolean.TRUE);
      } catch (Throwable var5) {
         ;
      }

   }

   static class827 method6291(class907 var0, int var1) {
      try {
         class971 var2 = class812.method2915((byte)-18)[var0.method6371()];
         class49 var3 = class147.method1146(2131483758)[var0.method6371()];
         int var4 = var0.method6367(1574617841);
         int var5 = var0.method6367(1869006107);
         int var6 = var0.method6374();
         int var7 = var0.method6374();
         int var8 = var0.method6367(1992026897);
         int var9 = var0.method6423(1235052657);
         int var10 = var0.method6420((byte)14);
         return new class827(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "cg.a(" + ')');
      }
   }

   public static final void method6292(short var0) {
      try {
         class693.method3877(1548853569);

         for(int var1 = 0; var1 < class540.field3926 * -991384187; ++var1) {
            class45 var2 = class540.field3927[var1];
            boolean var3 = false;
            int var4;
            if (var2.field5118 == null) {
               var2.field5111 -= -1463623301;
               if (-99363405 * var2.field5111 >= (var2.method3078((byte)-38) ? -1500 : -10)) {
                  if (var2.field5110 == 1 && var2.field5115 == null) {
                     var2.field5115 = class624.method5837(class783.field3963, -320389285 * var2.field5109, 0);
                     if (var2.field5115 == null) {
                        if (var0 >= 16385) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     var2.field5111 += var2.field5115.method5835() * -1463623301;
                  } else if (var2.method3078((byte)-25) && (var2.field5120 == null || var2.field5117 == null)) {
                     if (var2.field5120 == null) {
                        var2.field5120 = class29.method3510(class967.field2604, var2.field5109 * -320389285);
                     }

                     if (var2.field5120 == null) {
                        if (var0 >= 16385) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     if (var2.field5117 == null) {
                        var2.field5117 = var2.field5120.method3511(new int[]{22050});
                        if (var2.field5117 == null) {
                           continue;
                        }
                     }
                  }

                  if (-99363405 * var2.field5111 < 0) {
                     var4 = 8192;
                     int var14;
                     if (var2.field5112 * 758600991 != 0) {
                        int var5 = var2.field5112 * 758600991 >> 24 & 3;
                        if (var5 == class923.field10295.field3639) {
                           int var6 = (var2.field5112 * 758600991 & 255) << 9;
                           int var7 = class923.field10295.method2550() << 8;
                           class32 var8 = class923.field10295.method1511().field7637;
                           int var9 = var2.field5112 * 758600991 >> 16 & 255;
                           int var10 = var7 + (256 + (var9 << 9) - (int)var8.field5296);
                           int var11 = 758600991 * var2.field5112 >> 8 & 255;
                           int var12 = (var11 << 9) + 256 - (int)var8.field5299 + var7;
                           int var13 = Math.abs(var10) + Math.abs(var12) - 512;
                           if (var13 > var6) {
                              var2.field5111 = 1265930907;
                              continue;
                           }

                           if (var13 < 0) {
                              var13 = 0;
                           }

                           var14 = (var6 - var13) * class615.field8903.field9148.method2717(-2145949986) * var2.field5116 * -1716484165 / var6 >> 2;
                           if (-1 != var2.field5119 * -1271617995) {
                              var9 = var2.field5119 * -1271617995;
                              var11 = var2.field5107 * -1577764425;
                           }

                           if (var10 != 0 || var12 != 0) {
                              int var15 = -(-1847894591 * class232.field8266) - (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) - 4096 & 16383;
                              if (var15 > 8192) {
                                 var15 = 16384 - var15;
                              }

                              int var16;
                              if (var13 <= 0) {
                                 var16 = 8192;
                              } else if (var13 >= 4096) {
                                 var16 = 16384;
                              } else {
                                 var16 = 8192 + (8192 - var13) / 4096;
                              }

                              var4 = var15 * var16 / 8192 + (16384 - var16 >> 1);
                           }
                        } else {
                           var14 = 0;
                        }
                     } else {
                        var14 = var2.field5116 * -1716484165 * (3 == var2.field5110 ? class615.field8903.field9149.method2717(-2143768151) : class615.field8903.field9119.method2717(-2142178675)) >> 2;
                     }

                     if (var14 > 0) {
                        class656 var19 = null;
                        if (1 == var2.field5110) {
                           var19 = var2.field5115.method5834().method5605(class647.field9234);
                        } else if (var2.method3078((byte)-17)) {
                           var19 = var2.field5117;
                        }

                        class436 var20 = var2.field5118 = class436.method4208(var19, var2.field5114 * -447448059, var14, var4);
                        var20.method4172(var2.field5105 * -581110023 - 1);
                        class56.field2321.method3870(var20);
                     }
                  }
               } else {
                  var3 = true;
               }
            } else if (!var2.field5118.method546(-629325116)) {
               var3 = true;
            }

            if (var3) {
               class540.field3926 -= -598588595;

               for(var4 = var1; var4 < -991384187 * class540.field3926; ++var4) {
                  class540.field3927[var4] = class540.field3927[var4 + 1];
               }

               --var1;
            }
         }

         if (class540.field3921 && !class396.method3499(1966738730)) {
            if (class615.field8903.field9150.method2717(-2143085623) != 0 && class540.field3920 * -1256171511 != -1) {
               if (class508.field3967 != null) {
                  class75.method1117(class771.field3732, -1256171511 * class540.field3920, 0, class615.field8903.field9150.method2717(-2142931520), false, class508.field3967, 1987085103);
               } else {
                  class58.method1581(class771.field3732, class540.field3920 * -1256171511, 0, class615.field8903.field9150.method2717(-2147082244), false, -2064254563);
               }
            }

            class540.field3921 = false;
            class508.field3967 = null;
         } else if (class615.field8903.field9150.method2717(-2142436770) != 0 && -1 != -1256171511 * class540.field3920 && !class396.method3499(1908541019)) {
            class701 var18 = class637.method5936(class643.field9969, Client.field2692.field7765, (byte)26);
            var18.field3364.method6364(-1256171511 * class540.field3920, -1115837876);
            Client.field2692.method4380(var18, (byte)-48);
            class540.field3920 = 184109511;
         }

      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "cg.x(" + ')');
      }
   }

   static void method6293(int var0) {
      try {
         if (Client.field2852 * 577335585 < 0) {
            class230 var1 = class600.method5467(-2096843583);
            if (!class602.field8645) {
               class602.field8638 = class602.field8666 * -1914913203 != -1 && class602.field8673 * -278777595 >= -1914913203 * class602.field8666 || (class602.field8663 ? 26 : 22) + -278777595 * class602.field8673 * class602.field8634 * -411680299 > -1111710645 * class97.field614;
            }

            class602.field8678.method905((byte)1);
            class602.field8672.method905((byte)1);

            int var3;
            for(class357 var2 = (class357)class602.field8647.method901(1766612795); var2 != null; var2 = (class357)class602.field8647.method906(49146)) {
               var3 = 946432351 * var2.field1702;
               if (var3 < 1000) {
                  var2.method545(-1460969981);
                  if (59 != var3 && var3 != 2 && 8 != var3 && var3 != 17 && var3 != 15 && 16 != var3 && var3 != 58) {
                     class602.field8678.method897(var2, 281584970);
                  } else {
                     class602.field8672.method897(var2, 892677220);
                  }
               }
            }

            class602.field8678.method900(class602.field8647, -72544370);
            class602.field8672.method900(class602.field8647, -72544370);
            if (class602.field8673 * -278777595 <= 1) {
               class713.field3542 = null;
               class602.field8644 = null;
               class348.field220 = null;
            } else {
               if (class118.method1458((byte)41) && -278777595 * class602.field8673 > 2) {
                  class713.field3542 = (class357)class602.field8647.field1104.field642.field642;
               } else {
                  class713.field3542 = (class357)class602.field8647.field1104.field642;
               }

               class602.field8644 = (class357)class602.field8647.field1104.field642;
               if (-278777595 * class602.field8673 > 2) {
                  class348.field220 = (class357)class602.field8644.field642;
               } else {
                  class348.field220 = null;
               }
            }

            class284 var12 = (class284) Client.field2808.method901(1766612795);
            int var4;
            if (var12 != null) {
               var3 = var12.method6667((byte)7);
               var4 = var12.method6680(-2068489909);
            } else {
               var3 = class912.field10424.method5524((byte)-80);
               var4 = class912.field10424.method5513((byte)-10);
            }

            boolean var14;
            if (class602.field8645) {
               int var6;
               int var7;
               if (class71.method1090(class422.field9604.field2969, var12, (byte)-119)) {
                  int var5;
                  class357 var8;
                  class906 var15;
                  if (class602.field8639 != null && var3 >= class514.field4319 * 805710735 && var3 <= 805710735 * class514.field4319 + 2054409059 * class965.field2535 && var4 >= class936.field10310 * -1370784315 && var4 <= class936.field10310 * -1370784315 + class382.field1411 * -1855216229) {
                     var5 = -1;

                     for(var6 = 0; var6 < -628325139 * class602.field8639.field8120; ++var6) {
                        if (class602.field8663) {
                           var7 = var1.field8230 * 1110385787 + -1370784315 * class936.field10310 + 20 + 1 + var6 * class602.field8634 * -411680299;
                           if (var4 > var7 - var1.field8230 * 1110385787 - 1 && var4 < -1883958527 * var1.field8225 + var7) {
                              var5 = var6;
                           }
                        } else {
                           var7 = -1370784315 * class936.field10310 + 31 + -411680299 * class602.field8634 * var6;
                           if (var4 > var7 - 13 && var4 < var7 + 3) {
                              var5 = var6;
                           }
                        }
                     }

                     if (-1 != var5) {
                        var6 = 0;
                        var15 = new class906(class602.field8639.field8121);

                        for(var8 = (class357)var15.method6341((short)15399); var8 != null; var8 = (class357)var15.next()) {
                           if (var5 == var6) {
                              class916.method6463(var8, var3, var4, (short)916);
                              break;
                           }

                           ++var6;
                        }
                     }

                     class979.method1835(2025307040);
                  } else if (var3 >= class622.field9006 * -1347746885 && var3 <= 608683427 * class809.field4595 + class622.field9006 * -1347746885 && var4 >= class281.field10643 * 1089948687 && var4 <= class873.field9785 * 1396607435 + class281.field10643 * 1089948687) {
                     if (!class602.field8638) {
                        var5 = -1;

                        for(var6 = 0; var6 < -278777595 * class602.field8673; ++var6) {
                           if (class602.field8663) {
                              var7 = class602.field8634 * -411680299 * (-278777595 * class602.field8673 - 1 - var6) + 1 + var1.field8230 * 1110385787 + 20 + class281.field10643 * 1089948687;
                              if (var4 > var7 - var1.field8230 * 1110385787 - 1 && var4 < -1883958527 * var1.field8225 + var7) {
                                 var5 = var6;
                              }
                           } else {
                              var7 = -411680299 * class602.field8634 * (class602.field8673 * -278777595 - 1 - var6) + class281.field10643 * 1089948687 + 31;
                              if (var4 > var7 - 13 && var4 < var7 + 3) {
                                 var5 = var6;
                              }
                           }
                        }

                        if (-1 != var5) {
                           var6 = 0;
                           class19 var13 = new class19(class602.field8647);

                           for(var8 = (class357)var13.method3367(1073452729); var8 != null; var8 = (class357)var13.next()) {
                              if (var6 == var5) {
                                 class916.method6463(var8, var3, var4, (short)916);
                                 break;
                              }

                              ++var6;
                           }
                        }

                        class979.method1835(2025307040);
                     } else {
                        var5 = -1;

                        for(var6 = 0; var6 < 1592446965 * class602.field8646; ++var6) {
                           if (class602.field8663) {
                              var7 = class602.field8634 * -411680299 * var6 + 1 + 20 + class281.field10643 * 1089948687 + var1.field8230 * 1110385787;
                              if (var4 > var7 - 1110385787 * var1.field8230 - 1 && var4 < var1.field8225 * -1883958527 + var7) {
                                 var5 = var6;
                                 break;
                              }
                           } else {
                              var7 = class602.field8634 * -411680299 * var6 + 1089948687 * class281.field10643 + 31;
                              if (var4 > var7 - 13 && var4 < var7 + 3) {
                                 var5 = var6;
                                 break;
                              }
                           }
                        }

                        if (-1 != var5) {
                           var6 = 0;
                           var15 = new class906(class602.field8649);

                           for(class497 var16 = (class497)var15.method6341((short)6300); var16 != null; var16 = (class497)var15.next()) {
                              if (var6 == var5) {
                                 class916.method6463((class357)var16.field8121.field4317.field208, var3, var4, (short)916);
                                 class979.method1835(2025307040);
                                 break;
                              }

                              ++var6;
                           }
                        }
                     }
                  }
               } else {
                  var14 = false;
                  if (class602.field8639 != null) {
                     if (var3 >= class514.field4319 * 805710735 - 10 && var3 <= 10 + class965.field2535 * 2054409059 + class514.field4319 * 805710735 && var4 >= -1370784315 * class936.field10310 - 10 && var4 <= 10 + class382.field1411 * -1855216229 + class936.field10310 * -1370784315) {
                        var14 = true;
                     } else {
                        class71.method1084(1952497590);
                     }
                  }

                  if (!var14) {
                     if (var3 >= -1347746885 * class622.field9006 - 10 && var3 <= 10 + class622.field9006 * -1347746885 + class809.field4595 * 608683427 && var4 >= class281.field10643 * 1089948687 - 10 && var4 <= 1396607435 * class873.field9785 + 1089948687 * class281.field10643 + 10) {
                        if (class602.field8638) {
                           var6 = -1;
                           var7 = -1;

                           int var18;
                           for(var18 = 0; var18 < 1592446965 * class602.field8646; ++var18) {
                              int var9;
                              if (class602.field8663) {
                                 var9 = 20 + class281.field10643 * 1089948687 + 1110385787 * var1.field8230 + 1 + var18 * -411680299 * class602.field8634;
                                 if (var4 > var9 - 1110385787 * var1.field8230 - 1 && var4 < var1.field8225 * -1883958527 + var9) {
                                    var6 = var18;
                                    var7 = var9 - var1.field8230 * 1110385787 - 1;
                                    break;
                                 }
                              } else {
                                 var9 = 31 + class281.field10643 * 1089948687 + class602.field8634 * -411680299 * var18;
                                 if (var4 > var9 - 13 && var4 < var9 + 3) {
                                    var6 = var18;
                                    var7 = var9 - 13;
                                    break;
                                 }
                              }
                           }

                           if (var6 != -1) {
                              var18 = 0;
                              class906 var17 = new class906(class602.field8649);

                              for(class497 var10 = (class497)var17.method6341((short)26353); var10 != null; var10 = (class497)var17.next()) {
                                 if (var6 == var18) {
                                    if (var10.field8120 * -628325139 > 1) {
                                       class276.method6617(var10, var7, 967296483);
                                    }
                                    break;
                                 }

                                 ++var18;
                              }
                           }
                        }
                     } else {
                        class979.method1835(2025307040);
                     }
                  }
               }
            } else {
               var14 = class71.method1090(class422.field9604.field2970, var12, (byte)-110);
               boolean var19 = class71.method1090(class422.field9604.field2966, var12, (byte)-117);
               boolean var20 = class71.method1090(class422.field9604.field2968, var12, (byte)-48);
               if ((var14 || var19) && (1 == 2089115297 * Client.field2812 && -278777595 * class602.field8673 > 2 || class305.method373(-1173724343))) {
                  var20 = true;
               }

               if (var20 && -278777595 * class602.field8673 > 0) {
                  if (Client.field2832 == null && Client.field2846 * -651858367 == 0) {
                     class184.method3242(var3, var4, (byte)28);
                  } else {
                     class602.field8643 = -1808822290;
                  }
               } else if (var19) {
                  if (class348.field220 != null) {
                     class916.method6463(class348.field220, var3, var4, (short)916);
                  }
               } else if (var14) {
                  if (class713.field3542 == null) {
                     if (Client.field2817) {
                        class422.method5724((byte)4);
                     }
                  } else {
                     boolean var21 = Client.field2832 != null || Client.field2846 * -651858367 > 0;
                     if (var21) {
                        class602.field8643 = 1243072503;
                        class469.field7328 = class713.field3542;
                     } else {
                        class916.method6463(class713.field3542, var3, var4, (short)916);
                     }
                  }
               }

               if (Client.field2832 == null && Client.field2846 * -651858367 == 0) {
                  class602.field8643 = 0;
                  class469.field7328 = null;
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "cg.d(" + ')');
      }
   }

   public static void method6294(class564[] var0, int var1) {
      try {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            class564 var3 = var0[var2];
            if (var3.field982 != null) {
               class202 var4 = new class202();
               var4.field7578 = var3;
               var4.field7583 = var3.field982;
               class117.method1342(var4, 2000000, (short)3156);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cg.i(" + ')');
      }
   }

   static final void method6295(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[1883543357 * var0.field3176];
         var0.field3156 -= -783761378;
         int var3 = var0.field3161[var0.field3156 * 681479919];
         if (var3 >= 0 && var3 < var0.field3153[var2]) {
            var0.field3155[var2][var3] = var0.field3161[681479919 * var0.field3156 + 1];
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "cg.ar(" + ')');
      }
   }

   static final void method6296(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         int var4 = var2.field3161[(var2.field3156 -= -391880689) * 681479919];
         int var5 = var2.field3161[(var2.field3156 -= -391880689) * 681479919];
         if (var5 >= 1 && var5 <= 10) {
            var0.method837(var5 - 1, var4, (byte)17);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "cg.jl(" + ')');
      }
   }

   static final void method6297(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 457937409 * var3.field887;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "cg.ow(" + ')');
      }
   }

   static final void method6298(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field885 * 1573706803;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "cg.oi(" + ')');
      }
   }

   public static boolean method6299(int var0, int var1) {
      try {
         return var0 == 0 || 2 == var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cg.p(" + ')');
      }
   }

   static final void method6300(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class518 var3 = class85.field1121.method1566(var2);
         int var4;
         if (var3.field4289) {
            var4 = var3.field4281 * 292187293;
         } else if (var3.field4248) {
            var4 = class422.field9604.field2967 * 1295181471;
         } else {
            var4 = 363537303 * class422.field9604.field2974;
         }

         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cg.abc(" + ')');
      }
   }

   static final void method6301(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class537.method2317(var3, var4, var0, -735997058);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cg.lp(" + ')');
      }
   }

   static final void method6302(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         class856.method5201(var2, -1578243547);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cg.agu(" + ')');
      }
   }
}
