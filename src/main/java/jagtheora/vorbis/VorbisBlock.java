package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
    public VorbisBlock(DSPState var1) {
        this.init(var1);
        if (this.a()) {
            throw new IllegalStateException();
        }
    }

    private native void init(DSPState var1);

    public native int synthesis(OggPacket var1);

    protected native void clear();

    protected native void k();

    protected native void d();
}
