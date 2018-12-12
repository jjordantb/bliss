import jaggl.OpenGL;

public class class315 extends class655 {
   class588 field493;
   int[] field494 = null;

   public final int method5614(int var1) {
      return this.field494[var1];
   }

   final int method430() {
      return this.field494[this.field493.method4059(1643025495)];
   }

   public boolean method5619(int var1) {
      if (this.field494 == null) {
         this.field494 = new int[this.field493.method4054(-1467018991)];
      }

      class194 var2 = (class194)this.field493.method4095(var1, 1345565445);
      this.field494[var1] = OpenGL.glGetUniformLocation(var2.field6979, this.method5616((byte)1));
      return this.field494[var1] != -1;
   }

   class315(class588 var1, class151 var2) {
      super(var2);
      this.field493 = var1;
   }
}
