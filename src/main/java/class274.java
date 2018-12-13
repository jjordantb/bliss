public class class274 extends class806 {
   class257 field10561;
   class86 field10562;
   class104 field10563;
   int field10564 = 0;
   int field10565 = 0;

   public void method2839(int var1, class813 var2) {
      try {
         class104 var3 = (class104)var2;
         if (this.field10562 == null || var3 == null || var3.field167 == this.field10562.field1131 && this.field10562.field1132 == var3.field168) {
            this.field10563 = var3;
            if (var3 != null) {
               this.field10565 = var3.field167;
               this.field10564 = var3.field168;
            } else if (this.field10562 == null) {
               this.field10565 = 0;
               this.field10564 = 0;
            }

            if (this == this.field10561.method4800((short)7140)) {
               this.method2484();
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aeu.z(" + ')');
      }
   }

   public int method2481() {
      try {
         return this.field10565;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "aeu.a(" + ')');
      }
   }

   class274(class257 var1) {
      this.field10561 = var1;
   }

   public boolean method2836() {
      return true;
   }

   public void method2834(class893 var1) {
      try {
         class86 var2 = (class86)var1;
         if (this.field10563 == null || var2 == null || var2.field1131 == this.field10563.field167 && this.field10563.field168 == var2.field1132) {
            this.field10562 = var2;
            if (var2 != null) {
               this.field10565 = var2.field1131;
               this.field10564 = var2.field1132;
            } else if (this.field10563 == null) {
               this.field10565 = 0;
               this.field10564 = 0;
            }

            if (this == this.field10561.method4800((short)-7778)) {
               this.method2484();
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aeu.n(" + ')');
      }
   }

   public int method2493() {
      try {
         return this.field10564;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "aeu.f(" + ')');
      }
   }

   public void method2488() {
   }

   boolean method2484() {
      try {
         this.field10561.method4455(this.field10565, this.field10564, this.field10563 == null ? null : this.field10563.field169, this.field10562 == null ? null : this.field10562.field1133);
         return true;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "aeu.p(" + ')');
      }
   }

   boolean method2482() {
      return true;
   }

   static final void method6596(Widget var0, WidgetContainer var1, class744 var2, byte var3) {
      try {
         var0.field921 = var2.field3161[--var2.field3156] == 1;
         class814.method2932(var0, -1121165811);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aeu.dz(" + ')');
      }
   }
}
