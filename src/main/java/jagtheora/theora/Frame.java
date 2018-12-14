package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
    static {
        init();
    }

    public int a;
    public int f;
    public int[] pixels;

    public Frame(int var1, int var2) {
        this.a = var1;
        this.f = var2;
        this.pixels = new int[this.a * this.f];
    }

    private static native void init();

    protected native void clear();

    protected native void k();

    protected native void d();
}
