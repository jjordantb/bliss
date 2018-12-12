package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {
   public OggStreamState(int var1) {
      if (!this.init(var1)) {
         throw new IllegalStateException();
      }
   }

   private native boolean init(int var1);

   public native boolean isEOS();

   public native boolean pageIn(OggPage var1);

   public native int packetOut(OggPacket var1);

   public native int packetOut();

   public native int packetPeek(OggPacket var1);

   public native int packetPeek();

   public native boolean resetSerialNo(int var1);

   public native boolean reset();

   protected native void clear();

   protected native void k();

   protected native void d();
}
