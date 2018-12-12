public class class633 extends class347 {
   int field9791 = 0;
   static int field9792 = 0;
   static int field9793 = 0;
   static int field9794 = 2;
   static int field9795 = 0;
   static int field9796 = 1;
   static int field9797 = 0;
   int field9798 = 0;
   int field9799 = 1;

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field9791 = var2.method6371();
            break;
         case 1:
            this.field9798 = var2.method6371();
         case 2:
         default:
            break;
         case 3:
            this.field9799 = var2.method6371();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahg.r(" + ')');
      }
   }

   void method205(int var1) {
      try {
         class322.method814((byte)40);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahg.x(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, -59827140);
         if (super.field270.field6612) {
            int var4 = class322.field836[var1];
            int var5 = var4 - 2048 >> 1;

            for(int var6 = 0; var6 < class322.field831; ++var6) {
               int var7 = class322.field838[var6];
               int var8 = var7 - 2048 >> 1;
               int var9;
               if (this.field9791 == 0) {
                  var9 = (var7 - var4) * this.field9799;
               } else {
                  int var10 = var5 * var5 + var8 * var8 >> 12;
                  var9 = (int)(Math.sqrt((double)((float)var10 / 4096.0F)) * 4096.0D);
                  var9 = (int)((double)(var9 * this.field9799) * 3.141592653589793D);
               }

               var9 -= var9 & -4096;
               if (this.field9798 == 0) {
                  var9 = class322.field837[var9 >> 4 & 255] + 4096 >> 1;
               } else if (this.field9798 == 2) {
                  var9 -= 2048;
                  if (var9 < 0) {
                     var9 = -var9;
                  }

                  var9 = 2048 - var9 << 1;
               }

               var3[var6] = var9;
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "ahg.i(" + ')');
      }
   }

   public class633() {
      super(0, true);
   }
}
