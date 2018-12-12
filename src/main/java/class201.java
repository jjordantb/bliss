public class class201 extends class106 {
   long field7716;
   int field7717;
   String field7718;
   class120 field7719;

   class201(class120 var1) {
      this.field7719 = var1;
      this.field7716 = -1L;
      this.field7718 = null;
      this.field7717 = 0;
   }

   void method168(InputStream var1, int var2) {
      try {
         if (var1.method6371() != 255) {
            --var1.field10376;
            this.field7716 = var1.method6375((short)27016);
         }

         this.field7718 = var1.method6429(-517364695);
         this.field7717 = var1.method6374();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agf.a(" + ')');
      }
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5782(this.field7716, this.field7718, this.field7717, -783761378);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agf.f(" + ')');
      }
   }
}
