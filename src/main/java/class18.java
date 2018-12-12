public class class18 {
   static byte[][] field6926 = new byte[250][];
   static int field6927 = 0;
   static int field6928 = 0;
   static int field6929 = 0;
   public static int[] field6930;
   static byte[][] field6931 = new byte[1000][];
   static byte[][] field6932 = new byte[50][];
   static class48[] field6933;

   public static synchronized byte[] method3686(int var0, short var1) {
      try {
         byte[] var5;
         if (100 == var0 && field6929 * 355907107 > 0) {
            var5 = field6931[(field6929 -= -996497013) * 355907107];
            field6931[field6929 * 355907107] = null;
            return var5;
         } else if (var0 == 5000 && 1904890379 * field6927 > 0) {
            var5 = field6926[(field6927 -= -1583470173) * 1904890379];
            field6926[1904890379 * field6927] = null;
            return var5;
         } else if (var0 == 30000 && field6928 * -1426745913 > 0) {
            var5 = field6932[(field6928 -= 1975229431) * -1426745913];
            field6932[field6928 * -1426745913] = null;
            return var5;
         } else {
            if (class681.field7538 != null) {
               for(int var2 = 0; var2 < class128.field2348.length; ++var2) {
                  if (class128.field2348[var2] == var0 && field6930[var2] > 0) {
                     byte[] var3 = class681.field7538[var2][--field6930[var2]];
                     class681.field7538[var2][field6930[var2]] = null;
                     return var3;
                  }
               }
            }

            return new byte[var0];
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "rg.a(" + ')');
      }
   }

   class18() throws Throwable {
      throw new Error();
   }

   public static int method3687(int var0, byte var1) {
      try {
         --var0;
         var0 |= var0 >>> 1;
         var0 |= var0 >>> 2;
         var0 |= var0 >>> 4;
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return 1 + var0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "rg.p(" + ')');
      }
   }

   static final void method3688(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class255.method4495(var3, var4, var0, (byte)119);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "rg.ou(" + ')');
      }
   }
}
