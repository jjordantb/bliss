public class class144 extends class347 {
   static boolean field1534 = true;
   static boolean field1535 = true;
   static boolean field1536 = false;
   boolean field1537 = true;
   boolean field1538 = true;

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 1850560302);
         if (super.field270.field6612) {
            int[] var4 = this.method201(0, this.field1538 ? class322.field834 - var1 : var1, -1887337990);
            if (this.field1537) {
               for(int var5 = 0; var5 < class322.field831; ++var5) {
                  var3[var5] = var4[class322.field829 - var5];
               }
            } else {
               class901.method6355(var4, 0, var3, 0, class322.field831);
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "agw.i(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field1537 = var2.method6371() == 1;
            break;
         case 1:
            this.field1538 = var2.method6371() == 1;
            break;
         case 2:
            super.field268 = var2.method6371() == 1;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agw.r(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)91);
         if (super.field266.field211) {
            int[][] var4 = this.method206(0, this.field1538 ? class322.field834 - var1 : var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int var11;
            if (this.field1537) {
               for(var11 = 0; var11 < class322.field831; ++var11) {
                  var8[var11] = var5[class322.field829 - var11];
                  var9[var11] = var6[class322.field829 - var11];
                  var10[var11] = var7[class322.field829 - var11];
               }
            } else {
               for(var11 = 0; var11 < class322.field831; ++var11) {
                  var8[var11] = var5[var11];
                  var9[var11] = var6[var11];
                  var10[var11] = var7[var11];
               }
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "agw.k(" + ')');
      }
   }

   public class144() {
      super(1, false);
   }
}
