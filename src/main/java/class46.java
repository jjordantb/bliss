public class class46 extends class298 {
   class272 field5179;
   class599 field5180 = new class599();
   class451 field5181 = new class451();

   void method3088(class705 var1, int[] var2, int var3, int var4, int var5, int var6) {
      try {
         if ((this.field5179.field10540[70539643 * var1.field3312] & 4) != 0 && var1.field3306 * 1595133323 < 0) {
            int var7 = this.field5179.field10544[var1.field3312 * 70539643] / (class752.field4179 * 1164070869);

            while(true) {
               int var8 = (1048575 + var7 - -327753205 * var1.field3313) / var7;
               if (var8 > var4) {
                  var1.field3313 += var4 * var7 * -460252765;
                  break;
               }

               var1.field3310.method6533(var2, var3, var8);
               var3 += var8;
               var4 -= var8;
               var1.field3313 += (var7 * var8 - 1048576) * -460252765;
               int var9 = class752.field4179 * 1164070869 / 100;
               int var10 = 262144 / var7;
               if (var10 < var9) {
                  var9 = var10;
               }

               class436 var11 = var1.field3310;
               if (this.field5179.field10542[70539643 * var1.field3312] == 0) {
                  var1.field3310 = class436.method4208(var1.field3294, var11.method4197(), var11.method4200(), var11.method4177());
               } else {
                  var1.field3310 = class436.method4208(var1.field3294, var11.method4197(), 0, var11.method4177());
                  this.field5179.method6573(var1, var1.field3307.field7647[var1.field3297 * 1458878633] < 0, (byte)1);
                  var1.field3310.method4180(var9, var11.method4200());
               }

               if (var1.field3307.field7647[var1.field3297 * 1458878633] < 0) {
                  var1.field3310.method4172(-1);
               }

               var11.method4174(var9);
               var11.method6533(var2, var3, var5 - var3);
               if (var11.method4184()) {
                  this.field5181.method3870(var11);
               }
            }
         }

         var1.field3310.method6533(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "ait.av(" + ')');
      }
   }

   class298 method6529() {
      try {
         class705 var1 = (class705)this.field5180.method1281(1312741945);
         if (var1 == null) {
            return null;
         } else {
            return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ait.f(" + ')');
      }
   }

   class298 method6530() {
      try {
         class705 var1;
         do {
            var1 = (class705)this.field5180.method1283((byte)-51);
            if (var1 == null) {
               return null;
            }
         } while(var1.field3310 == null);

         return var1.field3310;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ait.b(" + ')');
      }
   }

   int method6528() {
      return 0;
   }

   class46(class272 var1) {
      this.field5179 = var1;
   }

   class298 method6537() {
      class705 var1 = (class705)this.field5180.method1281(1592221798);
      if (var1 == null) {
         return null;
      } else {
         return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
      }
   }

   int method6541() {
      return 0;
   }

   void method3089(class705 var1, int var2, int var3) {
      try {
         if ((this.field5179.field10540[70539643 * var1.field3312] & 4) != 0 && 1595133323 * var1.field3306 < 0) {
            int var4 = this.field5179.field10544[70539643 * var1.field3312] / (1164070869 * class752.field4179);
            int var5 = (var4 + 1048575 - -327753205 * var1.field3313) / var4;
            var1.field3313 = -460252765 * (var2 * var4 + var1.field3313 * -327753205 & 1048575);
            if (var5 <= var2) {
               if (this.field5179.field10542[var1.field3312 * 70539643] == 0) {
                  var1.field3310 = class436.method4208(var1.field3294, var1.field3310.method4197(), var1.field3310.method4200(), var1.field3310.method4177());
               } else {
                  var1.field3310 = class436.method4208(var1.field3294, var1.field3310.method4197(), 0, var1.field3310.method4177());
                  this.field5179.method6573(var1, var1.field3307.field7647[var1.field3297 * 1458878633] < 0, (byte)1);
               }

               if (var1.field3307.field7647[var1.field3297 * 1458878633] < 0) {
                  var1.field3310.method4172(-1);
               }

               var2 = var1.field3313 * -327753205 / var4;
            }
         }

         var1.field3310.method6534(var2);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ait.at(" + ')');
      }
   }

   class298 method6543() {
      class705 var1 = (class705)this.field5180.method1281(1939327453);
      if (var1 == null) {
         return null;
      } else {
         return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
      }
   }

   class298 method6536() {
      class705 var1 = (class705)this.field5180.method1281(1962198238);
      if (var1 == null) {
         return null;
      } else {
         return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
      }
   }

   void method6533(int[] var1, int var2, int var3) {
      try {
         this.field5181.method6533(var1, var2, var3);

         for(class705 var4 = (class705)this.field5180.method1281(1804222944); var4 != null; var4 = (class705)this.field5180.method1283((byte)-61)) {
            if (!this.field5179.method6593(var4, (byte)49)) {
               int var5 = var2;
               int var6 = var3;

               do {
                  if (var6 <= -129654463 * var4.field3311) {
                     this.method3088(var4, var1, var5, var6, var6 + var5, 2107590773);
                     var4.field3311 -= 718794433 * var6;
                     break;
                  }

                  this.method3088(var4, var1, var5, -129654463 * var4.field3311, var5 + var6, 1945030807);
                  var5 += -129654463 * var4.field3311;
                  var6 -= -129654463 * var4.field3311;
               } while(!this.field5179.method6587(var4, var1, var5, var6, 308349107));
            }
         }

      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ait.k(" + ')');
      }
   }

   int method6542() {
      return 0;
   }

   class298 method6538() {
      class705 var1 = (class705)this.field5180.method1281(1902536390);
      if (var1 == null) {
         return null;
      } else {
         return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
      }
   }

   int method6535() {
      return 0;
   }

   class298 method6540() {
      class705 var1;
      do {
         var1 = (class705)this.field5180.method1283((byte)-20);
         if (var1 == null) {
            return null;
         }
      } while(var1.field3310 == null);

      return var1.field3310;
   }

   void method6547(int var1) {
      this.field5181.method6534(var1);

      for(class705 var2 = (class705)this.field5180.method1281(1342928995); var2 != null; var2 = (class705)this.field5180.method1283((byte)-97)) {
         if (!this.field5179.method6593(var2, (byte)62)) {
            int var3 = var1;

            do {
               if (var3 <= -129654463 * var2.field3311) {
                  this.method3089(var2, var3, -1423260065);
                  var2.field3311 -= var3 * 718794433;
                  break;
               }

               this.method3089(var2, -129654463 * var2.field3311, -1278171875);
               var3 -= var2.field3311 * -129654463;
            } while(!this.field5179.method6587(var2, (int[])null, 0, var3, -657565071));
         }
      }

   }

   void method6534(int var1) {
      try {
         this.field5181.method6534(var1);

         for(class705 var2 = (class705)this.field5180.method1281(1563549422); var2 != null; var2 = (class705)this.field5180.method1283((byte)-111)) {
            if (!this.field5179.method6593(var2, (byte)51)) {
               int var3 = var1;

               do {
                  if (var3 <= -129654463 * var2.field3311) {
                     this.method3089(var2, var3, -2140903292);
                     var2.field3311 -= var3 * 718794433;
                     break;
                  }

                  this.method3089(var2, -129654463 * var2.field3311, -1211758254);
                  var3 -= var2.field3311 * -129654463;
               } while(!this.field5179.method6587(var2, (int[])null, 0, var3, -1621498050));
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ait.d(" + ')');
      }
   }

   void method6531(int[] var1, int var2, int var3) {
      this.field5181.method6533(var1, var2, var3);

      for(class705 var4 = (class705)this.field5180.method1281(1337915005); var4 != null; var4 = (class705)this.field5180.method1283((byte)-57)) {
         if (!this.field5179.method6593(var4, (byte)-37)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if (var6 <= -129654463 * var4.field3311) {
                  this.method3088(var4, var1, var5, var6, var6 + var5, 955925823);
                  var4.field3311 -= 718794433 * var6;
                  break;
               }

               this.method3088(var4, var1, var5, -129654463 * var4.field3311, var5 + var6, 3456667);
               var5 += -129654463 * var4.field3311;
               var6 -= -129654463 * var4.field3311;
            } while(!this.field5179.method6587(var4, var1, var5, var6, -1959198557));
         }
      }

   }

   void method6527(int[] var1, int var2, int var3) {
      this.field5181.method6533(var1, var2, var3);

      for(class705 var4 = (class705)this.field5180.method1281(1686060186); var4 != null; var4 = (class705)this.field5180.method1283((byte)-84)) {
         if (!this.field5179.method6593(var4, (byte)5)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if (var6 <= -129654463 * var4.field3311) {
                  this.method3088(var4, var1, var5, var6, var6 + var5, -535844657);
                  var4.field3311 -= 718794433 * var6;
                  break;
               }

               this.method3088(var4, var1, var5, -129654463 * var4.field3311, var5 + var6, 1587884521);
               var5 += -129654463 * var4.field3311;
               var6 -= -129654463 * var4.field3311;
            } while(!this.field5179.method6587(var4, var1, var5, var6, -60228894));
         }
      }

   }

   void method6544(int[] var1, int var2, int var3) {
      this.field5181.method6533(var1, var2, var3);

      for(class705 var4 = (class705)this.field5180.method1281(1507919697); var4 != null; var4 = (class705)this.field5180.method1283((byte)-117)) {
         if (!this.field5179.method6593(var4, (byte)-31)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if (var6 <= -129654463 * var4.field3311) {
                  this.method3088(var4, var1, var5, var6, var6 + var5, 888947175);
                  var4.field3311 -= 718794433 * var6;
                  break;
               }

               this.method3088(var4, var1, var5, -129654463 * var4.field3311, var5 + var6, -1260559674);
               var5 += -129654463 * var4.field3311;
               var6 -= -129654463 * var4.field3311;
            } while(!this.field5179.method6587(var4, var1, var5, var6, -1973772367));
         }
      }

   }

   class298 method6539() {
      class705 var1;
      do {
         var1 = (class705)this.field5180.method1283((byte)-92);
         if (var1 == null) {
            return null;
         }
      } while(var1.field3310 == null);

      return var1.field3310;
   }

   void method6548(int var1) {
      this.field5181.method6534(var1);

      for(class705 var2 = (class705)this.field5180.method1281(1615542283); var2 != null; var2 = (class705)this.field5180.method1283((byte)-58)) {
         if (!this.field5179.method6593(var2, (byte)49)) {
            int var3 = var1;

            do {
               if (var3 <= -129654463 * var2.field3311) {
                  this.method3089(var2, var3, -1608691527);
                  var2.field3311 -= var3 * 718794433;
                  break;
               }

               this.method3089(var2, -129654463 * var2.field3311, -1252817178);
               var3 -= var2.field3311 * -129654463;
            } while(!this.field5179.method6587(var2, (int[])null, 0, var3, 388406507));
         }
      }

   }

   class298 method6545() {
      class705 var1 = (class705)this.field5180.method1281(1374349809);
      if (var1 == null) {
         return null;
      } else {
         return (class298)(var1.field3310 != null ? var1.field3310 : this.method6530());
      }
   }

   void method6546(int var1) {
      this.field5181.method6534(var1);

      for(class705 var2 = (class705)this.field5180.method1281(1835442055); var2 != null; var2 = (class705)this.field5180.method1283((byte)-114)) {
         if (!this.field5179.method6593(var2, (byte)-80)) {
            int var3 = var1;

            do {
               if (var3 <= -129654463 * var2.field3311) {
                  this.method3089(var2, var3, -1605363259);
                  var2.field3311 -= var3 * 718794433;
                  break;
               }

               this.method3089(var2, -129654463 * var2.field3311, -1438243413);
               var3 -= var2.field3311 * -129654463;
            } while(!this.field5179.method6587(var2, (int[])null, 0, var3, 93946984));
         }
      }

   }
}
