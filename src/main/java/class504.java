public class class504 extends class66 {
   byte[] field4025;

   void method2537(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.field4025[var3++] = (byte)(3 * var4 >> 5);
      this.field4025[var3] = (byte)(3 * var4 >> 5);
   }

   class504() {
      super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
   }

   void method1291(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.field4025[var3++] = (byte)(3 * var4 >> 5);
      this.field4025[var3] = (byte)(3 * var4 >> 5);
   }

   byte[] method2538(int var1, int var2, int var3) {
      this.field4025 = new byte[var1 * var2 * var3 * 2];
      this.method6493(var1, var2, var3);
      return this.field4025;
   }

   void method2539(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.field4025[var3++] = (byte)(3 * var4 >> 5);
      this.field4025[var3] = (byte)(3 * var4 >> 5);
   }

   void method2540(int var1, byte var2) {
      int var3 = var1 * 2;
      int var4 = var2 & 255;
      this.field4025[var3++] = (byte)(3 * var4 >> 5);
      this.field4025[var3] = (byte)(3 * var4 >> 5);
   }
}
