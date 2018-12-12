import java.awt.Point;

public class class587 {
   public boolean field211 = false;
   int field212;
   int field213;
   int[][][] field214;
   class630[] field215;
   int field216 = 0;
   int field217 = 1387168171;
   class599 field218 = new class599();
   static class630 field219 = new class630(0, 0);

   final void method160(int var1) {
      try {
         for(int var2 = 0; var2 < this.field213 * -431482401; ++var2) {
            this.field214[var2][0] = null;
            this.field214[var2][1] = null;
            this.field214[var2][2] = null;
            this.field214[var2] = null;
         }

         this.field215 = null;
         this.field214 = null;
         this.field218.method1286(-1888417482);
         this.field218 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.a(" + ')');
      }
   }

   class587(int var1, int var2, int var3) {
      this.field212 = var2 * 982864511;
      this.field213 = var1 * 1934811679;
      this.field214 = new int[this.field213 * -431482401][3][var3];
      this.field215 = new class630[1714711935 * this.field212];
   }

   public final int[][][] method161(byte var1) {
      try {
         if (-431482401 * this.field213 != this.field212 * 1714711935) {
            throw new RuntimeException();
         } else {
            for(int var2 = 0; var2 < this.field213 * -431482401; ++var2) {
               this.field215[var2] = field219;
            }

            return this.field214;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.b(" + ')');
      }
   }

   public final int[][] method162(int var1, byte var2) {
      try {
         if (1714711935 * this.field212 != this.field213 * -431482401) {
            if (this.field213 * -431482401 != 1) {
               class630 var3 = this.field215[var1];
               if (var3 == null) {
                  this.field211 = true;
                  if (this.field216 * -1543676323 >= this.field213 * -431482401) {
                     class630 var4 = (class630)this.field218.method1278(-1469951766);
                     var3 = new class630(var1, var4.field9805 * -1217806945);
                     this.field215[var4.field9804 * -1336494225] = null;
                     var4.method545(-1460969981);
                  } else {
                     var3 = new class630(var1, -1543676323 * this.field216);
                     this.field216 += 1892836853;
                  }

                  this.field215[var1] = var3;
               } else {
                  this.field211 = false;
               }

               this.field218.method1279(var3, -726505062);
               return this.field214[var3.field9805 * -1217806945];
            } else {
               this.field211 = var1 != -975728899 * this.field217;
               this.field217 = -1387168171 * var1;
               return this.field214[0];
            }
         } else {
            this.field211 = this.field215[var1] == null;
            this.field215[var1] = field219;
            return this.field214[var1];
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ka.f(" + ')');
      }
   }

   static void method163(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         int var2 = var0.field3161[var0.field3156 * 681479919];
         int var3 = var0.field3161[1 + 681479919 * var0.field3156];
         class785 var4 = class452.field7216.method5148(var3, 1588900320);
         if (var4.method2380(1883696427)) {
            String var5 = var4.field3823;
            if (-1 == var2) {
               var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = var5;
            } else {
               var0.field3157[(var0.field3158 += 969361751) * -203050393 - 1] = class735.field3009.method4224(var2, 245040087).method5333(var3, var5, 1005518410);
            }
         } else {
            int var7 = -388931549 * var4.field3822;
            if (var2 == -1) {
               var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var7;
            } else {
               var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class735.field3009.method4224(var2, 245040087).method5331(var3, var7, (byte)-64);
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ka.o(" + ')');
      }
   }

   public static void method164(int var0, int var1, byte var2) {
      try {
         class956.method2113(var0, var1, -1278555731);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ka.l(" + ')');
      }
   }

   public static void method165(int var0, int var1) {
      try {
         if (var0 == 37) {
            class740.field7809 = 3.0F;
         } else if (50 == var0) {
            class740.field7809 = 4.0F;
         } else if (var0 == 75) {
            class740.field7809 = 6.0F;
         } else if (100 == var0) {
            class740.field7809 = 8.0F;
         } else if (200 == var0) {
            class740.field7809 = 16.0F;
         }

         class740.field3201 = 789877945;
         class740.field3201 = 789877945;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ka.cw(" + ')');
      }
   }

   static final void method166(class564 var0, class744 var1, byte var2) {
      try {
         class230 var3 = var0.method823(class785.field3827, class730.field2681, (byte)-46);
         int var4 = var1.field3161[(var1.field3156 -= -391880689) * 681479919];
         Point var5 = var3.method4604(var0.field937, var0.field881 * -2093041337, var0.field916 * 418216501, var4, class324.field621, 946663112);
         var1.field3161[(var1.field3156 += -391880689) * 681479919 - 1] = var5.x;
         var1.field3161[(var1.field3156 += -391880689) * 681479919 - 1] = var5.y;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ka.qr(" + ')');
      }
   }

   public static class45 method167(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (class615.field8903.field9119.method2717(-2141800162) != 0 && var1 != 0 && class540.field3926 * -991384187 < 50 && -1 != var0) {
            class45 var6 = new class45((byte)1, var0, var1, var2, var3, 0, var4, (class963)null);
            class540.field3927[(class540.field3926 += -598588595) * -991384187 - 1] = var6;
            return var6;
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ka.n(" + ')');
      }
   }
}
