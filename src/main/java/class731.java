import jaggl.OpenGL;

public class class731 implements class813, class893, class288 {
   int field2605;
   class264 field2606;
   class482 field2607;
   int field2608;
   class608 field2609;
   int field2610;

   public int method2343() {
      return this.field2608;
   }

   public void method6700(int var1) {
      OpenGL.glFramebufferRenderbufferEXT(36160, var1, 36161, this.field2605);
   }

   public void method2755() {
      if (this.field2605 > 0) {
         int[] var1 = new int[]{this.field2605};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.field2605 = 0;
      }

   }

   public int method2344() {
      return this.field2610;
   }

   class731(class608 var1, class264 var2, class482 var3, int var4, int var5) {
      this.field2606 = var2;
      this.field2607 = var3;
      this.field2608 = var4;
      this.field2610 = var5;
      this.field2609 = var1;
      int[] var6 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var6, 0);
      this.field2605 = var6[0];
      OpenGL.glBindRenderbufferEXT(36161, this.field2605);
      OpenGL.glRenderbufferStorageEXT(36161, class608.method5077(this.field2606, this.field2607), var4, var5);
   }
}
