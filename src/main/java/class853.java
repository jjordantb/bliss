public class class853 extends class106 {
   int field8829;
   int field8830;
   int field8831;
   int field8832 = -1;
   class120 field8833;

   void method168(InputStream var1, int var2) {
      try {
         this.field8832 = var1.method6374();
         this.field8830 = var1.method6420((byte)-51);
         this.field8829 = var1.method6371();
         this.field8831 = var1.method6371();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agp.a(" + ')');
      }
   }

   void method170(class420 var1, byte var2) {
      try {
         var1.method5792(this.field8832, this.field8830, this.field8829, this.field8831, 1468096534);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agp.f(" + ')');
      }
   }

   class853(class120 var1) {
   }

   static final void method5158(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         boolean var3 = 1 == var0.field3161[var0.field3156 + 1];
         class615.field8903.method5391(class615.field8903.field9136, var2, -1223609921);
         if (!var3) {
            class615.field8903.method5391(class615.field8903.field9142, 0, 335720109);
         }

         class95.method523(656179282);
         class730.field2647 = false;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "agp.aiz(" + ')');
      }
   }
}
