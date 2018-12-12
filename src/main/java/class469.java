public class class469 {
   public static class469 field7320 = new class469("stellardawn", "Stellar Dawn", 1);
   public String field7321;
   static class469 field7322 = new class469("game3", "Game 3", 2);
   static class469 field7323 = new class469("game4", "Game 4", 3);
   public static class469 field7324 = new class469("BlissScape", "BlissScape", 0);
   static class469 field7325 = new class469("game5", "Game 5", 4);
   public String field7326;
   public int field7327;
   static class357 field7328;
   static int field7329;

   class469(String var1, String var2, int var3) {
      this.field7321 = var1;
      this.field7326 = var2;
      this.field7327 = var3;
   }

   public static long method4016(int var0, int var1) {
      try {
         return 86400000L * (long)(11745 + var0);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rb.r(" + ')');
      }
   }

   static void method4017(Actor var0, int var1, int var2) {
      try {
         if (var0.field4057 != null) {
            class647 var3 = (class647)class367.method1565(class458.method3829((byte)-26), var1, (byte)2);
            int var4 = var0.field4057[var3.method5481((byte)-118)];
            if (var4 != var0.activeAnimator.method2779(1579357241)) {
               var0.activeAnimator.method2789(var4, var0.activeAnimator.method2783((short)758), -684011169);
               var0.field4089 = var0.field4084;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "rb.hk(" + ')');
      }
   }

   static void method4018(int var0, int var1, int var2, class31 var3, int var4) {
      try {
         long var5 = (long)(var0 << 28 | var2 << 14 | var1);
         class508 var7 = (class508)class730.field2666.method2942(var5);
         if (var7 == null) {
            var7 = new class508();
            class730.field2666.method2947(var7, var5);
            var7.field3966.method897(var3, 1567854006);
         } else {
            ItemDefinition var8 = class85.field1121.method1566(var3.field5319);
            int var9 = var8.field4238;
            if (var8.field4221 == 1) {
               var9 *= 1 + var3.field5318;
            }

            for(class31 var10 = (class31)var7.field3966.method901(1766612795); var10 != null; var10 = (class31)var7.field3966.method906(49146)) {
               var8 = class85.field1121.method1566(var10.field5319);
               int var11 = var8.field4238;
               if (1 == var8.field4221) {
                  var11 *= 1 + var10.field5318;
               }

               if (var9 > var11) {
                  class700.method6330(var3, var10, 1979456016);
                  return;
               }
            }

            var7.field3966.method897(var3, 1066004680);
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "rb.jt(" + ')');
      }
   }

   static void method4019(class564 var0, int var1) {
      try {
         if (5 == var0.field869 && -1 != var0.field1005) {
            class657.method5659(class593.field1623, var0, -1423422969);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rb.lz(" + ')');
      }
   }

   static final void method4020(class564[] var0, int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            class564 var4 = var0[var3];
            if (var4 != null && var1 == var4.field885) {
               if (class730.method1762(var4)) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var4.field869 == 0) {
                     method4020(var0, var4.field867, (byte)1);
                     if (var4.field1018 != null) {
                        method4020(var4.field1018, var4.field867, (byte)1);
                     }

                     class256 var5 = (class256)class730.field2823.method2942((long)var4.field867);
                     if (var5 != null) {
                        class758.method2735(var5.field8101, 587240851);
                     }
                  }

                  if (6 == var4.field869 && var4.field1015 != -1) {
                     if (var4.field877 == null) {
                        var4.field877 = new class522();
                        var4.field877.method2777(var4.field1015, -1878217807);
                     }

                     if (var4.field877.method2778(class730.field2943, 1675733273) && var4.field877.method2788(1621670182)) {
                        var4.field877.method2790(507141034);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "rb.le(" + ')');
      }
   }

   static void method4021(int var0) {
      try {
         if (13 == class730.field2733) {
            class364.method1612(-1611681764);
         }

         class839.method5405((byte)76);
         class730.field2674.method4374((byte)113);
         class619.field8869 = true;
         class386.method1168((byte)1);

         int var1;
         for(var1 = 0; var1 < class730.field2851.length; ++var1) {
            class730.field2851[var1] = null;
         }

         class730.field2817 = false;
         class127.method1600(-338598105);
         class730.field2798 = (int)(Math.random() * 100.0D) - 50;
         class730.field2723 = (int)(Math.random() * 110.0D) - 55;
         class730.field2725 = (int)(Math.random() * 80.0D) - 40;
         class730.field2782 = (int)(Math.random() * 120.0D) - 60;
         class730.field2730 = (int)(Math.random() * 30.0D) - 20;
         class730.field2931 = (float)((int)(Math.random() * 160.0D) - 80 & 16383);
         class75.method1122(1944021119);

         for(var1 = 0; var1 < 2048; ++var1) {
            class730.loaded[var1] = null;
         }

         class923.local = null;
         class730.field2684 = 0;
         class730.field2753 = 0;
         class730.field2677.method2941((byte)-7);
         class730.field2805.method905((byte)1);
         class730.field2806.method2941((byte)-106);
         class730.field2631.method5208(585418023);
         class730.field2666.method2941((byte)-42);
         class563.field1071 = new class373();
         class563.field1081 = new class373();
         class827.field9037.method5493(-1549621575);
         class114.method1296((byte)-108);
         class747.field4147 = 0;
         class124.field2411 = 0;
         class607.field8561 = 0;
         class83.field1100 = 0;
         class75.field1495 = 0;
         class454.field7231 = 0;
         class764.field4349 = 0;
         class637.field9857 = 0;
         class665.field9598 = 0;
         class617.field8843 = 0;

         for(var1 = 0; var1 < class14.field6693.length; ++var1) {
            if (!class474.field8271[var1]) {
               class14.field6693[var1] = -1;
            }
         }

         if (class730.field2822 != -1) {
            class407.method5536(class730.field2822, -2042512871);
         }

         for(class256 var3 = (class256)class730.field2823.method2946(1962409913); var3 != null; var3 = (class256)class730.field2823.method2945((byte)-39)) {
            if (!var3.method546(-629325116)) {
               var3 = (class256)class730.field2823.method2946(1772804345);
               if (var3 == null) {
                  break;
               }
            }

            class526.method2226(var3, true, false, -113822480);
         }

         class730.field2822 = -1;
         class730.field2823 = new class6(8);
         class515.method2693((short)255);
         class730.field2633 = null;

         for(var1 = 0; var1 < 8; ++var1) {
            class730.field2801[var1] = null;
            class730.field2802[var1] = false;
            class730.field2886[var1] = -1;
         }

         class516.method2730((byte)-40);
         class730.field2644 = true;

         for(var1 = 0; var1 < 113; ++var1) {
            class730.field2882[var1] = true;
         }

         for(var1 = 0; var1 < 6; ++var1) {
            class730.field2902[var1] = new class285();
         }

         class730.field2697.method5282((byte)-46).method5673(-1196946367);
         class730.field2744 = true;
         class503.field4103 = ObjectDefinition.field2255 = NpcDefinition.field9918 = ItemDefinition.field4275 = new short[256];
         class776.field3730 = class814.field4728.method2927(class321.field1066, -875414210);
         class615.field8903.method5391(class615.field8903.field9131, class615.field8903.field9130.method5267(-2013953489), 185315871);
         class730.field2694 = 0;
         class906.method6342(2108312995);
         class190.method3732(-2137735375);
         class454.field7230 = null;
         class547.field412 = 0L;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "rb.ak(" + ')');
      }
   }

   static final void method4022(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class606.field8572.method5401("jagtheora", -935061597) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rb.and(" + ')');
      }
   }
}
