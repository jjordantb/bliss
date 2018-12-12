import java.util.Iterator;
import java.util.LinkedList;

public class class669 {
   int field7390;
   int[] field7391;
   int field7392;
   int[] field7393;
   static int field7394 = 0;
   LinkedList field7395;
   public static class337 field7396;

   public class669(class848 var1, InputStream var2, int var3) {
      this.field7392 = var3;
      this.field7390 = var2.method6422(590991010);
      this.field7391 = new int[this.field7390];
      this.field7393 = new int[this.field7390];
      int var4 = var2.method6374();
      int var5 = var2.method6374();

      for(int var6 = 0; var6 < this.field7390; ++var6) {
         this.field7391[var6] = var4 + var2.method6372(-12558881);
         this.field7393[var6] = var5 + var2.method6372(-12558881);
      }

      this.method4118(var1, 1723870683);
   }

   public void method4115(class545 var1, int var2) {
      try {
         if (var1 != null && this.field7390 > 0) {
            this.method4117(var1, 1331512364);
            Iterator var3 = this.field7395.iterator();

            while(var3.hasNext()) {
               class156 var4 = (class156)var3.next();
               var1.method2416(var4, false, (byte)0);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ml.f(" + ')');
      }
   }

   public void method4116(class545 var1, int var2) {
      try {
         if (var1 != null && this.field7395 != null) {
            Iterator var3 = this.field7395.iterator();

            while(var3.hasNext()) {
               class156 var4 = (class156)var3.next();
               var1.method2422(var4.field3639, var4.field8299, var4.field8296, new class738(var4), (short)-25645);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ml.b(" + ')');
      }
   }

   void method4117(class545 var1, int var2) {
      try {
         this.field7395 = new LinkedList();
         class153 var3 = class730.field2697.method5296(1102233653);
         class389 var4 = class730.field2697.method5270(681479919);
         class389 var5 = new class389(class899.field9552, this.field7391[0], this.field7393[0]);

         for(int var6 = 1; var6 < this.field7390; ++var6) {
            class389 var7 = new class389(class899.field9552, this.field7391[var6], this.field7393[var6]);

            while(var5.field1521 != var7.field1521 || var7.field1522 != var5.field1522) {
               if (var5.field1521 < var7.field1521) {
                  ++var5.field1521;
               } else if (var5.field1521 > var7.field1521) {
                  --var5.field1521;
               }

               if (var5.field1522 < var7.field1522) {
                  ++var5.field1522;
               } else if (var5.field1522 > var7.field1522) {
                  --var5.field1522;
               }

               int var8 = class899.field9552;
               int var9 = var5.field1521 - var4.field1521;
               int var10 = var5.field1522 - var4.field1522;
               if (var9 >= 0 && var9 < var1.field3859 && var10 >= 0 && var10 < var1.field3894) {
                  int var11 = 256 + (var9 << 9);
                  int var12 = (var10 << 9) + 256;
                  if (var3.method3386(var9, var10, 1621681169)) {
                     ++var8;
                  }

                  this.field7395.add(new class156(var1, this, class899.field9552, var8, var11, class679.method4271(var11, var12, class899.field9552, -969266952), var12));
               }
            }

            var5 = var7;
         }

      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "ml.p(" + ')');
      }
   }

   class879 method4118(class848 var1, int var2) {
      try {
         class25 var3 = class25.method3454(class389.field1524, this.field7392, 0);
         if (var3 == null) {
            return null;
         } else {
            if (var3.field6462 < 13) {
               var3.method3458(2);
            }

            return var1.method4861(var3, 2048, field7394, 64, 768);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ml.a(" + ')');
      }
   }

   public static class77[] method4119(int var0) {
      try {
         return new class77[]{class77.field1511, class77.field1508, class77.field1514, class77.field1507, class77.field1506, class77.field1513, class77.field1512, class77.field1509};
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ml.a(" + ')');
      }
   }

   static final void method4120(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class564 var3 = class449.method3756(var2, (byte)16);
         class131 var4 = class382.field1410[var2 >> 16];
         class175.method3050(var3, var4, var0, -1468199503);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ml.jt(" + ')');
      }
   }

   public static boolean method4121(int var0, int var1) {
      try {
         return 14 == var0 || 15 == var0 || var0 == 18 || var0 == 16;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ml.fv(" + ')');
      }
   }
}
