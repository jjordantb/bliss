import jaggl.OpenGL;

public class class546 extends class203 {
   int field3830;
   int field3831;
   int field3832;

   class546(class13 var1, class264 var2, class482 var3, int var4, int var5, int var6) {
      super(var1, 32879, var2, var3, var4 * var5 * var6, false);
      this.field3831 = var4;
      this.field3832 = var5;
      this.field3830 = var6;
      super.field7571.method3639(this);
      OpenGL.glTexImage3Dub(super.field7562, 0, class13.method3657(super.field7567, super.field7568), this.field3831, this.field3832, this.field3830, 0, class13.method3611(super.field7567), 5121, (byte[])null, 0);
      this.method4289(true);
   }

   void method2394(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super.field7571.method3639(this);
      OpenGL.glCopyTexSubImage3D(super.field7562, 0, var1, var2, var3, var6, var7, var4, var5);
      OpenGL.glFlush();
   }

   class546(class13 var1, class264 var2, class482 var3, int var4, int var5, int var6, byte[] var7, class264 var8) {
      super(var1, 32879, var2, var3, var4 * var5 * var6, false);
      this.field3831 = var4;
      this.field3832 = var5;
      this.field3830 = var6;
      super.field7571.method3639(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(super.field7562, 0, class13.method3657(super.field7567, super.field7568), this.field3831, this.field3832, this.field3830, 0, class13.method3611(var8), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method4289(true);
   }
}
