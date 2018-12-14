import jaclib.memory.Z;
import jaclib.memory.heap.I;
import jaggl.OpenGL;

public abstract class class666 implements class943 {
    static int field9614 = 34963;
    static int field9621 = 34962;
    static int[] field9622 = new int[1];
    I field9613;
    class608 field9615;
    int field9616;
    int field9617;
    int field9618 = -1;
    boolean field9619;
    int field9620;

    class666(class608 var1, int var2, boolean var3) {
        this.field9615 = var1;
        this.field9616 = var2;
        this.field9619 = var3;
    }

    void method5733() {
        if (this.field9618 < 0) {
            if (this.field9615.field8611) {
                OpenGL.glGenBuffersARB(1, field9622, 0);
                this.field9618 = field9622[0];
                OpenGL.glBindBufferARB(this.field9616, this.field9618);
            } else {
                this.field9618 = 0;
            }
        }

    }

    long method5734() {
        return this.field9618 == 0 ? this.field9613.f() : 0L;
    }

    void method5735(int var1) {
        if (var1 > this.field9620) {
            this.method5733();
            if (this.field9618 > 0) {
                OpenGL.glBindBufferARB(this.field9616, this.field9618);
                OpenGL.glBufferDataARBub(this.field9616, var1, (byte[]) null, 0, this.field9619 ? '裠' : '裤');
                this.field9615.field668 += var1 - this.field9620;
            } else {
                this.field9613 = this.field9615.method776(var1, false);
            }

            this.field9620 = var1;
        }

        this.field9617 = var1;
    }

    public int method1974() {
        return this.field9617;
    }

    public long method1976(int var1, int var2) {
        OpenGL.glBindBufferARB(this.field9616, this.field9618);
        return OpenGL.glMapBufferARB(this.field9616, 35001) + (long) var1;
    }

    public void method1983() {
        OpenGL.glUnmapBufferARB(this.field9616);
    }

    public boolean method1977(int var1, int var2, long var3) {
        this.method5733();
        if (this.field9618 > 0) {
            OpenGL.glBindBufferARB(this.field9616, this.field9618);
            OpenGL.glBufferSubDataARBa(this.field9616, var1, var2, var3);
        } else {
            this.field9613.f.copy(this.field9613.f() + (long) var1, var3, var2);
        }

        return true;
    }

    void method5736() {
        if (this.field9615.field8611) {
            OpenGL.glBindBufferARB(this.field9616, this.field9618);
        }

    }

    boolean method5737(int var1, Z var2) {
        if (var1 > this.field9620) {
            this.method5733();
            if (this.field9618 > 0) {
                OpenGL.glBindBufferARB(this.field9616, this.field9618);
                OpenGL.glBufferDataARBa(this.field9616, var1, var2.f(), this.field9619 ? '裠' : '裤');
                this.field9615.field668 += var1 - this.field9617;
            } else {
                this.field9613 = this.field9615.method776(var1, false);
                this.field9613.z(var2);
            }

            this.field9620 = var1;
        } else if (this.field9618 > 0) {
            OpenGL.glBindBufferARB(this.field9616, this.field9618);
            OpenGL.glBufferSubDataARBa(this.field9616, 0, this.field9617, var2.f());
            this.field9615.field668 += var1 - this.field9617;
        } else {
            this.field9613 = this.field9615.method776(var1, false);
            this.field9613.z(var2);
        }

        this.field9617 = var1;
        return true;
    }

    void method5738() {
        if (this.field9618 > 0) {
            this.field9615.method5080(this.field9618, this.field9617);
            this.field9618 = -1;
        }

    }
}
