public class class181 extends class347 {
   int field5320 = 0;
   static int field5321 = 1;
   static int field5322 = 2;
   static int field5323 = 3;
   int field5324 = -468497986;
   int field5325 = 136960000;
   static int field5326 = 0;
   int[] field5327;
   int[] field5328;

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field5324 = var2.method6371() * 382646931;
            break;
         case 1:
            this.field5325 = var2.method6374() * 1354827067;
            break;
         case 2:
            this.field5320 = var2.method6371() * 438974141;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "aio.r(" + ')');
      }
   }

   void method3310(int var1) {
      try {
         int var2 = 0;
         this.field5327 = new int[1 + -2096663653 * this.field5324];
         this.field5328 = new int[-2096663653 * this.field5324 + 1];
         int var3 = 4096 / (-2096663653 * this.field5324);
         int var4 = this.field5325 * -1111258125 * var3 >> 12;

         for(int var5 = 0; var5 < -2096663653 * this.field5324; ++var5) {
            this.field5328[var5] = var2;
            this.field5327[var5] = var4 + var2;
            var2 += var3;
         }

         this.field5328[this.field5324 * -2096663653] = 4096;
         this.field5327[this.field5324 * -2096663653] = this.field5327[0] + 4096;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "aio.ac(" + ')');
      }
   }

   void method205(int var1) {
      try {
         this.method3310(-1688804109);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "aio.x(" + ')');
      }
   }

   int[] method3311(int var1) {
      int[] var2 = this.field270.method3546(var1, 1475074444);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];
         int var5;
         if (this.field5320 * -882183019 != 0) {
            for(int var4 = 0; var4 < -1474554145 * class322.field831; ++var4) {
               var5 = 0;
               short var6 = 0;
               int var7 = class322.field838[var4];
               switch(-882183019 * this.field5320) {
               case 1:
                  var5 = var7;
                  break;
               case 2:
                  var5 = (var7 - (4096 - var3) >> 1) + 2048;
                  break;
               case 3:
                  var5 = (var7 - var3 >> 1) + 2048;
               }

               for(int var8 = 0; var8 < -2096663653 * this.field5324; ++var8) {
                  if (var5 >= this.field5328[var8] && var5 < this.field5328[1 + var8]) {
                     if (var5 < this.field5327[var8]) {
                        var6 = 4096;
                     }
                     break;
                  }
               }

               var2[var4] = var6;
            }
         } else {
            short var9 = 0;

            for(var5 = 0; var5 < this.field5324 * -2096663653; ++var5) {
               if (var3 >= this.field5328[var5] && var3 < this.field5328[1 + var5]) {
                  if (var3 < this.field5327[var5]) {
                     var9 = 4096;
                  }
                  break;
               }
            }

            class901.method6354(var2, 0, class322.field831 * -1474554145, var9);
         }
      }

      return var2;
   }

   void method3312() {
      this.method3310(-1688804109);
   }

   public class181() {
      super(0, true);
   }

   int[] method3313(int var1) {
      int[] var2 = this.field270.method3546(var1, 2036108673);
      if (this.field270.field6612) {
         int var3 = class322.field836[var1];
         int var5;
         if (this.field5320 * -882183019 != 0) {
            for(int var4 = 0; var4 < -1474554145 * class322.field831; ++var4) {
               var5 = 0;
               short var6 = 0;
               int var7 = class322.field838[var4];
               switch(-882183019 * this.field5320) {
               case 1:
                  var5 = var7;
                  break;
               case 2:
                  var5 = (var7 - (4096 - var3) >> 1) + 2048;
                  break;
               case 3:
                  var5 = (var7 - var3 >> 1) + 2048;
               }

               for(int var8 = 0; var8 < -2096663653 * this.field5324; ++var8) {
                  if (var5 >= this.field5328[var8] && var5 < this.field5328[1 + var8]) {
                     if (var5 < this.field5327[var8]) {
                        var6 = 4096;
                     }
                     break;
                  }
               }

               var2[var4] = var6;
            }
         } else {
            short var9 = 0;

            for(var5 = 0; var5 < this.field5324 * -2096663653; ++var5) {
               if (var3 >= this.field5328[var5] && var3 < this.field5328[1 + var5]) {
                  if (var3 < this.field5327[var5]) {
                     var9 = 4096;
                  }
                  break;
               }
            }

            class901.method6354(var2, 0, class322.field831 * -1474554145, var9);
         }
      }

      return var2;
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1878219643);
         if (this.field270.field6612) {
            int var4 = class322.field836[var1];
            int var6;
            if (this.field5320 * -882183019 != 0) {
               for(int var5 = 0; var5 < -1474554145 * class322.field831; ++var5) {
                  var6 = 0;
                  short var7 = 0;
                  int var8 = class322.field838[var5];
                  switch(-882183019 * this.field5320) {
                  case 1:
                     var6 = var8;
                     break;
                  case 2:
                     var6 = (var8 - (4096 - var4) >> 1) + 2048;
                     break;
                  case 3:
                     var6 = (var8 - var4 >> 1) + 2048;
                  }

                  for(int var9 = 0; var9 < -2096663653 * this.field5324; ++var9) {
                     if (var6 >= this.field5328[var9] && var6 < this.field5328[1 + var9]) {
                        if (var6 < this.field5327[var9]) {
                           var7 = 4096;
                        }
                        break;
                     }
                  }

                  var3[var5] = var7;
               }
            } else {
               short var11 = 0;

               for(var6 = 0; var6 < this.field5324 * -2096663653; ++var6) {
                  if (var4 >= this.field5328[var6] && var4 < this.field5328[1 + var6]) {
                     if (var4 < this.field5327[var6]) {
                        var11 = 4096;
                     }
                     break;
                  }
               }

               class901.method6354(var3, 0, class322.field831 * -1474554145, var11);
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "aio.i(" + ')');
      }
   }

   void method3314() {
      this.method3310(-1688804109);
   }

   void method3315() {
      this.method3310(-1688804109);
   }

   void method3316(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field5324 = var2.method6371() * 382646931;
         break;
      case 1:
         this.field5325 = var2.method6374() * 1354827067;
         break;
      case 2:
         this.field5320 = var2.method6371() * 438974141;
      }

   }

   void method3317(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field5324 = var2.method6371() * 382646931;
         break;
      case 1:
         this.field5325 = var2.method6374() * 1354827067;
         break;
      case 2:
         this.field5320 = var2.method6371() * 438974141;
      }

   }
}
