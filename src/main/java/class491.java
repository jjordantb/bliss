import java.util.ArrayList;
import java.util.Iterator;

public class class491 {
   public static class327 field7793;
   static class428 field7794;
   protected static class240 field7795;
   protected static int field7796;
   static byte[] field7797;
   protected static class415 field7798;
   static byte[] field7799;
   protected static class945 field7800;
   static class6 field7801 = new class6(16);
   protected static int field7802 = (int)(Math.random() * 11.0D) - 5;
   protected static int field7803 = (int)(Math.random() * 17.0D) - 8;
   protected static byte[][][] field7804;
   protected static int field7805;
   static int[] field7806 = new int[1];
   static byte[] field7807 = new byte[1];
   public static float field7808;
   public static float field7809;
   protected static class64 field7810;
   protected static class373 field7811 = new class373();
   static int[] field7812;
   public static int field7813;
   protected static int field7814;
   protected static int field7815;
   protected static int field7816;
   protected static int field7817;
   static byte[] field7818;
   static short[] field7819;
   public static int field7820;
   static byte[] field7821;
   static Object[] field7822;
   protected static class180 field7823;
   static ArrayList[][][] field7824;
   static byte[] field7825;
   protected static class844 field7826;
   protected static int field7827;
   static class509 field7828;
   protected static int field7829;
   protected static int field7830;
   protected static int field7831;
   protected static int field7832;

   static void method4396(class848 var0, int var1, int var2, int var3, int var4) {
      int var5 = field7827 - field7805;
      int var6 = field7816 - field7817;
      if (field7827 < field7814) {
         ++var5;
      }

      if (field7816 < field7815) {
         ++var6;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var19;
      for(var7 = 0; var7 < var5; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + field7796;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + field7796;
         var10 = var9 - var8;
         if (var10 > 0) {
            var11 = field7805 + var7;
            if (var11 >= 0 && var11 < field7814) {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = field7832 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = field7832 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if (var15 > 0) {
                     var16 = var12 + field7817;
                     int var17 = var11 + var16 * field7814;
                     int var18 = 0;
                     var19 = 0;
                     Object var20 = null;
                     if (var16 >= 0 && var16 < field7815) {
                        var18 = (field7818[var17] & 255) << 16 | field7819[var17] & '\uffff';
                        if (var18 != 0) {
                           var18 |= -16777216;
                        }

                        var19 = field7797[var17] & 255;
                        var20 = field7822[var17];
                     }

                     if (var18 == 0 && var19 == 0 && var20 == null) {
                        if (field7793.field12 != -1) {
                           var18 = -16777216 | field7793.field12;
                        } else if ((var7 + field7805 & 4) != (var12 + field7816 & 4)) {
                           var18 = -11840664;
                        } else {
                           var18 = field7812[field7828.field4020 + 1];
                        }

                        if (var18 == 0) {
                           var18 = -16777216;
                        }

                        var0.method4984(var8, var13, var10, var15, var18, 0);
                     } else if (var20 != null) {
                        if (var20 instanceof class349) {
                           class349 var21 = (class349)var20;
                           if (var21 != null) {
                              method4407(var0, var8, var13, var10, var15, var18, var19, field7821[var17], var21.field1565, var21.field1564, true);
                           }
                        } else {
                           Integer var28 = (Integer)var20;
                           field7806[0] = var28.intValue();
                           field7807[0] = field7825[var17];
                           method4407(var0, var8, var13, var10, var15, var18, var19, field7821[var17], field7806, field7807, true);
                        }
                     } else {
                        method4407(var0, var8, var13, var10, var15, var18, var19, field7821[var17], (int[])null, (byte[])null, true);
                     }
                  }
               }
            } else {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = field7832 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = field7832 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if (field7793.field12 != -1) {
                     var16 = -16777216 | field7793.field12;
                  } else if ((var7 + field7805 & 4) != (var12 + field7816 & 4)) {
                     var16 = -11840664;
                  } else {
                     var16 = field7812[field7828.field4020 + 1];
                  }

                  if (var16 == 0) {
                     var16 = -16777216;
                  }

                  var0.method4984(var8, var13, var10, var15, var16, 0);
               }
            }
         }
      }

      for(var7 = -16; var7 < var5 + 16; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + field7796;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + field7796;
         var10 = var9 - var8;
         if (var10 > 0) {
            var11 = var7 + field7805;
            if (var11 >= 0 && var11 < field7814) {
               for(var12 = -16; var12 < var6 + 16; ++var12) {
                  var13 = field7832 - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = field7832 - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if (var15 > 0) {
                     var16 = var12 + field7817;
                     if (var16 >= 0 && var16 < field7815) {
                        Object var26 = field7822[var11 + var16 * field7814];
                        if (var26 != null) {
                           if (var26 instanceof class349) {
                              class349 var29 = (class349)var26;
                              if (var29 != null) {
                                 method4408(var0, var8, var13, var10, var15, var29.field1565, var29.field1564);
                              }
                           } else {
                              Integer var31 = (Integer)var26;
                              field7806[0] = var31.intValue();
                              field7807[0] = field7825[var11 + var16 * field7814];
                              method4408(var0, var8, var13, var10, var15, field7806, field7807);
                           }
                        } else {
                           method4408(var0, var8, var13, var10, var15, (int[])null, (byte[])null);
                        }
                     }
                  }
               }
            }
         }
      }

      var7 = field7805 >> 6;
      var8 = field7817 >> 6;
      if (var7 < 0) {
         var7 = 0;
      }

      if (var8 < 0) {
         var8 = 0;
      }

      var9 = field7827 >> 6;
      var10 = field7816 >> 6;
      if (var9 >= field7824[0].length) {
         var9 = field7824[0].length - 1;
      }

      if (var10 >= field7824[0][0].length) {
         var10 = field7824[0][0].length - 1;
      }

      for(var11 = 0; var11 < 3; ++var11) {
         int var22;
         int var23;
         int var24;
         ArrayList var25;
         Iterator var27;
         int var30;
         int var32;
         class208 var33;
         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var25 = field7824[var11][var12][var13];
               if (var25 != null) {
                  var15 = (var12 + (field7820 >> 6)) * 64;
                  var16 = (var13 + (field7813 >> 6)) * 64;
                  var27 = var25.iterator();

                  while(var27.hasNext()) {
                     var33 = (class208)var27.next();
                     var19 = var15 + var33.field7115 - field7820 - field7805;
                     var30 = var16 + var33.field7116 - field7813 - field7817;
                     var32 = (var3 + var1 * var19 >> 16) + field7796;
                     var22 = (var3 + var1 * (var19 + 1) >> 16) + field7796;
                     var23 = field7832 - (var4 + var2 * (var30 + 1) >> 16);
                     var24 = field7832 - (var4 + var2 * var30 >> 16);
                     method4407(var0, var32, var23, var22 - var32, var24 - var23, var33.field7113, var33.field7114 & 255, var33.field7117, var33.field7111, var33.field7112, false);
                  }
               }
            }
         }

         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var25 = field7824[var11][var12][var13];
               if (var25 != null) {
                  var15 = (var12 + (field7820 >> 6)) * 64;
                  var16 = (var13 + (field7813 >> 6)) * 64;
                  var27 = var25.iterator();

                  while(var27.hasNext()) {
                     var33 = (class208)var27.next();
                     var19 = var15 + var33.field7115 - field7820 - field7805;
                     var30 = var16 + var33.field7116 - field7813 - field7817;
                     var32 = (var3 + var1 * var19 >> 16) + field7796;
                     var22 = (var3 + var1 * (var19 + 1) >> 16) + field7796;
                     var23 = field7832 - (var4 + var2 * (var30 + 1) >> 16);
                     var24 = field7832 - (var4 + var2 * var30 >> 16);
                     method4408(var0, var32, var23, var22 - var32, var24 - var23, var33.field7111, var33.field7112);
                  }
               }
            }
         }
      }

   }

   public static void method4397(class180 var0, class509 var1, class428 var2, class240 var3, class844 var4, class945 var5, class415 var6) {
      field7823 = var0;
      field7828 = var1;
      field7794 = var2;
      field7795 = var3;
      field7826 = var4;
      field7800 = var5;
      field7798 = var6;
      field7801.method2941((byte)-118);
      int var7 = field7823.method3281("details", -1750560538);
      int[] var8 = field7823.method3277(var7, -1923714721);
      if (var8 != null) {
         for(int var9 = 0; var9 < var8.length; ++var9) {
            class327 var10 = class756.method2716(field7823, var7, var8[var9], 1783056581);
            field7801.method2947(var10, (long)var10.field16);
         }
      }

      class771.method2300(true, false, -162450455);
   }

   static void method4398() {
      field7799 = null;
      field7818 = null;
      field7819 = null;
      field7797 = null;
      field7821 = null;
      field7822 = null;
      field7825 = null;
      field7824 = null;
      field7812 = null;
   }

   static void method4399(int var0) {
      field7793 = (class327)field7801.method2942((long)var0);
   }

   public static class514 method4400(int var0, int var1) {
      class514 var2 = new class514();

      for(class327 var3 = (class327)field7801.method2946(1759050770); var3 != null; var3 = (class327)field7801.method2945((byte)-2)) {
         if (var3.field21 && var3.method4(var0, var1, (byte)1)) {
            var2.method2704(var3, (byte)-123);
         }
      }

      return var2;
   }

   static int method4401(class478 var0, int var1, int var2, int var3) {
      class593 var4 = field7828.method2527(var1, -165601895);
      if (var4 == null) {
         return 0;
      } else {
         int var5 = var4.field1609;
         if (var5 >= 0 && var0.method4625(var5, 1570476781).field9378) {
            var5 = -1;
         }

         int var6;
         int var7;
         int var8;
         int var9;
         if (var4.field1611 >= 0) {
            var6 = var4.field1611;
            var7 = (var6 & 127) + var3;
            if (var7 < 0) {
               var7 = 0;
            } else if (var7 > 127) {
               var7 = 127;
            }

            var8 = (var6 + var2 & 'ﰀ') + (var6 & 896) + var7;
            var9 = -16777216 | class543.field3817[class526.method2228(class958.method2056(var8, 96, (byte)86), (byte)0) & '\uffff'];
         } else if (var5 >= 0) {
            var9 = -16777216 | class543.field3817[class526.method2228(class958.method2056(var0.method4625(var5, 201088475).field9386, 96, (byte)61), (byte)0) & '\uffff'];
         } else if (var4.field1608 == -1) {
            var9 = 0;
         } else {
            var6 = var4.field1608;
            var7 = (var6 & 127) + var3;
            if (var7 < 0) {
               var7 = 0;
            } else if (var7 > 127) {
               var7 = 127;
            }

            var8 = (var6 + var2 & 'ﰀ') + (var6 & 896) + var7;
            var9 = -16777216 | class543.field3817[class526.method2228(class958.method2056(var8, 96, (byte)22), (byte)0) & '\uffff'];
         }

         return var9;
      }
   }

   static void method4402(class848 var0, InputStream var1, int var2, int var3, int var4, int var5, int[] var6, int[] var7) {
      int var8 = var1.method6371();
      if ((var8 & 1) == 0) {
         boolean var9 = (var8 & 2) == 0;
         int var10 = var8 >> 2 & 63;
         if (var10 != 62) {
            if (var10 == 63) {
               var10 = var1.method6371();
            } else if (var9) {
               var10 = var6[var10];
            } else {
               var10 = var7[var10];
            }

            if (var9) {
               field7799[var4 + var5 * field7814] = (byte)var10;
               field7797[var4 + var5 * field7814] = 0;
            } else {
               field7797[var4 + var5 * field7814] = (byte)var10;
               field7821[var4 + var5 * field7814] = 0;
               field7799[var4 + var5 * field7814] = var1.method6372(-12558881);
            }
         }
      } else {
         int var20 = (var8 >> 1 & 3) + 1;
         boolean var21 = (var8 & 8) != 0;
         boolean var11 = (var8 & 16) != 0;

         for(int var12 = 0; var12 < var20; ++var12) {
            int var13 = var1.method6371();
            int var14 = 0;
            int var15 = 0;
            if (var21) {
               var14 = var1.method6371();
               var15 = var1.method6371();
            }

            int var16 = 0;
            if (var11) {
               var16 = var1.method6371();
            }

            int[] var17;
            byte[] var18;
            int var19;
            if (var12 == 0) {
               field7799[var4 + var5 * field7814] = (byte)var13;
               field7797[var4 + var5 * field7814] = (byte)var14;
               field7821[var4 + var5 * field7814] = (byte)var15;
               if (var16 == 1) {
                  field7822[var4 + var5 * field7814] = new Integer(var1.method6423(1235052657));
                  field7825[var4 + var5 * field7814] = var1.method6372(-12558881);
               } else if (var16 > 1) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.method6423(1235052657);
                     var18[var19] = var1.method6372(-12558881);
                  }

                  field7822[var4 + var5 * field7814] = new class349(var17, var18);
               }
            } else {
               var17 = null;
               var18 = null;
               if (var16 > 0) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = var1.method6423(1235052657);
                     var18[var19] = var1.method6372(-12558881);
                  }
               }

               if (field7824[var12 - 1][var2 - (field7820 >> 6)][var3 - (field7813 >> 6)] == null) {
                  field7824[var12 - 1][var2 - (field7820 >> 6)][var3 - (field7813 >> 6)] = new ArrayList();
               }

               class208 var22 = new class208(var4 & 63, var5 & 63, var13, var14, var15, var17, var18);
               field7824[var12 - 1][var2 - (field7820 >> 6)][var3 - (field7813 >> 6)].add(var22);
            }
         }
      }

   }

   class491() throws Throwable {
      throw new Error();
   }

   static void method4403(byte[] var0, byte[] var1, short[] var2, int var3, int var4) {
      int[] var5 = new int[field7815];
      int[] var6 = new int[field7815];
      int[] var7 = new int[field7815];
      int[] var8 = new int[field7815];
      int[] var9 = new int[field7815];

      for(int var10 = -5; var10 < field7814; ++var10) {
         int var11 = var10 + 5;
         int var12 = var10 - 5;

         int var13;
         int var14;
         for(var13 = 0; var13 < field7815; ++var13) {
            class758 var15;
            if (var11 < field7814) {
               var14 = var0[var11 + var13 * field7814] & 255;
               if (var14 > 0) {
                  var15 = field7794.method4151(var14 - 1, (byte)-1);
                  var5[var13] += var15.field4338;
                  var6[var13] += var15.field4335;
                  var7[var13] += var15.field4340;
                  var8[var13] += var15.field4341;
                  ++var9[var13];
               }
            }

            if (var12 >= 0) {
               var14 = var0[var12 + var13 * field7814] & 255;
               if (var14 > 0) {
                  var15 = field7794.method4151(var14 - 1, (byte)-1);
                  var5[var13] -= var15.field4338;
                  var6[var13] -= var15.field4335;
                  var7[var13] -= var15.field4340;
                  var8[var13] -= var15.field4341;
                  --var9[var13];
               }
            }
         }

         if (var10 >= 0) {
            var13 = 0;
            var14 = 0;
            int var26 = 0;
            int var16 = 0;
            int var17 = 0;

            for(int var18 = -5; var18 < field7815; ++var18) {
               int var19 = var18 + 5;
               if (var19 < field7815) {
                  var13 += var5[var19];
                  var14 += var6[var19];
                  var26 += var7[var19];
                  var16 += var8[var19];
                  var17 += var9[var19];
               }

               int var20 = var18 - 5;
               if (var20 >= 0) {
                  var13 -= var5[var20];
                  var14 -= var6[var20];
                  var26 -= var7[var20];
                  var16 -= var8[var20];
                  var17 -= var9[var20];
               }

               if (var18 >= 0 && var17 > 0) {
                  int var21;
                  if ((var0[var10 + var18 * field7814] & 255) == 0) {
                     var21 = var10 + var18 * field7814;
                     var1[var21] = 0;
                     var2[var21] = 0;
                  } else {
                     var21 = var16 == 0 ? 0 : class916.method6457(var13 * 256 / var16, var14 / var17, var26 / var17, -235005806);
                     int var22 = (var21 & 127) + var4;
                     if (var22 < 0) {
                        var22 = 0;
                     } else if (var22 > 127) {
                        var22 = 127;
                     }

                     int var23 = (var21 + var3 & 'ﰀ') + (var21 & 896) + var22;
                     int var24 = var10 + var18 * field7814;
                     int var25 = class543.field3817[class526.method2228(class976.method1823(var23, 96, 1291456097), (byte)0) & '\uffff'];
                     var1[var24] = (byte)(var25 >> 16 & 255);
                     var2[var24] = (short)(var25 & '\uffff');
                  }
               }
            }
         }
      }

   }

   static void method4404() {
      int[] var0 = new int[3];

      for(int var1 = 0; var1 < field7810.field1685; ++var1) {
         boolean var2 = field7793.method7(field7810.field1684[var1] >> 28 & 3, field7810.field1684[var1] >> 14 & 16383, field7810.field1684[var1] & 16383, var0, 1112796822);
         if (var2) {
            class392 var3 = new class392(field7810.field1686[var1]);
            var3.field5395 = var0[1] - field7820;
            var3.field5398 = var0[2] - field7813;
            field7811.method897(var3, 1249081090);
         }
      }

   }

   static void method4405(class848 var0) {
      int var1 = field7827 - field7805;
      int var2 = field7816 - field7817;
      int var3 = (field7831 - field7796 << 16) / var1;
      int var4 = (field7832 - field7830 << 16) / var2;
      method4396(var0, var3, var4, 0, 0);
   }

   static void method4406(class848 var0, int var1, int var2) {
      InputStream var3 = new InputStream(field7823.method3271(field7793.field13, "area", -1304297711));
      int var4 = var3.method6371();
      int[] var5 = new int[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = var3.method6371();
      }

      var6 = var3.method6371();
      int[] var7 = new int[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var3.method6371();
      }

      while(true) {
         int var9;
         int var11;
         int var12;
         while(var3.field10376 < var3.field10375.length) {
            int var10;
            int var13;
            if (var3.method6371() == 0) {
               var8 = var3.method6371();
               var9 = var3.method6371();

               for(var10 = 0; var10 < 64; ++var10) {
                  for(var11 = 0; var11 < 64; ++var11) {
                     var12 = var8 * 64 + var10 - field7820;
                     var13 = var9 * 64 + var11 - field7813;
                     method4402(var0, var3, var8, var9, var12, var13, var5, var7);
                  }
               }
            } else {
               var8 = var3.method6371();
               var9 = var3.method6371();
               var10 = var3.method6371();
               var11 = var3.method6371();

               for(var12 = 0; var12 < 8; ++var12) {
                  for(var13 = 0; var13 < 8; ++var13) {
                     int var14 = var8 * 64 + var10 * 8 + var12 - field7820;
                     int var15 = var9 * 64 + var11 * 8 + var13 - field7813;
                     method4402(var0, var3, var8, var9, var14, var15, var5, var7);
                  }
               }
            }
         }

         Object var17 = null;
         field7818 = new byte[field7814 * field7815];
         field7819 = new short[field7814 * field7815];

         for(var9 = 0; var9 < 3; ++var9) {
            byte[] var18 = new byte[field7814 * field7815];

            ArrayList var19;
            Iterator var20;
            class208 var21;
            for(var11 = 0; var11 < field7824[var9].length; ++var11) {
               for(var12 = 0; var12 < field7824[var9][0].length; ++var12) {
                  var19 = field7824[var9][var11][var12];
                  if (var19 != null) {
                     for(var20 = var19.iterator(); var20.hasNext(); var18[var11 * 64 + var21.field7115 + (var12 * 64 + var21.field7116) * field7814] = (byte)var21.field7113) {
                        var21 = (class208)var20.next();
                     }
                  }
               }
            }

            method4403(var18, field7818, field7819, var1, var2);

            for(var11 = 0; var11 < field7824[var9].length; ++var11) {
               for(var12 = 0; var12 < field7824[var9][0].length; ++var12) {
                  var19 = field7824[var9][var11][var12];
                  if (var19 != null) {
                     var20 = var19.iterator();

                     while(var20.hasNext()) {
                        var21 = (class208)var20.next();
                        int var16 = var11 * 64 + var21.field7115 + (var12 * 64 + var21.field7116) * field7814;
                        var21.field7113 = (field7818[var16] & 255) << 16 | field7819[var16] & '\uffff';
                        if (var21.field7113 != 0) {
                           var21.field7113 |= -16777216;
                        }
                     }
                  }
               }
            }
         }

         method4403(field7799, field7818, field7819, var1, var2);
         field7799 = null;
         method4417();
         return;
      }
   }

   static void method4407(class848 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, byte[] var9, boolean var10) {
      int var11;
      int var12;
      if (var10 || var5 != 0 || var6 > 0) {
         if (var6 == 0) {
            var0.method4984(var1, var2, var3, var4, var5, 0);
         } else {
            var11 = var7 & 63;
            if (var11 != 0 && var3 > 1 && var4 > 1) {
               var12 = var10 ? 0 : 1;
               class359.method1345(var0, field7804, field7829, var1, var2, var5, field7812[var6], var3, var4, var11, var7 >> 6 & 3, var12, (byte)127);
            } else {
               var12 = field7812[var6];
               if (var10 || var12 != 0) {
                  var0.method4984(var1, var2, var3, var4, var12, 0);
               }
            }
         }
      }

      if (var8 != null) {
         if (var3 == 1) {
            var11 = var1;
         } else {
            var11 = var1 + var3 - 1;
         }

         if (var4 == 1) {
            var12 = var2;
         } else {
            var12 = var2 + var4 - 1;
         }

         for(int var13 = 0; var13 < var8.length; ++var13) {
            int var14 = var9[var13] & 63;
            if (var14 == class15.field6922.field6921 || var14 == class15.field6901.field6921 || var14 == class15.field6902.field6921 || var14 == class15.field6903.field6921) {
               ObjectDefinition var15 = field7795.method4713(var8[var13]);
               if (var15.field2232 == -1) {
                  int var16 = -3355444;
                  if (var15.field2214 == 1) {
                     var16 = -3407872;
                  }

                  int var17 = var9[var13] >> 6 & 3;
                  if (var14 == class15.field6922.field6921) {
                     if (var17 == 0) {
                        var0.method4843(var1, var2, var4, var16, 0);
                     } else if (var17 == 1) {
                        var0.method4839(var1, var2, var3, var16, 0);
                     } else if (var17 == 2) {
                        var0.method4843(var11, var2, var4, var16, 0);
                     } else {
                        var0.method4839(var1, var12, var3, var16, 0);
                     }
                  } else if (var14 == class15.field6901.field6921) {
                     if (var17 == 0) {
                        var0.method4843(var1, var2, var4, -1, 0);
                        var0.method4839(var1, var2, var3, var16, 0);
                     } else if (var17 == 1) {
                        var0.method4843(var11, var2, var4, -1, 0);
                        var0.method4839(var1, var2, var3, var16, 0);
                     } else if (var17 == 2) {
                        var0.method4843(var11, var2, var4, -1, 0);
                        var0.method4839(var1, var12, var3, var16, 0);
                     } else {
                        var0.method4843(var1, var2, var4, -1, 0);
                        var0.method4839(var1, var12, var3, var16, 0);
                     }
                  } else if (var14 == class15.field6902.field6921) {
                     if (var17 == 0) {
                        var0.method4839(var1, var2, 1, var16, 0);
                     } else if (var17 == 1) {
                        var0.method4839(var11, var2, 1, var16, 0);
                     } else if (var17 == 2) {
                        var0.method4839(var11, var12, 1, var16, 0);
                     } else {
                        var0.method4839(var1, var12, 1, var16, 0);
                     }
                  } else if (var14 == class15.field6903.field6921) {
                     int var18;
                     if (var17 != 0 && var17 != 2) {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.method4839(var1 + var18, var2 + var18, 1, var16, 0);
                        }
                     } else {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.method4839(var1 + var18, var12 - var18, 1, var16, 0);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method4408(class848 var0, int var1, int var2, int var3, int var4, int[] var5, byte[] var6) {
      if (var5 != null) {
         for(int var7 = 0; var7 < var5.length; ++var7) {
            ObjectDefinition var8 = field7795.method4713(var5[var7]);
            int var9 = var8.field2232;
            if (var9 != -1) {
               class279 var10 = field7800.method2003(var9, -2130050645);
               class48 var11 = var10.method6611(var0, var8.field2233 ? var6[var7] >> 6 & 3 : 0, var8.field2272 ? var8.field2236 : false, (byte)-47);
               if (var11 != null) {
                  int var12 = var3 * var11.method5594() >> 2;
                  int var13 = var4 * var11.method3109() >> 2;
                  if (var10.field10588) {
                     int var14 = var8.field2218;
                     int var15 = var8.field2215;
                     if ((var6[var7] >> 6 & 1) == 1) {
                        int var16 = var14;
                        var14 = var15;
                        var15 = var16;
                     }

                     var12 = var14 * var3;
                     var13 = var15 * var4;
                  }

                  if (var12 != 0 && var13 != 0) {
                     if (var10.field10586 != 0) {
                        var11.method3117(var1, var2 - var13 + var4, var12, var13, 0, -16777216 | var10.field10586, 1);
                     } else {
                        var11.method3116(var1, var2 - var13 + var4, var12, var13);
                     }
                  }
               }
            }
         }
      }

   }

   static class373 method4409(class848 var0) {
      int var1 = field7827 - field7805;
      int var2 = field7816 - field7817;
      int var3 = (field7831 - field7796 << 16) / var1;
      int var4 = (field7832 - field7830 << 16) / var2;
      return method4410(var0, var3, var4, 0, 0);
   }

   static class373 method4410(class848 var0, int var1, int var2, int var3, int var4) {
      for(class392 var5 = (class392)field7811.method901(1766612795); var5 != null; var5 = (class392)field7811.method906(49146)) {
         method4411(var0, var5, var1, var2, var3, var4);
      }

      return field7811;
   }

   static void method4411(class848 var0, class392 var1, int var2, int var3, int var4, int var5) {
      var1.field5397 = field7796 + (var4 + var2 * (var1.field5395 - field7805) >> 16);
      var1.field5394 = field7832 - (var5 + var3 * (var1.field5398 - field7817) >> 16);
   }

   public static class327 method4412(int var0) {
      return (class327)field7801.method2942((long)var0);
   }

   static void method4413() {
      field7799 = new byte[field7814 * field7815];
      field7797 = new byte[field7814 * field7815];
      field7821 = new byte[field7814 * field7815];
      field7822 = new Object[field7814 * field7815];
      field7825 = new byte[field7814 * field7815];
      field7824 = new ArrayList[3][field7814 >> 6][field7815 >> 6];
      field7812 = new int[field7828.field4021 + 1];
   }

   static void method4414(class478 var0, int var1, int var2) {
      for(int var3 = 0; var3 < field7828.field4021; ++var3) {
         field7812[var3 + 1] = method4401(var0, var3, var1, var2);
      }

   }

   public static class327 method4415(int var0, int var1) {
      for(class327 var2 = (class327)field7801.method2946(1588897265); var2 != null; var2 = (class327)field7801.method2945((byte)-24)) {
         if (var2.field21 && var2.method4(var0, var1, (byte)-105)) {
            return var2;
         }
      }

      return null;
   }

   static void method4416(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field7805 = var0 - field7820;
      field7816 = var1 - field7813;
      field7827 = var2 - field7820;
      field7817 = var3 - field7813;
      field7796 = var4;
      field7830 = var5;
      field7831 = var6;
      field7832 = var7;
   }

   static void method4417() {
      int var0;
      int var1;
      int var16;
      for(var0 = 0; var0 < field7814; ++var0) {
         for(var1 = 0; var1 < field7815; ++var1) {
            Object var2 = field7822[var0 + var1 * field7814];
            if (var2 != null) {
               if (var2 instanceof class349) {
                  class349 var11 = (class349)var2;
                  if (var11 != null) {
                     for(int var13 = 0; var13 < var11.field1565.length; ++var13) {
                        ObjectDefinition var15 = field7795.method4713(var11.field1565[var13]);
                        var16 = var15.field2231;
                        if (var15.field2198 != null) {
                           var15 = var15.method1487(field7798, 2117091255);
                           if (var15 != null) {
                              var16 = var15.field2231;
                           }
                        }

                        if (var16 != -1) {
                           class392 var7 = new class392(var16);
                           var7.field5395 = var0;
                           var7.field5398 = var1;
                           field7811.method897(var7, 2035193574);
                        }
                     }
                  }
               } else {
                  Integer var3 = (Integer)var2;
                  ObjectDefinition var4 = field7795.method4713(var3.intValue());
                  int var5 = var4.field2231;
                  if (var4.field2198 != null) {
                     var4 = var4.method1487(field7798, 1079072044);
                     if (var4 != null) {
                        var5 = var4.field2231;
                     }
                  }

                  if (var5 != -1) {
                     class392 var6 = new class392(var5);
                     var6.field5395 = var0;
                     var6.field5398 = var1;
                     field7811.method897(var6, 1393789862);
                  }
               }
            }
         }
      }

      for(var0 = 0; var0 < 3; ++var0) {
         for(var1 = 0; var1 < field7824[0].length; ++var1) {
            label88:
            for(int var10 = 0; var10 < field7824[0][0].length; ++var10) {
               ArrayList var12 = field7824[var0][var1][var10];
               if (var12 != null) {
                  Iterator var14 = var12.iterator();

                  while(true) {
                     class208 var17;
                     do {
                        if (!var14.hasNext()) {
                           continue label88;
                        }

                        var17 = (class208)var14.next();
                     } while(var17.field7111 == null);

                     for(var16 = 0; var16 < var17.field7111.length; ++var16) {
                        ObjectDefinition var18 = field7795.method4713(var17.field7111[var16]);
                        int var8 = var18.field2231;
                        if (var18.field2198 != null) {
                           var18 = var18.method1487(field7798, 984911486);
                           if (var18 != null) {
                              var8 = var18.field2231;
                           }
                        }

                        if (var8 != -1) {
                           class392 var9 = new class392(var8);
                           var9.field5395 = (var1 + (field7820 >> 6)) * 64 + var17.field7115 - field7820;
                           var9.field5398 = (var10 + (field7813 >> 6)) * 64 + var17.field7116 - field7813;
                           field7811.method897(var9, 1574718042);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static void method4418(class848 var0, class392 var1, class718 var2) {
      if (var2.field3518 != null) {
         int[] var3 = new int[var2.field3518.length];

         int var4;
         int var5;
         int var6;
         for(var4 = 0; var4 < var3.length / 2; ++var4) {
            var5 = var2.field3518[var4 * 2] + var1.field5395;
            var6 = var2.field3518[var4 * 2 + 1] + var1.field5398;
            var3[var4 * 2] = field7796 + (field7831 - field7796) * (var5 - field7805) / (field7827 - field7805);
            var3[var4 * 2 + 1] = field7832 - (field7832 - field7830) * (var6 - field7817) / (field7816 - field7817);
         }

         class421.method5752(var0, var3, var2.field3523);
         if (var2.field3521 > 0) {
            int var7;
            int var8;
            int var9;
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var5 = var3[var4 * 2];
               var6 = var3[var4 * 2 + 1];
               var7 = var3[(var4 + 1) * 2];
               var8 = var3[(var4 + 1) * 2 + 1];
               if (var7 < var5) {
                  var9 = var5;
                  int var10 = var6;
                  var5 = var7;
                  var6 = var8;
                  var7 = var9;
                  var8 = var10;
               } else if (var7 == var5 && var8 < var6) {
                  var9 = var6;
                  var6 = var8;
                  var8 = var9;
               }

               var0.method4863(var5, var6, var7, var8, var2.field3529[var2.field3492[var4] & 255], 1, var2.field3521, var2.field3514, var2.field3503);
            }

            var4 = var3[var3.length - 2];
            var5 = var3[var3.length - 1];
            var6 = var3[0];
            var7 = var3[1];
            if (var6 < var4) {
               var8 = var4;
               var9 = var5;
               var4 = var6;
               var5 = var7;
               var6 = var8;
               var7 = var9;
            } else if (var6 == var4 && var7 < var5) {
               var8 = var5;
               var5 = var7;
               var7 = var8;
            }

            var0.method4863(var4, var5, var6, var7, var2.field3529[var2.field3492[var2.field3492.length - 1] & 255], 1, var2.field3521, var2.field3514, var2.field3503);
         } else {
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var0.method4837(var3[var4 * 2], var3[var4 * 2 + 1], var3[(var4 + 1) * 2], var3[(var4 + 1) * 2 + 1], var2.field3529[var2.field3492[var4] & 255], -608729974);
            }

            var0.method4837(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], var2.field3529[var2.field3492[var2.field3492.length - 1] & 255], -1529195318);
         }
      }

   }
}
