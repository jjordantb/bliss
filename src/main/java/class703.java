public class class703 {
    public static int[] field3404 = new int[16384];
    public static int field3405 = 16383;
    public static int field3406 = 14;
    public static int field3407 = 8192;
    public static int field3408 = 16384;
    public static int field3409 = 16383;
    public static int field3410 = 14;
    public static int field3411 = 1024;
    public static int field3412 = 2048;
    public static int[] field3413 = new int[16384];
    public static double field3414 = 2607.5945876176133D;
    public static int field3415 = 6144;
    public static int field3416 = 10240;
    public static int field3417 = 12288;
    public static int field3418 = 14336;
    public static int field3419 = 16384;
    public static int field3420 = 16384;
    public static int field3421 = 4096;

    static {
        double var0 = 3.834951969714103E-4D;

        for (int var2 = 0; var2 < 16384; ++var2) {
            field3413[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field3404[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }

    }

    class703() throws Throwable {
        throw new Error();
    }

    public static float method2002(int var0) {
        var0 &= 16383;
        return (float) ((double) ((float) var0 / 16384.0F) * 6.283185307179586D);
    }
}
