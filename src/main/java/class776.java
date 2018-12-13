import java.util.Arrays;

public class class776 extends class304 {
   int field3723;
   int field3724;
   int field3725;
   int[] field3726;
   static int field3727;
   static class431 field3728;
   public static class180 field3729;
   static String field3730;
   public static class255[] field3731;

   public void method2383(int var1) {
      try {
         Actor var2 = class949.field3322[this.field3725].method6636(1714980357);
         if (this.field3723 == 0) {
            class488.method4740(var2, this.field3726, 0, false, (byte)11);
         } else {
            class711.method2025(var2, new int[]{this.field3724}, new int[1], new int[]{this.field3723}, 1644064563);
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xm.f(" + ')');
      }
   }

   boolean method2387(int var1) {
      try {
         Animation var2 = class936.field10313.method2256(this.field3724, (byte)111);
         return var2.method3561(1778758091);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xm.p(" + ')');
      }
   }

   class776(InputStream var1) {
      super(var1);
      this.field3725 = var1.method6374();
      this.field3726 = new int[class458.method3829((byte)-63).length];
      this.field3724 = var1.method6423(1235052657);
      Arrays.fill(this.field3726, 0, this.field3726.length, this.field3724);
      this.field3723 = var1.method6420((byte)72);
   }

   public static class701 method2295(int var0) {
      try {
         class701 var1 = class339.method136((byte)-12);
         var1.field3369 = null;
         var1.field3365 = 0;
         var1.field3364 = new class513(5000);
         return var1;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "xm.b(" + ')');
      }
   }

   public static int method2296(int var0, int var1, boolean var2, int var3) {
      try {
         ItemNode var4 = class213.method3812(var0, var2, 692761742);
         if (var4 == null) {
            return -1;
         } else {
            return var1 >= 0 && var1 < var4.itemIds.length ? var4.itemIds[var1] : -1;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "xm.a(" + ')');
      }
   }

   static final void method2297(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         var0.field3161[++var0.field3156 - 1] = var2 | 1 << var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "xm.yj(" + ')');
      }
   }

   static final void method2298(String var0, byte var1) {
      try {
         System.out.println("Error: " + class829.method5360(var0, "%0a", "\n", -2025331206));
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xm.p(" + ')');
      }
   }
}
