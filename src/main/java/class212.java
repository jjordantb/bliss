import jaggl.OpenGL;

public class class212 extends class203 {
   int field7224;

   void method3879(boolean var1) {
      this.field7571.method3639(this);
      OpenGL.glTexParameteri(this.field7562, 10242, var1 ? 10497 : '脯');
   }

   class212(class13 var1, class264 var2, class482 var3, int var4, byte[] var5, class264 var6) {
      super(var1, 3552, var2, var3, var4, false);
      this.field7224 = var4;
      this.field7571.method3639(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage1Dub(this.field7562, 0, class13.method3657(this.field7567, this.field7568), this.field7224, 0, class13.method3611(var6), 5121, var5, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method4289(true);
   }
}
