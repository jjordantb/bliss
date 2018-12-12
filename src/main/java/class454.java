public abstract class class454 {
   public int field7225;
   public int field7226;
   public int field7227;
   public int field7228;
   public int[][] field7229;
   static class559 field7230;
   public static int field7231;

   public abstract void method3880(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method3881(int var1, int var2, int var3);

   public abstract void method3882(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12);

   public abstract void method3883(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15);

   public abstract void method3884(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15);

   public abstract void method3885(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method3886(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public final int method3887(int var1, int var2, int var3) {
      try {
         int var4 = var1 >> -2137349879 * this.field7228;
         int var5 = var2 >> -2137349879 * this.field7228;
         if (var4 >= 0 && var5 >= 0 && var4 <= this.field7226 * -506105871 - 1 && var5 <= this.field7225 * -1148794921 - 1) {
            int var6 = var1 & this.field7227 * -1212653763 - 1;
            int var7 = var2 & this.field7227 * -1212653763 - 1;
            int var8 = (this.field7227 * -1212653763 - var6) * this.field7229[var4][var5] + var6 * this.field7229[var4 + 1][var5] >> this.field7228 * -2137349879;
            int var9 = var6 * this.field7229[1 + var4][1 + var5] + (this.field7227 * -1212653763 - var6) * this.field7229[var4][var5 + 1] >> this.field7228 * -2137349879;
            return var8 * (this.field7227 * -1212653763 - var7) + var9 * var7 >> this.field7228 * -2137349879;
         } else {
            return 0;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "xa.i(" + ')');
      }
   }

   public final int method3888(int var1, int var2, byte var3) {
      try {
         return this.field7229[var1][var2];
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "xa.k(" + ')');
      }
   }

   public abstract class770 method3889(int var1, int var2, class770 var3);

   public abstract void method3890(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method3891(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   class454(int var1, int var2, int var3, int[][] var4) {
      this.field7226 = -1455578863 * var1;
      this.field7225 = var2 * 1046617063;

      int var5;
      for(var5 = 0; var3 > 1; var3 >>= 1) {
         ++var5;
      }

      this.field7227 = (1 << var5) * 1080291349;
      this.field7228 = var5 * -816104135;
      this.field7229 = var4;
   }

   public abstract void method3892(class639 var1, int[] var2);

   public abstract void method3893(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method3894(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15);

   public abstract void method3895(class639 var1, int[] var2);

   public abstract void method3896(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12);

   public abstract void method3897(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12);

   public abstract void method3898();

   public abstract void method3899();

   public abstract void method3900(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method3901(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract class770 method3902(int var1, int var2, class770 var3);

   public abstract void method3903(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method3904(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method3905(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method3906(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract class770 method3907(int var1, int var2, class770 var3);

   public abstract boolean method3908(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract class770 method3909(int var1, int var2, class770 var3);

   public abstract void method3910(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract boolean method3911(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract boolean method3912(class770 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method3913(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, class919 var14, boolean var15);

   public abstract void method3914(int var1, int var2, int var3);

   public abstract void method3915(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   public abstract void method3916(class639 var1, int[] var2);

   public abstract void method3917(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, class919 var11, boolean var12);

   static final void method3918(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)109);
         class131 var4 = class382.field1410[var2 >> 16];
         class629.method5808(var3, var4, var0, 327823219);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "xa.ja(" + ')');
      }
   }

   static final void method3919(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-33);
         class131 var4 = class382.field1410[var2 >> 16];
         class176.method3168(var3, var4, var0, 1549580200);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "xa.nu(" + ')');
      }
   }

   static final void method3920(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[1 + 681479919 * var0.field3156];
         if (var2 > 700 || var3 > 700) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 256;
         }

         double var4 = (Math.random() * (double)(var3 + var2) - (double)var2 + 800.0D) / 100.0D;
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (int)(Math.pow(2.0D, var4) + 0.5D);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "xa.zr(" + ')');
      }
   }

   static final void method3921(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9117.method5847((byte)-74) && class593.field1623.method4878() ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xa.anp(" + ')');
      }
   }

   static final void method3922(class744 var0, int var1) {
      try {
         var0.field3156 -= -1175642067;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[var0.field3156 * 681479919 + 1];
         int var4 = var0.field3161[2 + var0.field3156 * 681479919];
         long var5 = class64.method1262(0, 0, 12, var2, var3, var4, (byte)67);
         int var7 = class877.method5925(var5);
         if (var4 < 1970) {
            --var7;
         }

         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var7;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "xa.akr(" + ')');
      }
   }
}
