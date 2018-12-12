public class class124 extends class304 {
   int field2405;
   int field2406;
   int field2407;
   int field2408;
   int field2409;
   int field2410;
   public static int field2411;
   public static int field2412;

   public void method2386() {
      class949.field3322[this.field2410 * 1062834473].method6636(1706684616).method2548(this.field2406 * 537594387, this.field2409 * -1750222503, -172156501 * this.field2407, this.field2405 * 376713895, Client.field2866 * 443738891, 0, -1529152547 * this.field2408, (byte)4);
   }

   public void method2383(int var1) {
      try {
         class949.field3322[this.field2410 * 1062834473].method6636(500322216).method2548(this.field2406 * 537594387, this.field2409 * -1750222503, -172156501 * this.field2407, this.field2405 * 376713895, Client.field2866 * 443738891, 0, -1529152547 * this.field2408, (byte)73);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xe.f(" + ')');
      }
   }

   public void method2385() {
      class949.field3322[this.field2410 * 1062834473].method6636(951667947).method2548(this.field2406 * 537594387, this.field2409 * -1750222503, -172156501 * this.field2407, this.field2405 * 376713895, Client.field2866 * 443738891, 0, -1529152547 * this.field2408, (byte)9);
   }

   class124(class907 var1) {
      super(var1);
      this.field2410 = var1.method6374() * -451568871;
      int var2 = var1.method6371();
      if ((var2 & 1) != 0) {
         this.field2406 = var1.method6374() * -1685041125;
         this.field2409 = var1.method6374() * -1587740951;
      } else {
         this.field2406 = 1685041125;
         this.field2409 = 1587740951;
      }

      if ((var2 & 2) != 0) {
         this.field2407 = var1.method6374() * -455796477;
         this.field2405 = var1.method6374() * 1360155927;
      } else {
         this.field2407 = 455796477;
         this.field2405 = -1360155927;
      }

      if ((var2 & 4) != 0) {
         int var3 = var1.method6374();
         int var4 = var1.method6374();
         int var5 = 255 * var3 / var4;
         if (var3 > 0 && var5 < 1) {
            var5 = 1;
         }

         this.field2408 = var5 * -592825227;
      } else {
         this.field2408 = 592825227;
      }

   }
}
