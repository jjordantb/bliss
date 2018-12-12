import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class class260 implements class443, class334 {
   long field8127;
   class694 field8128;
   int field8129;

   public void method4341() {
      if (this.field8127 != 0L) {
         this.field8128.field5087.method6218(this.field8127);
         this.field8127 = 0L;
      }

   }

   public int method2343() {
      return this.field8128.method2861();
   }

   public int method2344() {
      return this.field8128.method2845();
   }

   public long method4342() {
      if (this.field8127 == 0L) {
         this.field8127 = IDirect3DTexture.GetSurfaceLevel(this.field8128.field5084, this.field8129);
      }

      return this.field8127;
   }

   public void method2755() {
      if (this.field8127 != 0L) {
         IUnknown.Release(this.field8127);
         this.field8127 = 0L;
      }

      this.field8128.field5087.method552(this);
   }

    @Override
    public long method55() {
        return 0;
    }

    @Override
    public void method56() {

    }

    public void method4347() {
      if (this.field8127 != 0L) {
         this.field8128.field5087.method6218(this.field8127);
         this.field8127 = 0L;
      }

   }

   public int method2347() {
      return this.field8128.method2845();
   }

   public long method4344() {
      if (this.field8127 == 0L) {
         this.field8127 = IDirect3DTexture.GetSurfaceLevel(this.field8128.field5084, this.field8129);
      }

      return this.field8127;
   }

   public void method2754() {
      if (this.field8127 != 0L) {
         IUnknown.Release(this.field8127);
         this.field8127 = 0L;
      }

      this.field8128.field5087.method552(this);
   }

    @Override
    public void method51() {

    }

    @Override
    public long method52() {
        return 0;
    }

    @Override
    public long method53() {
        return 0;
    }

    @Override
    public void method54() {

    }

    public void method2753() {
      if (this.field8127 != 0L) {
         IUnknown.Release(this.field8127);
         this.field8127 = 0L;
      }

      this.field8128.field5087.method552(this);
   }

    @Override
    public void method49() {

    }

    @Override
    public void method50() {

    }

    public int method2345() {
      return this.field8128.method2861();
   }

   public int method2346() {
      return this.field8128.method2861();
   }

   public long method4343() {
      if (this.field8127 == 0L) {
         this.field8127 = IDirect3DTexture.GetSurfaceLevel(this.field8128.field5084, this.field8129);
      }

      return this.field8127;
   }

   class260(class694 var1, int var2) {
      this.field8129 = var2;
      this.field8128 = var1;
      this.field8128.field5087.method582(this);
   }

   public void method4345() {
      if (this.field8127 != 0L) {
         this.field8128.field5087.method6218(this.field8127);
         this.field8127 = 0L;
      }

   }

   public void method2756() {
      if (this.field8127 != 0L) {
         IUnknown.Release(this.field8127);
         this.field8127 = 0L;
      }

      this.field8128.field5087.method552(this);
   }

   public void method4346() {
      if (this.field8127 != 0L) {
         this.field8128.field5087.method6218(this.field8127);
         this.field8127 = 0L;
      }

   }

   public void method4348() {
      if (this.field8127 != 0L) {
         this.field8128.field5087.method6218(this.field8127);
         this.field8127 = 0L;
      }

   }
}
