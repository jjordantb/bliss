public class class842 extends class304 {
   int field9211;
   int field9212;
   static class621 field9213;
   int field9214;
   int field9215;
   int field9216;

   public void method2383(int var1) {
      try {
         class949.field3322[this.field9211].method6639(this.field9212, this.field9216, this.field9214, this.field9215, -1330038095);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "xy.f(" + ')');
      }
   }

   class842(InputStream var1) {
      super(var1);
      this.field9211 = var1.method6374();
      int var2 = var1.method6420((byte)125);
      this.field9212 = var2 >>> 16;
      this.field9216 = var2 & '\uffff';
      this.field9214 = var1.method6371();
      this.field9215 = var1.method6422(590991010);
   }

   public static void method5468(String var0, int var1) {
      try {
         if (class730.field2817 && (Node.field645 & 24) != 0) {
            boolean var2 = false;
            int var3 = class498.field8102;
            int[] var4 = class498.field8108;

            for(int var5 = 0; var5 < var3; ++var5) {
               Player var6 = class730.loaded[var4[var5]];
               if (var6.field3374 != null && var6.field3374.equalsIgnoreCase(var0) && (var6 == class923.local && (Node.field645 & 16) != 0 || (Node.field645 & 8) != 0)) {
                  class701 var7 = class637.method5936(class643.field10035, class730.field2692.field7765, (byte)25);
                  var7.field3364.method6362(class730.field2888, 16711935);
                  var7.field3364.method6362(var4[var5], 16711935);
                  var7.field3364.method6408(class543.field3820);
                  var7.field3364.method6400(class730.field2818);
                  var7.field3364.method6415(0, (byte)1);
                  class730.field2692.method4380(var7, (byte)-11);
                  int var8 = var6.method2550();
                  class133.method998(var6.field4085[0], var6.field4055[0], true, class191.method3721(var6.field4085[0], var6.field4055[0], var8, var8, 0, (byte)-117), -263181253);
                  var2 = true;
                  break;
               }
            }

            if (!var2) {
               class727.method1683(4, class814.field4727.method2927(class321.field1066, -875414210) + var0, (byte)-81);
            }

            if (class730.field2817) {
               class422.method5724((byte)4);
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "xy.kf(" + ')');
      }
   }
}
