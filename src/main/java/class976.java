public class class976 {
   static int field3068 = 62;
   static int field3069 = 2;
   static int field3070 = 16;
   static int field3071 = 1;
   static int field3072 = 8;
   static int field3073 = 63;

   class976() throws Throwable {
      throw new Error();
   }

   static final void method1821(class744 var0, int var1) {
      try {
         class564 var2 = class449.method3756(var0.field3161[--var0.field3156], (byte)-49);
         if (var2.field1005 != -1) {
            var0.field3161[++var0.field3156 - 1] = var2.field1006;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mb.rw(" + ')');
      }
   }

   static final void method1822(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3160.field6484[var2] = var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mb.adb(" + ')');
      }
   }

   public static final int method1823(int var0, int var1, int var2) {
      try {
         if (-1 == var0) {
            return 12345678;
         } else {
            var1 = (var0 & 127) * var1 >> 7;
            if (var1 < 2) {
               var1 = 2;
            } else if (var1 > 126) {
               var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mb.q(" + ')');
      }
   }

   public static void method1824(int var0, int var1) {
      try {
         class682 var2 = class370.method881(22, (long)var0);
         var2.method4336(-926641552);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mb.d(" + ')');
      }
   }
}
