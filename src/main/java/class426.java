import java.awt.Canvas;
import java.awt.Dimension;

public class class426 extends class749 implements class297 {
   class955 field7397;
   Canvas field7398;
   static long field7399;
   int field7400;
   int field7401;
   long field7402;
   static boolean field7403 = false;

   public int method2483() {
      return this.field7401;
   }

   void method2518(int var1, int var2) {
      this.field7401 = var1;
      this.field7400 = var2;
      this.wa(this.field7398, var1, var2);
      if (this.field7397.method4800((short)10240) == this) {
         this.method2484();
      }

   }

   public native void method6550(boolean var1);

   class426(class955 var1, Canvas var2, int var3, int var4) {
      this.field7397 = var1;
      this.field7398 = var2;
      this.field7401 = var3;
      this.field7400 = var4;
      this.n(var1, this.field7398, var3, var4);
   }

   native void ao(int var1, int var2, int var3, int var4);

   native void wa(Canvas var1, int var2, int var3);

   public int method2516() {
      return this.method2517(0, 0);
   }

   public int method2517(int var1, int var2) {
      try {
         synchronized(this.field7398.getTreeLock()) {
            Dimension var4 = this.field7398.getSize();
            this.H(var1, var2, var4.width, var4.height);
            field7403 = false;
            return 0;
         }
      } catch (Exception var6) {
         this.method4122(var6);
         return -1;
      }
   }

   void method4122(Exception var1) {
      if (!field7403) {
         field7399 = class27.method3468((byte)1);
         field7403 = true;
      } else {
         if (class27.method3468((byte)1) - field7399 >= 30000L) {
            throw new RuntimeException(var1.getMessage());
         }

         this.field7398.repaint();
      }

   }

   public int method2481() {
      return this.field7401;
   }

   public int method2493() {
      return this.field7400;
   }

   public void method2488() {
      if (this.field7397.method4800((short)-12143) == this) {
         this.method2482();
      }

      this.method6550(true);
      this.field7402 = 0L;
      this.field7398 = null;
   }

   native void ad(int var1, int var2, int var3, int var4);

   boolean method2482() {
      return true;
   }

   public int method2515() {
      return this.method2517(0, 0);
   }

   public int method2480() {
      return this.field7400;
   }

   native void H(int var1, int var2, int var3, int var4);

   public int method2521(int var1, int var2) {
      try {
         synchronized(this.field7398.getTreeLock()) {
            Dimension var4 = this.field7398.getSize();
            this.H(var1, var2, var4.width, var4.height);
            field7403 = false;
            return 0;
         }
      } catch (Exception var6) {
         this.method4122(var6);
         return -1;
      }
   }

   public int method2490() {
      return this.field7401;
   }

   public void method2489() {
      if (this.field7397.method4800((short)-2527) == this) {
         this.method2482();
      }

      this.method6550(true);
      this.field7402 = 0L;
      this.field7398 = null;
   }

   void method2519(int var1, int var2) {
      this.field7401 = var1;
      this.field7400 = var2;
      this.wa(this.field7398, var1, var2);
      if (this.field7397.method4800((short)-7265) == this) {
         this.method2484();
      }

   }

   boolean method2486() {
      this.field7397.PA(this);
      return true;
   }

   public int method2491() {
      return this.field7401;
   }

   public int method2492() {
      return this.field7401;
   }

   native void n(class955 var1, Canvas var2, int var3, int var4);

   public int method2520(int var1, int var2) {
      try {
         synchronized(this.field7398.getTreeLock()) {
            Dimension var4 = this.field7398.getSize();
            this.H(var1, var2, var4.width, var4.height);
            field7403 = false;
            return 0;
         }
      } catch (Exception var6) {
         this.method4122(var6);
         return -1;
      }
   }

   public void method2487() {
      if (this.field7397.method4800((short)-9633) == this) {
         this.method2482();
      }

      this.method6550(true);
      this.field7402 = 0L;
      this.field7398 = null;
   }

   public int method2522(int var1, int var2) {
      try {
         synchronized(this.field7398.getTreeLock()) {
            Dimension var4 = this.field7398.getSize();
            this.H(var1, var2, var4.width, var4.height);
            field7403 = false;
            return 0;
         }
      } catch (Exception var6) {
         this.method4122(var6);
         return -1;
      }
   }

   public int method2523(int var1, int var2) {
      try {
         synchronized(this.field7398.getTreeLock()) {
            Dimension var4 = this.field7398.getSize();
            this.H(var1, var2, var4.width, var4.height);
            field7403 = false;
            return 0;
         }
      } catch (Exception var6) {
         this.method4122(var6);
         return -1;
      }
   }

   native void ak(class955 var1, Canvas var2, int var3, int var4);

   native void aa(class955 var1, Canvas var2, int var3, int var4);

   boolean method2485() {
      return true;
   }

   native void ae(int var1, int var2, int var3, int var4);

   public native void method6551(boolean var1);

   boolean method2484() {
      this.field7397.PA(this);
      return true;
   }

   native void av(Canvas var1, int var2, int var3);
}