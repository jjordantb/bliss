public abstract class class576 implements class54 {
   int field66;
   class180 field67;
   class727 field68;
   class180 field69;
   class827 field70;
   long field71;
   public static class180 field72;

   public boolean method1537(int var1) {
      try {
         boolean var2 = true;
         if (!this.field67.method3280(this.field70.field9035, -457216440)) {
            var2 = false;
         }

         if (!this.field69.method3280(this.field70.field9035, -457216440)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fd.b(" + ')');
      }
   }

   abstract void method59(boolean var1, int var2, int var3, int var4);

   public void method1543(boolean var1, byte var2) {
      try {
         int var3 = this.field70.field9028.method1786(this.field70.field9032, class730.field2775, -2137791831) + this.field70.field9033;
         int var4 = this.field70.field9029.method3090(this.field70.field9036, class730.field2784, -1715218341) + this.field70.field9031;
         this.method60(var1, var3, var4, 589039750);
         this.method59(var1, var3, var4, -2096633602);
         String var5 = class302.field3768.method119((short)8868);
         if (class27.method3468((byte)1) - this.field71 > 10000L) {
            var5 = var5 + " (" + class302.field3768.method114(-1233866115).field7500 + ")";
         }

         this.field68.method1681(var5, this.field70.field9032 / 2 + var3, 4 + this.field70.field9036 / 2 + var4 + this.field70.field9034, this.field70.field9030, -1, -370673990);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "fd.f(" + ')');
      }
   }

   abstract void method60(boolean var1, int var2, int var3, int var4);

   class576(class180 var1, class180 var2, class827 var3) {
      this.field67 = var1;
      this.field69 = var2;
      this.field70 = var3;
   }

   public void method1538(int var1) {
      try {
         class230 var2 = class213.method3814(this.field69, this.field70.field9035, 1681337882);
         this.field68 = class593.field1623.method4936(var2, class922.method6236(this.field67, this.field70.field9035), true);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fd.a(" + ')');
      }
   }

   int method66(int var1) {
      try {
         int var2 = class302.field3768.method118(-15916663);
         int var3 = var2 * 100;
         if (this.field66 == var2 && var2 != 0) {
            int var4 = class302.field3768.method121((byte)7);
            if (var4 > var2) {
               long var5 = this.field71 - class302.field3768.method120(-2093041337);
               if (var5 > 0L) {
                  long var7 = var5 * 10000L / (long)var2 * (long)(var4 - var2);
                  long var9 = (class27.method3468((byte)1) - this.field71) * 10000L;
                  if (var9 < var7) {
                     var3 = (int)(100L * var9 * (long)(var4 - var2) / var7 + (long)(100 * var2));
                  } else {
                     var3 = 100 * var4;
                  }
               }
            }
         } else {
            this.field66 = var2;
            this.field71 = class27.method3468((byte)1);
         }

         return var3;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "fd.q(" + ')');
      }
   }

   static final void method67(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         if (5 == var0.field869) {
            class912.method6480(var0, var1, var2, (short)-9019);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fd.gi(" + ')');
      }
   }

   static final void method68(class744 var0, int var1) {
      try {
         var0.field3161[++var0.field3156 - 1] = class615.field8903.field9139.method2805(1673845033) == 1 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fd.ajr(" + ')');
      }
   }

   static final void method69(class744 var0, byte var1) {
      try {
         var0.field3156 -= 3;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         int var4 = var0.field3161[var0.field3156 + 2];
         class740.method1920(2, var2 << 16 | var3, var4, "", -474820428);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "fd.ali(" + ')');
      }
   }

   static final void method70(class744 var0, short var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         var0.field3157[++var0.field3158 - 1] = class848.field8597.method3399(var2, 1350033014).field7619;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "fd.acc(" + ')');
      }
   }

   static final void method71(class564 var0, int var1, int var2, int var3, class744 var4, int var5) {
      try {
         if (var0.field910 == null) {
            if (var2 == 0) {
               return;
            }

            var0.field910 = new byte[11];
            var0.field947 = new byte[11];
            var0.field1001 = new int[11];
         }

         var0.field910[var1] = (byte)var2;
         if (var2 != 0) {
            var0.field945 = true;
         } else {
            var0.field945 = false;

            for(int var6 = 0; var6 < var0.field910.length; ++var6) {
               if (var0.field910[var6] != 0) {
                  var0.field945 = true;
                  break;
               }
            }
         }

         var0.field947[var1] = (byte)var3;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "fd.kd(" + ')');
      }
   }
}
