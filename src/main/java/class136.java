import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class class136 implements class334 {
   int field1151;
   class482 field1152;
   int field1153;
   class927 field1154;
   long field1155;

   public int method2344() {
      return this.field1151;
   }

   public int method2343() {
      return this.field1153;
   }

   public long method52() {
      return this.field1155;
   }

   public void method2755() {
      if (this.field1155 != 0L) {
         IUnknown.Release(this.field1155);
         this.field1155 = 0L;
      }

      this.field1154.method552(this);
   }

   public void method49() {
      if (this.field1155 != 0L) {
         this.field1154.method6218(this.field1155);
         this.field1155 = 0L;
      }

   }

   public void method2753() {
      if (this.field1155 != 0L) {
         IUnknown.Release(this.field1155);
         this.field1155 = 0L;
      }

      this.field1154.method552(this);
   }

   public void method50() {
      if (this.field1155 != 0L) {
         this.field1154.method6218(this.field1155);
         this.field1155 = 0L;
      }

   }

   public int method2346() {
      return this.field1153;
   }

   public int method2347() {
      return this.field1151;
   }

   class136(class927 var1, class482 var2, int var3, int var4) {
      this.field1154 = var1;
      this.field1153 = var3;
      this.field1151 = var4;
      this.field1152 = var2;
      this.field1155 = IDirect3DDevice.CreateDepthStencilSurface(this.field1154.field10241, var3, var4, class927.method6216(this.field1152), 0, 0, false);
      this.field1154.method582(this);
   }

   public void method2756() {
      if (this.field1155 != 0L) {
         IUnknown.Release(this.field1155);
         this.field1155 = 0L;
      }

      this.field1154.method552(this);
   }

   public long method55() {
      return this.field1155;
   }

   public long method53() {
      return this.field1155;
   }

   public int method2345() {
      return this.field1153;
   }

   public void method54() {
      if (this.field1155 != 0L) {
         this.field1154.method6218(this.field1155);
         this.field1155 = 0L;
      }

   }

   public void method51() {
      if (this.field1155 != 0L) {
         this.field1154.method6218(this.field1155);
         this.field1155 = 0L;
      }

   }

   public void method2754() {
      if (this.field1155 != 0L) {
         IUnknown.Release(this.field1155);
         this.field1155 = 0L;
      }

      this.field1154.method552(this);
   }

   public void method56() {
      if (this.field1155 != 0L) {
         this.field1154.method6218(this.field1155);
         this.field1155 = 0L;
      }

   }
}
