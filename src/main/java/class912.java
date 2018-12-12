public class class912 implements class925 {
   public int field10423;
   public static class888 field10424;

   public class7 method6197(int var1) {
      try {
         return class7.field4913;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "gt.f(" + ')');
      }
   }

   class912(int var1) {
      this.field10423 = var1;
   }

   static final void method6480(class564 var0, class131 var1, class744 var2, short var3) {
      try {
         int var4 = var2.field3161[--var2.field3156];
         if (var0.field1014 != var4) {
            var0.field1014 = var4;
            class814.method2932(var0, -1283605613);
         }

         if (-1 == var0.field879 && !var1.field1101) {
            class146.method1183(var0.field867, (byte)12);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gt.gs(" + ')');
      }
   }

   static void method6481(long[] var0, Object[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            int var10 = Long.MAX_VALUE == var7 ? 0 : 1;

            for(int var11 = var2; var11 < var3; ++var11) {
               if (var0[var11] < var7 + (long)(var11 & var10)) {
                  long var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  Object var14 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var14;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method6481(var0, var1, var2, var6 - 1, 975453798);
            method6481(var0, var1, var6 + 1, var3, -1825686782);
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "gt.q(" + ')');
      }
   }

   static void method6482(int var0) {
      try {
         int[] var1 = new int[class85.field1121.field2328];
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < class85.field1121.field2328; ++var3) {
            ItemDefinition var4 = class85.field1121.method1569(var3, true);
            if (var4.field4241 >= 0 || var4.field4265 >= 0) {
               var1[var2++] = var3;
            }
         }

         class2.field4948 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            class2.field4948[var3] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gt.n(" + ')');
      }
   }

   static final void method6483(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)-27);
         int var4 = -1;
         int var5 = -1;
         class118 var6 = var3.method826(class593.field1623, 1559428350);
         if (var6 != null) {
            var4 = var6.field2152;
            var5 = var6.field2153;
         }

         var0.field3161[++var0.field3156 - 1] = var4;
         var0.field3161[++var0.field3156 - 1] = var5;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "gt.rm(" + ')');
      }
   }
}
