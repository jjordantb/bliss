public abstract class class304 {
   public int field3829;

   public abstract void method2383(int var1);

   void method2384(int var1) {
   }

   class304(InputStream var1) {
      this.field3829 = var1.method6374();
   }

   boolean method2387(int var1) {
      return true;
   }

   static void method2388(class848 var0, ObjectDefinition var1, int var2, int var3, int var4, byte var5) {
      try {
         class279 var6 = class981.field3274.method2003(var1.field2232, -2141345299);
         if (var6.field10587 != -1) {
            if (var1.field2233) {
               var2 += var1.field2234;
               var2 &= 3;
            } else {
               var2 = 0;
            }

            class48 var7 = var6.method6611(var0, var2, var1.field2272, (byte)-63);
            if (var7 != null) {
               int var8 = var1.field2218;
               int var9 = var1.field2215;
               if ((var2 & 1) == 1) {
                  var8 = var1.field2215;
                  var9 = var1.field2218;
               }

               int var10 = var7.method5594();
               int var11 = var7.method3109();
               if (var6.field10588) {
                  var10 = var8 * 4;
                  var11 = 4 * var9;
               }

               if (var6.field10586 != 0) {
                  var7.method3117(var3, var4 - (var9 - 1) * 4, var10, var11, 0, -16777216 | var6.field10586, 1);
               } else {
                  var7.method3116(var3, var4 - 4 * (var9 - 1), var10, var11);
               }
            }
         }

      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "di.x(" + ')');
      }
   }

   public static void method2389(int var0, byte var1) {
      try {
         class669.field7394 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "di.i(" + ')');
      }
   }

   static final void method2390(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)-100);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class276.method6620(var3, var4, var0, -2106555824);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "di.md(" + ')');
      }
   }

   static final void method2391(class744 var0, int var1) {
      try {
         long var2 = var0.field3168[--var0.field3162];
         var0.field3157[++var0.field3158 - 1] = var2 == -1L ? "" : Long.toString(var2, 36).toUpperCase();
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "di.aab(" + ')');
      }
   }

   static final void method2392(class744 var0, byte var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9116, var0.field3161[--var0.field3156], -283253928);
         class337.method77(class615.field8903.field9137.method3689(-1637975360), false, 622850291);
         class95.method523(656179282);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "di.aia(" + ')');
      }
   }

   static final void method2393(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, 601023665);
         int var4 = 0;
         if (var3 != null) {
            var4 = var3.field4127;
         }

         var0.field3161[++var0.field3156 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "di.acf(" + ')');
      }
   }
}
