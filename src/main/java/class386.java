import java.awt.Frame;

final class class386 implements class415 {
   public int method5657(int var1) {
      class722 var2 = (class722)class949.field3321.method2942((long)var1);
      return var2 == null ? class827.field9037.method5655(var1, (byte)84) : var2.field3631 * -774922497;
   }

   public int method5658(int var1) {
      class722 var2 = (class722)class949.field3321.method2942((long)var1);
      return var2 == null ? class827.field9037.method5655(var1, (byte)1) : var2.field3631 * -774922497;
   }

   public int method5655(int var1, byte var2) {
      try {
         class722 var3 = (class722)class949.field3321.method2942((long)var1);
         return var3 == null ? class827.field9037.method5655(var1, (byte)21) : var3.field3631 * -774922497;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "du.d(" + ')');
      }
   }

   public int method5654(int var1) {
      class722 var2 = (class722)class949.field3321.method2942((long)var1);
      return var2 == null ? class827.field9037.method5655(var1, (byte)101) : var2.field3631 * -774922497;
   }

   public int method5656(int var1) {
      class722 var2 = (class722)class949.field3321.method2942((long)var1);
      return var2 == null ? class827.field9037.method5655(var1, (byte)98) : var2.field3631 * -774922497;
   }

   public int method5653(int var1, byte var2) {
      try {
         class722 var3 = (class722)class949.field3321.method2942(4294967296L | (long)var1);
         return var3 == null ? class827.field9037.method5653(var1, (byte)36) : -774922497 * var3.field3631;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "du.u(" + ')');
      }
   }

   public int method5652(int var1) {
      class722 var2 = (class722)class949.field3321.method2942(4294967296L | (long)var1);
      return var2 == null ? class827.field9037.method5653(var1, (byte)43) : -774922497 * var2.field3631;
   }

   static final void method1166(class744 var0, int var1) {
      try {
         if (class730.field2785 != null) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class431.method4256(class730.field2785, 864183945);
         } else {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "du.wy(" + ')');
      }
   }

   public static void method1167(class549 var0, Frame var1, int var2) {
      try {
         var0.method391();
         var1.setVisible(false);
         var1.dispose();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "du.b(" + ')');
      }
   }

   public static void method1168(byte var0) {
      try {
         class79.field1525 = new class373();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "du.a(" + ')');
      }
   }

   public static void method1169(class284 var0, int var1) {
      try {
         if (!class552.method457(class730.field2733 * -1233866115, (byte)-26)) {
            var0.method6670(1342402184);
         } else {
            class978.field3128.method3584(var0, 2143317873);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "du.p(" + ')');
      }
   }

   static final void method1170(int var0, int var1, long var2) {
      try {
         int var4 = (int)var2 >> 14 & 31;
         int var5 = (int)var2 >> 20 & 3;
         int var6 = (int)(var2 >>> 32) & Integer.MAX_VALUE;
         class15 var7 = (class15)class367.method1565(class351.method1227(114624527), var4, (byte)2);
         class312 var11;
         if (class15.field6919 != var7 && class15.field6912 != var7 && class15.field6918 != var7) {
            if (class26.method3482(-1976050083 * var7.field6921, (byte)28)) {
               var11 = class391.method3417(var0, var1, 0, 0, var7, var5, 740164949);
            } else {
               var11 = class979.method1834(var0, var1, 0, 0, var7, var5, (byte)-22);
            }
         } else {
            class50 var8 = class730.field2697.method5283(-1208362615).method4713(var6);
            int var9;
            int var10;
            if (var5 != 0 && var5 != 2) {
               var9 = -565161399 * var8.field2215;
               var10 = var8.field2218 * -1125834887;
            } else {
               var9 = -1125834887 * var8.field2218;
               var10 = -565161399 * var8.field2215;
            }

            var11 = class391.method3417(var0, var1, var9, var10, class15.field6922, 0, 1300552038);
         }

         class133.method998(var0, var1, true, var11, -1680742639);
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "du.jd(" + ')');
      }
   }

   public static boolean method1171(int var0) {
      try {
         try {
            if (!class470.available()) {
               boolean var5 = false;
               return var5;
            }
         } catch (Throwable var3) {
            return false;
         }

         if (class470.field8223 != null) {
            throw new IllegalStateException("");
         } else {
            class470.field8223 = new class470();
            Thread var1 = new Thread(new class610());
            var1.setDaemon(true);
            var1.start();
            return true;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "du.k(" + ')');
      }
   }
}
