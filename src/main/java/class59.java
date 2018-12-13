public class class59 {
   public static int field2380 = 4;
   public static int field2381 = 3;
   public static int field2382 = 2;
   public static int field2383 = 1;
   public static int field2384 = 5;

   class59() throws Throwable {
      throw new Error();
   }

   static final void method1615(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class374.method1005(var3, var4, var0, -762908635);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jq.ma(" + ')');
      }
   }

   static final void method1616(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         StringBuilder var3 = new StringBuilder(var2.length());
         boolean var4 = false;

         for(int var5 = 0; var5 < var2.length(); ++var5) {
            char var6 = var2.charAt(var5);
            if (var6 == '<') {
               var4 = true;
            } else if (var6 == '>') {
               var4 = false;
            } else if (!var4) {
               var3.append(var6);
            }
         }

         var0.field3157[++var0.field3158 - 1] = var3.toString();
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "jq.aaf(" + ')');
      }
   }

   public static void method1617(int var0) {
      try {
         class949.field3321.method2941((byte)-54);
         class949.field3327.method905((byte)1);
         class949.field3333 = null;
         class949.field3322 = null;
         class949.field3326 = null;
         class949.field3323 = null;
         class949.field3325 = null;
         class949.field3331 = 1;
         class949.field3328 = 0;
         class949.field3329 = 0;
         class122.field2373 = null;
         class949.field3332 = -1;
         if (class949.field3330) {
            class730.field2916 = class949.field3320;
            class730.field2917 = class673.field7509;
            class730.field2821 = class808.field4596;
            class730.field2724 = class559.field542;
            class949.field3330 = false;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "jq.b(" + ')');
      }
   }

   static final void method1618(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)116);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class352.method1403(var3, var4, var0, 845844637);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jq.gk(" + ')');
      }
   }

   public static void method1619(Animation var0, int var1, int var2) {
      try {
         if (class540.field3926 < 50 && var0 != null && var0.field6671 != null && var1 < var0.field6671.length && var0.field6671[var1] != null) {
            int var3 = var0.field6671[var1][0];
            int var4 = var3 >> 8;
            int var5 = var3 >> 5 & 7;
            int var6;
            if (var0.field6671[var1].length > 1) {
               var6 = (int)(Math.random() * (double)var0.field6671[var1].length);
               if (var6 > 0) {
                  var4 = var0.field6671[var1][var6];
               }
            }

            var6 = 256;
            if (var0.field6667 != null && var0.field6674 != null) {
               var6 = Animation.method3569(var0.field6667[var1], var0.field6674[var1], 1444813491);
            }

            if (var0.field6657) {
               class671.method4237(var4, var5, 0, 255, false, var6, 1704835145);
            } else {
               class587.method167(var4, var5, 0, 255, var6, 1695425572);
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "jq.q(" + ')');
      }
   }

   static final boolean method1620(int var0, int var1, class312 var2, class262 var3, int var4) {
      try {
         int var5 = var0;
         int var6 = var1;
         byte var7 = 64;
         byte var8 = 64;
         int var9 = var0 - var7;
         int var10 = var1 - var8;
         class56.field2314[var7][var8] = 99;
         class56.field2318[var7][var8] = 0;
         byte var11 = 0;
         int var12 = 0;
         class56.field2315[var11] = var0;
         byte var10001 = var11;
         int var20 = var11 + 1;
         class56.field2312[var10001] = var1;
         int[][] var13 = var3.field8183;

         while(var12 != var20) {
            var5 = class56.field2315[var12];
            var6 = class56.field2312[var12];
            var12 = var12 + 1 & 4095;
            int var18 = var5 - var9;
            int var19 = var6 - var10;
            int var14 = var5 - var3.field8179;
            int var15 = var6 - var3.field8180;
            if (var2.method415(2, var5, var6, var3, -16711936)) {
               class56.field2316 = var5;
               class78.field1500 = var6;
               return true;
            }

            int var16 = class56.field2318[var18][var19] + 1;
            if (var18 > 0 && class56.field2314[var18 - 1][var19] == 0) {
               if ((var13[var14 - 1][var15] & 1134821376) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 - 1][1 + var15] & 1310982144) == 0) {
                  class56.field2315[var20] = var5 - 1;
                  class56.field2312[var20] = var6;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[var18 - 1][var19] = 2;
                  class56.field2318[var18 - 1][var19] = var16;
               }
            }

            if (var18 < 126) {
               if (class56.field2314[1 + var18][var19] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 + 2][var15] & 1625554944) == 0 && (var13[2 + var14][1 + var15] & 2015625216) == 0) {
                  class56.field2315[var20] = var5 + 1;
                  class56.field2312[var20] = var6;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[1 + var18][var19] = 8;
                  class56.field2318[var18 + 1][var19] = var16;
               }
            }

            if (var19 > 0) {
               if (class56.field2314[var18][var19 - 1] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14][var15 - 1] & 1134821376) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 + 1][var15 - 1] & 1625554944) == 0) {
                  class56.field2315[var20] = var5;
                  class56.field2312[var20] = var6 - 1;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[var18][var19 - 1] = 1;
                  class56.field2318[var18][var19 - 1] = var16;
               }
            }

            if (var19 < 126) {
               if (class56.field2314[var18][1 + var19] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14][2 + var15] & 1310982144) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 + 1][var15 + 2] & 2015625216) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else {
                  class56.field2315[var20] = var5;
                  class56.field2312[var20] = 1 + var6;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[var18][var19 + 1] = 4;
                  class56.field2318[var18][1 + var19] = var16;
               }
            }

            if (var18 > 0 && var19 > 0) {
               if (class56.field2314[var18 - 1][var19 - 1] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 - 1][var15] & 1336147968) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 - 1][var15 - 1] & 1134821376) == 0 && (var13[var14][var15 - 1] & 1675886592) == 0) {
                  class56.field2315[var20] = var5 - 1;
                  class56.field2312[var20] = var6 - 1;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[var18 - 1][var19 - 1] = 3;
                  class56.field2318[var18 - 1][var19 - 1] = var16;
               }
            }

            if (var18 < 126 && var19 > 0) {
               if (class56.field2314[1 + var18][var19 - 1] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 + 1][var15 - 1] & 1675886592) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 + 2][var15 - 1] & 1625554944) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[2 + var14][var15] & 2028208128) != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else {
                  class56.field2315[var20] = var5 + 1;
                  class56.field2312[var20] = var6 - 1;
                  var20 = var20 + 1 & 4095;
                  class56.field2314[var18 + 1][var19 - 1] = 9;
                  class56.field2318[1 + var18][var19 - 1] = var16;
               }
            }

            if (var18 > 0 && var19 < 126) {
               if (class56.field2314[var18 - 1][1 + var19] != 0) {
                  if (var4 != -1327541421) {
                     throw new IllegalStateException();
                  }
               } else if ((var13[var14 - 1][1 + var15] & 1336147968) == 0) {
                  if ((var13[var14 - 1][2 + var15] & 1310982144) != 0) {
                     if (var4 != -1327541421) {
                        throw new IllegalStateException();
                     }
                  } else if ((var13[var14][2 + var15] & 2116288512) == 0) {
                     class56.field2315[var20] = var5 - 1;
                     class56.field2312[var20] = var6 + 1;
                     var20 = var20 + 1 & 4095;
                     class56.field2314[var18 - 1][var19 + 1] = 6;
                     class56.field2318[var18 - 1][1 + var19] = var16;
                  }
               }
            }

            if (var18 < 126 && var19 < 126 && class56.field2314[var18 + 1][1 + var19] == 0 && (var13[1 + var14][2 + var15] & 2116288512) == 0 && (var13[2 + var14][2 + var15] & 2015625216) == 0 && (var13[var14 + 2][1 + var15] & 2028208128) == 0) {
               class56.field2315[var20] = var5 + 1;
               class56.field2312[var20] = 1 + var6;
               var20 = var20 + 1 & 4095;
               class56.field2314[var18 + 1][1 + var19] = 12;
               class56.field2318[1 + var18][1 + var19] = var16;
            }
         }

         class56.field2316 = var5;
         class78.field1500 = var6;
         return false;
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "jq.b(" + ')');
      }
   }

   static int method1621(String var0, byte[] var1, int var2, byte var3) {
      try {
         int var4 = var2;
         int var5 = var0.length();

         for(int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class78.method1123(var0.charAt(var6), -40024446);
            int var8 = var6 + 1 < var5 ? class78.method1123(var0.charAt(1 + var6), 1761771208) : -1;
            int var9 = 2 + var6 < var5 ? class78.method1123(var0.charAt(2 + var6), 623747518) : -1;
            int var10 = var6 + 3 < var5 ? class78.method1123(var0.charAt(var6 + 3), 1229588136) : -1;
            var1[var2++] = (byte)(var7 << 2 | var8 >>> 4);
            if (var9 == -1) {
               break;
            }

            var1[var2++] = (byte)((var8 & 15) << 4 | var9 >>> 2);
            if (-1 == var10) {
               break;
            }

            var1[var2++] = (byte)((var9 & 3) << 6 | var10);
         }

         return var2 - var4;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "jq.f(" + ')');
      }
   }
}
