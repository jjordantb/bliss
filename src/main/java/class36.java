import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class class36 extends class571 {
    static int field5332 = 0;
    static int field5334 = 128;
    String field5331;
    int field5333;
    String field5335;
    String field5336;
    float field5337;
    float field5338;
    int field5339;

    class36(OggStreamState var1) {
        super(var1);
    }

    void method23(OggPacket var1, int var2) {
        try {
            if (super.field38 <= 0 || "SUB".equals(this.field5336)) {
                InputStream var3 = new InputStream(var1.getData());
                int var4 = var3.method6371();
                if (super.field38 <= 8) {
                    if ((var4 | 128) == 0) {
                        throw new IllegalStateException();
                    }

                    if (super.field38 == 0) {
                        var3.field10376 += 23;
                        this.field5333 = var3.method6377(1431459183);
                        this.field5339 = var3.method6377(-150244186);
                        if (this.field5333 == 0 || this.field5339 == 0) {
                            throw new IllegalStateException();
                        }

                        InputStream var5 = new InputStream(16);
                        var3.method6381(var5.field10375, 0, 16, -953523806);
                        this.field5335 = var5.method6379(-1838621769);
                        var5.field10376 = 0;
                        var3.method6381(var5.field10375, 0, 16, -953523806);
                        this.field5336 = var5.method6379(1476138543);
                    }
                } else {
                    if (var4 == 0) {
                        long var6 = var3.method6417(1976358727);
                        long var8 = var3.method6417(1286401972);
                        long var10 = var3.method6417(1829097486);
                        if (var6 < 0L || var8 < 0L || var10 < 0L || var10 > var6) {
                            throw new IllegalStateException();
                        }

                        this.field5337 = (float) (var6 * (long) this.field5339) / (float) this.field5333;
                        this.field5338 = (float) ((var6 + var8) * (long) this.field5339) / (float) this.field5333;
                        int var12 = var3.method6377(-941704037);
                        if (var12 < 0 || var12 > var3.field10375.length - var3.field10376) {
                            throw new IllegalStateException();
                        }

                        this.field5331 = class140.method1051(var3.field10375, var3.field10376, var12, -730069426);
                    }

                    if ((var4 | 128) != 0) {
                        return;
                    }
                }
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "ajv.f(" + ')');
        }
    }

    String method3331(byte var1) {
        try {
            return this.field5335;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajv.q(" + ')');
        }
    }

    public float method3332(byte var1) {
        try {
            return this.field5337;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajv.n(" + ')');
        }
    }

    public float method3333(int var1) {
        try {
            return this.field5338;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajv.s(" + ')');
        }
    }

    public String method3334(int var1) {
        try {
            return this.field5331;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ajv.z(" + ')');
        }
    }

    void method24(int var1) {
    }
}
