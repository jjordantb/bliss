public class class501 {
   byte[] field3180;
   int field3181;
   public static class727 field3182;

   class501(byte[] var1) {
      this.field3180 = var1;
      this.field3181 = 0;
   }

   String method1905(int var1) {
      try {
         int var2 = this.method1906(1088012278);
         if (var2 == -1) {
            return null;
         } else if (var2 > 256) {
            throw new class947();
         } else {
            String var3 = new String(this.field3180, this.field3181, var2);
            this.field3181 += var2;
            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ec.f(" + ')');
      }
   }

   int method1906(int var1) {
      try {
         short var2 = 0;

         for(int var3 = 0; var3 < 2; ++var3) {
            var2 = (short)(var2 | (this.field3180[++this.field3181 - 1] & 255) << var3 * 8);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ec.a(" + ')');
      }
   }

   static final void method1907(class744 var0, byte var1) {
      try {
         class662.field9726.method5799(-1969463170);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ec.afe(" + ')');
      }
   }
}
