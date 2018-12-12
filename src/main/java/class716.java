public class class716 {
   int field3467;
   String field3468;
   int field3469;
   int field3470;
   int field3471;

   int method2041(byte var1) {
      try {
         return this.field3471;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.a(" + ')');
      }
   }

   int method2042(byte var1) {
      try {
         return this.field3469;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.b(" + ')');
      }
   }

   int method2043(int var1) {
      try {
         return this.field3470;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.p(" + ')');
      }
   }

   String method2044(int var1) {
      try {
         return this.field3468;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.i(" + ')');
      }
   }

   int method2045(int var1) {
      try {
         return this.field3467;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.f(" + ')');
      }
   }

   public class716(int var1, int var2, int var3, int var4, String var5) {
      this.field3471 = var1;
      this.field3467 = var2;
      this.field3469 = var3;
      this.field3470 = var4;
      this.field3468 = var5;
   }

   static void method2046(class744 var0, int var1) {
      try {
         var0.field3161[var0.field3156 - 2] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).method5328(class730.field2809, var0.field3161[var0.field3156 - 1], (byte)47) ? 1 : 0;
         --var0.field3156;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.y(" + ')');
      }
   }

   public static void method2047(String var0, boolean var1, int var2) {
      try {
         var0 = var0.toLowerCase();
         short[] var3 = new short[16];
         int var4 = 0;
         int var5 = var1 ? '耀' : 0;
         int var6 = (var1 ? class906.field10363.field4324 * 1286548437 * 1637004669 : class906.field10363.field4322 * -1970727647 * 1143516897) + var5;

         for(int var7 = var5; var7 < var6; ++var7) {
            class282 var8 = class906.field10363.method2713(var7, (short)-11352);
            if (var8.field10619) {
               if (var8.method6654((byte)-92).toLowerCase().indexOf(var0) == -1) {
                  if (var2 <= -1272557020) {
                     return;
                  }
               } else {
                  if (var4 >= 50) {
                     class198.field7051 = -1;
                     class396.field6515 = null;
                     return;
                  }

                  if (var4 >= var3.length) {
                     short[] var9 = new short[var3.length * 2];

                     for(int var10 = 0; var10 < var4; ++var10) {
                        var9[var10] = var3[var10];
                     }

                     var3 = var9;
                  }

                  var3[var4++] = (short)var7;
               }
            }
         }

         class396.field6515 = var3;
         class721.field3635 = 0;
         class198.field7051 = var4;
         String[] var12 = new String[class198.field7051];

         for(int var13 = 0; var13 < class198.field7051; ++var13) {
            var12[var13] = class906.field10363.method2713(var3[var13], (short)-23170).method6654((byte)-73);
         }

         class830.method5378(var12, class396.field6515, -1747372319);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "my.nc(" + ')');
      }
   }

   static final void method2048(class744 var0, byte var1) {
      try {
         class974.method1783(-1563671491);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "my.agf(" + ')');
      }
   }

   static final void method2049(class744 var0, int var1) {
      try {
         int var2 = var0.field3174[var0.field3176];
         class579 var3 = class899.field9551.method3678(var2, 65536);
         if ('\u0001' != var3.field77) {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

         Integer var4 = (Integer)class166.field6896[var3.field76];
         if (var4 == null) {
            var0.field3161[++var0.field3156 - 1] = 0;
         } else {
            int var5 = var3.field78 == 31 ? -1 : (1 << var3.field78 + 1) - 1;
            var0.field3161[++var0.field3156 - 1] = (var4.intValue() & var5) >>> var3.field75;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "my.bg(" + ')');
      }
   }
}
