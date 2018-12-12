public class class615 extends class535 {
   public static int field8900 = 1;
   public static int field8901 = 0;
   static int field8902 = 2;
   public static class838 field8903;

   public class615(int var1, class838 var2) {
      super(var1, var2);
   }

   public void method5224(byte var1) {
      try {
         if (super.field3704.method5392((byte)-104) == class469.field7320) {
            super.field3708 = 2;
         }

         if (super.field3708 < 0 || super.field3708 > 2) {
            super.field3708 = this.method2272(1503163375);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ael.s(" + ')');
      }
   }

   int method2272(int var1) {
      return 1;
   }

   int method2273(int var1, int var2) {
      return 1;
   }

   void method2275(int var1, int var2) {
      try {
         super.field3708 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ael.p(" + ')');
      }
   }

   public class615(class838 var1) {
      super(var1);
   }

   public int method5225(byte var1) {
      try {
         return super.field3708;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ael.z(" + ')');
      }
   }
}
