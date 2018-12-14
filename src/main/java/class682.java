public class class682 extends class345 {
    static class514 field7684 = new class514();
    static int field7689 = 2;
    static int field7690 = 3;
    static int field7691 = 4;
    static int field7692 = 5;
    static int field7693 = 11;
    static int field7694 = 7;
    static int field7695 = 8;
    static int field7696 = 10;
    static int field7697 = 1;
    static NodeTable field7698 = new NodeTable(16);
    static int field7699 = 12;
    static int field7700 = 13;
    static int field7701 = 14;
    static int field7702 = 20;
    static int field7703 = 16;
    static int field7704 = 9;
    static int field7705 = 18;
    static int field7706 = 19;
    static int field7707 = 15;
    static int field7708 = 21;
    static int field7709 = 22;
    static int field7710 = 6;
    static int field7711 = 17;
    static long field7712 = 500L;
    static long field7713 = Long.MAX_VALUE;
    static long field7714 = Long.MIN_VALUE;
    static class514 field7715 = new class514();
    int field7685;
    int field7686;
    int field7687;
    String field7688;

    class682(int var1, long var2) {
        super.field641 = (long) var1 << 56 | var2;
    }

    void method4336(int var1) {
        try {
            super.field209 = super.field209 & Long.MIN_VALUE | class27.resetTimer((byte) 1) + 500L;
            field7684.method2704(this, (byte) -90);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ais.bf(" + ')');
        }
    }

    int method4337(int var1) {
        try {
            return (int) (super.field641 >>> 56 & 255L);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ais.by(" + ')');
        }
    }

    long method4338(int var1) {
        try {
            return super.field641 & 72057594037927935L;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ais.bm(" + ')');
        }
    }

    long method4339(int var1) {
        try {
            return super.field209 & Long.MAX_VALUE;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ais.bc(" + ')');
        }
    }

    void method4340(byte var1) {
        try {
            super.field209 |= Long.MIN_VALUE;
            if (this.method4339(1430514987) == 0L) {
                field7715.method2704(this, (byte) -59);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ais.be(" + ')');
        }
    }
}
