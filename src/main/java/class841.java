public class class841 extends class256 {
   int field9192;

   public boolean method5450() {
      class437 var1 = (class437)class730.field2677.method2942((long)(119655585 * this.field9192));
      if (var1 != null) {
         class625.method5828(class112.field2123, -1617025021 * this.field8101, -1, (class746)var1.field7515, this.field9192 * 119655585, (byte)-46);
         return true;
      } else {
         return false;
      }
   }

   public class841(int var1, int var2, int var3) {
      super(var1, var2);
      this.field9192 = var3 * -378595487;
   }

   public boolean method4487(int var1) {
      try {
         class437 var2 = (class437)class730.field2677.method2942((long)(119655585 * this.field9192));
         if (var2 != null) {
            class625.method5828(class112.field2123, -1617025021 * this.field8101, -1, (class746)var2.field7515, this.field9192 * 119655585, (byte)-1);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajj.a(" + ')');
      }
   }
}
