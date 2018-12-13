public class class399 {
   String field6559 = "";
   public static int field6560 = -1;
   public static int field6561 = 0;
   public static int field6562 = 1;
   static int field6563 = 16777215;
   static int field6564 = 70;
   public int field6565 = 0;
   public int field6566 = 16777215;
   public int field6567 = 70;
   int field6568 = -1;
   class591 field6569;
   int field6570 = -1;
   int field6571 = -1;
   public int field6572 = 0;
   int field6573 = -1;
   public int field6574 = -1;
   public int field6575 = 0;
   public int field6576 = -1;
   public int field6577 = -1;
   static int field6578;

   void method3519(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method3520(var1, var3, 33985);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.a(" + ')');
      }
   }

   void method3520(InputStream var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field6577 = var1.method6423(1235052657);
         } else if (var2 == 2) {
            this.field6566 = var1.method6390((byte)-22);
         } else if (var2 == 3) {
            this.field6568 = var1.method6423(1235052657);
         } else if (var2 == 4) {
            this.field6570 = var1.method6423(1235052657);
         } else if (var2 == 5) {
            this.field6573 = var1.method6423(1235052657);
         } else if (var2 == 6) {
            this.field6571 = var1.method6423(1235052657);
         } else if (var2 == 7) {
            this.field6572 = var1.method6367(1738296677);
         } else if (8 == var2) {
            this.field6559 = var1.method6413(681479919);
         } else if (9 == var2) {
            this.field6567 = var1.method6374();
         } else if (10 == var2) {
            this.field6565 = var1.method6367(1586825663);
         } else if (var2 == 11) {
            this.field6574 = 0;
         } else if (12 == var2) {
            this.field6576 = var1.method6371();
         } else if (var2 == 13) {
            this.field6575 = var1.method6367(1775587264);
         } else if (14 == var2) {
            this.field6574 = var1.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oy.f(" + ')');
      }
   }

   public String method3521(int var1, int var2) {
      try {
         String var3 = this.field6559;

         while(true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
               if (var2 != -794452403) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            }

            var3 = var3.substring(0, var4) + class665.method5715(var1, false, (byte)8) + var3.substring(2 + var4);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oy.b(" + ')');
      }
   }

   public class48 method3522(class848 var1, short var2) {
      try {
         if (this.field6568 < 0) {
            return null;
         } else {
            class48 var3 = (class48)this.field6569.field1575.method2974((long)this.field6568);
            if (var3 == null) {
               this.method3525(var1, 370410201);
               var3 = (class48)this.field6569.field1575.method2974((long)this.field6568);
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.p(" + ')');
      }
   }

   public class48 method3523(class848 var1, byte var2) {
      try {
         if (this.field6570 < 0) {
            return null;
         } else {
            class48 var3 = (class48)this.field6569.field1575.method2974((long)this.field6570);
            if (var3 == null) {
               this.method3525(var1, 445358153);
               var3 = (class48)this.field6569.field1575.method2974((long)this.field6570);
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.k(" + ')');
      }
   }

   public class48 method3524(class848 var1, byte var2) {
      try {
         if (this.field6571 < 0) {
            return null;
         } else {
            class48 var3 = (class48)this.field6569.field1575.method2974((long)this.field6571);
            if (var3 == null) {
               this.method3525(var1, -388591321);
               var3 = (class48)this.field6569.field1575.method2974((long)this.field6571);
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.d(" + ')');
      }
   }

   void method3525(class848 var1, int var2) {
      try {
         class180 var3 = this.field6569.field1574;
         class922 var4;
         if (this.field6568 >= 0 && this.field6569.field1575.method2974((long)this.field6568) == null && var3.method3280(this.field6568, -457216440)) {
            var4 = class922.method6234(var3, this.field6568);
            this.field6569.field1575.method2984(var1.method4982(var4, true), (long)this.field6568);
         }

         if (this.field6573 >= 0 && this.field6569.field1575.method2974((long)this.field6573) == null && var3.method3280(this.field6573, -457216440)) {
            var4 = class922.method6234(var3, this.field6573);
            this.field6569.field1575.method2984(var1.method4982(var4, true), (long)this.field6573);
         }

         if (this.field6570 >= 0 && this.field6569.field1575.method2974((long)this.field6570) == null && var3.method3280(this.field6570, -457216440)) {
            var4 = class922.method6234(var3, this.field6570);
            this.field6569.field1575.method2984(var1.method4982(var4, true), (long)this.field6570);
         }

         if (this.field6571 >= 0 && this.field6569.field1575.method2974((long)this.field6571) == null && var3.method3280(this.field6571, -457216440)) {
            var4 = class922.method6234(var3, this.field6571);
            this.field6569.field1575.method2984(var1.method4982(var4, true), (long)this.field6571);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "oy.u(" + ')');
      }
   }

   public class48 method3526(class848 var1, int var2) {
      try {
         if (this.field6573 < 0) {
            return null;
         } else {
            class48 var3 = (class48)this.field6569.field1575.method2974((long)this.field6573);
            if (var3 == null) {
               this.method3525(var1, -843145755);
               var3 = (class48)this.field6569.field1575.method2974((long)this.field6573);
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.i(" + ')');
      }
   }

   static final void method3527(class744 var0, short var1) {
      try {
         var0.field3156 -= 3;
         class22.method3439(var0.field3161[var0.field3156], var0.field3161[var0.field3156 + 1], var0.field3161[2 + var0.field3156], -507940004);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oy.tg(" + ')');
      }
   }

   static void method3528(class744 var0, int var1) {
      try {
         var0.field3157[++var0.field3158 - 1] = class735.field3009.method4224(var0.field3161[var0.field3156 - 2], 245040087).field8999[var0.field3161[var0.field3156 - 1]];
         var0.field3156 -= 2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oy.h(" + ')');
      }
   }

   static boolean method3529(int var0, int var1) {
      try {
         return var0 == 1 || var0 == 15 || var0 == 17 || var0 == 16 || 9 == var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "oy.fa(" + ')');
      }
   }

   public static void method3530(String var0, boolean var1, int var2, String var3, int var4) {
      try {
         class379.method964(var0, var1, var2, -1, var3, true, (short)-16913);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "oy.nt(" + ')');
      }
   }

   static final void method3531(class744 var0, int var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         if (var2 == 0) {
            var0.field3161[++var0.field3156 - 1] = 0;
         } else if (var3 == 0) {
            var0.field3161[++var0.field3156 - 1] = Integer.MAX_VALUE;
         } else {
            var0.field3161[++var0.field3156 - 1] = (int)Math.pow((double)var2, 1.0D / (double)var3);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "oy.zs(" + ')');
      }
   }

   static void method3532(Widget var0, class23 var1, int var2, int var3, int var4, int var5, int var6, String var7, class727 var8, class230 var9, int var10, int var11) {
      try {
         int var12;
         if (2 == class563.field1083) {
            var12 = (int)class730.field2931 & 16383;
         } else {
            var12 = class730.field2782 + (int)class730.field2931 & 16383;
         }

         int var13 = Math.max(var0.field881 / 2, var0.field887 / 2) + 10;
         int var14 = var4 * var4 + var5 * var5;
         if (var14 <= var13 * var13) {
            int var15 = class703.field3413[var12];
            int var16 = class703.field3404[var12];
            if (class563.field1083 != 2) {
               var15 = 256 * var15 / (class730.field2730 + 256);
               var16 = 256 * var16 / (256 + class730.field2730);
            }

            int var17 = var16 * var4 + var15 * var5 >> 14;
            int var18 = var16 * var5 - var15 * var4 >> 14;
            int var19 = var9.method4600(var7, 100, (class653[])null, 1430172726);
            int var20 = var9.method4601(var7, 100, 0, (class653[])null, -1739368935);
            var17 -= var19 / 2;
            if (var17 >= -var0.field881 && var17 <= var0.field881 && var18 >= -var0.field887 && var18 <= var0.field887) {
               var8.method1663(var7, var0.field881 / 2 + var17 + var2, var0.field887 / 2 + var3 - var18 - var6 - var20, var19, 50, var10, 0, 1, 0, 0, (class48[])null, (int[])null, var1, var2, var3, -45995166);
            }
         }

      } catch (RuntimeException var21) {
         throw class158.method3445(var21, "oy.h(" + ')');
      }
   }
}
