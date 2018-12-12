public class class488 implements class951 {
   public static int field8421;
   class848 field8422;
   static int field8423;

   public Object method2019(int[] var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         return this.field8422.method4853(var1, var2, var3, var4, var5, false);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "rv.a(" + ')');
      }
   }

   public static boolean method4735(byte[] var0, int var1) {
      try {
         InputStream var2 = new InputStream(var0);
         int var3 = var2.method6371();
         if (var3 != 2) {
            return false;
         } else {
            boolean var4 = var2.method6371() == 1;
            if (var4) {
               class629.method5807(var2, -255751616);
            }

            class163.method3555(var2, 1138164692);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "rv.f(" + ')');
      }
   }

   public static boolean method4736(char var0, int var1) {
      try {
         return var0 >= '0' && var0 <= '9';
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rv.z(" + ')');
      }
   }

   static final void method4737(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         boolean var3 = true;
         if (var2 < 0) {
            var3 = (var2 + 1) % 4 == 0;
         } else if (var2 < 1582) {
            var3 = var2 % 4 == 0;
         } else if (var2 % 4 != 0) {
            var3 = false;
         } else if (var2 % 100 != 0) {
            var3 = true;
         } else if (var2 % 400 != 0) {
            var3 = false;
         }

         var0.field3161[++var0.field3156 - 1] = var3 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rv.aky(" + ')');
      }
   }

   static void method4738(int var0) {
      try {
         class881.field10177.method4373((short)8191);
         class881.field10177.field7768.field10376 = 0;
         class881.field10177.field7770 = null;
         class881.field10177.field7779 = null;
         class881.field10177.field7780 = null;
         class881.field10177.field7783 = null;
         class881.field10177.field7771 = 0;
         class881.field10177.field7773 = 0;
         class730.field2650 = -1;
         class906.method6342(2108312995);
         class528.method2246(385051775);

         int var1;
         for(var1 = 0; var1 < 2048; ++var1) {
            class730.loaded[var1] = null;
         }

         class923.local = null;

         for(var1 = 0; var1 < class730.field2753; ++var1) {
            Actor var2 = (Actor)class730.field2797[var1].field7515;
            if (var2 != null) {
               var2.field4054 = -1;
            }
         }

         class516.method2730((byte)-61);
         class563.field1083 = 4;
         class516.field4332 = -1;
         class495.field8099 = -1;
         class967.method1750(0, 580389189);

         for(var1 = 0; var1 < 113; ++var1) {
            class730.field2882[var1] = true;
         }

         class190.method3732(-2137735375);
         class454.field7230 = null;
         class547.field412 = 0L;
         class131.method896(2030440577);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rv.ae(" + ')');
      }
   }

   public static void method4739(int var0, class180 var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         class818.field4611 = 1;
         class818.field4621 = var1;
         class818.field4622 = var2;
         class818.field4623 = var3;
         class818.field4625 = null;
         class818.field4616 = var4;
         class342.field294 = var5;
         class573.field105 = var0;
         class166.field6898 = null;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "rv.r(" + ')');
      }
   }

   public static void method4740(Actor var0, int[] var1, int var2, boolean var3, byte var4) {
      try {
         boolean var5;
         int var6;
         if (var0.field4057 != null) {
            var5 = true;

            for(var6 = 0; var6 < var0.field4057.length; ++var6) {
               if (var1[var6] != var0.field4057[var6]) {
                  var5 = false;
                  break;
               }
            }

            Animator var10 = var0.activeAnimator;
            if (var5 && var10.method2775((byte)-38)) {
               Animation var7 = var0.activeAnimator.method2776(1190945096);
               int var8 = var7.field6668;
               if (1 == var8) {
                  var10.method2791(var2, (byte)81);
               }

               if (var8 == 2) {
                  var10.method2798(1476401100);
               }
            }
         }

         var5 = true;

         for(var6 = 0; var6 < var1.length; ++var6) {
            if (var1[var6] != -1) {
               var5 = false;
            }

            if (var0.field4057 == null || -1 == var0.field4057[var6] || class936.field10313.method2256(var1[var6], (byte)-62).field6662 >= class936.field10313.method2256(var0.field4057[var6], (byte)-47).field6662) {
               var0.field4057 = var1;
               var0.activeAnimator.method2784(var2, -1445580533);
               if (var3) {
                  var0.field4089 = var0.field4084;
               }
            }
         }

         if (var5) {
            var0.field4057 = var1;
            var0.activeAnimator.method2784(var2, -1445580533);
            if (var3) {
               var0.field4089 = var0.field4084;
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "rv.ke(" + ')');
      }
   }
}
