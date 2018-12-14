package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
    static {
        init();
    }

    public long position;

    private static native void init();

    protected native void clear();

    protected native void k();

    protected native void d();
}
