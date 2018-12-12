import java.io.File;

public class class593 {
   int field1605;
   public int field1606 = 255;
   public int field1607 = 8;
   public int field1608 = 0;
   public int field1609 = -1;
   static int field1610 = 1190717;
   public int field1611 = -1;
   public int field1612 = 512;
   public boolean field1613 = true;
   public boolean field1614 = true;
   public boolean field1615 = false;
   public int field1616 = 1190717;
   class509 field1617;
   public int field1618 = 64;
   public int field1619 = 63;
   public int field1620 = 0;
   public int field1621 = 64;
   public static class48 field1622;
   public static class848 field1623;
   public static class702[] field1624;

   void method1228(byte var1) {
      try {
         this.field1607 = this.field1607 << 8 | this.field1605;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pn.b(" + ')');
      }
   }

   void method1229(InputStream var1, int var2, short var3) {
      try {
         if (var2 == 1) {
            this.field1608 = class143.method1173(var1.method6390((byte)45), (byte)66);
         } else if (var2 == 2) {
            this.field1609 = var1.method6371();
         } else if (3 == var2) {
            this.field1609 = var1.method6374();
            if (this.field1609 == 65535) {
               this.field1609 = -1;
            }
         } else if (5 == var2) {
            this.field1614 = false;
         } else if (var2 == 7) {
            this.field1611 = class143.method1173(var1.method6390((byte)-44), (byte)71);
         } else if (var2 == 8) {
            this.field1617.field4020 = this.field1605;
         } else if (var2 == 9) {
            this.field1612 = var1.method6374() << 2;
         } else if (10 == var2) {
            this.field1613 = false;
         } else if (11 == var2) {
            this.field1607 = var1.method6371();
         } else if (var2 == 12) {
            this.field1615 = true;
         } else if (13 == var2) {
            this.field1616 = var1.method6390((byte)-32);
         } else if (var2 == 14) {
            this.field1618 = var1.method6371() << 2;
         } else if (16 == var2) {
            this.field1606 = var1.method6371();
         } else if (var2 == 20) {
            this.field1619 = var1.method6374();
         } else if (21 == var2) {
            this.field1620 = var1.method6371();
         } else if (22 == var2) {
            this.field1621 = var1.method6374();
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pn.f(" + ')');
      }
   }

   void method1230(InputStream var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method1229(var1, var3, (short)8128);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pn.a(" + ')');
      }
   }

   static final void method1231(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= 3;
         var0.field939 = var2.field3161[var2.field3156];
         var0.field849 = var2.field3161[var2.field3156 + 1];
         var0.field916 = var2.field3161[2 + var2.field3156];
         class814.method2932(var0, -260828169);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pn.ep(" + ')');
      }
   }

   static final void method1232(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (2 == class730.field2924 && var2 < class730.field2923) {
            var0.field3161[++var0.field3156 - 1] = class730.field2686[var2];
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pn.vw(" + ')');
      }
   }

   static final void method1233(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class506 var3 = class395.method3397(var2, -1477365564);
         int var4 = -1;
         if (var3 != null) {
            var4 = var3.field4121;
         }

         var0.field3161[++var0.field3156 - 1] = var4;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pn.acx(" + ')');
      }
   }

   static final void method1234(class744 var0, int var1) {
      try {
         boolean var2 = false;
         String var3 = "";
         if (var0.field3173 != null && var0.field3173.method1041(592860146)) {
            File var4 = var0.field3173.method1042((short)-10504);
            if (var4 != null) {
               var3 = var4.getPath();
               if (var3 == null) {
                  var3 = "";
               }
            }

            var2 = true;
            var0.field3173 = null;
         }

         var0.field3161[++var0.field3156 - 1] = var2 ? 1 : 0;
         var0.field3157[++var0.field3158 - 1] = var3;
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pn.agm(" + ')');
      }
   }

   static final void method1235(int var0) {
      try {
         class851.field8731.method2528((byte)89);
         class980.field3196.method4150(1757095308);
         class662.field9736.method5718(682089220);
         class730.field2697.method5283(134727545).method4712(1599239758);
         class258.field7913.method17(343664164);
         class85.field1121.method1578(75457779);
         class936.field10313.method2255(-927634718);
         class635.field9823.method1052(1855785885);
         class905.field10369.method5455(2005498704);
         class539.field3762.method5742((byte)80);
         class619.field8868.method1553(1240218712);
         class473.field8291.method5166(2116049963);
         class899.field9551.method3677((byte)119);
         class669.field7396.method74(242474592);
         class283.field10614.method3735((byte)-124);
         class981.field3274.method2006((byte)81);
         class333.field139.method5095(758365461);
         class452.field7216.method5145(2090718480);
         class490.field7866.method3408(-1350735214);
         class527.field3690.method6632(382411498);
         class229.field8212.method2657(122236875);
         class770.field3733.method2912((short)-15590);
         class339.field157.method1214(-1069278127);
         class151.method3371(-1852134831);
         class647.method5486(26517601);
         class785.field3827.method1858(-1647804880);
         class112.method1445(-962878443);
         class354.method1454((byte)-41);
         class730.field2761.method2979();
         class730.field2880.method2979();
         class730.field2678.method2979();
         class602.field8667.method2979();
         class384.field1426.method2979();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "pn.gb(" + ')');
      }
   }

   static final void method1236(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         int var3 = class730.field2902[var2].method6657(-574288948);
         var0.field3161[++var0.field3156 - 1] = 1 == var3 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pn.yz(" + ')');
      }
   }
}
