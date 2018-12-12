public class class485 extends class138 {
   static int field8510 = 3;
   int field8511;
   int field8512;
   int field8513;
   int field8514;

   void method985(int var1, int var2, byte var3) {
      try {
         int var4 = var1 * this.field8511 >> 12;
         int var5 = var1 * this.field8513 >> 12;
         int var6 = this.field8512 * var2 >> 12;
         int var7 = var2 * this.field8514 >> 12;
         class227.method4014(var4, var6, var5, var7, super.field1170, super.field1169, super.field1168, -566735652);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ye.b(" + ')');
      }
   }

   void method991(int var1, int var2, byte var3) {
   }

   void method984(int var1, int var2, byte var3) {
      try {
         int var4 = var1 * this.field8511 >> 12;
         int var5 = var1 * this.field8513 >> 12;
         int var6 = var2 * this.field8512 >> 12;
         int var7 = this.field8514 * var2 >> 12;
         class551.method434(var4, var6, var5, var7, super.field1170, 811666091);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ye.f(" + ')');
      }
   }

   class485(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5, var6, var7);
      this.field8511 = var1;
      this.field8512 = var2;
      this.field8513 = var3;
      this.field8514 = var4;
   }

   static final void method4765(class744 var0, byte var1) {
      try {
         var0.field3165[var0.field3174[var0.field3176]] = var0.field3161[--var0.field3156];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ye.as(" + ')');
      }
   }
}
