public class class773 extends class535 {
   public static int field3738 = 1;
   public static int field3739 = 0;

   public class773(int var1, class838 var2) {
      super(var1, var2);
   }

   public class773(class838 var1) {
      super(var1);
   }

   int method2273(int var1, int var2) {
      return 1;
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aep.p(" + ')');
      }
   }

   public int method2311(byte var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aep.z(" + ')');
      }
   }

   int method2272(int var1) {
      return 0;
   }

   public void method2312(byte var1) {
      try {
         if (1 != super.field3708 && super.field3708 != 0) {
            super.field3708 = this.method2272(181111129);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aep.s(" + ')');
      }
   }

   static final void method2313(class564 var0, class744 var1, int var2) {
      try {
         if (var1.field3171 >= 10) {
            throw new RuntimeException();
         } else {
            if (var0.field889 != null) {
               class202 var3 = new class202();
               var3.field7578 = var0;
               var3.field7583 = var0.field889;
               var3.field7577 = var1.field3171 + 1;
               class730.field2875.method897(var3, -201281014);
            }

         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aep.qv(" + ')');
      }
   }
}
