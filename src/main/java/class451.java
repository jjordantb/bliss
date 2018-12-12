public class class451 extends class298 {
   int field7217 = 0;
   class599 field7218 = new class599();
   int field7219 = -1;
   class599 field7220 = new class599();

   public final synchronized void method6534(int var1) {
      while(true) {
         if (this.field7219 < 0) {
            this.method3873(var1);
         } else if (this.field7217 + var1 < this.field7219) {
            this.field7217 += var1;
            this.method3873(var1);
         } else {
            int var2 = this.field7219 - this.field7217;
            this.method3873(var2);
            var1 -= var2;
            this.field7217 += var2;
            this.method3871();
            class80 var3 = (class80)this.field7218.method1281(2051088877);
            synchronized(var3) {
               int var5 = var3.method871(this);
               if (var5 < 0) {
                  var3.field1091 = 0;
                  this.method3876(var3);
               } else {
                  var3.field1091 = var5;
                  this.method3874(var3.field640, var3);
               }
            }

            if (var1 != 0) {
               continue;
            }
         }

         return;
      }
   }

   public final synchronized void method3870(class298 var1) {
      this.field7220.method1279(var1, -469116234);
   }

   void method3871() {
      if (this.field7217 > 0) {
         for(class80 var1 = (class80)this.field7218.method1281(1813067709); var1 != null; var1 = (class80)this.field7218.method1283((byte)-54)) {
            var1.field1091 -= this.field7217;
         }

         this.field7219 -= this.field7217;
         this.field7217 = 0;
      }

   }

   class298 method6529() {
      return (class298)this.field7220.method1281(1668955802);
   }

   int method6528() {
      return 0;
   }

   public final synchronized void method6533(int[] var1, int var2, int var3) {
      while(true) {
         if (this.field7219 < 0) {
            this.method3872(var1, var2, var3);
         } else if (this.field7217 + var3 < this.field7219) {
            this.field7217 += var3;
            this.method3872(var1, var2, var3);
         } else {
            int var4 = this.field7219 - this.field7217;
            this.method3872(var1, var2, var4);
            var2 += var4;
            var3 -= var4;
            this.field7217 += var4;
            this.method3871();
            class80 var5 = (class80)this.field7218.method1281(1891133222);
            synchronized(var5) {
               int var7 = var5.method871(this);
               if (var7 < 0) {
                  var5.field1091 = 0;
                  this.method3876(var5);
               } else {
                  var5.field1091 = var7;
                  this.method3874(var5.field640, var5);
               }
            }

            if (var3 != 0) {
               continue;
            }
         }

         return;
      }
   }

   void method3872(int[] var1, int var2, int var3) {
      for(class298 var4 = (class298)this.field7220.method1281(1451947817); var4 != null; var4 = (class298)this.field7220.method1283((byte)-61)) {
         var4.method6532(var1, var2, var3);
      }

   }

   void method3873(int var1) {
      for(class298 var2 = (class298)this.field7220.method1281(1824991064); var2 != null; var2 = (class298)this.field7220.method1283((byte)-117)) {
         var2.method6534(var1);
      }

   }

   void method3874(class568 var1, class80 var2) {
      while(var1 != this.field7218.field1710 && ((class80)var1).field1091 <= var2.field1091) {
         var1 = var1.field640;
      }

      class230.method4608(var2, var1, (byte)6);
      this.field7219 = ((class80)this.field7218.field1710.field640).field1091;
   }

   public final synchronized void method3875(class298 var1) {
      var1.method545(-1460969981);
   }

   class298 method6530() {
      return (class298)this.field7220.method1283((byte)-123);
   }

   void method3876(class80 var1) {
      var1.method545(-1460969981);
      var1.method870();
      class568 var2 = this.field7218.field1710.field640;
      if (var2 == this.field7218.field1710) {
         this.field7219 = -1;
      } else {
         this.field7219 = ((class80)var2).field1091;
      }

   }
}
