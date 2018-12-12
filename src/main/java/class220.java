public class class220 {
   public String field7352;
   public String field7353;
   public String field7354;
   public class27[] field7355;
   public class27[] field7356;
   public static int field7357;

   void method4039(class501 var1, byte var2) {
      try {
         this.field7353 = var1.method1905(1509343502);
         this.field7352 = var1.method1905(1509343502);
         this.field7354 = var1.method1905(1509343502);
         int var3 = var1.method1906(823123769);
         int var4 = var1.method1906(-1396708449);
         this.field7355 = var3 == 0 ? null : new class27[var3];
         this.field7356 = var4 == 0 ? null : new class27[var4];

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            this.field7355[var5] = new class27();
            this.field7355[var5].method3466(var1, 1424483545);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field7356[var5] = new class27();
            this.field7356[var5].method3466(var1, 1424483545);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ek.a(" + ')');
      }
   }

   public static void method4040(class180 var0, int var1) {
      try {
         class923.field10294 = var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ek.a(" + ')');
      }
   }

   static final void method4041(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = Client.field2621 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ek.abd(" + ')');
      }
   }

   static final void method4042(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         class564 var3 = class449.method3756(var2, (byte)70);
         class131 var4 = class382.field1410[var2 >> 16];
         class75.method1118(var3, var4, false, 1, var0, 233594133);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ek.he(" + ')');
      }
   }

   static String method4043(int var0, class423 var1, int var2) {
      try {
         if (var0 < 100000) {
            return "<col=ffff00>" + var0 + "</col>";
         } else {
            return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class814.field4794.method2927(var1, -875414210) + "</col>" : "<col=00ff80>" + var0 / 1000000 + class814.field4792.method2927(var1, -875414210) + "</col>";
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ek.n(" + ')');
      }
   }

   public static final void method4044(boolean var0, byte var1) {
      try {
         class701 var2 = class637.method5936(class643.field9984, Client.field2692.field7765, (byte)111);
         Client.field2692.method4380(var2, (byte)-21);

         for(class256 var3 = (class256) Client.field2823.method2946(1892786919); var3 != null; var3 = (class256) Client.field2823.method2945((byte)-93)) {
            if (!var3.method546(-629325116)) {
               var3 = (class256) Client.field2823.method2946(1676096674);
               if (var3 == null) {
                  break;
               }
            }

            if (var3.field8100 * 27137839 == 0) {
               class526.method2226(var3, true, var0, -113822480);
            }
         }

         if (Client.field2633 != null) {
            class814.method2932(Client.field2633, -1209330591);
            Client.field2633 = null;
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ek.lr(" + ')');
      }
   }

   static final void method4045(class744 var0, int var1) {
      try {
         if (class396.field6515 != null && class721.field3635 * -316347407 < class198.field7051 * 367592105) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class396.field6515[(class721.field3635 += 1578804497) * -316347407 - 1] & '\uffff';
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ek.abw(" + ')');
      }
   }

   static void method4046(int var0, int var1, int var2) {
      try {
         class682 var3 = class370.method881(14, (long)var0);
         var3.method4340((byte)25);
         var3.field7687 = 1274450087 * var1;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ek.ag(" + ')');
      }
   }

   static void method4047(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = 0;
         int var7 = var3;
         int var8 = var2 * var2;
         int var9 = var3 * var3;
         int var10 = var9 << 1;
         int var11 = var8 << 1;
         int var12 = var3 << 1;
         int var13 = var10 + (1 - var12) * var8;
         int var14 = var9 - (var12 - 1) * var11;
         int var15 = var8 << 2;
         int var16 = var9 << 2;
         int var17 = var10 * (3 + (var6 << 1));
         int var18 = ((var3 << 1) - 3) * var11;
         int var19 = (1 + var6) * var16;
         int var20 = var15 * (var3 - 1);
         class484.method4769(class465.field1412[var1], var0 - var2, var2 + var0, var4, -2115360638);

         while(var7 > 0) {
            if (var13 < 0) {
               while(var13 < 0) {
                  var13 += var17;
                  var14 += var19;
                  var17 += var16;
                  var19 += var16;
                  ++var6;
               }
            }

            if (var14 < 0) {
               var13 += var17;
               var14 += var19;
               var17 += var16;
               var19 += var16;
               ++var6;
            }

            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var21 = var1 - var7;
            int var22 = var1 + var7;
            int var23 = var6 + var0;
            int var24 = var0 - var6;
            class484.method4769(class465.field1412[var21], var24, var23, var4, 756505397);
            class484.method4769(class465.field1412[var22], var24, var23, var4, 931363895);
         }

      } catch (RuntimeException var25) {
         throw class158.method3445(var25, "ek.at(" + ')');
      }
   }
}
