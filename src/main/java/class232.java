import java.io.File;
import java.io.IOException;

public class class232 implements class54 {
   class180 field8263;
   class912 field8264;
   class48 field8265;
   public static int field8266;

   class232(class180 var1, class912 var2) {
      this.field8263 = var1;
      this.field8264 = var2;
   }

   public void method1543(boolean var1, byte var2) {
      try {
         if (var1) {
            int var3 = class759.field4331 > class730.field2775 ? class759.field4331 * -2010408377 * -2110394505 : 775068819 * class730.field2775 * -1710562917;
            int var4 = class97.field614 > class730.field2784 ? class97.field614 * 1445266787 * -1111710645 : class730.field2784 * -1097173605 * -791746413;
            int var5 = this.field8265.method5594();
            int var6 = this.field8265.method3109();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
               var10 = 0;
               var9 = var4;
               var8 = var5 * var4 / var6;
               var7 = (var3 - var8) / 2;
            }

            this.field8265.method3116(var7, var10, var8, var9);
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "fl.f(" + ')');
      }
   }

   public boolean method1537(int var1) {
      try {
         return this.field8263.method3280(this.field8264.field10423, -457216440);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fl.b(" + ')');
      }
   }

   public void method1538(int var1) {
      try {
         this.field8265 = class611.method5156(this.field8263, this.field8264.field10423, (byte)-105);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fl.a(" + ')');
      }
   }

   static final void method4660(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var0.field942 = var2.field3161[--var2.field3156];
         class814.method2932(var0, -2049323512);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fl.gc(" + ')');
      }
   }

   static final void method4661(class564 var0, class744 var1, int var2) {
      try {
         int var3 = var1.field3161[--var1.field3156];
         int var4 = var1.field3161[--var1.field3156] - 1;
         if (var0.field909 != 6) {
            throw new RuntimeException("");
         } else {
            NpcDefinition var5 = class258.field7913.method12(var0.field876, -1577596397);
            if (var0.field1032 == null) {
               var0.field1032 = new class692(var5, true);
            }

            var0.field1032.field7133 = class390.method3422(1726426173);
            if (var4 >= 0 && var4 < var5.field9865.length) {
               var0.field1032.field7131[var4] = var3;
               class814.method2932(var0, 649700405);
            } else {
               throw new RuntimeException("" + var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fl.qt(" + ')');
      }
   }

   static final void method4662(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class923.local.field3388 != null && class923.local.field3388.field2447 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fl.ud(" + ')');
      }
   }

   static byte[] method4663(File var0, int var1, int var2) {
      try {
         byte[] var4;
         try {
            byte[] var3 = new byte[var1];
            class936.method6280(var0, var3, var1, 1833251010);
            var4 = var3;
         } catch (IOException var5) {
            return null;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fl.f(" + ')');
      }
   }

   static final void method4664(Actor var0, boolean var1, int var2) {
      try {
         int var3 = class647.field9231.field9230;
         int var4 = 0;
         if (var0.field4059 > class730.field2866) {
            class84.method942(var0, -455530754);
         } else if (var0.field4067 >= class730.field2866) {
            class154.method3487(var0, -1562807680);
         } else {
            class389.method1151(var0, var1, 365613015);
            var3 = class545.field3910;
            var4 = class488.field8423;
         }

         class32 var5 = var0.method1511().field7637;
         int var6;
         if ((int)var5.field5296 < 512 || (int)var5.field5299 < 512 || (int)var5.field5296 >= (class730.field2697.method5271(-2045914503) - 1) * 512 || (int)var5.field5299 >= (class730.field2697.method5272(2070989013) - 1) * 512) {
            var0.activeAnimator.method2777(-1, -1660674133);

            for(var6 = 0; var6 < var0.field4040.length; ++var6) {
               var0.field4040[var6].field10341 = -1;
               var0.field4040[var6].field10340.method2777(-1, -1698848994);
            }

            var0.field4057 = null;
            var0.field4059 = 0;
            var0.field4067 = 0;
            var3 = class647.field9231.field9230;
            var4 = 0;
            var0.method1515((float)(var0.field4085[0] * 512 + var0.method2550() * 256), var5.field5300, (float)(512 * var0.field4055[0] + var0.method2550() * 256));
            var0.method2547(229400295);
         }

         if (class923.local == var0 && ((int)var5.field5296 < 6144 || (int)var5.field5299 < 6144 || (int)var5.field5296 >= (class730.field2697.method5271(-2000317727) - 12) * 512 || (int)var5.field5299 >= (class730.field2697.method5272(52673101) - 12) * 512)) {
            var0.activeAnimator.method2777(-1, -1994577841);

            for(var6 = 0; var6 < var0.field4040.length; ++var6) {
               var0.field4040[var6].field10341 = -1;
               var0.field4040[var6].field10340.method2777(-1, -2027122238);
            }

            var0.field4057 = null;
            var0.field4059 = 0;
            var0.field4067 = 0;
            var3 = class647.field9231.field9230;
            var4 = 0;
            var0.method1515((float)(var0.field4085[0] * 512 + var0.method2550() * 256), var5.field5300, (float)(512 * var0.field4055[0] + var0.method2550() * 256));
            var0.method2547(1590910009);
         }

         var6 = class335.method40(var0, 1199726988);
         class115.method1274(var0, -1145965611);
         class148.method1132(var0, var3, var4, var6, -830154452);
         class469.method4017(var0, var3, 1842586894);
         class871.method5898(var0, (byte)27);
         class567 var7 = class567.method785();
         var7.method798(class703.method2002(var0.field4048.method5553((byte)0)), class703.method2002(var0.field4075.method5553((byte)0)), class703.method2002(var0.field4077.method5553((byte)0)));
         var0.method1520(var7);
         var7.method795();
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "fl.hn(" + ')');
      }
   }
}
