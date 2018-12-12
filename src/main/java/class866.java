public class class866 {
   class531 field9760;
   int field9761;
   boolean field9762 = false;
   int field9763;
   class531 field9764;
   int field9765;
   static int field9766;
   static boolean[] field9767;

   final boolean method5838(class769 var1, Animation var2, int var3, int var4, int[] var5, byte var6) {
      try {
         if (!this.field9762) {
            if (var3 >= var5.length) {
               return false;
            } else {
               this.field9761 = var5[var3];
               this.field9760 = var1.method2253(this.field9761 >> 16, -2028006412);
               this.field9761 &= 65535;
               if (this.field9760 != null) {
                  if (var2.field6660 && var4 != -1 && var4 < var5.length) {
                     this.field9763 = var5[var4];
                     this.field9764 = var1.method2253(this.field9763 >> 16, -1623469578);
                     this.field9763 &= 65535;
                  }

                  if (var2.field6669) {
                     this.field9765 |= 512;
                  }

                  if (this.field9760.method2308(this.field9761, (byte)-4)) {
                     this.field9765 |= 128;
                  }

                  if (this.field9760.method2310(this.field9761, -460356399)) {
                     this.field9765 |= 256;
                  }

                  if (this.field9760.method2309(this.field9761, (byte)-54)) {
                     this.field9765 |= 1024;
                  }

                  if (this.field9764 != null) {
                     if (this.field9764.method2308(this.field9763, (byte)9)) {
                        this.field9765 |= 128;
                     }

                     if (this.field9764.method2310(this.field9763, -460356399)) {
                        this.field9765 |= 256;
                     }

                     if (this.field9764.method2309(this.field9763, (byte)7)) {
                        this.field9765 |= 1024;
                     }
                  }

                  this.field9765 |= 32;
                  this.field9762 = true;
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return true;
         }
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "sf.a(" + ')');
      }
   }

   final void method5839(int var1) {
      try {
         this.field9762 = false;
         this.field9765 = 0;
         this.field9764 = null;
         this.field9760 = null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "sf.f(" + ')');
      }
   }

   static final void method5840(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[--var2.field3158];
         if (class960.method2212(var4, var2, -1912889290) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field968 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "sf.ku(" + ')');
      }
   }

   static final String method5841(int var0, int var1) {
      try {
         String var2 = Integer.toString(var0);

         for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + class822.field9050 + var2.substring(var3);
         }

         if (var2.length() > 9) {
            return " " + class56.method1545(65408, -2039864554) + var2.substring(0, var2.length() - 8) + class814.field4791.method2927(class321.field1066, -875414210) + " (" + var2 + ")" + class822.field9053;
         } else {
            return var2.length() > 6 ? " " + class56.method1545(16777215, -1284566910) + var2.substring(0, var2.length() - 4) + class814.field4787.method2927(class321.field1066, -875414210) + " (" + var2 + ")" + class822.field9053 : " " + class56.method1545(16776960, -1902529284) + var2 + class822.field9053;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sf.kn(" + ')');
      }
   }

   static final void method5842(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class718 var3 = class333.field139.method5091(var2, -1551283008);
         var0.field3161[++var0.field3156 - 1] = var3.field3500;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "sf.amw(" + ')');
      }
   }
}
