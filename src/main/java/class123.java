public class class123 {
   public int field2433;
   public int field2434;
   public int field2435;

   void method1632(InputStream var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            this.field2434 = var1.method6374();
            this.field2435 = var1.method6371();
            this.field2433 = var1.method6371();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ry.f(" + ')');
      }
   }

   void method1633(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 > 1941304655) {
                  ;
               }

               return;
            }

            this.method1632(var1, var3, 33985);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ry.a(" + ')');
      }
   }

   static boolean method1634(int var0) {
      try {
         return class447.method4319(class422.field9604.field2972, 1089632340);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ry.b(" + ')');
      }
   }

   static final void method1635(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class237 var3;
         if (var0.field3178) {
            var3 = var0.field3164;
         } else {
            var3 = var0.field3163;
         }

         var0.field3161[++var0.field3156 - 1] = var3.method4649(var2, -1, -574024132) ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ry.bz(" + ')');
      }
   }
}
