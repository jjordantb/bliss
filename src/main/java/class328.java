import jaggl.OpenGL;

public class class328 extends class48 {
   int field3 = 0;
   class102 field4;
   boolean field5 = false;
   int field6 = 0;
   class13 field7;
   int field8 = 0;
   class102 field9;
   int field10 = 0;
   int field11 = 0;

   class328(class13 var1, int var2, int var3, int var4, int var5) {
      this.field7 = var1;
      this.field9 = class102.method266(var1, var2, var3, var4, var5);
   }

   class328(class13 var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.field7 = var1;
      this.field9 = class102.method264(var1, var2, var3, false, var4, var6, var5);
   }

   public void method3104(int var1, int var2, int var3, int var4) {
      this.field3 = var1;
      this.field8 = var2;
      this.field11 = var3;
      this.field10 = var4;
      this.field5 = this.field3 != 0 || this.field8 != 0 || this.field11 != 0 || this.field10 != 0;
   }

   public void method3105(int[] var1) {
      var1[0] = this.field3;
      var1[1] = this.field8;
      var1[2] = this.field11;
      var1[3] = this.field10;
   }

   public int method3106() {
      return this.field9.field321;
   }

   public int method3109() {
      return this.field9.field320 + this.field8 + this.field10;
   }

   public int method3108() {
      return this.field9.field320;
   }

   public void method3158(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field7.field6853) {
         int[] var7 = this.field7.method5051(var5, var6, var3, var4);
         if (var7 != null) {
            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] |= -16777216;
            }

            this.method3(var1, var2, var3, var4, var7, 0, var3);
         }
      } else {
         this.field9.method4211(var1, var2, var3, var4, var5, var6);
      }

   }

   public void method3115(int var1, int var2, int var3) {
      OpenGL.glPixelTransferf(3348, 0.5F);
      OpenGL.glPixelTransferf(3349, 0.499F);
      OpenGL.glPixelTransferf(3352, 0.5F);
      OpenGL.glPixelTransferf(3353, 0.499F);
      OpenGL.glPixelTransferf(3354, 0.5F);
      OpenGL.glPixelTransferf(3355, 0.499F);
      this.field4 = class102.method266(this.field7, var1, var2, this.field9.field321, this.field9.field320);
      this.field6 = var3;
      OpenGL.glPixelTransferf(3348, 1.0F);
      OpenGL.glPixelTransferf(3349, 0.0F);
      OpenGL.glPixelTransferf(3352, 1.0F);
      OpenGL.glPixelTransferf(3353, 0.0F);
      OpenGL.glPixelTransferf(3354, 1.0F);
      OpenGL.glPixelTransferf(3355, 0.0F);
   }

   class328(class13 var1, int var2, int var3, boolean var4) {
      this.field7 = var1;
      this.field9 = class102.method265(var1, var4 ? class264.field8191 : class264.field8194, class482.field8399, var2, var3);
   }

   void method1(int var1) {
      this.field7.method3638(1);
      this.field7.method3639(this.field9);
      this.field7.method3641(this.field7.method3671(var1), 7681);
      this.field7.method3642(1, 34167, 768);
      this.field7.method3669(0, 34168, 770);
      this.field7.method3638(0);
      this.field7.method3639(this.field4);
      this.field7.method3641(34479, 7681);
      this.field7.method3642(1, 34166, 768);
      if (this.field6 == 0) {
         this.field7.method3643(1.0F, 0.5F, 0.5F, 0.0F);
      } else if (this.field6 == 1) {
         this.field7.method3643(0.5F, 1.0F, 0.5F, 0.0F);
      } else if (this.field6 == 2) {
         this.field7.method3643(0.5F, 0.5F, 1.0F, 0.0F);
      } else if (this.field6 == 3) {
         this.field7.method3643(128.5F, 128.5F, 128.5F, 0.0F);
      }

   }

   void method2() {
      this.field7.method3638(1);
      this.field7.method3639((class203)null);
      this.field7.method3641(8448, 8448);
      this.field7.method3642(1, 34168, 768);
      this.field7.method3669(0, 5890, 770);
      this.field7.method3638(0);
      this.field7.method3642(1, 34168, 768);
   }

   public void method3114(int var1, int var2, int var3, int var4, int var5) {
      this.field9.method4289(false);
      this.field7.method3634();
      this.field7.method3649(var5);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      var1 += this.field3;
      var2 += this.field8;
      if (this.field4 == null) {
         this.field7.method3639(this.field9);
         this.field7.method3626(var3);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field9.field324);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.field9.field320);
         OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
         OpenGL.glVertex2i(var1 + this.field9.field321, var2 + this.field9.field320);
         OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
         OpenGL.glVertex2i(var1 + this.field9.field321, var2);
         OpenGL.glEnd();
      } else {
         this.method1(var3);
         this.field4.method4289(false);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9.field324);
         OpenGL.glTexCoord2f(0.0F, this.field9.field324);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + this.field9.field320);
         OpenGL.glMultiTexCoord2f(33985, this.field9.field322, 0.0F);
         OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
         OpenGL.glVertex2i(var1 + this.field9.field321, var2 + this.field9.field320);
         OpenGL.glMultiTexCoord2f(33985, this.field9.field322, this.field9.field324);
         OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
         OpenGL.glVertex2i(var1 + this.field9.field321, var2);
         OpenGL.glEnd();
         this.method2();
      }

   }

   public void method3137(int var1, int var2, class23 var3, int var4, int var5) {
      class944 var6 = (class944)var3;
      class102 var7 = var6.field3363;
      this.field9.method4289(false);
      this.field7.method3634();
      this.field7.method3639(this.field9);
      this.field7.method3626(1);
      this.field7.method3638(1);
      this.field7.method3639(var7);
      this.field7.method3641(7681, 8448);
      this.field7.method3642(0, 34168, 768);
      this.field7.method3649(1);
      var1 += this.field3;
      var2 += this.field8;
      int var8 = var1 + this.field9.field321;
      int var9 = var2 + this.field9.field320;
      float var10 = var7.field322 / (float)var7.field321;
      float var11 = var7.field324 / (float)var7.field320;
      float var12 = (float)(var1 - var4) * var10;
      float var13 = (float)(var8 - var4) * var10;
      float var14 = var7.field324 - (float)(var2 - var5) * var11;
      float var15 = var7.field324 - (float)(var9 - var5) * var11;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9.field324);
      OpenGL.glMultiTexCoord2f(33985, var12, var14);
      OpenGL.glVertex2i(var1, var2);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var12, var15);
      OpenGL.glVertex2i(var1, var2 + this.field9.field320);
      OpenGL.glMultiTexCoord2f(33984, this.field9.field322, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var13, var15);
      OpenGL.glVertex2i(var1 + this.field9.field321, var2 + this.field9.field320);
      OpenGL.glMultiTexCoord2f(33984, this.field9.field322, this.field9.field324);
      OpenGL.glMultiTexCoord2f(33985, var13, var14);
      OpenGL.glVertex2i(var1 + this.field9.field321, var2);
      OpenGL.glEnd();
      this.field7.method3642(0, 5890, 768);
      this.field7.method3626(0);
      this.field7.method3639((class203)null);
      this.field7.method3638(0);
   }

   void method3118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field9.method4289((var8 & 1) != 0);
      this.field7.method3634();
      this.field7.method3649(var7);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if (this.field5) {
         float var9 = (float)var3 / (float)this.method5594();
         float var10 = (float)var4 / (float)this.method3109();
         float var11 = (float)var1 + (float)this.field3 * var9;
         float var12 = (float)var2 + (float)this.field8 * var10;
         float var13 = var11 + (float)this.field9.field321 * var9;
         float var14 = var12 + (float)this.field9.field320 * var10;
         if (this.field4 == null) {
            this.field7.method3639(this.field9);
            this.field7.method3626(var5);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field9.field324);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
         } else {
            this.method1(var5);
            this.field4.method4289(true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9.field324);
            OpenGL.glTexCoord2f(0.0F, this.field9.field324);
            OpenGL.glVertex2f(var11, var12);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(var11, var14);
            OpenGL.glMultiTexCoord2f(33985, this.field9.field322, 0.0F);
            OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
            OpenGL.glVertex2f(var13, var14);
            OpenGL.glMultiTexCoord2f(33985, this.field9.field322, this.field9.field324);
            OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
            OpenGL.glVertex2f(var13, var12);
            OpenGL.glEnd();
            this.method2();
         }
      } else if (this.field4 == null) {
         this.field7.method3639(this.field9);
         this.field7.method3626(var5);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, this.field9.field324);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
      } else {
         this.method1(var5);
         this.field4.method4289(true);
         OpenGL.glBegin(7);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field9.field324);
         OpenGL.glTexCoord2f(0.0F, this.field9.field324);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var2 + var4);
         OpenGL.glMultiTexCoord2f(33985, this.field9.field322, 0.0F);
         OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
         OpenGL.glVertex2i(var1 + var3, var2 + var4);
         OpenGL.glMultiTexCoord2f(33985, this.field9.field322, this.field9.field324);
         OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
         OpenGL.glVertex2i(var1 + var3, var2);
         OpenGL.glEnd();
         this.method2();
      }

   }

   public void method3145(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1 + var3;
      int var9 = var2 + var4;
      this.field9.method4289(false);
      this.field7.method3634();
      this.field7.method3639(this.field9);
      this.field7.method3649(var7);
      this.field7.method3626(var5);
      OpenGL.glColor4ub((byte)(var6 >> 16), (byte)(var6 >> 8), (byte)var6, (byte)(var6 >> 24));
      if (this.field9.field323 && !this.field5) {
         float var18 = this.field9.field324 * (float)var4 / (float)this.field9.field320;
         float var19 = this.field9.field322 * (float)var3 / (float)this.field9.field321;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, var18);
         OpenGL.glVertex2i(var1, var2);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(var1, var9);
         OpenGL.glTexCoord2f(var19, 0.0F);
         OpenGL.glVertex2i(var8, var9);
         OpenGL.glTexCoord2f(var19, var18);
         OpenGL.glVertex2i(var8, var2);
         OpenGL.glEnd();
      } else {
         OpenGL.glPushMatrix();
         OpenGL.glTranslatef((float)this.field3, (float)this.field8, 0.0F);
         int var10 = this.method5594();
         int var11 = this.method3109();
         int var12 = var2 + this.field9.field320;
         OpenGL.glBegin(7);

         int var13;
         int var15;
         for(var13 = var2; var12 <= var9; var12 += var11) {
            int var14 = var1 + this.field9.field321;

            for(var15 = var1; var14 <= var8; var15 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.field9.field324);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
               OpenGL.glVertex2i(var14, var12);
               OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
               OpenGL.glVertex2i(var14, var13);
               var14 += var10;
            }

            if (var15 < var8) {
               float var16 = this.field9.field322 * (float)(var8 - var15) / (float)this.field9.field321;
               OpenGL.glTexCoord2f(0.0F, this.field9.field324);
               OpenGL.glVertex2i(var15, var13);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(var15, var12);
               OpenGL.glTexCoord2f(var16, 0.0F);
               OpenGL.glVertex2i(var8, var12);
               OpenGL.glTexCoord2f(var16, this.field9.field324);
               OpenGL.glVertex2i(var8, var13);
            }

            var13 += var11;
         }

         if (var13 < var9) {
            float var20 = this.field9.field324 * (float)(this.field9.field320 - (var9 - var13)) / (float)this.field9.field320;
            var15 = var1 + this.field9.field321;

            int var21;
            for(var21 = var1; var15 <= var8; var21 += var10) {
               OpenGL.glTexCoord2f(0.0F, this.field9.field324);
               OpenGL.glVertex2i(var21, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(this.field9.field322, var20);
               OpenGL.glVertex2i(var15, var9);
               OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
               OpenGL.glVertex2i(var15, var13);
               var15 += var10;
            }

            if (var21 < var8) {
               float var17 = this.field9.field322 * (float)(var8 - var21) / (float)this.field9.field321;
               OpenGL.glTexCoord2f(0.0F, this.field9.field324);
               OpenGL.glVertex2i(var21, var13);
               OpenGL.glTexCoord2f(0.0F, var20);
               OpenGL.glVertex2i(var21, var9);
               OpenGL.glTexCoord2f(var17, var20);
               OpenGL.glVertex2i(var8, var9);
               OpenGL.glTexCoord2f(var17, this.field9.field324);
               OpenGL.glVertex2i(var8, var13);
            }
         }

         OpenGL.glEnd();
         OpenGL.glPopMatrix();
      }

   }

   void method3125(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      float var11;
      float var12;
      if (this.field5) {
         var11 = (float)this.method5594();
         var12 = (float)this.method3109();
         float var13 = (var3 - var1) / var11;
         float var14 = (var4 - var2) / var11;
         float var15 = (var5 - var1) / var12;
         float var16 = (var6 - var2) / var12;
         float var17 = var15 * (float)this.field8;
         float var18 = var16 * (float)this.field8;
         float var19 = var13 * (float)this.field3;
         float var20 = var14 * (float)this.field3;
         float var21 = -var13 * (float)this.field11;
         float var22 = -var14 * (float)this.field11;
         float var23 = -var15 * (float)this.field10;
         float var24 = -var16 * (float)this.field10;
         var1 = var1 + var19 + var17;
         var2 = var2 + var20 + var18;
         var3 = var3 + var21 + var17;
         var4 = var4 + var22 + var18;
         var5 = var5 + var19 + var23;
         var6 = var6 + var20 + var24;
      }

      var11 = var5 + (var3 - var1);
      var12 = var4 + (var6 - var2);
      this.field9.method4289((var10 & 1) != 0);
      this.field7.method3634();
      this.field7.method3639(this.field9);
      this.field7.method3649(var9);
      this.field7.method3626(var7);
      OpenGL.glColor4ub((byte)(var8 >> 16), (byte)(var8 >> 8), (byte)var8, (byte)(var8 >> 24));
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, this.field9.field324);
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glTexCoord2f(this.field9.field322, 0.0F);
      OpenGL.glVertex2f(var11, var12);
      OpenGL.glTexCoord2f(this.field9.field322, this.field9.field324);
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
   }

   void method3127(float var1, float var2, float var3, float var4, float var5, float var6, int var7, class23 var8, int var9, int var10) {
      class102 var11 = ((class944)var8).field3363;
      float var12;
      float var13;
      float var14;
      float var15;
      if (this.field5) {
         var12 = (float)this.method5594();
         var13 = (float)this.method3109();
         var14 = (var3 - var1) / var12;
         var15 = (var4 - var2) / var12;
         float var16 = (var5 - var1) / var13;
         float var17 = (var6 - var2) / var13;
         float var18 = var16 * (float)this.field8;
         float var19 = var17 * (float)this.field8;
         float var20 = var14 * (float)this.field3;
         float var21 = var15 * (float)this.field3;
         float var22 = -var14 * (float)this.field11;
         float var23 = -var15 * (float)this.field11;
         float var24 = -var16 * (float)this.field10;
         float var25 = -var17 * (float)this.field10;
         var1 = var1 + var20 + var18;
         var2 = var2 + var21 + var19;
         var3 = var3 + var22 + var18;
         var4 = var4 + var23 + var19;
         var5 = var5 + var20 + var24;
         var6 = var6 + var21 + var25;
      }

      var12 = var5 + (var3 - var1);
      var13 = var4 + (var6 - var2);
      this.field9.method4289((var7 & 1) != 0);
      this.field7.method3634();
      this.field7.method3639(this.field9);
      this.field7.method3626(1);
      this.field7.method3638(1);
      this.field7.method3639(var11);
      this.field7.method3641(7681, 8448);
      this.field7.method3642(0, 34168, 768);
      this.field7.method3649(1);
      var14 = var11.field322 / (float)var11.field321;
      var15 = var11.field324 / (float)var11.field320;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field9.field324);
      OpenGL.glMultiTexCoord2f(33985, var14 * (var1 - (float)var9), var11.field324 - var15 * (var2 - (float)var10));
      OpenGL.glVertex2f(var1, var2);
      OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var14 * (var5 - (float)var9), var11.field324 - var15 * (var6 - (float)var10));
      OpenGL.glVertex2f(var5, var6);
      OpenGL.glMultiTexCoord2f(33984, this.field9.field322, 0.0F);
      OpenGL.glMultiTexCoord2f(33985, var14 * (var12 - (float)var9), var11.field324 - var15 * (var13 - (float)var10));
      OpenGL.glVertex2f(var12, var13);
      OpenGL.glMultiTexCoord2f(33984, this.field9.field322, this.field9.field324);
      OpenGL.glMultiTexCoord2f(33985, var14 * (var3 - (float)var9), var11.field324 - var15 * (var4 - (float)var10));
      OpenGL.glVertex2f(var3, var4);
      OpenGL.glEnd();
      this.field7.method3642(0, 5890, 768);
      this.field7.method3626(0);
      this.field7.method3639((class203)null);
      this.field7.method3638(0);
   }

   void method3(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.field9.method4214(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public int method5594() {
      return this.field9.field321 + this.field3 + this.field11;
   }

   public class813 method3110() {
      return this.field9.method4215(0);
   }
}
