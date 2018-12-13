public class class974 extends class304 {
   int field2981;
   String field2982;
   static class48[] field2983;

   public void method2383(int var1) {
      try {
         if (class730.field2852 != -1) {
            class917.method6450(class730.field2852, this.field2982, this.field2981, 2017220990);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xx.f(" + ')');
      }
   }

   class974(InputStream var1) {
      super(var1);
      this.field2982 = var1.method6379(919568963);
      this.field2981 = var1.method6374();
   }

   public static final void method1783(int var0) {
      try {
         for(int var1 = 0; var1 < 5; ++var1) {
            class730.field2665[var1] = false;
         }

         class730.field2749 = -1;
         class730.field2750 = -1;
         class665.field9598 = 0;
         class617.field8843 = 0;
         class563.field1083 = 4;
         class516.field4332 = -1;
         class495.field8099 = -1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "xx.hg(" + ')');
      }
   }

   static void method1784(class848 var0, int var1) {
      try {
         int var2 = class622.field9006;
         int var3 = class281.field10643;
         int var4 = class809.field4595;
         int var5 = class873.field9785 - 3;
         byte var6 = 20;
         if (class948.field3290 == null || class909.field10396 == null) {
            class948.field3290 = (class727)class785.field3827.method1857(class730.field2681, class721.field3636, true, true, -2063324548);
            class909.field10396 = class785.field3827.method1853(class730.field2681, class721.field3636, -203887938);
            if (class948.field3290 != null && class909.field10396 != null) {
               class979.method1835(2025307040);
               int var16 = var2 + var4 / 2;
               if (var4 + var16 > class759.field4331) {
                  var16 = class759.field4331 - var4;
               }

               if (var16 < 0) {
                  var16 = 0;
               }

               class184.method3242(var16, class281.field10643, (byte)34);
               return;
            }
         }

         class727 var7;
         if (class948.field3290 != null && class909.field10396 != null) {
            var7 = class948.field3290;
         } else {
            var7 = class501.field3182;
         }

         class230 var8 = class600.method5467(-2117423030);
         class888.method5530(var0, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var6, var7, var8, class814.field4781.method2927(class321.field1066, -875414210), 1493499179);
         int var9 = 255 - class602.field8651 - class602.field8665;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = class912.field10424.method5524((byte)-89);
         int var11 = class912.field10424.method5513((byte)17);
         int var12;
         MenuItem var13;
         int var14;
         class497 var17;
         if (!class602.field8638) {
            var12 = 0;

            for(var13 = (MenuItem)class602.field8647.method901(1766612795); var13 != null; var13 = (MenuItem)class602.field8647.method906(49146)) {
               var14 = 1 + var8.field8230 + var6 + var3 + (class602.field8673 - 1 - var12) * class602.field8634;
               if (var10 > class622.field9006 && var10 < class809.field4595 + class622.field9006 && var11 > var14 - var8.field8230 - 1 && var11 < var14 + var8.field8225 && var13.field1704) {
                  var0.method4984(class622.field9006, var14 - var8.field8230, class809.field4595, class602.field8634, var9 << 24 | class166.field6895, 1);
               }

               ++var12;
            }
         } else {
            var12 = 0;

            for(var17 = (class497)class602.field8649.method2706(324606134); var17 != null; var17 = (class497)class602.field8649.method2707(2083970273)) {
               var14 = var12 * class602.field8634 + var8.field8230 + var6 + var3 + 1;
               if (var10 > class622.field9006 && var10 < class809.field4595 + class622.field9006 && var11 > var14 - var8.field8230 - 1 && var11 < var14 + var8.field8225 && (var17.field8120 > 1 || ((MenuItem)var17.field8121.field4317.field208).field1704)) {
                  var0.method4984(class622.field9006, var14 - var8.field8230, class809.field4595, class602.field8634, var9 << 24 | class166.field6895, 1);
               }

               ++var12;
            }

            if (class602.field8639 != null) {
               class888.method5530(var0, class514.field4319, class936.field10310, class965.field2535, class382.field1411, var6, var7, var8, class602.field8639.field8122, -1919103988);
               var12 = 0;

               for(var13 = (MenuItem)class602.field8639.field8121.method2706(473884533); var13 != null; var13 = (MenuItem)class602.field8639.field8121.method2707(1876214432)) {
                  var14 = 1 + class936.field10310 + var6 + var8.field8230 + class602.field8634 * var12;
                  if (var10 > class514.field4319 && var10 < class514.field4319 + class965.field2535 && var11 > var14 - var8.field8230 - 1 && var11 < var14 + var8.field8225 && var13.field1704) {
                     var0.method4984(class514.field4319, var14 - var8.field8230, class965.field2535, class602.field8634, var9 << 24 | class166.field6895, 1);
                  }

                  ++var12;
               }

               class341.method259(var0, class514.field4319, class936.field10310, class965.field2535, class382.field1411, var6, 2145329590);
            }
         }

         class341.method259(var0, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var6, 2136796856);
         if (!class602.field8638) {
            var12 = 0;

            for(var13 = (MenuItem)class602.field8647.method901(1766612795); var13 != null; var13 = (MenuItem)class602.field8647.method906(49146)) {
               var14 = var8.field8230 + var6 + var3 + 1 + (class602.field8673 - 1 - var12) * class602.field8634;
               class848.method5066(var10, var11, var2, var3, var4, var5, var14, var13, var7, var8, class958.field3480 | -16777216, class350.field1644 | -16777216, 549127677);
               ++var12;
            }
         } else {
            var12 = 0;

            for(var17 = (class497)class602.field8649.method2706(-476899641); var17 != null; var17 = (class497)class602.field8649.method2707(81519453)) {
               var14 = class602.field8634 * var12 + 1 + var6 + class281.field10643 + var8.field8230;
               if (var17.field8120 == 1) {
                  class848.method5066(var10, var11, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var14, (MenuItem)var17.field8121.field4317.field208, var7, var8, class958.field3480 | -16777216, class350.field1644 | -16777216, 579895839);
               } else {
                  class621.method5260(var10, var11, class622.field9006, class281.field10643, class809.field4595, class873.field9785, var14, var17, var7, var8, class958.field3480 | -16777216, class350.field1644 | -16777216, (byte)-36);
               }

               ++var12;
            }

            if (class602.field8639 != null) {
               var12 = 0;

               for(var13 = (MenuItem)class602.field8639.field8121.method2706(45096692); var13 != null; var13 = (MenuItem)class602.field8639.field8121.method2707(1092020370)) {
                  var14 = var12 * class602.field8634 + 1 + var8.field8230 + class936.field10310 + var6;
                  class848.method5066(var10, var11, class514.field4319, class936.field10310, class965.field2535, class382.field1411, var14, var13, var7, var8, class958.field3480 | -16777216, class350.field1644 | -16777216, -316918375);
                  ++var12;
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "xx.bd(" + ')');
      }
   }

   static final void method1785(class744 var0, byte var1) {
      try {
         Widget.method845(var0.field3170, var0, -1596344570);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xx.aph(" + ')');
      }
   }
}
