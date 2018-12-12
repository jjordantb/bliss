import jaggl.OpenGL;

public class class301 extends class9 {
   class212 field3810;
   static char field3811 = '\u0001';
   static char field3812 = 0;
   class41 field3813;
   class604 field3814;
   static float[] field3815 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};

   void method3012(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   boolean method2997() {
      return true;
   }

   void method3014(boolean var1) {
      this.field4965.method3641(260, 8448);
   }

   class301(class13 var1, class604 var2) {
      super(var1);
      this.field3814 = var2;
      this.method2373();
      this.field3810 = new class212(this.field4965, class264.field8201, class482.field8399, 2, new byte[]{0, -1}, class264.field8201);
      this.field3810.method3879(false);
   }

   void method2999(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   void method2996(class203 var1, int var2) {
   }

   void method3004(boolean var1) {
      this.field4965.method3641(260, 8448);
   }

   void method3002(boolean var1) {
      if (this.field4965.field6694 > 0) {
         float var2 = -0.5F / (float)this.field4965.field6694;
         this.field4965.method3638(1);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = var2;
         field3815[3] = this.field4965.field6829 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, field3815, 0);
         OpenGL.glPopMatrix();
         this.field4965.method3621(0.5F, (float)this.field4965.field6694);
         this.field4965.method3639(this.field3810);
         this.field4965.method3638(0);
      }

      this.field3813.method3055('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   void method3003(boolean var1) {
      if (this.field4965.field6694 > 0) {
         float var2 = -0.5F / (float)this.field4965.field6694;
         this.field4965.method3638(1);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = var2;
         field3815[3] = this.field4965.field6829 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, field3815, 0);
         OpenGL.glPopMatrix();
         this.field4965.method3621(0.5F, (float)this.field4965.field6694);
         this.field4965.method3639(this.field3810);
         this.field4965.method3638(0);
      }

      this.field3813.method3055('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   void method3007() {
      this.field3813.method3055('\u0001');
      if (this.field4965.field6694 > 0) {
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3621(1.0F, 0.0F);
         this.field4965.method3638(0);
      }

      this.field4965.method3641(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method3005(boolean var1) {
      this.field4965.method3641(260, 8448);
   }

   void method3006(boolean var1) {
      this.field4965.method3641(260, 8448);
   }

   void method2373() {
      this.field3813 = new class41(this.field4965, 2);
      this.field3813.method3056(0);
      this.field4965.method3638(1);
      this.field4965.method3641(7681, 260);
      this.field4965.method3642(0, 34168, 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glEnable(3168);
      this.field4965.method3638(0);
      OpenGL.glTexEnvf(8960, 34163, 2.0F);
      if (this.field3814.field8716) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glTexGeni(8195, 9472, 9217);
         OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
         OpenGL.glEnable(3170);
         OpenGL.glEnable(3171);
      }

      this.field3813.method3054();
      this.field3813.method3056(1);
      this.field4965.method3638(1);
      this.field4965.method3641(8448, 8448);
      this.field4965.method3642(0, 5890, 768);
      OpenGL.glDisable(3168);
      this.field4965.method3638(0);
      OpenGL.glTexEnvf(8960, 34163, 1.0F);
      if (this.field3814.field8716) {
         OpenGL.glDisable(3170);
         OpenGL.glDisable(3171);
      }

      this.field3813.method3054();
   }

   void method3000() {
      this.field3813.method3055('\u0001');
      if (this.field4965.field6694 > 0) {
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3621(1.0F, 0.0F);
         this.field4965.method3638(0);
      }

      this.field4965.method3641(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method3009(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   void method2998(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   void method3008() {
      this.field3813.method3055('\u0001');
      if (this.field4965.field6694 > 0) {
         this.field4965.method3638(1);
         this.field4965.method3639((class203)null);
         this.field4965.method3621(1.0F, 0.0F);
         this.field4965.method3638(0);
      }

      this.field4965.method3641(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method3001(boolean var1) {
      if (this.field4965.field6694 > 0) {
         float var2 = -0.5F / (float)this.field4965.field6694;
         this.field4965.method3638(1);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = var2;
         field3815[3] = this.field4965.field6829 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, field3815, 0);
         OpenGL.glPopMatrix();
         this.field4965.method3621(0.5F, (float)this.field4965.field6694);
         this.field4965.method3639(this.field3810);
         this.field4965.method3638(0);
      }

      this.field3813.method3055('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   void method3013(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   void method3010(class203 var1, int var2) {
   }

   void method3011(int var1, int var2) {
      if ((var1 & 1) == 1) {
         if (this.field3814.field8716) {
            this.field4965.method3639(this.field3814.field8718);
            field3815[0] = 0.0F;
            field3815[1] = 0.0F;
            field3815[2] = 0.0F;
            field3815[3] = (float)(this.field4965.field6749 % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, field3815, 0);
         } else {
            int var3 = this.field4965.field6749 % 4000 * 16 / 4000;
            this.field4965.method3639(this.field3814.field8723[var3]);
         }
      } else if (this.field3814.field8716) {
         this.field4965.method3639(this.field3814.field8718);
         field3815[0] = 0.0F;
         field3815[1] = 0.0F;
         field3815[2] = 0.0F;
         field3815[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, field3815, 0);
      } else {
         this.field4965.method3639(this.field3814.field8723[0]);
      }

   }

   boolean method3016() {
      return true;
   }

   void method3015(class203 var1, int var2) {
   }
}
