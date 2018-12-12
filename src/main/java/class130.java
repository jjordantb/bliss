public class class130 extends class347 {
   static int field1112 = 204;
   static int field1113 = 1;
   static int field1114 = 1;
   int field1115 = 204;
   int field1116 = 1;
   int field1117 = 1;
   static int field1118 = 4;

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 1561345125);
         if (super.field270.field6612) {
            for(int var4 = 0; var4 < class322.field831; ++var4) {
               int var5 = class322.field838[var4];
               int var6 = class322.field836[var1];
               int var7 = this.field1116 * var5 >> 12;
               int var8 = this.field1117 * var6 >> 12;
               int var9 = this.field1116 * (var5 % (4096 / this.field1116));
               int var10 = var6 % (4096 / this.field1117) * this.field1117;
               if (var10 < this.field1115) {
                  for(var7 -= var8; var7 < 0; var7 += 4) {
                     ;
                  }

                  while(var7 > 3) {
                     var7 -= 4;
                  }

                  if (var7 != 1) {
                     var3[var4] = 0;
                     continue;
                  }

                  if (var9 < this.field1115) {
                     var3[var4] = 0;
                     continue;
                  }
               }

               if (var9 < this.field1115) {
                  for(var7 -= var8; var7 < 0; var7 += 4) {
                     ;
                  }

                  while(var7 > 3) {
                     var7 -= 4;
                  }

                  if (var7 > 0) {
                     var3[var4] = 0;
                     continue;
                  }
               }

               var3[var4] = 4096;
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "ahi.i(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field1116 = var2.method6371();
            break;
         case 1:
            this.field1117 = var2.method6371();
            break;
         case 2:
            this.field1115 = var2.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahi.r(" + ')');
      }
   }

   public class130() {
      super(0, true);
   }

   public static void method927(int var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         class529.method2216(0, class601.field9199.length - 1, var0, var1, var2, var3, (byte)-46);
         class601.field9195 = 0;
         class601.field9202 = null;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ahi.u(" + ')');
      }
   }
}
