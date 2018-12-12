public class class620 extends class535 {
   public static int field8928 = 2;
   public static int field8929 = 1;
   public static int field8930 = 0;

   public class620(int var1, class838 var2) {
      super(var1, var2);
   }

   public void method5266(int var1) {
      try {
         if (super.field3704.field9114.method5154((byte)108) == 2 && super.field3708 == 2) {
            super.field3708 = 1;
         }

         if (super.field3708 < 0 || super.field3708 > 2) {
            super.field3708 = this.method2272(-1426202830);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adw.s(" + ')');
      }
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adw.p(" + ')');
      }
   }

   public int method5267(int var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adw.z(" + ')');
      }
   }

   int method2272(int var1) {
      return 2;
   }

   public class620(class838 var1) {
      super(var1);
   }

   int method2273(int var1, int var2) {
      return 1;
   }

   static final void method5268(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         var0.field3173 = new class140(var2, true);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adw.ago(" + ')');
      }
   }
}
