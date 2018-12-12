public class class97 extends class106 {
   byte field612;
   class120 field613;
   public static int field614;
   int field615;

   void method169(class907 var1) {
      this.field615 = var1.method6374() * 203579807;
      this.field612 = var1.method6372(-12558881);
   }

   void method168(class907 var1, int var2) {
      try {
         this.field615 = var1.method6374() * 203579807;
         this.field612 = var1.method6372(-12558881);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ago.a(" + ')');
      }
   }

   class97(class120 var1) {
      this.field613 = var1;
      this.field615 = -203579807;
   }

   void method171(class420 var1) {
      var1.method5794(1481144927 * this.field615, this.field612, (byte)-65);
   }

   void method172(class907 var1) {
      this.field615 = var1.method6374() * 203579807;
      this.field612 = var1.method6372(-12558881);
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5794(1481144927 * this.field615, this.field612, (byte)-101);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ago.f(" + ')');
      }
   }
}
