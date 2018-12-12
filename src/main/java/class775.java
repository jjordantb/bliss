public class class775 {
   int field3698;
   int field3699;
   static class137 field3700;
   boolean field3701;

   class775(int var1, int var2, boolean var3) {
      this.field3698 = var1;
      this.field3699 = var2;
      this.field3701 = var3;
   }

   public int method2266(int var1) {
      try {
         return this.field3699;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rh.f(" + ')');
      }
   }

   public boolean method2267(int var1) {
      try {
         return this.field3701;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rh.b(" + ')');
      }
   }

   public int method2268(int var1) {
      try {
         return this.field3698;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rh.a(" + ')');
      }
   }

   static final void method2269(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         if (var2.startsWith(class341.method255(0, -278777595)) || var2.startsWith(class341.method255(1, -278777595))) {
            var2 = var2.substring(7);
         }

         var0.field3161[++var0.field3156 - 1] = class923.method6260(var2, -1704738682) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rh.wo(" + ')');
      }
   }
}
