public class class326 extends class106 {
   int field635;
   int field636;
   class120 field637;
   int field638;
   int field639;

   void method171(class420 var1) {
      var1.method5787(-1639581401 * this.field639, -668866515 * this.field638, -730458547 * this.field636, -1837171777 * this.field635, 183101291);
   }

   void method168(class907 var1, int var2) {
      try {
         this.field639 = var1.method6420((byte)-10) * 1958209175;
         this.field638 = var1.method6420((byte)-38) * 7382949;
         this.field636 = var1.method6371() * -1712778619;
         this.field635 = var1.method6371() * 548598847;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agv.a(" + ')');
      }
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5787(-1639581401 * this.field639, -668866515 * this.field638, -730458547 * this.field636, -1837171777 * this.field635, 183101291);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agv.f(" + ')');
      }
   }

   class326(class120 var1) {
      this.field637 = var1;
   }

   void method172(class907 var1) {
      this.field639 = var1.method6420((byte)51) * 1958209175;
      this.field638 = var1.method6420((byte)12) * 7382949;
      this.field636 = var1.method6371() * -1712778619;
      this.field635 = var1.method6371() * 548598847;
   }

   void method169(class907 var1) {
      this.field639 = var1.method6420((byte)68) * 1958209175;
      this.field638 = var1.method6420((byte)-25) * 7382949;
      this.field636 = var1.method6371() * -1712778619;
      this.field635 = var1.method6371() * 548598847;
   }

   static final int method544(int var0, int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 65536 - class703.field3404[8192 * var2 / var3] >> 1;
         return (var5 * var1 >> 16) + ((65536 - var5) * var0 >> 16);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "agv.j(" + ')');
      }
   }
}
