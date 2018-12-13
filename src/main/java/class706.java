import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class706 extends Node {
   public byte[] field3275;

   public class706(byte[] var1) {
      this.field3275 = var1;
   }

   static final void method1934(class744 var0, int var1) {
      try {
         var0.field3151[var0.field3174[var0.field3176]] = var0.field3157[--var0.field3158];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "abm.af(" + ')');
      }
   }

   public static final void method1935(byte var0) {
      try {
         if (1 != class881.field10168) {
            class881.field10177.method4374((byte)40);
            class725.method1748(-20644488);
            class978.method1845(1976641602);
         }

      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "abm.i(" + ')');
      }
   }

   static String method1936(Throwable var0, byte var1) throws IOException {
      try {
         String var3;
         if (var0 instanceof class862) {
            class862 var2 = (class862)var0;
            var3 = var2.field8935 + " | ";
            var0 = var2.field8936;
         } else {
            var3 = "";
         }

         StringWriter var14 = new StringWriter();
         PrintWriter var4 = new PrintWriter(var14);
         var0.printStackTrace(var4);
         var4.close();
         String var5 = var14.toString();
         BufferedReader var6 = new BufferedReader(new StringReader(var5));
         String var7 = var6.readLine();

         while(true) {
            String var8 = var6.readLine();
            if (var8 == null) {
               if (var1 != 10) {
                  throw new IllegalStateException();
               }

               var3 = var3 + "| " + var7;
               return var3;
            }

            int var9 = var8.indexOf(40);
            int var10 = var8.indexOf(41, var9 + 1);
            String var11;
            if (-1 != var9) {
               var11 = var8.substring(0, var9);
            } else {
               var11 = var8;
            }

            var11 = var11.trim();
            var11 = var11.substring(var11.lastIndexOf(32) + 1);
            var11 = var11.substring(var11.lastIndexOf(9) + 1);
            var3 = var3 + var11;
            if (var9 != -1 && -1 != var10) {
               int var12 = var8.indexOf(".java:", var9);
               if (var12 >= 0) {
                  var3 = var3 + var8.substring(5 + var12, var10);
               }
            }

            var3 = var3 + ' ';
         }
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "abm.b(" + ')');
      }
   }
}
