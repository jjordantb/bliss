import jaclib.memory.Z;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.S;

public class class434 implements class525 {
   class927 field7418;
   byte field7419;
   int field7420;
   int field7421;
   boolean field7422;
   long field7423 = 0L;

   public int method1979() {
      return this.field7420;
   }

   public int method1974() {
      return this.field7420;
   }

   int method4159() {
      return this.field7419;
   }

   public void method2756() {
      if (this.field7423 != 0L) {
         IUnknown.Release(this.field7423);
         this.field7423 = 0L;
      }

      this.field7421 = 0;
      this.field7420 = 0;
      this.field7418.method552(this);
   }

   public boolean method2236(int var1, int var2, Z var3) {
      return this.method2237(var1, var2) ? S.f(IDirect3DVertexBuffer.Upload(this.field7423, 0, this.field7420, this.field7422 ? 8192 : 0, var3.f())) : false;
   }

   public void method2753() {
      if (this.field7423 != 0L) {
         IUnknown.Release(this.field7423);
         this.field7423 = 0L;
      }

      this.field7421 = 0;
      this.field7420 = 0;
      this.field7418.method552(this);
   }

   public void method2755() {
      if (this.field7423 != 0L) {
         IUnknown.Release(this.field7423);
         this.field7423 = 0L;
      }

      this.field7421 = 0;
      this.field7420 = 0;
      this.field7418.method552(this);
   }

   public boolean method1977(int var1, int var2, long var3) {
      return S.f(IDirect3DVertexBuffer.Upload(this.field7423, var1, var2, this.field7422 ? 8192 : 0, var3));
   }

   void method4160() {
      if (this.field7423 != 0L) {
         this.field7418.method6218(this.field7423);
         this.field7423 = 0L;
         this.field7421 = 0;
         this.field7420 = 0;
      }

   }

   public long method1976(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.field7423, var1, var2, this.field7422 ? 8192 : 0);
   }

   public void method2754() {
      if (this.field7423 != 0L) {
         IUnknown.Release(this.field7423);
         this.field7423 = 0L;
      }

      this.field7421 = 0;
      this.field7420 = 0;
      this.field7418.method552(this);
   }

   public void method1983() {
      IDirect3DVertexBuffer.Unlock(this.field7423);
   }

   public boolean method2235(int var1, int var2) {
      this.field7420 = var1;
      this.field7419 = (byte)var2;
      if (this.field7420 > this.field7421) {
         int var3 = 8;
         byte var4;
         if (this.field7422) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field7423 != 0L) {
            IUnknown.Release(this.field7423);
         }

         this.field7423 = IDirect3DDevice.CreateVertexBuffer(this.field7418.field10241, this.field7420, var3, 0, var4);
         this.field7421 = this.field7420;
      }

      return this.field7423 != 0L;
   }

   public void method1980() {
      IDirect3DVertexBuffer.Unlock(this.field7423);
   }

   public int method1978() {
      return this.field7420;
   }

   public boolean method2239(int var1, int var2, Z var3) {
      return this.method2237(var1, var2) ? S.f(IDirect3DVertexBuffer.Upload(this.field7423, 0, this.field7420, this.field7422 ? 8192 : 0, var3.f())) : false;
   }

   public boolean method2238(int var1, int var2) {
      this.field7420 = var1;
      this.field7419 = (byte)var2;
      if (this.field7420 > this.field7421) {
         int var3 = 8;
         byte var4;
         if (this.field7422) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field7423 != 0L) {
            IUnknown.Release(this.field7423);
         }

         this.field7423 = IDirect3DDevice.CreateVertexBuffer(this.field7418.field10241, this.field7420, var3, 0, var4);
         this.field7421 = this.field7420;
      }

      return this.field7423 != 0L;
   }

   public boolean method1981(int var1, int var2, long var3) {
      return S.f(IDirect3DVertexBuffer.Upload(this.field7423, var1, var2, this.field7422 ? 8192 : 0, var3));
   }

   public long method1982(int var1, int var2) {
      return IDirect3DVertexBuffer.Lock(this.field7423, var1, var2, this.field7422 ? 8192 : 0);
   }

   class434(class927 var1, boolean var2) {
      this.field7418 = var1;
      this.field7422 = var2;
      this.field7418.method582(this);
   }

   public boolean method2237(int var1, int var2) {
      this.field7420 = var1;
      this.field7419 = (byte)var2;
      if (this.field7420 > this.field7421) {
         int var3 = 8;
         byte var4;
         if (this.field7422) {
            var4 = 0;
            var3 |= 512;
         } else {
            var4 = 1;
         }

         if (this.field7423 != 0L) {
            IUnknown.Release(this.field7423);
         }

         this.field7423 = IDirect3DDevice.CreateVertexBuffer(this.field7418.field10241, this.field7420, var3, 0, var4);
         this.field7421 = this.field7420;
      }

      return this.field7423 != 0L;
   }

   public boolean method1975(int var1, int var2, long var3) {
      return S.f(IDirect3DVertexBuffer.Upload(this.field7423, var1, var2, this.field7422 ? 8192 : 0, var3));
   }
}
