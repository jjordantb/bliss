public final class class567 {
   static int field811;
   float field812;
   static int field813;
   static class567[] field814 = new class567[0];
   float field815;
   float field816;
   float field817;

   static {
      new class567();
   }

   public String toString() {
      return this.field815 + "," + this.field812 + "," + this.field816 + "," + this.field817;
   }

   public static class567 method785() {
      class567[] var0 = field814;
      synchronized(field814) {
         class567 var1;
         if (field813 == 0) {
            var1 = new class567();
            return var1;
         } else {
            field814[--field813].method796();
            var1 = field814[field813];
            return var1;
         }
      }
   }

   static class567 method786(float var0, float var1, float var2, float var3) {
      class567[] var4 = field814;
      synchronized(field814) {
         class567 var5;
         if (field813 == 0) {
            var5 = new class567(var0, var1, var2, var3);
            return var5;
         } else {
            field814[--field813].method787(var0, var1, var2, var3);
            var5 = field814[field813];
            return var5;
         }
      }
   }

   public class567() {
      this.method796();
   }

   class567(float var1, float var2, float var3, float var4) {
      this.method787(var1, var2, var3, var4);
   }

   class567(class567 var1) {
      this.method788(var1);
   }

   void method787(float var1, float var2, float var3, float var4) {
      this.field815 = var1;
      this.field812 = var2;
      this.field816 = var3;
      this.field817 = var4;
   }

   public void method788(class567 var1) {
      this.field815 = var1.field815;
      this.field812 = var1.field812;
      this.field816 = var1.field816;
      this.field817 = var1.field817;
   }

   public void method789(float var1, float var2, float var3, float var4) {
      float var5 = (float)Math.sin((double)(var4 * 0.5F));
      float var6 = (float)Math.cos((double)(var4 * 0.5F));
      this.field815 = var1 * var5;
      this.field812 = var2 * var5;
      this.field816 = var3 * var5;
      this.field817 = var6;
   }

   final void method790() {
      this.field815 = -this.field815;
      this.field812 = -this.field812;
      this.field816 = -this.field816;
   }

   static final class567 method791(class567 var0) {
      class567 var1 = method797(var0);
      var1.method790();
      return var1;
   }

   public final void method792(class567 var1) {
      this.method787(var1.field817 * this.field815 + var1.field815 * this.field817 + var1.field812 * this.field816 - var1.field816 * this.field812, var1.field817 * this.field812 - var1.field815 * this.field816 + var1.field812 * this.field817 + var1.field816 * this.field815, var1.field817 * this.field816 + var1.field815 * this.field812 - var1.field812 * this.field815 + var1.field816 * this.field817, var1.field817 * this.field817 - var1.field815 * this.field815 - var1.field812 * this.field812 - var1.field816 * this.field816);
   }

   public static void method793(int var0) {
      field811 = var0;
      field814 = new class567[var0];
      field813 = 0;
   }

   static final class567 method794(class567 var0, class567 var1) {
      class567 var2 = method797(var0);
      var2.method792(var1);
      return var2;
   }

   public void method795() {
      class567[] var1 = field814;
      synchronized(field814) {
         if (field813 < field811 - 1) {
            field814[field813++] = this;
         }

      }
   }

   final void method796() {
      this.field816 = 0.0F;
      this.field812 = 0.0F;
      this.field815 = 0.0F;
      this.field817 = 1.0F;
   }

   static class567 method797(class567 var0) {
      class567[] var1 = field814;
      synchronized(field814) {
         class567 var2;
         if (field813 == 0) {
            var2 = new class567(var0);
            return var2;
         } else {
            field814[--field813].method788(var0);
            var2 = field814[field813];
            return var2;
         }
      }
   }

   public void method798(float var1, float var2, float var3) {
      this.method789(0.0F, 1.0F, 0.0F, var1);
      class567 var4 = method785();
      var4.method789(1.0F, 0.0F, 0.0F, var2);
      this.method792(var4);
      var4.method789(0.0F, 0.0F, 1.0F, var3);
      this.method792(var4);
      var4.method795();
   }
}
