public class class158 {
   public static int field6436 = 1024;
   public static int field6437 = 9;
   public static int field6438 = 7;
   public static int field6439 = 512;
   public static int field6440 = 511;
   public static int field6441 = 8;
   public static int field6442 = 256;
   public static int field6443 = 2;
   public static int field6444 = 128;

   static {
      Math.sqrt(131072.0D);
   }

   class158() throws Throwable {
      throw new Error();
   }

   static final void method3440(class744 var0, short var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9123.method5844(-550588042) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw method3445(var3, "ol.anh(" + ')');
      }
   }

   static void method3441(int var0, int var1, class564 var2, class23 var3, int var4, int var5, int var6) {
      try {
         int var7 = class498.field8102;
         int[] var8 = class498.field8108;

         for(int var9 = 0; var9 < var7; ++var9) {
            Player var10 = class730.loaded[var8[var9]];
            if (var10 != null && var10.method2000(526198823) && !var10.field3377 && var10 != class923.local && var10.field3639 == class923.local.field3639) {
               class32 var11 = var10.method1511().field7637;
               int var12 = (int)var11.field5296 / 128 - var0 / 128;
               int var13 = (int)var11.field5299 / 128 - var1 / 128;
               boolean var14 = false;

               for(int var15 = 0; var15 < class730.field2923; ++var15) {
                  if (var10.field3374.equals(class730.field2685[var15]) && class730.field2928[var15] != 0) {
                     var14 = true;
                     break;
                  }
               }

               boolean var18 = false;

               for(int var16 = 0; var16 < class556.field503; ++var16) {
                  if (var10.field3374.equals(class776.field3731[var16].field8115)) {
                     var18 = true;
                     break;
                  }
               }

               boolean var19 = false;
               if (class923.local.field3387 != 0 && var10.field3387 != 0 && var10.field3387 == class923.local.field3387) {
                  var19 = true;
               }

               if (var10.field3382) {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[6], (byte)52);
               } else if (var19) {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[4], (byte)-19);
               } else if (var10.field3401) {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[7], (byte)-81);
               } else if (var14) {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[3], (byte)25);
               } else if (var18) {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[5], (byte)-50);
               } else {
                  class758.method2734(var2, var3, var4, var5, var12, var13, class307.field427[2], (byte)-40);
               }
            }
         }

      } catch (RuntimeException var17) {
         throw method3445(var17, "ol.n(" + ')');
      }
   }

   public static void method3442(String var0, boolean var1, boolean var2, boolean var3, boolean var4, byte var5) {
      try {
         class529.method2213(var0, var1, var2, "openjs", var3, var4, -1892115895);
      } catch (RuntimeException var7) {
         throw method3445(var7, "ol.a(" + ')');
      }
   }

   public static void method3443(class848 var0, class180 var1, int var2) {
      try {
         class922[] var3 = class922.method6248(var1, class295.field10471, 0);
         class120.field2291 = new class48[var3.length];

         int var4;
         for(var4 = 0; var4 < var3.length; ++var4) {
            class120.field2291[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class295.field10473, 0);
         class916.field10419 = new class48[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            class916.field10419[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class762.field4391, 0);
         class18.field6933 = new class48[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            class18.field6933[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class878.field9819, 0);
         class535.field3709 = new class48[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            class535.field3709[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class295.field10472, 0);
         class634.field9790 = new class48[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            class634.field9790[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class295.field10475, 0);
         class295.field10478 = new class48[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            class295.field10478[var4] = var0.method4982(var3[var4], true);
         }

         var3 = class922.method6248(var1, class701.field3366, 0);
         class984.field3145 = new class48[var3.length];
         byte var7 = 25;

         int var5;
         for(var5 = 0; var5 < var3.length; ++var5) {
            var3[var5].method6246(-var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D));
            class984.field3145[var5] = var0.method4982(var3[var5], true);
         }

         var3 = class922.method6248(var1, class776.field3727, 0);
         class974.field2983 = new class48[var3.length];

         for(var5 = 0; var5 < var3.length; ++var5) {
            class974.field2983[var5] = var0.method4982(var3[var5], true);
         }

         var3 = class922.method6248(var1, class942.field10348, 0);
         class307.field427 = new class48[var3.length];
         var7 = 12;

         for(var5 = 0; var5 < var3.length; ++var5) {
            var3[var5].method6246(-var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D));
            class307.field427[var5] = var0.method4982(var3[var5], true);
         }

         var3 = class922.method6248(var1, class295.field10476, 0);
         class324.field621 = new class48[var3.length];
         var7 = 12;

         for(var5 = 0; var5 < var3.length; ++var5) {
            var3[var5].method6246(-var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D), -var7 + (int)(Math.random() * (double)var7 * 2.0D));
            class324.field621[var5] = var0.method4982(var3[var5], true);
         }

         class422.field9603 = var0.method4982(class922.method6242(var1, class229.field8211, 0), true);
         class932.field10344 = var0.method4982(class922.method6242(var1, class665.field9599, 0), true);
         var3 = class922.method6248(var1, class573.field110, 0);
         class322.field842 = new class48[var3.length];

         for(var5 = 0; var5 < var3.length; ++var5) {
            class322.field842[var5] = var0.method4982(var3[var5], true);
         }

      } catch (RuntimeException var6) {
         throw method3445(var6, "ol.d(" + ')');
      }
   }

   static String method3444(class497 var0, byte var1) {
      try {
         return var0.field8122 + class56.method1545(16777215, -1514789129) + " >";
      } catch (RuntimeException var3) {
         throw method3445(var3, "ol.be(" + ')');
      }
   }

   public static class862 method3445(Throwable var0, String var1) {
      try {
         class862 var2;
         if (var0 instanceof class862) {
            var2 = (class862)var0;
            StringBuilder var3 = new StringBuilder();
            var2.field8935 = var3.append(var2.field8935).append(' ').append(var1).toString();
         } else {
            var2 = new class862(var0, var1);
         }

         return var2;
      } catch (RuntimeException var5) {
         throw method3445(var5, "ol.f(" + ')');
      }
   }
}
