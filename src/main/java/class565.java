import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;

public class class565 extends class40 implements class332 {
   int field632;
   int field633;
   int field634;

   long method3058() {
      return this.field5084;
   }

   class565(class927 var1, class264 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, var2, class482.field8399, false, var3 * var4 * var5);
      this.field632 = var3;
      this.field633 = var4;
      this.field634 = var5;
      this.field5084 = IDirect3DDevice.CreateVolumeTexture(this.field5087.field10241, var3, var4, var5, 1, 0, class927.method6212(var2, this.field5085), 1);
      ByteBuffer var8 = this.field5087.field660;
      var8.clear();
      var8.put(var7);
      IDirect3DVolumeTexture.Upload(this.field5084, 0, 0, 0, 0, this.field632, this.field633, this.field634, this.field632 * var2.field8190 * 845115459, 0, this.field5087.field661);
   }

   public void method5700() {
      this.field5087.method6230(this);
   }

   public void method5702(class566 var1) {
      super.method3057(var1);
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

   public void method5698() {
      super.method2755();
   }

   public void method5699() {
      this.field5087.method6230(this);
   }

   public void method5703() {
      this.field5087.method6230(this);
   }

   public void method5695() {
      this.field5087.method6230(this);
   }

   long method542() {
      return this.field5084;
   }

   public void method5697(class566 var1) {
      super.method3057(var1);
   }

   public void method5704(class566 var1) {
      super.method3057(var1);
   }

   public void method5694(class566 var1) {
      super.method3057(var1);
   }

   long method543() {
      return this.field5084;
   }
}
