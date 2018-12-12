public class class362 implements class70 {
   int field2293;
   int field2294;

   class362(int var1, int var2) {
      this.field2293 = -1416816271 * var1;
      this.field2294 = var2 * 1741492491;
   }

   public boolean method1040(class284 var1, class742[] var2, int var3, class352 var4, int var5) {
      try {
         for(int var6 = 0; var6 < var3 && var6 < var2.length; ++var6) {
            class742 var7 = var2[var6];
            if (var7 == null) {
               if (var5 >= 2145953887) {
                  throw new IllegalStateException();
               }
            } else if (var7.method1865((byte)-42) == 843745169 * this.field2293 && var7.method1867((byte)0) == this.field2294 * -1785843037) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "oz.a(" + ')');
      }
   }

   public boolean method1039(class284 var1, class742[] var2, int var3, class352 var4) {
      for(int var5 = 0; var5 < var3 && var5 < var2.length; ++var5) {
         class742 var6 = var2[var5];
         if (var6 != null && var6.method1865((byte)-70) == 843745169 * this.field2293 && var6.method1867((byte)0) == this.field2294 * -1785843037) {
            return true;
         }
      }

      return false;
   }

   public boolean method1038(class284 var1, class742[] var2, int var3, class352 var4) {
      for(int var5 = 0; var5 < var3 && var5 < var2.length; ++var5) {
         class742 var6 = var2[var5];
         if (var6 != null && var6.method1865((byte)-60) == 843745169 * this.field2293 && var6.method1867((byte)0) == this.field2294 * -1785843037) {
            return true;
         }
      }

      return false;
   }

   static void method1505(class131 var0, int var1, int var2, int var3, boolean var4, class744 var5, int var6) {
      try {
         if (var2 == 0) {
            throw new RuntimeException();
         } else {
            class564 var7 = var0.field1103[var1];
            if (var7.field1017 == null) {
               var7.field1017 = new class564[var3 + 1];
               var7.field1018 = var7.field1017;
            }

            if (var7.field1017.length <= var3) {
               class564[] var8;
               if (var7.field1018 == var7.field1017) {
                  var8 = new class564[1 + var3];

                  for(int var9 = 0; var9 < var7.field1017.length; ++var9) {
                     var8[var9] = var7.field1017[var9];
                  }

                  var7.field1017 = var7.field1018 = var8;
               } else {
                  var8 = new class564[1 + var3];
                  class564[] var13 = new class564[1 + var3];

                  for(int var10 = 0; var10 < var7.field1017.length; ++var10) {
                     var8[var10] = var7.field1017[var10];
                     var13[var10] = var7.field1018[var10];
                  }

                  var7.field1017 = var8;
                  var7.field1018 = var13;
               }
            }

            if (var3 > 0 && var7.field1017[var3 - 1] == null) {
               throw new RuntimeException("" + (var3 - 1));
            } else {
               class564 var12 = new class564();
               var12.field869 = var2 * -800405999;
               var12.field885 = (var12.field867 = 1 * var7.field867) * -293252211;
               var12.field879 = var3 * -263105643;
               var7.field1017[var3] = var12;
               if (var7.field1018 != var7.field1017) {
                  var7.field1018[var3] = var12;
               }

               class237 var14;
               if (var4) {
                  var14 = var5.field3164;
               } else {
                  var14 = var5.field3163;
               }

               var14.field8254 = var0;
               var14.field8255 = var12;
               class814.method2932(var7, 6185968);
            }
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "oz.z(" + ')');
      }
   }

   static final void method1506(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -883564772) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field995 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oz.nh(" + ')');
      }
   }

   static final void method1507(class744 var0, byte var1) {
      try {
         class818.method2903(var0.field3170, var0.field3161[(var0.field3156 -= -391880689) * 681479919], (byte)14);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int) Client.field2873[0];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int) Client.field2873[1];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int) Client.field2873[2];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oz.apa(" + ')');
      }
   }

   public static void method1508(int var0) {
      try {
         int var1 = 0;
         if (class615.field8903.field9126.method6339(-1994790043) == 1) {
            var1 |= 1;
            var1 |= 16;
            var1 |= 32;
            var1 |= 2;
            var1 |= 4;
         }

         if (class615.field8903.field9123.method5845(1870666602) == 0) {
            var1 |= 64;
         }

         class865.method5335(var1, -1404267888);
         Client.field2697.method5283(2004012946).method4708(var1, -1760580017);
         class625.field9752.method463((short)206).method5283(-1884844132).method4708(var1, -1760580017);
         class85.field1121.method1572(var1, 828561369);
         class258.field7913.method14(var1, 1252678892);
         class635.field9823.method1056(var1, -142554696);
         class381.method1069(var1, (short)8448);
         class304.method2389(var1, (byte)-68);
         class199.method3750(var1, (byte)-5);
         class779.method2321(var1, (byte)65);
         class82.method921(var1, -1700152432);
         Client.field2697.method5309(1301460504);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "oz.gw(" + ')');
      }
   }

   public static void method1509(int var0, byte var1) {
      try {
         class740.field3207 = 2138103821 * var0;
         class740.field3204 = -1998014133;
         class10.field6652 = -189172599;
         class622.field9010 = -338630500;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oz.cz(" + ')');
      }
   }

   static final void method1510(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         if (14 == -1233866115 * Client.field2733 && !class673.method4261((byte)23)) {
            if (var2.length() > 20) {
               Client.field2941 = -4;
            } else {
               Client.field2941 = -1;
               class701 var3 = class637.method5936(class643.field9965, Client.field2674.field7765, (byte)66);
               var3.field3364.method6361(0);
               int var4 = 385051775 * var3.field3364.field10376;
               var3.field3364.method6366(var2, 2125577708);
               var3.field3364.method6426(var3.field3364.field10376 * 385051775 - var4, (byte)-53);
               Client.field2674.method4380(var3, (byte)-40);
            }
         } else {
            Client.field2941 = -5;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oz.abg(" + ')');
      }
   }
}
