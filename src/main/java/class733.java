public class class733 {
   public class70 field2966;
   public int field2967;
   public class70 field2968;
   public class70 field2969;
   public class70 field2970;
   public class858 field2971;
   public class858 field2972;
   public class858 field2973;
   public int field2974;
   public boolean field2975;
   static class219 field2976;

   void method1779(class907 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               if (var2 <= -440872681) {
                  throw new IllegalStateException();
               }

               return;
            }

            if (1 == var3) {
               this.field2970 = class50.method1496(var1, (byte)-24);
            } else if (var3 == 2) {
               this.field2966 = class50.method1496(var1, (byte)2);
            } else if (3 == var3) {
               this.field2968 = class50.method1496(var1, (byte)-93);
            } else if (4 == var3) {
               this.field2969 = class50.method1496(var1, (byte)-56);
            } else if (var3 == 5) {
               this.field2973 = class619.method5183(var1, (byte)-80);
            } else if (var3 == 6) {
               this.field2971 = class619.method5183(var1, (byte)68);
            } else if (var3 == 7) {
               this.field2972 = class619.method5183(var1, (byte)9);
            } else if (8 == var3) {
               class50.method1496(var1, (byte)-104);
            } else if (var3 == 9) {
               class50.method1496(var1, (byte)-11);
            } else if (var3 == 10) {
               class50.method1496(var1, (byte)-108);
            } else if (11 == var3) {
               this.field2975 = true;
            } else if (var3 == 12) {
               this.field2967 = var1.method6420((byte)-25) * 1848816991;
            } else if (13 == var3) {
               this.field2974 = var1.method6420((byte)-10) * 1126272039;
            }
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pv.a(" + ')');
      }
   }

   public class733(class180 var1) {
      byte[] var2 = var1.method3264(class590.field1583.field1585 * -363169051, (byte)29);
      this.method1779(new class907(var2), 1436577561);
   }

   public static int[][] method1780(int var0, int var1, int var2, int var3, int var4, int var5, float var6, boolean var7, byte var8) {
      try {
         int[][] var9 = new int[var1][var0];
         class172 var10 = new class172();
         var10.field4985 = var7;
         var10.field4983 = var3 * 1143174821;
         var10.field4982 = var4 * 2124139087;
         var10.field4984 = var5 * -1820512295;
         var10.field4981 = (int)(var6 * 4096.0F) * 52875281;
         var10.method205(-786844466);
         class322.method815(var0, var1, (byte)24);

         for(int var11 = 0; var11 < var1; ++var11) {
            var10.method3022(var11, var9[var11], -1995149862);
         }

         return var9;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "pv.be(" + ')');
      }
   }
}
