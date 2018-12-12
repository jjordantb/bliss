public class class124 extends class304 {
   int field2405;
   int field2406;
   int field2407;
   int field2408;
   int field2409;
   int field2410;
   public static int field2411;
   public static int field2412;

   public void method2383(int var1) {
      try {
         class949.field3322[this.field2410].method6636(500322216).method2548(this.field2406, this.field2409, this.field2407, this.field2405, class730.field2866, 0, this.field2408, (byte)73);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xe.f(" + ')');
      }
   }

   class124(InputStream var1) {
      super(var1);
      this.field2410 = var1.method6374();
      int var2 = var1.method6371();
      if ((var2 & 1) != 0) {
         this.field2406 = var1.method6374();
         this.field2409 = var1.method6374();
      } else {
         this.field2406 = -1;
         this.field2409 = -1;
      }

      if ((var2 & 2) != 0) {
         this.field2407 = var1.method6374();
         this.field2405 = var1.method6374();
      } else {
         this.field2407 = -1;
         this.field2405 = -1;
      }

      if ((var2 & 4) != 0) {
         int var3 = var1.method6374();
         int var4 = var1.method6374();
         int var5 = 255 * var3 / var4;
         if (var3 > 0 && var5 < 1) {
            var5 = 1;
         }

         this.field2408 = var5;
      } else {
         this.field2408 = -1;
      }

   }
}
