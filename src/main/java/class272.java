public class class272 extends class298 {
   class705[][] field10522 = new class705[16][128];
   int field10523 = 256;
   int field10524 = 256;
   class137 field10525;
   static int field10526 = 4;
   int[] field10527 = new int[16];
   int[] field10528 = new int[16];
   int[] field10529 = new int[16];
   int[] field10530 = new int[16];
   class46 field10531 = new class46(this);
   int[] field10532 = new int[16];
   boolean field10533;
   int[] field10534 = new int[16];
   int[] field10535 = new int[16];
   static int field10536 = 1;
   static int field10537 = 2;
   class539 field10538;
   int field10539 = 1000000;
   int[] field10540 = new int[16];
   int[] field10541 = new int[16];
   int[] field10542 = new int[16];
   int[] field10543 = new int[16];
   int[] field10544 = new int[16];
   int field10545;
   class705[][] field10546 = new class705[16][128];
   class231 field10547 = new class231();
   int[] field10548 = new int[16];
   int field10549;
   int[] field10550 = new int[16];
   long field10551;
   long field10552;
   boolean field10553;
   int[] field10554 = new int[16];
   int field10555;
   int[] field10556 = new int[16];

   void method6558(int var1, int var2) {
      try {
         if (var1 < 0) {
            for(var1 = 0; var1 < 16; ++var1) {
               this.method6558(var1, -1250334263);
            }
         } else {
            this.field10527[var1] = 12800;
            this.field10528[var1] = 8192;
            this.field10529[var1] = 16383;
            this.field10548[var1] = 8192;
            this.field10534[var1] = 0;
            this.field10535[var1] = 8192;
            this.method6580(var1, 537893417);
            this.method6581(var1, (byte)0);
            this.field10540[var1] = 0;
            this.field10550[var1] = 32767;
            this.field10541[var1] = 256;
            this.field10542[var1] = 0;
            this.method6583(var1, 8192, 2043925478);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.by(" + ')');
      }
   }

   synchronized void method6559(class137 var1, boolean var2, boolean var3, int var4) {
      try {
         this.method6567(var3, -310606613);
         this.field10547.method4671(var1.field1137);
         this.field10533 = var2;
         this.field10551 = 0L;
         int var5 = this.field10547.method4673();

         for(int var6 = 0; var6 < var5; ++var6) {
            this.field10547.method4674(var6);
            this.field10547.method4676(var6);
            this.field10547.method4683(var6);
         }

         this.field10549 = this.field10547.method4681();
         this.field10545 = this.field10547.field8282[this.field10549];
         this.field10552 = this.field10547.method4680(this.field10545);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aib.af(" + ')');
      }
   }

   int method6560(byte var1) {
      try {
         return this.field10523;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aib.at(" + ')');
      }
   }

   synchronized void method6561(int var1, int var2, int var3) {
      try {
         if (var1 < 0) {
            for(int var4 = 0; var4 < 16; ++var4) {
               this.field10556[var4] = var2;
            }
         } else {
            this.field10556[var1] = var2;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.ai(" + ')');
      }
   }

   synchronized boolean method6562(class137 var1, class180 var2, class111 var3, int var4, int var5) {
      try {
         var1.method957();
         boolean var6 = true;
         int[] var7 = null;
         if (var4 > 0) {
            var7 = new int[]{var4};
         }

         for(class706 var8 = (class706)var1.field1138.method2335(-1972132134); var8 != null; var8 = (class706)var1.field1138.method2336((byte)-88)) {
            int var9 = (int)var8.field641;
            class683 var10 = (class683)this.field10538.method2331((long)var9);
            if (var10 == null) {
               var10 = class417.method5686(var2, var9, -1675121341);
               if (var10 == null) {
                  var6 = false;
                  continue;
               }

               this.field10538.method2337(var10, (long)var9);
            }

            if (!var10.method4330(var3, var8.field3275, var7, 2068929620)) {
               var6 = false;
            }
         }

         if (var6) {
            var1.method959();
         }

         return var6;
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "aib.al(" + ')');
      }
   }

   synchronized void method6563(int var1) {
      try {
         for(class683 var2 = (class683)this.field10538.method2335(-2020964435); var2 != null; var2 = (class683)this.field10538.method2336((byte)-107)) {
            var2.method4331((byte)1);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aib.az(" + ')');
      }
   }

   synchronized void method6564(byte var1) {
      try {
         for(class683 var2 = (class683)this.field10538.method2335(-1054359069); var2 != null; var2 = (class683)this.field10538.method2336((byte)-24)) {
            var2.method545(-1460969981);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aib.as(" + ')');
      }
   }

   synchronized void method6565(class137 var1, boolean var2, byte var3) {
      try {
         this.method6559(var1, var2, true, 752002788);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.ap(" + ')');
      }
   }

   synchronized void method6566(byte var1) {
      try {
         this.method6567(true, -310606613);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aib.ab(" + ')');
      }
   }

   synchronized void method6567(boolean var1, int var2) {
      try {
         this.field10547.method4672();
         this.field10525 = null;
         this.method6579(var1, 1199726462);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.aj(" + ')');
      }
   }

   synchronized void method6568(int var1, int var2) {
      try {
         this.field10523 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.av(" + ')');
      }
   }

   public synchronized void method6569(int var1, int var2, int var3) {
      try {
         this.method6570(var1, var2, (byte)122);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.aq(" + ')');
      }
   }

   void method6570(int var1, int var2, byte var3) {
      try {
         this.field10530[var1] = var2;
         this.field10532[var1] = var2 & -128;
         this.method6571(var1, var2, (byte)21);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.ag(" + ')');
      }
   }

   void method6571(int var1, int var2, byte var3) {
      try {
         if (var2 != this.field10554[var1]) {
            this.field10554[var1] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               this.field10546[var1][var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.an(" + ')');
      }
   }

   void method6572(int var1, int var2, int var3, int var4) {
      try {
         this.method6574(var1, var2, 64, (byte)1);
         if ((this.field10540[var1] & 2) != 0) {
            for(class705 var5 = (class705)this.field10531.field5180.method1278(-138512601); var5 != null; var5 = (class705)this.field10531.field5180.method1280((byte)-23)) {
               if (var5.field3312 == var1 && var5.field3306 < 0) {
                  this.field10522[var1][var5.field3297] = null;
                  this.field10522[var1][var2] = var5;
                  int var6 = (var5.field3301 * var5.field3292 >> 12) + var5.field3300;
                  var5.field3300 += var2 - var5.field3297 << 8;
                  var5.field3301 = var6 - var5.field3300;
                  var5.field3292 = 4096;
                  var5.field3297 = var2;
                  return;
               }
            }
         }

         class683 var10 = (class683)this.field10538.method2331((long)this.field10554[var1]);
         if (var10 != null) {
            class656 var11 = var10.field7644[var2];
            if (var11 != null) {
               class705 var7 = new class705();
               var7.field3312 = var1;
               var7.field3307 = var10;
               var7.field3294 = var11;
               var7.field3304 = var10.field7648[var2];
               var7.field3293 = var10.field7643[var2];
               var7.field3297 = var2;
               var7.field3298 = 1024 + var10.field7645[var2] * var3 * var3 * var10.field7646 >> 11;
               var7.field3299 = var10.field7649[var2] & 255;
               var7.field3300 = (var2 << 8) - (var10.field7647[var2] & 32767);
               var7.field3303 = 0;
               var7.field3296 = 0;
               var7.field3305 = 0;
               var7.field3306 = -1;
               var7.field3302 = 0;
               if (this.field10542[var1] == 0) {
                  var7.field3310 = class436.method4208(var11, this.method6591(var7, (byte)-68), this.method6589(var7, 1560432059), this.method6584(var7, -1934295725));
               } else {
                  var7.field3310 = class436.method4208(var11, this.method6591(var7, (byte)-65), 0, this.method6584(var7, -1934295725));
                  this.method6573(var7, var10.field7647[var2] < 0, (byte)1);
               }

               if (var10.field7647[var2] < 0) {
                  var7.field3310.method4172(-1);
               }

               if (var7.field3293 >= 0) {
                  class705 var8 = this.field10546[var1][var7.field3293];
                  if (var8 != null && var8.field3306 < 0) {
                     this.field10522[var1][var8.field3297] = null;
                     var8.field3306 = 0;
                  }

                  this.field10546[var1][var7.field3293] = var7;
               }

               this.field10531.field5180.method1282(var7, 1099032834);
               this.field10522[var1][var2] = var7;
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aib.au(" + ')');
      }
   }

   void method6573(class705 var1, boolean var2, byte var3) {
      try {
         int var4 = var1.field3294.field9400.length;
         int var6;
         if (var2 && var1.field3294.field9404) {
            int var5 = var4 + var4 - var1.field3294.field9402;
            var6 = (int)((long)var5 * (long)this.field10542[var1.field3312] >> 6);
            var4 <<= 8;
            if (var6 >= var4) {
               var6 = var4 + var4 - 1 - var6;
               var1.field3310.method4207(true);
            }
         } else {
            var6 = (int)((long)var4 * (long)this.field10542[var1.field3312] >> 6);
         }

         var1.field3310.method4178(var6);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aib.ar(" + ')');
      }
   }

   void method6574(int var1, int var2, int var3, byte var4) {
      try {
         class705 var5 = this.field10522[var1][var2];
         if (var5 != null) {
            this.field10522[var1][var2] = null;
            if ((this.field10540[var1] & 2) != 0) {
               for(class705 var6 = (class705)this.field10531.field5180.method1281(1494711989); var6 != null; var6 = (class705)this.field10531.field5180.method1283((byte)-16)) {
                  if (var5.field3312 == var6.field3312 && var6.field3306 < 0 && var5 != var6) {
                     var5.field3306 = 0;
                     break;
                  }
               }
            } else {
               var5.field3306 = 0;
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aib.ac(" + ')');
      }
   }

   void method6575(int var1, int var2, byte var3) {
   }

   void method6576(int var1, int var2, int var3) {
      try {
         this.field10548[var1] = var2;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.bf(" + ')');
      }
   }

   void method6577(int var1, int var2) {
      try {
         for(class705 var3 = (class705)this.field10531.field5180.method1281(1687020518); var3 != null; var3 = (class705)this.field10531.field5180.method1283((byte)-28)) {
            if (var1 < 0 || var1 == var3.field3312) {
               if (var3.field3310 != null) {
                  var3.field3310.method4174(class752.field4179 / 100);
                  if (var3.field3310.method4184()) {
                     this.field10531.field5181.method3870(var3.field3310);
                  }

                  var3.method1940((byte)-31);
               }

               if (var3.field3306 < 0) {
                  this.field10522[var3.field3312][var3.field3297] = null;
               }

               var3.method545(-1460969981);
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.be(" + ')');
      }
   }

   void method6578(int var1, int var2) {
      try {
         for(class705 var3 = (class705)this.field10531.field5180.method1281(1987891181); var3 != null; var3 = (class705)this.field10531.field5180.method1283((byte)-41)) {
            if ((var1 < 0 || var3.field3312 == var1) && var3.field3306 < 0) {
               this.field10522[var3.field3312][var3.field3297] = null;
               var3.field3306 = 0;
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bm(" + ')');
      }
   }

   void method6579(boolean var1, int var2) {
      try {
         if (var1) {
            this.method6577(-1, -2134438754);
         } else {
            this.method6578(-1, -975680599);
         }

         this.method6558(-1, 1450402912);

         int var3;
         for(var3 = 0; var3 < 16; ++var3) {
            this.field10554[var3] = this.field10530[var3];
         }

         for(var3 = 0; var3 < 16; ++var3) {
            this.field10532[var3] = this.field10530[var3] & -128;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bc(" + ')');
      }
   }

   void method6580(int var1, int var2) {
      try {
         if ((this.field10540[var1] & 2) != 0) {
            for(class705 var3 = (class705)this.field10531.field5180.method1281(1928964592); var3 != null; var3 = (class705)this.field10531.field5180.method1283((byte)3)) {
               if (var3.field3312 == var1 && this.field10522[var1][var3.field3297] == null && var3.field3306 < 0) {
                  var3.field3306 = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bx(" + ')');
      }
   }

   void method6581(int var1, byte var2) {
      try {
         if ((this.field10540[var1] & 4) != 0) {
            for(class705 var3 = (class705)this.field10531.field5180.method1281(2033370125); var3 != null; var3 = (class705)this.field10531.field5180.method1283((byte)-105)) {
               if (var3.field3312 == var1) {
                  var3.field3313 = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bo(" + ')');
      }
   }

   synchronized void method6582(int var1, int var2) {
      try {
         this.field10524 = var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.ah(" + ')');
      }
   }

   void method6583(int var1, int var2, int var3) {
      try {
         this.field10543[var1] = var2;
         this.field10544[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aib.bl(" + ')');
      }
   }

   int method6584(class705 var1, int var2) {
      try {
         int var3 = this.field10528[var1.field3312];
         return var3 < 8192 ? 32 + var3 * var1.field3299 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field3299) + 32 >> 6);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bk(" + ')');
      }
   }

   synchronized class298 method6529() {
      try {
         return this.field10531;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "aib.f(" + ')');
      }
   }

   synchronized class298 method6530() {
      return null;
   }

   synchronized void method6533(int[] var1, int var2, int var3) {
      try {
         if (this.field10547.method4684()) {
            int var4 = this.field10547.field8273 * this.field10539 / class752.field4179;

            do {
               long var5 = this.field10551 + (long)var4 * (long)var3;
               if (this.field10552 - var5 >= 0L) {
                  this.field10551 = var5;
                  break;
               }

               int var7 = (int)(((long)var4 + (this.field10552 - this.field10551) - 1L) / (long)var4);
               this.field10551 += (long)var4 * (long)var7;
               this.field10531.method6533(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.method6585((byte)-114);
            } while(this.field10547.method4684());
         }

         this.field10531.method6533(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "aib.k(" + ')');
      }
   }

   public class272() {
      this.field10538 = new class539(128);
      this.method6561(-1, 256, -1253398615);
      this.method6579(true, 214293801);
   }

   void method6585(byte var1) {
      try {
         int var2 = this.field10549;
         int var3 = this.field10545;
         long var4 = this.field10552;
         if (this.field10525 != null && var3 == this.field10555) {
            this.method6559(this.field10525, this.field10533, this.field10553, -913403234);
            this.method6585((byte)-108);
         } else {
            while(true) {
               if (var3 != this.field10545) {
                  this.field10549 = var2;
                  this.field10545 = var3;
                  this.field10552 = var4;
                  if (this.field10525 != null && this.field10555 < var3) {
                     this.field10549 = -1;
                     this.field10545 = this.field10555;
                     this.field10552 = this.field10547.method4680(this.field10545);
                  }
                  break;
               }

               while(var3 == this.field10547.field8282[var2]) {
                  this.field10547.method4674(var2);
                  int var6 = this.field10547.method4677(var2);
                  if (1 == var6) {
                     this.field10547.method4675();
                     this.field10547.method4683(var2);
                     if (!this.field10547.method4682()) {
                        if (var1 >= 0) {
                           return;
                        }
                     } else {
                        if (this.field10525 != null) {
                           this.method6565(this.field10525, this.field10533, (byte)111);
                           this.method6585((byte)-64);
                           return;
                        }

                        if (!this.field10533 || var3 == 0) {
                           this.method6579(true, 1006206254);
                           this.field10547.method4672();
                           return;
                        }

                        this.field10547.method4685(var4);
                     }
                     break;
                  }

                  if ((var6 & 128) != 0) {
                     this.method6588(var6, 2134974919);
                  }

                  this.field10547.method4676(var2);
                  this.field10547.method4683(var2);
               }

               var2 = this.field10547.method4681();
               var3 = this.field10547.field8282[var2];
               var4 = this.field10547.method4680(var3);
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aib.bg(" + ')');
      }
   }

   synchronized void method6586(class137 var1, boolean var2, boolean var3, long var4) {
      try {
         this.method6559(var1, var2, var3, 33655883);
         this.method6594(var4 * (long)this.field10547.field8273);
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "aib.aw(" + ')');
      }
   }

   boolean method6587(class705 var1, int[] var2, int var3, int var4, int var5) {
      try {
         var1.field3311 = class752.field4179 / 100;
         if (var1.field3306 < 0 || var1.field3310 != null && !var1.field3310.method4183()) {
            int var6 = var1.field3292;
            if (var6 > 0) {
               var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field10535[var1.field3312]) + 0.5D);
               if (var6 < 0) {
                  var6 = 0;
               }

               var1.field3292 = var6;
            }

            var1.field3310.method4181(this.method6591(var1, (byte)-70));
            class154 var7 = var1.field3304;
            boolean var8 = false;
            ++var1.field3309;
            var1.field3295 += var7.field6506;
            double var9 = (double)((var1.field3297 - 60 << 8) + (var1.field3301 * var1.field3292 >> 12)) * 5.086263020833333E-6D;
            if (var7.field6501 > 0) {
               if (var7.field6499 > 0) {
                  var1.field3303 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field6499) + 0.5D);
               } else {
                  var1.field3303 += 128;
               }

               if (var1.field3303 * var7.field6501 >= 819200) {
                  var8 = true;
               }
            }

            if (var7.field6504 != null) {
               if (var7.field6502 > 0) {
                  var1.field3296 += (int)(128.0D * Math.pow(2.0D, var9 * (double)var7.field6502) + 0.5D);
               } else {
                  var1.field3296 += 128;
               }

               while(var1.field3305 < var7.field6504.length - 2 && var1.field3296 > (var7.field6504[var1.field3305 + 2] & 255) << 8) {
                  var1.field3305 += 2;
               }

               if (var1.field3305 == var7.field6504.length - 2 && var7.field6504[1 + var1.field3305] == 0) {
                  var8 = true;
               }
            }

            if (var1.field3306 >= 0 && var7.field6500 != null && (this.field10540[var1.field3312] & 1) == 0 && (var1.field3293 < 0 || var1 != this.field10546[var1.field3312][var1.field3293])) {
               if (var7.field6503 > 0) {
                  var1.field3306 += (int)(128.0D * Math.pow(2.0D, (double)var7.field6503 * var9) + 0.5D);
               } else {
                  var1.field3306 += 128;
               }

               while(var1.field3302 < var7.field6500.length - 2 && var1.field3306 > (var7.field6500[2 + var1.field3302] & 255) << 8) {
                  var1.field3302 += 2;
               }

               if (var1.field3302 == var7.field6500.length - 2) {
                  var8 = true;
               }
            }

            if (var8) {
               var1.field3310.method4174(var1.field3311);
               if (var2 != null) {
                  var1.field3310.method6533(var2, var3, var4);
               } else {
                  var1.field3310.method6534(var4);
               }

               if (var1.field3310.method4184()) {
                  this.field10531.field5181.method3870(var1.field3310);
               }

               var1.method1940((byte)-27);
               if (var1.field3306 >= 0) {
                  var1.method545(-1460969981);
                  if (var1.field3293 > 0 && this.field10546[var1.field3312][var1.field3293] == var1) {
                     this.field10546[var1.field3312][var1.field3293] = null;
                  }
               }

               return true;
            } else {
               var1.field3310.method4204(var1.field3311, this.method6589(var1, 847582824), this.method6584(var1, -1934295725));
               return false;
            }
         } else {
            var1.method1940((byte)20);
            var1.method545(-1460969981);
            if (var1.field3293 > 0 && this.field10546[var1.field3312][var1.field3293] == var1) {
               this.field10546[var1.field3312][var1.field3293] = null;
            }

            return true;
         }
      } catch (RuntimeException var11) {
         throw class158.method3445(var11, "aib.bp(" + ')');
      }
   }

   void method6588(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         int var4;
         int var5;
         int var6;
         if (128 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method6574(var4, var5, var6, (byte)-64);
         } else if (144 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var6 > 0) {
               this.method6572(var4, var5, var6, -1647062049);
            } else {
               this.method6574(var4, var5, 64, (byte)75);
            }
         } else if (160 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.method6590(var4, var5, var6, -2102837520);
         } else if (var3 == 176) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var5 == 0) {
               this.field10532[var4] = (this.field10532[var4] & -2080769) + (var6 << 14);
            }

            if (var5 == 32) {
               this.field10532[var4] = (this.field10532[var4] & -16257) + (var6 << 7);
            }

            if (1 == var5) {
               this.field10534[var4] = (var6 << 7) + (this.field10534[var4] & -16257);
            }

            if (var5 == 33) {
               this.field10534[var4] = (this.field10534[var4] & -128) + var6;
            }

            if (var5 == 5) {
               this.field10535[var4] = (this.field10535[var4] & -16257) + (var6 << 7);
            }

            if (var5 == 37) {
               this.field10535[var4] = var6 + (this.field10535[var4] & -128);
            }

            if (7 == var5) {
               this.field10527[var4] = (var6 << 7) + (this.field10527[var4] & -16257);
            }

            if (39 == var5) {
               this.field10527[var4] = (this.field10527[var4] & -128) + var6;
            }

            if (var5 == 10) {
               this.field10528[var4] = (var6 << 7) + (this.field10528[var4] & -16257);
            }

            if (var5 == 42) {
               this.field10528[var4] = (this.field10528[var4] & -128) + var6;
            }

            if (11 == var5) {
               this.field10529[var4] = (this.field10529[var4] & -16257) + (var6 << 7);
            }

            if (43 == var5) {
               this.field10529[var4] = (this.field10529[var4] & -128) + var6;
            }

            if (var5 == 64) {
               if (var6 >= 64) {
                  this.field10540[var4] |= 1;
               } else {
                  this.field10540[var4] &= -2;
               }
            }

            if (var5 == 65) {
               if (var6 >= 64) {
                  this.field10540[var4] |= 2;
               } else {
                  this.method6580(var4, 1763105998);
                  this.field10540[var4] &= -3;
               }
            }

            if (99 == var5) {
               this.field10550[var4] = (this.field10550[var4] & 127) + (var6 << 7);
            }

            if (var5 == 98) {
               this.field10550[var4] = var6 + (this.field10550[var4] & 16256);
            }

            if (101 == var5) {
               this.field10550[var4] = (var6 << 7) + 16384 + (this.field10550[var4] & 127);
            }

            if (var5 == 100) {
               this.field10550[var4] = 16384 + (this.field10550[var4] & 16256) + var6;
            }

            if (var5 == 120) {
               this.method6577(var4, -2093466123);
            }

            if (121 == var5) {
               this.method6558(var4, 1442077178);
            }

            if (123 == var5) {
               this.method6578(var4, -975680599);
            }

            int var7;
            if (6 == var5) {
               var7 = this.field10550[var4];
               if (16384 == var7) {
                  this.field10541[var4] = (this.field10541[var4] & -16257) + (var6 << 7);
               }
            }

            if (38 == var5) {
               var7 = this.field10550[var4];
               if (var7 == 16384) {
                  this.field10541[var4] = (this.field10541[var4] & -128) + var6;
               }
            }

            if (var5 == 16) {
               this.field10542[var4] = (this.field10542[var4] & -16257) + (var6 << 7);
            }

            if (var5 == 48) {
               this.field10542[var4] = (this.field10542[var4] & -128) + var6;
            }

            if (var5 == 81) {
               if (var6 >= 64) {
                  this.field10540[var4] |= 4;
               } else {
                  this.method6581(var4, (byte)0);
                  this.field10540[var4] &= -5;
               }
            }

            if (17 == var5) {
               this.method6583(var4, (this.field10543[var4] & -16257) + (var6 << 7), 2145961561);
            }

            if (49 == var5) {
               this.method6583(var4, var6 + (this.field10543[var4] & -128), 1479954642);
            }
         } else if (192 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method6571(var4, this.field10532[var4] + var5, (byte)120);
         } else if (208 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.method6575(var4, var5, (byte)6);
         } else if (224 == var3) {
            var4 = var1 & 15;
            var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
            this.method6576(var4, var5, -724209394);
         } else {
            var3 = var1 & 255;
            if (255 == var3) {
               this.method6579(true, 1683987385);
            }
         }

      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "aib.bb(" + ')');
      }
   }

   int method6589(class705 var1, int var2) {
      try {
         if (this.field10556[var1.field3312] == 0) {
            return 0;
         } else {
            class154 var3 = var1.field3304;
            int var4 = this.field10529[var1.field3312] * this.field10527[var1.field3312] + 4096 >> 13;
            var4 = 16384 + var4 * var4 >> 15;
            var4 = 16384 + var1.field3298 * var4 >> 15;
            var4 = var4 * this.field10523 + 128 >> 8;
            var4 = this.field10524 * var4 >> 8;
            var4 = 128 + var4 * this.field10556[var1.field3312] >> 8;
            if (var3.field6501 > 0) {
               var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3303 * (double)var3.field6501) + 0.5D);
            }

            int var5;
            int var6;
            int var7;
            int var8;
            if (var3.field6504 != null) {
               var5 = var1.field3296;
               var6 = var3.field6504[1 + var1.field3305];
               if (var1.field3305 < var3.field6504.length - 2) {
                  var7 = (var3.field6504[var1.field3305] & 255) << 8;
                  var8 = (var3.field6504[var1.field3305 + 2] & 255) << 8;
                  var6 += (var5 - var7) * (var3.field6504[3 + var1.field3305] - var6) / (var8 - var7);
               }

               var4 = var4 * var6 + 32 >> 6;
            }

            if (var1.field3306 > 0 && var3.field6500 != null) {
               var5 = var1.field3306;
               var6 = var3.field6500[1 + var1.field3302];
               if (var1.field3302 < var3.field6500.length - 2) {
                  var7 = (var3.field6500[var1.field3302] & 255) << 8;
                  var8 = (var3.field6500[var1.field3302 + 2] & 255) << 8;
                  var6 += (var5 - var7) * (var3.field6500[3 + var1.field3302] - var6) / (var8 - var7);
               }

               var4 = 32 + var6 * var4 >> 6;
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aib.bw(" + ')');
      }
   }

   public class272(class272 var1) {
      this.field10538 = var1.field10538;
      this.method6561(-1, 256, 1130954485);
      this.method6579(true, 662178451);
   }

   void method6590(int var1, int var2, int var3, int var4) {
   }

   int method6591(class705 var1, byte var2) {
      try {
         int var3 = var1.field3300 + (var1.field3292 * var1.field3301 >> 12);
         var3 += (this.field10548[var1.field3312] - 8192) * this.field10541[var1.field3312] >> 12;
         class154 var4 = var1.field3304;
         int var5;
         if (var4.field6506 > 0 && (var4.field6505 > 0 || this.field10534[var1.field3312] > 0)) {
            var5 = var4.field6505 << 2;
            int var6 = var4.field6507 << 1;
            if (var1.field3309 < var6) {
               var5 = var5 * var1.field3309 / var6;
            }

            var5 += this.field10534[var1.field3312] >> 7;
            double var7 = Math.sin((double)(var1.field3295 & 511) * 0.01227184630308513D);
            var3 += (int)((double)var5 * var7);
         }

         var5 = (int)((double)(256 * var1.field3294.field9403) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)class752.field4179 + 0.5D);
         return var5 < 1 ? 1 : var5;
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aib.bu(" + ')');
      }
   }

   synchronized int method6528() {
      return 0;
   }

   synchronized boolean method6592(int var1) {
      try {
         return this.field10547.method4684();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aib.ay(" + ')');
      }
   }

   synchronized void method6534(int var1) {
      try {
         if (this.field10547.method4684()) {
            int var2 = this.field10547.field8273 * this.field10539 / class752.field4179;

            do {
               long var3 = this.field10551 + (long)var1 * (long)var2;
               if (this.field10552 - var3 >= 0L) {
                  this.field10551 = var3;
                  break;
               }

               int var5 = (int)(((long)var2 + (this.field10552 - this.field10551) - 1L) / (long)var2);
               this.field10551 += (long)var2 * (long)var5;
               this.field10531.method6534(var5);
               var1 -= var5;
               this.method6585((byte)-85);
            } while(this.field10547.method4684());
         }

         this.field10531.method6534(var1);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aib.d(" + ')');
      }
   }

   boolean method6593(class705 var1, byte var2) {
      try {
         if (var1.field3310 == null) {
            if (var1.field3306 >= 0) {
               var1.method545(-1460969981);
               if (var1.field3293 > 0 && var1 == this.field10546[var1.field3312][var1.field3293]) {
                  this.field10546[var1.field3312][var1.field3293] = null;
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "aib.bs(" + ')');
      }
   }

   void method6594(long var1) {
      try {
         while(this.field10552 <= var1) {
            int var3 = this.field10549;
            int var4 = this.field10545;

            long var5;
            for(var5 = this.field10552; var4 == this.field10545; var5 = this.field10547.method4680(var4)) {
               while(this.field10547.field8282[var3] == var4) {
                  this.field10547.method4674(var3);
                  int var7 = this.field10547.method4677(var3);
                  if (1 == var7) {
                     this.field10547.method4675();
                     this.field10547.method4683(var3);
                     if (this.field10547.method4682()) {
                        if (!this.field10533 || var4 == 0) {
                           this.method6579(true, 1442105861);
                           this.field10547.method4672();
                           return;
                        }

                        this.field10547.method4685(var5);
                     }
                     break;
                  }

                  if ((var7 & 128) != 0 && (var7 & 240) != 144) {
                     this.method6588(var7, 2124246731);
                  }

                  this.field10547.method4676(var3);
                  this.field10547.method4683(var3);
               }

               this.field10551 = var5;
               var3 = this.field10547.method4681();
               var4 = this.field10547.field8282[var3];
            }

            this.field10549 = var3;
            this.field10545 = var4;
            this.field10552 = var5;
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "aib.bq(" + ')');
      }
   }
}
