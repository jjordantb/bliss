import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;

public class class561 extends class40 implements class891 {
   int field828;

    @Override
    public void method5693() {

    }

    @Override
    public void method5694(class566 var1) {

    }

    public void method5703() {
      super.field5087.method6210(this);
   }

   class561(class927 var1, int var2, boolean var3, int[][] var4) {
      super(var1, class264.field8191, class482.field8399, var3 && var1.field10251, var2 * var2 * 6);
      this.field828 = var2;
      if (super.field5083) {
         super.field5084 = IDirect3DDevice.CreateCubeTexture(super.field5087.field10241, this.field828, 0, 1024, 21, 1);
      } else {
         super.field5084 = IDirect3DDevice.CreateCubeTexture(super.field5087.field10241, this.field828, 1, 0, 21, 1);
      }

      ByteBuffer var5 = super.field5087.field660;

      for(int var6 = 0; var6 < 6; ++var6) {
         var5.clear();
         var5.asIntBuffer().put(var4[var6]);
         IDirect3DCubeTexture.Upload(super.field5084, var6, 0, 0, 0, this.field828, this.field828, this.field828 * 4, 0, super.field5087.field661);
      }

   }
}
