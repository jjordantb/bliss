public class class517 extends class535 {
   static int field4328 = 127;
   static int field4329 = 0;

   public class517(int var1, class838 var2) {
      super(var1, var2);
   }

   public class517(class838 var1) {
      super(var1);
   }

   int method2272(int var1) {
      return 127;
   }

   int method2273(int var1, int var2) {
      return 1;
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aer.p(" + ')');
      }
   }

   public int method2717(int var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aer.z(" + ')');
      }
   }

   public void method2718(byte var1) {
      try {
         if (super.field3708 < 0 && super.field3708 > 127) {
            super.field3708 = this.method2272(-1091362223);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aer.s(" + ')');
      }
   }

   static boolean method2719(class718 var0, int var1) {
      try {
         if (var0 == null) {
            return false;
         } else if (!var0.field3525) {
            return false;
         } else if (!var0.method2063(class491.field7798, 655699987)) {
            return false;
         } else if (class740.field3210.method2942((long)var0.field3499) != null) {
            return false;
         } else {
            return class740.field3211.method2942((long)var0.field3532) == null;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aer.bn(" + ')');
      }
   }

   public static boolean method2720(byte var0, short var1) {
      try {
         int var2 = var0 & 255;
         if (var2 == 0) {
            return false;
         } else {
            return var2 < 128 || var2 >= 160 || class519.field4212[var2 - 128] != 0;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aer.b(" + ')');
      }
   }
}
