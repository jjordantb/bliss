import jaggl.OpenGL;

public class class196 extends class714 implements class33 {
   int field6997;
   int field6998;

   public int method2853() {
      return this.field6997;
   }

   class196(class608 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, 3553, class264.field8191, class482.field8399, var2 * var3, var4);
      this.field6998 = var2;
      this.field6997 = var3;
      this.field3605.method617(this);
      if (var4 && var7 == 0 && var6 == 0) {
         this.method2103(this.field3598, var2, var3, var5);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.field3598, 0, 6408, this.field6998, this.field6997, 0, 32993, this.field3605.field8627, var5, var6 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   class196(class608 var1, class264 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, 3553, var2, class482.field8399, var3 * var4, var5);
      this.field6998 = var3;
      this.field6997 = var4;
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var5 && var8 == 0 && var7 == 0) {
         this.method2107(this.field3598, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         class264 var9 = this.field3602;
         class264 var10000 = this.field3602;
         if (var9 == class264.field8198) {
            OpenGL.glCompressedTexImage2Dub(this.field3598, 0, 33777, var3, var4, 0, var3 * var4 / 2, var6, var7);
         } else {
            class264 var10 = this.field3602;
            var10000 = this.field3602;
            if (var10 == class264.field8192) {
               OpenGL.glCompressedTexImage2Dub(this.field3598, 0, 33779, var3, var4, 0, var3 * var4, var6, var7);
            } else {
               OpenGL.glTexImage2Dub(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var3, var4, 0, class608.method5076(this.field3602), 5121, var6, var7);
            }
         }

         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public void method5694(class566 var1) {
      super.method5694(var1);
   }

   public void method5700() {
      super.method5703();
   }

   public int method2845() {
      return this.field6997;
   }

   public boolean method2879() {
      return true;
   }

   public float method2847(float var1) {
      return var1 / (float)this.field6997;
   }

   public boolean method2848() {
      return true;
   }

   public void method2873(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public int method2855() {
      return this.field6998;
   }

   public void method2851(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field6998 * this.field6997];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field6998, var5, var6 + var8 * var3, var3);
      }

   }

   public class813 method3326(int var1) {
      return new class826(this, var1);
   }

   public boolean method2854() {
      return true;
   }

   public void method5699() {
      super.method5703();
   }

   public class813 method3330(int var1) {
      return new class826(this, var1);
   }

   public void method5693() {
      super.method5693();
   }

   public void method2862(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field6998 * this.field6997];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field6998, var5, var6 + var8 * var3, var3);
      }

   }

   public void method5701() {
      super.method5693();
   }

   public void method5698() {
      super.method5693();
   }

   public float method2878(float var1) {
      return var1 / (float)this.field6997;
   }

   public int method2844() {
      return this.field6997;
   }

   public void method2871(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   public int method2857() {
      return this.field6997;
   }

   public float method2858(float var1) {
      return var1 / (float)this.field6998;
   }

   public float method2859(float var1) {
      return var1 / (float)this.field6998;
   }

   public float method2860(float var1) {
      return var1 / (float)this.field6998;
   }

   public float method2874(float var1) {
      return var1 / (float)this.field6997;
   }

   public float method2846(float var1) {
      return var1 / (float)this.field6998;
   }

   public float method2863(float var1) {
      return var1 / (float)this.field6997;
   }

   public void method5696() {
      super.method5693();
   }

   public void method2865(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2866(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2867(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2875(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2868(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2870(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method5704(class566 var1) {
      super.method5694(var1);
   }

   public void method5702(class566 var1) {
      super.method5694(var1);
   }

   class196(class608 var1, class264 var2, class482 var3, int var4, int var5) {
      super(var1, 3553, var2, var3, var4 * var5, false);
      this.field6998 = var4;
      this.field6997 = var5;
      this.field3605.method617(this);
      OpenGL.glTexImage2Dub(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var4, var5, 0, class608.method5076(this.field3602), class608.method5081(this.field3603), (byte[])null, 0);
   }

   public void method2856(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public void method2849(boolean var1, boolean var2) {
      this.field3605.method617(this);
      OpenGL.glTexParameteri(this.field3598, 10242, var1 ? 10497 : '脯');
      OpenGL.glTexParameteri(this.field3598, 10243, var2 ? 10497 : '脯');
   }

   public void method2876(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field6998 * this.field6997];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field6998, var5, var6 + var8 * var3, var3);
      }

   }

   public boolean method2877() {
      return super.method2102();
   }

   public boolean method2880() {
      return super.method2102();
   }

   public float method2864(float var1) {
      return var1 / (float)this.field6997;
   }

   void method3718(int var1, int var2, int var3, int var4, float[] var5, class264 var6, int var7, int var8) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Df(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method5695() {
      super.method5703();
   }

   public void method5703() {
      super.method5703();
   }

   public void method5697(class566 var1) {
      super.method5694(var1);
   }

   public void method2869(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public class813 method3329(int var1) {
      return new class826(this, var1);
   }

   public class813 method3328(int var1) {
      return new class826(this, var1);
   }

   public class813 method3327(int var1) {
      return new class826(this, var1);
   }

   class196(class608 var1, class264 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, 3553, var2, class482.field8403, var3 * var4, var5);
      this.field6998 = var3;
      this.field6997 = var4;
      this.field3605.method617(this);
      if (var5 && var8 == 0 && var7 == 0) {
         this.method2104(this.field3598, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         OpenGL.glTexImage2Df(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var3, var4, 0, class608.method5076(this.field3602), 5126, var6, var7 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public boolean method2872() {
      return super.method2102();
   }

   public int method2861() {
      return this.field6998;
   }
}
