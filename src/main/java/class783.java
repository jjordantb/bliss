public abstract class class783 {
   public static class180 field3963;
   static class219 field3964;

   public abstract int method2481();

   abstract boolean method2482();

   abstract boolean method2484();

   public abstract void method2488();

   public abstract int method2493();

   static final void method2494(class744 var0, int var1) {
      try {
         var0.field3162 -= 2;
         if (var0.field3168[var0.field3162] > var0.field3168[var0.field3162 + 1]) {
            var0.field3176 += var0.field3174[var0.field3176];
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cb.bb(" + ')');
      }
   }

   static final void method2495(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         var0.field3157[++var0.field3158 - 1] = class794.method467(var2, 757970283);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cb.zc(" + ')');
      }
   }

   static class219 method2496(int var0, byte var1) {
      try {
         if (var0 == 0) {
            if (3.0D == (double)class491.field7808) {
               return class733.field2976;
            }

            if (4.0D == (double)class491.field7808) {
               return class213.field7198;
            }

            if (6.0D == (double)class491.field7808) {
               return field3964;
            }

            if ((double)class491.field7808 >= 8.0D) {
               return class538.field3763;
            }
         } else if (1 == var0) {
            if (3.0D == (double)class491.field7808) {
               return field3964;
            }

            if (4.0D == (double)class491.field7808) {
               return class538.field3763;
            }

            if ((double)class491.field7808 == 6.0D) {
               return class858.field8899;
            }

            if ((double)class491.field7808 >= 8.0D) {
               return class878.field9820;
            }
         } else if (2 == var0) {
            if (3.0D == (double)class491.field7808) {
               return class858.field8899;
            }

            if ((double)class491.field7808 == 4.0D) {
               return class878.field9820;
            }

            if (6.0D == (double)class491.field7808) {
               return class76.field1466;
            }

            if ((double)class491.field7808 >= 8.0D) {
               return class569.field26;
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "cb.bt(" + ')');
      }
   }

   public static String method2497(byte[] var0, int var1, int var2, int var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;

         for(int var6 = 0; var6 < var2; ++var6) {
            int var7 = var0[var6 + var1] & 255;
            if (var7 == 0) {
               if (var3 == 1825442367) {
                  throw new IllegalStateException();
               }
            } else {
               if (var7 >= 128 && var7 < 160) {
                  char var8 = class519.field4212[var7 - 128];
                  if (var8 == 0) {
                     var8 = '?';
                  }

                  var7 = var8;
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "cb.u(" + ')');
      }
   }
}
