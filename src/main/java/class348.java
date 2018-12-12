import java.awt.Container;
import java.io.IOException;

public abstract class class348 {
   static class357 field220;
   static int field221;

   public abstract int method174() throws IOException;

   public abstract boolean method175(int var1, byte var2) throws IOException;

   public abstract int method176(int var1) throws IOException;

   public abstract int method177(byte[] var1, int var2, int var3, byte var4) throws IOException;

   public abstract void method178();

   public abstract void method179(int var1);

   public abstract boolean method180(int var1) throws IOException;

   public abstract void method181(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method182();

   public abstract int method183(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method184(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method185(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method186(byte var1);

   public abstract void method187(byte[] var1, int var2, int var3, int var4) throws IOException;

   public abstract int method188(byte[] var1, int var2, int var3) throws IOException;

   static final void method189(class744 var0, int var1) {
      try {
         if (Client.field2924 * 1131012101 == 0) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -2;
         } else if (Client.field2924 * 1131012101 == 1) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = -1;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = Client.field2923 * -1054937867;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ng.vb(" + ')');
      }
   }

   static final void method190(class744 var0, byte var1) {
      try {
         var0.field3156 -= -1959403445;
         int var2 = var0.field3161[681479919 * var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156 * 681479919];
         int var4 = var0.field3161[var0.field3156 * 681479919 + 2];
         int var5 = var0.field3161[3 + 681479919 * var0.field3156];
         int var6 = var0.field3161[4 + var0.field3156 * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = (var3 - var2) * (var6 - var4) / (var5 - var4) + var2;
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "ng.yo(" + ')');
      }
   }

   static final void method191(class744 var0, int var1) {
      try {
         var0.field3156 -= -783761378;
         Client.field2910 = (short)var0.field3161[var0.field3156 * 681479919];
         if (Client.field2910 <= 0) {
            Client.field2910 = 256;
         }

         Client.field2911 = (short)var0.field3161[681479919 * var0.field3156 + 1];
         if (Client.field2911 <= 0) {
            Client.field2911 = 205;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ng.akb(" + ')');
      }
   }

   static void method192(int var0) {
      try {
         Client.field2697.method5288((byte)8);
         class410.method5637(1268026984);
         class830.method5375(true, -1663847334);
         class118.method1461((byte)27);
         System.gc();
         class593.field1623.method4831(2, 0);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ng.lk(" + ')');
      }
   }

   public static Container method193(byte var0) {
      try {
         if (class296.field10468 != null) {
            return class296.field10468;
         } else {
            return (Container)(class701.field3371 != null ? class701.field3371 : class833.field9178);
         }
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ng.t(" + ')');
      }
   }

   static final void method194(class564 var0, class131 var1, class744 var2, int var3) {
      try {
         var2.field3156 -= -1567522756;
         var0.field978 = -478399925 * var2.field3161[var2.field3156 * 681479919];
         var0.field878 = -1661995333 * var2.field3161[1 + 681479919 * var2.field3156];
         var0.field946 = 0;
         var0.field923 = 0;
         int var4 = var2.field3161[681479919 * var2.field3156 + 2];
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 > 4) {
            var4 = 4;
         }

         int var5 = var2.field3161[681479919 * var2.field3156 + 3];
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 4) {
            var5 = 4;
         }

         var0.field873 = (byte)var4;
         var0.field874 = (byte)var5;
         class814.method2932(var0, -903706483);
         class765.method2801(var1, var0, -1959938301);
         if (var0.field869 * -1215239439 == 0) {
            class948.method1938(var1, var0, false, 112223880);
         }

      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ng.ck(" + ')');
      }
   }
}
