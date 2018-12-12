public class class497 extends class345 {
   int field8120;
   class514 field8121;
   String field8122;

   boolean method4500(class357 var1, int var2) {
      try {
         boolean var3 = true;
         var1.method156(1827791950);

         for(class357 var4 = (class357)this.field8121.method2706(-1933327286); var4 != null; var3 = false) {
            if (class871.method5899(var1.field1702 * 946432351, var4.field1702 * 946432351, -537262415)) {
               class935.method6312(var1, var4, (byte)-70);
               this.field8120 += -130647835;
               return !var3;
            }

            var4 = (class357)this.field8121.method2707(729407080);
         }

         this.field8121.method2704(var1, (byte)-34);
         this.field8120 += -130647835;
         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aij.f(" + ')');
      }
   }

   class497(String var1) {
      this.field8122 = var1;
      this.field8121 = new class514();
   }

   int method4501(int var1) {
      try {
         return this.field8121.field4317 != this.field8121.field4317.field208 ? ((class357)this.field8121.field4317.field208).field1702 * 946432351 : -1;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aij.a(" + ')');
      }
   }

   boolean method4502(class357 var1, int var2) {
      try {
         int var3 = this.method4501(-738020906);
         var1.method156(-1148037047);
         this.field8120 -= -130647835;
         if (-628325139 * this.field8120 == 0) {
            this.method545(-1460969981);
            this.method156(-1345021644);
            class602.field8646 -= -1658575779;
            class602.field8631.method2984(this, var1.field1706 * 6619564980435866523L);
            return false;
         } else {
            return var3 != this.method4501(-912976938);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aij.b(" + ')');
      }
   }

   static final void method4503(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         if (-1 != -1232467723 * var3.field1005) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -66163287 * var3.field1006;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aij.ps(" + ')');
      }
   }
}
