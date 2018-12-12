public class class582 extends class347 {
   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1728864266);
         if (this.field270.field6612) {
            int var4 = class322.field836[var1];

            for(int var5 = 0; var5 < class322.field831 * -1474554145; ++var5) {
               var3[var5] = this.method141(class322.field838[var5], var4, (byte)-64) % 4096;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ahb.i(" + ')');
      }
   }

   int[] method140(int var1) {
      int[] var2 = this.field270.method3546(var1, 521968543);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            var2[var4] = this.method141(class322.field838[var4], var3, (byte)4) % 4096;
         }
      }

      return var2;
   }

   int method141(int var1, int var2, byte var3) {
      try {
         int var4 = var1 + 57 * var2;
         var4 ^= var4 << 1;
         return 4096 - (1376312589 + (789221 + var4 * var4 * 15731) * var4 & Integer.MAX_VALUE) / 262144;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahb.ac(" + ')');
      }
   }

   int[] method142(int var1) {
      int[] var2 = this.field270.method3546(var1, 881374072);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];

         for(int var4 = 0; var4 < class322.field831 * -1474554145; ++var4) {
            var2[var4] = this.method141(class322.field838[var4], var3, (byte)-53) % 4096;
         }
      }

      return var2;
   }

   public class582() {
      super(0, true);
   }
}
