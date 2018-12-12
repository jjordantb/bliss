public class class216 extends class381 {
   static int field7200 = 4096;
   static int field7201 = 12;

   class216() throws Throwable {
      throw new Error();
   }

   static final void method3827(class744 var0, int var1) {
      try {
         var0.field3156 -= -1567522756;
         Client.field2821 = (short)var0.field3161[681479919 * var0.field3156];
         if (Client.field2821 <= 0) {
            Client.field2821 = 1;
         }

         Client.field2724 = (short)var0.field3161[1 + 681479919 * var0.field3156];
         if (Client.field2724 <= 0) {
            Client.field2724 = 32767;
         } else if (Client.field2724 < Client.field2821) {
            Client.field2724 = Client.field2821;
         }

         Client.field2916 = (short)var0.field3161[681479919 * var0.field3156 + 2];
         if (Client.field2916 <= 0) {
            Client.field2916 = 1;
         }

         Client.field2917 = (short)var0.field3161[3 + 681479919 * var0.field3156];
         if (Client.field2917 <= 0) {
            Client.field2917 = 32767;
         } else if (Client.field2917 < Client.field2916) {
            Client.field2917 = Client.field2916;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "adr.aki(" + ')');
      }
   }
}
