public class class389 {
   public int field1521;
   public int field1522;
   public int field1523;
   public static class180 field1524;

   public class389(int var1, int var2, int var3) {
      this.field1523 = var1 * 1306643131;
      this.field1521 = var2 * 2061281455;
      this.field1522 = 1901982267 * var3;
   }

   public class389(int var1) {
      if (-1 == var1) {
         this.field1523 = -1306643131;
      } else {
         this.field1523 = (var1 >> 28 & 3) * 1306643131;
         this.field1521 = (var1 >> 14 & 16383) * 2061281455;
         this.field1522 = (var1 & 16383) * 1901982267;
      }

   }

   public String toString() {
      try {
         return this.field1523 * 1008331379 + "," + (-1760580017 * this.field1521 >> 6) + "," + (283514611 * this.field1522 >> 6) + "," + (-1760580017 * this.field1521 & 63) + "," + (283514611 * this.field1522 & 63);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "of.toString(" + ')');
      }
   }

   public class389() {
      this.field1523 = -1306643131;
   }

   static final void method1147(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-13);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -749038817 * var3.field880;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "of.qq(" + ')');
      }
   }

   static final void method1148(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-35);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var3.field948 * -1993792969;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "of.rl(" + ')');
      }
   }

   static final void method1149(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         if (class730.field2924 * 1131012101 == 2 && var2 < class730.field2923 * -1054937867) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class730.field2932[var2] ? 1 : 0;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "of.we(" + ')');
      }
   }

   static final void method1150(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var2 >> 14 & 16383;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "of.tj(" + ')');
      }
   }

   static final void method1151(class746 var0, boolean var1, int var2) {
      try {
         class507 var3 = var0.method2554(1203863612);
         if (2050671733 * var0.field4084 == 0) {
            var0.field4088 = 0;
            class545.field3910 = class647.field9231.field9230 * -2059464589;
            class488.field8423 = 0;
         } else {
            if (var0.field4042.method2775((byte)-91) && !var0.field4042.method2782(-65534)) {
               class160 var4 = var0.field4042.method2776(295193907);
               if (var0.field4089 * 1888275831 > 0 && 62820525 * var4.field6666 == 0) {
                  var0.field4088 += -248378059;
                  class545.field3910 = class647.field9231.field9230 * -2059464589;
                  class488.field8423 = 0;
                  return;
               }

               if (1888275831 * var0.field4089 <= 0 && var4.field6673 * -882531177 == 0) {
                  var0.field4088 += -248378059;
                  class545.field3910 = -2059464589 * class647.field9231.field9230;
                  class488.field8423 = 0;
                  return;
               }
            }

            for(int var19 = 0; var19 < var0.field4040.length; ++var19) {
               if (var0.field4040[var19].field10341 * -967533709 != -1 && var0.field4040[var19].field10340.method2782(-65534)) {
                  class745 var5 = class635.field9823.method1053(var0.field4040[var19].field10341 * -967533709, -1879864965);
                  if (var5.field4117 && var5.field4107 * 1505778629 != -1) {
                     class160 var6 = class936.field10313.method2256(1505778629 * var5.field4107, (byte)-112);
                     if (var0.field4089 * 1888275831 > 0 && var6.field6666 * 62820525 == 0) {
                        var0.field4088 += -248378059;
                        class545.field3910 = -2059464589 * class647.field9231.field9230;
                        class488.field8423 = 0;
                        return;
                     }

                     if (var0.field4089 * 1888275831 <= 0 && var6.field6673 * -882531177 == 0) {
                        var0.field4088 += -248378059;
                        class545.field3910 = class647.field9231.field9230 * -2059464589;
                        class488.field8423 = 0;
                        return;
                     }
                  }
               }
            }

            class32 var20 = class32.method3290(var0.method1511().field7637);
            int var21 = (int)var20.field5296;
            int var22 = (int)var20.field5299;
            int var7 = var0.field4085[var0.field4084 * 2050671733 - 1] * 512 + var0.method2550() * 256;
            int var8 = var0.field4055[var0.field4084 * 2050671733 - 1] * 512 + var0.method2550() * 256;
            if (var21 < var7) {
               if (var22 < var8) {
                  var0.method2542(10240, (byte)1);
               } else if (var22 > var8) {
                  var0.method2542(14336, (byte)1);
               } else {
                  var0.method2542(12288, (byte)1);
               }
            } else if (var21 > var7) {
               if (var22 < var8) {
                  var0.method2542(6144, (byte)1);
               } else if (var22 > var8) {
                  var0.method2542(2048, (byte)1);
               } else {
                  var0.method2542(4096, (byte)1);
               }
            } else if (var22 < var8) {
               var0.method2542(8192, (byte)1);
            } else if (var22 > var8) {
               var0.method2542(0, (byte)1);
            }

            byte var9 = var0.field4074[2050671733 * var0.field4084 - 1];
            if (var1 || var7 - var21 <= 1024 && var7 - var21 >= -1024 && var8 - var22 <= 1024 && var8 - var22 >= -1024) {
               int var10 = 16;
               boolean var11 = true;
               if (var0 instanceof class60) {
                  var11 = ((class60)var0).field1637.field9900;
               }

               int var12;
               if (var11) {
                  var12 = 2145248039 * var0.field4032 - var0.field4048.field9268 * 259411823;
                  if (var12 != 0 && var0.field4054 * 1433412323 == -1 && var0.field4079 * 907865649 != 0) {
                     var10 = 8;
                  }

                  if (!var1 && 2050671733 * var0.field4084 > 2) {
                     var10 = 24;
                  }

                  if (!var1 && var0.field4084 * 2050671733 > 3) {
                     var10 = 32;
                  }
               } else {
                  if (!var1 && var0.field4084 * 2050671733 > 1) {
                     var10 = 24;
                  }

                  if (!var1 && 2050671733 * var0.field4084 > 2) {
                     var10 = 32;
                  }
               }

               if (-1531994851 * var0.field4088 > 0 && 2050671733 * var0.field4084 > 1) {
                  var10 = 32;
                  var0.field4088 -= -248378059;
               }

               if (var9 == class647.field9229.field9230) {
                  var10 <<= 1;
               } else if (var9 == class647.field9233.field9230) {
                  var10 >>= 1;
               }

               if (-1 != 1830307505 * var3.field4010) {
                  var10 <<= 9;
                  if (var0.field4084 * 2050671733 == 1) {
                     var12 = var0.field4090 * -1520103925 * -1520103925 * var0.field4090;
                     int var13 = ((int)var20.field5296 > var7 ? (int)var20.field5296 - var7 : var7 - (int)var20.field5296) << 9;
                     int var14 = ((int)var20.field5299 > var8 ? (int)var20.field5299 - var8 : var8 - (int)var20.field5299) << 9;
                     int var15 = var13 > var14 ? var13 : var14;
                     int var16 = -634352286 * var3.field4010 * var15;
                     if (var12 > var16) {
                        var0.field4090 = -1520103925 * var0.field4090 / 2 * 121933219;
                     } else if (var12 / 2 > var15) {
                        var0.field4090 -= var3.field4010 * 1936228275;
                        if (-1520103925 * var0.field4090 < 0) {
                           var0.field4090 = 0;
                        }
                     } else if (var0.field4090 * -1520103925 < var10) {
                        var0.field4090 += 1936228275 * var3.field4010;
                        if (var0.field4090 * -1520103925 > var10) {
                           var0.field4090 = 121933219 * var10;
                        }
                     }
                  } else if (-1520103925 * var0.field4090 < var10) {
                     var0.field4090 += var3.field4010 * 1936228275;
                     if (var0.field4090 * -1520103925 > var10) {
                        var0.field4090 = var10 * 121933219;
                     }
                  } else if (var0.field4090 * -1520103925 > 0) {
                     var0.field4090 -= 1936228275 * var3.field4010;
                     if (var0.field4090 * -1520103925 < 0) {
                        var0.field4090 = 0;
                     }
                  }

                  var10 = -1520103925 * var0.field4090 >> 9;
                  if (var10 < 1) {
                     var10 = 1;
                  }
               }

               class488.field8423 = 0;
               if (var7 == var21 && var8 == var22) {
                  class545.field3910 = class647.field9231.field9230 * -2059464589;
               } else {
                  if (var21 < var7) {
                     var20.field5296 += (float)var10;
                     class488.field8423 = 1633205647 * (class488.field8423 * 236175727 | 4);
                     if (var20.field5296 > (float)var7) {
                        var20.field5296 = (float)var7;
                     }
                  } else if (var21 > var7) {
                     var20.field5296 -= (float)var10;
                     class488.field8423 = (class488.field8423 * 236175727 | 8) * 1633205647;
                     if (var20.field5296 < (float)var7) {
                        var20.field5296 = (float)var7;
                     }
                  }

                  if (var22 < var8) {
                     var20.field5299 += (float)var10;
                     class488.field8423 = 1633205647 * (236175727 * class488.field8423 | 1);
                     if (var20.field5299 > (float)var8) {
                        var20.field5299 = (float)var8;
                     }
                  } else if (var22 > var8) {
                     var20.field5299 -= (float)var10;
                     class488.field8423 = 1633205647 * (class488.field8423 * 236175727 | 2);
                     if (var20.field5299 < (float)var8) {
                        var20.field5299 = (float)var8;
                     }
                  }

                  var0.method1514(var20);
                  if (var10 >= 32) {
                     class545.field3910 = class647.field9229.field9230 * -2059464589;
                  } else {
                     class545.field3910 = -2059464589 * var9;
                  }
               }

               if ((int)var20.field5296 == var7 && (int)var20.field5299 == var8) {
                  var0.field4084 -= -1013322787;
                  if (1888275831 * var0.field4089 > 0) {
                     var0.field4089 -= -1479140281;
                  }
               }

               var20.method3291();
            } else {
               var0.method1515((float)var7, var20.field5300, (float)var8);
               var0.method2543(var0.field4032 * 2145248039, false, 688514105);
               var0.field4084 -= -1013322787;
               if (1888275831 * var0.field4089 > 0) {
                  var0.field4089 -= -1479140281;
               }

               class545.field3910 = -2059464589 * class647.field9231.field9230;
               class488.field8423 = 0;
               var20.method3291();
            }
         }

      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "of.hy(" + ')');
      }
   }

   static void method1152(int var0, int var1, class564 var2, int var3) {
      try {
         int var4 = var2.field881 * -2093041337 + var0;
         int var5 = 15 + var1;
         if (class730.field2648) {
            int var6 = -256;
            if (914379507 * class730.field1807 < 20) {
               var6 = -65536;
            }

            class958.field3479.method1662("Fps:" + 914379507 * class730.field1807, var4, var5, var6, -1, (byte)-7);
            var5 += 15;
            Runtime var7 = Runtime.getRuntime();
            long var8 = var7.totalMemory() / 1024L;
            long var10 = var8 - var7.freeMemory() / 1024L;
            int var12 = -256;
            if (var10 > 262144L) {
               var12 = -65536;
            }

            class958.field3479.method1662("Mem:" + var10 + "/" + var8 + "k", var4, var5, var12, -1, (byte)-69);
            var5 += 15;
            long var13 = class730.field2692.field7775.method937(1026179047);
            String var15 = "N/A";
            if (-1L != var13) {
               var15 = var13 + "ms";
               if (var13 > 500L) {
                  var15 = class56.method1545(16711680, -2018696638) + var15 + class56.method1545(16776960, -1609373980);
               }
            }

            class958.field3479.method1662("Game: In:" + -1705791507 * class730.field2692.field7778 + "B/s " + "Out:" + class730.field2692.field7762 * 1114720205 + "B/s " + "Ping:" + var15, var4, var5, -256, -1, (byte)-47);
            var5 += 15;
            long var16 = class730.field2674.field7775.method937(529918549);
            String var18 = "N/A";
            if (var16 != -1L) {
               var18 = var16 + "ms";
               if (var16 > 500L) {
                  var18 = class56.method1545(16711680, -2004094405) + var18 + class56.method1545(16776960, -1875733087);
               }
            }

            class958.field3479.method1662("Lobby: In:" + class730.field2674.field7778 * -1705791507 + "B/s " + "Out:" + 1114720205 * class730.field2674.field7762 + "B/s " + "Ping:" + var18, var4, var5, -256, -1, (byte)-30);
            var5 += 15;
            int var19 = class593.field1623.method4802() / 1024;
            class958.field3479.method1662("Offheap:" + var19 + "k", var4, var5, var19 > 65536 ? -65536 : -256, -1, (byte)-50);
            var5 += 15;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;

            int var23;
            for(var23 = 0; var23 < class593.field1624.length; ++var23) {
               if (class593.field1624[var23] == null) {
                  if (var3 == -1583970959) {
                     return;
                  }
               } else {
                  var20 += class593.field1624[var23].method1966(-2104328128);
                  var21 += class593.field1624[var23].method1961((byte)1);
                  var22 += class593.field1624[var23].method1962(-856500842);
               }
            }

            var23 = var22 * 100 / var20;
            int var24 = 10000 * var21 / var20;
            String var25 = "Cache:" + class540.method2464((long)var24, 2, true, class423.field9583, (short)-6940) + "% (" + var23 + "%)";
            class202.field7587.method1662(var25, var4, var5, -256, -1, (byte)-26);
            var5 += 12;
         }

      } catch (RuntimeException var26) {
         throw class158.method3445(var26, "of.km(" + ')');
      }
   }

   static void method1153(class180 var0, int var1, int var2, int var3, boolean var4, long var5, int var7, int var8) {
      try {
         class818.field4611 = -1262101671;
         class818.field4621 = var0;
         class818.field4622 = var1 * -407545223;
         class818.field4623 = var2 * -956029523;
         class818.field4625 = null;
         class818.field4616 = -2102749749 * var3;
         class342.field294 = var4;
         class573.field105 = 1446879088;
         class613.field8894 = var5 * 7092526387081397629L;
         class916.field10417 = -420794947 * var7;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "of.i(" + ')');
      }
   }

   public static void method1154(int var0, int var1, int var2, int var3, short var4) {
      try {
         class206 var5;
         for(var5 = (class206)class206.field7064.method901(1766612795); var5 != null; var5 = (class206)class206.field7064.method906(49146)) {
            class514.method2711(var5, var0, var1, var2, var3, -409300106);
         }

         byte var6;
         class507 var7;
         int var8;
         int var9;
         class32 var13;
         for(var5 = (class206)class206.field7098.method901(1766612795); var5 != null; var5 = (class206)class206.field7098.method906(49146)) {
            var6 = 1;
            var7 = var5.field7076.method2554(-1185806146);
            var8 = var5.field7076.field4041.method2779(1961619021);
            if (-1 != var8 && !var5.field7076.field4058) {
               if (230243963 * var7.field3979 != var8 && var7.field4007 * 491753731 != var8 && -783166629 * var7.field3982 != var8 && var8 != var7.field4004 * -2054940183) {
                  if (328817727 * var7.field4013 == var8 || -1238642279 * var7.field3980 == var8 || var7.field3986 * 124010991 == var8 || -907666203 * var7.field3985 == var8) {
                     var6 = 3;
                  }
               } else {
                  var6 = 2;
               }
            } else {
               var6 = 0;
            }

            if (var6 != 974385733 * var5.field7082) {
               var9 = class176.method3169(var5.field7076, 2092032929);
               class401 var10 = var5.field7076.field1637;
               if (var10.field9924 != null) {
                  var10 = var10.method6110(class827.field9037, 2075279963);
               }

               if (var10 != null && -1 != var9) {
                  if (var9 == 391847895 * var5.field7086 && var5.field7087 == var10.field9916) {
                     var5.field7082 = 636899469 * var6;
                     var5.field7092 = var10.field9915 * -1283486135;
                  } else {
                     boolean var11 = false;
                     if (var5.field7090 != null) {
                        var5.field7092 -= 584623616;
                        if (43235291 * var5.field7092 <= 0) {
                           class56.field2321.method3875(var5.field7090);
                           var5.field7090 = null;
                           var11 = true;
                        }
                     } else {
                        var11 = true;
                     }

                     if (var11) {
                        var5.field7092 = -1283486135 * var10.field9915;
                        var5.field7089 = null;
                        var5.field7088 = null;
                        var5.field7086 = 502744039 * var9;
                        var5.field7087 = var10.field9916;
                        var5.field7082 = 636899469 * var6;
                     }
                  }
               } else {
                  var5.field7086 = -502744039;
                  var5.field7087 = false;
                  var5.field7082 = var6 * 636899469;
               }
            }

            var13 = var5.field7076.method1511().field7637;
            var5.field7068 = -7217919 * (int)var13.field5296;
            var5.field7070 = ((int)var13.field5296 + (var5.field7076.method2550() << 8)) * 305826635;
            var5.field7066 = 584186023 * (int)var13.field5299;
            var5.field7071 = ((int)var13.field5299 + (var5.field7076.method2550() << 8)) * -1647445571;
            var5.field7067 = var5.field7076.field3639 * 2135210127;
            class514.method2711(var5, var0, var1, var2, var3, -409300106);
         }

         for(var5 = (class206)class206.field7083.method2946(2005558160); var5 != null; var5 = (class206)class206.field7083.method2945((byte)-39)) {
            var6 = 1;
            var7 = var5.field7077.method2554(1149258153);
            var8 = var5.field7077.field4041.method2779(1924378402);
            if (-1 != var8 && !var5.field7077.field4058) {
               if (var8 != 230243963 * var7.field3979 && var8 != 491753731 * var7.field4007 && var8 != var7.field3982 * -783166629 && var8 != -2054940183 * var7.field4004) {
                  if (var7.field4013 * 328817727 == var8 || var8 == -1238642279 * var7.field3980 || 124010991 * var7.field3986 == var8 || var8 == var7.field3985 * -907666203) {
                     var6 = 3;
                  }
               } else {
                  var6 = 2;
               }
            } else {
               var6 = 0;
            }

            if (var6 != var5.field7082 * 974385733) {
               var9 = class509.method2534(var5.field7077, 2117239368);
               if (var9 == var5.field7086 * 391847895 && var5.field7087 == var5.field7077.field3375) {
                  var5.field7092 = -1138033583 * var5.field7077.field3394;
                  var5.field7082 = var6 * 636899469;
               } else {
                  boolean var14 = false;
                  if (var5.field7090 != null) {
                     var5.field7092 -= 584623616;
                     if (43235291 * var5.field7092 <= 0) {
                        class56.field2321.method3875(var5.field7090);
                        var5.field7090 = null;
                        var14 = true;
                     }
                  } else {
                     var14 = true;
                  }

                  if (var14) {
                     var5.field7092 = -1138033583 * var5.field7077.field3394;
                     var5.field7089 = null;
                     var5.field7088 = null;
                     var5.field7086 = var9 * 502744039;
                     var5.field7087 = var5.field7077.field3375;
                     var5.field7082 = var6 * 636899469;
                  }
               }
            }

            var13 = var5.field7077.method1511().field7637;
            var5.field7068 = -7217919 * (int)var13.field5296;
            var5.field7070 = ((int)var13.field5296 + (var5.field7077.method2550() << 8)) * 305826635;
            var5.field7066 = 584186023 * (int)var13.field5299;
            var5.field7071 = ((int)var13.field5299 + (var5.field7077.method2550() << 8)) * -1647445571;
            var5.field7067 = var5.field7077.field3639 * 2135210127;
            class514.method2711(var5, var0, var1, var2, var3, -409300106);
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "of.q(" + ')');
      }
   }

   static final void method1155(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[1883543357 * var0.field3176];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = ((class946)var0.field3159).field3402.method6445(var2, 1440952834);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "of.ak(" + ')');
      }
   }
}
