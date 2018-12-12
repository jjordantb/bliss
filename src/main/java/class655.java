public abstract class class655 extends class829 {
   class495 field9413;
   String field9414;
   String field9415;
   int field9416;
   class495 field9417;

   public abstract boolean method5611(int var1);

   public abstract int method5612(int var1);

   public String toString() {
      try {
         String var1 = this.field9417.toString() + " " + this.field9414;
         if (this.field9415 != null && !"".equals(this.field9415)) {
            var1 = var1 + " : " + this.field9415;
         }

         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afb.toString(" + ')');
      }
   }

   public class495 method5613(int var1) {
      try {
         return this.field9417;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afb.b(" + ')');
      }
   }

   public abstract int method5614(int var1);

   public int method5615(int var1) {
      try {
         if (this.field9417 != class495.field8094) {
            throw new class286(this, this.field9417.toString().toLowerCase());
         } else {
            return 890433517 * this.field9416;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afb.i(" + ')');
      }
   }

   String method5616(byte var1) {
      try {
         return this.field9414;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afb.f(" + ')');
      }
   }

   class655(class151 var1) {
      this.field9417 = var1.field5366;
      this.field9414 = var1.field5368;
      this.field9415 = var1.field5369;
      this.field9416 = var1.field5365 * 1232308479;
      this.field9413 = var1.field5367;
   }

   public class495 method5617(int var1) {
      try {
         return this.field9413;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afb.p(" + ')');
      }
   }

   public abstract int method5618(int var1);

   public abstract boolean method5619(int var1);
}
