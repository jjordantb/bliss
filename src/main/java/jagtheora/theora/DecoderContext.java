package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer {
    public DecoderContext(TheoraInfo var1, SetupInfo var2) {
        this.init(var1, var2);
        if (this.a()) {
            throw new IllegalArgumentException("");
        }
    }

    private native void init(TheoraInfo var1, SetupInfo var2);

    public native int decodePacketIn(OggPacket var1, GranulePos var2);

    public native int decodeFrame(Frame var1);

    public native long granuleFrame(GranulePos var1);

    public native double granuleTime(GranulePos var1);

    public native int getMaxPostProcessingLevel();

    public native int setPostProcessingLevel(int var1);

    public native int setGranulePosition(long var1);

    protected native void clear();

    protected native void k();

    protected native void d();
}
