import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class class452 {
   static Map field7212;
   public static long field7213 = 1000L;
   static HashMap field7214 = new HashMap();
   public static class180 field7215;
   public static class851 field7216;

   static {
      Calendar.getInstance(method3866("Europe/London", -1482930137));
   }

   public static String method3864(Date var0, String var1, int var2) {
      try {
         return method3865(var0, var1, method3867(455698199), class423.field9583, 791568674);
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "dt.a(" + ')');
      }
   }

   static String method3865(Date var0, String var1, TimeZone var2, class423 var3, int var4) {
      try {
         if (field7212 == null) {
            field7212 = new HashMap(6);
            class423[] var5 = class423.method5708(-515036392);

            for(int var6 = 0; var6 < var5.length; ++var6) {
               class423 var7 = var5[var6];
               field7212.put(var7, new ConcurrentLinkedQueue());
            }
         }

         ConcurrentLinkedQueue var9 = (ConcurrentLinkedQueue)field7212.get(var3);
         SimpleDateFormat var10 = (SimpleDateFormat)var9.poll();
         if (var10 == null) {
            var10 = new SimpleDateFormat(var1, var3.method5707(-734484116));
         } else {
            var10.applyPattern(var1);
         }

         var10.setTimeZone(var2);
         String var11 = var10.format(var0);
         var9.add(var10);
         return var11;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "dt.f(" + ')');
      }
   }

   static TimeZone method3866(String var0, int var1) {
      try {
         HashMap var2 = field7214;
         synchronized(field7214) {
            TimeZone var3 = (TimeZone)field7214.get(var0);
            if (var3 == null) {
               var3 = TimeZone.getTimeZone(var0);
               field7214.put(var0, var3);
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "dt.p(" + ')');
      }
   }

   static TimeZone method3867(int var0) {
      try {
         return method3866("Europe/London", -1697874218);
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "dt.b(" + ')');
      }
   }

   class452() throws Throwable {
      throw new Error();
   }

   public static void method3868(int var0) {
      try {
         class199.method3747(1137952217);
         class602.field8668 = null;
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "dt.ae(" + ')');
      }
   }

   static final void method3869(class744 var0, byte var1) {
      try {
         var0.field3156 -= 2;
         int var2 = var0.field3161[var0.field3156];
         int var3 = var0.field3161[1 + var0.field3156];
         class785 var4 = field7216.method5148(var3, 198575555);
         if (var4.method2380(1883696427)) {
            var0.field3157[++var0.field3158 - 1] = class58.field2342.method135(var2, 1811541401).method2024(var3, var4.field3823, (byte)-113);
         } else {
            var0.field3161[++var0.field3156 - 1] = class58.field2342.method135(var2, 685502248).method2022(var3, var4.field3822, (short)-22084);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "dt.abl(" + ')');
      }
   }
}
