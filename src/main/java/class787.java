public class class787 extends class347 {
   int field3911;
   static int field3912 = 4096;

   public class787() {
      this(4096);
   }

   class787(int var1) {
      super(0, true);
      this.field3911 = 4096;
      this.field3911 = var1;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 1924979282);
         if (super.field270.field6612) {
            class901.method6354(var3, 0, class322.field831, this.field3911);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ahp.i(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field3911 = (var2.method6371() << 12) / 255;
         default:
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahp.r(" + ')');
      }
   }
}
