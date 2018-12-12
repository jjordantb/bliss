public class class127 extends class576 {
   void method59(boolean var1, int var2, int var3, int var4) {
      try {
         int var5 = this.method66(-191128334) * super.field70.field9032 / 10000;
         class593.field1623.method4984(var2, 2 + var3, var5, super.field70.field9036 - 2, ((class634)super.field70).field9788, 0);
         class593.field1623.method4984(var2 + var5, 2 + var3, super.field70.field9032 - var5, super.field70.field9036 - 2, 0, 0);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "zu.r(" + ')');
      }
   }

   class127(class180 var1, class180 var2, class634 var3) {
      super(var1, var2, var3);
   }

   void method60(boolean var1, int var2, int var3, int var4) {
      try {
         class593.field1623.method4838(var2 - 2, var3, super.field70.field9032 + 4, 2 + super.field70.field9036, ((class634)super.field70).field9789, 0);
         class593.field1623.method4838(var2 - 1, 1 + var3, super.field70.field9032 + 2, super.field70.field9036, 0, 0);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "zu.x(" + ')');
      }
   }

   static int method1597(class513 var0, int var1) {
      try {
         int var2 = var0.method2647(2);
         int var3;
         if (var2 == 0) {
            var3 = 0;
         } else if (var2 == 1) {
            var3 = var0.method2647(5);
         } else if (var2 == 2) {
            var3 = var0.method2647(8);
         } else {
            var3 = var0.method2647(11);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "zu.p(" + ')');
      }
   }

   static final void method1598(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         String var3 = (String)var0.field3157[--var0.field3158];
         if (-1 == var2) {
            throw new RuntimeException();
         } else {
            class833 var4 = class808.field4598.method4721(var2, 1528209569);
            if (var4.field9171 != 's') {
               throw new RuntimeException();
            } else {
               var0.field3161[++var0.field3156 - 1] = var4.method5428(var3, (byte)88) ? 1 : 0;
            }
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "zu.va(" + ')');
      }
   }

   static final void method1599(class744 var0, byte var1) {
      try {
         var0.field3162 -= 2;
         if (var0.field3168[var0.field3162] >= var0.field3168[var0.field3162 + 1]) {
            var0.field3176 += var0.field3174[var0.field3176];
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "zu.bu(" + ')');
      }
   }

   public static void method1600(int var0) {
      try {
         class540.field3927 = new class45[50];
         class540.field3926 = 0;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "zu.u(" + ')');
      }
   }
}
