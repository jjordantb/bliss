import java.awt.Canvas;

final class class610 implements Runnable {
   public void run() {
      try {
         try {
            class470.field8223.run();
         } catch (Throwable var2) {
            ;
         }

         class470.field8223 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qg.run(" + ')');
      }
   }

   static final void method5137(class744 var0, int var1) {
      try {
         class471 var2 = class397.method3479(-1844616011);
         if (var2 != null) {
            var0.field3161[++var0.field3156 - 1] = var2.field8235;
            var0.field3161[++var0.field3156 - 1] = var2.field3476;
            var0.field3157[++var0.field3158 - 1] = var2.field8237;
            class188 var3 = var2.method4615(275518730);
            var0.field3161[++var0.field3156 - 1] = var3.field5348;
            var0.field3157[++var0.field3158 - 1] = var3.field5347;
            var0.field3161[++var0.field3156 - 1] = var2.field3472;
            var0.field3161[++var0.field3156 - 1] = var2.field8238;
            var0.field3157[++var0.field3158 - 1] = var2.field8236;
         } else {
            var0.field3161[++var0.field3156 - 1] = -1;
            var0.field3161[++var0.field3156 - 1] = 0;
            var0.field3157[++var0.field3158 - 1] = "";
            var0.field3161[++var0.field3156 - 1] = 0;
            var0.field3157[++var0.field3158 - 1] = "";
            var0.field3161[++var0.field3156 - 1] = 0;
            var0.field3161[++var0.field3156 - 1] = 0;
            var0.field3157[++var0.field3158 - 1] = "";
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qg.alh(" + ')');
      }
   }

   static final void method5138(class564 var0, class131 var1, class744 var2, byte var3) {
      try {
         var0.field909 = 2;
         var0.field1032 = null;
         var0.field876 = var2.field3161[--var2.field3156];
         if (var0.field879 == -1 && !var1.field1101) {
            class535.method2284(var0.field867, 2026838544);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "qg.hx(" + ')');
      }
   }

   static synchronized class848 method5139(int var0, Canvas var1, class478 var2, class180 var3, int var4, int var5, int var6, int var7) {
      try {
         if (var0 == 0) {
            return class870.method5884(var1, var2, var5, var6, (byte)88);
         } else if (var0 == 2) {
            return class529.method2217(var1, var2, var5, var6, (byte)-28);
         } else if (1 == var0) {
            return class892.method5636(var1, var2, var4);
         } else if (5 == var0) {
            return class3.method2967(var1, var2, var3, var4);
         } else if (3 == var0) {
            return class908.method6358(var1, var2, var3, var4);
         } else {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "qg.f(" + ')');
      }
   }

   static final void method5140(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         var0.field3161[++var0.field3156 - 1] = var3.field1022;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qg.pl(" + ')');
      }
   }

   static final void method5141(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         if (var2 == 0) {
            var0.field3161[++var0.field3156 - 1] = 0;
         } else {
            var0.field3161[++var0.field3156 - 1] = (int)Math.pow((double)var2, (double)var3);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qg.zb(" + ')');
      }
   }

   static final void method5142(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-21);
         var0.field3161[++var0.field3156 - 1] = var3.field891;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "qg.rn(" + ')');
      }
   }

   public static class912 method5143(InputStream var0, byte var1) {
      try {
         int var2 = var0.method6423(1235052657);
         return new class912(var2);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "qg.a(" + ')');
      }
   }
}
