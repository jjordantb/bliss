import java.io.IOException;

public class class574 implements class54 {
   class180 field150;
   class980 field151;
   class180 field152;
   class727 field153;

   public boolean method1537(int var1) {
      try {
         boolean var2 = true;
         if (!this.field152.method3280(this.field151.field3193, -457216440)) {
            var2 = false;
         }

         if (!this.field150.method3280(this.field151.field3193, -457216440)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fc.b(" + ')');
      }
   }

   public void method1543(boolean var1, byte var2) {
      try {
         if (var1) {
            int var3 = this.field151.field3190.method1786(this.field151.field3184, class730.field2775, -2104401433) + this.field151.field3186;
            int var4 = this.field151.field3189.method3090(this.field151.field3185, class730.field2784, -1504826584) + this.field151.field3187;
            this.field153.method1663(this.field151.field3191, var3, var4, this.field151.field3184, this.field151.field3185, this.field151.field3194, this.field151.field3195, this.field151.field3188, this.field151.field3183, this.field151.field3192, (class48[])null, (int[])null, (class23)null, 0, 0, -45995166);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fc.f(" + ')');
      }
   }

   public void method1538(int var1) {
      try {
         class230 var2 = class213.method3814(this.field150, this.field151.field3193, 1240803660);
         this.field153 = class593.field1623.method4936(var2, class922.method6236(this.field152, this.field151.field3193), true);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fc.a(" + ')');
      }
   }

   class574(class180 var1, class180 var2, class980 var3) {
      this.field151 = var3;
      this.field152 = var1;
      this.field150 = var2;
   }

   static int method129(int var0) {
      try {
         return ++class503.field4101 - 1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "fc.a(" + ')');
      }
   }

   static final void method130(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-105);
         class131 var4 = class382.field1410[var2 >> 16];
         class754.method2662(var3, var4, var0, (byte)46);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fc.lf(" + ')');
      }
   }

   public static void method131(class112 var0, int var1, int var2, int var3) {
      try {
         class744 var4 = class909.method6439(-1745561895);
         class307.method389(var0, var1, var2, var4, 536465062);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fc.r(" + ')');
      }
   }

   static char method132(char var0, int var1) {
      try {
         switch(var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fc.k(" + ')');
      }
   }

   static final void method133(byte var0) {
      try {
         if (class730.field2650 >= 0) {
            class730.field2870 = class730.field2915;
         }

         if (class730.field2692.field7782) {
            class730.field2692.field7782 = false;
            class307.method387(-1982513993);
         } else {
            if (!class602.field8645) {
               class417.method5691((byte)60);
            }

            for(int var1 = 0; var1 < 100; ++var1) {
               if (!class341.method257(class730.field2692, 2136824168)) {
                  if (var0 <= 4) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }

            if (class730.field2733 == 0) {
               int var2;
               class701 var11;
               while(class337.method76((byte)35)) {
                  var11 = class637.method5936(class643.field9942, class730.field2692.field7765, (byte)105);
                  var11.field3364.method6361(0);
                  var2 = var11.field3364.field10376;
                  class984.method1882(var11.field3364, -1720754748);
                  var11.field3364.method6426(var11.field3364.field10376 - var2, (byte)-105);
                  class730.field2692.method4380(var11, (byte)-102);
               }

               if (class454.field7230 != null) {
                  if (class454.field7230.field544 != -1) {
                     var11 = class637.method5936(class643.field9946, class730.field2692.field7765, (byte)64);
                     var11.field3364.method6362(class454.field7230.field544, 16711935);
                     class730.field2692.method4380(var11, (byte)-33);
                     class454.field7230 = null;
                     class547.field412 = class27.method3468((byte)1) + 30000L;
                  }
               } else if (class27.method3468((byte)1) >= class547.field412) {
                  class454.field7230 = class730.field2696.method5472(class601.field9203.field4343, (byte)25);
               }

               if (!Loader.field6964) {
                  class341.method258((byte)82);
               }

               if (class730.field2668 > 0 || class730.field2619.size() > 0) {
                  var11 = class637.method5936(class643.field9931, class730.field2692.field7765, (byte)79);
                  var2 = class730.field2668 * 4 + 1 + (class730.field2668 <= 0 ? 1 : 0);
                  var11.field3364.method6362(var2, 16711935);
                  byte var3 = -1;
                  if (class730.field2619.size() > 0) {
                     var3 = ((Byte)class730.field2619.remove(0)).byteValue();
                  }

                  if (var3 == 16) {
                     class730.field2618 = false;
                  }

                  var11.field3364.method6361(var3);
                  if (class730.field2668 <= 0) {
                     var11.field3364.method6361(-1);
                  } else {
                     for(int var4 = 0; var4 < class730.field2668; ++var4) {
                        class742 var5 = class730.field2669[var4];
                        long var6 = var5.method1863(-1501300299) - class978.field3126;
                        if (var6 > 16777215L) {
                           var6 = 16777215L;
                        }

                        class978.field3126 = var5.method1863(-2043012774);
                        int var8 = var5.method1865((byte)-114);
                        if (var8 == 81) {
                           class730.field2618 = true;
                        }

                        var11.field3364.method6361(var8);
                        var11.field3364.method6411((int)var6, (byte)52);
                     }
                  }

                  class730.field2692.method4380(var11, (byte)-79);
               }

               class284 var12 = (class284)class730.field2808.method901(1766612795);
               if (class730.field2697.method5317(-1611682495) != null) {
                  if (3 == class563.field1083) {
                     class276.method6619(78506535);
                  } else if (1 == class563.field1083) {
                     class515.method2694((byte)94);
                  }
               }

               if (class730.field2742) {
                  class730.field2742 = false;
               } else {
                  class730.field2741 /= 2.0F;
               }

               if (class730.field2743) {
                  class730.field2743 = false;
               } else {
                  class730.field2740 /= 2.0F;
               }

               class307.method385((byte)111);
               if (class730.field2733 == 0) {
                  class730.field2697.method5282((byte)2).method5672(class730.field2697, -2061035316);
                  class528.method2245(-2124691803);
                  class932.method6292((short)-26190);
                  if (class730.field2704 > 10) {
                     ++class730.field2692.field7773;
                  }

                  if (class730.field2692.field7773 > 2250) {
                     class307.method387(1705248535);
                  } else {
                     if (class730.field2705 == 3) {
                        class420.method5796(921260863);
                        class977.method1811(1729319705);
                     } else if (class6.field4930.field2495.method1040(var12, class730.field2669, class730.field2668, class381.field1417, -490402318)) {
                        class503.method2587(false, (short)-10206);
                     } else {
                        if (class730.field2705 == 1 && class709.method2016(class730.field2852, -275734557)) {
                           class730.field2697.method5292(new class406(class335.field44, (class513)null), -1991819579);
                           class730.field2705 = 4;
                        }

                        if (4 == class730.field2705 && 17 != class730.field2733) {
                           class949.field3321.method2941((byte)-51);
                           class730.field2705 = 0;
                           class730.field2707 = class730.field2866;
                           class730.field2912 = 0;
                           class256.method4489((byte)-114);
                        }

                        if (class730.field2705 == 0) {
                           var2 = class730.field2866 - class730.field2707;
                           if (class730.field2912 < class949.field3325.length) {
                              while(true) {
                                 class304 var15 = class949.field3325[class730.field2912];
                                 if (var15.field3829 > var2) {
                                    break;
                                 }

                                 var15.method2383(-2077694254);
                                 if (class730.field2705 != 0) {
                                    break;
                                 }

                                 if (++class730.field2912 >= class949.field3325.length) {
                                    if (var0 > 4) {
                                       ;
                                    }
                                    break;
                                 }
                              }
                           }

                           if (class730.field2705 == 0) {
                              for(int var16 = 0; var16 < class949.field3322.length; ++var16) {
                                 class283 var17 = class949.field3322[var16];
                                 if (!var17.field10613) {
                                    if (var0 <= 4) {
                                       throw new IllegalStateException();
                                    }
                                 } else {
                                    Actor var20 = var17.method6636(21832379);
                                    class232.method4664(var20, true, -1897267593);
                                 }
                              }
                           }
                        }
                     }

                     class755.method2655(-1841664621);
                     if (!class730.field2899) {
                        class968.method1736(1446435433);
                        class730.field2899 = true;
                     }

                     class533.method2265(-1345932063);
                     ++class730.field2943;
                     if (class730.field2729 != 0) {
                        class730.field2767 += 20;
                        if (class730.field2767 >= 400) {
                           class730.field2729 = 0;
                        }
                     }

                     if (class35.field5345 != null) {
                        ++class730.field2769;
                        if (class730.field2769 >= 15) {
                           class814.method2932(class35.field5345, -1829287170);
                           class35.field5345 = null;
                        }
                     }

                     class730.field2836 = null;
                     class730.field2920 = false;
                     class730.field2837 = false;
                     class147.field1520 = null;
                     class804.method2824((class564)null, -1, -1, -6089367);
                     if (!class730.field2817) {
                        class730.field2919 = -1;
                     }

                     class625.method5831(-640926851);
                     ++class730.field2915;
                     class701 var13;
                     if (class730.field2848) {
                        var13 = class637.method5936(class643.field10023, class730.field2692.field7765, (byte)91);
                        var13.field3364.method6364(class569.field25 << 28 | class138.field1172 << 14 | class28.field6581, -1116555169);
                        class730.field2692.method4380(var13, (byte)-83);
                        class730.field2848 = false;
                     }

                     while(true) {
                        class202 var14;
                        class564 var18;
                        class564 var19;
                        do {
                           var14 = (class202)class730.field2641.method898(2107909159);
                           if (var14 == null) {
                              while(true) {
                                 do {
                                    var14 = (class202)class730.field2877.method898(2126788731);
                                    if (var14 == null) {
                                       while(true) {
                                          while(true) {
                                             var14 = (class202)class730.field2875.method898(2113415758);
                                             if (var14 == null) {
                                                if (var0 <= 4) {
                                                   throw new IllegalStateException();
                                                }

                                                if (class147.field1520 == null) {
                                                   class730.field2846 = 0;
                                                }

                                                if (class730.field2832 != null) {
                                                   class414.method5600(-1193693208);
                                                }

                                                if (class730.field2790 > 0 && class381.field1417.method1392(82, -510265259) && class381.field1417.method1392(81, 1722713678) && class730.field2663 != 0) {
                                                   var2 = class923.local.field3639 - class730.field2663;
                                                   if (var2 < 0) {
                                                      var2 = 0;
                                                   } else if (var2 > 3) {
                                                      var2 = 3;
                                                   }

                                                   class389 var21 = class730.field2697.method5270(681479919);
                                                   class439.method4280(var2, class923.local.field4085[0] + var21.field1521, class923.local.field4055[0] + var21.field1522, 1979698840);
                                                }

                                                class932.method6293(187981678);

                                                for(var2 = 0; var2 < 5; ++var2) {
                                                   ++class730.field2771[var2];
                                                }

                                                if (class730.field2717 && class730.field2874 < class27.method3468((byte)1) - 60000L) {
                                                   class749.method2525(1315881016);
                                                }

                                                for(class146 var22 = (class146)class730.field2933.method5207(-16777216); var22 != null; var22 = (class146)class730.field2933.method5211(-1081988620)) {
                                                   if ((long)var22.field1550 < class27.method3468((byte)1) / 1000L - 5L) {
                                                      if (var22.field1549 > 0) {
                                                         class702.method1969(5, 0, "", "", "", var22.field1551 + class814.field4775.method2927(class321.field1066, -875414210), 818502865);
                                                      }

                                                      if (var22.field1549 == 0) {
                                                         class702.method1969(5, 0, "", "", "", var22.field1551 + class814.field4776.method2927(class321.field1066, -875414210), -1731923786);
                                                      }

                                                      var22.method2028(180959790);
                                                   }
                                                }

                                                ++class730.field2727;
                                                if (class730.field2727 > 506) {
                                                   class730.field2727 = 0;
                                                   var2 = (int)(Math.random() * 8.0D);
                                                   if ((var2 & 1) == 1) {
                                                      class730.field2798 += class730.field2722 * 1734240325;
                                                   }

                                                   if ((var2 & 2) == 2) {
                                                      class730.field2723 += class730.field2807 * 1874511679;
                                                   }

                                                   if (4 == (var2 & 4)) {
                                                      class730.field2725 += class730.field2726 * -1419578297;
                                                   }
                                                }

                                                if (class730.field2798 < -51) {
                                                   class730.field2722 = -1014442726;
                                                }

                                                if (class730.field2798 > 55) {
                                                   class730.field2722 = 1014442726;
                                                }

                                                if (class730.field2723 < -62) {
                                                   class730.field2807 = 1949913470;
                                                }

                                                if (class730.field2723 > 64) {
                                                   class730.field2807 = -1949913470;
                                                }

                                                if (class730.field2725 < -44) {
                                                   class730.field2726 = -1010535049;
                                                }

                                                if (class730.field2725 > 42) {
                                                   class730.field2726 = 1010535049;
                                                }

                                                ++class730.field2791;
                                                if (class730.field2791 > 505) {
                                                   class730.field2791 = 0;
                                                   var2 = (int)(Math.random() * 8.0D);
                                                   if ((var2 & 1) == 1) {
                                                      class730.field2782 += class730.field2860 * 1227356013;
                                                   }

                                                   if (2 == (var2 & 2)) {
                                                      class730.field2730 += class730.field2954 * 356727603;
                                                   }
                                                }

                                                if (class730.field2782 < -67) {
                                                   class730.field2860 = 1862489290;
                                                }

                                                if (class730.field2782 > 67) {
                                                   class730.field2860 = -1862489290;
                                                }

                                                if (class730.field2730 < -21) {
                                                   class730.field2954 = -852543493;
                                                }

                                                if (class730.field2730 > 10) {
                                                   class730.field2954 = 852543493;
                                                }

                                                ++class730.field2692.field7774;
                                                if (class730.field2692.field7774 > 50) {
                                                   var13 = class637.method5936(class643.field9951, class730.field2692.field7765, (byte)120);
                                                   class730.field2692.method4380(var13, (byte)-57);
                                                }

                                                if (class730.field2695) {
                                                   class898.method5606((byte)-12);
                                                   class730.field2695 = false;
                                                }

                                                try {
                                                   class730.field2692.method4376(-1146717706);
                                                } catch (IOException var9) {
                                                   class307.method387(1323080201);
                                                }

                                                return;
                                             }

                                             var18 = var14.field7578;
                                             if (var18.field879 >= 0) {
                                                var19 = class449.method3756(var18.field885, (byte)36);
                                                if (var19 == null || var19.field1017 == null || var18.field879 >= var19.field1017.length) {
                                                   continue;
                                                }

                                                if (var19.field1017[var18.field879] != var18) {
                                                   if (var0 <= 4) {
                                                      throw new IllegalStateException();
                                                   }
                                                   continue;
                                                }
                                             }

                                             class408.method5470(var14, (byte)-21);
                                          }
                                       }
                                    }

                                    var18 = var14.field7578;
                                    if (var18.field879 < 0) {
                                       break;
                                    }

                                    var19 = class449.method3756(var18.field885, (byte)80);
                                 } while(var19 == null || var19.field1017 == null || var18.field879 >= var19.field1017.length || var19.field1017[var18.field879] != var18);

                                 class408.method5470(var14, (byte)64);
                              }
                           }

                           var18 = var14.field7578;
                           if (var18.field879 < 0) {
                              break;
                           }

                           var19 = class449.method3756(var18.field885, (byte)54);
                        } while(var19 == null || var19.field1017 == null || var18.field879 >= var19.field1017.length || var19.field1017[var18.field879] != var18);

                        class408.method5470(var14, (byte)9);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "fc.gu(" + ')');
      }
   }

   static final void method134(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[var0.field3176];
         class747 var3 = class669.field7396.method75(var2, -1368678783);
         if (var3 == null) {
            throw new RuntimeException();
         } else {
            Integer var4 = var0.field3169.method5778(class730.field2926.field7327 << 16 | var2, (byte)-31);
            int var5;
            if (var4 == null) {
               if (var3.field4143 != 'i' && var3.field4143 != '1') {
                  var5 = -1;
               } else {
                  var5 = 0;
               }
            } else {
               var5 = var4.intValue();
            }

            var0.field3161[++var0.field3156 - 1] = var5;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fc.bv(" + ')');
      }
   }
}
