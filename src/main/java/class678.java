import jaggl.OpenGL;

public class class678 extends class203 {
   int field7457;
   int field7458;

   class678(class13 var1, int var2, class264 var3, class482 var4, int var5, int var6, boolean var7, byte[] var8, class264 var9, boolean var10) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.field7457 = var5;
      this.field7458 = var6;
      if (var10) {
         byte[] var11 = new byte[var8.length];

         for(int var12 = 0; var12 < var6; ++var12) {
            int var13 = var12 * var5;
            int var14 = (var6 - var12 - 1) * var5;

            for(int var15 = 0; var15 < var5; ++var15) {
               var11[var13++] = var8[var14++];
            }
         }

         var8 = var11;
      }

      this.field7571.method3639(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var7 && this.field7562 != 34037) {
         method4291(var2, class13.method3657(this.field7567, this.field7568), var5, var6, var9, var8);
         this.method4293(true);
      } else {
         OpenGL.glTexImage2Dub(this.field7562, 0, class13.method3657(this.field7567, this.field7568), this.field7457, this.field7458, 0, class13.method3611(var9), 5121, var8, 0);
         this.method4293(false);
      }

      OpenGL.glPixelStorei(3317, 4);
      this.method4289(true);
   }

   class678(class13 var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7, int var8, boolean var9) {
      super(var1, var2, class264.field8191, class482.field8399, var3 * var4, var5);
      this.field7457 = var3;
      this.field7458 = var4;
      if (var9) {
         int[] var10 = new int[var6.length];

         for(int var11 = 0; var11 < var4; ++var11) {
            int var12 = var11 * var3;
            int var13 = (var4 - var11 - 1) * var3;

            for(int var14 = 0; var14 < var3; ++var14) {
               var10[var12++] = var6[var13++];
            }
         }

         var6 = var10;
      }

      this.field7571.method3639(this);
      if (this.field7562 != 34037 && var5 && var7 == 0 && var8 == 0) {
         method4290(this.field7562, class13.method3657(this.field7567, this.field7568), this.field7457, this.field7458, 32993, this.field7571.field6873, var6);
         this.method4293(true);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.field7562, 0, class13.method3657(this.field7567, this.field7568), this.field7457, this.field7458, 0, 32993, this.field7571.field6873, var6, var8 * 4);
         OpenGL.glPixelStorei(3314, 0);
         this.method4293(false);
      }

      this.method4289(true);
   }

   void method4211(int var1, int var2, int var3, int var4, int var5, int var6) {
      class783 var7 = this.field7571.method4800((short)-5396);
      if (var7 != null) {
         int var8 = var7.method2493() - (var6 + var4);
         this.field7571.method3639(this);
         OpenGL.glCopyTexSubImage2D(this.field7562, 0, var1, this.field7458 - (var2 + var4), var5, var8, var3, var4);
         OpenGL.glFlush();
      }

   }

   class678(class13 var1, int var2, class264 var3, class482 var4, int var5, int var6, boolean var7, float[] var8, class264 var9) {
      super(var1, var2, var3, var4, var5 * var6, var7);
      this.field7457 = var5;
      this.field7458 = var6;
      this.field7571.method3639(this);
      if (var7 && this.field7562 != 34037) {
         method4294(var2, class13.method3657(this.field7567, this.field7568), var5, var6, var9, var8);
         this.method4293(true);
      } else {
         OpenGL.glTexImage2Df(this.field7562, 0, class13.method3657(this.field7567, this.field7568), this.field7457, this.field7458, 0, class13.method3611(var9), 5126, var8, 0);
         this.method4293(false);
      }

      this.method4289(true);
   }

   void method4212(boolean var1, boolean var2) {
      if (this.field7562 == 3553) {
         this.field7571.method3639(this);
         OpenGL.glTexParameteri(this.field7562, 10242, var1 ? 10497 : '脯');
         OpenGL.glTexParameteri(this.field7562, 10243, var2 ? 10497 : '脯');
      }

   }

   void method4213(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8, boolean var9) {
      if (var8 == 0) {
         var8 = var3;
      }

      if (var9) {
         int var10 = var6.field8190 * 845115459;
         int var11 = var10 * var3;
         int var12 = var10 * var8;
         byte[] var13 = new byte[var11 * var4];

         for(int var14 = 0; var14 < var4; ++var14) {
            int var15 = var14 * var11;
            int var16 = (var4 - var14 - 1) * var12 + var7;

            for(int var17 = 0; var17 < var11; ++var17) {
               var13[var15++] = var5[var16++];
            }
         }

         var5 = var13;
      }

      this.field7571.method3639(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.field7562, 0, var1, this.field7458 - var2 - var4, var3, var4, class13.method3611(var6), 5121, var5, var7);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   void method4214(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, boolean var8) {
      if (var7 == 0) {
         var7 = var3;
      }

      if (var8) {
         int[] var9 = new int[var3 * var4];

         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var10 * var3;
            int var12 = (var4 - var10 - 1) * var7 + var6;

            for(int var13 = 0; var13 < var3; ++var13) {
               var9[var11++] = var5[var12++];
            }
         }

         var5 = var9;
      }

      this.field7571.method3639(this);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.field7562, 0, var1, this.field7458 - var2 - var4, var3, var4, 32993, this.field7571.field6873, var5, var6);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   class678(class13 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, class264.field8194, class482.field8399, var5 * var6, false);
      this.field7457 = var5;
      this.field7458 = var6;
      this.field7571.method3639(this);
      class783 var7 = this.field7571.method4800((short)-8855);
      if (var7 != null) {
         int var8 = var7.method2493() - (var4 + var6);
         int var9 = class13.method3657(this.field7567, this.field7568);
         OpenGL.glCopyTexImage2D(this.field7562, 0, var9, var3, var8, var5, var6, 0);
      }

      this.method4289(true);
   }

   class813 method4215(int var1) {
      return new class789(this, var1);
   }

   class678(class13 var1, int var2, class264 var3, class482 var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5 * var6, false);
      this.field7457 = var5;
      this.field7458 = var6;
      this.field7571.method3639(this);
      OpenGL.glTexImage2Dub(this.field7562, 0, class13.method3657(this.field7567, this.field7568), var5, var6, 0, class13.method3611(this.field7567), 5121, (byte[])null, 0);
      this.method4289(true);
   }

   class893 method4216(int var1) {
      return new class789(this, var1);
   }
}
