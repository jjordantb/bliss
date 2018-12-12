public class class758 {
   int field4333 = 0;
   public int field4334 = 328024129;
   public int field4335;
   public boolean field4336 = true;
   public int field4337 = -381610496;
   public int field4338;
   public boolean field4339 = true;
   public int field4340;
   public int field4341;

   void method2731(int var1, byte var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            var9 = var5;
         }

         if (var7 < var9) {
            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var9 != var11) {
            if (var17 < 0.5D) {
               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5D) {
               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var3 == var11) {
               var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
               var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var11 == var7) {
               var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
         }

         var13 /= 6.0D;
         this.field4335 = (int)(256.0D * var15) * 10667035;
         this.field4340 = (int)(var17 * 256.0D) * -656706385;
         if (this.field4335 * -620399085 < 0) {
            this.field4335 = 0;
         } else if (-620399085 * this.field4335 > 255) {
            this.field4335 = -1574873371;
         }

         if (656695887 * this.field4340 < 0) {
            this.field4340 = 0;
         } else if (this.field4340 * 656695887 > 255) {
            this.field4340 = 43596369;
         }

         if (var17 > 0.5D) {
            this.field4341 = 1823857443 * (int)(512.0D * var15 * (1.0D - var17));
         } else {
            this.field4341 = (int)(512.0D * var15 * var17) * 1823857443;
         }

         if (this.field4341 * -813159285 < 1) {
            this.field4341 = 1823857443;
         }

         this.field4338 = 599548295 * (int)((double)(this.field4341 * -813159285) * var13);
      } catch (RuntimeException var20) {
         throw class158.method3445(var20, "sh.b(" + ')');
      }
   }

   void method2732(class907 var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field4333 = var1.method6390((byte)-8) * -1369220863;
            this.method2731(2106435329 * this.field4333, (byte)-123);
         } else if (2 == var2) {
            this.field4334 = var1.method6374() * -328024129;
            if (65535 == this.field4334 * 2012295231) {
               this.field4334 = 328024129;
            }
         } else if (var2 == 3) {
            this.field4337 = (var1.method6374() << 2) * -562782069;
         } else if (4 == var2) {
            this.field4339 = false;
         } else if (5 == var2) {
            this.field4336 = false;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sh.f(" + ')');
      }
   }

   void method2733(class907 var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 != 7) {
                  ;
               }

               return;
            }

            this.method2732(var1, var3, 1088681663);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sh.a(" + ')');
      }
   }

   static void method2734(class564 var0, class23 var1, int var2, int var3, int var4, int var5, class48 var6, byte var7) {
      try {
         if (var6 != null) {
            int var8;
            if (-863531439 * class563.field1083 == 2) {
               var8 = (int)class730.field2931 & 16383;
            } else {
               var8 = (int)class730.field2931 + class730.field2782 * 1227356013 & 16383;
            }

            int var9 = Math.max(var0.field881 * -2093041337 / 2, 457937409 * var0.field887 / 2) + 10;
            int var10 = var5 * var5 + var4 * var4;
            if (var10 <= var9 * var9) {
               int var11 = class703.field3413[var8];
               int var12 = class703.field3404[var8];
               if (2 != class563.field1083 * -863531439) {
                  var11 = 256 * var11 / (256 + class730.field2730 * 356727603);
                  var12 = 256 * var12 / (356727603 * class730.field2730 + 256);
               }

               int var13 = var5 * var11 + var4 * var12 >> 14;
               int var14 = var12 * var5 - var4 * var11 >> 14;
               var6.method3137(var13 + var0.field881 * -2093041337 / 2 + var2 - var6.method5594() / 2, 457937409 * var0.field887 / 2 + var3 - var14 - var6.method3109() / 2, var1, var2, var3);
            }
         }

      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "sh.t(" + ')');
      }
   }

   static final void method2735(int var0, int var1) {
      try {
         if (class215.method3835(var0, (int[])null, -1926955800)) {
            class469.method4020(class382.field1410[var0].field1103, -1, (byte)1);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sh.lf(" + ')');
      }
   }

   static final void method2736(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class811.field4653 * -2009663223;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sh.ami(" + ')');
      }
   }

   static final void method2737(class744 var0, short var1) {
      try {
         String var2 = (String)var0.field3157[(var0.field3158 -= 969361751) * -203050393];
         class273.method6597(var2, 1988988347);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sh.vk(" + ')');
      }
   }

   static final void method2738(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= -1175642067;
         int var4 = var2.field3161[var2.field3156 * 681479919] - 1;
         int var5 = var2.field3161[681479919 * var2.field3156 + 1];
         int var6 = var2.field3161[2 + 681479919 * var2.field3156];
         if (var4 >= 0 && var4 <= 9) {
            class576.method71(var0, var4, var5, var6, var2, 890851226);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "sh.ke(" + ')');
      }
   }
}
