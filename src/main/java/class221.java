import java.util.Stack;

public final class class221 {
   class6 field7345;
   int field7346;
   public static int field7347;

   class221(int var1) {
      this.field7346 = 547036117 * var1;
   }

   public void method4029(int var1, int var2, int var3) {
      try {
         if (this.field7345 == null) {
            this.field7345 = new class6(-1623767683 * this.field7346);
         }

         class722 var4 = (class722)this.field7345.method2942((long)var1);
         if (var4 != null) {
            var4.field3631 = -898670337 * var2;
         } else {
            var4 = new class722(var2);
            this.field7345.method2947(var4, (long)var1);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cz.f(" + ')');
      }
   }

   public int method4030(int var1, byte var2) {
      try {
         class123 var3 = class473.field8291.method5167(var1, -1438180456);
         int var4 = var3.field2434 * -1979044991;
         int var5 = 31 == var3.field2433 * -1638834999 ? -1 : (1 << var3.field2433 * -1638834999 + 1) - 1;
         return (this.method4032(var4, -1967259188) & var5) >>> -2127213381 * var3.field2435;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "cz.p(" + ')');
      }
   }

   public void method4031(byte var1) {
      try {
         if (this.field7345 != null) {
            this.field7345.method2941((byte)-14);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cz.a(" + ')');
      }
   }

   public int method4032(int var1, int var2) {
      try {
         class722 var3 = (class722)this.field7345.method2942((long)var1);
         if (var3 != null) {
            return var3.field3631 * -774922497;
         } else {
            class931 var4 = class619.field8868.method1554(var1, 1792178977);
            return 'i' != var4.field10298 ? -1 : 0;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cz.b(" + ')');
      }
   }

   public static class192 method4033(boolean var0, int var1) {
      try {
         Stack var2 = class192.field7025;
         synchronized(class192.field7025) {
            class192 var3;
            if (class192.field7025.isEmpty()) {
               var3 = new class192();
            } else {
               var3 = (class192)class192.field7025.pop();
            }

            var3.field7023 = var0;
            return var3;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "cz.a(" + ')');
      }
   }

   static final void method4034(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)73);
         class131 var4 = class382.field1410[var2 >> 16];
         class348.method194(var3, var4, var0, -1870622749);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cz.cn(" + ')');
      }
   }

   static final void method4035(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class160.method3568(var3, var4, var0, (byte)-38);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cz.dd(" + ')');
      }
   }

   static final void method4036(class564 var0, class131 var1, class744 var2, short var3) {
      try {
         int var4 = var2.field3161[(var2.field3156 -= -391880689) * 681479919];
         if (var4 != var0.field1015 * 1347982601) {
            if (-1 != var4) {
               if (var0.field877 == null) {
                  var0.field877 = new class522();
               }

               var0.field877.method2777(var4, -1614086942);
            } else {
               var0.field877 = null;
            }

            var0.field1015 = 1587382585 * var4;
            class814.method2932(var0, -1503687245);
         }

         if (-1 == -1309843523 * var0.field879 && !var1.field1101) {
            class589.method216(-440872681 * var0.field867, -1349352488);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "cz.eu(" + ')');
      }
   }

   public static String method4037(class357 var0, int var1) {
      try {
         return !class602.field8645 && var0 != null ? var0.field1707 : "";
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cz.az(" + ')');
      }
   }
}