import java.math.BigInteger;

public class class449 {
   static BigInteger field7058 = new BigInteger("10001", 16);
   public static BigInteger field7059;
   public static BigInteger field7060;
   static String[] field7061 = new String[]{"90338093857142919815298021898820722703064281662908805223664", "90088181005667406432658849985153228117526719275077030208801461379427558042560357151", "7030310374801460155709380237447132184049226481150590917170916139154583698227892805450136977038808082395", "796679761291594046331291081426834840830187693291343533346876893", "9246d9c7c5037426c7dd3e91f727ac10ca4e0c5c60760ff20201c9ff6d3f6a5e25c352b59e1336", "4497e01c182d5e2a2cfacd63871a52d56d0c9aa5e9916d31d87ba3cd88fa0b83b44fb26ce0fe5460c2f1b2b44d433d297047e643", "2c84864f89a8b83d43402cac854ec0436356d54c994d63306086159fa65b319e307aef815162443137f80c2876049a95549fdf7edb0c2ad75b39586c12c1b3abd06d9652addae6021c2fce", "9edd2db4fa6a2a6882931fba2817f1c9faebcf72701d917b105f5ff1708e3b5529279a20e54be7aad9faa3f8331ea3d5ee308c3882c35ecf0692", "09d75d32340eb2a2bc6919e315c003df93ae2288f52a2e68bd981fe32c7c7bcc305cf44fd00a52e6bcaaaf791875156e94a494bb5e3628106d64600ea", "5f423aa1859a136cb0b3fa05260b616681e57030e9fb8fc4e139df5369874eb5518bcd8325dc4df05730be59b5939d30464507567a5c8cdbe6d1607fc0907d781", "be51a694cdd56acdb7dc62e930842d42e7fb0aef1a9b0f937cb1c3f8c8b1ad433353eb907e0dddd6b6a3269da319ba8899fb3dcd390", "11c205fbb9bed2335915a98ef9bb656420fc0dc2c18f90adc427f6a66a1f920c275b8ea027db03b874ccff7ff955b75c999ac232fc7ccfef3df6f34", "b1213a07bdd72add252966d5906d93ad70272b4e3277b31ddaecf0d750a53e17dcfc1490133ee03107870d6bfd2e63cf99fb", "107144396184599817873812890799890829596177339832441421545320582402536316", "091228534387301402803358235312099581004262123197858262973099112304039738516", "1079524628864903668263741990170858822604363995889144574408165458662637075098659421700", "41392411172735509113532306933100803393437440393318482310611108445137632871551"};
   static BigInteger field7062;

   static {
      field7062 = new BigInteger(field7061[0] + field7061[1] + field7061[2] + field7061[3]);
      field7060 = new BigInteger("10001", 16);
      field7059 = Loader.field6958 ? new BigInteger(field7061[4] + field7061[5] + field7061[6] + field7061[7] + field7061[8] + field7061[9] + field7061[10] + field7061[11] + field7061[12], 16) : new BigInteger(field7061[13] + field7061[14] + field7061[15] + field7061[16]);
      new BigInteger("10001", 16);
      new BigInteger("bcbc4d92251300b3c4ade65fa1d315d66e370f300925dc949024628fa32b66d253fb8d2813c775c5c97d32a6bc8aeea94bbd3ae869330b2b4bcf7adc5aea89f5", 16);
   }

   class449() throws Throwable {
      throw new Error();
   }

   public static Widget method3756(int var0, byte var1) {
      try {
         int var2 = var0 >> 16;
         if (class382.widgetContainers[var2] == null || class382.widgetContainers[var2].method889(var0, (short)3713) == null) {
            boolean var3 = class215.method3835(var2, (int[])null, -957339129);
            if (!var3) {
               return null;
            }
         }

         return class382.widgetContainers[var2].method889(var0, (short)19883);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "c.f(" + ')');
      }
   }

   public static void method3757(int var0, int var1) {
      try {
         class701 var2 = class637.method5936(class643.field9941, class730.field2692.field7765, (byte)24);
         var2.field3364.method6364(-1, -106491517);
         class730.field2692.method4380(var2, (byte)-71);
         class800.field4577 = new class811(class771.field3732, var0);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "c.ax(" + ')');
      }
   }

   static final void method3758(byte var0) {
      try {
         --class384.field1430;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "c.f(" + ')');
      }
   }

   static final void method3759(class744 var0, byte var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2819;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "c.abh(" + ')');
      }
   }

   static void method3760(long[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            int var10 = Long.MAX_VALUE == var7 ? 0 : 1;

            for(int var11 = var2; var11 < var3; ++var11) {
               if (var0[var11] < (long)(var11 & var10) + var7) {
                  long var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  int var14 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var14;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method3760(var0, var1, var2, var6 - 1, 569685338);
            method3760(var0, var1, 1 + var6, var3, 765910015);
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "c.d(" + ')');
      }
   }

   static void method3761(byte var0) {
      try {
         class455.field7199 = class199.method3748(2048, 35, 8, 8, 4, 0.4F, true, 33985);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "c.i(" + ')');
      }
   }

   static final void method3762(int var0, byte var1) {
      try {
         int var2 = class730.field2866 - class730.field2903;
         if (var2 >= 100) {
            class563.field1083 = 4;
            class516.field4332 = -1;
            class495.field8099 = -1;
         } else {
            int var3 = (int)class730.field2738;
            if (class730.field2745 >> 8 > var3) {
               var3 = class730.field2745 >> 8;
            }

            if (class730.field2665[4] && 128 + class730.field2907[4] > var3) {
               var3 = 128 + class730.field2907[4];
            }

            int var4 = (int)class730.field2931 + class730.field2725 & 16383;
            class32 var5 = class923.local.method1511().field7637;
            class299.method6557(class456.field7163, class679.method4271((int)var5.field5296, (int)var5.field5299, class899.field9552, -1800819540) - 200, class530.field3741, var3, var4, 600 + (var3 >> 3) * 3 << 2, var0, -1059521295);
            float var6 = 1.0F - (float)((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
            class103.field205 = (int)((float)class740.field3213 + var6 * (float)(class103.field205 - class740.field3213));
            class184.field5230 = (int)((float)(class184.field5230 - class614.field8888) * var6 + (float)class614.field8888);
            class7.field4918 = (int)(var6 * (float)(class7.field4918 - class859.field8849) + (float)class859.field8849);
            class730.field2737 = (int)((float)(class730.field2737 - class75.field1496) * var6 + (float)class75.field1496);
            int var7 = class232.field8266 - ItemNode.field6621;
            if (var7 > 8192) {
               var7 -= 16384;
            } else if (var7 < -8192) {
               var7 += 16384;
            }

            class232.field8266 = (int)((float)var7 * var6 + (float) ItemNode.field6621);
            class232.field8266 &= 16383;
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "c.hz(" + ')');
      }
   }

   static final void method3763(class744 var0, byte var1) {
      try {
         var0.field3156 -= 3;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         int var4 = var0.field3161[2 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = var0.field3169.method5777(var2, var3, var4, 1489690746);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "c.xr(" + ')');
      }
   }

   static final void method3764(class744 var0, byte var1) {
      try {
         int var2 = var0.field3174[var0.field3176] >> 16;
         int var3 = var0.field3174[var0.field3176] & '\uffff';
         int var4 = var0.field3161[--var0.field3156];
         if (var4 >= 0 && var4 <= 5000) {
            var0.field3153[var2] = var4;
            byte var5 = -1;
            if (105 == var3) {
               var5 = 0;
            }

            for(int var6 = 0; var6 < var4; ++var6) {
               var0.field3155[var2][var6] = var5;
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "c.an(" + ')');
      }
   }

   static final void method3765(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         Widget var3 = var2.field8255;
         WidgetContainer var4 = var2.field8254;
         Interactable.method2208(var3, var4, var0, (byte)-16);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "c.ih(" + ')');
      }
   }
}
