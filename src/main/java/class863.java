import jaggl.OpenGL;

public class class863 extends class714 implements class891 {
   static int field8927 = 34069;

   public void method5703() {
      super.method5703();
   }

   public void method5693() {
      super.method5693();
   }

   class863(class608 var1, int var2, boolean var3, int[][] var4) {
      super(var1, 34067, class264.field8191, class482.field8399, var2 * var2 * 6, var3);
      super.field3605.method617(this);
      int var5;
      if (var3) {
         for(var5 = 0; var5 < 6; ++var5) {
            this.method2103('蔕' + var5, var2, var2, var4[var5]);
         }
      } else {
         for(var5 = 0; var5 < 6; ++var5) {
            OpenGL.glTexImage2Di('蔕' + var5, 0, class608.method5077(super.field3602, super.field3603), var2, var2, 0, class608.method5076(super.field3602), super.field3605.field8627, var4[var5], 0);
         }
      }

   }

   public void method5694(class566 var1) {
      super.method5694(var1);
   }
}
