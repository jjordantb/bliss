public class class305 {
   public int field398;
   public static int field399 = 4318;
   public static int field400 = 4098;
   public String field401;
   public static int field402 = -1;
   public static int field403 = 0;
   public static int field404 = 32902;
   public int field405;
   public String field406;
   public long field407;

   public class305(int var1, String var2, int var3, String var4, long var5) {
      this.field398 = var1;
      this.field406 = var2;
      this.field405 = var3;
      this.field401 = var4;
      this.field407 = var5;
   }

   public static int method371(int var0, int var1, int var2) {
      try {
         int var3 = var1 >>> 24;
         int var4 = 255 - var3;
         var1 = ((var1 & 16711935) * var3 & -16711936 | var3 * (var1 & '\uff00') & 16711680) >>> 8;
         return var1 + ((var4 * (var0 & 16711935) & -16711936 | (var0 & '\uff00') * var4 & 16711680) >>> 8);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ci.d(" + ')');
      }
   }

   public static int method372(String var0, int var1) {
      try {
         return var0.length() + 1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ci.s(" + ')');
      }
   }

   static boolean method373(int var0) {
      try {
         if (class602.field8644 == null) {
            return false;
         } else {
            if (class602.field8644.field1702 >= 2000) {
               class602.field8644.field1702 -= 2000;
            }

            return 1007 == class602.field8644.field1702;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ci.x(" + ')');
      }
   }

   public static class809 method374(InputStream var0, int var1) {
      try {
         int var2 = var0.method6371();
         class971 var3 = class812.method2915((byte)12)[var0.method6371()];
         class49 var4 = class147.method1146(334501262)[var0.method6371()];
         int var5 = var0.method6367(2061620701);
         int var6 = var0.method6367(1990309362);
         int var7 = var0.method6374();
         int var8 = var0.method6374();
         int var9 = var0.method6420((byte)-72);
         int var10 = var0.method6420((byte)16);
         int var11 = var0.method6420((byte)7);
         boolean var12 = var0.method6371() == 1;
         return new class809(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "ci.a(" + ')');
      }
   }
}
