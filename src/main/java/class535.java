public abstract class class535 {
   protected class838 field3704;
   protected static int field3705 = 2;
   protected static int field3706 = 1;
   public static int field3707 = 3;
   protected int field3708;
   static class48[] field3709;

   abstract void method2271(int var1);

   abstract int method2272(int var1);

   abstract int method2273(int var1, int var2);

   void method2274(int var1, int var2) {
      try {
         if (this.method2273(var1, 1352882135) != 3) {
            this.method2275(var1, -1655060812);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rm.b(" + ')');
      }
   }

   abstract void method2275(int var1, int var2);

   abstract int method2276();

   class535(class838 var1) {
      this.field3704 = var1;
      this.field3708 = this.method2272(-1613011239) * 1886334997;
   }

   class535(int var1, class838 var2) {
      this.field3708 = var1 * 1886334997;
      this.field3704 = var2;
   }

   abstract int method2277(int var1);

   public static void method2278(byte var0) {
      try {
         for(int var1 = 0; var1 < -991384187 * class540.field3926; ++var1) {
            class45 var2 = class540.field3927[var1];
            if (var2.field5110 == 3) {
               class385.method1180(var2, (short)22686);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rm.w(" + ')');
      }
   }

   static final void method2279(class744 var0, int var1) {
      try {
         class115.method1276(327778485);
         Client.field2697.method5309(382492199);
         class95.method523(656179282);
         Client.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rm.amc(" + ')');
      }
   }

   static int method2280(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2 && var1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = var0.length();

            for(int var8 = 0; var8 < var7; ++var8) {
               char var9 = var0.charAt(var8);
               if (var8 == 0) {
                  if ('-' == var9) {
                     var4 = true;
                     continue;
                  }

                  if ('+' == var9 && var2) {
                     continue;
                  }
               }

               int var12;
               if (var9 >= '0' && var9 <= '9') {
                  var12 = var9 - 48;
               } else if (var9 >= 'A' && var9 <= 'Z') {
                  var12 = var9 - 55;
               } else {
                  if (var9 < 'a' || var9 > 'z') {
                     throw new NumberFormatException();
                  }

                  var12 = var9 - 87;
               }

               if (var12 >= var1) {
                  throw new NumberFormatException();
               }

               if (var4) {
                  var12 = -var12;
               }

               int var10 = var6 * var1 + var12;
               if (var10 / var1 != var6) {
                  throw new NumberFormatException();
               }

               var6 = var10;
               var5 = true;
            }

            if (!var5) {
               throw new NumberFormatException();
            } else {
               return var6;
            }
         } else {
            throw new IllegalArgumentException("" + var1);
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "rm.d(" + ')');
      }
   }

   static void method2281(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 * 681479919 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 * 681479919 - 2], 245040087).method5330(class827.field9037, var0.field3161[681479919 * var0.field3156 - 1], -1119994003) ? 1 : 0;
         var0.field3156 -= -391880689;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rm.v(" + ')');
      }
   }

   static final boolean method2282(char var0, int var1) {
      try {
         if (Character.isISOControl(var0)) {
            return false;
         } else if (class50.method1498(var0, (short)160)) {
            return true;
         } else {
            char[] var2 = class259.field7966;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if (var4 == var0) {
                  return true;
               }
            }

            var2 = class259.field7964;

            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if (var4 == var0) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "rm.f(" + ')');
      }
   }

   static final void method2283(class744 var0, short var1) {
      try {
         class413.method5609((byte)-40);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rm.ags(" + ')');
      }
   }

   public static void method2284(int var0, int var1) {
      try {
         class682 var2 = class370.method881(4, (long)var0);
         var2.method4336(-926993583);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rm.u(" + ')');
      }
   }
}
