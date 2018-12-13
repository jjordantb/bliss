public class class929 extends class304 {
   public void method2383(int var1) {
      try {
         class503.method2587(true, (short)12990);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xv.f(" + ')');
      }
   }

   class929(InputStream var1) {
      super(var1);
   }

   static final void method6262(int var0, int var1, int var2) {
      try {
         if (class215.method3835(var0, (int[])null, -1864950961)) {
            class71.method1088(class382.widgetContainers[var0].widgetsCopy, var1, (byte)65);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "xv.lv(" + ')');
      }
   }

   static void method6263(Widget var0, int var1, int var2, boolean var3, byte var4) {
      try {
         int var5 = var0.field881;
         int var6 = var0.field887;
         if (var0.field873 == 0) {
            var0.field881 = var0.field978;
         } else if (1 == var0.field873) {
            var0.field881 = var1 - var0.field978;
         } else if (2 == var0.field873) {
            var0.field881 = var1 * var0.field978 >> 14;
         }

         if (var0.field874 == 0) {
            var0.field887 = var0.field878;
         } else if (1 == var0.field874) {
            var0.field887 = var2 - var0.field878;
         } else if (var0.field874 == 2) {
            var0.field887 = var2 * var0.field878 >> 14;
         }

         if (var0.field873 == 4) {
            var0.field881 = var0.field883 * var0.field887 / var0.field967;
         }

         if (var0.field874 == 4) {
            var0.field887 = var0.field881 * var0.field967 / var0.field883;
         }

         if (class730.field2828 && (class730.method1761(var0).field2563 != 0 || var0.field869 == 0)) {
            if (var0.field887 < 5 && var0.field881 < 5) {
               var0.field887 = 5;
               var0.field881 = 5;
            } else {
               if (var0.field887 <= 0) {
                  var0.field887 = 5;
               }

               if (var0.field881 <= 0) {
                  var0.field881 = 5;
               }
            }
         }

         if (var0.field870 == Widget.field994) {
            class730.field2800 = var0;
         }

         if (var3 && var0.field889 != null && (var5 != var0.field881 || var0.field887 != var6)) {
            class202 var7 = new class202();
            var7.field7578 = var0;
            var7.field7583 = var0.field889;
            class730.field2875.method897(var7, 528123519);
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "xv.kj(" + ')');
      }
   }

   static void method6264(class744 var0, byte var1) {
      try {
         var0.field3161[var0.field3156 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).field8994[var0.field3161[var0.field3156 - 1]][0];
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xv.s(" + ')');
      }
   }
}
