public class class218 extends class43 {
   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)33);
         if (super.field266.field211 && this.method3062(372008576)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = super.field5092 * (var1 % super.field5092);

            for(int var8 = 0; var8 < class322.field831; ++var8) {
               int var9 = super.field5093[var8 % super.field5091 + var7];
               var6[var8] = (var9 & 255) << 4;
               var5[var8] = (var9 & '\uff00') >> 4;
               var4[var8] = (var9 & 16711680) >> 12;
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "akg.k(" + ')');
      }
   }
}
