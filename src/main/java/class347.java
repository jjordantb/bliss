public abstract class class347 extends Node {
   class347[] field257;
   protected static int field258 = 4096;
   protected static int field259 = 8192;
   protected static int field260 = 2048;
   protected static int field261 = 1024;
   protected static int field262 = 4095;
   protected static int field263 = -4096;
   public static float field264 = 4096.0F;
   protected static int field265 = 12;
   protected class587 field266;
   int field267;
   protected boolean field268;
   static int field269 = 255;
   protected class161 field270;

   void method200(int var1) {
      try {
         if (this.field268) {
            this.field270.method3545(-2047791344);
            this.field270 = null;
         } else {
            this.field266.method160(1128240518);
            this.field266 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abq.f(" + ')');
      }
   }

   final int[] method201(int var1, int var2, int var3) {
      try {
         return !this.field257[var1].field268 ? this.field257[var1].method204(var2, (byte)-85)[0] : this.field257[var1].method203(var2, 891860141);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "abq.b(" + ')');
      }
   }

   void method202(int var1, int var2, int var3) {
      try {
         int var4 = 255 == this.field267 ? var2 : this.field267 * -2127296983 * -1006569959;
         if (this.field268) {
            this.field270 = new class161(var4, var2, var1);
         } else {
            this.field266 = new class587(var4, var2, var1);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "abq.a(" + ')');
      }
   }

   int[] method203(int var1, int var2) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abq.i(" + ')');
      }
   }

   int[][] method204(int var1, byte var2) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abq.k(" + ')');
      }
   }

   void method205(int var1) {
   }

   final int[][] method206(int var1, int var2, byte var3) {
      try {
         if (this.field257[var1].field268) {
            int[] var4 = this.field257[var1].method203(var2, 1101139178);
            int[][] var5 = new int[][]{var4, var4, var4};
            return var5;
         } else {
            return this.field257[var1].method204(var2, (byte)-94);
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "abq.p(" + ')');
      }
   }

   class347(int var1, boolean var2) {
      this.field268 = var2;
      this.field257 = new class347[var1];
   }

   int method207(short var1) {
      return -1;
   }

   int method208(byte var1) {
      return -1;
   }

   void method209(int var1, InputStream var2, byte var3) {
   }

   static void method210(int var0, int var1, byte var2) {
      try {
         class602.field8656 = var0;
         class602.field8657 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abq.ad(" + ')');
      }
   }
}
