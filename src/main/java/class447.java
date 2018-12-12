import java.awt.event.ActionEvent;

public class class447 {
   public int field7623;
   class812 field7624;
   int field7625;
   public int field7626;

   void method4314(class907 var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            this.field7625 = var1.method6423(1235052657) * -1732871629;
         } else if (2 == var2) {
            this.field7626 = var1.method6371() * -1845194875;
            this.field7623 = var1.method6371() * -1430050043;
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ug.f(" + ')');
      }
   }

   void method4315(class907 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 == 1638036980) {
                  ;
               }

               return;
            }

            this.method4314(var1, var3, (byte)-92);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ug.a(" + ')');
      }
   }

   public synchronized class922 method4316(int var1) {
      try {
         class922 var2 = (class922)this.field7624.field4641.method2974((long)(this.field7625 * 1338052859));
         if (var2 != null) {
            return var2;
         } else {
            var2 = class922.method6242(this.field7624.field4640, 1338052859 * this.field7625, 0);
            if (var2 != null) {
               this.field7624.field4641.method2984(var2, (long)(1338052859 * this.field7625));
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ug.b(" + ')');
      }
   }

   static final void method4317(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         class921[] var7 = class730.field2851;

         for(int var8 = 0; var8 < var7.length; ++var8) {
            class921 var9 = var7[var8];
            if (var9 != null) {
               if (var9.field10287 * 958933333 != 2) {
                  if (var6 != 996259282) {
                     break;
                  }
               } else {
                  class971.method1790(var9.field10280 * -458864019, -1338192389 * var9.field10281, 1018128075 * var9.field10282, var9.field10283 * 143254950, -549885479);
                  if (class730.field2873[0] > -1.0F && 443738891 * class730.field2866 % 20 < 10) {
                     class48 var10 = class634.field9790[-92466201 * var9.field10279];
                     int var11 = (int)((float)var0 + class730.field2873[0] - 12.0F);
                     int var12 = (int)((float)var1 + class730.field2873[1] - 28.0F);
                     var10.method3128(var11, var12);
                  }
               }
            }
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "ug.jf(" + ')');
      }
   }

   static final void method4318(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5;
         if (var1 > var2) {
            for(var5 = var2; var5 < var1; ++var5) {
               class216.field1412[var5][var0] = var3;
            }
         } else {
            for(var5 = var1; var5 < var2; ++var5) {
               class216.field1412[var5][var0] = var3;
            }
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ug.r(" + ')');
      }
   }

   static boolean method4319(class858 var0, int var1) {
      try {
         return class71.method1090(var0, (class284)null, (byte)-87);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ug.p(" + ')');
      }
   }

   public static void method4320(Object var0, int var1) {
      try {
         if (class744.field3179 != null) {
            for(int var2 = 0; var2 < 50 && class744.field3179.peekEvent() != null; ++var2) {
               class764.method2745(1L);
            }

            try {
               if (var0 != null) {
                  class744.field3179.postEvent(new ActionEvent(var0, 1001, "dummy"));
               }
            } catch (Exception var3) {
               ;
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ug.c(" + ')');
      }
   }
}
