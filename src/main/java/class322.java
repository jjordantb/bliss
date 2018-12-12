import java.util.Random;

public class class322 {
   public static int field829;
   static double field830 = 6.283185307179586D;
   public static int field831;
   public static int field832;
   public static int field833;
   public static int field834;
   public static int field835 = 12;
   public static int[] field836;
   public static int[] field837;
   public static int[] field838;
   public static int[] field839;
   static class170 field840 = new class170(16);
   public static String field841;
   static class48[] field842;

   public static byte[] method813(int var0, byte var1) {
      try {
         class855 var2 = (class855)field840.method3070((long)var0);
         if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long)var0);

            int var5;
            for(var5 = 0; var5 < 255; ++var5) {
               var3[var5] = (byte)var5;
            }

            for(var5 = 0; var5 < 255; ++var5) {
               int var6 = 255 - var5;
               int var7 = class977.method1813(var4, var6, (byte)-16);
               byte var8 = var3[var7];
               var3[var7] = var3[var6];
               var3[var6] = var3[511 - var5] = var8;
            }

            var2 = new class855(var3);
            field840.method3072(var2, (long)var0);
         }

         return var2.field8895;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "kl.b(" + ')');
      }
   }

   public static void method814(byte var0) {
      try {
         if (field837 == null || field839 == null) {
            field837 = new int[256];
            field839 = new int[256];

            for(int var1 = 0; var1 < 256; ++var1) {
               double var2 = (double)var1 / 255.0D * 6.283185307179586D;
               field837[var1] = (int)(Math.sin(var2) * 4096.0D);
               field839[var1] = (int)(Math.cos(var2) * 4096.0D);
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kl.a(" + ')');
      }
   }

   public static void method815(int var0, int var1, byte var2) {
      try {
         int var3;
         if (field831 != var0) {
            field838 = new int[var0];

            for(var3 = 0; var3 < var0; ++var3) {
               field838[var3] = (var3 << 12) / var0;
            }

            field829 = var0 - 1;
            field831 = var0;
            field833 = 32 * var0;
         }

         if (field832 != var1) {
            if (field831 != var1) {
               field836 = new int[var1];

               for(var3 = 0; var3 < var1; ++var3) {
                  field836[var3] = (var3 << 12) / var1;
               }
            } else {
               field836 = field838;
            }

            field834 = var1 - 1;
            field832 = var1;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kl.f(" + ')');
      }
   }

   class322() throws Throwable {
      throw new Error();
   }

   static final void method816(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class645.method6158(var3, var4, var0, -721593745);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "kl.ef(" + ')');
      }
   }

   static final void method817(class744 var0, byte var1) {
      try {
         var0.field3158 -= 2;
         String var2 = (String)var0.field3157[var0.field3158];
         String var3 = (String)var0.field3157[var0.field3158 + 1];
         if (class923.local.field3388 != null && class923.local.field3388.field2447) {
            var0.field3157[++var0.field3158 - 1] = var3;
         } else {
            var0.field3157[++var0.field3158 - 1] = var2;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "kl.zm(" + ')');
      }
   }
}
