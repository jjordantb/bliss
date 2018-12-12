public abstract class class168 extends Interactable {
   int method2161(class639[] var1, int var2) {
      try {
         class32 var3 = this.method1511().field7637;
         return this.method2199((int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849, var1, 2132561832);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ajx.dg(" + ')');
      }
   }

   boolean method2167(int var1) {
      try {
         class32 var2 = this.method1511().field7637;
         return super.field3638.field3908[((int)var2.field5296 >> super.field3638.field3849) - super.field3638.field3898 + super.field3638.field3883][((int)var2.field5299 >> super.field3638.field3849) - super.field3638.field3858 + super.field3638.field3883];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ajx.dq(" + ')');
      }
   }

   boolean method2171(class848 var1, byte var2) {
      try {
         class32 var3 = this.method1511().field7637;
         class398 var4 = super.field3638.method2430(super.field3639, (int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849, -113950602);
         return var4 != null && var4.field6585.field8300 ? super.field3638.field3857.method1653(super.field3639, (int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849, var4.field6585.method2168(1951240662) + this.method2168(1951240662)) : super.field3638.field3857.method1651(super.field3639, (int)var3.field5296 >> super.field3638.field3849, (int)var3.field5299 >> super.field3638.field3849);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ajx.dl(" + ')');
      }
   }

   final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ajx.bk(" + ')');
      }
   }

   class168(class545 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1);
      super.field3639 = (byte)var5;
      super.field3640 = (byte)var6;
      this.method1514(new class32((float)var2, (float)var3, (float)var4));
   }
}
