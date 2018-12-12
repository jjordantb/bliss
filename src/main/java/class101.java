import jaggl.OpenGL;

public class class101 extends class727 {
   class102 field327;
   class13 field328;
   class41 field329;
   boolean field330;

   void method1675(char var1, int var2, int var3, int var4, boolean var5) {
      this.field328.method3653();
      this.field328.method3639(this.field327);
      if (!this.field330 && !var5) {
         this.field328.method3641(7681, 7681);
      } else {
         this.field328.method3641(7681, 8448);
         this.field328.method3642(0, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.field329.method3055(var1);
      OpenGL.glLoadIdentity();
      if (this.field330 || var5) {
         this.field328.method3642(0, 5890, 768);
      }

   }

   void method1679(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      class944 var9 = (class944)var6;
      class102 var10 = var9.field3363;
      this.field328.method3653();
      this.field328.method3639(this.field327);
      if (!this.field330 && !var5) {
         this.field328.method3641(7681, 7681);
      } else {
         this.field328.method3641(7681, 8448);
         this.field328.method3642(0, 34168, 768);
      }

      this.field328.method3638(1);
      this.field328.method3639(var10);
      this.field328.method3641(7681, 8448);
      this.field328.method3642(0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field322 / (float)var10.field321;
      float var12 = var10.field324 / (float)var10.field320;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.field329.method3055(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field328.method3642(0, 5890, 768);
      this.field328.method3641(8448, 8448);
      this.field328.method3639((class203)null);
      this.field328.method3638(0);
      if (this.field330 || var5) {
         this.field328.method3642(0, 5890, 768);
      }

   }

   void method1674(char var1, int var2, int var3, int var4, boolean var5, class23 var6, int var7, int var8) {
      class944 var9 = (class944)var6;
      class102 var10 = var9.field3363;
      this.field328.method3653();
      this.field328.method3639(this.field327);
      if (!this.field330 && !var5) {
         this.field328.method3641(7681, 7681);
      } else {
         this.field328.method3641(7681, 8448);
         this.field328.method3642(0, 34168, 768);
      }

      this.field328.method3638(1);
      this.field328.method3639(var10);
      this.field328.method3641(7681, 8448);
      this.field328.method3642(0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var11 = var10.field322 / (float)var10.field321;
      float var12 = var10.field324 / (float)var10.field320;
      OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0F, 0.0F, (float)(-var7) * var11}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var12, 0.0F, (float)(-var8) * var12}, 0);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.field329.method3055(var1);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.field328.method3642(0, 5890, 768);
      this.field328.method3641(8448, 8448);
      this.field328.method3639((class203)null);
      this.field328.method3638(0);
      if (this.field330 || var5) {
         this.field328.method3642(0, 5890, 768);
      }

   }

   void method1680(char var1, int var2, int var3, int var4, boolean var5) {
      this.field328.method3653();
      this.field328.method3639(this.field327);
      if (!this.field330 && !var5) {
         this.field328.method3641(7681, 7681);
      } else {
         this.field328.method3641(7681, 8448);
         this.field328.method3642(0, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.field329.method3055(var1);
      OpenGL.glLoadIdentity();
      if (this.field330 || var5) {
         this.field328.method3642(0, 5890, 768);
      }

   }

   void method1676(char var1, int var2, int var3, int var4, boolean var5) {
      this.field328.method3653();
      this.field328.method3639(this.field327);
      if (!this.field330 && !var5) {
         this.field328.method3641(7681, 7681);
      } else {
         this.field328.method3641(7681, 8448);
         this.field328.method3642(0, 34168, 768);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      this.field329.method3055(var1);
      OpenGL.glLoadIdentity();
      if (this.field330 || var5) {
         this.field328.method3642(0, 5890, 768);
      }

   }

   class101(class13 var1, class230 var2, class922[] var3, boolean var4) {
      super(var1, var2);
      this.field328 = var1;
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < 256; ++var6) {
         class922 var7 = var3[var6];
         if (var7.field10273 > var5) {
            var5 = var7.field10273;
         }

         if (var7.field10269 > var5) {
            var5 = var7.field10269;
         }
      }

      var6 = var5 * 16;
      int var8;
      class922 var9;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var18;
      if (var4) {
         byte[] var22 = new byte[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            int var10 = var9.field10273;
            var11 = var9.field10269;
            var12 = var8 % 16 * var5;
            var13 = var8 / 16 * var5;
            var14 = var13 * var6 + var12;
            var15 = 0;
            byte[] var16;
            if (var9.field10276 == null) {
               var16 = var9.field10275;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = (byte)(var16[var15++] == 0 ? 0 : -1);
                  }

                  var14 += var6 - var11;
               }
            } else {
               var16 = var9.field10276;

               for(var17 = 0; var17 < var10; ++var17) {
                  for(var18 = 0; var18 < var11; ++var18) {
                     var22[var14++] = var16[var15++];
                  }

                  var14 += var6 - var11;
               }
            }
         }

         this.field327 = class102.method267(var1, class264.field8201, class482.field8399, var6, var6, false, var22, class264.field8201);
         this.field330 = true;
      } else {
         int[] var23 = new int[var6 * var6];

         for(var8 = 0; var8 < 256; ++var8) {
            var9 = var3[var8];
            int[] var27 = var9.field10274;
            byte[] var29 = var9.field10276;
            byte[] var30 = var9.field10275;
            var13 = var9.field10273;
            var14 = var9.field10269;
            var15 = var8 % 16 * var5;
            int var32 = var8 / 16 * var5;
            var17 = var32 * var6 + var15;
            var18 = 0;
            int var19;
            int var20;
            if (var29 != null) {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     var23[var17++] = var29[var18] << 24 | var27[var30[var18] & 255];
                     ++var18;
                  }

                  var17 += var6 - var14;
               }
            } else {
               for(var19 = 0; var19 < var13; ++var19) {
                  for(var20 = 0; var20 < var14; ++var20) {
                     byte var21;
                     if ((var21 = var30[var18++]) != 0) {
                        var23[var17++] = -16777216 | var27[var21 & 255];
                     } else {
                        ++var17;
                     }
                  }

                  var17 += var6 - var14;
               }
            }
         }

         this.field327 = class102.method264(var1, var6, var6, false, var23, 0, 0);
         this.field330 = false;
      }

      this.field327.method4289(false);
      this.field329 = new class41(var1, 256);
      float var24 = this.field327.field322 / (float)this.field327.field321;
      float var25 = this.field327.field324 / (float)this.field327.field320;

      for(int var26 = 0; var26 < 256; ++var26) {
         class922 var28 = var3[var26];
         var11 = var28.field10273;
         var12 = var28.field10269;
         var13 = var28.field10268;
         var14 = var28.field10272;
         float var31 = (float)(var26 % 16 * var5);
         float var33 = (float)(var26 / 16 * var5);
         float var34 = var31 * var24;
         float var35 = var33 * var25;
         float var36 = (var31 + (float)var12) * var24;
         float var37 = (var33 + (float)var11) * var25;
         this.field329.method3056(var26);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var34, this.field327.field324 - var35);
         OpenGL.glVertex2i(var14, var13);
         OpenGL.glTexCoord2f(var34, this.field327.field324 - var37);
         OpenGL.glVertex2i(var14, var13 + var11);
         OpenGL.glTexCoord2f(var36, this.field327.field324 - var37);
         OpenGL.glVertex2i(var14 + var12, var13 + var11);
         OpenGL.glTexCoord2f(var36, this.field327.field324 - var35);
         OpenGL.glVertex2i(var14 + var12, var13);
         OpenGL.glEnd();
         this.field329.method3054();
      }

   }
}
