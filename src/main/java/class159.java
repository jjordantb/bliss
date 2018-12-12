import jaggl.OpenGL;

public class class159 extends class714 implements class332 {
   int field6427;
   int field6428;
   int field6429;

   class159(class608 var1, class264 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, 32879, var2, class482.field8399, var3 * var4 * var5, var6);
      this.field6428 = var3;
      this.field6429 = var4;
      this.field6427 = var5;
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.field3598, 0, class608.method5077(this.field3602, this.field3603), this.field6428, this.field6429, this.field6427, 0, class608.method5076(this.field3602), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      if (var6) {
         this.method2102();
      }

   }

   public void method5703() {
      super.method5703();
   }

   public void method5701() {
      super.method5693();
   }

   public void method5693() {
      super.method5693();
   }

   public void method5704(class566 var1) {
      super.method5694(var1);
   }

   public void method5696() {
      super.method5693();
   }

   public void method5698() {
      super.method5693();
   }

   public void method5699() {
      super.method5703();
   }

   public void method5700() {
      super.method5703();
   }

   public void method5694(class566 var1) {
      super.method5694(var1);
   }

   public void method5702(class566 var1) {
      super.method5694(var1);
   }

   public void method5697(class566 var1) {
      super.method5694(var1);
   }

   public void method5695() {
      super.method5703();
   }
}
