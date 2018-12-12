public class class167 {
   public static int field6937 = 1;
   short[] field6938;
   public static int field6939 = 4;
   public static int field6940 = 8;
   public static int field6941 = 16;
   public static int field6942 = 2;
   byte field6943;
   short field6944;
   short field6945;
   byte field6946;
   short field6947;
   int[] field6948;
   int[] field6949;
   int[] field6950;
   short field6951;
   short[] field6952;
   short[] field6953;

   class167(class545 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      this.field6946 = (byte)var2;
      this.field6943 = (byte)var3;
      this.field6948 = new int[4];
      this.field6949 = new int[4];
      this.field6950 = new int[4];
      this.field6948[0] = var4;
      this.field6948[1] = var5;
      this.field6948[2] = var6;
      this.field6948[3] = var7;
      this.field6949[0] = var8;
      this.field6949[1] = var9;
      this.field6949[2] = var10;
      this.field6949[3] = var11;
      this.field6950[0] = var12;
      this.field6950[1] = var13;
      this.field6950[2] = var14;
      this.field6950[3] = var15;
      this.field6951 = (short)(var4 >> -1688804109 * var1.field3849);
      this.field6945 = (short)(var6 >> -1688804109 * var1.field3849);
      this.field6944 = (short)(var12 >> -1688804109 * var1.field3849);
      this.field6947 = (short)(var14 >> var1.field3849 * -1688804109);
      this.field6938 = new short[4];
      this.field6952 = new short[4];
      this.field6953 = new short[4];
   }

   static final void method3695(class744 var0, byte var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         class564 var3 = var2.field8255;
         class131 var4 = var2.field8254;
         class866.method5840(var3, var4, var0, 1592585834);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nr.kz(" + ')');
      }
   }

   static final void method3696(class744 var0, byte var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = Client.field2623 * -442628795;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nr.vd(" + ')');
      }
   }

   static final void method3697(class744 var0, byte var1) {
      try {
         var0.field3158 -= 1938723502;
         String var2 = (String)var0.field3157[var0.field3158 * -203050393];
         String var3 = (String)var0.field3157[-203050393 * var0.field3158 + 1];
         class935.method6311(var2, var3, 2101690439);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nr.agx(" + ')');
      }
   }

   static final void method3698(class744 var0, int var1) {
      try {
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = class615.field8903.field9136.method3693(-1938875884) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "nr.aot(" + ')');
      }
   }

   public static String method3699(String var0, int var1) {
      try {
         StringBuilder var2 = new StringBuilder();
         int var3 = var0.length();

         for(int var4 = 0; var4 < var3; ++var4) {
            char var5 = var0.charAt(var4);
            if ('%' == var5 && var3 > var4 + 2) {
               var5 = var0.charAt(var4 + 1);
               boolean var6 = false;
               int var7;
               if (var5 >= '0' && var5 <= '9') {
                  var7 = var5 - 48;
               } else if (var5 >= 'a' && var5 <= 'f') {
                  var7 = 10 + var5 - 97;
               } else {
                  if (var5 < 'A' || var5 > 'F') {
                     var2.append('%');
                     continue;
                  }

                  var7 = var5 + 10 - 65;
               }

               var7 *= 16;
               char var8 = var0.charAt(var4 + 2);
               if (var8 >= '0' && var8 <= '9') {
                  var7 += var8 - 48;
               } else if (var8 >= 'a' && var8 <= 'f') {
                  var7 += var8 + 10 - 97;
               } else {
                  if (var8 < 'A' || var8 > 'F') {
                     var2.append('%');
                     continue;
                  }

                  var7 += var8 + 10 - 65;
               }

               if (var7 != 0 && class517.method2720((byte)var7, (short)18002)) {
                  var2.append(class954.method2092((byte)var7, 2122534616));
               }

               var4 += 2;
            } else if (var5 == '+') {
               var2.append(' ');
            } else {
               var2.append(var5);
            }
         }

         return var2.toString();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nr.a(" + ')');
      }
   }

   static final void method3700(class744 var0, int var1) {
      try {
         class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
         if (-1309843523 * var2.field8255.field879 == -1) {
            if (var0.field3178) {
               throw new RuntimeException("");
            } else {
               throw new RuntimeException("");
            }
         } else {
            class564 var3 = var2.method4650(-2049654672);
            var3.field1017[-1309843523 * var2.field8255.field879] = null;
            class814.method2932(var3, 575626440);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "nr.bt(" + ')');
      }
   }
}
