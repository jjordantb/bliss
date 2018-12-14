package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
    public OggSyncState() {
        this.init();
        if (this.a()) {
            throw new IllegalStateException();
        }
    }

    private native void init();

    public native boolean write(byte[] var1, int var2);

    public native long pageSeek(OggPage var1);

    public native int pageOut(OggPage var1);

    public native boolean reset();

    protected native void clear();

    protected native void k();

    protected native void d();
}
