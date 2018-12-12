public class class268 extends class293 {
   byte[] field8184;
   int field8185;
   int field8186;
   int[] field8187;

   void method6494() {
      this.field8185 = 0;
      this.field8186 = 0;
   }

   void method6496(int var1, int var2) {
      this.field8186 += var2 * this.field8187[var1] >> 12;
   }

   void method4546(int var1, byte var2) {
      this.field8184[this.field8185++] = (byte)(127 + ((var2 & 255) >> 1));
   }

   class268(int var1, int var2, int var3, int var4, int var5, float var6) {
      super(var1, var2, var3, var4, var5);
      this.field8187 = new int[super.field10446];

      for(int var7 = 0; var7 < super.field10446; ++var7) {
         this.field8187[var7] = (short)((int)(Math.pow((double)var6, (double)var7) * 4096.0D));
      }

   }

   void method6505() {
      this.field8186 = Math.abs(this.field8186);
      if (this.field8186 >= 4096) {
         this.field8186 = 4095;
      }

      this.method4546(this.field8185++, (byte)(this.field8186 >> 4));
      this.field8186 = 0;
   }
}
