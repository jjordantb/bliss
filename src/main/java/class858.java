public class class858 implements class70 {
   int[] field8898;
   static class219 field8899;

   public boolean method1040(class284 var1, class742[] var2, int var3, class352 var4, int var5) {
      try {
         int[] var6 = this.field8898;

         for(int var7 = 0; var7 < var6.length; ++var7) {
            int var8 = var6[var7];
            if (!var4.method1392(var8, 537035513)) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ov.a(" + ')');
      }
   }

   class858(int[] var1) {
      this.field8898 = var1;
   }

   static boolean method5219(int var0, int var1) {
      try {
         return var0 >= class15.field6904.field6921 && var0 <= class15.field6908.field6921;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ov.p(" + ')');
      }
   }

   public static void method5220(int var0) {
      try {
         class966.field2520.method3071(-1987483304);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ov.a(" + ')');
      }
   }

   static int method5221(int var0, int var1, byte var2) {
      try {
         return class15.field6900.field6921 != var0 && class15.field6902.field6921 != var0 ? class397.field6492[var1 & 3] : class397.field6493[var1 & 3];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ov.by(" + ')');
      }
   }

   static final void method5222(class744 var0, short var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         class785 var4 = class452.field7216.method5148(var3, -1869114423);
         if (var4.method2380(1883696427)) {
            var0.field3157[++var0.field3158 - 1] = class730.field2697.method5283(-1837734772).method4713(var2).method1480(var3, var4.field3823, 1595133323);
         } else {
            var0.field3161[++var0.field3156 - 1] = class730.field2697.method5283(767453715).method4713(var2).method1486(var3, var4.field3822, (byte)2);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ov.abf(" + ')');
      }
   }

   static void method5223(int var0, int var1, int var2, int var3, int var4) {
      try {
         class682 var5 = class370.method881(8, (long)var0);
         var5.method4340((byte)10);
         var5.field7687 = var1;
         var5.field7685 = var2;
         var5.field7686 = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ov.af(" + ')');
      }
   }
}
