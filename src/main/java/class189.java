public class class189 {
   static boolean field5358 = false;
   static int field5359 = 0;
   static class373 field5360 = new class373();

   static synchronized void method3360(class297 var0, short var1) {
      try {
         if (!field5358) {
            if (field5359 > 0) {
               class437 var2 = new class437(var0);
               field5360.method897(var2, -259769992);
            } else {
               var0.method6550(false);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cw.a(" + ')');
      }
   }

   static synchronized void method3361(byte var0) {
      try {
         while(true) {
            class437 var1 = (class437)field5360.method898(2119725533);
            if (var1 == null) {
               return;
            }

            ((class297)var1.field7515).method6550(true);
            var1.method545(-1460969981);
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "cw.f(" + ')');
      }
   }

   static synchronized void method3362(int var0) {
      try {
         ++field5359;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "cw.b(" + ')');
      }
   }

   static synchronized void method3363(int var0) {
      try {
         --field5359;
         if (field5359 == 0) {
            method3361((byte)3);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "cw.p(" + ')');
      }
   }

   public static synchronized void method3364(boolean var0, int var1) {
      try {
         field5358 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cw.i(" + ')');
      }
   }

   class189() throws Throwable {
      throw new Error();
   }
}
