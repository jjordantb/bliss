import java.io.IOException;

public class class302 extends class649 implements Runnable {
   public static class575 field3768;

   public void run() {
      try {
         super.field9262 = true;

         try {
            try {
               while(!super.field9263) {
                  for(int var1 = 0; var1 < 2; ++var1) {
                     class752 var2 = super.field9264[var1];
                     if (var2 != null) {
                        var2.method2626(425339976);
                     }
                  }

                  class764.method2745(10L);
                  class447.method4320((Object)null, -1086923830);
               }
            } catch (Exception var3) {
               class764.method2747((String)null, var3, (short)-24181);
               super.field9262 = false;
               return;
            }

            super.field9262 = false;
         } catch (RuntimeException var4) {
            super.field9262 = false;
            throw var4;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vn.run(" + ')');
      }
   }

   static void method2352(int var0) {
      try {
         if (class904.field10355 != null) {
            try {
               short var1;
               if (class904.field10354 == 0) {
                  var1 = 250;
               } else {
                  var1 = 2000;
               }

               ++class904.field10352;
               if (class904.field10352 > var1) {
                  class365.method1645(261104990);
               }

               int var3;
               if (class904.field10355 == class51.field2307) {
                  class730.field2674.method4379(class897.method5626(class569.field24.method2740(295506052), 15000, -649048480), class569.field24.field4343, (byte)0);
                  class730.field2674.method4373((short)8191);
                  class701 var2 = class776.method2295(-1410195138);
                  var2.field3364.method6361(class909.field10391.field10394);
                  var2.field3364.method6362(0, 16711935);
                  var3 = var2.field3364.field10376;
                  var2.field3364.method6362(718, 16711935);
                  var2.field3364.method6362(1, 16711935);
                  class861.field9024 = class152.method3404(var2, -201782073);
                  int var4 = var2.field3364.field10376;
                  var2.field3364.method6366(class730.field2636, 2134259589);
                  var2.field3364.method6362(class730.field2646, 16711935);
                  var2.field3364.method6385(class730.field2626);
                  var2.field3364.method6361(class321.field1066.method89(694163818));
                  var2.field3364.method6361(class730.field2926.field7327);
                  class498.method4491(var2.field3364, (byte)1);
                  String var5 = class730.field2629;
                  var2.field3364.method6361(var5 == null ? 0 : 1);
                  if (var5 != null) {
                     var2.field3364.method6366(var5, 2125451920);
                  }

                  class86.field1134.method1818(var2.field3364, -1943858301);
                  var2.field3364.field10376 += 7;
                  var2.field3364.method6388(class861.field9024, var4, var2.field3364.field10376, -2001901156);
                  var2.field3364.method6369(var2.field3364.field10376 - var3, 1585504133);
                  class730.field2674.method4380(var2, (byte)-37);
                  class730.field2674.method4376(-1810127022);
                  class904.field10355 = class51.field2308;
               }

               if (class51.field2308 == class904.field10355 && class730.field2674.method4377(537308016).method175(1, (byte)-109)) {
                  class730.field2674.method4377(537308016).method177(class730.field2674.field7768.field10375, 0, 1, (byte)-97);
                  class904.field10356 = (class235)class367.method1565(class878.method5919((short)4505), class730.field2674.field7768.field10375[0] & 255, (byte)2);
                  if (class904.field10356 != class235.field8248) {
                     class730.field2674.method4374((byte)83);
                  } else {
                     class730.field2674.field7765 = new class246(class861.field9024);
                     int[] var8 = new int[4];

                     for(var3 = 0; var3 < 4; ++var3) {
                        var8[var3] = 50 + class861.field9024[var3];
                     }

                     class730.field2674.field7769 = new class246(var8);
                     new class246(var8);
                     class730.field2674.field7768.method2649(class730.field2674.field7769, (byte)81);
                     class967.method1750(8, 1887293413);
                     class730.field2674.method4373((short)8191);
                     class730.field2674.field7768.field10376 = 0;
                     class730.field2674.field7779 = null;
                     class730.field2674.field7780 = null;
                     class730.field2674.field7783 = null;
                     class730.field2674.field7773 = 0;
                  }

                  class730.field2674.field7770 = null;
                  class904.field10355 = null;
               }
            } catch (IOException var6) {
               class365.method1645(-1990066446);
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "vn.n(" + ')');
      }
   }
}
