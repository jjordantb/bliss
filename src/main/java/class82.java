import java.io.IOException;

public class class82 implements class311 {
   String field1106;
   class180 field1107;
   static String[] field1108;
   static int field1109;
   public static int field1110;
   static int field1111;

   public int method444(int var1) {
      try {
         return this.field1107.method3282(this.field1106, -2147290732) ? 100 : this.field1107.method3275(this.field1106, -1986969413);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jc.a(" + ')');
      }
   }

   public class972 method448(int var1) {
      try {
         return class972.field2962;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jc.f(" + ')');
      }
   }

   class82(class180 var1, String var2) {
      this.field1107 = var1;
      this.field1106 = var2;
   }

   static class346 method915(int var0, byte var1) {
      try {
         class346 var2 = (class346)class966.field2520.method3070((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class969.field2496.method3285(var0, 0, (byte)12);
            if (var3 != null && var3.length > 1) {
               try {
                  var2 = class78.method1125(var3, (byte)16);
               } catch (Exception var5) {
                  throw new RuntimeException(var5.getMessage() + " " + var0);
               }

               class966.field2520.method3072(var2, (long)var0);
               return var2;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "jc.f(" + ')');
      }
   }

   static final void method916(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, -500483592);
         String var4 = "";
         if (var3 != null && var3.field4124 != null) {
            var4 = var3.field4124;
         }

         var0.field3157[++var0.field3158 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "jc.acz(" + ')');
      }
   }

   public static int method917(CharSequence var0, short var1) {
      try {
         return class535.method2280(var0, 10, true, -1228221916);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jc.i(" + ')');
      }
   }

   static String method918(int[] var0, byte var1) {
      try {
         StringBuilder var2 = new StringBuilder();
         int var3 = class544.field3794;

         for(int var4 = 0; var4 < var0.length; ++var4) {
            class865 var5 = class735.field3009.method4224(var0[var4], 245040087);
            if (var5.field9005 == -1) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }
            } else {
               class48 var6 = (class48)class602.field8667.method2974((long)var5.field9005);
               if (var6 == null) {
                  class922 var7 = class922.method6242(class562.field827, var5.field9005, 0);
                  if (var7 != null) {
                     var6 = class593.field1623.method4982(var7, true);
                     class602.field8667.method2984(var6, (long)var5.field9005);
                  }
               }

               if (var6 != null) {
                  class602.field8668[var3] = var6;
                  var2.append(" <img=").append(var3).append(">");
                  ++var3;
               }
            }
         }

         return var2.toString();
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "jc.bc(" + ')');
      }
   }

   public static void method919(boolean var0, boolean var1, short var2) {
      try {
         if (var0) {
            --class543.field3818;
            if (class543.field3818 == 0) {
               class543.field3817 = null;
            }
         }

         if (var1) {
            --class543.field3816;
            if (class543.field3816 == 0) {
               class134.field1398 = null;
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "jc.f(" + ')');
      }
   }

   public static final void method920(boolean var0, byte var1) {
      try {
         class684[] var2 = class730.field2660;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            class684 var4 = var2[var3];

            try {
               var4.method4376(-1494345865);
            } catch (IOException var7) {
               ;
            }

            var4.method4374((byte)56);
         }

         class725.method1748(-20644488);
         class830.method5375(false, -1663847334);
         class730.field2697.method5288((byte)8);
         class730.field2697.method5308(-2101576654);
         class371.method867(false, 1336561252);
         class154.method3492(2, 207248326);
         class540.field3920 = -1;
         class540.field3921 = false;
         class228.method4589(-1865838561);
         class897.method5624(true, -2090545066);
         class526.method2231(-1182326447);
         class631.method5863(-1799886054);
         class364.method1612(-1759070114);
         if (var0) {
            class967.method1750(6, 628188692);
         } else {
            class967.method1750(19, -244529723);

            try {
               class872.method5894(class833.field9178, "loggedout", (short)24145);
            } catch (Throwable var6) {
               ;
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "jc.gi(" + ')');
      }
   }

   static void method921(int var0, int var1) {
      try {
         class163.field6618 = var0;
         class163.field6616.method2977();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jc.s(" + ')');
      }
   }

   static final void method922(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class923.local.field4048.method5553((byte)0) >> 3;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "jc.uc(" + ')');
      }
   }
}
