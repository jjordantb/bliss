import java.awt.Canvas;
import java.awt.Dimension;

final class class317 implements class832 {
   public boolean method5380(Animable var1, int var2) {
      try {
         return var1 instanceof class265;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "x.a(" + ')');
      }
   }

   static final void method469(class564 var0, class744 var1, int var2) {
      try {
         int var3 = var1.field3161[--var1.field3156];
         int var4 = var1.field3161[--var1.field3156] - 1;
         if (2 != var0.field909) {
            throw new RuntimeException("");
         } else {
            NpcDefinition var5 = class258.field7913.method12(var0.field876, -87546938);
            if (var0.field1032 == null) {
               var0.field1032 = new class692(var5, false);
            }

            var0.field1032.field7133 = class390.method3422(-1683898407);
            if (var4 >= 0 && var4 < var5.field9866.length) {
               var0.field1032.field7131[var4] = var3;
               class814.method2932(var0, -339426215);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "x.qp(" + ')');
      }
   }

   public static final void method470(class564 var0, int var1, int var2, int var3) {
      try {
         if (class730.field2832 == null && !class602.field8645 && var0 != null && class519.method2667(var0, 1470456512)) {
            class730.field2832 = var0;
            class730.field2693 = class545.method2457(var0, (byte)-122);
            class730.field2715 = var1;
            class730.field2835 = var2;
            class484.field8532 = 0;
            class730.field2845 = false;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "x.ls(" + ')');
      }
   }

   public static final class564 method471(class131 var0, class564 var1, int var2) {
      try {
         if (-1 != var1.field885) {
            return var0.method889(var1.field885, (short)8481);
         } else {
            if (!var0.field1101) {
               int var3 = var1.field867 >>> 16;
               class521 var4 = new class521(class730.field2823);

               for(class256 var5 = (class256)var4.method2749(-2012602178); var5 != null; var5 = (class256)var4.next()) {
                  if (var5.field8101 == var3) {
                     return class449.method3756((int)var5.field641, (byte)-3);
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "x.ku(" + ')');
      }
   }

   public static void method472(int var0) {
      try {
         if (class540.field3925 != null) {
            class540.field3925.method2636((byte)-66);
         }

         if (class95.field607 != null) {
            class95.field607.method2636((byte)-1);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "x.i(" + ')');
      }
   }

   static class358 method473(int var0, int var1, int var2, long var3, int var5, int var6) {
      try {
         class358[] var7 = class358.field1897;
         synchronized(class358.field1897) {
            class358 var8;
            if (class358.field1895 == 0) {
               var8 = new class358();
            } else {
               var8 = class358.field1897[--class358.field1895];
            }

            var8.field1898 = var0;
            var8.field1899 = var1;
            var8.field1900 = var2;
            var8.field1901 = var3;
            var8.field1902 = var5;
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "x.av(" + ')');
      }
   }

   public static class848 method474(int var0, Canvas var1, class478 var2, class180 var3, int var4, int var5) {
      try {
         int var6 = 0;
         int var7 = 0;
         if (var1 != null) {
            Dimension var8 = var1.getSize();
            var6 = var8.width;
            var7 = var8.height;
         }

         return class610.method5139(var0, var1, var2, var3, var4, var6, var7, 16777215);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "x.a(" + ')');
      }
   }
}
