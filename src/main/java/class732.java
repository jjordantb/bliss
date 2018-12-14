public abstract class class732 extends Interactable {

    public static class213 field2980;
    protected short field2978;
    protected short field2979;

    class732(SceneGraph var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        super(var1);
        super.field3639 = (byte) var5;
        super.field3640 = (byte) var6;
        this.field2978 = (short) var7;
        this.field2979 = (short) var8;
        this.method1514(new RegionOffset((float) var2, (float) var3, (float) var4));
    }

    int method2161(class639[] var1, int var2) {
        try {
            RegionOffset var3 = this.getRegion().regionOffset;
            return this.method2199((int) var3.offsetX >> super.field3638.field3849, (int) var3.offsetY >> super.field3638.field3849, var1, 1820308449);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aji.dg(" + ')');
        }
    }

    final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "aji.bk(" + ')');
        }
    }

    boolean method2171(class848 var1, byte var2) {
        try {
            RegionOffset var3 = this.getRegion().regionOffset;
            return super.field3638.field3857.method1653(super.field3640, (int) var3.offsetX >> super.field3638.field3849, (int) var3.offsetY >> super.field3638.field3849, this.method2168(1951240662));
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "aji.dl(" + ')');
        }
    }

    boolean method2167(int var1) {
        try {
            RegionOffset var2 = this.getRegion().regionOffset;
            return super.field3638.field3908[super.field3638.field3883 + (((int) var2.offsetX >> super.field3638.field3849) - super.field3638.field3898)][((int) var2.offsetY >> super.field3638.field3849) - super.field3638.field3858 + super.field3638.field3883];
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "aji.dq(" + ')');
        }
    }
}
