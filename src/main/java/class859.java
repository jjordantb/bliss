public class class859 extends class304 {
   int field8844;
   int field8845;
   int field8846;
   int field8847;
   int field8848;
   static int field8849;

   class859(InputStream var1) {
      super(var1);
      this.field8844 = var1.method6374();
      this.field8845 = var1.method6374();
      this.field8846 = var1.method6374();
      this.field8847 = var1.method6374();
      this.field8848 = var1.method6374();
   }

   public void method2383(int var1) {
      try {
         class700.method6329(this.field8844, this.field8846, this.field8845, 100, 100, false);
         class198.method3752(this.field8847, this.field8848, 0, -1646774896);
         class730.field2706 = true;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xc.f(" + ')');
      }
   }

   public static int method5179(int var0, int var1, boolean var2, int var3) {
      try {
         class163 var4 = class213.method3812(var0, var2, -147362451);
         if (var4 == null) {
            return 0;
         } else {
            return var1 >= 0 && var1 < var4.field6620.length ? var4.field6620[var1] : 0;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "xc.f(" + ')');
      }
   }
}
