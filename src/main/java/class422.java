public class class422 {
   class180 field9600;
   class180 field9601;
   class1 field9602 = new class1(64);
   static class48 field9603;
   public static class733 field9604;

   public class354 method5716(int var1, int var2) {
      try {
         class1 var3 = this.field9602;
         class354 var4;
         synchronized(this.field9602) {
            var4 = (class354)this.field9602.method2974((long)var1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class180 var5 = this.field9600;
            byte[] var10;
            synchronized(this.field9600) {
               var10 = this.field9600.method3285(class981.field3236.field3271, var1, (byte)-128);
            }

            var4 = new class354();
            var4.field2131 = this;
            if (var10 != null) {
               var4.method1446(new InputStream(var10), 1546025245);
            }

            class1 var11 = this.field9602;
            synchronized(this.field9602) {
               this.field9602.method2984(var4, (long)var1);
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "fv.a(" + ')');
      }
   }

   public void method5717(byte var1) {
      try {
         class1 var2 = this.field9602;
         synchronized(this.field9602) {
            this.field9602.method2977();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fv.f(" + ')');
      }
   }

   public void method5718(int var1) {
      try {
         class1 var2 = this.field9602;
         synchronized(this.field9602) {
            this.field9602.method2979();
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fv.p(" + ')');
      }
   }

   public void method5719(int var1, int var2) {
      try {
         class1 var3 = this.field9602;
         synchronized(this.field9602) {
            this.field9602.method2976(var1, -1045157545);
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fv.b(" + ')');
      }
   }

   public class422(class469 var1, class423 var2, class180 var3, class180 var4) {
      this.field9600 = var3;
      this.field9601 = var4;
      this.field9600.method3286(class981.field3236.field3271, -2109974583);
   }

   static final void method5720(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class969.method1694(var3, var4, var0, (short)14954);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fv.fz(" + ')');
      }
   }

   static final void method5721(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = var0.field3169.field9713;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fv.xc(" + ')');
      }
   }

   static final void method5722(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9114.method2273(var2, 1352882135);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fv.aog(" + ')');
      }
   }

   static final void method5723(class744 var0, int var1) {
      try {
         Npc var2 = (Npc)var0.field3159;
         NpcDefinition var3 = var2.field1637;
         if (var3.field9924 != null) {
            var3 = var3.method6110(class827.field9037, 1999627505);
         }

         var0.field3161[++var0.field3156 - 1] = var3 != null ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fv.apl(" + ')');
      }
   }

   public static void method5724(byte var0) {
      try {
         if (class730.field2817) {
            class564 var1 = class554.method427(class543.field3820, class730.field2818, -156511736);
            if (var1 != null && var1.field845 != null) {
               class202 var2 = new class202();
               var2.field7578 = var1;
               var2.field7583 = var1.field845;
               class408.method5470(var2, (byte)77);
            }

            class730.field2919 = -1;
            class730.field2888 = -1;
            class730.field2817 = false;
            if (var1 != null) {
               class814.method2932(var1, -1858273017);
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fv.kb(" + ')');
      }
   }

   static final void method5725(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[var0.field3156 + 1];
         if (class923.local.field3388 != null) {
            class923.local.field3388.method1639(var2, var3, class85.field1121, (byte)-1);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "fv.cv(" + ')');
      }
   }
}
