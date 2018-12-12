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
         this.field9158 = new int[this.field9157 * this.field9156];
         this.field9159 = new float[this.field9157 * this.field9156];
         if (this.field9160) {
            this.field9155.method4455(this.field9156, this.field9157, this.field9158, this.field9159);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "afi.z(" + ')');
      }
   }

   class837(class257 var1, Canvas var2, int var3, int var4) {
      this.field9154 = var2;
      this.field9155 = var1;
      this.field9156 = var3;
      this.field9157 = var4;
   }

   final boolean method2484() {
      try {
         this.field9155.method4455(this.field9156, this.field9157, this.field9158, this.field9159);
         this.field9160 = true;
         return true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.p(" + ')');
      }
   }

   public int method2493() {
      try {
         return this.field9157;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.f(" + ')');
      }
   }

   final void method2518(int var1, int var2) {
      try {
         if (var1 != this.field9156 || this.field9157 != var2) {
            this.field9156 = var1;
            this.field9157 = var2;
            this.method5396(251162115);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "afi.e(" + ')');
      }
   }

   public int method2481() {
      try {
         return this.field9156;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "afi.a(" + ')');
      }
   }
}
