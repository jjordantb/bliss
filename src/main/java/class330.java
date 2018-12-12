import java.net.InetAddress;
import java.net.UnknownHostException;

public class class330 implements Runnable {
   volatile String field112;
   InetAddress field113;

   public String method95(int var1) {
      try {
         return this.field112;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "y.a(" + ')');
      }
   }

   class330(int var1) throws UnknownHostException {
      this.field113 = InetAddress.getByAddress(new byte[]{(byte)(var1 >> 24 & 255), (byte)(var1 >> 16 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 & 255)});
   }

   public void run() {
      try {
         this.field112 = this.field113.getHostName();
      } catch (RuntimeException var2) {
         throw class158.method3445(var2, "y.run(" + ')');
      }
   }

   static final int method96(int var0, int var1, int var2, int var3) {
      try {
         int var4 = var0 / var2;
         int var5 = var0 & var2 - 1;
         int var6 = var1 / var2;
         int var7 = var1 & var2 - 1;
         int var8 = class364.method1614(var4, var6, (short)-9483);
         int var9 = class364.method1614(1 + var4, var6, (short)-29113);
         int var10 = class364.method1614(var4, var6 + 1, (short)-24319);
         int var11 = class364.method1614(var4 + 1, 1 + var6, (short)-3168);
         int var12 = class326.method544(var8, var9, var5, var2, (byte)105);
         int var13 = class326.method544(var10, var11, var5, var2, (byte)123);
         return class326.method544(var12, var13, var7, var2, (byte)78);
      } catch (RuntimeException var14) {
         throw class158.method3445(var14, "y.w(" + ')');
      }
   }
}
