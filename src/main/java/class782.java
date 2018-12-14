import jaclib.memory.Stream;

public class class782 extends InputStream {
    class782(int var1) {
        super(var1);
    }

    void method2468(float var1) {
        int var2 = Stream.floatToRawIntBits(var1);
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 24);
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 16);
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 8);
        super.field10375[++super.field10376 - 1] = (byte) var2;
    }

    void method2469(float var1) {
        int var2 = Stream.floatToRawIntBits(var1);
        super.field10375[++super.field10376 - 1] = (byte) var2;
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 8);
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 16);
        super.field10375[++super.field10376 - 1] = (byte) (var2 >> 24);
    }
}
