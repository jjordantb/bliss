package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
    public VorbisComment() {
        this.init();
        if (this.a()) {
            throw new IllegalStateException();
        }
    }

    private native void init();

    protected native void clear();

    protected native void k();

    protected native void d();
}
