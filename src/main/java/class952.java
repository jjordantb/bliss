public class class952 extends class806 {
   class955 field3457;
   class850 field3458 = null;
   int field3459 = 0;
   class294 field3460 = null;
   int field3461 = 0;

   public int method2481() {
      return this.field3459;
   }

   public int method2493() {
      return this.field3461;
   }

   public void method2839(int var1, class813 var2) {
      if (var1 != 0) {
         throw new RuntimeException();
      } else if (this.field3460 != null && var2 != null && (this.field3460.method2343() != var2.method2343() || this.field3460.method2344() != var2.method2344())) {
         throw new RuntimeException();
      } else {
         this.field3458 = (class850)var2;
         if (var2 != null) {
            this.field3459 = var2.method2343();
            this.field3461 = var2.method2344();
         } else if (this.field3460 == null) {
            this.field3459 = 0;
            this.field3461 = 0;
         }

         if (this.field3457.method4800((short)-18431) == this) {
            this.method2484();
         }

      }
   }

   public void method2834(class893 var1) {
      if (this.field3458 != null && var1 != null && (this.field3458.method2343() != var1.method2343() || this.field3458.method2344() != var1.method2344())) {
         throw new RuntimeException();
      } else {
         this.field3460 = (class294)var1;
         if (var1 != null) {
            this.field3459 = var1.method2343();
            this.field3461 = var1.method2344();
         } else if (this.field3458 == null) {
            this.field3459 = 0;
            this.field3461 = 0;
         }

         if (this.field3457.method4800((short)-4610) == this) {
            this.method2484();
         }

      }
   }

   boolean method2482() {
      return true;
   }

   public void method2488() {
   }

   boolean method2484() {
      this.field3457.d(this.field3458 == null ? 0L : this.field3458.field8840, this.field3460 == null ? 0L : this.field3460.field10434);
      return true;
   }

   class952(class955 var1) {
      this.field3457 = var1;
   }

   public boolean method2836() {
      return true;
   }
}
