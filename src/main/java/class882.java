import java.io.File;
import java.util.Date;
import java.util.Hashtable;

public class class882 {
   static File field10202;
   static boolean field10203 = false;
   static Hashtable field10204 = new Hashtable(16);

   class882() throws Throwable {
      throw new Error();
   }

   static final void method6192(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)40);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class645.method6158(var3, var4, var0, -721593745);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mq.ee(" + ')');
      }
   }

   static final void method6193(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         Widget var3 = class449.method3756(var2, (byte)99);
         WidgetContainer var4 = class382.widgetContainers[var2 >> 16];
         class75.method1118(var3, var4, true, 0, var0, 1313790889);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "mq.hj(" + ')');
      }
   }

   public static int method6194(int var0, int var1, int var2) {
      try {
         int var3 = var0 >>> 31;
         return (var0 + var3) / var1 - var3;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "mq.x(" + ')');
      }
   }

   public static class827 method6195(InputStream var0, int var1) {
      try {
         class827 var2 = class932.method6291(var0, -2147461076);
         int var3 = var0.method6420((byte)-87);
         int var4 = var0.method6420((byte)4);
         int var5 = var0.method6423(1235052657);
         return new class665(var2.field9028, var2.field9029, var2.field9033, var2.field9031, var2.field9032, var2.field9036, var2.field9034, var2.field9035, var2.field9030, var3, var4, var5);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "mq.i(" + ')');
      }
   }

   static String method6196(long var0) {
      try {
         return class452.method3864(new Date(var0), "EEE dd-MMM-yyyy HH:mm:ss zzz", -1799547908);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "mq.no(" + ')');
      }
   }
}
