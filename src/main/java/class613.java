import java.util.Random;

public class class613 {
   class180 field8890;
   class310[] field8891;
   static int field8892 = 0;
   int field8893;
   static long field8894;

   public class419[] method5202(int var1, int var2) {
      try {
         if (var1 >= 0 && var1 < this.field8891.length) {
            class310 var3 = this.field8891[var1];
            if (var3.field530 && var3.field531.length > 1) {
               int var4 = this.field8893 == -1 ? 0 : 1;
               Random var5 = new Random();
               class419[] var6 = new class419[var3.field531.length];
               System.arraycopy(var3.field531, 0, var6, 0, var6.length);

               for(int var7 = var4; var7 < var6.length; ++var7) {
                  int var8 = class977.method1813(var5, var6.length - var4, (byte)-54) + var4;
                  class419 var9 = var3.field531[var7];
                  var6[var7] = var6[var8];
                  var6[var8] = var9;
               }

               return var6;
            } else {
               return var3.field531;
            }
         } else {
            return this.method5205(0, 0, 1721668121).field531;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "vo.b(" + ')');
      }
   }

   public class466 method5203(int var1, byte var2) {
      try {
         byte[] var3 = this.field8890.method3285(var1, 0, (byte)-111);
         class466 var4 = new class466();
         var4.method4006(new InputStream(var3), -391228687);
         return var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vo.f(" + ')');
      }
   }

   public class613(class469 var1, class423 var2, class180 var3) {
      this.field8890 = var3;
      InputStream var4 = new InputStream(this.field8890.method3285(0, 0, (byte)-99));
      int var5 = var4.field10375 != null && var4.field10375.length >= 1 ? var4.method6371() : -1;
      if (var5 < 4) {
         this.field8891 = new class310[0];
         this.field8893 = -1;
      } else {
         int var6 = var4.method6371();
         class7[] var7 = class310.method456(521246259);
         boolean var8 = true;
         int var9;
         int var10;
         if (var6 != var7.length) {
            var8 = false;
         } else {
            for(var9 = 0; var9 < var7.length; ++var9) {
               var10 = var4.method6371();
               if (var10 != var7[var9].field4917) {
                  var8 = false;
                  break;
               }
            }
         }

         if (var8) {
            var9 = var4.method6371();
            var10 = var4.method6371();
            int var11;
            int var12;
            if (var5 > 2) {
               this.field8893 = var4.method6367(1770899550);
               var11 = var4.method6390((byte)-39);
               var12 = var4.method6374();
            } else {
               this.field8893 = -1;
               var11 = 0;
               var12 = 0;
            }

            this.field8891 = new class310[1 + var10];

            int var13;
            for(var13 = 0; var13 < var9; ++var13) {
               int var14 = var4.method6371();
               boolean var15 = var4.method6371() == 1;
               int var16 = var4.method6374();
               class419[] var17;
               int var18;
               int var19;
               int var20;
               int var21;
               if (this.field8893 != -1) {
                  var17 = new class419[1 + var16];
                  var17[0] = new class419(this.field8893, var11, var12);

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.method6374();
                     var20 = var4.method6390((byte)-59);
                     var21 = var4.method6374();
                     var17[var18 + 1] = new class419(var19, var20, var21);
                  }
               } else {
                  var17 = new class419[var16];

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.method6374();
                     var20 = var4.method6390((byte)-83);
                     var21 = var4.method6374();
                     var17[var18] = new class419(var19, var20, var21);
                  }

                  this.field8891[var14] = new class310(var15, var17);
               }

               this.field8891[var14] = new class310(var15, var17);
            }

            for(var13 = 0; var13 < var10 + 1; ++var13) {
               if (this.field8891[var13] == null) {
                  this.field8891[var13] = this.method5205(var11, var12, 1315448185);
               }
            }
         } else {
            this.field8891 = new class310[0];
            this.field8893 = -1;
         }
      }

   }

   public boolean method5204(byte var1) {
      try {
         return -1 != this.field8893;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "vo.p(" + ')');
      }
   }

   class310 method5205(int var1, int var2, int var3) {
      try {
         if (-1 == this.field8893) {
            return new class310(false, new class419[0]);
         } else {
            class419 var4 = new class419(this.field8893, var1, var2);
            return new class310(false, new class419[]{var4});
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vo.a(" + ')');
      }
   }

   static final void method5206(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class490.method4432(var3, var4, var0, 1968177988);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "vo.lz(" + ')');
      }
   }
}
