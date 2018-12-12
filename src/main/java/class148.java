public class class148 extends class347 {
   int field1502 = 4096;
   int field1503 = 4096;
   int field1504 = 4096;
   static int field1505 = 4096;

   int[][] method204(int var1, byte var2) {
      try {
         int[][] var3 = super.field266.method162(var1, (byte)20);
         if (super.field266.field211) {
            int[][] var4 = this.method206(0, var1, (byte)8);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];

            for(int var11 = 0; var11 < class322.field831; ++var11) {
               int var12 = var5[var11];
               int var13 = var7[var11];
               int var14 = var6[var11];
               if (var12 == var13 && var13 == var14) {
                  var8[var11] = var12 * this.field1504 >> 12;
                  var9[var11] = this.field1502 * var13 >> 12;
                  var10[var11] = this.field1503 * var14 >> 12;
               } else {
                  var8[var11] = this.field1504;
                  var9[var11] = this.field1502;
                  var10[var11] = this.field1503;
               }
            }
         }

         return var3;
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "ahy.k(" + ')');
      }
   }

   void method209(int var1, InputStream var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field1504 = var2.method6374();
            break;
         case 1:
            this.field1502 = var2.method6374();
            break;
         case 2:
            this.field1503 = var2.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahy.r(" + ')');
      }
   }

   public class148() {
      super(1, false);
   }

   static void method1132(Actor var0, int var1, int var2, int var3, int var4) {
      try {
         class507 var5 = var0.method2554(-1083725964);
         Animator var6 = var0.passiveAnimator;
         int var7 = var0.field4032 - var0.field4048.field9268 & 16383;
         if (var1 == class647.field9231.field9230) {
            if (var7 == 0 && var0.field4078 <= 25) {
               if (!var0.field4058 || !var5.method2505(var6.method2779(2113533366), (byte)-97)) {
                  var6.method2797(var5.method2504(-2063556157), false, true, (byte)102);
                  var0.field4058 = var6.method2775((byte)-64);
               }
            } else if (var3 < 0 && -1 != var5.field3973) {
               var6.method2797(var5.field3973, false, true, (byte)-57);
               var0.field4058 = false;
            } else if (var3 > 0 && var5.field3991 != -1) {
               var6.method2797(var5.field3991, false, true, (byte)72);
               var0.field4058 = false;
            } else if (!var0.field4058 || !var5.method2505(var6.method2779(1935756712), (byte)-121)) {
               var6.method2797(var5.method2504(-2063556157), false, true, (byte)-2);
               var0.field4058 = var0.passiveAnimator.method2775((byte)-119);
            }
         } else if (var0.field4054 != -1 && (var7 >= 10240 || var7 <= 2048)) {
            int var8 = class730.field2900[var2] - var0.field4048.field9268 & 16383;
            if (var1 == class647.field9229.field9230 && -1 != var5.field3979) {
               if (var8 > 2048 && var8 <= 6144 && var5.field3982 != -1) {
                  var6.method2797(var5.field3982, false, true, (byte)-2);
               } else if (var8 >= 10240 && var8 < 14336 && var5.field4004 != -1) {
                  var6.method2797(var5.field4004, false, true, (byte)-60);
               } else if (var8 > 6144 && var8 < 10240 && -1 != var5.field4007) {
                  var6.method2797(var5.field4007, false, true, (byte)-111);
               } else {
                  var6.method2797(var5.field3979, false, true, (byte)-65);
               }
            } else if (var1 == class647.field9233.field9230 && var5.field4013 != -1) {
               if (var8 > 2048 && var8 <= 6144 && -1 != var5.field3986) {
                  var6.method2797(var5.field3986, false, true, (byte)110);
               } else if (var8 >= 10240 && var8 < 14336 && var5.field3985 != -1) {
                  var6.method2797(var5.field3985, false, true, (byte)16);
               } else if (var8 > 6144 && var8 < 10240 && -1 != var5.field3980) {
                  var6.method2797(var5.field3980, false, true, (byte)-13);
               } else {
                  var6.method2797(var5.field4013, false, true, (byte)-50);
               }
            } else if (var8 > 2048 && var8 <= 6144 && -1 != var5.field3981) {
               var6.method2797(var5.field3981, false, true, (byte)-29);
            } else if (var8 >= 10240 && var8 < 14336 && -1 != var5.field3977) {
               var6.method2797(var5.field3977, false, true, (byte)-38);
            } else if (var8 > 6144 && var8 < 10240 && var5.field3999 != -1) {
               var6.method2797(var5.field3999, false, true, (byte)-37);
            } else {
               var6.method2797(var5.field3975, false, true, (byte)9);
            }

            var0.field4058 = false;
         } else if (var7 == 0 && var0.field4078 <= 25) {
            if (var1 == class647.field9229.field9230 && var5.field3979 != -1) {
               var6.method2797(var5.field3979, false, true, (byte)42);
            } else if (class647.field9233.field9230 == var1 && var5.field4013 != -1) {
               var6.method2797(var5.field4013, false, true, (byte)5);
            } else {
               var6.method2797(var5.field3975, false, true, (byte)-42);
            }

            var0.field4058 = false;
         } else {
            if (var1 == class647.field9229.field9230 && -1 != var5.field3979) {
               if (var3 < 0 && -1 != var5.field3989) {
                  var6.method2797(var5.field3989, false, true, (byte)69);
               } else if (var3 > 0 && var5.field3997 != -1) {
                  var6.method2797(var5.field3997, false, true, (byte)28);
               } else {
                  var6.method2797(var5.field3979, false, true, (byte)95);
               }
            } else if (class647.field9233.field9230 == var1 && var5.field4013 != -1) {
               if (var3 < 0 && var5.field3987 != -1) {
                  var6.method2797(var5.field3987, false, true, (byte)-21);
               } else if (var3 > 0 && var5.field4001 != -1) {
                  var6.method2797(var5.field4001, false, true, (byte)114);
               } else {
                  var6.method2797(var5.field4013, false, true, (byte)-43);
               }
            } else if (var3 < 0 && -1 != var5.field3995) {
               var6.method2797(var5.field3995, false, true, (byte)28);
            } else if (var3 > 0 && -1 != var5.field3988) {
               var6.method2797(var5.field3988, false, true, (byte)72);
            } else {
               var6.method2797(var5.field3975, false, true, (byte)-16);
            }

            var0.field4058 = false;
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ahy.ir(" + ')');
      }
   }
}
