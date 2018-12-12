import java.util.Stack;

public class class661 {
   class180 field9623;
   public int field9624;
   class1 field9625 = new class1(64);
   static long field9626;

   public class636 method5739(int var1, int var2) {
      try {
         class1 var3 = this.field9625;
         class636 var4;
         synchronized(this.field9625) {
            var4 = (class636)this.field9625.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field9623;
            byte[] var10;
            synchronized(this.field9623) {
               var10 = this.field9623.method3285(-1006924897 * class981.field3232.field3271, var1, (byte)-4);
            }

            var4 = new class636();
            if (var10 != null) {
               var4.method5909(new class907(var10), 27685189);
            }

            class1 var11 = this.field9625;
            synchronized(this.field9625) {
               this.field9625.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "iq.a(" + ')');
      }
   }

   public void method5740(int var1) {
      try {
         class1 var2 = this.field9625;
         synchronized(this.field9625) {
            this.field9625.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "iq.f(" + ')');
      }
   }

   public void method5741(int var1, byte var2) {
      try {
         class1 var3 = this.field9625;
         synchronized(this.field9625) {
            this.field9625.method2976(var1, -355539463);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "iq.b(" + ')');
      }
   }

   public void method5742(byte var1) {
      try {
         class1 var2 = this.field9625;
         synchronized(this.field9625) {
            this.field9625.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "iq.p(" + ')');
      }
   }

   public class661(class469 var1, class423 var2, class180 var3) {
      this.field9623 = var3;
      if (this.field9623 != null) {
         this.field9624 = this.field9623.method3286(class981.field3232.field3271 * -1006924897, 487068051) * 1946957321;
      } else {
         this.field9624 = 0;
      }

   }

   static void method5743(class192 var0, byte var1) {
      try {
         var0.field7022 = null;
         Stack var2 = class192.field7025;
         synchronized(class192.field7025) {
            if (class192.field7025.size() < 200) {
               class192.field7025.push(var0);
            }

         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "iq.f(" + ')');
      }
   }
}
