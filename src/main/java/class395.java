public class class395 extends class106 {
   int field5407;
   int field5408;
   class120 field5409;

   void method168(InputStream var1, int var2) {
      try {
         this.field5408 = var1.method6420((byte)-19);
         this.field5407 = var1.method6420((byte)80);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agz.a(" + ')');
      }
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5786(this.field5408, this.field5407, (byte)26);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agz.f(" + ')');
      }
   }

   class395(class120 var1) {
      this.field5409 = var1;
   }

   public static class506 method3397(int var0, int var1) {
      try {
         return var0 >= 0 && var0 < 100 ? class503.field4100[var0] : null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agz.k(" + ')');
      }
   }

   static void method3398(class135 var0, class344 var1, int var2, int var3, int var4) {
      try {
         if (class602.field8660 == null) {
            class602.field8660 = new class344(var1);
         } else {
            class602.field8660.method269(var1);
         }

         class602.field8662.method1024(var0);
         class602.field8658 = var2;
         class602.field8659 = var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "agz.aw(" + ')');
      }
   }
}
