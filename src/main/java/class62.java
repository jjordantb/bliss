public class class62 extends class697 {
   byte field1664;
   String field1665;
   int field1666 = -1;
   int field1667;
   class76 field1668;

   void method3820(InputStream var1, int var2) {
      try {
         this.field1666 = var1.method6374();
         this.field1664 = var1.method6372(-12558881);
         this.field1667 = var1.method6374();
         var1.method6375((short)17752);
         this.field1665 = var1.method6379(1791520586);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agj.a(" + ')');
      }
   }

   void method3821(class139 var1, int var2) {
      try {
         class78 var3 = var1.field1165[this.field1666];
         var3.field1499 = this.field1664;
         var3.field1498 = this.field1667;
         var3.field1497 = this.field1665;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agj.f(" + ')');
      }
   }

   class62(class76 var1) {
   }
}
