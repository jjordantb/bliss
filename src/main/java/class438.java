public class class438 extends class268 {
   byte[] field7514;

   byte[] method4263(int var1, int var2, int var3) {
      this.field7514 = new byte[var1 * var2 * var3 * 2];
      this.method6493(var1, var2, var3);
      return this.field7514;
   }

   void method4546(int var1, byte var2) {
      int var3 = var1 * 2;
      var2 = (byte)(127 + ((var2 & 255) >> 1));
      this.field7514[var3++] = var2;
      this.field7514[var3] = var2;
   }

   class438() {
      super(12, 5, 16, 2, 2, 0.45F);
   }
}
