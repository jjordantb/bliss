public class class433 extends class697 {
   int field7434;
   byte field7435;
   String field7436 = null;

   class433(class76 var1) {
   }

   void method3821(class139 var1, int var2) {
      try {
         class78 var3 = new class78();
         var3.field1497 = this.field7436;
         var3.field1498 = this.field7434;
         var3.field1499 = this.field7435;
         var1.method975(var3, 1028626118);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agh.f(" + ')');
      }
   }

   void method3820(InputStream var1, int var2) {
      try {
         if (var1.method6371() != 255) {
            --var1.field10376;
            var1.method6375((short)7794);
         }

         this.field7436 = var1.method6429(-517364695);
         this.field7434 = var1.method6374();
         this.field7435 = var1.method6372(-12558881);
         var1.method6375((short)8524);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agh.a(" + ')');
      }
   }
}
