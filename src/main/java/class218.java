public class class218 extends class43 {
   int[][] method3064(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)53);
      if (this.field266.field211 && this.method3062(1713215539)) {
         int[] var3 = var2[0];
         int[] var4 = var2[1];
         int[] var5 = var2[2];
         int var6 = this.field5092 * -2125962517 * (var1 % (-2125962517 * this.field5092));

         for(int var7 = 0; var7 < class322.field831 * -1474554145; ++var7) {
            int var8 = this.field5093[var7 % (1274885639 * this.field5091) + var6];
            var5[var7] = (var8 & 255) << 4;
            var4[var7] = (var8 & '\uff00') >> 4;
            var3[var7] = (var8 & 16711680) >> 12;
         }
      }

      return var2;
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = this.field266.method162(var1, (byte)33);
         if (this.field266.field211 && this.method3062(372008576)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field5092 * -2125962517 * (var1 % (-2125962517 * this.field5092));

            for(int var8 = 0; var8 < class322.field831 * -1474554145; ++var8) {
               int var9 = this.field5093[var8 % (1274885639 * this.field5091) + var7];
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

   int[][] method3065(int var1) {
      int[][] var2 = this.field266.method162(var1, (byte)74);
      if (this.field266.field211 && this.method3062(-1769350678)) {
         int[] var3 = var2[0];
         int[] var4 = var2[1];
         int[] var5 = var2[2];
         int var6 = this.field5092 * -2125962517 * (var1 % (-2125962517 * this.field5092));

         for(int var7 = 0; var7 < class322.field831 * -1474554145; ++var7) {
            int var8 = this.field5093[var7 % (1274885639 * this.field5091) + var6];
            var5[var7] = (var8 & 255) << 4;
            var4[var7] = (var8 & '\uff00') >> 4;
            var3[var7] = (var8 & 16711680) >> 12;
         }
      }

      return var2;
   }
}
