public class class712 extends class347 {
   public class712() {
      super(1, true);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 233651340);
         if (super.field270.field6612) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];

            for(int var8 = 0; var8 < class322.field831; ++var8) {
               var3[var8] = (var7[var8] + var6[var8] + var5[var8]) / 3;
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "agt.i(" + ')');
      }
   }
}
