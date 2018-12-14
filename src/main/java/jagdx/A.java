package jagdx;

public class A {
    public static int a = 0;
    public static int f = 21;
    public static int b = 22;
    public static int p = 23;
    public static int i = 28;
    public static int k = 50;
    public static int d = 51;
    public static int u = 77;
    public static int x = 80;
    public static int r = 101;
    public static int q = 102;
    public static int n = 113;
    public static int s = 116;
    public static int z = a('D', 'X', 'T', '1');
    public static int y = a('D', 'X', 'T', '5');

    private A() throws Throwable {
        throw new Error();
    }

    private static int a(char var0, char var1, char var2, char var3) {
        return (var0 & 255) << 0 | (var1 & 255) << 8 | (var2 & 255) << 16 | (var3 & 255) << 24;
    }
}
