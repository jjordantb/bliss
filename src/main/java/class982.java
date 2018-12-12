public class class982 extends class347 {
   int field3215 = 4096;
   static int field3216 = 4096;

   void method209(int var1, InputStream var2, byte var3) {
      try {
         if (var1 == 0) {
            this.field3215 = var2.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agb.r(" + ')');
      }
   }

   public class982() {
      super(1, true);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 377633232);
         if (super.field270.field6612) {
            int[] var4 = this.method201(0, var1 - 1 & class322.field834, -1887337990);
            int[] var5 = this.method201(0, var1, -1887337990);
            int[] var6 = this.method201(0, var1 + 1 & class322.field834, -1887337990);

            for(int var7 = 0; var7 < class322.field831; ++var7) {
               int var8 = this.field3215 * (var6[var7] - var4[var7]);
               int var9 = this.field3215 * (var5[var7 + 1 & class322.field829] - var5[var7 - 1 & class322.field829]);
               int var10 = var9 >> 12;
               int var11 = var8 >> 12;
               int var12 = var10 * var10 >> 12;
               int var13 = var11 * var11 >> 12;
               int var14 = (int)(Math.sqrt((double)((float)(var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
               int var15 = var14 != 0 ? 16777216 / var14 : 0;
               var3[var7] = 4096 - var15;
            }
         }

         return var3;
      } catch (RuntimeException var16) {
         throw class158.method3445(var16, "agb.i(" + ')');
      }
   }
}
