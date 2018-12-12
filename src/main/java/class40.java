import jagdx.IUnknown;

public abstract class class40 implements class524 {
   boolean field5083;
   long field5084 = 0L;
   class482 field5085;
   class264 field5086;
   class927 field5087;

   public void method3057(class566 var1) {
   }

   long method3058() {
      return this.field5084;
   }

   class40(class927 var1, class264 var2, class482 var3, boolean var4, int var5) {
      this.field5087 = var1;
      this.field5086 = var2;
      this.field5085 = var3;
      this.field5083 = var4;
      this.field5087.method582(this);
   }

   public void method2755() {
      if (this.field5084 != 0L) {
         IUnknown.Release(this.field5084);
         this.field5084 = 0L;
      }

      this.field5087.method552(this);
   }
}
