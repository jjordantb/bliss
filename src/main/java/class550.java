import java.util.LinkedList;
import java.util.Queue;

public class class550 extends class14 {
   Queue field509 = new LinkedList();

   void method3582(byte var1) {
      try {
         class105 var2 = (class105)this.field509.poll();
         if (var2 != null) {
            class701 var3 = class637.method5936(class643.field9943, Client.field2692.field7765, (byte)24);
            var3.field3364.method6364(var2.method6667((byte)-44) | var2.method6680(-1824201705) << 16, 126259689);
            var3.field3364.method6400(this.method3579(var2, 65535, (byte)33));
            var3.field3364.method6394(var2.method196((byte)113) << 1 | var2.method195((byte)-17) & 1, 2075950579);
            Client.field2692.method4380(var3, (byte)-50);
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
         return class637.method5936(class643.field9996, Client.field2692.field7765, (byte)31);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.x(" + ')');
      }
   }

   boolean method3583(int var1) {
      try {
         return !this.field509.isEmpty() || this.field6690 * 8383148474145196457L < class27.method3468((byte)1) - 2000L;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.u(" + ')');
      }
   }

   void method437(class907 var1, class105 var2, int var3) {
      try {
         var1.method6361(var2.method195((byte)-71));
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adt.as(" + ')');
      }
   }

   void method3586() {
      class105 var1 = (class105)this.field509.poll();
      if (var1 != null) {
         class701 var2 = class637.method5936(class643.field9943, Client.field2692.field7765, (byte)10);
         var2.field3364.method6364(var1.method6667((byte)-64) | var1.method6680(-1366988076) << 16, -1149175207);
         var2.field3364.method6400(this.method3579(var1, 65535, (byte)100));
         var2.field3364.method6394(var1.method196((byte)32) << 1 | var1.method195((byte)-124) & 1, 1797403189);
         Client.field2692.method4380(var2, (byte)-27);
         var1.method6670(1518067003);
      }

   }

   class701 method3589() {
      return class637.method5936(class643.field9996, Client.field2692.field7765, (byte)45);
   }

   int method3592() {
      return 1;
   }

   void method3585() {
      class105 var1 = (class105)this.field509.poll();
      if (var1 != null) {
         class701 var2 = class637.method5936(class643.field9943, Client.field2692.field7765, (byte)51);
         var2.field3364.method6364(var1.method6667((byte)-14) | var1.method6680(-1950900559) << 16, -582997683);
         var2.field3364.method6400(this.method3579(var1, 65535, (byte)125));
         var2.field3364.method6394(var1.method196((byte)37) << 1 | var1.method195((byte)-48) & 1, 1887595218);
         Client.field2692.method4380(var2, (byte)-104);
         var1.method6670(1749258704);
      }

   }

   void method3581(class907 var1, class284 var2, byte var3) {
      try {
         this.method437(var1, (class105)var2, -1392580670);
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "adt.k(" + ')');
      }
   }

   int method3580(int var1) {
      return 1;
   }

   boolean method3587() {
      return !this.field509.isEmpty() || this.field6690 * 8383148474145196457L < class27.method3468((byte)1) - 2000L;
   }

   boolean method3598() {
      return !this.field509.isEmpty() || this.field6690 * 8383148474145196457L < class27.method3468((byte)1) - 2000L;
   }

   boolean method3588() {
      return !this.field509.isEmpty() || this.field6690 * 8383148474145196457L < class27.method3468((byte)1) - 2000L;
   }

   void method3596(class907 var1, class284 var2) {
      this.method437(var1, (class105)var2, -1850528986);
   }

   class701 method3595() {
      return class637.method5936(class643.field9996, Client.field2692.field7765, (byte)58);
   }

   int method3599() {
      return 1;
   }

   void method3577() {
      class105 var1 = (class105)this.field509.poll();
      if (var1 != null) {
         class701 var2 = class637.method5936(class643.field9943, Client.field2692.field7765, (byte)30);
         var2.field3364.method6364(var1.method6667((byte)14) | var1.method6680(-1929012233) << 16, -836695878);
         var2.field3364.method6400(this.method3579(var1, 65535, (byte)100));
         var2.field3364.method6394(var1.method196((byte)83) << 1 | var1.method195((byte)-60) & 1, 1757564259);
         Client.field2692.method4380(var2, (byte)-126);
         var1.method6670(-718347820);
      }

   }

   int method3593() {
      return 1;
   }

   void method3591(class907 var1, class284 var2) {
      this.method437(var1, (class105)var2, -1691760036);
   }

   void method3594(class907 var1, class284 var2) {
      this.method437(var1, (class105)var2, -710116883);
   }

   void method3576(class907 var1, class284 var2) {
      this.method437(var1, (class105)var2, -2014256695);
   }

   static final void method438(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         if (class776.field3731 != null && var2 < -1801543887 * class556.field503 && class776.field3731[var2].field8115.equalsIgnoreCase(class923.field10295.field3374)) {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 1;
         } else {
            var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = 0;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adt.wa(" + ')');
      }
   }
}
