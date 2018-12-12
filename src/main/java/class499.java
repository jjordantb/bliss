import java.util.Random;

public class class499 extends class347 {
   int field7954 = -692113744;
   static int field7955 = 0;
   int field7956 = -1263482416;
   static int field7957 = 2000;
   static int field7958 = 4096;
   int field7959 = 0;
   int field7960 = 0;
   static int field7961 = 16;
   int field7962 = 1324134400;
   static int field7963 = 0;

   void method4468() {
      class322.method814((byte)-44);
   }

   int[] method4469(int var1) {
      int[] var2 = this.field270.method3546(var1, 574201304);
      if (this.field270.field6612) {
         int var3 = 1698072291 * this.field7962 >> 1;
         int[][] var4 = this.field270.method3547(432902408);
         Random var5 = new Random((long)(this.field7959 * -1552351361));

         for(int var6 = 0; var6 < -1197969353 * this.field7954; ++var6) {
            int var7 = this.field7962 * 1698072291 > 0 ? -114289409 * this.field7960 + (class977.method1813(var5, 1698072291 * this.field7962, (byte)-39) - var3) : -114289409 * this.field7960;
            var7 = var7 >> 4 & 255;
            int var8 = class977.method1813(var5, -1474554145 * class322.field831, (byte)18);
            int var9 = class977.method1813(var5, 461985445 * class322.field832, (byte)-39);
            int var10 = var8 + (this.field7956 * -1584670283 * class322.field839[var7] >> 12);
            int var11 = (-1584670283 * this.field7956 * class322.field837[var7] >> 12) + var9;
            int var12 = var11 - var9;
            int var13 = var10 - var8;
            if (var13 != 0 || var12 != 0) {
               if (var12 < 0) {
                  var12 = -var12;
               }

               if (var13 < 0) {
                  var13 = -var13;
               }

               boolean var14 = var12 > var13;
               int var15;
               int var16;
               if (var14) {
                  var15 = var8;
                  var16 = var10;
                  var8 = var9;
                  var9 = var15;
                  var10 = var11;
                  var11 = var16;
               }

               if (var8 > var10) {
                  var15 = var8;
                  var16 = var9;
                  var8 = var10;
                  var10 = var15;
                  var9 = var11;
                  var11 = var16;
               }

               var15 = var9;
               var16 = var10 - var8;
               int var17 = var11 - var9;
               int var18 = -var16 / 2;
               int var19 = 2048 / var16;
               int var20 = 1024 - (class977.method1813(var5, 4096, (byte)29) >> 2);
               int var21 = var9 < var11 ? 1 : -1;
               if (var17 < 0) {
                  var17 = -var17;
               }

               for(int var22 = var8; var22 < var10; ++var22) {
                  int var23 = 1024 + var20 + var19 * (var22 - var8);
                  int var24 = var22 & class322.field829 * -901777799;
                  int var25 = var15 & -289063255 * class322.field834;
                  if (var14) {
                     var4[var25][var24] = var23;
                  } else {
                     var4[var24][var25] = var23;
                  }

                  var18 += var17;
                  if (var18 > 0) {
                     var18 -= var16;
                     var15 += var21;
                  }
               }
            }
         }
      }

      return var2;
   }

   void method205(int var1) {
      try {
         class322.method814((byte)42);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "agl.x(" + ')');
      }
   }

   void method4470(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7959 = var2.method6371() * 94814335;
         break;
      case 1:
         this.field7954 = var2.method6374() * -23968377;
         break;
      case 2:
         this.field7956 = var2.method6371() * -1689580387;
         break;
      case 3:
         this.field7960 = var2.method6374() * -132715777;
         break;
      case 4:
         this.field7962 = var2.method6374() * 1425338059;
      }

   }

   int[] method4471(int var1) {
      int[] var2 = this.field270.method3546(var1, 1014530517);
      if (this.field270.field6612) {
         int var3 = 1698072291 * this.field7962 >> 1;
         int[][] var4 = this.field270.method3547(-125478280);
         Random var5 = new Random((long)(this.field7959 * -1552351361));

         for(int var6 = 0; var6 < -1197969353 * this.field7954; ++var6) {
            int var7 = this.field7962 * 1698072291 > 0 ? -114289409 * this.field7960 + (class977.method1813(var5, 1698072291 * this.field7962, (byte)21) - var3) : -114289409 * this.field7960;
            var7 = var7 >> 4 & 255;
            int var8 = class977.method1813(var5, -1474554145 * class322.field831, (byte)-30);
            int var9 = class977.method1813(var5, 461985445 * class322.field832, (byte)-9);
            int var10 = var8 + (this.field7956 * -1584670283 * class322.field839[var7] >> 12);
            int var11 = (-1584670283 * this.field7956 * class322.field837[var7] >> 12) + var9;
            int var12 = var11 - var9;
            int var13 = var10 - var8;
            if (var13 != 0 || var12 != 0) {
               if (var12 < 0) {
                  var12 = -var12;
               }

               if (var13 < 0) {
                  var13 = -var13;
               }

               boolean var14 = var12 > var13;
               int var15;
               int var16;
               if (var14) {
                  var15 = var8;
                  var16 = var10;
                  var8 = var9;
                  var9 = var15;
                  var10 = var11;
                  var11 = var16;
               }

               if (var8 > var10) {
                  var15 = var8;
                  var16 = var9;
                  var8 = var10;
                  var10 = var15;
                  var9 = var11;
                  var11 = var16;
               }

               var15 = var9;
               var16 = var10 - var8;
               int var17 = var11 - var9;
               int var18 = -var16 / 2;
               int var19 = 2048 / var16;
               int var20 = 1024 - (class977.method1813(var5, 4096, (byte)-15) >> 2);
               int var21 = var9 < var11 ? 1 : -1;
               if (var17 < 0) {
                  var17 = -var17;
               }

               for(int var22 = var8; var22 < var10; ++var22) {
                  int var23 = 1024 + var20 + var19 * (var22 - var8);
                  int var24 = var22 & class322.field829 * -901777799;
                  int var25 = var15 & -289063255 * class322.field834;
                  if (var14) {
                     var4[var25][var24] = var23;
                  } else {
                     var4[var24][var25] = var23;
                  }

                  var18 += var17;
                  if (var18 > 0) {
                     var18 -= var16;
                     var15 += var21;
                  }
               }
            }
         }
      }

      return var2;
   }

   void method209(int var1, class907 var2, byte var3) {
      try {
         switch(var1) {
         case 0:
            this.field7959 = var2.method6371() * 94814335;
            break;
         case 1:
            this.field7954 = var2.method6374() * -23968377;
            break;
         case 2:
            this.field7956 = var2.method6371() * -1689580387;
            break;
         case 3:
            this.field7960 = var2.method6374() * -132715777;
            break;
         case 4:
            this.field7962 = var2.method6374() * 1425338059;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agl.r(" + ')');
      }
   }

   void method4472() {
      class322.method814((byte)41);
   }

   int[] method203(int var1, int var2) {
      try {
         int[] var3 = this.field270.method3546(var1, 236039494);
         if (this.field270.field6612) {
            int var4 = 1698072291 * this.field7962 >> 1;
            int[][] var5 = this.field270.method3547(-1416653577);
            Random var6 = new Random((long)(this.field7959 * -1552351361));

            for(int var7 = 0; var7 < -1197969353 * this.field7954; ++var7) {
               int var8 = this.field7962 * 1698072291 > 0 ? -114289409 * this.field7960 + (class977.method1813(var6, 1698072291 * this.field7962, (byte)24) - var4) : -114289409 * this.field7960;
               var8 = var8 >> 4 & 255;
               int var9 = class977.method1813(var6, -1474554145 * class322.field831, (byte)15);
               int var10 = class977.method1813(var6, 461985445 * class322.field832, (byte)76);
               int var11 = var9 + (this.field7956 * -1584670283 * class322.field839[var8] >> 12);
               int var12 = (-1584670283 * this.field7956 * class322.field837[var8] >> 12) + var10;
               int var13 = var12 - var10;
               int var14 = var11 - var9;
               if (var14 != 0 || var13 != 0) {
                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (var14 < 0) {
                     var14 = -var14;
                  }

                  boolean var15 = var13 > var14;
                  int var16;
                  int var17;
                  if (var15) {
                     var16 = var9;
                     var17 = var11;
                     var9 = var10;
                     var10 = var16;
                     var11 = var12;
                     var12 = var17;
                  }

                  if (var9 > var11) {
                     var16 = var9;
                     var17 = var10;
                     var9 = var11;
                     var11 = var16;
                     var10 = var12;
                     var12 = var17;
                  }

                  var16 = var10;
                  var17 = var11 - var9;
                  int var18 = var12 - var10;
                  int var19 = -var17 / 2;
                  int var20 = 2048 / var17;
                  int var21 = 1024 - (class977.method1813(var6, 4096, (byte)-25) >> 2);
                  int var22 = var10 < var12 ? 1 : -1;
                  if (var18 < 0) {
                     var18 = -var18;
                  }

                  for(int var23 = var9; var23 < var11; ++var23) {
                     int var24 = 1024 + var21 + var20 * (var23 - var9);
                     int var25 = var23 & class322.field829 * -901777799;
                     int var26 = var16 & -289063255 * class322.field834;
                     if (var15) {
                        var5[var26][var25] = var24;
                     } else {
                        var5[var25][var26] = var24;
                     }

                     var19 += var18;
                     if (var19 > 0) {
                        var19 -= var17;
                        var16 += var22;
                     }
                  }
               }
            }
         }

         return var3;
      } catch (RuntimeException var27) {
         throw class158.method3445(var27, "agl.i(" + ')');
      }
   }

   void method4473() {
      class322.method814((byte)-70);
   }

   void method4474(int var1, class907 var2) {
      switch(var1) {
      case 0:
         this.field7959 = var2.method6371() * 94814335;
         break;
      case 1:
         this.field7954 = var2.method6374() * -23968377;
         break;
      case 2:
         this.field7956 = var2.method6371() * -1689580387;
         break;
      case 3:
         this.field7960 = var2.method6374() * -132715777;
         break;
      case 4:
         this.field7962 = var2.method6374() * 1425338059;
      }

   }

   public class499() {
      super(0, true);
   }

   static final void method4475(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         String var4 = (String)var2.field3157[(var2.field3158 -= 969361751) * -203050393];
         if (class960.method2212(var4, var2, -1433949674) != null) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         var0.field999 = class634.method5872(var4, var2, -2046058202);
         var0.field963 = true;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "agl.nw(" + ')');
      }
   }
}
