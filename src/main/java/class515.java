public class class515 {
   public static int field4291 = 20;
   public static int field4292 = -6;
   public static int field4293 = -5;
   public static int field4294 = -4;
   public static int field4295 = -1;

   class515() throws Throwable {
      throw new Error();
   }

   static final void method2692(class744 var0, short var1) {
      try {
         class966.method1711(var0.field3161[(var0.field3156 -= -391880689) * 681479919], -1104898137);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ql.agd(" + ')');
      }
   }

   public static void method2693(short var0) {
      try {
         class382.field1410 = new class131[class91.field562.method3266(949346193)];
         class866.field9767 = new boolean[class91.field562.method3266(1513726492)];
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ql.m(" + ')');
      }
   }

   public static final void method2694(byte var0) {
      try {
         if (-1 != -591434031 * Client.field2749 && Client.field2750 * -839811113 != -1) {
            int var1 = (Client.field2839 * 892197957 * (Client.field2755 * 1714001937 - 1049339515 * Client.field2834) >> 16) + 1049339515 * Client.field2834;
            Client.field2839 += 283956877 * var1;
            if (Client.field2839 * 892197957 >= 65535) {
               Client.field2839 = -979359373;
               if (!Client.field2757) {
                  Client.field2756 = true;
               } else {
                  Client.field2756 = false;
               }

               Client.field2757 = true;
            } else {
               Client.field2756 = false;
               Client.field2757 = false;
            }

            float var2 = (float)(Client.field2839 * 892197957) / 65535.0F;
            float[] var3 = new float[3];
            int var4 = Client.field2751 * 1872262310;

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            for(int var5 = 0; var5 < 3; ++var5) {
               int var6 = 3 * Client.field2748[Client.field2749 * -591434031][var4][var5];
               var7 = Client.field2748[-591434031 * Client.field2749][1 + var4][var5] * 3;
               var8 = (Client.field2748[Client.field2749 * -591434031][2 + var4][var5] - (Client.field2748[Client.field2749 * -591434031][3 + var4][var5] - Client.field2748[-591434031 * Client.field2749][var4 + 2][var5])) * 3;
               var9 = Client.field2748[-591434031 * Client.field2749][var4][var5];
               var10 = var7 - var6;
               var11 = var6 - 2 * var7 + var8;
               var12 = var7 + (Client.field2748[Client.field2749 * -591434031][var4 + 2][var5] - var9) - var8;
               var3[var5] = var2 * ((float)var10 + ((float)var11 + (float)var12 * var2) * var2) + (float)var9;
            }

            class389 var19 = Client.field2697.method5270(681479919);
            class103.field205 = 547882953 * ((int)var3[0] - 526163456 * var19.field1521);
            class184.field5230 = (int)var3[1] * -1078403147;
            class7.field4918 = 309839105 * ((int)var3[2] - var19.field1522 * -869407232);
            float[] var20 = new float[3];
            var7 = Client.field2752 * 977380166;

            for(var8 = 0; var8 < 3; ++var8) {
               var9 = Client.field2748[-839811113 * Client.field2750][var7][var8] * 3;
               var10 = Client.field2748[Client.field2750 * -839811113][1 + var7][var8] * 3;
               var11 = 3 * (Client.field2748[Client.field2750 * -839811113][2 + var7][var8] - (Client.field2748[-839811113 * Client.field2750][3 + var7][var8] - Client.field2748[-839811113 * Client.field2750][2 + var7][var8]));
               var12 = Client.field2748[-839811113 * Client.field2750][var7][var8];
               int var13 = var10 - var9;
               int var14 = var11 + (var9 - var10 * 2);
               int var15 = var10 + (Client.field2748[Client.field2750 * -839811113][2 + var7][var8] - var12) - var11;
               var20[var8] = ((float)var13 + (var2 * (float)var15 + (float)var14) * var2) * var2 + (float)var12;
            }

            float var21 = var20[0] - var3[0];
            float var22 = (var20[1] - var3[1]) * -1.0F;
            float var23 = var20[2] - var3[2];
            double var16 = Math.sqrt((double)(var23 * var23 + var21 * var21));
            Client.field2737 = ((int)(Math.atan2((double)var22, var16) * 2607.5945876176133D) & 16383) * -648269561;
            class232.field8266 = ((int)(-Math.atan2((double)var21, (double)var23) * 2607.5945876176133D) & 16383) * -1587695039;
            class791.field446 = (Client.field2748[-591434031 * Client.field2749][var4][3] + ((Client.field2748[-591434031 * Client.field2749][2 + var4][3] - Client.field2748[Client.field2749 * -591434031][var4][3]) * 892197957 * Client.field2839 >> 16)) * -851711283;
         }

      } catch (RuntimeException var18) {
         throw class158.method3445(var18, "ql.hi(" + ')');
      }
   }

   static void method2695(class564 var0, class118 var1, int var2, int var3, int var4, int var5, int var6, long var7) {
      try {
         int var9 = var5 * var5 + var4 * var4;
         if ((long)var9 <= var7) {
            int var10;
            if (class563.field1083 * -863531439 == 2) {
               var10 = (int) Client.field2931 & 16383;
            } else {
               var10 = 1227356013 * Client.field2782 + (int) Client.field2931 & 16383;
            }

            int var11 = class703.field3413[var10];
            int var12 = class703.field3404[var10];
            if (class563.field1083 * -863531439 != 2) {
               var11 = 256 * var11 / (256 + Client.field2730 * 356727603);
               var12 = var12 * 256 / (356727603 * Client.field2730 + 256);
            }

            int var13 = var12 * var4 + var5 * var11 >> 14;
            int var14 = var12 * var5 - var4 * var11 >> 14;
            class48 var15 = class295.field10478[var6];
            int var16 = var15.method3106();
            int var17 = var15.method3108();
            int var18 = var13 + -2093041337 * var0.field881 / 2 - var16 / 2;
            int var19 = var18 + var16;
            int var20 = var0.field887 * 457937409 / 2 + -var14 - var17;
            int var21 = var17 + var20;
            if (var1.method1457(var18, var20, -1933314892) && var1.method1457(var19, var20, -1940258831) && var1.method1457(var18, var21, -1423315727) && var1.method1457(var19, var21, -1131709831)) {
               var15.method3137(var18 + var2, var20 + var3, var1.field2156, var2, var3);
            } else {
               double var22 = Math.atan2((double)var13, (double)var14);
               int var24 = Math.min(var0.field881 * -2093041337 / 2, var0.field887 * 457937409 / 2);
               var24 -= 6;
               int var25 = (int)(Math.sin(var22) * (double)var24);
               int var26 = (int)(Math.cos(var22) * (double)var24);
               class322.field842[var6].method3156((float)(-2093041337 * var0.field881) / 2.0F + (float)var2 + (float)var25, (float)var3 + (float)(var0.field887 * 457937409) / 2.0F - (float)var26, 4096, (int)(-var22 / 6.283185307179586D * 65535.0D));
            }
         }

      } catch (RuntimeException var27) {
         throw class158.method3445(var27, "ql.y(" + ')');
      }
   }
}
