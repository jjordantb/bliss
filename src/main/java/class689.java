public class class689 extends class568 {
   boolean field7627;
   int field7628;
   int field7629;
   class957 field7630;
   boolean field7631;
   boolean field7632;
   boolean field7633;

   class689(int var1, class957 var2, int var3, boolean var4) {
      this.field7628 = var1;
      this.field7630 = var2;
      this.field7629 = var3;
      this.field7627 = var4;
   }

   static final void method4321(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)49);
         class131 var4 = class382.field1410[var2 >> 16];
         class321.method857(var3, var4, var0, (byte)-38);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "acq.it(" + ')');
      }
   }
}
