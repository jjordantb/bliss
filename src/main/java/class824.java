public abstract class class824 extends Interactable {
   public short field9059;

   int method2161(class639[] var1, int var2) {
      try {
         class32 var3 = this.method1511().field7637;
         return this.method2199((int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849, var1, 2146815027);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajh.dg(" + ')');
      }
   }

   boolean method2171(class848 var1, byte var2) {
      try {
         class32 var3 = this.method1511().field7637;
         return super.field3638.field3857.method1651(super.field3640, (int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajh.dl(" + ')');
      }
   }

   boolean method2167(int var1) {
      try {
         class32 var2 = this.method1511().field7637;
         return super.field3638.field3908[((int)var2.field5296 >> super.field3638.field3849) - super.field3638.field3898 + super.field3638.field3883][super.field3638.field3883 + (((int)var2.field5299 >> super.field3638.field3849) - super.field3638.field3858)];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajh.dq(" + ')');
      }
   }

   class824(class545 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1);
      super.field3639 = (byte)var5;
      super.field3640 = (byte)var6;
      this.field9059 = (short)var7;
      this.method1514(new class32((float)var2, (float)var3, (float)var4));
   }
}
