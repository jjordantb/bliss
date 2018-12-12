public class class37 extends class347 {
   static int field5349 = 3072;
   static boolean field5350 = false;
   int field5351 = 1024;
   static int field5352 = 1024;
   int field5353 = -1098228736;
   int field5354 = 2048;

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 2037025007);
         if (super.field270.field6612) {
            int[] var4 = this.method201(0, var1, -1887337990);

            for(int var5 = 0; var5 < class322.field831; ++var5) {
               var3[var5] = this.field5351 + (var4[var5] * this.field5354 >> 12);
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ahd.i(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)22);
         if (super.field266.field211) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];

            for(int var11 = 0; var11 < class322.field831; ++var11) {
               var8[var11] = (var5[var11] * this.field5354 >> 12) + this.field5351;
               var9[var11] = this.field5351 + (this.field5354 * var6[var11] >> 12);
               var10[var11] = this.field5351 + (var7[var11] * this.field5354 >> 12);
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "ahd.k(" + ')');
      }
   }

   void method205(int var1) {
      try {
         this.field5354 = this.field5353 * 836630389 - this.field5351;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahd.x(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field5351 = var2.method6374();
            break;
         case 1:
            this.field5353 = var2.method6374() * -284172067;
            break;
         case 2:
            super.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahd.r(" + ')');
      }
   }

   public class37() {
      super(1, false);
   }
}
