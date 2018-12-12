public class class462 extends class304 {
   class811 field7358;
   int field7359;
   int field7360;
   protected static class581 field7361;

   class462(class907 var1) {
      super(var1);
      this.field7360 = var1.method6374() * 192120791;
      this.field7359 = var1.method6371() * -1335683137;
   }

   public void method2386() {
      class115.method1272(this.field7358, -915613633 * this.field7359, (byte)-39);
   }

   boolean method2387(int var1) {
      try {
         if (this.field7358 == null) {
            this.field7358 = new class811(class771.field3732, this.field7360 * -949920793);
         }

         return this.field7358.method2921((byte)1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yv.p(" + ')');
      }
   }

   public void method2385() {
      class115.method1272(this.field7358, -915613633 * this.field7359, (byte)16);
   }

   boolean method4048() {
      if (this.field7358 == null) {
         this.field7358 = new class811(class771.field3732, this.field7360 * -949920793);
      }

      return this.field7358.method2921((byte)1);
   }

   public void method2383(int var1) {
      try {
         class115.method1272(this.field7358, -915613633 * this.field7359, (byte)-9);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yv.f(" + ')');
      }
   }
}
