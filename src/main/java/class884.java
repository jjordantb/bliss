public class class884 extends class256 {
   int field10085;

   public boolean method4487(int var1) {
      try {
         Player var2 = class730.loaded[this.field10085];
         if (var2 != null) {
            class625.method5828(class112.field2114, super.field8101, -1, var2, this.field10085, (byte)-83);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aje.a(" + ')');
      }
   }

   public class884(int var1, int var2, int var3) {
      super(var1, var2);
      this.field10085 = var3;
   }
}
