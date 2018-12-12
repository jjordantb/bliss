import java.util.LinkedList;
import java.util.Queue;

public class class550 extends class14 {
   Queue field509 = new LinkedList();

   void method3582(byte var1) {
      try {
         class105 var2 = (class105)this.field509.poll();
         if (var2 != null) {
            class701 var3 = class637.method5936(class643.field9943, class730.field2692.field7765, (byte)24);
            var3.field3364.method6364(var2.method6667((byte)-44) | var2.method6680(-1824201705) << 16, 126259689);
            var3.field3364.method6400(this.method3579(var2, 65535, (byte)33));
            var3.field3364.method6394(var2.method196((byte)113) << 1 | var2.method195((byte)-17) & 1, 2075950579);
            class730.field2692.method4380(var3, (byte)-50);
            var2.method6670(29456166);
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adt.d(" + ')');
      }
   }

   void method436(class105 var1, byte var2) {
      try {
         this.field509.add(var1);
         if (this.field509.size() > 10) {
            this.field509.poll();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "adt.az(" + ')');
      }
   }

   class701 method3597(byte var1) {
      try {
         return class637.method5936(class643.field9996, class730.field2692.field7765, (byte)31);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.x(" + ')');
      }
   }

   boolean method3583(int var1) {
      try {
         return !this.field509.isEmpty() || super.field6690 < class27.method3468((byte)1) - 2000L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.u(" + ')');
      }
   }

   void method437(InputStream var1, class105 var2, int var3) {
      try {
         var1.method6361(var2.method195((byte)-71));
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adt.as(" + ')');
      }
   }

   void method3581(InputStream var1, class284 var2, byte var3) {
      try {
         this.method437(var1, (class105)var2, -1392580670);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adt.k(" + ')');
      }
   }

   int method3580(int var1) {
      return 1;
   }

   static final void method438(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         if (class776.field3731 != null && var2 < class556.field503 && class776.field3731[var2].field8115.equalsIgnoreCase(class923.local.field3374)) {
            var0.field3161[++var0.field3156 - 1] = 1;
         } else {
            var0.field3161[++var0.field3156 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.wa(" + ')');
      }
   }
}
