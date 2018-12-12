import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class class641 extends class40 implements class801 {
   int field10189;
   int field10190;
   boolean field10191;
   boolean field10192;

   public boolean method2872() {
      return false;
   }

   class641(class927 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, class264.field8191, class482.field8399, var4 && var1.field10240, var2 * var3);
      if (!super.field5087.field10259) {
         this.field10189 = class18.method3687(var2, (byte)16);
         this.field10190 = class18.method3687(var3, (byte)16);
      } else {
         this.field10189 = var2;
         this.field10190 = var3;
      }

      if (var4) {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 0, 1024, 21, 1);
      } else {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 1, 0, 21, 1);
      }

      if (var7 == 0) {
         var7 = var2;
      }

      ByteBuffer var8 = super.field5087.field660;
      var8.clear();
      var8.asIntBuffer().put(var5, var6, var7 * var3);
      IDirect3DTexture.Upload(super.field5084, 0, 0, 0, var2, var3, var7 * super.field5086.field8190, 0, super.field5087.field661);
   }

   class641(class927 var1, class264 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, var2, class482.field8399, var5 && var1.field10240, var3 * var4);
      if (!super.field5087.field10259) {
         this.field10189 = class18.method3687(var3, (byte)16);
         this.field10190 = class18.method3687(var4, (byte)16);
      } else {
         this.field10189 = var3;
         this.field10190 = var4;
      }

      if (var5) {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 0, 1024, class927.method6212(super.field5086, class482.field8399), 1);
      } else {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 1, 0, class927.method6212(super.field5086, class482.field8399), 1);
      }

      if (var8 == 0) {
         var8 = var3;
      }

      ByteBuffer var9 = super.field5087.field660;
      var9.clear();
      class264 var10 = super.field5086;
      class264 var10000 = super.field5086;
      if (var10 == class264.field8198) {
         var9.put(var6, var7, var4 * var3 / 2);
         IDirect3DTexture.Upload(super.field5084, 0, 0, 0, var3, var4 / 4, var3 / 4 * 8, 0, super.field5087.field661);
      } else {
         class264 var11 = super.field5086;
         var10000 = super.field5086;
         if (var11 == class264.field8192) {
            var9.put(var6, var7, var4 * var3);
            IDirect3DTexture.Upload(super.field5084, 0, 0, 0, var3, var4 / 4, var3 / 4 * 16, 0, super.field5087.field661);
         } else {
            var9.put(var6, var7, var8 * var4);
            IDirect3DTexture.Upload(super.field5084, 0, 0, 0, var3, var4, var8 * super.field5086.field8190, 0, super.field5087.field661);
         }
      }

   }

   class641(class927 var1, class264 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, var2, class482.field8399, var5 && var1.field10240, var3 * var4);
      if (!super.field5087.field10259) {
         this.field10189 = class18.method3687(var3, (byte)16);
         this.field10190 = class18.method3687(var4, (byte)16);
      } else {
         this.field10189 = var3;
         this.field10190 = var4;
      }

      if (var5) {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 0, 1024, class927.method6212(super.field5086, class482.field8403), 1);
      } else {
         super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, this.field10189, this.field10190, 1, 0, class927.method6212(super.field5086, class482.field8403), 1);
      }

      if (var8 == 0) {
         var8 = var3;
      }

      ByteBuffer var9 = super.field5087.field660;
      var9.clear();
      var9.asFloatBuffer().put(var6, var7, var8 * var4 * super.field5086.field8190);
      IDirect3DTexture.Upload(super.field5084, 0, 0, 0, var3, var4, var8 * super.field5086.field8190 * 4, 0, super.field5087.field661);
   }

   public int method2861() {
      return this.field10189;
   }

   public float method2846(float var1) {
      return var1 / (float)this.field10189;
   }

   public float method2847(float var1) {
      return var1 / (float)this.field10190;
   }

   long method3058() {
      return super.field5084;
   }

   public boolean method2848() {
      return true;
   }

   public void method2849(boolean var1, boolean var2) {
      this.field10191 = var1;
      this.field10192 = var2;
   }

   public void method2851(int var1, int var2, int var3, int var4, byte[] var5, class264 var6, int var7, int var8) {
      if (super.field5086 == var6 && super.field5085 == class482.field8399) {
         if (var8 == 0) {
            var8 = var3;
         }

         ByteBuffer var9 = super.field5087.field660;
         var9.clear();
         var9.put(var5, var7, var8 * var4);
         IDirect3DTexture.Upload(super.field5084, 0, var1, var2, var3, var4, var8 * super.field5086.field8190, 0, super.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }

   public void method2852(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      if (super.field5086 == class264.field8191 && super.field5085 == class482.field8399) {
         ByteBuffer var7 = super.field5087.field660;
         var7.clear();
         IDirect3DTexture.Download(super.field5084, 0, var1, var2, var3, var4, var3 * 4, 0, super.field5087.field661);
         var7.asIntBuffer().get(var5, var6, var3 * var4);
      } else {
         throw new RuntimeException();
      }
   }

   public void method5693() {
      super.method2755();
   }

   public void method5703() {
      super.field5087.method6228(this);
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

   class641(class927 var1, class264 var2, class482 var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, false, var4 * var5);
      if (!super.field5087.field10259) {
         this.field10189 = class18.method3687(var4, (byte)16);
         this.field10190 = class18.method3687(var5, (byte)16);
      } else {
         this.field10189 = var4;
         this.field10190 = var5;
      }

      super.field5084 = IDirect3DDevice.CreateTexture(super.field5087.field10241, var4, var5, 0, var6, class927.method6212(super.field5086, super.field5085), var7);
   }

   public void method2850(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if (super.field5086 == class264.field8191 && super.field5085 == class482.field8399) {
         if (var7 == 0) {
            var7 = var3;
         }

         ByteBuffer var8 = super.field5087.field660;
         var8.clear();
         var8.asIntBuffer().put(var5, var6, var7 * var4);
         IDirect3DTexture.Upload(super.field5084, 0, var1, var2, var3, var4, var7 * super.field5086.field8190, 0, super.field5087.field661);
      } else {
         throw new RuntimeException();
      }
   }
}
