package jagtheora.misc;

public abstract class SimplePeer {
    static {
        init();
    }

    private long peer;

    private static native void init();

    public final boolean a() {
        return this.peer == 0L;
    }

    private final void setPeer(long var1) {
        this.peer = var1;
    }

    public final void f() {
        if (!this.a()) {
            this.clear();
        }

    }

    protected abstract void clear();

    protected void finalize() throws Throwable {
        if (!this.a()) {
            this.f();
        }

        super.finalize();
    }

    protected abstract void k();

    protected abstract void d();
}
