final class class700 extends class856 {
   void method5196(int var1) {
      try {
         class540.field3915 = class540.field3928;
         class540.field3928 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "yz.a(" + ')');
      }
   }

   public static final void method6329(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      try {
         class747.field4147 = var0;
         class124.field2411 = var1;
         class607.field8561 = var2;
         class83.field1100 = var3;
         class75.field1495 = var4;
         if (var5 && class75.field1495 >= 100) {
            class103.field205 = class747.field4147 * 512 + 256;
            class7.field4918 = 256 + class124.field2411 * 512;
            class184.field5230 = class679.method4271(class103.field205, class7.field4918, class899.field9552, -2087363822) - class607.field8561;
         }

         class563.field1083 = 3;
         class516.field4332 = -1;
         class495.field8099 = -1;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "yz.hu(" + ')');
      }
   }

   public static void method6330(Node var0, Node var1, int var2) {
      try {
         if (var0.field642 != null) {
            var0.method545(-1460969981);
         }

         var0.field642 = var1.field642;
         var0.field640 = var1;
         var0.field642.field640 = var0;
         var0.field640.field642 = var0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "yz.b(" + ')');
      }
   }

   static class682 method6331(byte var0) {
      try {
         class682 var1 = (class682)class682.field7715.method2706(1993015786);
         if (var1 != null) {
            var1.method545(-1460969981);
            var1.method156(-834696673);
            return var1;
         } else {
            do {
               var1 = (class682)class682.field7684.method2706(-962629622);
               if (var1 == null) {
                  return null;
               }

               if (var1.method4339(1111075384) > class27.resetTimer((byte)1)) {
                  return null;
               }

               var1.method545(-1460969981);
               var1.method156(1430055356);
            } while(0L == (var1.field209 & Long.MIN_VALUE));

            return var1;
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "yz.b(" + ')');
      }
   }
}
