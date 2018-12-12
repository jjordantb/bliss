package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {
   public native int decodeHeader(TheoraInfo var1, TheoraComment var2, OggPacket var3);

   protected native void clear();

   protected native void k();

   protected native void d();
}
