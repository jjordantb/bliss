public class class394 {
   class180 field5416;
   class1 field5417 = new class1(16);
   static class180 field5418;

   public class394(class469 var1, class423 var2, class180 var3) {
      this.field5416 = var3;
      this.field5416.method3286(-1006924897 * class981.field3245.field3271, -1713499559);
   }

   public class544 method3405(int var1, int var2, int var3, int var4, class277 var5, byte var6) {
      try {
         class481[] var7 = null;
         class191 var8 = this.method3409(var1, 1130929596);
         if (var8.field7001 != null) {
            var7 = new class481[var8.field7001.length];

            for(int var9 = 0; var9 < var7.length; ++var9) {
               class176 var10 = var5.method6631(var8.field7001[var9], -1248511043);
               var7[var9] = new class481(-865421291 * var10.field5218, var10.field5215 * -2045013891, var10.field5210 * -415148019, var10.field5216 * 1899082811, 257759203 * var10.field5208, var10.field5217 * 1872498707, 1242301535 * var10.field5214, var10.field5213, -535750953 * var10.field5212, 1283923105 * var10.field5211, -1054886537 * var10.field5209);
            }
         }

         return new class544(-1474936555 * var8.field7000, var7, -1877970137 * var8.field6999, var2, var3, var4, var8.field7002, var8.field7003 * -630450499);
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "nf.f(" + ')');
      }
   }

   public void method3406(byte var1) {
      try {
         class1 var2 = this.field5417;
         synchronized(this.field5417) {
            this.field5417.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nf.b(" + ')');
      }
   }

   public void method3407(int var1, int var2) {
      try {
         class1 var3 = this.field5417;
         synchronized(this.field5417) {
            this.field5417.method2976(var1, 21848590);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nf.p(" + ')');
      }
   }

   public void method3408(int var1) {
      try {
         class1 var2 = this.field5417;
         synchronized(this.field5417) {
            this.field5417.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nf.i(" + ')');
      }
   }

   class191 method3409(int var1, int var2) {
      try {
         class1 var3 = this.field5417;
         class191 var4;
         synchronized(this.field5417) {
            var4 = (class191)this.field5417.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field5416;
            byte[] var10;
            synchronized(this.field5416) {
               var10 = this.field5416.method3285(class981.field3245.field3271 * -1006924897, var1, (byte)-79);
            }

            var4 = new class191();
            if (var10 != null) {
               var4.method3720(new class907(var10), (byte)-47);
            }

            class1 var11 = this.field5417;
            synchronized(this.field5417) {
               this.field5417.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nf.a(" + ')');
      }
   }

   static final void method3410(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= -1567522756;
         var0.field876 = -1825442367 * var2.field3161[681479919 * var2.field3156];
         var0.field865 = var2.field3161[1 + var2.field3156 * 681479919] * 908204397;
         if (1 == var2.field3161[681479919 * var2.field3156 + 2]) {
            var0.field909 = -886348599;
         } else {
            var0.field909 = 643790344;
         }

         if (var2.field3161[var2.field3156 * 681479919 + 3] == 1) {
            var0.field938 = true;
         } else {
            var0.field938 = false;
         }

         if (-1 == var0.field879 * -1309843523 && !var1.field1101) {
            class535.method2284(var0.field867 * -440872681, 1592451280);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nf.iw(" + ')');
      }
   }

   static final void method3411(class744 var0, int var1) {
      try {
         if (class730.field2637 != null) {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class730.field2637;
         } else {
            var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = "";
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nf.aht(" + ')');
      }
   }

   static final void method3412(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)-76);
         class131 var4 = class382.field1410[var2 >>> 16];
         class564 var5 = class317.method471(var4, var3, -635605619);
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var5 == null ? -1 : -440872681 * var5.field867;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nf.rt(" + ')');
      }
   }

   public static void method3413(int var0) {
      try {
         if (19 == -1233866115 * class730.field2733 && !class673.method4261((byte)16) && !class556.method431(-391880689)) {
            class967.method1750(2, 1642271064);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "nf.a(" + ')');
      }
   }

   static final void method3414(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var2 >> 28;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nf.ts(" + ')');
      }
   }
}
