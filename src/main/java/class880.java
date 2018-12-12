public class class880 {
   public static int[] field10185 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   public static int[] field10186 = new int[120];
   public static int field10187 = 25;
   public static int field10188;

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 120; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field10186[var1] = var0 / 4;
      }

   }

   class880() throws Throwable {
      throw new Error();
   }

   static final void method6174(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class590.method1222(var3, var4, var0, 1808304001);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ph.lr(" + ')');
      }
   }

   public static long method6175(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         long var3 = 0L;

         for(int var5 = 0; var5 < var2; ++var5) {
            var3 = (var3 << 5) - var3 + (long)var0.charAt(var5);
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ph.n(" + ')');
      }
   }

   static void method6176(short var0) {
      try {
         if (class540.field3915 != null) {
            class540.field3915 = null;
            class564.method846(256, 497351807);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ph.v(" + ')');
      }
   }

   static void method6177(class848 var0, class392 var1, class718 var2, int var3) {
      try {
         class48 var4 = var2.method2066(var0, 774929674);
         if (var4 != null) {
            int var5 = var4.method3106();
            if (var4.method3108() > var5) {
               var5 = var4.method3108();
            }

            byte var6 = 10;
            int var7 = 1333098669 * var1.field5397;
            int var8 = var1.field5394 * -685779893;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12;
            int var14;
            if (var2.field3507 != null) {
               var9 = class295.field10474.method4598(var2.field3507, (int[])null, class740.field3212, (class653[])null, (byte)37);

               for(var12 = 0; var12 < var9; ++var12) {
                  String var13 = class740.field3212[var12];
                  if (var12 < var9 - 1) {
                     var13 = var13.substring(0, var13.length() - 4);
                  }

                  var14 = class783.field3964.method3971(var13);
                  if (var14 > var10) {
                     var10 = var14;
                  }
               }

               var11 = class783.field3964.method3973() * var9 + class783.field3964.method3970() / 2;
            }

            var12 = var1.field5397 * 1333098669 + var5 / 2;
            int var22 = -685779893 * var1.field5394;
            if (var7 < var5 + class740.field7796) {
               var7 = class740.field7796;
               var12 = var10 / 2 + var5 / 2 + class740.field7796 + var6 + 5;
            } else if (var7 > class740.field7831 - var5) {
               var7 = class740.field7831 - var5;
               var12 = class740.field7831 - var5 / 2 - var6 - var10 / 2 - 5;
            }

            if (var8 < var5 + class740.field7830) {
               var8 = class740.field7830;
               var22 = var5 / 2 + class740.field7830 + var6;
            } else if (var8 > class740.field7832 - var5) {
               var8 = class740.field7832 - var5;
               var22 = class740.field7832 - var5 / 2 - var6 - var11;
            }

            var14 = (int)(Math.atan2((double)(var7 - 1333098669 * var1.field5397), (double)(var8 - var1.field5394 * -685779893)) / 3.141592653589793D * 32767.0D) & '\uffff';
            var4.method3156((float)var7 + (float)var5 / 2.0F, (float)var5 / 2.0F + (float)var8, 4096, var14);
            int var15 = -2;
            int var16 = -2;
            int var17 = -2;
            int var18 = -2;
            if (var2.field3507 != null) {
               var15 = var12 - var10 / 2 - 5;
               var16 = var22;
               var17 = var15 + var10 + 10;
               var18 = var22 + class783.field3964.method3973() * var9 + 3;
               if (var2.field3502 * 594838161 != 0) {
                  var0.method4833(var15, var22, var17 - var15, var18 - var22, var2.field3502 * 594838161, (byte)7);
               }

               if (var2.field3517 * -828737913 != 0) {
                  var0.method4832(var15, var22, var17 - var15, var18 - var22, var2.field3517 * -828737913, 98431177);
               }

               for(int var19 = 0; var19 < var9; ++var19) {
                  String var20 = class740.field3212[var19];
                  if (var19 < var9 - 1) {
                     var20 = var20.substring(0, var20.length() - 4);
                  }

                  class783.field3964.method3972(var0, var20, var12, var22, var2.field3496 * -1836991893, true);
                  var22 += class783.field3964.method3973();
               }
            }

            if (-1 != var2.field3500 * 715019623 || var2.field3507 != null) {
               class960 var23 = new class960(var1);
               var5 >>= 1;
               var23.field3649 = (var7 - var5) * -526214221;
               var23.field3644 = 262353353 * (var5 + var7);
               var23.field3645 = -1699538327 * (var8 - var5);
               var23.field3650 = (var8 + var5) * 1271571593;
               var23.field3651 = 1756490303 * var15;
               var23.field3648 = var17 * -203535375;
               var23.field3647 = var16 * 914712007;
               var23.field3643 = var18 * 205947907;
               class439.field7537.method897(var23, 2005332883);
            }
         }

      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "ph.ba(" + ')');
      }
   }

   static final void method6178(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class614.method5188(var3, var4, var0, (byte)74);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ph.cb(" + ')');
      }
   }
}
