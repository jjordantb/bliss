public class class361 {
   class361 field2295;
   class446 field2296 = new class446();
   class446 field2297 = new class446();
   class446 field2298 = new class446();
   boolean field2299 = true;
   boolean field2300;
   class135 field2301;
   class361 field2302;
   boolean field2303 = true;
   class361 field2304;

   public final class446 method1511() {
      if (this.field2303) {
         this.field2303 = false;
         if (this.field2302 != null) {
            this.field2296.method4323(this.field2297);
            this.field2296.method4324(this.field2302.method1511());
         } else {
            this.field2296.method4323(this.field2297);
         }
      }

      return this.field2296;
   }

   final class446 method1512() {
      if (this.field2299) {
         this.field2299 = false;
         this.field2298.method4323(this.method1511());
         this.field2298.method4322();
      }

      return this.field2296;
   }

   final void method1513(class446 var1) {
      if (this.field2302 != null) {
         class446 var2 = new class446(var1);
         var2.method4324(this.field2302.method1512());
         this.method1522(var2);
      } else {
         this.method1522(var1);
      }

   }

   public final void method1514(class32 var1) {
      this.field2297.field7637.method3298(var1);
      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
      }

   }

   public final void method1515(float var1, float var2, float var3) {
      this.field2297.field7637.method3292(var1, var2, var3);
      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
      }

   }

   final void method1516() {
      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
      }

      if (this.field2304 != null) {
         this.field2304.method1516();
      }

   }

   public final class446 method1517() {
      return this.field2297;
   }

   final void method1518() {
      this.field2303 = true;
      this.field2299 = true;
      this.field2300 = true;
   }

   public final void method1519() {
      class361 var1;
      if (this.field2302 != null) {
         var1 = this.field2302.field2295;
         if (var1 == this) {
            this.field2302.field2295 = this.field2304;
         } else {
            while(var1.field2304 != this) {
               var1 = var1.field2304;
            }

            var1.field2304 = this.field2304;
         }
      }

      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
         var1 = this.field2295;

         while(true) {
            var1.field2297.method4324(this.field2297);
            var1.field2302 = this.field2302;
            if (var1.field2304 == null) {
               var1.field2304 = this.field2302.field2295;
               this.field2302.field2295 = this.field2295;
               break;
            }

            var1 = var1.field2304;
         }
      }

      this.field2302 = null;
      this.field2304 = null;
      this.field2295 = null;
   }

   public final void method1520(class567 var1) {
      this.field2297.field7638.method788(var1);
      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
      }

   }

   final class135 method1521() {
      if (this.field2300) {
         this.field2300 = false;
         this.field2301.method1030(this.method1511());
      }

      return this.field2301;
   }

   class361() {
      new class344();
      new class344();
      this.field2301 = new class135();
      this.field2300 = true;
      this.field2302 = null;
      this.field2295 = null;
      this.field2304 = null;
   }

   final void method1522(class446 var1) {
      this.field2297.method4323(var1);
      this.method1518();
      if (this.field2295 != null) {
         this.field2295.method1516();
      }

   }
}
