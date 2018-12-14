package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
    public DSPState(VorbisInfo var1) {
        this.init(var1);
        if (this.a()) {
            throw new IllegalStateException();
        }
    }

    private native void init(VorbisInfo var1);

    public native void blockIn(VorbisBlock var1);

    public native float[][] pcmOut(int var1);

    public native void read(int var1);

    public native double granuleTime();

    protected native void clear();

    protected native void k();

    protected native void d();
}
