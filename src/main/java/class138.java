import java.util.Iterator;
import java.util.List;

public abstract class class138 {
   int field1168;
   int field1169;
   int field1170;
   public static byte[][] field1171;
   static int field1172;

   class138(int var1, int var2, int var3) {
      this.field1170 = var1;
      this.field1169 = var2;
      this.field1168 = var3;
   }

   abstract void method984(int var1, int var2, byte var3);

   abstract void method985(int var1, int var2, byte var3);

   abstract void method991(int var1, int var2, byte var3);

   static void method992(class848 var0, int var1, int var2, int var3) {
      try {
         if (var1 >= 0 && var2 >= 0 && class602.field8660 != null) {
            class389 var4 = class730.field2697.method5270(681479919);
            class344 var5 = var0.method4860();
            var0.method5054(class602.field8660);
            var0.method4867(class602.field8662);
            var0.method4986(class602.field8656, class602.field8657, class602.field8656 + class602.field8658, class602.field8657 + class602.field8659);
            var0.method5059(class602.field8656, class602.field8657, class602.field8658, class602.field8659);
            var5.method272(class602.field8662);
            var5.method271(class602.field8660);
            var5.method273();
            int var6 = var1 - class602.field8656;
            int var7 = var2 - class602.field8657;
            int var9;
            int var21;
            int var22;
            int var54;
            if (class730.field2697.method5317(-1611682495) != null && (!class730.field2817 || (class568.field645 & 64) != 0)) {
               int var8 = -1;
               var9 = -1;
               float var10 = (float)var6 * 2.0F / (float)class602.field8658 - 1.0F;
               float var11 = 2.0F * (float)var7 / (float)class602.field8659 - 1.0F;
               var5.method276(var10, var11, -1.0F, class602.field8642);
               float var12 = class602.field8642[0] / class602.field8642[3];
               float var13 = class602.field8642[1] / class602.field8642[3];
               float var14 = class602.field8642[2] / class602.field8642[3];
               var5.method276(var10, var11, 1.0F, class602.field8642);
               float var15 = class602.field8642[0] / class602.field8642[3];
               float var16 = class602.field8642[1] / class602.field8642[3];
               float var17 = class602.field8642[2] / class602.field8642[3];
               float var18 = class981.method1932(var12, var13, var14, var15, var16, var17, 4, 1869450178);
               if (var18 > 0.0F) {
                  float var19 = var15 - var12;
                  float var20 = var17 - var14;
                  var21 = (int)(var12 + var18 * var19);
                  var22 = (int)(var20 * var18 + var14);
                  var8 = var21 + (class923.local.method2550() - 1 << 8) >> 9;
                  var9 = var22 + (class923.local.method2550() - 1 << 8) >> 9;
                  byte var23 = class923.local.field3639;
                  if (var23 < 3 && (class730.field2697.method5296(-86337284).field5406[1][var21 >> 9][var22 >> 9] & 2) != 0) {
                     var54 = var23 + 1;
                  }
               }

               if (-1 != var8 && -1 != var9) {
                  if (class730.field2817 && (class568.field645 & 64) != 0) {
                     class564 var43 = class554.method427(class543.field3820, class730.field2818, -156511736);
                     if (var43 != null) {
                        class984.method1875(class730.field2820, " " + class822.field9048 + " ", class175.field5075, 59, -1, 0L, var8, var9, true, false, (long)(var8 << 32 | var9), true, -1555484950);
                     } else {
                        class422.method5724((byte)4);
                     }
                  } else {
                     if (class559.field545) {
                        class984.method1875(class814.field4784.method2927(class321.field1066, -875414210), "", -1, 60, -1, 0L, var8, var9, true, false, (long)(var8 << 32 | var9), true, -1698149123);
                     }

                     class984.method1875(class776.field3730, "", class730.field2803, 23, -1, 0L, var8, var9, true, false, (long)(var8 << 32 | var9), true, -1114825452);
                  }
               }
            }

            class472 var31 = class730.field2697.method5317(-1611682495).field3873;
            var9 = var1;
            int var32 = var2;
            List var33 = var31.field8234;
            Iterator var34 = var33.iterator();

            do {
               while(true) {
                  class192 var35;
                  do {
                     if (!var34.hasNext()) {
                        return;
                     }

                     var35 = (class192)var34.next();
                  } while(!class730.field2655 && class923.local.field3639 != var35.field7022.field3639);

                  if (!var35.method3740(var0, var9, var32, 1628119840)) {
                     break;
                  }

                  boolean var36 = false;
                  boolean var37 = false;
                  int var38;
                  int var39;
                  if (var35.field7022 instanceof Animable) {
                     var38 = ((Animable)var35.field7022).field8299;
                     var39 = ((Animable)var35.field7022).field8296;
                  } else {
                     class32 var40 = var35.field7022.method1511().field7637;
                     var38 = (int)var40.field5296 >> 9;
                     var39 = (int)var40.field5299 >> 9;
                  }

                  class32 var26;
                  int var27;
                  int var28;
                  int var45;
                  if (var35.field7022 instanceof Player) {
                     Player var41 = (Player)var35.field7022;
                     var45 = var41.method2550();
                     class32 var48 = var41.method1511().field7637;
                     if ((var45 & 1) == 0 && ((int)var48.field5296 & 511) == 0 && ((int)var48.field5299 & 511) == 0 || (var45 & 1) == 1 && ((int)var48.field5296 & 511) == 256 && 256 == ((int)var48.field5299 & 511)) {
                        var21 = (int)var48.field5296 - (var41.method2550() - 1 << 8);
                        var22 = (int)var48.field5299 - (var41.method2550() - 1 << 8);

                        for(var54 = 0; var54 < class730.field2684; ++var54) {
                           class437 var24 = (class437)class730.field2677.method2942((long)class730.field2680[var54]);
                           if (var24 != null) {
                              Npc var25 = (Npc)var24.field7515;
                              if (class730.field2866 != var25.field4034 && var25.field4087) {
                                 var26 = var25.method1511().field7637;
                                 var27 = (int)var26.field5296 - (var25.field1637.field9923 - 1 << 8);
                                 var28 = (int)var26.field5299 - (var25.field1637.field9923 - 1 << 8);
                                 if (var27 >= var21 && var25.field1637.field9923 <= var41.method2550() - (var27 - var21 >> 9) && var28 >= var22 && var25.field1637.field9923 <= var41.method2550() - (var28 - var22 >> 9)) {
                                    class554.method424(var25, class923.local.field3639 != var35.field7022.field3639, (byte)-10);
                                    var25.field4034 = class730.field2866;
                                 }
                              }
                           }
                        }

                        var54 = class498.field8102;
                        int[] var56 = class498.field8108;

                        for(int var62 = 0; var62 < var54; ++var62) {
                           Player var65 = class730.loaded[var56[var62]];
                           if (var65 != null && class730.field2866 != var65.field4034 && var41 != var65) {
                              if (!var65.field4087) {
                                 if (var3 == 202437353) {
                                    return;
                                 }
                              } else {
                                 class32 var70 = var65.method1511().field7637;
                                 var28 = (int)var70.field5296 - (var65.method2550() - 1 << 8);
                                 int var29 = (int)var70.field5299 - (var65.method2550() - 1 << 8);
                                 if (var28 >= var21 && var65.method2550() <= var41.method2550() - (var28 - var21 >> 9) && var29 >= var22 && var65.method2550() <= var41.method2550() - (var29 - var22 >> 9)) {
                                    class149.method1159(var65, class923.local.field3639 != var35.field7022.field3639, 875975417);
                                    var65.field4034 = class730.field2866;
                                 }
                              }
                           }
                        }
                     }

                     if (class730.field2866 == var41.field4034) {
                        continue;
                     }

                     class149.method1159(var41, class923.local.field3639 != var35.field7022.field3639, -554283505);
                     var41.field4034 = class730.field2866;
                  }

                  int var61;
                  int var68;
                  if (var35.field7022 instanceof Npc) {
                     Npc var42 = (Npc)var35.field7022;
                     if (var42.field1637 != null) {
                        class32 var47 = var42.method1511().field7637;
                        if ((var42.field1637.field9923 & 1) == 0 && ((int)var47.field5296 & 511) == 0 && ((int)var47.field5299 & 511) == 0 || (var42.field1637.field9923 & 1) == 1 && ((int)var47.field5296 & 511) == 256 && ((int)var47.field5299 & 511) == 256) {
                           int var49 = (int)var47.field5296 - (var42.field1637.field9923 - 1 << 8);
                           var21 = (int)var47.field5299 - (var42.field1637.field9923 - 1 << 8);

                           for(var22 = 0; var22 < class730.field2684; ++var22) {
                              class437 var58 = (class437)class730.field2677.method2942((long)class730.field2680[var22]);
                              if (var58 != null) {
                                 Npc var59 = (Npc)var58.field7515;
                                 if (var59.field4034 != class730.field2866 && var59 != var42) {
                                    if (!var59.field4087) {
                                       if (var3 == 202437353) {
                                          throw new IllegalStateException();
                                       }
                                    } else {
                                       class32 var64 = var59.method1511().field7637;
                                       var68 = (int)var64.field5296 - (var59.field1637.field9923 - 1 << 8);
                                       var27 = (int)var64.field5299 - (var59.field1637.field9923 - 1 << 8);
                                       if (var68 >= var49 && var59.field1637.field9923 <= var42.field1637.field9923 - (var68 - var49 >> 9) && var27 >= var21 && var59.field1637.field9923 <= var42.field1637.field9923 - (var27 - var21 >> 9)) {
                                          class554.method424(var59, var35.field7022.field3639 != class923.local.field3639, (byte)-62);
                                          var59.field4034 = class730.field2866;
                                       }
                                    }
                                 }
                              }
                           }

                           var22 = class498.field8102;
                           int[] var60 = class498.field8108;

                           for(var61 = 0; var61 < var22; ++var61) {
                              Player var66 = class730.loaded[var60[var61]];
                              if (var66 != null && var66.field4034 != class730.field2866) {
                                 if (!var66.field4087) {
                                    if (var3 == 202437353) {
                                       return;
                                    }
                                 } else {
                                    var26 = var66.method1511().field7637;
                                    var27 = (int)var26.field5296 - (var66.method2550() - 1 << 8);
                                    var28 = (int)var26.field5299 - (var66.method2550() - 1 << 8);
                                    if (var27 >= var49 && var66.method2550() <= var42.field1637.field9923 - (var27 - var49 >> 9) && var28 >= var21 && var66.method2550() <= var42.field1637.field9923 - (var28 - var21 >> 9)) {
                                       class149.method1159(var66, var35.field7022.field3639 != class923.local.field3639, 1713781703);
                                       var66.field4034 = class730.field2866;
                                    }
                                 }
                              }
                           }
                        }

                        if (var42.field4034 == class730.field2866) {
                           if (var3 == 202437353) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }

                        class554.method424(var42, class923.local.field3639 != var35.field7022.field3639, (byte)-73);
                        var42.field4034 = class730.field2866;
                     }
                  }

                  if (var35.field7022 instanceof class864) {
                     int var44 = var4.field1521 + var38;
                     var45 = var4.field1522 + var39;
                     class508 var51 = (class508)class730.field2666.method2942((long)(var35.field7022.field3639 << 28 | var45 << 14 | var44));
                     if (var51 != null) {
                        var21 = 0;

                        for(class31 var55 = (class31)var51.field3966.method904(-1921101370); var55 != null; ++var21) {
                           ItemDefinition var63 = class85.field1121.method1566(var55.field5319);
                           if (var63.field4289) {
                              var61 = var63.field4281;
                           } else if (var63.field4248) {
                              var61 = class422.field9604.field2967;
                           } else {
                              var61 = class422.field9604.field2974;
                           }

                           if (class730.field2817 && var35.field7022.field3639 == class923.local.field3639) {
                              class785 var67 = class354.field2139 != -1 ? class452.field7216.method5148(class354.field2139, 1640464070) : null;
                              if ((class568.field645 & 1) != 0 && (var67 == null || var63.method2683(class354.field2139, var67.field3822, -2028636758) != var67.field3822)) {
                                 class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + class56.method1545(var61, -1803338083) + var63.name, class175.field5075, 17, -1, (long)var55.field5319, var38, var39, true, false, (long)var21, false, -1282887596);
                              }
                           }

                           if (var35.field7022.field3639 == class923.local.field3639) {
                              String[] var69 = var63.field4240;

                              for(var68 = var69.length - 1; var68 >= 0; --var68) {
                                 if (var69[var68] != null) {
                                    short var71 = 0;
                                    var28 = class730.field2671;
                                    if (var68 == 0) {
                                       var71 = 18;
                                    }

                                    if (var68 == 1) {
                                       var71 = 19;
                                    }

                                    if (var68 == 2) {
                                       var71 = 20;
                                    }

                                    if (3 == var68) {
                                       var71 = 21;
                                    }

                                    if (var68 == 4) {
                                       var71 = 22;
                                    }

                                    if (var68 == 5) {
                                       var71 = 1004;
                                    }

                                    if (var68 == var63.field4246) {
                                       var28 = var63.field4242;
                                    }

                                    if (var63.field4247 == var68) {
                                       var28 = var63.field4220;
                                    }

                                    class984.method1875(var69[var68], class56.method1545(var61, -1300852022) + var63.name, var28, var71, -1, (long)var55.field5319, var38, var39, true, false, (long)var21, false, -1707817875);
                                 }
                              }
                           }

                           var55 = (class31)var51.field3966.method909(293661745);
                        }
                     }
                  }

                  if (var35.field7022 instanceof class265) {
                     class265 var46 = (class265)var35.field7022;
                     ObjectDefinition var50 = class730.field2697.method5283(-151154213).method4713(var46.method4551((byte)32));
                     if (var50.field2198 != null) {
                        var50 = var50.method1487(class827.field9037, 2026923830);
                     }

                     if (var50 == null) {
                        if (var3 == 202437353) {
                           return;
                        }
                     } else {
                        if (class730.field2817 && var35.field7022.field3639 == class923.local.field3639) {
                           class785 var52 = class354.field2139 != -1 ? class452.field7216.method5148(class354.field2139, -616098570) : null;
                           if ((class568.field645 & 4) != 0 && (var52 == null || var50.method1486(class354.field2139, var52.field3822, (byte)2) != var52.field3822)) {
                              class984.method1875(class730.field2820, class730.field2735 + " " + class822.field9048 + " " + class56.method1545(65535, -1704073338) + var50.name, class175.field5075, 2, -1, class131.method893(var46, var38, var39, 2139321433), var38, var39, true, false, (long)var46.hashCode(), false, -978621849);
                           }
                        }

                        if (var35.field7022.field3639 == class923.local.field3639) {
                           String[] var53 = var50.field2226;
                           if (var53 != null) {
                              for(var21 = var53.length - 1; var21 >= 0; --var21) {
                                 if (var53[var21] != null) {
                                    short var57 = 0;
                                    var54 = class730.field2671;
                                    if (var21 == 0) {
                                       var57 = 3;
                                    }

                                    if (1 == var21) {
                                       var57 = 4;
                                    }

                                    if (var21 == 2) {
                                       var57 = 5;
                                    }

                                    if (var21 == 3) {
                                       var57 = 6;
                                    }

                                    if (var21 == 4) {
                                       var57 = 1001;
                                    }

                                    if (var21 == 5) {
                                       var57 = 1002;
                                    }

                                    if (var21 == var50.field2229) {
                                       var54 = var50.field2268;
                                    }

                                    if (var21 == var50.field2230) {
                                       var54 = var50.field2196;
                                    }

                                    class984.method1875(var53[var21], class56.method1545(65535, -1882925758) + var50.name, var54, var57, -1, class131.method893(var46, var38, var39, 2141756436), var38, var39, true, false, (long)var46.hashCode(), false, -1317659949);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } while(var3 != 202437353);
         }

      } catch (RuntimeException var30) {
         throw class158.method3445(var30, "dz.e(" + ')');
      }
   }

   static final void method993(class744 var0, int var1) {
      try {
         var0.field3156 -= 4;
         int var2 = var0.field3161[var0.field3156];
         boolean var3 = 1 == var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[var0.field3156 + 2];
         boolean var5 = var0.field3161[3 + var0.field3156] == 1;
         class130.method927(var2, var3, var4, var5, 1687031105);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "dz.alr(" + ')');
      }
   }

   static int method994(int var0, int var1, int var2) {
      try {
         int var3 = var0 >> 31 & var1 - 1;
         return var3 + (var0 + (var0 >>> 31)) % var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dz.r(" + ')');
      }
   }

   static void method995(int var0, String var1, byte var2) {
      try {
         class682 var3 = class370.method881(3, (long)var0);
         var3.method4340((byte)104);
         var3.field7688 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dz.ah(" + ')');
      }
   }
}
