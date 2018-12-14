package jaclib.memory.heap;

public final class NativeHeap {
    long peer;
    private int a;
    private boolean f;

    public NativeHeap(int var1) {
        this.a = var1;
        this.allocateHeap(this.a);
        this.f = true;
    }

    synchronized boolean a() {
        return this.f;
    }

    public I f(int var1, boolean var2) {
        if (!this.f) {
            throw new IllegalStateException();
        } else {
            return new I(this, this.allocateBuffer(var1, var2), var1);
        }
    }

    public synchronized void b() {
        if (this.f) {
            this.deallocateHeap();
        }

        this.f = false;
    }

    private native void allocateHeap(int var1);

    private native void deallocateHeap();

    synchronized native int allocateBuffer(int var1, boolean var2);

    synchronized native long getBufferAddress(int var1);

    synchronized native void get(int var1, byte[] var2, int var3, int var4, int var5);

    synchronized native void put(int var1, byte[] var2, int var3, int var4, int var5);

    synchronized native void deallocateBuffer(int var1);

    public synchronized native void copy(long var1, long var3, int var5);

    protected void finalize() throws Throwable {
        super.finalize();
        this.b();
    }
}
