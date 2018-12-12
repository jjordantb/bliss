import jaggl.OpenGL;

public class class100 implements class430 {
   int field275;
   int field276;
   class169 field277;

   class100(class169 var1, int var2, int var3) {
      this.field276 = var3;
      this.field277 = var1;
      this.field275 = var2;
   }

   public void method4232(int var1) {
      OpenGL.glFramebufferTexture2DEXT(36160, var1, this.field275, this.field277.field7566, this.field276);
   }

   public void method2755() {
   }

   public int method2344() {
      return this.field277.field6687;
   }

   public int method2343() {
      return this.field277.field6687;
   }
}
