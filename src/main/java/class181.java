public class class181 extends class347 {
   int field5320 = 0;
   static int field5321 = 1;
   static int field5322 = 2;
   static int field5323 = 3;
   int field5324 = 10;
   int field5325 = 2048;
   static int field5326 = 0;
   int[] field5327;
   int[] field5328;

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field5324 = var2.method6371();
            break;
         case 1:
            this.field5325 = var2.method6374();
            break;
         case 2:
            this.field5320 = var2.method6371();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aio.r(" + ')');
      }
   }

   void method3310(int var1) {
      try {
         int var2 = 0;
         this.field5327 = new int[1 + this.field5324];
         this.field5328 = new int[this.field5324 + 1];
         int var3 = 4096 / this.field5324;
         int var4 = this.field5325 * var3 >> 12;

         for(int var5 = 0; var5 < this.field5324; ++var5) {
            this.field5328[var5] = var2;
            this.field5327[var5] = var4 + var2;
            var2 += var3;
         }

         this.field5328[this.field5324] = 4096;
         this.field5327[this.field5324] = this.field5327[0] + 4096;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aio.ac(" + ')');
      }
   }

   void method205(int var1) {
      try {
         this.method3310(-1688804109);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aio.x(" + ')');
      }
   }

   public class181() {
      super(0, true);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 1878219643);
         if (super.field270.field6612) {
            int var4 = class322.field836[var1];
            int var6;
            if (this.field5320 != 0) {
               for(int var5 = 0; var5 < class322.field831; ++var5) {
                  var6 = 0;
                  short var7 = 0;
                  int var8 = class322.field838[var5];
                  switch(this.field5320) {
                  case 1:
                     var6 = var8;
                     break;
                  case 2:
                     var6 = (var8 - (4096 - var4) >> 1) + 2048;
                     break;
                  case 3:
                     var6 = (var8 - var4 >> 1) + 2048;
                  }

                  for(int var9 = 0; var9 < this.field5324; ++var9) {
                     if (var6 >= this.field5328[var9] && var6 < this.field5328[1 + var9]) {
                        if (var6 < this.field5327[var9]) {
                           var7 = 4096;
                        }
                        break;
                     }
                  }

                  var3[var5] = var7;
               }
            } else {
               short var11 = 0;

               for(var6 = 0; var6 < this.field5324; ++var6) {
                  if (var4 >= this.field5328[var6] && var4 < this.field5328[1 + var6]) {
                     if (var4 < this.field5327[var6]) {
                        var11 = 4096;
                     }
                     break;
                  }
               }

               class901.method6354(var3, 0, class322.field831, var11);
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aio.i(" + ')');
      }
   }
}
