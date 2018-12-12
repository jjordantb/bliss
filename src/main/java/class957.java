import java.io.IOException;

public class class957 extends class353 {
   int field3586;
   static int field3587 = 10;
   class180 field3588;
   byte[][] field3589 = new byte[10][];
   int[] field3590;
   int field3591;
   class907 field3592 = new class907((byte[])null);
   class907 field3593 = new class907((byte[])null);

   int method1374(byte[] var1, int var2) throws IOException {
      try {
         int var4;
         int var5;
         if (this.field3590 == null) {
            if (!this.field3588.method3260(this.field3586 * -247750727, 0, -925167069)) {
               return 0;
            }

            byte[] var3 = this.field3588.method3285(-247750727 * this.field3586, 0, (byte)-2);
            if (var3 == null) {
               throw new IllegalStateException("");
            }

            this.field3593.field10375 = var3;
            this.field3593.field10376 = 0;
            var4 = var3.length >> 1;
            this.field3590 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3590[var5] = this.field3593.method6374();
            }
         }

         if (this.field3591 * 352672983 >= this.field3590.length) {
            return -1;
         } else {
            this.method2099((byte)81);
            this.field3593.field10375 = var1;
            this.field3593.field10376 = 0;

            do {
               if (this.field3593.field10376 * 385051775 >= this.field3593.field10375.length) {
                  this.field3593.field10375 = null;
                  return var1.length;
               }

               if (this.field3592.field10375 == null) {
                  if (this.field3589[0] == null) {
                     this.field3593.field10375 = null;
                     return this.field3593.field10376 * 385051775;
                  }

                  this.field3592.field10375 = this.field3589[0];
               }

               int var7 = this.field3593.field10375.length - 385051775 * this.field3593.field10376;
               var4 = this.field3592.field10375.length - 385051775 * this.field3592.field10376;
               if (var7 < var4) {
                  this.field3592.method6381(this.field3593.field10375, this.field3593.field10376 * 385051775, var7, -953523806);
                  this.field3593.field10375 = null;
                  return var1.length;
               }

               this.field3593.method6425(this.field3592.field10375, this.field3592.field10376 * 385051775, var4, (short)-26872);
               this.field3592.field10375 = null;
               this.field3592.field10376 = 0;
               this.field3591 += -592488729;

               for(var5 = 0; var5 < 9; ++var5) {
                  this.field3589[var5] = this.field3589[1 + var5];
               }

               this.field3589[9] = null;
            } while(this.field3591 * 352672983 < this.field3590.length);

            this.field3593.field10375 = null;
            return this.field3593.field10376 * 385051775;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "acm.a(" + ')');
      }
   }

   public void method2099(byte var1) {
      try {
         if (this.field3590 != null) {
            for(int var2 = 0; var2 < 10 && var2 + 352672983 * this.field3591 < this.field3590.length; ++var2) {
               if (this.field3589[var2] == null && this.field3588.method3260(this.field3590[var2 + 352672983 * this.field3591], 0, -951445461)) {
                  this.field3589[var2] = this.field3588.method3285(this.field3590[352672983 * this.field3591 + var2], 0, (byte)-31);
               }
            }
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "acm.as(" + ')');
      }
   }

   int method1376(byte[] var1) throws IOException {
      int var3;
      int var4;
      if (this.field3590 == null) {
         if (!this.field3588.method3260(this.field3586 * -247750727, 0, -1752861403)) {
            return 0;
         }

         byte[] var2 = this.field3588.method3285(-247750727 * this.field3586, 0, (byte)9);
         if (var2 == null) {
            throw new IllegalStateException("");
         }

         this.field3593.field10375 = var2;
         this.field3593.field10376 = 0;
         var3 = var2.length >> 1;
         this.field3590 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3590[var4] = this.field3593.method6374();
         }
      }

      if (this.field3591 * 352672983 >= this.field3590.length) {
         return -1;
      } else {
         this.method2099((byte)97);
         this.field3593.field10375 = var1;
         this.field3593.field10376 = 0;

         do {
            if (this.field3593.field10376 * 385051775 >= this.field3593.field10375.length) {
               this.field3593.field10375 = null;
               return var1.length;
            }

            if (this.field3592.field10375 == null) {
               if (this.field3589[0] == null) {
                  this.field3593.field10375 = null;
                  return this.field3593.field10376 * 385051775;
               }

               this.field3592.field10375 = this.field3589[0];
            }

            int var5 = this.field3593.field10375.length - 385051775 * this.field3593.field10376;
            var3 = this.field3592.field10375.length - 385051775 * this.field3592.field10376;
            if (var5 < var3) {
               this.field3592.method6381(this.field3593.field10375, this.field3593.field10376 * 385051775, var5, -953523806);
               this.field3593.field10375 = null;
               return var1.length;
            }

            this.field3593.method6425(this.field3592.field10375, this.field3592.field10376 * 385051775, var3, (short)-14294);
            this.field3592.field10375 = null;
            this.field3592.field10376 = 0;
            this.field3591 += -592488729;

            for(var4 = 0; var4 < 9; ++var4) {
               this.field3589[var4] = this.field3589[1 + var4];
            }

            this.field3589[9] = null;
         } while(this.field3591 * 352672983 < this.field3590.length);

         this.field3593.field10375 = null;
         return this.field3593.field10376 * 385051775;
      }
   }

   int method1377(byte[] var1) throws IOException {
      int var3;
      int var4;
      if (this.field3590 == null) {
         if (!this.field3588.method3260(this.field3586 * -247750727, 0, -718226291)) {
            return 0;
         }

         byte[] var2 = this.field3588.method3285(-247750727 * this.field3586, 0, (byte)-126);
         if (var2 == null) {
            throw new IllegalStateException("");
         }

         this.field3593.field10375 = var2;
         this.field3593.field10376 = 0;
         var3 = var2.length >> 1;
         this.field3590 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3590[var4] = this.field3593.method6374();
         }
      }

      if (this.field3591 * 352672983 >= this.field3590.length) {
         return -1;
      } else {
         this.method2099((byte)11);
         this.field3593.field10375 = var1;
         this.field3593.field10376 = 0;

         do {
            if (this.field3593.field10376 * 385051775 >= this.field3593.field10375.length) {
               this.field3593.field10375 = null;
               return var1.length;
            }

            if (this.field3592.field10375 == null) {
               if (this.field3589[0] == null) {
                  this.field3593.field10375 = null;
                  return this.field3593.field10376 * 385051775;
               }

               this.field3592.field10375 = this.field3589[0];
            }

            int var5 = this.field3593.field10375.length - 385051775 * this.field3593.field10376;
            var3 = this.field3592.field10375.length - 385051775 * this.field3592.field10376;
            if (var5 < var3) {
               this.field3592.method6381(this.field3593.field10375, this.field3593.field10376 * 385051775, var5, -953523806);
               this.field3593.field10375 = null;
               return var1.length;
            }

            this.field3593.method6425(this.field3592.field10375, this.field3592.field10376 * 385051775, var3, (short)-19169);
            this.field3592.field10375 = null;
            this.field3592.field10376 = 0;
            this.field3591 += -592488729;

            for(var4 = 0; var4 < 9; ++var4) {
               this.field3589[var4] = this.field3589[1 + var4];
            }

            this.field3589[9] = null;
         } while(this.field3591 * 352672983 < this.field3590.length);

         this.field3593.field10375 = null;
         return this.field3593.field10376 * 385051775;
      }
   }

   int method1365(byte[] var1) throws IOException {
      int var3;
      int var4;
      if (this.field3590 == null) {
         if (!this.field3588.method3260(this.field3586 * -247750727, 0, -1469304085)) {
            return 0;
         }

         byte[] var2 = this.field3588.method3285(-247750727 * this.field3586, 0, (byte)-90);
         if (var2 == null) {
            throw new IllegalStateException("");
         }

         this.field3593.field10375 = var2;
         this.field3593.field10376 = 0;
         var3 = var2.length >> 1;
         this.field3590 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3590[var4] = this.field3593.method6374();
         }
      }

      if (this.field3591 * 352672983 >= this.field3590.length) {
         return -1;
      } else {
         this.method2099((byte)56);
         this.field3593.field10375 = var1;
         this.field3593.field10376 = 0;

         do {
            if (this.field3593.field10376 * 385051775 >= this.field3593.field10375.length) {
               this.field3593.field10375 = null;
               return var1.length;
            }

            if (this.field3592.field10375 == null) {
               if (this.field3589[0] == null) {
                  this.field3593.field10375 = null;
                  return this.field3593.field10376 * 385051775;
               }

               this.field3592.field10375 = this.field3589[0];
            }

            int var5 = this.field3593.field10375.length - 385051775 * this.field3593.field10376;
            var3 = this.field3592.field10375.length - 385051775 * this.field3592.field10376;
            if (var5 < var3) {
               this.field3592.method6381(this.field3593.field10375, this.field3593.field10376 * 385051775, var5, -953523806);
               this.field3593.field10375 = null;
               return var1.length;
            }

            this.field3593.method6425(this.field3592.field10375, this.field3592.field10376 * 385051775, var3, (short)-30519);
            this.field3592.field10375 = null;
            this.field3592.field10376 = 0;
            this.field3591 += -592488729;

            for(var4 = 0; var4 < 9; ++var4) {
               this.field3589[var4] = this.field3589[1 + var4];
            }

            this.field3589[9] = null;
         } while(this.field3591 * 352672983 < this.field3590.length);

         this.field3593.field10375 = null;
         return this.field3593.field10376 * 385051775;
      }
   }

   public class957(int var1, class180 var2, int var3) {
      super(var1);
      this.field3588 = var2;
      this.field3586 = -2133150071 * var3;
   }

   static final void method2100(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -301797495) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field875 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "acm.kh(" + ')');
      }
   }
}
