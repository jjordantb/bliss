import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class class571 extends Node {
   OggStreamState field37;
   int field38;

   void method22(OggPacket var1, int var2) {
      try {
         this.method23(var1, -441826665);
         ++this.field38;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "abi.a(" + ')');
      }
   }

   abstract void method23(OggPacket var1, int var2);

   abstract void method24(int var1);

   class571(OggStreamState var1) {
      this.field37 = var1;
   }

   public static void method29(class180 var0, class180 var1, class180 var2, class180 var3, int var4) {
      try {
         class91.field562 = var0;
         class947.field3314 = var1;
         class84.field1126 = var2;
         class382.widgetContainers = new WidgetContainer[class91.field562.method3266(1202427542)];
         class866.field9767 = new boolean[class91.field562.method3266(1827823316)];
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "abi.a(" + ')');
      }
   }
}
