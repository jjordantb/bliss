import jaggl.OpenGL;

public class class789 implements class430 {
   int field413;
   class678 field414;

   public int method2343() {
      return this.field414.field7457;
   }

   public int method2344() {
      return this.field414.field7458;
   }

   public void method4232(int var1) {
      OpenGL.glFramebufferTexture2DEXT(36160, var1, this.field414.field7562, this.field414.field7566, this.field413);
   }

   public void method2755() {
   }

   class789(class678 var1, int var2) {
      this.field413 = var2;
      this.field414 = var1;
   }
}
