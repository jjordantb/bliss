package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
    static {
        initFields();
    }

    public int channels;
    public int rate;

    public VorbisInfo() {
        this.init();
        if (this.a()) {
            throw new IllegalStateException();
        }
    }

    private static native void initFields();

    private native void init();

    public native int headerIn(VorbisComment var1, OggPacket var2);

    protected native void clear();

    protected native void k();

    protected native void d();
}
