import jaggl.OpenGL;

public class class592 extends class714 implements class33 {
   int field1645;
   int field1646;

   public boolean method2880() {
      return super.method2102();
   }

   public float method2874(float var1) {
      return var1;
   }

   class592(class608 var1, class264 var2, int var3, int var4, byte[] var5, int var6, int var7) {
      super(var1, 34037, var2, class482.field8399, var3 * var4, false);
      this.field1646 = var3;
      this.field1645 = var4;
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexImage2Dub(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var3, var4, 0, class608.method5076(this.field3602), 5121, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   class592(class608 var1, class264 var2, int var3, int var4, float[] var5, int var6, int var7) {
      super(var1, 34037, var2, class482.field8403, var3 * var4, false);
      this.field1646 = var3;
      this.field1645 = var4;
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexImage2Df(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var3, var4, 0, class608.method5076(this.field3602), 5126, var5, var6 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method2868(boolean var1, boolean var2) {
   }

   public void method5696() {
      super.method5693();
   }

   public float method2846(float var1) {
      return var1;
   }

   public void method5695() {
      super.method5703();
   }

   public boolean method2848() {
      return false;
   }

   public void method2849(boolean var1, boolean var2) {
   }

   public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (var7 == 0) {
         var7 = var3;
      }

      this.field3605.method617(this);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public void method5693() {
      super.method5693();
   }

   public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field1646 * this.field1645];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field1646, var5, var6 + var8 * var3, var3);
      }

   }

   public class813 method3326(int var1) {
      return new class594(this, var1);
   }

   public class813 method3327(int var1) {
      return new class594(this, var1);
   }

   public void method5703() {
      super.method5703();
   }

   public void method5694(class566 var1) {
      super.method5694(var1);
   }

   public void method2869(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (var8 == 0) {
         var8 = var3;
      }

      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public void method5702(class566 var1) {
      super.method5694(var1);
   }

   public void method5701() {
      super.method5693();
   }

   public void method5698() {
      super.method5693();
   }

   public int method2855() {
      return this.field1646;
   }

   public int method2844() {
      return this.field1645;
   }

   public int method2853() {
      return this.field1645;
   }

   public int method2857() {
      return this.field1645;
   }

   public float method2858(float var1) {
      return var1;
   }

   public float method2859(float var1) {
      return var1;
   }

   public float method2860(float var1) {
      return var1;
   }

   class592(class608 var1, class264 var2, class482 var3, int var4, int var5) {
      super(var1, 34037, var2, var3, var4 * var5, false);
      this.field1646 = var4;
      this.field1645 = var5;
      this.field3605.method617(this);
      OpenGL.glTexImage2Dub(this.field3598, 0, class608.method5077(this.field3602, this.field3603), var4, var5, 0, class608.method5076(this.field3602), class608.method5081(this.field3603), (byte[])null, 0);
   }

   public float method2878(float var1) {
      return var1;
   }

   public float method2863(float var1) {
      return var1;
   }

   public float method2864(float var1) {
      return var1;
   }

   public void method2865(boolean var1, boolean var2) {
   }

   public void method2866(boolean var1, boolean var2) {
   }

   public void method2867(boolean var1, boolean var2) {
   }

   public void method2851(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (var8 == 0) {
         var8 = var3;
      }

      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   class592(class608 var1, int var2, int var3, int[] var4, int var5, int var6) {
      super(var1, 34037, class264.field8191, class482.field8399, var2 * var3, false);
      this.field1646 = var2;
      this.field1645 = var3;
      this.field3605.method617(this);
      OpenGL.glPixelStorei(3314, var6);
      OpenGL.glTexImage2Di(this.field3598, 0, 6408, this.field1646, this.field1645, 0, 32993, this.field3605.field8627, var4, var5 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   public void method2870(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (var7 == 0) {
         var7 = var3;
      }

      this.field3605.method617(this);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public void method2871(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (var7 == 0) {
         var7 = var3;
      }

      this.field3605.method617(this);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.field3598, 0, var1, var2, var3, var4, 32993, this.field3605.field8627, var5, var6);
      if (var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public void method2873(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (var8 == 0) {
         var8 = var3;
      }

      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public int method2861() {
      return this.field1646;
   }

   public void method2856(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (var8 == 0) {
         var8 = var3;
      }

      this.field3605.method617(this);
      OpenGL.glPixelStorei(3317, 1);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.field3598, 0, var1, var2, var3, var4, class608.method5076(var6), 5121, var5, var7);
      if (var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public void method2875(boolean var1, boolean var2) {
   }

   public void method2876(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field1646 * this.field1645];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field1646, var5, var6 + var8 * var3, var3);
      }

   }

   public boolean method2877() {
      return super.method2102();
   }

   public void method5704(class566 var1) {
      super.method5694(var1);
   }

   public void method5699() {
      super.method5703();
   }

   public void method5700() {
      super.method5703();
   }

   public int method2845() {
      return this.field1645;
   }

   public class813 method3330(int var1) {
      return new class594(this, var1);
   }

   public void method5697(class566 var1) {
      super.method5694(var1);
   }

   public boolean method2872() {
      return super.method2102();
   }

   public class813 method3329(int var1) {
      return new class594(this, var1);
   }

   public class813 method3328(int var1) {
      return new class594(this, var1);
   }

   public float method2847(float var1) {
      return var1;
   }

   public void method2862(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.field1646 * this.field1645];
      this.field3605.method617(this);
      OpenGL.glGetTexImagei(this.field3598, 0, 32993, 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.field1646, var5, var6 + var8 * var3, var3);
      }

   }

   public boolean method2879() {
      return false;
   }

   public boolean method2854() {
      return false;
   }
}
