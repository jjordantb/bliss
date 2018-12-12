public class class5 {
   class32 field4932;
   float field4933;
   float field4934;
   float field4935;
   int field4936;
   int field4937;
   int field4938;
   class621 field4939;
   float field4940;
   float field4941;
   float field4942;
   class544 field4943;
   public static class730 field4944;
   static class922 field4945;

   public class5(InputStream var1, class418 var2) {
      this.method2951(var1, var2, (short)9475);
   }

   void method2949(class5 var1, byte var2) {
      try {
         this.field4936 = var1.field4936;
         this.field4933 = var1.field4933;
         this.field4934 = var1.field4934;
         this.field4940 = var1.field4940;
         this.field4932.method3298(var1.field4932);
         this.field4937 = var1.field4937;
         this.field4938 = var1.field4938;
         this.field4939 = var1.field4939;
         this.field4942 = var1.field4942;
         this.field4941 = var1.field4941;
         this.field4935 = var1.field4935;
         this.field4943 = var1.field4943;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pz.f(" + ')');
      }
   }

   void method2950(class848 var1, class5 var2, class5 var3, float var4, int var5) {
      try {
         this.field4936 = class507.method2511(var2.field4936, var3.field4936, var4 * 255.0F, -394247366);
         this.field4934 = var4 * (var3.field4934 - var2.field4934) + var2.field4934;
         this.field4940 = (var3.field4940 - var2.field4940) * var4 + var2.field4940;
         this.field4933 = var4 * (var3.field4933 - var2.field4933) + var2.field4933;
         this.field4935 = (var3.field4935 - var2.field4935) * var4 + var2.field4935;
         this.field4942 = var2.field4942 + var4 * (var3.field4942 - var2.field4942);
         this.field4941 = var2.field4941 + var4 * (var3.field4941 - var2.field4941);
         this.field4937 = class507.method2511(var2.field4937, var3.field4937, var4 * 255.0F, 561967704);
         this.field4938 = (int)((float)var2.field4938 + var4 * (float)(var3.field4938 - var2.field4938));
         if (var2.field4939 != var3.field4939) {
            this.field4939 = var1.method5049(var2.field4939, var3.field4939, var4, this.field4939);
         }

         if (var3.field4943 != var2.field4943) {
            if (var2.field4943 == null) {
               this.field4943 = var3.field4943;
               if (this.field4943 != null) {
                  this.field4943.method2353((int)(var4 * 255.0F), 0, -909735354);
               }
            } else {
               this.field4943 = var2.field4943;
               if (this.field4943 != null) {
                  this.field4943.method2353((int)(var4 * 255.0F), 255, 398258366);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "pz.b(" + ')');
      }
   }

   public void method2951(InputStream var1, class418 var2, short var3) {
      try {
         int var4 = var1.method6371();
         if (class615.field8903.field9126.method6339(-1934130167) == 1 && class593.field1623.method4876() > 0) {
            if ((var4 & 1) != 0) {
               this.field4936 = var1.method6420((byte)33);
            } else {
               this.field4936 = class418.field9573;
            }

            if ((var4 & 2) != 0) {
               this.field4933 = (float)var1.method6374() / 256.0F;
            } else {
               this.field4933 = 1.1523438F;
            }

            if ((var4 & 4) != 0) {
               this.field4934 = (float)var1.method6374() / 256.0F;
            } else {
               this.field4934 = 0.69921875F;
            }

            if ((var4 & 8) != 0) {
               this.field4940 = (float)var1.method6374() / 256.0F;
            } else {
               this.field4940 = 1.2F;
            }
         } else {
            if ((var4 & 1) != 0) {
               var1.method6420((byte)50);
            }

            if ((var4 & 2) != 0) {
               var1.method6374();
            }

            if ((var4 & 4) != 0) {
               var1.method6374();
            }

            if ((var4 & 8) != 0) {
               var1.method6374();
            }

            this.field4936 = class418.field9573;
            this.field4940 = 1.2F;
            this.field4934 = 0.69921875F;
            this.field4933 = 1.1523438F;
         }

         if ((var4 & 16) != 0) {
            this.field4932 = class32.method3289((float)var1.method6367(2126608204), (float)var1.method6367(1708860776), (float)var1.method6367(1771057202));
         } else {
            this.field4932 = class32.method3289(-50.0F, -60.0F, -50.0F);
         }

         if ((var4 & 32) != 0) {
            this.field4937 = var1.method6420((byte)9);
         } else {
            this.field4937 = class418.field9554;
         }

         if ((var4 & 64) != 0) {
            this.field4938 = var1.method6374();
         } else {
            this.field4938 = 0;
         }

         if ((var4 & 128) != 0) {
            int var5 = var1.method6374();
            int var6 = var1.method6374();
            int var7 = var1.method6374();
            int var8 = var1.method6374();
            int var9 = var1.method6374();
            int var10 = var1.method6374();
            this.field4939 = var2.method5678(var5, var6, var7, var8, var9, var10, 257018874);
         } else {
            this.field4939 = class842.field9213;
         }

      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "pz.p(" + ')');
      }
   }

   public void method2952(InputStream var1, int var2) {
      try {
         this.field4942 = (float)(var1.method6371() * 8) / 255.0F;
         this.field4941 = (float)(var1.method6371() * 8) / 255.0F;
         this.field4935 = (float)(var1.method6371() * 8) / 255.0F;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pz.i(" + ')');
      }
   }

   public class5() {
      this.method2956((byte)115);
   }

   boolean method2953(class5 var1, int var2) {
      try {
         return var1.field4936 == this.field4936 && this.field4933 == var1.field4933 && var1.field4934 == this.field4934 && var1.field4940 == this.field4940 && var1.field4941 == this.field4941 && this.field4942 == var1.field4942 && var1.field4935 == this.field4935 && this.field4937 == var1.field4937 && var1.field4938 == this.field4938 && var1.field4939 == this.field4939 && var1.field4943 == this.field4943;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pz.d(" + ')');
      }
   }

   public int method2954(int var1) {
      try {
         return this.field4937;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.u(" + ')');
      }
   }

   public class544 method2955(byte var1) {
      try {
         return this.field4943;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.x(" + ')');
      }
   }

   void method2956(byte var1) {
      try {
         this.field4936 = class418.field9573;
         this.field4932 = class32.method3289(-50.0F, -60.0F, -50.0F);
         this.field4933 = 1.1523438F;
         this.field4934 = 0.69921875F;
         this.field4940 = 1.2F;
         this.field4937 = class418.field9554;
         this.field4938 = 0;
         this.field4939 = class842.field9213;
         this.field4942 = 1.0F;
         this.field4941 = 0.25F;
         this.field4935 = 1.0F;
         this.field4943 = class474.field8270;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.a(" + ')');
      }
   }

   public void method2957(InputStream var1, class418 var2, byte var3) {
      try {
         int var4 = var1.method6374();
         int var5 = var1.method6367(2107553233);
         int var6 = var1.method6367(1662518170);
         int var7 = var1.method6367(2045049677);
         int var8 = var1.method6374();
         class78.field1501 = var8;
         this.field4943 = var2.method5677(var4, var5, var6, var7, (short)-3311);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "pz.k(" + ')');
      }
   }

   static final void method2958(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class730.field2941;
         if (class730.field2941 != -1) {
            class730.field2941 = -6;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.abk(" + ')');
      }
   }

   public static void method2959(int var0) {
      try {
         if (class470.field8223 != null) {
            try {
               class470.field8223.quit();
            } catch (Throwable var2) {
               ;
            }

            class470.field8223 = null;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.d(" + ')');
      }
   }

   static final void method2960(class744 var0, int var1) {
      try {
         --var0.field3158;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pz.aj(" + ')');
      }
   }

   public static class471 method2961(byte var0) {
      try {
         class601.field9201 = 0;
         return class397.method3479(-1079868050);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pz.i(" + ')');
      }
   }
}
