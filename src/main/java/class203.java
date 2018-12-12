import jaggl.OpenGL;

public abstract class class203 {
   boolean field7558 = false;
   static int field7559 = 3553;
   static int field7560 = 34037;
   static int field7561 = 34067;
   int field7562;
   static int field7563 = 5121;
   static int field7564 = 32879;
   static int field7565 = 3552;
   int field7566;
   class264 field7567;
   class482 field7568;
   boolean field7569;
   int field7570;
   class13 field7571;
   static int[] field7572 = new int[1];

   class203(class13 var1, int var2, class264 var3, class482 var4, int var5, boolean var6) {
      this.field7571 = var1;
      this.field7562 = var2;
      this.field7567 = var3;
      this.field7568 = var4;
      this.field7569 = var6;
      this.field7570 = var5;
      OpenGL.glGenTextures(1, field7572, 0);
      this.field7566 = field7572[0];
      this.method4288(0);
   }

   void method4286() {
      this.field7571.method3639(this);
      if (this.field7558) {
         OpenGL.glTexParameteri(this.field7562, 10241, this.field7569 ? 9987 : 9729);
         OpenGL.glTexParameteri(this.field7562, 10240, 9729);
      } else {
         OpenGL.glTexParameteri(this.field7562, 10241, this.field7569 ? 9984 : 9728);
         OpenGL.glTexParameteri(this.field7562, 10240, 9728);
      }

   }

   void method4287() {
      if (this.field7566 > 0) {
         this.field7571.field6862 -= this.method4295();
         int[] var1 = new int[]{this.field7566};
         OpenGL.glDeleteTextures(1, var1, 0);
         this.field7566 = 0;
      }

   }

   void method4288(int var1) {
      this.field7571.field6862 -= var1;
      this.field7571.field6862 += this.method4295();
   }

   void method4289(boolean var1) {
      if (this.field7558 != var1) {
         this.field7558 = var1;
         this.method4286();
      }

   }

   static void method4290(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var2 > 0 && !class51.method1530(var2, 1883323827)) {
         throw new IllegalArgumentException("");
      } else if (var3 > 0 && !class51.method1530(var3, 1954585128)) {
         throw new IllegalArgumentException("");
      } else if (var4 != 32993) {
         throw new IllegalArgumentException("");
      } else {
         int var7 = 0;
         int var8 = var2 < var3 ? var2 : var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         int[] var11 = var6;
         int[] var12 = new int[var9 * var10];

         while(true) {
            OpenGL.glTexImage2Di(var0, var7, var1, var2, var3, 0, var4, var5, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = 0;
            int var14 = 0;
            int var15 = var14 + var2;

            for(int var16 = 0; var16 < var10; ++var16) {
               for(int var17 = 0; var17 < var9; ++var17) {
                  int var18 = var11[var14++];
                  int var19 = var11[var14++];
                  int var20 = var11[var15++];
                  int var21 = var11[var15++];
                  int var22 = var18 >> 24 & 255;
                  int var23 = var18 >> 16 & 255;
                  int var24 = var18 >> 8 & 255;
                  int var25 = var18 & 255;
                  var22 += var19 >> 24 & 255;
                  var23 += var19 >> 16 & 255;
                  var24 += var19 >> 8 & 255;
                  var25 += var19 & 255;
                  var22 += var20 >> 24 & 255;
                  var23 += var20 >> 16 & 255;
                  var24 += var20 >> 8 & 255;
                  var25 += var20 & 255;
                  var22 += var21 >> 24 & 255;
                  var23 += var21 >> 16 & 255;
                  var24 += var21 >> 8 & 255;
                  var25 += var21 & 255;
                  var12[var13++] = (var22 & 1020) << 22 | (var23 & 1020) << 14 | (var24 & 1020) << 6 | (var25 & 1020) >> 2;
               }

               var14 += var2;
               var15 += var2;
            }

            int[] var26 = var12;
            var12 = var11;
            var11 = var26;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   static void method4291(int var0, int var1, int var2, int var3, class264 var4, byte[] var5) {
      if (var2 > 0 && !class51.method1530(var2, 2122015724)) {
         throw new IllegalArgumentException("");
      } else if (var3 > 0 && !class51.method1530(var3, 2088094849)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.field8190;
         int var7 = 0;
         int var8 = var2 < var3 ? var2 : var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         byte[] var11 = var5;
         byte[] var12 = new byte[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Dub(var0, var7, var1, var2, var3, 0, class13.method3611(var4), 5121, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     byte var20 = var11[var16];
                     var16 += var6;
                     int var22 = var20 + var11[var16];
                     var16 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var22 += var11[var17];
                     var17 += var6;
                     var12[var15] = (byte)(var22 >> 2);
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            byte[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   boolean method4292() {
      if (this.field7571.field6857) {
         int var1 = this.method4295();
         this.field7571.method3639(this);
         OpenGL.glGenerateMipmapEXT(this.field7562);
         this.field7569 = true;
         this.method4286();
         this.method4288(var1);
         return true;
      } else {
         return false;
      }
   }

   void method4293(boolean var1) {
      if (this.field7569 != var1) {
         int var2 = this.method4295();
         this.field7569 = true;
         this.method4286();
         this.method4288(var2);
      }

   }

   static void method4294(int var0, int var1, int var2, int var3, class264 var4, float[] var5) {
      if (var2 > 0 && !class51.method1530(var2, 2081148754)) {
         throw new IllegalArgumentException("");
      } else if (var3 > 0 && !class51.method1530(var3, 2048879832)) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var4.field8190;
         int var7 = 0;
         int var8 = var2 < var3 ? var2 : var3;
         int var9 = var2 >> 1;
         int var10 = var3 >> 1;
         float[] var11 = var5;
         float[] var12 = new float[var9 * var10 * var6];

         while(true) {
            OpenGL.glTexImage2Df(var0, var7, var1, var2, var3, 0, class13.method3611(var4), 5126, var11, 0);
            if (var8 <= 1) {
               return;
            }

            int var13 = var2 * var6;

            for(int var14 = 0; var14 < var6; ++var14) {
               int var15 = var14;
               int var16 = var14;
               int var17 = var14 + var13;

               for(int var18 = 0; var18 < var10; ++var18) {
                  for(int var19 = 0; var19 < var9; ++var19) {
                     float var20 = var11[var16];
                     var16 += var6;
                     var20 += var11[var16];
                     var16 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var20 += var11[var17];
                     var17 += var6;
                     var12[var15] = var20 * 0.25F;
                     var15 += var6;
                  }

                  var16 += var13;
                  var17 += var13;
               }
            }

            float[] var21 = var12;
            var12 = var11;
            var11 = var21;
            var2 = var9;
            var3 = var10;
            var9 >>= 1;
            var10 >>= 1;
            var8 >>= 1;
            ++var7;
         }
      }
   }

   int method4295() {
      int var1 = this.field7567.field8190 * this.field7568.field8406 * this.field7570;
      return this.field7569 ? var1 * 4 / 3 : var1;
   }

   void method4296() {
      if (this.field7566 > 0) {
         this.field7571.method3612(this.field7566, this.method4295());
         this.field7566 = 0;
      }

   }
}
