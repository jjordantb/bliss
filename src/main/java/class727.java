import java.util.Random;

public abstract class class727 {
   static int field2482 = 0;
   class848 field2483;
   static int field2484 = 0;
   public static int field2485 = 0;
   static int field2486 = -1;
   public static int field2487 = 0;
   static int field2488 = 0;
   class230 field2489;
   static int field2490 = 0;
   static int field2491 = 0;
   static int field2492 = 0;
   static int field2493 = -1;
   static String[] field2494 = new String[100];

   public void method1662(String var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            this.method1672(var1, var2 - this.field2489.method4605(var1, -1778440333), var3, (class48[])null, (int[])null, (class23)null, 0, 0, 1766719318);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "l.f(" + ')');
      }
   }

   public int method1663(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class48[] var11, int[] var12, class23 var13, int var14, int var15, int var16) {
      try {
         return this.method1664(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 0, var11, var12, var13, var14, var15, -1416794725);
      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "l.p(" + ')');
      }
   }

   public int method1664(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class48[] var12, int[] var13, class23 var14, int var15, int var16, int var17) {
      try {
         if (var1 == null) {
            return 0;
         } else {
            this.method1669(var6, var7, (byte)14);
            if (var10 == 0) {
               var10 = this.field2489.field8228;
            }

            int[] var18;
            if (var5 < var10 + this.field2489.field8230 + this.field2489.field8225 && var5 < var10 + var10) {
               var18 = null;
            } else {
               var18 = new int[]{var4};
            }

            int var19 = this.field2489.method4598(var1, var18, field2494, var12, (byte)12);
            if (-1 == var11) {
               var11 = var5 / var10;
               if (var11 <= 0) {
                  var11 = 1;
               }
            }

            if (var11 > 0 && var19 >= var11) {
               field2494[var11 - 1] = this.field2489.method4597(field2494[var11 - 1], var4, var12, (byte)-89);
               var19 = var11;
            }

            if (3 == var9 && 1 == var19) {
               var9 = 1;
            }

            int var20;
            int var21;
            if (var9 == 0) {
               var20 = var3 + this.field2489.field8230;
            } else if (1 == var9) {
               var20 = (var5 - this.field2489.field8230 - this.field2489.field8225 - var10 * (var19 - 1)) / 2 + this.field2489.field8230 + var3;
            } else if (var9 == 2) {
               var20 = var5 + var3 - this.field2489.field8225 - var10 * (var19 - 1);
            } else {
               var21 = (var5 - this.field2489.field8230 - this.field2489.field8225 - (var19 - 1) * var10) / (var19 + 1);
               if (var21 < 0) {
                  var21 = 0;
               }

               var20 = var21 + var3 + this.field2489.field8230;
               var10 += var21;
            }

            for(var21 = 0; var21 < var19; ++var21) {
               if (var8 == 0) {
                  this.method1672(field2494[var21], var2, var20, var12, var13, var14, var15, var16, 1522801503);
               } else if (var8 == 1) {
                  this.method1672(field2494[var21], var2 + (var4 - this.field2489.method4605(field2494[var21], 1710279265)) / 2, var20, var12, var13, var14, var15, var16, 1985167681);
               } else if (2 == var8) {
                  this.method1672(field2494[var21], var2 + var4 - this.field2489.method4605(field2494[var21], -760283198), var20, var12, var13, var14, var15, var16, 1845200281);
               } else if (var19 - 1 == var21) {
                  this.method1672(field2494[var21], var2, var20, var12, var13, var14, var15, var16, 2147018921);
               } else {
                  this.method1671(field2494[var21], var4, (byte)-88);
                  this.method1672(field2494[var21], var2, var20, var12, var13, var14, var15, var16, 1805619681);
                  field2492 = 0;
               }

               var20 += var10;
            }

            return var19;
         }
      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "l.i(" + ')');
      }
   }

   public void method1665(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            int var8 = var1.length();
            int[] var9 = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var9[var10] = (int)(Math.sin((double)var6 / 5.0D + (double)var10 / 2.0D) * 5.0D);
            }

            this.method1677(var1, var2 - this.field2489.method4605(var1, 840724490) / 2, var3, (class48[])null, (int[])null, (int[])null, var9, 873938952);
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "l.k(" + ')');
      }
   }

   public void method1666(String var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            int var8 = var1.length();
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];

            for(int var11 = 0; var11 < var8; ++var11) {
               var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
               var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
            }

            this.method1677(var1, var2 - this.field2489.method4605(var1, -748991968) / 2, var3, (class48[])null, (int[])null, var9, var10, 1570757467);
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "l.d(" + ')');
      }
   }

   public void method1667(String var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            double var9 = 7.0D - (double)var7 / 8.0D;
            if (var9 < 0.0D) {
               var9 = 0.0D;
            }

            int var11 = var1.length();
            int[] var12 = new int[var11];

            for(int var13 = 0; var13 < var11; ++var13) {
               var12[var13] = (int)(Math.sin((double)var6 / 1.0D + (double)var13 / 1.5D) * var9);
            }

            this.method1677(var1, var2 - this.field2489.method4605(var1, -795569792) / 2, var3, (class48[])null, (int[])null, (int[])null, var12, 1802136078);
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "l.u(" + ')');
      }
   }

   public int method1668(String var1, int var2, int var3, int var4, int var5, Random var6, int var7, class48[] var8, int[] var9, int var10) {
      try {
         if (var1 == null) {
            return 0;
         } else {
            var6.setSeed((long)var7);
            int var11 = 192 + (var6.nextInt() & 31);
            this.method1669(var11 << 24 | var4 & 16777215, var11 << 24 | var5 & 16777215, (byte)14);
            int var12 = var1.length();
            int[] var13 = new int[var12];
            int var14 = 0;

            for(int var15 = 0; var15 < var12; ++var15) {
               var13[var15] = var14;
               if ((var6.nextInt() & 3) == 0) {
                  ++var14;
               }
            }

            this.method1677(var1, var2, var3, var8, var9, var13, (int[])null, 1335811057);
            return var14;
         }
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "l.x(" + ')');
      }
   }

   void method1669(int var1, int var2, byte var3) {
      try {
         field2486 = -1;
         field2493 = -1;
         field2482 = var1;
         field2484 = var1;
         field2492 = 0;
         field2488 = 0;
         if (var2 == -1) {
            var2 = 0;
         }

         field2490 = var2;
         field2491 = var2;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "l.q(" + ')');
      }
   }

   void method1670(String var1, short var2) {
      try {
         try {
            if (var1.startsWith("col=")) {
               field2484 = field2484 & -16777216 | class745.method2597(var1.substring(4), 16, (byte)-57) & 16777215;
            } else if (var1.equals("/col")) {
               field2484 = field2484 & -16777216 | field2482 & 16777215;
            }

            if (var1.startsWith("argb=")) {
               field2484 = class745.method2597(var1.substring(5), 16, (byte)61);
            } else if (var1.equals("/argb")) {
               field2484 = field2482;
            } else if (var1.startsWith("str=")) {
               field2486 = field2484 & -16777216 | class745.method2597(var1.substring(4), 16, (byte)-24);
            } else if (var1.equals("str")) {
               field2486 = field2484 & -16777216 | 8388608;
            } else if (var1.equals("/str")) {
               field2486 = -1;
            } else if (var1.startsWith("u=")) {
               field2493 = field2484 & -16777216 | class745.method2597(var1.substring(2), 16, (byte)-57);
            } else if (var1.equals("u")) {
               field2493 = field2484 & -16777216;
            } else if (var1.equals("/u")) {
               field2493 = -1;
            } else if (var1.equalsIgnoreCase("shad=-1")) {
               field2491 = 0;
            } else if (var1.startsWith("shad=")) {
               field2491 = field2484 & -16777216 | class745.method2597(var1.substring(5), 16, (byte)67);
            } else if (var1.equals("shad")) {
               field2491 = field2484 & -16777216;
            } else if (var1.equals("/shad")) {
               field2491 = field2490;
            } else if (var1.equals("br")) {
               this.method1669(field2482, field2490, (byte)14);
            }
         } catch (Exception var4) {
            ;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "l.s(" + ')');
      }
   }

   void method1671(String var1, int var2, byte var3) {
      try {
         int var4 = 0;
         boolean var5 = false;

         for(int var6 = 0; var6 < var1.length(); ++var6) {
            char var7 = var1.charAt(var6);
            if (var7 == '<') {
               var5 = true;
            } else if ('>' == var7) {
               var5 = false;
            } else if (!var5 && var7 == ' ') {
               ++var4;
            }
         }

         if (var4 > 0) {
            field2492 = (var2 - this.field2489.method4605(var1, 1926010004) << 8) / var4;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "l.y(" + ')');
      }
   }

   void method1672(String var1, int var2, int var3, class48[] var4, int[] var5, class23 var6, int var7, int var8, int var9) {
      try {
         var3 -= this.field2489.field8228;
         int var10 = -1;
         int var11 = -1;
         int var12 = var1.length();

         for(int var13 = 0; var13 < var12; ++var13) {
            char var14 = (char)(class84.method940(var1.charAt(var13), 1088430238) & 255);
            if ('<' == var14) {
               var10 = var13;
            } else {
               if (var14 == '>' && -1 != var10) {
                  String var15 = var1.substring(1 + var10, var13);
                  var10 = -1;
                  if (var15.equals("lt")) {
                     var14 = '<';
                  } else if (var15.equals("gt")) {
                     var14 = '>';
                  } else if (var15.equals("nbsp")) {
                     var14 = ' ';
                  } else if (var15.equals("shy")) {
                     var14 = '\u00ad';
                  } else if (var15.equals("times")) {
                     var14 = '×';
                  } else if (var15.equals("euro")) {
                     var14 = '€';
                  } else if (var15.equals("copy")) {
                     var14 = '©';
                  } else {
                     if (!var15.equals("reg")) {
                        if (var15.startsWith("img=")) {
                           try {
                              int var16 = class82.method917(var15.substring(4), (short)-9602);
                              class48 var17 = var4[var16];
                              int var18 = var5 != null ? var5[var16] : var17.method3109();
                              if ((field2484 & -16777216) == -16777216) {
                                 var17.method3114(var2, var3 + this.field2489.field8228 - var18, 1, 0, 1);
                              } else {
                                 var17.method3114(var2, this.field2489.field8228 + var3 - var18, 0, field2484 & -16777216 | 16777215, 1);
                              }

                              var2 += var4[var16].method5594();
                              var11 = -1;
                           } catch (Exception var19) {
                              ;
                           }
                        } else {
                           this.method1670(var15, (short)2307);
                        }
                        continue;
                     }

                     var14 = '®';
                  }
               }

               if (var10 == -1) {
                  if (var11 != -1) {
                     var2 += this.field2489.method4594(var11, var14, -1391207992);
                  }

                  if (' ' != var14) {
                     if (var6 == null) {
                        if ((field2491 & -16777216) != 0) {
                           this.method1680(var14, var2 + 1, var3 + 1, field2491, true);
                        }

                        this.method1680(var14, var2, var3, field2484, false);
                     } else {
                        if ((field2491 & -16777216) != 0) {
                           this.method1674(var14, 1 + var2, var3 + 1, field2491, true, var6, var7, var8);
                        }

                        this.method1674(var14, var2, var3, field2484, false, var6, var7, var8);
                     }
                  } else if (field2492 > 0) {
                     field2488 += field2492;
                     var2 += field2488 >> 8;
                     field2488 &= 255;
                  }

                  int var21 = this.field2489.method4596(var14, 2062861193);
                  if (field2486 != -1) {
                     this.field2483.method4798(var2, var3 + (int)((double)this.field2489.field8228 * 0.7D), var21, field2486, -1768183212);
                  }

                  if (field2493 != -1) {
                     this.field2483.method4798(var2, this.field2489.field8228 + var3 + 1, var21, field2493, -1909269175);
                  }

                  var2 += var21;
                  var11 = var14;
               }
            }
         }

      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "l.t(" + ')');
      }
   }

   public int method1673(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Random var10, int var11, int[] var12, class48[] var13, int[] var14, int var15) {
      try {
         if (var1 == null) {
            return 0;
         } else {
            var10.setSeed((long)var11);
            int var16 = 192 + (var10.nextInt() & 31);
            this.method1669(var16 << 24 | var6 & 16777215, var7 == -1 ? 0 : var16 << 24 | var7 & 16777215, (byte)14);
            int var17 = var1.length();
            int[] var18 = new int[var17];
            int var19 = 0;

            int var20;
            for(var20 = 0; var20 < var17; ++var20) {
               var18[var20] = var19;
               if ((var10.nextInt() & 3) == 0) {
                  ++var19;
               }
            }

            var20 = var2;
            int var21 = this.field2489.field8230 + var3;
            int var22 = -1;
            if (1 == var9) {
               var21 += (var5 - this.field2489.field8230 - this.field2489.field8225) / 2;
            } else if (2 == var9) {
               var21 = var5 + var3 - this.field2489.field8225;
            }

            if (1 == var8) {
               var22 = this.field2489.method4605(var1, 428489518) + var19;
               var20 = var2 + (var4 - var22) / 2;
            } else if (var8 == 2) {
               var22 = this.field2489.method4605(var1, 366396585) + var19;
               var20 = var2 + (var4 - var22);
            }

            this.method1677(var1, var20, var21, var13, var14, var18, (int[])null, 2007858452);
            if (var12 != null) {
               if (-1 == var22) {
                  var22 = this.field2489.method4605(var1, -1885906966) + var19;
               }

               var12[0] = var20;
               var12[1] = var21 - this.field2489.field8230;
               var12[2] = var22;
               var12[3] = this.field2489.field8225 + this.field2489.field8230;
            }

            return var19;
         }
      } catch (RuntimeException var23) {
         throw class158.method3445(var23, "l.r(" + ')');
      }
   }

   abstract void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8);

   class727(class848 var1, class230 var2) {
      this.field2483 = var1;
      this.field2489 = var2;
   }

   void method1677(String var1, int var2, int var3, class48[] var4, int[] var5, int[] var6, int[] var7, int var8) {
      try {
         var3 -= this.field2489.field8228;
         int var9 = -1;
         int var10 = -1;
         int var11 = 0;
         int var12 = var1.length();

         for(int var13 = 0; var13 < var12; ++var13) {
            char var14 = (char)(class84.method940(var1.charAt(var13), 1088430238) & 255);
            if (var14 == '<') {
               var9 = var13;
            } else {
               int var16;
               int var17;
               if (var14 == '>' && -1 != var9) {
                  String var15 = var1.substring(1 + var9, var13);
                  var9 = -1;
                  if (var15.equals("lt")) {
                     var14 = '<';
                  } else if (var15.equals("gt")) {
                     var14 = '>';
                  } else if (var15.equals("nbsp")) {
                     var14 = ' ';
                  } else if (var15.equals("shy")) {
                     var14 = '\u00ad';
                  } else if (var15.equals("times")) {
                     var14 = '×';
                  } else if (var15.equals("euro")) {
                     var14 = '€';
                  } else if (var15.equals("copy")) {
                     var14 = '©';
                  } else {
                     if (!var15.equals("reg")) {
                        if (var15.startsWith("img=")) {
                           try {
                              if (var6 != null) {
                                 var16 = var6[var11];
                              } else {
                                 var16 = 0;
                              }

                              if (var7 != null) {
                                 var17 = var7[var11];
                              } else {
                                 var17 = 0;
                              }

                              ++var11;
                              int var18 = class82.method917(var15.substring(4), (short)7054);
                              class48 var19 = var4[var18];
                              int var20 = var5 != null ? var5[var18] : var19.method3109();
                              var19.method3114(var2 + var16, var3 + this.field2489.field8228 - var20 + var17, 1, 0, 1);
                              var2 += var4[var18].method5594();
                              var10 = -1;
                           } catch (Exception var21) {
                              ;
                           }
                        } else {
                           this.method1670(var15, (short)14447);
                        }
                        continue;
                     }

                     var14 = '®';
                  }
               }

               if (var9 == -1) {
                  if (-1 != var10) {
                     var2 += this.field2489.method4594(var10, var14, -1391207992);
                  }

                  int var23;
                  if (var6 != null) {
                     var23 = var6[var11];
                  } else {
                     var23 = 0;
                  }

                  if (var7 != null) {
                     var16 = var7[var11];
                  } else {
                     var16 = 0;
                  }

                  ++var11;
                  if (var14 != ' ') {
                     if ((field2491 & -16777216) != 0) {
                        this.method1680(var14, 1 + var2 + var23, var16 + var3 + 1, field2491, true);
                     }

                     this.method1680(var14, var23 + var2, var3 + var16, field2484, false);
                  } else if (field2492 > 0) {
                     field2488 += field2492;
                     var2 += field2488 >> 8;
                     field2488 &= 255;
                  }

                  var17 = this.field2489.method4596(var14, 901349390);
                  if (-1 != field2486) {
                     this.field2483.method4798(var2, (int)(0.7D * (double)this.field2489.field8228) + var3, var17, field2486, -1291304845);
                  }

                  if (field2493 != -1) {
                     this.field2483.method4798(var2, var3 + this.field2489.field8228, var17, field2493, -1265660857);
                  }

                  var2 += var17;
                  var10 = var14;
               }
            }
         }

      } catch (RuntimeException var22) {
         throw class158.method3445(var22, "l.h(" + ')');
      }
   }

   public void method1678(String var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            this.method1672(var1, var2, var3, (class48[])null, (int[])null, (class23)null, 0, 0, 2057160412);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "l.a(" + ')');
      }
   }

   abstract void method1680(char var1, int var2, int var3, int var4, boolean var5);

   public void method1681(String var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1 != null) {
            this.method1669(var4, var5, (byte)14);
            this.method1672(var1, var2 - this.field2489.method4605(var1, 1243151471) / 2, var3, (class48[])null, (int[])null, (class23)null, 0, 0, 2121400127);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "l.b(" + ')');
      }
   }

   public static void method1682(String var0, String var1, int var2) {
      try {
         if (var0.length() <= 320 && class878.method5922((byte)115)) {
            class730.field2674.method4374((byte)4);
            class933.method6288(2087182163);
            class881.field10170 = var0;
            class881.field10171 = var1;
            class967.method1750(4, 1512716323);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "l.r(" + ')');
      }
   }

   public static void method1683(int var0, String var1, byte var2) {
      try {
         class702.method1969(var0, 0, "", "", "", var1, -781451735);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "l.b(" + ')');
      }
   }

   static final void method1684(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         class237 var4;
         if (var0.field3178) {
            var4 = var0.field3164;
         } else {
            var4 = var0.field3163;
         }

         var0.field3161[++var0.field3156 - 1] = var4.method4648(var0.field3159.field4095, var2, var3, 867608709) ? 1 : 0;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "l.aop(" + ')');
      }
   }

   static final void method1685(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = var0.field3154.field1165[var2].field1499;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "l.ym(" + ')');
      }
   }

   static final void method1686(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class75.method1118(var3, var4, false, 2, var0, 2093890134);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "l.hu(" + ')');
      }
   }

   static void method1687(int var0, int var1) {
      try {
         class1 var2 = class759.field4330;
         synchronized(class759.field4330) {
            class759.field4330.method2976(var0, -1573689525);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "l.p(" + ')');
      }
   }

   static void method1688(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         int var8 = var2 + var6;
         int var9 = var3 - var6;

         int var10;
         for(var10 = var2; var10 < var8; ++var10) {
            class484.method4769(class381.field1412[var10], var0, var1, var5, 1917920916);
         }

         for(var10 = var3; var10 > var9; --var10) {
            class484.method4769(class381.field1412[var10], var0, var1, var5, 1834727218);
         }

         var10 = var6 + var0;
         int var11 = var1 - var6;

         for(int var12 = var8; var12 <= var9; ++var12) {
            int[] var13 = class381.field1412[var12];
            class484.method4769(var13, var0, var10, var5, 1202396469);
            class484.method4769(var13, var10, var11, var4, -1756468313);
            class484.method4769(var13, var11, var1, var5, 1301704447);
         }

      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "l.n(" + ')');
      }
   }

   static final void method1689(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         class629.method5808(var3, var4, var0, -884844467);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "l.je(" + ')');
      }
   }
}
