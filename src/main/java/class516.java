public final class class516 {
   public static int field4332;

   class516() throws Throwable {
      throw new Error();
   }

   static final void method2725(class744 var0, byte var1) {
      try {
         class564 var2 = class449.method3756(var0.field3161[--var0.field3156], (byte)-64);
         if (var2.field1017 == null) {
            var0.field3161[++var0.field3156 - 1] = 0;
         } else {
            int var3 = var2.field1017.length;

            for(int var4 = 0; var4 < var2.field1017.length; ++var4) {
               if (var2.field1017[var4] == null) {
                  var3 = var4;
                  break;
               }
            }

            var0.field3161[++var0.field3156 - 1] = var3;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ri.ro(" + ')');
      }
   }

   static void method2726(class744 var0, byte var1) {
      try {
         class865 var2 = class735.field3009.method4224(var0.field3161[--var0.field3156], 245040087);
         var0.field3161[++var0.field3156 - 1] = var2.field8994 == null ? 0 : var2.field8994.length;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ri.n(" + ')');
      }
   }

   static void method2727(byte var0) {
      try {
         class881.field10140 = 264;
         class881.field10177 = class730.field2692;
         if (class730.field2825 != null) {
            InputStream var1 = new InputStream(class730.field2825);
            class881.field10146 = var1.method6375((short)16837);
            class881.field10183 = var1.method6375((short)3310);
         }

         if (class881.field10146 < 0L) {
            class919.method6486(35, 1368689895);
         } else {
            class521.method2751(false, true, "", "", class881.field10146);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ri.h(" + ')');
      }
   }

   static final void method2728(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)84);
         class131 var4 = class382.field1410[var2 >> 16];
         class964.method2134(var3, var4, var0, -750827082);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ri.ne(" + ')');
      }
   }

   static void method2729(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(17, (long)var0);
         var3.method4340((byte)28);
         var3.field7687 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ri.ar(" + ')');
      }
   }

   static void method2730(byte var0) {
      try {
         class163.field6617.method2941((byte)-68);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ri.r(" + ')');
      }
   }
}
