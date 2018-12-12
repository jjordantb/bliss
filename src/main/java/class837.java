import java.awt.Canvas;

public abstract class class837 extends class749 {
   Canvas field9154;
   class257 field9155;
   int field9156;
   int field9157;
   int[] field9158;
   float[] field9159;
   boolean field9160;
   public static Canvas field9161;

   final boolean method2482() {
      try {
         this.field9160 = false;
         return true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.i(" + ')');
      }
   }

   void method5396(int var1) {
      try {
         this.field9158 = new int[2061776189 * this.field9157 * 1038713159 * this.field9156];
         this.field9159 = new float[2061776189 * this.field9157 * 1038713159 * this.field9156];
         if (this.field9160) {
            this.field9155.method4455(1038713159 * this.field9156, 2061776189 * this.field9157, this.field9158, this.field9159);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afi.z(" + ')');
      }
   }

   class837(class257 var1, Canvas var2, int var3, int var4) {
      this.field9154 = var2;
      this.field9155 = var1;
      this.field9156 = -1172842377 * var3;
      this.field9157 = -374060523 * var4;
   }

   public int method2483() {
      return this.field9156 * 1038713159;
   }

   final boolean method2484() {
      try {
         this.field9155.method4455(1038713159 * this.field9156, 2061776189 * this.field9157, this.field9158, this.field9159);
         this.field9160 = true;
         return true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.p(" + ')');
      }
   }

   public int method2493() {
      try {
         return 2061776189 * this.field9157;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.f(" + ')');
      }
   }

   public int method2480() {
      return 2061776189 * this.field9157;
   }

   final boolean method2486() {
      this.field9155.method4455(1038713159 * this.field9156, 2061776189 * this.field9157, this.field9158, this.field9159);
      this.field9160 = true;
      return true;
   }

   final boolean method2485() {
      this.field9160 = false;
      return true;
   }

   final void method2518(int var1, int var2) {
      try {
         if (var1 != 1038713159 * this.field9156 || 2061776189 * this.field9157 != var2) {
            this.field9156 = -1172842377 * var1;
            this.field9157 = -374060523 * var2;
            this.method5396(251162115);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "afi.e(" + ')');
      }
   }

   final void method2519(int var1, int var2) {
      if (var1 != 1038713159 * this.field9156 || 2061776189 * this.field9157 != var2) {
         this.field9156 = -1172842377 * var1;
         this.field9157 = -374060523 * var2;
         this.method5396(251162115);
      }

   }

   public int method2490() {
      return this.field9156 * 1038713159;
   }

   public int method2481() {
      try {
         return this.field9156 * 1038713159;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.a(" + ')');
      }
   }

   public int method2492() {
      return this.field9156 * 1038713159;
   }

   public int method2491() {
      return this.field9156 * 1038713159;
   }
}
