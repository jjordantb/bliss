public class class165 extends class106 {
   class120 field6924;
   int field6925;

   void method168(InputStream var1, int var2) {
      try {
         this.field6925 = var1.method6374();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agm.a(" + ')');
      }
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5793(this.field6925, (byte)-37);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agm.f(" + ')');
      }
   }

   class165(class120 var1) {
      this.field6924 = var1;
      this.field6925 = -1;
   }
}
