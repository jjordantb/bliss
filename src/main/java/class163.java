public class class163 extends class568 {
   static class1 field6616 = new class1(10);
   static class6 field6617 = new class6(32);
   static int field6618;
   int[] field6619 = new int[]{-1};
   int[] field6620 = new int[1];
   static int field6621;

   final class879 method3553(class848 var1, int var2, class765 var3, int var4, boolean var5, class365 var6, byte var7) {
      try {
         class879 var8 = null;
         int var9 = var2;
         class507 var10 = null;
         if (-1 != var4) {
            var10 = class283.field10614.method3736(var4, (byte)89);
         }

         int[] var11 = this.field6619;
         if (var10 != null && var10.field3990 != null) {
            var11 = new int[var10.field3990.length];

            for(int var12 = 0; var12 < var10.field3990.length; ++var12) {
               int var13 = var10.field3990[var12];
               if (var13 >= 0 && var13 < this.field6619.length) {
                  var11[var12] = this.field6619[var13];
               } else {
                  var11[var12] = -1;
               }
            }
         }

         if (var3 != null) {
            var9 = var2 | var3.method2785(-1790708337);
         }

         long var14 = this.method3554(var11, var4, var6 != null ? var6.field2443 : null, var5, 551500137);
         if (field6616 != null) {
            var8 = (class879)field6616.method2974(var14);
         }

         if (var8 == null || var1.method4836(var8.method5948(), var9) != 0) {
            if (var8 != null) {
               var9 = var1.method4817(var9, var8.method5948());
            }

            int var16 = var9;
            boolean var17 = false;

            for(int var18 = 0; var18 < var11.length; ++var18) {
               if (var11[var18] != -1 && !class85.field1121.method1566(var11[var18]).method2680(var5, (class241)null, (byte)-79)) {
                  var17 = true;
               }
            }

            if (var17) {
               return null;
            }

            class25[] var28 = new class25[var11.length];

            int var19;
            for(var19 = 0; var19 < var11.length; ++var19) {
               if (var11[var19] == -1) {
                  if (var7 != 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  var28[var19] = class85.field1121.method1566(var11[var19]).method2674(var5, (class241)null, -1732273011);
               }
            }

            int var20;
            int var21;
            if (var10 != null && var10.field3968 != null) {
               for(var19 = 0; var19 < var10.field3968.length; ++var19) {
                  if (var10.field3968[var19] != null) {
                     if (var28[var19] == null) {
                        if (var7 != 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var20 = var10.field3968[var19][0];
                        var21 = var10.field3968[var19][1];
                        int var22 = var10.field3968[var19][2];
                        int var23 = var10.field3968[var19][3];
                        int var24 = var10.field3968[var19][4];
                        int var25 = var10.field3968[var19][5];
                        if (var23 != 0 || var24 != 0 || var25 != 0) {
                           var28[var19].method3457(var23, var24, var25);
                        }

                        if (var20 != 0 || var21 != 0 || var22 != 0) {
                           var28[var19].method3456(var20, var21, var22);
                        }
                     }
                  }
               }
            }

            class25 var29 = new class25(var28, var28.length);
            if (var6 != null) {
               var16 = var9 | 16384;
            }

            var8 = var1.method4861(var29, var16, field6618 * 1310831989, 66, 850);
            if (var6 != null) {
               for(var20 = 0; var20 < 10; ++var20) {
                  for(var21 = 0; var21 < class365.field2440[var20].length; ++var21) {
                     if (var6.field2443[var20] < class629.field9737[var20][var21].length) {
                        var8.method5984(class365.field2440[var20][var21], class629.field9737[var20][var21][var6.field2443[var20]]);
                     }
                  }
               }
            }

            if (field6616 != null) {
               var8.method5947(var9);
               field6616.method2984(var8, var14);
            }
         }

         if (var3 == null) {
            return var8;
         } else {
            class879 var27 = var8.method6017((byte)1, var9, true);
            var3.method2795(var27, 0, -1119502581);
            return var27;
         }
      } catch (RuntimeException var26) {
         throw class158.method3445(var26, "aam.n(" + ')');
      }
   }

   long method3554(int[] var1, int var2, int[] var3, boolean var4, int var5) {
      try {
         long[] var6 = class907.field10382;
         long var7 = -1L;
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var2 >> 8)) & 255L)];
         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var2) & 255L)];

         int var9;
         for(var9 = 0; var9 < var1.length; ++var9) {
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 24)) & 255L)];
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 16)) & 255L)];
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var1[var9] >> 8)) & 255L)];
            var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var1[var9]) & 255L)];
         }

         if (var3 != null) {
            for(var9 = 0; var9 < 5; ++var9) {
               var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)var3[var9]) & 255L)];
            }
         }

         var7 = var7 >>> 8 ^ var6[(int)((var7 ^ (long)(var4 ? 1 : 0)) & 255L)];
         return var7;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aam.q(" + ')');
      }
   }

   static void method3555(class907 var0, int var1) {
      try {
         for(int var2 = 0; var2 < 1017276543 * class104.field170; ++var2) {
            int var3 = var0.method6382(1723054621);
            int var4 = var0.method6374();
            if (var4 == 65535) {
               var4 = -1;
            }

            if (class277.field10606[var3] != null) {
               class277.field10606[var3].field3472 = var4 * 2083476291;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aam.p(" + ')');
      }
   }
}
