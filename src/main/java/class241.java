public class class241 {
    static int field8372 = 2;
    static int field8373 = 4;
    static int field8374 = 1;
    static int field8377 = 8;
    public int[] field8371 = new int[2];
    public int[] field8375 = new int[3];
    public int[] field8376 = new int[3];
    public int[] field8378 = new int[2];
    public short[] field8379;
    public short[] field8380;

    class241(ItemDefinition var1) {
        this.field8375[0] = var1.field4241;
        this.field8375[1] = var1.field4255;
        this.field8375[2] = var1.field4277;
        this.field8376[0] = var1.field4265;
        this.field8376[1] = var1.field4264;
        this.field8376[2] = var1.field4259;
        this.field8371[0] = var1.field4278;
        this.field8371[1] = var1.field4267;
        this.field8378[0] = var1.field4268;
        this.field8378[1] = var1.field4282;
        if (var1.field4223 != null) {
            this.field8379 = new short[var1.field4223.length];
            System.arraycopy(var1.field4223, 0, this.field8379, 0, this.field8379.length);
        }

        if (var1.field4229 != null) {
            this.field8380 = new short[var1.field4229.length];
            System.arraycopy(var1.field4229, 0, this.field8380, 0, this.field8380.length);
        }

    }

    public static final void method4705(int var0) {
        try {
            if (!class730.field2743) {
                class730.field2740 += (-24.0F - class730.field2740) / 2.0F;
                class730.field2744 = true;
                class730.field2743 = true;
            }

        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "td.hr(" + ')');
        }
    }

    static final void method4706(class744 var0, int var1) {
        try {
            int var2 = var0.field3174[var0.field3176];
            class978.field3129[var2] = (String) var0.field3157[--var0.field3158];
            class111.method1361(var2, 1525227442);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "td.am(" + ')');
        }
    }
}
