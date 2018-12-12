import java.util.Random;

public class class578 extends class347 {
   static int field79 = 3;
   static int field80 = 1;
   static int field81 = 2;
   static int field82 = 2048;
   short[] field83 = new short[512];
   static int field84 = 1;
   static int field85 = 2;
   byte[] field86 = new byte[512];
   static int field87 = 0;
   static int field88 = 5;
   static int field89 = 0;
   static int field90 = 2;
   static int field91 = 5;
   static int field92 = 4;
   static int field93 = 1;
   int field94 = 0;
   int field95 = -1678309376;
   int field96 = 1054806071;
   int field97 = 1710056533;
   int field98 = 1239043726;
   int field99 = -1784051459;
   static int field100 = 4;
   static int field101 = 3;

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 1076087457);
         if (this.field270.field6612) {
            int var4 = -1818338063 * this.field97 * class322.field836[var1] + 2048;
            int var5 = var4 >> 12;
            int var6 = 1 + var5;

            for(int var7 = 0; var7 < class322.field831 * -1474554145; ++var7) {
               class645.field10128 = 1648440697;
               class399.field6578 = -495419991;
               class469.field7329 = -586878723;
               class628.field9746 = -1158324685;
               int var8 = 883178403 * this.field96 * class322.field838[var7] + 2048;
               int var9 = var8 >> 12;
               int var10 = 1 + var9;

               for(int var11 = var5 - 1; var11 <= var6; ++var11) {
                  int var12 = this.field86[(var11 >= -1818338063 * this.field97 ? var11 - this.field97 * -1818338063 : var11) & 255] & 255;

                  for(int var13 = var9 - 1; var13 <= var10; ++var13) {
                     int var14 = (this.field86[(var13 >= this.field96 * 883178403 ? var13 - this.field96 * 883178403 : var13) + var12 & 255] & 255) * 2;
                     int var15 = var8 - (this.field83[var14++] + (var13 << 12));
                     int var16 = var4 - ((var11 << 12) + this.field83[var14]);
                     int var17;
                     switch(this.field99 * -1013656491) {
                     case 1:
                        var17 = var15 * var15 + var16 * var16 >> 12;
                        break;
                     case 2:
                        var17 = (var16 < 0 ? -var16 : var16) + (var15 < 0 ? -var15 : var15);
                        break;
                     case 3:
                        var15 = var15 < 0 ? -var15 : var15;
                        var16 = var16 < 0 ? -var16 : var16;
                        var17 = var15 > var16 ? var15 : var16;
                        break;
                     case 4:
                        var15 = (int)(Math.sqrt((double)((float)(var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                        var16 = (int)(Math.sqrt((double)((float)(var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                        var17 = var16 + var15;
                        var17 = var17 * var17 >> 12;
                        break;
                     case 5:
                        var15 *= var15;
                        var16 *= var16;
                        var17 = (int)(Math.sqrt(Math.sqrt((double)((float)(var15 + var16) / 1.6777216E7F))) * 4096.0D);
                        break;
                     default:
                        var17 = (int)(Math.sqrt((double)((float)(var16 * var16 + var15 * var15) / 1.6777216E7F)) * 4096.0D);
                     }

                     if (var17 < -1479855355 * class628.field9746) {
                        class645.field10128 = class399.field6578 * 335526737;
                        class399.field6578 = class469.field7329 * 1817789725;
                        class469.field7329 = class628.field9746 * 256238607;
                        class628.field9746 = -989158963 * var17;
                     } else if (var17 < -618310741 * class469.field7329) {
                        class645.field10128 = class399.field6578 * 335526737;
                        class399.field6578 = 1817789725 * class469.field7329;
                        class469.field7329 = -1560604925 * var17;
                     } else if (var17 < -472479385 * class399.field6578) {
                        class645.field10128 = class399.field6578 * 335526737;
                        class399.field6578 = -1652063657 * var17;
                     } else if (var17 < class645.field10128 * -1065886921) {
                        class645.field10128 = var17 * 499042951;
                     }
                  }
               }

               switch(-94219657 * this.field98) {
               case 0:
                  var3[var7] = -1479855355 * class628.field9746;
                  break;
               case 1:
                  var3[var7] = class469.field7329 * -618310741;
                  break;
               case 2:
                  var3[var7] = -618310741 * class469.field7329 - -1479855355 * class628.field9746;
                  break;
               case 3:
                  var3[var7] = -472479385 * class399.field6578;
                  break;
               case 4:
                  var3[var7] = -1065886921 * class645.field10128;
               }
            }
         }

         return var3;
      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "ahf.i(" + ')');
      }
   }

   void method205(int var1) {
      try {
         this.field86 = class322.method813(35399273 * this.field94, (byte)47);
         this.method82(-804707257);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ahf.x(" + ')');
      }
   }

   void method81() {
      this.field86 = class322.method813(35399273 * this.field94, (byte)50);
      this.method82(-975250951);
   }

   void method82(int var1) {
      try {
         Random var2 = new Random((long)(this.field94 * 35399273));
         this.field83 = new short[512];
         if (this.field95 * -1261812447 > 0) {
            for(int var3 = 0; var3 < 512; ++var3) {
               this.field83[var3] = (short)class977.method1813(var2, -1261812447 * this.field95, (byte)14);
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ahf.ac(" + ')');
      }
   }

   int[] method83(int var1) {
      int[] var2 = this.field270.method3546(var1, 538924530);
      if (this.field270.field6612) {
         int var3 = -1818338063 * this.field97 * class322.field836[var1] + 2048;
         int var4 = var3 >> 12;
         int var5 = 1 + var4;

         for(int var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
            class645.field10128 = 1648440697;
            class399.field6578 = -495419991;
            class469.field7329 = -586878723;
            class628.field9746 = -1158324685;
            int var7 = 883178403 * this.field96 * class322.field838[var6] + 2048;
            int var8 = var7 >> 12;
            int var9 = 1 + var8;

            for(int var10 = var4 - 1; var10 <= var5; ++var10) {
               int var11 = this.field86[(var10 >= -1818338063 * this.field97 ? var10 - this.field97 * -1818338063 : var10) & 255] & 255;

               for(int var12 = var8 - 1; var12 <= var9; ++var12) {
                  int var13 = (this.field86[(var12 >= this.field96 * 883178403 ? var12 - this.field96 * 883178403 : var12) + var11 & 255] & 255) * 2;
                  int var14 = var7 - (this.field83[var13++] + (var12 << 12));
                  int var15 = var3 - ((var10 << 12) + this.field83[var13]);
                  int var16;
                  switch(this.field99 * -1013656491) {
                  case 1:
                     var16 = var14 * var14 + var15 * var15 >> 12;
                     break;
                  case 2:
                     var16 = (var15 < 0 ? -var15 : var15) + (var14 < 0 ? -var14 : var14);
                     break;
                  case 3:
                     var14 = var14 < 0 ? -var14 : var14;
                     var15 = var15 < 0 ? -var15 : var15;
                     var16 = var14 > var15 ? var14 : var15;
                     break;
                  case 4:
                     var14 = (int)(Math.sqrt((double)((float)(var14 < 0 ? -var14 : var14) / 4096.0F)) * 4096.0D);
                     var15 = (int)(Math.sqrt((double)((float)(var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                     var16 = var15 + var14;
                     var16 = var16 * var16 >> 12;
                     break;
                  case 5:
                     var14 *= var14;
                     var15 *= var15;
                     var16 = (int)(Math.sqrt(Math.sqrt((double)((float)(var14 + var15) / 1.6777216E7F))) * 4096.0D);
                     break;
                  default:
                     var16 = (int)(Math.sqrt((double)((float)(var15 * var15 + var14 * var14) / 1.6777216E7F)) * 4096.0D);
                  }

                  if (var16 < -1479855355 * class628.field9746) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = class469.field7329 * 1817789725;
                     class469.field7329 = class628.field9746 * 256238607;
                     class628.field9746 = -989158963 * var16;
                  } else if (var16 < -618310741 * class469.field7329) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = 1817789725 * class469.field7329;
                     class469.field7329 = -1560604925 * var16;
                  } else if (var16 < -472479385 * class399.field6578) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = -1652063657 * var16;
                  } else if (var16 < class645.field10128 * -1065886921) {
                     class645.field10128 = var16 * 499042951;
                  }
               }
            }

            switch(-94219657 * this.field98) {
            case 0:
               var2[var6] = -1479855355 * class628.field9746;
               break;
            case 1:
               var2[var6] = class469.field7329 * -618310741;
               break;
            case 2:
               var2[var6] = -618310741 * class469.field7329 - -1479855355 * class628.field9746;
               break;
            case 3:
               var2[var6] = -472479385 * class399.field6578;
               break;
            case 4:
               var2[var6] = -1065886921 * class645.field10128;
            }
         }
      }

      return var2;
   }

   int[] method84(int var1) {
      int[] var2 = this.field270.method3546(var1, 1191732037);
      if (this.field270.field6612) {
         int var3 = -1818338063 * this.field97 * class322.field836[var1] + 2048;
         int var4 = var3 >> 12;
         int var5 = 1 + var4;

         for(int var6 = 0; var6 < class322.field831 * -1474554145; ++var6) {
            class645.field10128 = 1648440697;
            class399.field6578 = -495419991;
            class469.field7329 = -586878723;
            class628.field9746 = -1158324685;
            int var7 = 883178403 * this.field96 * class322.field838[var6] + 2048;
            int var8 = var7 >> 12;
            int var9 = 1 + var8;

            for(int var10 = var4 - 1; var10 <= var5; ++var10) {
               int var11 = this.field86[(var10 >= -1818338063 * this.field97 ? var10 - this.field97 * -1818338063 : var10) & 255] & 255;

               for(int var12 = var8 - 1; var12 <= var9; ++var12) {
                  int var13 = (this.field86[(var12 >= this.field96 * 883178403 ? var12 - this.field96 * 883178403 : var12) + var11 & 255] & 255) * 2;
                  int var14 = var7 - (this.field83[var13++] + (var12 << 12));
                  int var15 = var3 - ((var10 << 12) + this.field83[var13]);
                  int var16;
                  switch(this.field99 * -1013656491) {
                  case 1:
                     var16 = var14 * var14 + var15 * var15 >> 12;
                     break;
                  case 2:
                     var16 = (var15 < 0 ? -var15 : var15) + (var14 < 0 ? -var14 : var14);
                     break;
                  case 3:
                     var14 = var14 < 0 ? -var14 : var14;
                     var15 = var15 < 0 ? -var15 : var15;
                     var16 = var14 > var15 ? var14 : var15;
                     break;
                  case 4:
                     var14 = (int)(Math.sqrt((double)((float)(var14 < 0 ? -var14 : var14) / 4096.0F)) * 4096.0D);
                     var15 = (int)(Math.sqrt((double)((float)(var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                     var16 = var15 + var14;
                     var16 = var16 * var16 >> 12;
                     break;
                  case 5:
                     var14 *= var14;
                     var15 *= var15;
                     var16 = (int)(Math.sqrt(Math.sqrt((double)((float)(var14 + var15) / 1.6777216E7F))) * 4096.0D);
                     break;
                  default:
                     var16 = (int)(Math.sqrt((double)((float)(var15 * var15 + var14 * var14) / 1.6777216E7F)) * 4096.0D);
                  }

                  if (var16 < -1479855355 * class628.field9746) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = class469.field7329 * 1817789725;
                     class469.field7329 = class628.field9746 * 256238607;
                     class628.field9746 = -989158963 * var16;
                  } else if (var16 < -618310741 * class469.field7329) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = 1817789725 * class469.field7329;
                     class469.field7329 = -1560604925 * var16;
                  } else if (var16 < -472479385 * class399.field6578) {
                     class645.field10128 = class399.field6578 * 335526737;
                     class399.field6578 = -1652063657 * var16;
                  } else if (var16 < class645.field10128 * -1065886921) {
                     class645.field10128 = var16 * 499042951;
                  }
               }
            }

            switch(-94219657 * this.field98) {
            case 0:
               var2[var6] = -1479855355 * class628.field9746;
               break;
            case 1:
               var2[var6] = class469.field7329 * -618310741;
               break;
            case 2:
               var2[var6] = -618310741 * class469.field7329 - -1479855355 * class628.field9746;
               break;
            case 3:
               var2[var6] = -472479385 * class399.field6578;
               break;
            case 4:
               var2[var6] = -1065886921 * class645.field10128;
            }
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field96 = (this.field97 = var2.method6371() * 2059998225) * -910111141;
            break;
         case 1:
            this.field94 = var2.method6371() * -893138471;
            break;
         case 2:
            this.field95 = var2.method6374() * 1389592289;
            break;
         case 3:
            this.field98 = var2.method6371() * -1527961785;
            break;
         case 4:
            this.field99 = var2.method6371() * -1784051459;
            break;
         case 5:
            this.field96 = var2.method6371() * -648032245;
            break;
         case 6:
            this.field97 = var2.method6371() * 2059998225;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ahf.r(" + ')');
      }
   }

   void method85() {
      this.field86 = class322.method813(35399273 * this.field94, (byte)-59);
      this.method82(1419756353);
   }

   public class578() {
      super(0, true);
   }

   void method86(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field96 = (this.field97 = var2.method6371() * 2059998225) * -910111141;
         break;
      case 1:
         this.field94 = var2.method6371() * -893138471;
         break;
      case 2:
         this.field95 = var2.method6374() * 1389592289;
         break;
      case 3:
         this.field98 = var2.method6371() * -1527961785;
         break;
      case 4:
         this.field99 = var2.method6371() * -1784051459;
         break;
      case 5:
         this.field96 = var2.method6371() * -648032245;
         break;
      case 6:
         this.field97 = var2.method6371() * 2059998225;
      }

   }

   void method87(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field96 = (this.field97 = var2.method6371() * 2059998225) * -910111141;
         break;
      case 1:
         this.field94 = var2.method6371() * -893138471;
         break;
      case 2:
         this.field95 = var2.method6374() * 1389592289;
         break;
      case 3:
         this.field98 = var2.method6371() * -1527961785;
         break;
      case 4:
         this.field99 = var2.method6371() * -1784051459;
         break;
      case 5:
         this.field96 = var2.method6371() * -648032245;
         break;
      case 6:
         this.field97 = var2.method6371() * 2059998225;
      }

   }

   void method88() {
      this.field86 = class322.method813(35399273 * this.field94, (byte)-39);
      this.method82(-1703391466);
   }
}
