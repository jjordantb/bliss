import java.awt.Point;

public class class779 {
   class180 field3751;
   class1 field3752 = new class1(64);

   public class779(class469 var1, class423 var2, class180 var3) {
      this.field3751 = var3;
      this.field3751.method3286(class981.field3238.field3271, 689615038);
   }

   public class800 method2319(int var1, int var2) {
      try {
         class1 var3 = this.field3752;
         class800 var4;
         synchronized(this.field3752) {
            var4 = (class800)this.field3752.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field3751;
            byte[] var10;
            synchronized(this.field3751) {
               var10 = this.field3751.method3285(class981.field3238.field3271, var1, (byte)-26);
            }

            var4 = new class800();
            if (var10 != null) {
               var4.method2882(new InputStream(var10), (byte)-66);
            }

            class1 var11 = this.field3752;
            synchronized(this.field3752) {
               this.field3752.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "vu.a(" + ')');
      }
   }

   public static void method2321(int var0, byte var1) {
      try {
         class365.field2451 = var0;
         class1 var2 = class365.field2450;
         synchronized(class365.field2450) {
            class365.field2450.method2977();
         }

         var2 = class365.field2449;
         synchronized(class365.field2449) {
            class365.field2449.method2977();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vu.q(" + ')');
      }
   }

   public static boolean method2322(int var0, int var1) {
      try {
         for(class357 var2 = (class357)class602.field8647.method901(1766612795); var2 != null; var2 = (class357)class602.field8647.method906(49146)) {
            if (class717.method2030(var2.field1702, -77764350) && (long)var0 == var2.field1701) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "vu.j(" + ')');
      }
   }

   static void method2323(int var0, int var1) {
      try {
         if (class615.field8903.field9141.method1734(1899706472) == 0) {
            var0 = -1;
         }

         if (class730.field2816 != var0) {
            if (-1 != var0) {
               class447 var2 = class770.field3733.method2911(var0, 16711935);
               class922 var3 = var2.method4316(1479362312);
               if (var3 != null) {
                  class462.field7361.method144(class837.field9161, var3.method6245(), var3.method6238(), var3.method6249(), new Point(var2.field7626, var2.field7623));
                  class730.field2816 = var0;
               } else {
                  var0 = -1;
               }
            }

            if (var0 == -1 && class730.field2816 != -1) {
               class462.field7361.method144(class837.field9161, (int[])null, -1, -1, new Point());
               class730.field2816 = -1;
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "vu.gv(" + ')');
      }
   }

   static final void method2324(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var0.field976 = var2.field3161[--var2.field3156];
         class814.method2932(var0, -1832191963);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vu.fn(" + ')');
      }
   }

   static final void method2325(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (!class593.field1623.method4878()) {
            var0.field3161[++var0.field3156 - 1] = 3;
         } else {
            var0.field3161[++var0.field3156 - 1] = class615.field8903.field9117.method2273(var2, 1352882135);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "vu.aof(" + ')');
      }
   }
}
