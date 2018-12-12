import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class class641 extends class40 implements class801 {
   int field10189;
   int field10190;
   boolean field10191;
   boolean field10192;

   public float method2863(float var1) {
      return var1 / (float)this.field10190;
   }

   public boolean method2872() {
      return false;
   }

   class641(class927 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, class264.field8191, class482.field8399, var4 && var1.field10240, var2 * var3);
      if (!this.field5087.field10259) {
         this.field10189 = class18.method3687(var2, (byte)16);
         this.field10190 = class18.method3687(var3, (byte)16);
      } else {
         this.field10189 = var2;
         this.field10190 = var3;
      }

      if (var4) {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 0, 1024, 21, 1);
      } else {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 1, 0, 21, 1);
      }

      if (var7 == 0) {
         var7 = var2;
      }

      ByteBuffer var8 = this.field5087.field660;
      var8.clear();
      var8.asIntBuffer().put(var5, var6, var7 * var3);
      IDirect3DTexture.Upload(this.field5084, 0, 0, 0, var2, var3, var7 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
   }

   class641(class927 var1, class264 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, var2, class482.field8399, var5 && var1.field10240, var3 * var4);
      if (!this.field5087.field10259) {
         this.field10189 = class18.method3687(var3, (byte)16);
         this.field10190 = class18.method3687(var4, (byte)16);
      } else {
         this.field10189 = var3;
         this.field10190 = var4;
      }

      if (var5) {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 0, 1024, class927.method6212(this.field5086, class482.field8399), 1);
      } else {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 1, 0, class927.method6212(this.field5086, class482.field8399), 1);
      }

      if (var8 == 0) {
         var8 = var3;
      }

      ByteBuffer var9 = this.field5087.field660;
      var9.clear();
      class264 var10 = this.field5086;
      class264 var10000 = this.field5086;
      if (var10 == class264.field8198) {
         var9.put(var6, var7, var4 * var3 / 2);
         IDirect3DTexture.Upload(this.field5084, 0, 0, 0, var3, var4 / 4, var3 / 4 * 8, 0, this.field5087.field661);
      } else {
         class264 var11 = this.field5086;
         var10000 = this.field5086;
         if (var11 == class264.field8192) {
            var9.put(var6, var7, var4 * var3);
            IDirect3DTexture.Upload(this.field5084, 0, 0, 0, var3, var4 / 4, var3 / 4 * 16, 0, this.field5087.field661);
         } else {
            var9.put(var6, var7, var8 * var4);
            IDirect3DTexture.Upload(this.field5084, 0, 0, 0, var3, var4, var8 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
         }
      }

   }

   class641(class927 var1, class264 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, var2, class482.field8399, var5 && var1.field10240, var3 * var4);
      if (!this.field5087.field10259) {
         this.field10189 = class18.method3687(var3, (byte)16);
         this.field10190 = class18.method3687(var4, (byte)16);
      } else {
         this.field10189 = var3;
         this.field10190 = var4;
      }

      if (var5) {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 0, 1024, class927.method6212(this.field5086, class482.field8403), 1);
      } else {
         this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, this.field10189, this.field10190, 1, 0, class927.method6212(this.field5086, class482.field8403), 1);
      }

      if (var8 == 0) {
         var8 = var3;
      }

      ByteBuffer var9 = this.field5087.field660;
      var9.clear();
      var9.asFloatBuffer().put(var6, var7, var8 * var4 * this.field5086.field8190 * 845115459);
      IDirect3DTexture.Upload(this.field5084, 0, 0, 0, var3, var4, var8 * this.field5086.field8190 * 845115459 * 4, 0, this.field5087.field661);
   }

   public int method2861() {
      return this.field10189;
   }

   public void method5700() {
      this.field5087.method6228(this);
   }

   public float method2846(float var1) {
      return var1 / (float)this.field10189;
   }

   public float method2847(float var1) {
      return var1 / (float)this.field10190;
   }

   public void method2866(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   long method3058() {
      return this.field5084;
   }

   public boolean method2848() {
      return true;
   }

   public void method2849(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   public void method2870(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         if (var7 == 0) {
            var7 = var3;
         }

         ByteBuffer var8 = this.field5087.field660;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var7 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method2851(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (this.field5086 == var6 && this.field5085 == class482.field8399) {
         if (var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = this.field5087.field660;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var8 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         ByteBuffer var7 = this.field5087.field660;
         var7.clear();
         IDirect3DTexture.Download(this.field5084, 0, var1, var2, var3, var4, var3 * 4, 0, this.field5087.field661);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public int method2855() {
      return this.field10189;
   }

   public void method2876(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         ByteBuffer var7 = this.field5087.field660;
         var7.clear();
         IDirect3DTexture.Download(this.field5084, 0, var1, var2, var3, var4, var3 * 4, 0, this.field5087.field661);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method5693() {
      super.method2755();
   }

   public void method5696() {
      super.method2755();
   }

   public void method5701() {
      super.method2755();
   }

   long method6179() {
      return this.field5084;
   }

   public void method2868(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   public void method5702(class566 var1) {
      super.method3057(var1);
   }

   public int method2853() {
      return this.field10190;
   }

   public int method2857() {
      return this.field10190;
   }

   public float method2858(float var1) {
      return var1 / (float)this.field10189;
   }

   public float method2859(float var1) {
      return var1 / (float)this.field10189;
   }

   public float method2860(float var1) {
      return var1 / (float)this.field10189;
   }

   public float method2874(float var1) {
      return var1 / (float)this.field10190;
   }

   public float method2878(float var1) {
      return var1 / (float)this.field10190;
   }

   public void method2862(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         ByteBuffer var7 = this.field5087.field660;
         var7.clear();
         IDirect3DTexture.Download(this.field5084, 0, var1, var2, var3, var4, var3 * 4, 0, this.field5087.field661);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public float method2864(float var1) {
      return var1 / (float)this.field10190;
   }

   public void method5704(class566 var1) {
      super.method3057(var1);
   }

   public void method5703() {
      this.field5087.method6228(this);
   }

   public void method2867(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   public void method2875(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   class641(class927 var1, class264 var2, class482 var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0, 1);
   }

   public int method2845() {
      return this.field10190;
   }

   public void method5694(class566 var1) {
      super.method3057(var1);
   }

   public void method2869(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (this.field5086 == var6 && this.field5085 == class482.field8399) {
         if (var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = this.field5087.field660;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var8 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method2873(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (this.field5086 == var6 && this.field5085 == class482.field8399) {
         if (var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = this.field5087.field660;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var8 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method2856(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (this.field5086 == var6 && this.field5085 == class482.field8399) {
         if (var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = this.field5087.field660;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var8 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   class641(class927 var1, class264 var2, class482 var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, false, var4 * var5);
      if (!this.field5087.field10259) {
         this.field10189 = class18.method3687(var4, (byte)16);
         this.field10190 = class18.method3687(var5, (byte)16);
      } else {
         this.field10189 = var4;
         this.field10190 = var5;
      }

      this.field5084 = IDirect3DDevice.CreateTexture(this.field5087.field10241, var4, var5, 0, var6, class927.method6212(this.field5086, this.field5085), var7);
   }

   public void method2865(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   public boolean method2877() {
      return false;
   }

   public boolean method2880() {
      return false;
   }

   public void method5699() {
      this.field5087.method6228(this);
   }

   public void method5698() {
      super.method2755();
   }

   public void method5695() {
      this.field5087.method6228(this);
   }

   public void method2871(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         if (var7 == 0) {
            var7 = var3;
         }

         ByteBuffer var8 = this.field5087.field660;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var7 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method5697(class566 var1) {
      super.method3057(var1);
   }

   public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (this.field5086 == class264.field8191 && this.field5085 == class482.field8399) {
         if (var7 == 0) {
            var7 = var3;
         }

         ByteBuffer var8 = this.field5087.field660;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(this.field5084, 0, var1, var2, var3, var4, var7 * this.field5086.field8190 * 845115459, 0, this.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method2879() {
      return true;
   }

   public boolean method2854() {
      return true;
   }

   long method6180() {
      return this.field5084;
   }

   public int method2844() {
      return this.field10190;
   }
}
