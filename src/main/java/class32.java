public class class32 {
   public float field5296;
   static int field5297;
   static int field5298;
   public float field5299;
   public float field5300;
   static class32[] field5301;

   static {
      new class32(0.0F, 0.0F, 0.0F);
      field5301 = new class32[0];
   }

   public static class32 method3289(float var0, float var1, float var2) {
      class32[] var3 = field5301;
      synchronized(field5301) {
         class32 var4;
         if (field5298 == 0) {
            var4 = new class32(var0, var1, var2);
            return var4;
         } else {
            field5301[--field5298].method3292(var0, var1, var2);
            var4 = field5301[field5298];
            return var4;
         }
      }
   }

   public static class32 method3290(class32 var0) {
      class32[] var1 = field5301;
      synchronized(field5301) {
         class32 var2;
         if (field5298 == 0) {
            var2 = new class32(var0);
            return var2;
         } else {
            field5301[--field5298].method3298(var0);
            var2 = field5301[field5298];
            return var2;
         }
      }
   }

   public void method3291() {
      class32[] var1 = field5301;
      synchronized(field5301) {
         if (field5298 < field5297 - 1) {
            field5301[field5298++] = this;
         }

      }
   }

   public class32(float var1, float var2, float var3) {
      this.field5296 = var1;
      this.field5300 = var2;
      this.field5299 = var3;
   }

   public void method3292(float var1, float var2, float var3) {
      this.field5296 = var1;
      this.field5300 = var2;
      this.field5299 = var3;
   }

   final void method3293() {
      this.field5296 = -this.field5296;
      this.field5300 = -this.field5300;
      this.field5299 = -this.field5299;
   }

   final void method3294(class32 var1) {
      this.field5296 += var1.field5296;
      this.field5300 += var1.field5300;
      this.field5299 += var1.field5299;
   }

   public final void method3295(float var1, float var2, float var3) {
      this.field5296 -= var1;
      this.field5300 -= var2;
      this.field5299 -= var3;
   }

   public static final class32 method3296(class32 var0, class32 var1) {
      class32 var2 = method3290(var0);
      var2.method3300(var1);
      return var2;
   }

   public final float method3297() {
      return (float)Math.sqrt((double)(this.field5296 * this.field5296 + this.field5300 * this.field5300 + this.field5299 * this.field5299));
   }

   public class32() {
   }

   class32(class32 var1) {
      this.field5296 = var1.field5296;
      this.field5300 = var1.field5300;
      this.field5299 = var1.field5299;
   }

   public void method3298(class32 var1) {
      this.method3292(var1.field5296, var1.field5300, var1.field5299);
   }

   public String toString() {
      return this.field5296 + ", " + this.field5300 + ", " + this.field5299;
   }

   final void method3299(class567 var1) {
      class567 var2 = class567.method786(this.field5296, this.field5300, this.field5299, 0.0F);
      class567 var3 = class567.method791(var1);
      class567 var4 = class567.method794(var3, var2);
      var4.method792(var1);
      this.method3292(var4.field815, var4.field812, var4.field816);
      var2.method795();
      var3.method795();
      var4.method795();
   }

   final void method3300(class32 var1) {
      this.field5296 -= var1.field5296;
      this.field5300 -= var1.field5300;
      this.field5299 -= var1.field5299;
   }

   public final void method3301(class135 var1) {
      float var2 = this.field5296;
      float var3 = this.field5300;
      this.field5296 = var1.field1184 * var2 + var1.field1186 * var3 + var1.field1189 * this.field5299 + var1.field1182;
      this.field5300 = var1.field1192 * var2 + var1.field1187 * var3 + var1.field1190 * this.field5299 + var1.field1193;
      this.field5299 = var1.field1185 * var2 + var1.field1188 * var3 + var1.field1191 * this.field5299 + var1.field1183;
   }

   public static void method3302(int var0) {
      field5297 = var0;
      field5301 = new class32[var0];
      field5298 = 0;
   }

   public final void method3303(class135 var1) {
      float var2 = this.field5296;
      float var3 = this.field5300;
      this.field5296 = var1.field1184 * var2 + var1.field1186 * var3 + var1.field1189 * this.field5299;
      this.field5300 = var1.field1192 * var2 + var1.field1187 * var3 + var1.field1190 * this.field5299;
      this.field5299 = var1.field1185 * var2 + var1.field1188 * var3 + var1.field1191 * this.field5299;
   }
}
