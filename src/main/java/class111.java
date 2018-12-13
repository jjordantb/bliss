public class class111 {
   class539 field1903 = new class539(256);
   class180 field1904;
   class180 field1905;
   class539 field1906 = new class539(256);
   static int field1907;

   class656 method1352(int var1, int var2, int[] var3, int var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5;
         class656 var8 = (class656)this.field1906.method2331(var6);
         if (var8 != null) {
            return var8;
         } else if (var3 != null && var3[0] <= 0) {
            return null;
         } else {
            class624 var9 = class624.method5837(this.field1905, var1, var2);
            if (var9 == null) {
               return null;
            } else {
               var8 = var9.method5834();
               this.field1906.method2337(var8, var6);
               if (var3 != null) {
                  var3[0] -= var8.field9400.length;
               }

               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "lh.a(" + ')');
      }
   }

   class656 method1353(int var1, int var2, int[] var3, int var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
         var5 |= var1 << 16;
         long var6 = (long)var5 ^ 4294967296L;
         class656 var8 = (class656)this.field1906.method2331(var6);
         if (var8 != null) {
            return var8;
         } else if (var3 != null && var3[0] <= 0) {
            return null;
         } else {
            class29 var9 = (class29)this.field1903.method2331(var6);
            if (var9 == null) {
               var9 = class29.method3509(this.field1904, var1, var2);
               if (var9 == null) {
                  return null;
               }

               this.field1903.method2337(var9, var6);
            }

            var8 = var9.method3511(var3);
            if (var8 == null) {
               return null;
            } else {
               var9.method545(-1460969981);
               this.field1906.method2337(var8, var6);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "lh.f(" + ')');
      }
   }

   public class656 method1354(int var1, int[] var2, int var3) {
      try {
         if (this.field1905.method3266(1029061077) == 1) {
            return this.method1352(0, var1, var2, 1909168122);
         } else if (this.field1905.method3286(var1, -1941901563) == 1) {
            return this.method1352(var1, 0, var2, -1018556227);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lh.b(" + ')');
      }
   }

   public class656 method1355(int var1, int[] var2, byte var3) {
      try {
         if (this.field1904.method3266(853704793) == 1) {
            return this.method1353(0, var1, var2, -745389241);
         } else if (this.field1904.method3286(var1, -1796273847) == 1) {
            return this.method1353(var1, 0, var2, -745389241);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lh.p(" + ')');
      }
   }

   public class111(class180 var1, class180 var2) {
      this.field1905 = var1;
      this.field1904 = var2;
   }

   static final void method1356(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)22);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class492.method4395(var3, var4, var0, (byte)-127);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "lh.el(" + ')');
      }
   }

   static final void method1357(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         class701 var3 = class637.method5936(class643.field9964, class730.field2692.field7765, (byte)34);
         var3.field3364.method6361(var2.length() + 1);
         var3.field3364.method6366(var2, 2114518021);
         class730.field2692.method4380(var3, (byte)-1);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "lh.sb(" + ')');
      }
   }

   static final void method1358(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (var2 == -1) {
            int var3 = var2 >> 14 & 16383;
            int var4 = var2 & 16383;
            class389 var5 = class730.field2697.method5270(681479919);
            var3 -= var5.field1521;
            if (var3 < 0) {
               var3 = 0;
            } else if (var3 >= class730.field2697.method5271(-1866822819)) {
               var3 = class730.field2697.method5271(-1973847066);
            }

            var4 -= var5.field1522;
            if (var4 < 0) {
               var4 = 0;
            } else if (var4 >= class730.field2697.method5272(922370140)) {
               var4 = class730.field2697.method5272(271939870);
            }

            class495.field8099 = (var3 << 9) + 256;
            class516.field4332 = (var4 << 9) + 256;
         } else {
            class495.field8099 = -1;
            class516.field4332 = -1;
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "lh.agw(" + ')');
      }
   }

   static final void method1359(class744 var0, int var1) {
      try {
         class615.field8903.method5391(class615.field8903.field9113, var0.field3161[--var0.field3156] == 1 ? 1 : 0, 1031457025);
         class730.field2697.method5309(2089019629);
         class95.method523(656179282);
         class730.field2647 = false;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lh.ahq(" + ')');
      }
   }

   public static MenuItem method1360(int var0) {
      try {
         return class713.field3542;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "lh.ai(" + ')');
      }
   }

   public static void method1361(int var0, int var1) {
      try {
         class682 var2 = class370.method881(2, (long)var0);
         var2.method4336(-1442934147);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "lh.i(" + ')');
      }
   }
}
