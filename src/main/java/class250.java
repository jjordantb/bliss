public abstract class class250 extends class304 {
   int field7784;
   int field7785;
   int field7786;

   class250(InputStream var1) {
      super(var1);
      this.field7786 = var1.method6374();
      this.field7785 = var1.method6374();
      this.field7784 = var1.method6371();
   }

   boolean method2387(int var1) {
      try {
         class745 var2 = class635.field9823.method1053(this.field7786, -2111155708);
         boolean var3 = var2.method2592((byte)51);
         Animation var4 = class936.field10313.method2256(var2.field4107, (byte)13);
         var3 &= var4.method3561(1053460676);
         return var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ym.p(" + ')');
      }
   }

   static final void method4387(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var0.field905 = var2.field3161[--var2.field3156] == 1;
         class814.method2932(var0, 564764353);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ym.fo(" + ')');
      }
   }

   public static void method4388(int var0) {
      try {
         if (class791.field447 != -1) {
            class295.method6520(class791.field447, -1, -1, false, 225660373);
            class791.field447 = -1;
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ym.cx(" + ')');
      }
   }

   static final void method4389(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         String var3 = (String)var0.field3157[--var0.field3158];
         if (-1 == var2) {
            throw new RuntimeException();
         } else {
            class833 var4 = class808.field4598.method4721(var2, 1528209569);
            if ('s' != var4.field9171) {
               throw new RuntimeException();
            } else {
               int[] var5 = var4.method5429(var3, (short)19209);
               int var6 = 0;
               if (var5 != null) {
                  var6 = var5.length;
               }

               var0.field3161[++var0.field3156 - 1] = var6;
            }
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ym.vf(" + ')');
      }
   }

   static final void method4390(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class352.method1403(var3, var4, var0, 845844637);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ym.gr(" + ')');
      }
   }

   static final void method4391(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-23);
         var0.field3161[++var0.field3156 - 1] = var3.field1031;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ym.rc(" + ')');
      }
   }

   static final void method4392(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3169.field9712;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ym.xg(" + ')');
      }
   }
}
