public class class104 implements class813 {
   int field167;
   int field168;
   int[] field169;
   public static int field170;

   public int method2343() {
      try {
         return this.field167;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ay.a(" + ')');
      }
   }

   public int method2344() {
      try {
         return this.field168;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "ay.f(" + ')');
      }
   }

   public void method2755() {
   }

   class104(int var1, int var2, int[] var3) {
      this.field167 = var1;
      this.field168 = var2;
      this.field169 = var3;
   }

   static final void method145(class744 var0, int var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         class113.method1409(var2, (short)-2610);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ay.sk(" + ')');
      }
   }

   public static String method146(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && '-' != var5 && var5 != '*' && var5 != '_') {
               if (' ' == var5) {
                  var3.append('+');
               } else {
                  byte var6 = class84.method940(var5, 1088430238);
                  var3.append('%');
                  int var7 = var6 >> 4 & 15;
                  if (var7 >= 10) {
                     var3.append((char)(55 + var7));
                  } else {
                     var3.append((char)(48 + var7));
                  }

                  var7 = var6 & 15;
                  if (var7 >= 10) {
                     var3.append((char)(55 + var7));
                  } else {
                     var3.append((char)(48 + var7));
                  }
               }
            } else {
               var3.append(var5);
            }
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ay.f(" + ')');
      }
   }

   public static class827 method147(InputStream var0, int var1) {
      try {
         class710 var2 = (class710)class335.method39(var0, (byte)-97);
         int var3 = var0.method6367(1551160069);
         return new class343(var2.field9028, var2.field9029, var2.field9033, var2.field9031, var2.field9032, var2.field9036, var2.field9034, var2.field9035, var2.field9030, var2.field3453, var2.field3452, var2.field3456, var2.field3454, var2.field3455, var2.field3451, var3);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ay.q(" + ')');
      }
   }
}
