import java.nio.ByteBuffer;
import java.util.Vector;

public class class270 {
   class33 field10568;
   class806 field10569;
   class33 field10570;
   class33 field10571;
   Vector field10572 = new Vector();
   class813 field10573;
   class325 field10574;
   class813 field10575;
   class893 field10576;
   int field10577;
   int field10578;
   class525 field10579;
   boolean field10580;
   class813 field10581;
   int field10582 = 0;
   class92 field10583;
   class482 field10584;

   class270(class325 var1, int var2, int var3) {
      this.field10574 = var1;
      this.field10584 = class482.field8399;
      this.field10577 = var2;
      this.field10578 = var3;
   }

   void method6599() {
      if (this.field10579 == null) {
         this.field10579 = this.field10574.method641(false);
         this.field10579.method2237(12, 4);
         ByteBuffer var1 = this.field10574.field660;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.field10579.method1977(0, var1.position(), this.field10574.field661);
         this.field10583 = this.field10574.method663(new class39[]{new class39(class61.field1592)});
      }

   }

   void method6600() {
      this.field10574.method726();
      this.field10574.method633(0);
      this.field10574.method619(1);
      this.field10574.method4827();
      this.field10569.method2834((class893)null);
      this.field10574.method583(0, 0);
      int var1 = this.field10572.size();
      this.field10568.method2872();

      for(int var2 = 0; var2 < var1; ++var2) {
         class442 var3 = (class442)this.field10572.elementAt(var2);
         int var4 = var3.method4362();
         boolean var5 = var2 == var1 - 1;

         for(int var6 = 0; var6 < var4; ++var6) {
            if (var5 && var6 == var4 - 1) {
               this.field10574.method4818(this.field10569, (byte)-60);
            } else {
               this.field10569.method2839(0, this.field10581);
            }

            class33 var7 = this.field10570;
            if (var6 == 0) {
               var7 = this.field10568;
            }

            var3.method4371(var6, this.field10569, var7, this.field10576, this.field10568);
            this.method6607();
            var3.method4361(var6);
            class33 var8 = this.field10570;
            this.field10570 = this.field10571;
            this.field10571 = var8;
            class813 var9 = this.field10573;
            this.field10573 = this.field10581;
            this.field10581 = var9;
         }
      }

      this.field10574.method633(1);
      this.field10574.method619(0);
   }

   void method6601() {
      this.method6599();
      switch(this.field10582) {
      case 0:
         this.field10584 = class482.field8399;
         break;
      case 1:
         this.field10584 = class482.field8396;
         break;
      case 2:
         this.field10584 = class482.field8403;
         break;
      default:
         throw new RuntimeException();
      }

      this.field10569 = this.field10574.method4942();
      this.field10570 = this.field10574.method615(class264.field8191, this.field10584, this.field10577, this.field10578);
      this.field10573 = this.field10570.method3326(0);
      this.field10571 = this.field10574.method615(class264.field8191, this.field10584, this.field10577, this.field10578);
      this.field10581 = this.field10571.method3326(0);
      this.field10568 = this.field10574.method615(class264.field8191, this.field10584, this.field10577, this.field10578);
      this.field10575 = this.field10568.method3326(0);
      this.field10576 = this.field10574.method5058(this.field10577, this.field10578);
      int var1 = this.field10572.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         class442 var3 = (class442)this.field10572.elementAt(var2);
         var3.method4359(this.field10577, this.field10578);
      }

   }

   boolean method6602(class442 var1) {
      return this.method6603(this.field10572.size(), var1);
   }

   boolean method6603(int var1, class442 var2) {
      if (!var2.method4355() && !var2.method4356()) {
         this.method6605(var2);
         return true;
      } else {
         this.field10572.insertElementAt(var2, var1);
         var2.method4359(this.field10577, this.field10578);
         int var3 = var2.method4363();
         if (var3 > this.field10582) {
            this.field10582 = var3;
         }

         var2.field7761 = true;
         return true;
      }
   }

   void method6604() {
      if (this.field10580) {
         this.method6600();
         this.field10580 = false;
      }

   }

   void method6605(class442 var1) {
      var1.method4358();
      var1.field7761 = false;
      this.field10572.removeElement(var1);
   }

   void method6606() {
      this.field10569.method2488();
      this.field10573.method2755();
      this.field10581.method2755();
      this.field10575.method2755();
      this.field10570.method5693();
      this.field10571.method5693();
      this.field10568.method5693();
      this.field10576.method2755();
      int var1 = this.field10572.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         class442 var3 = (class442)this.field10572.elementAt(var2);
         var3.method4358();
      }

   }

   void method6607() {
      this.field10574.method642(0, this.field10579);
      this.field10574.method714(this.field10583);
      this.field10574.method657(class427.field7386, 0, 1);
   }

   boolean method6608(int var1, int var2, int var3, int var4) {
      if (this.field10572.isEmpty()) {
         return false;
      } else {
         if (this.field10577 != var3 || this.field10578 != var4 && this.field10574 instanceof class608) {
            this.field10577 = var3;
            this.field10578 = var4;
            this.method6606();
            this.method6601();
         }

         this.field10569.method2839(0, this.field10575);
         if (this.field10576 != null) {
            this.field10569.method2834(this.field10576);
         }

         this.field10574.method5009(this.field10569, (byte)22);
         this.field10574.method4831(3, -16777216);
         this.field10574.method551(15);
         this.field10574.method656(0);
         if (!this.field10569.method2836()) {
            throw new RuntimeException("");
         } else {
            this.field10580 = true;
            return true;
         }
      }
   }
}
