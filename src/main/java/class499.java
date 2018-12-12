import java.util.Random;

public class class499 extends class347 {
   int field7954 = 2000;
   static int field7955 = 0;
   int field7956 = 16;
   static int field7957 = 2000;
   static int field7958 = 4096;
   int field7959 = 0;
   int field7960 = 0;
   static int field7961 = 16;
   int field7962 = 4096;
   static int field7963 = 0;

   void method205(int var1) {
      try {
         class322.method814((byte)42);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agl.x(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field7959 = var2.method6371();
            break;
         case 1:
            this.field7954 = var2.method6374();
            break;
         case 2:
            this.field7956 = var2.method6371();
            break;
         case 3:
            this.field7960 = var2.method6374();
            break;
         case 4:
            this.field7962 = var2.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agl.r(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = super.field270.method3546(var1, 236039494);
         if (super.field270.field6612) {
            int var4 = this.field7962 >> 1;
            int[][] var5 = super.field270.method3547(-1416653577);
            Random var6 = new Random((long)this.field7959);

            for(int var7 = 0; var7 < this.field7954; ++var7) {
               int var8 = this.field7962 > 0 ? this.field7960 + (class977.method1813(var6, this.field7962, (byte)24) - var4) : -114289409 * this.field7960 * -132715777;
               var8 = var8 >> 4 & 255;
               int var9 = class977.method1813(var6, class322.field831, (byte)15);
               int var10 = class977.method1813(var6, class322.field832, (byte)76);
               int var11 = var9 + (this.field7956 * class322.field839[var8] >> 12);
               int var12 = (this.field7956 * class322.field837[var8] >> 12) + var10;
               int var13 = var12 - var10;
               int var14 = var11 - var9;
               if (var14 != 0 || var13 != 0) {
                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (var14 < 0) {
                     var14 = -var14;
                  }

                  boolean var15 = var13 > var14;
                  int var16;
                  int var17;
                  if (var15) {
                     var16 = var9;
                     var17 = var11;
                     var9 = var10;
                     var10 = var16;
                     var11 = var12;
                     var12 = var17;
                  }

                  if (var9 > var11) {
                     var16 = var9;
                     var17 = var10;
                     var9 = var11;
                     var11 = var16;
                     var10 = var12;
                     var12 = var17;
                  }

                  var16 = var10;
                  var17 = var11 - var9;
                  int var18 = var12 - var10;
                  int var19 = -var17 / 2;
                  int var20 = 2048 / var17;
                  int var21 = 1024 - (class977.method1813(var6, 4096, (byte)-25) >> 2);
                  int var22 = var10 < var12 ? 1 : -1;
                  if (var18 < 0) {
                     var18 = -var18;
                  }

                  for(int var23 = var9; var23 < var11; ++var23) {
                     int var24 = 1024 + var21 + var20 * (var23 - var9);
                     int var25 = var23 & class322.field829;
                     int var26 = var16 & class322.field834;
                     if (var15) {
                        var5[var26][var25] = var24;
                     } else {
                        var5[var25][var26] = var24;
                     }

                     var19 += var18;
                     if (var19 > 0) {
                        var19 -= var17;
                        var16 += var22;
                     }
                  }
               }
            }
         }

         return var3;
      } catch (RuntimeException var27) {
         throw class158.method3445(var27, "agl.i(" + ')');
      }
   }

   public class499() {
      super(0, true);
   }

   static final void method4475(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1433949674) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field999 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agl.nw(" + ')');
      }
   }
}
