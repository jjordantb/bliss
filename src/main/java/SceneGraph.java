import java.util.Iterator;

public class SceneGraph {

    public static boolean field3885 = true;
    static int field3910;
    public int field3849;
    public class728 field3857;
    public int field3859;
    public SceneTile[][][] field3861; // one is sd
    public SceneGraphLevel[] field3862;
    public SceneTile[][][] field3863; // onw is dx
    public SceneGraphLevel[] field3864;
    public SceneTile[][][] oglTiles; // one is ogl
    public SceneGraphLevel[] field3866;
    public class472 field3873;
    public int field3893;
    public int field3894;
    Interactable[] npcsIThink;
    float[] field3850;
    int field3851 = 16;
    int field3852;
    class848 field3853;
    class644 field3854;
    boolean field3855;
    boolean field3856;
    int field3858;
    Interactable[] field3860;
    int[][] field3867;
    short[][] field3868;
    byte[][] field3869;
    byte[][] field3870;
    byte[][] field3871;
    byte[][] field3872;
    class639[] field3874;
    int field3875 = 5029;
    int field3876 = 10093;
    Interactable[] interactables2;
    int field3878;
    Interactable[] interactables3;
    int field3880;
    int field3881;
    int field3882 = 5043;
    int field3883;
    Animable[] field3884;
    int field3886 = 0;
    int field3887;
    int field3888;
    int field3889;
    int field3890;
    int field3891;
    int field3892;
    int field3895;
    int field3896;
    int field3897;
    int field3898;
    long[][][] field3899;
    int field3900 = 65391;
    int field3901;
    Interactable[] interactables4;
    class321[] field3903;
    boolean[] field3904;
    int field3905;
    boolean[][] field3906;
    int[] field3907;
    boolean[][] field3908;
    boolean[][] field3909;

    public SceneGraph(class848 var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        this.field3876 = 10093;
        this.field3875 = 5029;
        this.field3882 = 5043;
        this.field3850 = new float[3];
        this.field3874 = new class639[8];
        this.field3900 = 65391;
        this.field3853 = var1;
        this.field3855 = this.field3853.method4876() > 0;
        this.field3849 = var2;
        this.field3881 = 1 << this.field3849;
        this.field3891 = this.field3881 >> 1;
        this.field3893 = var3;
        this.field3859 = var4;
        this.field3894 = var5;
        this.field3883 = var6;
        this.field3854 = new class644();
        this.field3857 = new class728(this);
        this.field3863 = new SceneTile[var3][this.field3859][this.field3894];
        this.field3864 = new SceneGraphLevel[var3];
        if (var7) {
            this.field3867 = new int[this.field3859][this.field3894];
            this.field3869 = new byte[this.field3859][this.field3894];
            this.field3868 = new short[this.field3859][this.field3894];
            this.field3870 = new byte[this.field3859][this.field3894];
            this.field3871 = new byte[this.field3859][this.field3894];
            this.field3872 = new byte[this.field3859][this.field3894];
            this.oglTiles = new SceneTile[1][this.field3859][this.field3894];
            this.field3866 = new SceneGraphLevel[1];
        }

        if (var8) {
            this.field3899 = new long[var3][var4][var5];
            this.field3903 = new class321['ｯ'];
            this.field3904 = new boolean['ｯ'];
            this.field3901 = 0;
        }

        this.method2446(false, -740850409);
        this.interactables2 = new Interactable[2];
        this.interactables4 = new Interactable[2];
        this.interactables3 = new Interactable[2];
        this.field3860 = new Interactable[10093];
        this.field3880 = 0;
        this.npcsIThink = new Interactable[5029];
        this.field3905 = 0;
        this.field3884 = new Animable[5043];
        this.field3886 = 0;
        this.field3908 = new boolean[this.field3883 + this.field3883 + 1][this.field3883 + this.field3883 + 1];
        this.field3906 = new boolean[2 + this.field3883 + this.field3883][this.field3883 + this.field3883 + 2];
        this.field3907 = new int[2 + this.field3883 + this.field3883];
        this.field3873 = new class472(false);
    }

    static final void method2455(class744 var0, byte var1) {
        try {
            var0.field3156 -= 7;
            int var2 = var0.field3161[var0.field3156];
            int var3 = var0.field3161[var0.field3156 + 1] << 1;
            int var4 = var0.field3161[2 + var0.field3156];
            int var5 = var0.field3161[var0.field3156 + 3];
            int var6 = var0.field3161[var0.field3156 + 4];
            int var7 = var0.field3161[var0.field3156 + 5];
            int var8 = var0.field3161[var0.field3156 + 6];
            if (var2 >= 0 && var2 < 2 && class730.field2748[var2] != null && var3 >= 0 && var3 < class730.field2748[var2].length) {
                class730.field2748[var2][var3] = new int[]{(var4 >> 14 & 16383) << 9, var5 << 2, (var4 & 16383) << 9, var8};
                class730.field2748[var2][1 + var3] = new int[]{(var6 >> 14 & 16383) << 9, var7 << 2, (var6 & 16383) << 9};
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.afm(" + ')');
        }
    }

    static final void method2456(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            var0.field3161[++var0.field3156 - 1] = var3.field895;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nu.pc(" + ')');
        }
    }

    static Widget method2457(Widget var0, byte var1) {
        try {
            Widget var2 = class730.method1768(var0);
            if (var2 == null) {
                var2 = var0.parent;
            }

            return var2;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nu.ln(" + ')');
        }
    }

    public void method2401(int var1, byte var2) {
    }

    public void method2402(class727 var1, int var2) {
    }

    public class824 method2403(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 == null) {
                return null;
            } else {
                this.method2424(var5.opt2, -144193556);
                if (var5.opt2 != null) {
                    class824 var6 = var5.opt2;
                    var5.opt2 = null;
                    return var6;
                } else {
                    return null;
                }
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.ax(" + ')');
        }
    }

    public void method2404(int var1) {
        try {
            for (int var2 = 0; var2 < this.field3886; ++var2) {
                Animable var3 = this.field3884[var2];
                this.method2423(var3, true, 2052556984);
                this.field3884[var2] = null;
            }

            this.field3886 = 0;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nu.m(" + ')');
        }
    }

    public void method2405(int var1, int var2, int var3) {
        try {
            SceneTile var4 = this.field3861[0][var1][var2];

            for (int var5 = 0; var5 < 3; ++var5) {
                SceneTile var6 = this.field3861[var5][var1][var2] = this.field3861[var5 + 1][var1][var2];
                if (var6 != null) {
                    for (IterableSceneEntity var7 = var6.iterableSceneEntity; var7 != null; var7 = var7.next) {
                        Animable var8 = var7.animable;
                        if (var1 == var8.field8299 && var8.field8296 == var2) {
                            --var8.field3639;
                        }
                    }

                    if (var6.opt2 != null) {
                        --var6.opt2.field3639;
                    }

                    if (var6.boundaryObject != null) {
                        --var6.boundaryObject.field3639;
                    }

                    if (var6.boundaryObject2 != null) {
                        --var6.boundaryObject2.field3639;
                    }

                    if (var6.wallDecoration != null) {
                        --var6.wallDecoration.field3639;
                    }

                    if (var6.wallDecoration2 != null) {
                        --var6.wallDecoration2.field3639;
                    }
                }
            }

            if (this.field3861[0][var1][var2] == null) {
                this.field3861[0][var1][var2] = new SceneTile(0);
                this.field3861[0][var1][var2].floorLevel = 1;
            }

            this.field3861[0][var1][var2].field7005 = var4;
            this.field3861[3][var1][var2] = null;
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.i(" + ')');
        }
    }

    SceneTile method2406(int var1, int var2, int var3, int var4) {
        try {
            if (this.field3861[var1][var2][var3] == null) {
                boolean var5 = this.field3861[0][var2][var3] != null && this.field3861[0][var2][var3].field7005 != null;
                if (var5 && var1 >= this.field3893 - 1) {
                    return null;
                }

                this.method2407(var1, var2, var3, 127761391);
            }

            return this.field3861[var1][var2][var3];
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.k(" + ')');
        }
    }

    public void method2407(int var1, int var2, int var3, int var4) {
        try {
            boolean var5 = this.field3861[0][var2][var3] != null && this.field3861[0][var2][var3].field7005 != null;

            for (int var6 = var1; var6 >= 0; --var6) {
                if (this.field3861[var6][var2][var3] == null) {
                    SceneTile var7 = this.field3861[var6][var2][var3] = new SceneTile(var6);
                    if (var5) {
                        ++var7.floorLevel;
                    }
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "nu.d(" + ')');
        }
    }

    public int method2408(int var1, int var2, byte var3) {
        try {
            return this.field3868 != null ? this.field3868[var1][var2] & '\uffff' : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.x(" + ')');
        }
    }

    public int method2409(int var1, int var2, byte var3) {
        try {
            return this.field3867 != null ? this.field3867[var1][var2] & 16777215 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.r(" + ')');
        }
    }

    public int method2410(int var1, int var2, byte var3) {
        try {
            return this.field3869 != null ? this.field3869[var1][var2] & 255 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.q(" + ')');
        }
    }

    public int method2411(int var1, int var2, byte var3) {
        try {
            return this.field3870 != null ? this.field3870[var1][var2] & 255 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.n(" + ')');
        }
    }

    public int method2412(int var1, int var2, int var3) {
        try {
            return this.field3872 != null ? this.field3872[var1][var2] & 255 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.z(" + ')');
        }
    }

    public void method2413(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
        try {
            if (this.field3867 != null) {
                this.field3867[var1][var2] = -16777216 | var3;
            }

            if (this.field3868 != null) {
                this.field3868[var1][var2] = (short) var4;
            }

            if (this.field3869 != null) {
                this.field3869[var1][var2] = (byte) var5;
            }

            if (this.field3870 != null) {
                this.field3870[var1][var2] = (byte) var6;
            }

            if (this.field3871 != null) {
                this.field3871[var1][var2] = (byte) var7;
            }

            if (this.field3872 != null) {
                this.field3872[var1][var2] = (byte) var8;
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "nu.y(" + ')');
        }
    }

    public void method2414(int var1, int var2, int var3, class676 var4, class676 var5, byte var6) {
        try {
            SceneTile var7 = this.method2406(var1, var2, var3, 1985350813);
            if (var7 != null) {
                var7.boundaryObject = var4;
                var7.boundaryObject2 = var5;
                int var8 = this.field3862 == this.field3866 ? 1 : 0;
                if (var4.method2206((byte) 13)) {
                    if (var4.method2183((short) 255)) {
                        var4.field3637 = this.interactables4[var8];
                        this.interactables4[var8] = var4;
                    } else {
                        var4.field3637 = this.interactables2[var8];
                        this.interactables2[var8] = var4;
                    }
                } else {
                    var4.field3637 = this.interactables3[var8];
                    this.interactables3[var8] = var4;
                }

                if (var5 != null) {
                    if (var5.method2206((byte) 13)) {
                        if (var5.method2183((short) 255)) {
                            var5.field3637 = this.interactables4[var8];
                            this.interactables4[var8] = var5;
                        } else {
                            var5.field3637 = this.interactables2[var8];
                            this.interactables2[var8] = var5;
                        }
                    } else {
                        var5.field3637 = this.interactables3[var8];
                        this.interactables3[var8] = var5;
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.v(" + ')');
        }
    }

    public void method2415(int var1, int var2, int var3, class732 var4, class732 var5, int var6) {
        try {
            SceneTile var7 = this.method2406(var1, var2, var3, 937547322);
            if (var7 != null) {
                var7.wallDecoration = var4;
                var7.wallDecoration2 = var5;
                int var8 = this.field3862 == this.field3866 ? 1 : 0;
                if (var4.method2206((byte) 13)) {
                    if (var4.method2183((short) 255)) {
                        var4.field3637 = this.interactables4[var8];
                        this.interactables4[var8] = var4;
                    } else {
                        var4.field3637 = this.interactables2[var8];
                        this.interactables2[var8] = var4;
                    }
                } else {
                    var4.field3637 = this.interactables3[var8];
                    this.interactables3[var8] = var4;
                }

                if (var5 != null) {
                    if (var5.method2206((byte) 13)) {
                        if (var5.method2183((short) 255)) {
                            var5.field3637 = this.interactables4[var8];
                            this.interactables4[var8] = var5;
                        } else {
                            var5.field3637 = this.interactables2[var8];
                            this.interactables2[var8] = var5;
                        }
                    } else {
                        var5.field3637 = this.interactables3[var8];
                        this.interactables3[var8] = var5;
                    }
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.g(" + ')');
        }
    }

    public boolean method2416(Animable var1, boolean var2, byte var3) {
        try {
            boolean var4 = this.field3862 == this.field3866;
            int var5 = 0;
            short var6 = 0;
            byte var7 = 0;
            var1.method4691(449273804);
            if (var1.field8299 >= 0 && var1.field8296 >= 0 && var1.field8297 < this.field3859 && var1.field8298 < this.field3894) {
                short var8 = 0;

                int var9;
                int var10;
                for (var9 = var1.field8299; var9 <= var1.field8297; ++var9) {
                    for (var10 = var1.field8296; var10 <= var1.field8298; ++var10) {
                        SceneTile var11 = this.method2406(var1.field3639, var9, var10, 960411819);
                        if (var11 != null) {
                            IterableSceneEntity var12 = class141.method1092(var1, (byte) 47);
                            IterableSceneEntity var13 = var11.iterableSceneEntity;
                            if (var13 == null) {
                                var11.iterableSceneEntity = var12;
                            } else {
                                while (var13.next != null) {
                                    var13 = var13.next;
                                }

                                var13.next = var12;
                            }

                            if (var4 && (this.field3867[var9][var10] & -16777216) != 0) {
                                var5 = this.field3867[var9][var10];
                                var6 = this.field3868[var9][var10];
                                var7 = this.field3869[var9][var10];
                            }

                            if (!var2 && var11.opt2 != null && var11.opt2.field9059 > var8) {
                                var8 = var11.opt2.field9059;
                            }
                        }
                    }
                }

                if (var4 && (var5 & -16777216) != 0) {
                    for (var9 = var1.field8299; var9 <= var1.field8297; ++var9) {
                        for (var10 = var1.field8296; var10 <= var1.field8298; ++var10) {
                            if ((this.field3867[var9][var10] & -16777216) == 0) {
                                this.field3867[var9][var10] = var5;
                                this.field3868[var9][var10] = var6;
                                this.field3869[var9][var10] = var7;
                            }
                        }
                    }
                }

                if (var2) {
                    this.field3884[++this.field3886 - 1] = var1;
                    var1.field3638 = this;
                } else {
                    var9 = this.field3862 == this.field3866 ? 1 : 0;
                    if (var1.method2206((byte) 13)) {
                        if (var1.method2183((short) 255)) {
                            var1.field3637 = this.interactables4[var9];
                            this.interactables4[var9] = var1;
                        } else {
                            var1.field3637 = this.interactables2[var9];
                            this.interactables2[var9] = var1;
                        }
                    } else {
                        var1.field3637 = this.interactables3[var9];
                        this.interactables3[var9] = var1;
                    }
                }

                if (var2) {
                    RegionOffset var15 = RegionOffset.translate(var1.getRegion().regionOffset);
                    var15.field5300 -= (float) var8;
                    var1.method1514(var15);
                    var15.method3291();
                }

                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "nu.e(" + ')');
        }
    }

    public void method2417(int var1, int var2, int var3, int var4, byte var5) {
        try {
            SceneTile var6 = this.field3861[var1][var2][var3];
            if (var6 != null) {
                class732 var7 = var6.wallDecoration;
                class732 var8 = var6.wallDecoration2;
                if (var7 != null) {
                    var7.field2978 = (short) (var4 * var7.field2978 / (16 << this.field3849 - 7));
                    var7.field2979 = (short) (var7.field2979 * var4 / (16 << this.field3849 - 7));
                }

                if (var8 != null) {
                    var8.field2978 = (short) (var4 * var8.field2978 / (16 << this.field3849 - 7));
                    var8.field2979 = (short) (var8.field2979 * var4 / (16 << this.field3849 - 7));
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.c(" + ')');
        }
    }

    public void method2418(byte var1) {
        try {
            this.method2442(1, this.field3893, 722872945);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "nu.am(" + ')');
        }
    }

    public class676 method2419(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 != null) {
                this.method2424(var5.boundaryObject, -452884210);
                if (var5.boundaryObject != null) {
                    class676 var6 = var5.boundaryObject;
                    var5.boundaryObject = null;
                    return var6;
                }
            }

            return null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.w(" + ')');
        }
    }

    public class676 method2420(int var1, int var2, int var3, byte var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 != null) {
                this.method2424(var5.boundaryObject2, -123141942);
                if (var5.boundaryObject2 != null) {
                    class676 var6 = var5.boundaryObject2;
                    var5.boundaryObject2 = null;
                    return var6;
                }
            }

            return null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.j(" + ')');
        }
    }

    public class732 method2421(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 != null) {
                this.method2424(var5.wallDecoration2, -531623342);
                if (var5.wallDecoration2 != null) {
                    class732 var6 = var5.wallDecoration2;
                    var5.wallDecoration2 = null;
                    return var6;
                }
            }

            return null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.l(" + ')');
        }
    }

    public Animable method2422(int var1, int var2, int var3, class832 var4, short var5) {
        try {
            SceneTile var6 = this.field3861[var1][var2][var3];
            if (var6 == null) {
                return null;
            } else {
                for (IterableSceneEntity var7 = var6.iterableSceneEntity; var7 != null; var7 = var7.next) {
                    Animable var8 = var7.animable;
                    if ((var4 == null || var4.method5380(var8, -98426520)) && var8.field8299 == var2 && var8.field8296 == var3) {
                        this.method2423(var8, false, 2114979879);
                        return var8;
                    }
                }

                return null;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.ak(" + ')');
        }
    }

    void method2423(Animable var1, boolean var2, int var3) {
        try {
            for (int var4 = var1.field8299; var4 <= var1.field8297; ++var4) {
                for (int var5 = var1.field8296; var5 <= var1.field8298; ++var5) {
                    SceneTile var6 = this.field3861[var1.field3639][var4][var5];
                    if (var6 != null) {
                        IterableSceneEntity var7 = var6.iterableSceneEntity;

                        for (IterableSceneEntity var8 = null; var7 != null; var7 = var7.next) {
                            if (var1 == var7.animable) {
                                if (var8 != null) {
                                    var8.next = var7.next;
                                } else {
                                    var6.iterableSceneEntity = var7.next;
                                }

                                var7.shift((byte) -98);
                                break;
                            }

                            var8 = var7;
                        }
                    }
                }
            }

            if (!var2) {
                this.method2424(var1, -615451520);
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.ae(" + ')');
        }
    }

    void method2424(Interactable var1, int var2) {
        try {
            if (var1 != null) {
                var1.method1519();

                for (int var3 = 0; var3 < 2; ++var3) {
                    Interactable var4 = null;

                    Interactable var5;
                    for (var5 = this.interactables2[var3]; var5 != null; var5 = var5.field3637) {
                        if (var5 == var1) {
                            if (var4 != null) {
                                var4.field3637 = var5.field3637;
                            } else {
                                this.interactables2[var3] = var5.field3637;
                            }

                            return;
                        }

                        var4 = var5;
                    }

                    var4 = null;

                    for (var5 = this.interactables4[var3]; var5 != null; var5 = var5.field3637) {
                        if (var5 == var1) {
                            if (var4 != null) {
                                var4.field3637 = var5.field3637;
                            } else {
                                this.interactables4[var3] = var5.field3637;
                            }

                            return;
                        }

                        var4 = var5;
                    }

                    var4 = null;

                    for (var5 = this.interactables3[var3]; var5 != null; var5 = var5.field3637) {
                        if (var1 == var5) {
                            if (var4 != null) {
                                var4.field3637 = var5.field3637;
                            } else {
                                this.interactables3[var3] = var5.field3637;
                            }

                            return;
                        }

                        var4 = var5;
                    }
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.ao(" + ')');
        }
    }

    public class676 method2425(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 == null ? null : var5.boundaryObject;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.ad(" + ')');
        }
    }

    public class676 method2426(int var1, int var2, int var3, byte var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 == null ? null : var5.boundaryObject2;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.av(" + ')');
        }
    }

    public class732 method2427(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 == null ? null : var5.wallDecoration;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.at(" + ')');
        }
    }

    public class168 method2428(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 == null ? null : var5.opt1;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.ah(" + ')');
        }
    }

    public Animable method2429(int var1, int var2, int var3, class832 var4, int var5) {
        try {
            SceneTile var6 = this.field3861[var1][var2][var3];
            if (var6 == null) {
                return null;
            } else {
                for (IterableSceneEntity var7 = var6.iterableSceneEntity; var7 != null; var7 = var7.next) {
                    Animable var8 = var7.animable;
                    if ((var4 == null || var4.method5380(var8, 240755990)) && var8.field8299 == var2 && var8.field8296 == var3) {
                        return var8;
                    }
                }

                return null;
            }
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.ai(" + ')');
        }
    }

    public IterableSceneEntity method2430(int var1, int var2, int var3, int var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 == null ? null : var5.iterableSceneEntity;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.al(" + ')');
        }
    }

    public void method2431() {
        for (int var1 = 0; var1 < this.field3893; ++var1) {
            for (int var2 = 0; var2 < this.field3859; ++var2) {
                for (int var3 = 0; var3 < this.field3894; ++var3) {
                    SceneTile var4 = this.field3861[var1][var2][var3];
                    if (var4 != null) {
                        class676 var5 = var4.boundaryObject;
                        class676 var6 = var4.boundaryObject2;
                        if (var5 != null && var5.method2173(1673017934)) {
                            this.method2433(var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method2173(1884072683)) {
                                this.method2433(var6, var1, var2, var3, 1, 1);
                                var6.method2162(this.field3853, var5, 0, 0, 0, false, 1471147933);
                                var6.method2205((byte) 115);
                            }

                            var5.method2205((byte) 125);
                        }

                        for (IterableSceneEntity var7 = var4.iterableSceneEntity; var7 != null; var7 = var7.next) {
                            Animable var8 = var7.animable;
                            if (var8 != null && var8.method2173(1908249416)) {
                                this.method2433(var8, var1, var2, var3, 1 + (var8.field8297 - var8.field8299), var8.field8298 - var8.field8296 + 1);
                                var8.method2205((byte) 61);
                            }
                        }

                        class824 var9 = var4.opt2;
                        if (var9 != null && var9.method2173(1396337054)) {
                            this.method2432(var9, var1, var2, var3, 795291520);
                            var9.method2205((byte) 19);
                        }
                    }
                }
            }
        }

    }

    void method2432(Interactable var1, int var2, int var3, int var4, int var5) {
        try {
            SceneTile var6;
            if (var3 < this.field3859) {
                var6 = this.field3861[var2][var3 + 1][var4];
                if (var6 != null && var6.opt2 != null && var6.opt2.method2173(1670858079)) {
                    var1.method2162(this.field3853, var6.opt2, this.field3881, 0, 0, true, 1480517000);
                }
            }

            if (var4 < this.field3859) {
                var6 = this.field3861[var2][var3][var4 + 1];
                if (var6 != null && var6.opt2 != null && var6.opt2.method2173(1930175079)) {
                    var1.method2162(this.field3853, var6.opt2, 0, 0, this.field3881, true, 1828441739);
                }
            }

            if (var3 < this.field3859 && var4 < this.field3894) {
                var6 = this.field3861[var2][1 + var3][var4 + 1];
                if (var6 != null && var6.opt2 != null && var6.opt2.method2173(2111976416)) {
                    var1.method2162(this.field3853, var6.opt2, this.field3881, 0, this.field3881, true, 1058354287);
                }
            }

            if (var3 < this.field3859 && var4 > 0) {
                var6 = this.field3861[var2][var3 + 1][var4 - 1];
                if (var6 != null && var6.opt2 != null && var6.opt2.method2173(1781377638)) {
                    var1.method2162(this.field3853, var6.opt2, this.field3881, 0, -this.field3881, true, 151502999);
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.ap(" + ')');
        }
    }

    void method2433(Interactable var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var7 = true;
        int var8 = var3;
        int var9 = var5 + var3;
        int var10 = var4 - 1;
        int var11 = var4 + var6;

        for (int var12 = var2; var12 <= var2 + 1; ++var12) {
            if (this.field3893 != var12) {
                for (int var13 = var8; var13 <= var9; ++var13) {
                    if (var13 >= 0 && var13 < this.field3859) {
                        for (int var14 = var10; var14 <= var11; ++var14) {
                            if (var14 >= 0 && var14 < this.field3894 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                                SceneTile var15 = this.field3861[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (this.field3862[var12].method3888(var13, var14, (byte) -40) + this.field3862[var12].method3888(1 + var13, var14, (byte) -92) + this.field3862[var12].method3888(var13, 1 + var14, (byte) -41) + this.field3862[var12].method3888(var13 + 1, var14 + 1, (byte) -106)) / 4 - (this.field3862[var2].method3888(var3, var4, (byte) 0) + this.field3862[var2].method3888(var3 + 1, var4, (byte) -79) + this.field3862[var2].method3888(var3, 1 + var4, (byte) -78) + this.field3862[var2].method3888(1 + var3, 1 + var4, (byte) -80)) / 4;
                                    class676 var17 = var15.boundaryObject;
                                    class676 var18 = var15.boundaryObject2;
                                    if (var17 != null && var17.method2173(2051783389)) {
                                        var1.method2162(this.field3853, var17, this.field3891 * (1 - var5) + this.field3881 * (var13 - var3), var16, (var14 - var4) * this.field3881 + this.field3891 * (1 - var6), var7, 1604469537);
                                    }

                                    if (var18 != null && var18.method2173(1486894505)) {
                                        var1.method2162(this.field3853, var18, this.field3881 * (var13 - var3) + this.field3891 * (1 - var5), var16, this.field3881 * (var14 - var4) + (1 - var6) * this.field3891, var7, 1798941005);
                                    }

                                    for (IterableSceneEntity var19 = var15.iterableSceneEntity; var19 != null; var19 = var19.next) {
                                        Animable var20 = var19.animable;
                                        if (var20 != null && var20.method2173(1399351341) && (var20.field8299 == var13 || var8 == var13) && (var20.field8296 == var14 || var10 == var14)) {
                                            int var21 = 1 + (var20.field8297 - var20.field8299);
                                            int var22 = var20.field8298 - var20.field8296 + 1;
                                            var1.method2162(this.field3853, var20, this.field3881 * (var20.field8299 - var3) + (var21 - var5) * this.field3891, var16, (var20.field8296 - var4) * this.field3881 + this.field3891 * (var22 - var6), var7, 784338104);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                --var8;
                var7 = false;
            }
        }

    }

    public void method2434(int var1, int var2, int var3, int var4, byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, byte var12, int var13, int var14, boolean var15, boolean var16, int var17, boolean var18) {
        this.field3857.field2453 = true;
        this.field3856 = var16;
        this.field3898 = var2 >> this.field3849;
        this.field3858 = var4 >> this.field3849;
        this.field3887 = var2;
        this.field3888 = var4;
        this.field3889 = var3;
        this.field3878 = this.field3898 - this.field3883;
        if (this.field3878 < 0) {
            this.field3892 = -(this.field3878 * -931950691) * -1810993483;
            this.field3878 = 0;
        } else {
            this.field3892 = 0;
        }

        this.field3896 = this.field3858 - this.field3883;
        if (this.field3896 < 0) {
            this.field3852 = -(this.field3896 * -1995214385) * -301075153;
            this.field3896 = 0;
        } else {
            this.field3852 = 0;
        }

        this.field3895 = this.field3898 + this.field3883;
        if (this.field3895 > this.field3859) {
            this.field3895 = this.field3859;
        }

        this.field3897 = this.field3883 + this.field3858;
        if (this.field3897 > this.field3894) {
            this.field3897 = this.field3894;
        }

        boolean[][] var19 = this.field3908;
        boolean[][] var20 = this.field3906;
        int var21;
        int var22;
        if (this.field3856) {
            for (var21 = 0; var21 < this.field3883 + this.field3883 + 2; ++var21) {
                var22 = 0;
                int var23 = 0;

                for (int var24 = 0; var24 < this.field3883 + this.field3883 + 2; ++var24) {
                    if (var24 > 1) {
                        this.field3907[var24 - 2] = var22;
                    }

                    var22 = var23;
                    int var25 = this.field3898 - this.field3883 + var21;
                    int var26 = this.field3858 - this.field3883 + var24;
                    int var27;
                    if (var25 >= 0 && var26 >= 0 && var25 < this.field3859 && var26 < this.field3894) {
                        var27 = var25 << this.field3849;
                        int var28 = var26 << this.field3849;
                        int var29 = this.field3864[this.field3864.length - 1].method3888(var25, var26, (byte) -48) - (1000 << this.field3849 - 7);
                        int var30 = (this.field3866 != null ? this.field3866[0].method3888(var25, var26, (byte) -75) + this.field3881 : this.field3864[0].method3888(var25, var26, (byte) -70) + this.field3881) + (1000 << this.field3849 - 7);
                        var23 = this.field3853.method4848(var27, var29, var28, var27, var30, var28);
                        this.field3906[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        this.field3906[var21][var24] = false;
                    }

                    if (var21 > 0 && var24 > 0) {
                        var27 = this.field3907[var24 - 1] & this.field3907[var24] & var22 & var23;
                        this.field3908[var21 - 1][var24 - 1] = var27 == 0;
                    }
                }

                this.field3907[this.field3883 + this.field3883] = var22;
                this.field3907[1 + this.field3883 + this.field3883] = var23;
            }

            if (!var18) {
                this.field3857.field2453 = false;
            } else {
                this.field3857.field2454 = var6;
                this.field3857.field2471 = var7;
                this.field3857.field2472 = var8;
                this.field3857.field2458 = var9;
                this.field3857.field2452 = var10;
                this.field3857.method1661(this.field3853, var11);
            }
        } else {
            if (this.field3909 == null) {
                this.field3909 = new boolean[this.field3883 + this.field3883 + 2][this.field3883 + this.field3883 + 2];
            }

            for (var21 = 0; var21 < this.field3909.length; ++var21) {
                for (var22 = 0; var22 < this.field3909[0].length; ++var22) {
                    this.field3909[var21][var22] = true;
                }
            }

            this.field3906 = this.field3909;
            this.field3908 = this.field3909;
            this.field3878 = 0;
            this.field3896 = 0;
            this.field3895 = this.field3859;
            this.field3897 = this.field3894;
            this.field3857.field2453 = false;
        }

        class490.method4431(this, this.field3853, -809712178);
        if (!this.field3873.field8232) {
            Iterator var31 = this.field3873.field8234.iterator();

            while (var31.hasNext()) {
                class192 var32 = (class192) var31.next();
                var31.remove();
                class661.method5743(var32, (byte) -44);
            }
        }

        if (this.field3855) {
            for (var21 = 0; var21 < this.field3901; ++var21) {
                this.field3903[var21].method850(var1, var15, (byte) 1);
            }
        }

        if (this.oglTiles != null) {
            this.method2446(true, -740850409);
            this.field3853.method4886(-1, new class919(1583160, 40, 127, 63, 0, 0, 0));
            this.method2435(true, var5, var11, var12, var17);
            this.field3853.method4888();
            this.method2446(false, -740850409);
        }

        this.method2435(false, var5, var11, var12, var17);
        if (!this.field3856) {
            this.field3908 = var19;
            this.field3906 = var20;
        }

    }

    void method2435(boolean var1, byte[][][] var2, int var3, byte var4, int var5) {
        int var6 = var1 ? 1 : 0;
        this.field3880 = 0;
        this.field3905 = 0;
        ++this.field3890;
        Interactable var7;
        if ((var5 & 2) == 0) {
            for (var7 = this.interactables2[var6]; var7 != null; var7 = var7.field3637) {
                this.method2436(var7, -51028335);
                if (-1 != var7.height && !this.method2439(var7, var1, var2, var3, var4)) {
                    this.field3860[++this.field3880 - 1] = var7;
                }
            }
        }

        int var16;
        if ((var5 & 1) == 0) {
            for (var7 = this.interactables4[var6]; var7 != null; var7 = var7.field3637) {
                this.method2436(var7, 520875779);
                if (-1 != var7.height && !this.method2439(var7, var1, var2, var3, var4)) {
                    this.npcsIThink[++this.field3905 - 1] = var7;
                }
            }

            for (var7 = this.interactables3[var6]; var7 != null; var7 = var7.field3637) {
                this.method2436(var7, 1278144320);
                if (var7.height != -1 && !this.method2439(var7, var1, var2, var3, var4)) {
                    if (var7.method2183((short) 255)) {
                        this.npcsIThink[++this.field3905 - 1] = var7;
                    } else {
                        this.field3860[++this.field3880 - 1] = var7;
                    }
                }
            }

            if (!var1) {
                for (var16 = 0; var16 < this.field3886; ++var16) {
                    this.method2436(this.field3884[var16], -765484247);
                    if (-1 != this.field3884[var16].height && !this.method2439(this.field3884[var16], var1, var2, var3, var4)) {
                        if (this.field3884[var16].method2183((short) 255)) {
                            this.npcsIThink[++this.field3905 - 1] = this.field3884[var16];
                        } else {
                            this.field3860[++this.field3880 - 1] = this.field3884[var16];
                        }
                    }
                }
            }
        }

        if (this.field3880 > 0) {
            this.method2438(this.field3860, 0, this.field3880 - 1);

            for (var16 = 0; var16 < this.field3880; ++var16) {
                this.method2440(this.field3860[var16], this.field3874);
            }
        }

        if (this.field3855) {
            this.field3853.method4844(0, (class639[]) null);
        }

        if ((var5 & 2) == 0) {
            for (var16 = 0; var16 < this.field3893; ++var16) {
                int var8;
                int var9;
                boolean[][] var10;
                int var11;
                int var12;
                int var13;
                if (var16 >= var3 && var2 != null) {
                    var8 = this.field3908.length;
                    if (this.field3908.length + this.field3878 > this.field3859) {
                        var8 -= this.field3878 + this.field3908.length - this.field3859;
                    }

                    var9 = this.field3908[0].length;
                    if (this.field3896 + this.field3908[0].length > this.field3894) {
                        var9 -= this.field3896 + this.field3908[0].length - this.field3894;
                    }

                    var10 = this.field3906;
                    if (this.field3856) {
                        for (var11 = this.field3892; var11 < var8; ++var11) {
                            var12 = this.field3878 + var11 - this.field3892;

                            for (var13 = this.field3852; var13 < var9; ++var13) {
                                var10[var11][var13] = false;
                                if (this.field3908[var11][var13]) {
                                    int var14 = var13 + this.field3896 - this.field3852;

                                    for (int var15 = var16; var15 >= 0; --var15) {
                                        if (this.field3861[var15][var12][var14] != null && this.field3861[var15][var12][var14].floorLevel == var16) {
                                            if ((var15 < var3 || var2[var15][var12][var14] != var4) && !this.field3857.method1651(var16, var12, var14)) {
                                                var10[var11][var13] = true;
                                                break;
                                            }

                                            var10[var11][var13] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    this.field3862[var16].method3885(this.field3898, this.field3858, this.field3883, this.field3906, false, var5);
                } else {
                    var8 = this.field3908.length;
                    if (this.field3878 + this.field3908.length > this.field3859) {
                        var8 -= this.field3878 + this.field3908.length - this.field3859;
                    }

                    var9 = this.field3908[0].length;
                    if (this.field3896 + this.field3908[0].length > this.field3894) {
                        var9 -= this.field3908[0].length + this.field3896 - this.field3894;
                    }

                    var10 = this.field3906;
                    if (this.field3856) {
                        for (var11 = this.field3892; var11 < var8; ++var11) {
                            var12 = var11 + this.field3878 - this.field3892;

                            for (var13 = this.field3852; var13 < var9; ++var13) {
                                if (this.field3908[var11][var13] && !this.field3857.method1651(var16, var12, var13 + this.field3896 - this.field3852)) {
                                    var10[var11][var13] = true;
                                } else {
                                    var10[var11][var13] = false;
                                }
                            }
                        }
                    }

                    this.field3862[var16].method3885(this.field3898, this.field3858, this.field3883, this.field3906, true, var5);
                }
            }
        }

        if (this.field3905 > 0) {
            this.method2437(this.npcsIThink, 0, this.field3905 - 1);

            for (var16 = 0; var16 < this.field3905; ++var16) {
                this.method2440(this.npcsIThink[var16], this.field3874);
            }
        }

    }

    void method2436(Interactable var1, int var2) {
        try {
            RegionOffset var3 = var1.getRegion().regionOffset;
            this.field3853.method4890((float) ((int) var3.offsetX), (float) ((int) var3.field5300 + (var1.method2168(1951240662) >> 1)), (float) ((int) var3.offsetY), this.field3850);
            var1.height = (int) this.field3850[2];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nu.aj(" + ')');
        }
    }

    void method2437(Interactable[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = (var3 + var2) / 2;
            int var5 = var2;
            Interactable var6 = var1[var4];
            var1[var4] = var1[var3];
            var1[var3] = var6;
            int var7 = var6.height;

            for (int var8 = var2; var8 < var3; ++var8) {
                if (var1[var8].height > (var8 & 1) + var7) {
                    Interactable var9 = var1[var8];
                    var1[var8] = var1[var5];
                    var1[var5++] = var9;
                }
            }

            var1[var3] = var1[var5];
            var1[var5] = var6;
            this.method2437(var1, var2, var5 - 1);
            this.method2437(var1, 1 + var5, var3);
        }

    }

    void method2438(Interactable[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = (var3 + var2) / 2;
            int var5 = var2;
            Interactable var6 = var1[var4];
            var1[var4] = var1[var3];
            var1[var3] = var6;
            int var7 = var6.height;

            for (int var8 = var2; var8 < var3; ++var8) {
                if (var1[var8].height < (var8 & 1) + var7) {
                    Interactable var9 = var1[var8];
                    var1[var8] = var1[var5];
                    var1[var5++] = var9;
                }
            }

            var1[var3] = var1[var5];
            var1[var5] = var6;
            this.method2438(var1, var2, var5 - 1);
            this.method2438(var1, var5 + 1, var3);
        }

    }

    boolean method2439(Interactable var1, boolean var2, byte[][][] var3, int var4, byte var5) {
        if (!this.field3856) {
            return false;
        } else if (var1 instanceof Animable) {
            short var12 = ((Animable) var1).field8297;
            short var13 = ((Animable) var1).field8298;
            short var14 = ((Animable) var1).field8299;
            short var9 = ((Animable) var1).field8296;

            for (int var10 = var14; var10 <= var12; ++var10) {
                for (int var11 = var9; var11 <= var13; ++var11) {
                    if (var1.field3640 < this.field3893 && var10 >= this.field3878 && var10 < this.field3895 && var11 >= this.field3896 && var11 < this.field3897) {
                        if ((var3 == null || var1.field3639 < var4 || var3[var1.field3639][var10][var11] != var5) && var1.method2167(1467136065) && !var1.method2171(this.field3853, (byte) -33)) {
                            return false;
                        }

                        if (!var2 && var10 >= this.field3898 - 16 && var10 <= this.field3898 + 16 && var11 >= this.field3858 - 16 && var11 <= 16 + this.field3858) {
                            var1.method2164(this.field3853, 1659529754);
                        }

                        return true;
                    }
                }
            }

            return true;
        } else {
            RegionOffset var6 = var1.getRegion().regionOffset;
            int var7 = (int) var6.offsetX >> this.field3849;
            int var8 = (int) var6.offsetY >> this.field3849;
            if (var1.field3640 < this.field3893 && var7 >= this.field3878 && var7 < this.field3895 && var8 >= this.field3896 && var8 < this.field3897) {
                if ((var3 == null || var1.field3639 < var4 || var3[var1.field3639][var7][var8] != var5) && var1.method2167(1252283375) && !var1.method2171(this.field3853, (byte) 91)) {
                    return false;
                } else {
                    if (!var2 && var7 >= this.field3898 - 16 && var7 <= 16 + this.field3898 && var8 >= this.field3858 - 16 && var8 <= 16 + this.field3858) {
                        var1.method2164(this.field3853, 1423007257);
                    }

                    return true;
                }
            } else {
                return true;
            }
        }
    }

    void method2440(Interactable var1, class639[] var2) {
        if (this.field3855) {
            int var3 = var1.method2161(var2, -331363526);
            this.field3853.method4844(var3, var2);
        }

        if (this.field3862 == this.field3866) {
            boolean var9 = false;
            boolean var4 = false;
            RegionOffset var5 = var1.getRegion().regionOffset;
            int var6;
            int var7;
            if (var1 instanceof Animable) {
                var6 = ((Animable) var1).field8299;
                var7 = ((Animable) var1).field8296;
            } else {
                var6 = (int) var5.offsetX >> this.field3849;
                var7 = (int) var5.offsetY >> this.field3849;
            }

            class919 var8 = new class919();
            var8.field10426 = this.method2409(var6, var7, (byte) 76);
            var8.field10425 = this.method2408(var6, var7, (byte) -5);
            var8.field10427 = this.method2410(var6, var7, (byte) 11);
            var8.field10429 = this.method2411(var6, var7, (byte) 27);
            var8.field10430 = this.method2454(var6, var7, -1020454437);
            var8.field10432 = this.method2412(var6, var7, -1965414520);
            this.field3853.method4887(this.field3864[0].method3887((int) var5.offsetX, (int) var5.offsetY, -1986155301), var8);
        }

        class192 var10 = var1.method2201(this.field3853, -461368503);
        if (var10 != null) {
            if (var10.field7023) {
                var10.field7022 = var1;
                this.field3873.method4611(var10, 469995096);
            } else {
                class661.method5743(var10, (byte) -93);
            }
        }

    }

    public void method2441(class770 var1, int var2, int var3, int var4, boolean[] var5, int var6) {
        try {
            if (this.field3866 != this.field3862) {
                int var7 = this.field3864[var2].method3887(var3, var4, -1918392290);

                for (int var8 = 0; var8 <= var2; ++var8) {
                    if (var5 == null || var5[var8]) {
                        SceneGraphLevel var9 = this.field3864[var8];
                        if (var9 == null) {
                            if (var6 <= 16711935) {
                                break;
                            }
                        } else {
                            var9.method3891(var1, var3, var7 - var9.method3887(var3, var4, -1764966761), var4, 0, false);
                        }
                    }
                }
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "nu.ar(" + ')');
        }
    }

    void method2442(int var1, int var2, int var3) {
        try {
            class770 var4 = null;

            for (int var5 = var1; var5 < var2; ++var5) {
                SceneGraphLevel var6 = this.field3864[var5];
                if (var6 != null) {
                    for (int var7 = 0; var7 < this.field3894; ++var7) {
                        for (int var8 = 0; var8 < this.field3859; ++var8) {
                            var4 = var6.method3889(var8, var7, var4);
                            if (var4 != null) {
                                int var9 = var8 << this.field3849;
                                int var10 = var7 << this.field3849;

                                for (int var11 = var5 - 1; var11 >= 0; --var11) {
                                    SceneGraphLevel var12 = this.field3864[var11];
                                    if (var12 == null) {
                                        if (var3 == -787522086) {
                                            return;
                                        }
                                    } else {
                                        int var13 = var6.method3888(var8, var7, (byte) -85) - var12.method3888(var8, var7, (byte) -14);
                                        int var14 = var6.method3888(1 + var8, var7, (byte) -116) - var12.method3888(1 + var8, var7, (byte) -55);
                                        int var15 = var6.method3888(1 + var8, var7 + 1, (byte) -109) - var12.method3888(1 + var8, var7 + 1, (byte) -78);
                                        int var16 = var6.method3888(var8, 1 + var7, (byte) -117) - var12.method3888(var8, 1 + var7, (byte) -112);
                                        var12.method3890(var4, var9, (var16 + var15 + var13 + var14) / 4, var10, 0, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "nu.ac(" + ')');
        }
    }

    public void method2443(byte var1) {
        try {
            for (int var2 = 0; var2 < this.field3901; ++var2) {
                if (!this.field3904[var2]) {
                    class321 var3 = this.field3903[var2];
                    class639 var4 = var3.field1046;
                    int var5 = var3.field1054;
                    int var6 = var4.method5907(-2066581282) - this.field3891;
                    int var7 = 1 + (2 * var6 >> this.field3849);
                    int var8 = 0;
                    int[] var9 = new int[var7 * var7];
                    int var10 = var4.method5902(823958259) - var6 >> this.field3849;
                    int var11 = var4.method5904((byte) 84) - var6 >> this.field3849;
                    int var12 = var4.method5904((byte) 73) + var6 >> this.field3849;
                    if (var11 < 0) {
                        var8 -= var11;
                        var11 = 0;
                    }

                    if (var12 >= this.field3894) {
                        var12 = this.field3894 - 1;
                    }

                    for (int var13 = var11; var13 <= var12; ++var13) {
                        short var14 = var3.field1059[var8];
                        int var15 = var14 >>> 8;
                        int var16 = var7 * var8 + var15;
                        int var17 = (var14 >>> 8) + var10;
                        int var18 = var17 + (var14 & 255) - 1;
                        if (var17 < 0) {
                            var16 -= var17;
                            var17 = 0;
                        }

                        if (var18 >= this.field3859) {
                            var18 = this.field3859 - 1;
                        }

                        for (int var19 = var17; var19 <= var18; ++var19) {
                            byte var20 = 1;
                            Animable var21 = this.method2429(var5, var19, var13, (class832) null, -741941433);
                            if (var21 != null && var21.field8301 != 0) {
                                boolean var22;
                                boolean var23;
                                short var24;
                                int var25;
                                int var26;
                                if (1 == var21.field8301) {
                                    var22 = var19 - 1 >= var17;
                                    var23 = var19 + 1 <= var18;
                                    if (!var22 && var13 + 1 <= var12) {
                                        var24 = var3.field1059[var8 + 1];
                                        var25 = var10 + (var24 >>> 8);
                                        var26 = var25 + (var24 & 255);
                                        var22 = var19 > var25 && var19 < var26;
                                    }

                                    if (!var23 && var13 - 1 >= var11) {
                                        var24 = var3.field1059[var8 - 1];
                                        var25 = (var24 >>> 8) + var10;
                                        var26 = (var24 & 255) + var25;
                                        var23 = var19 > var25 && var19 < var26;
                                    }

                                    if (var22 && !var23) {
                                        var20 = 4;
                                    } else if (var23 && !var22) {
                                        var20 = 2;
                                    }
                                } else {
                                    var22 = var19 - 1 >= var17;
                                    var23 = 1 + var19 <= var18;
                                    if (!var22 && var13 - 1 >= var11) {
                                        var24 = var3.field1059[var8 - 1];
                                        var25 = var10 + (var24 >>> 8);
                                        var26 = (var24 & 255) + var25;
                                        var22 = var19 > var25 && var19 < var26;
                                    }

                                    if (!var23 && var13 + 1 <= var12) {
                                        var24 = var3.field1059[1 + var8];
                                        var25 = (var24 >>> 8) + var10;
                                        var26 = (var24 & 255) + var25;
                                        var23 = var19 > var25 && var19 < var26;
                                    }

                                    if (var22 && !var23) {
                                        var20 = 3;
                                    } else if (var23 && !var22) {
                                        var20 = 5;
                                    }
                                }
                            }

                            var9[var16++] = var20;
                        }

                        ++var8;
                    }

                    this.field3904[var2] = true;
                    if (field3885) {
                        this.field3862[var5].method3892(var4, var9);
                    }
                }
            }

        } catch (RuntimeException var27) {
            throw class158.method3445(var27, "nu.bf(" + ')');
        }
    }

    public void method2444(int var1) {
        try {
            for (int var2 = 0; var2 < this.field3859; ++var2) {
                for (int var3 = 0; var3 < this.field3894; ++var3) {
                    if (this.field3861[0][var2][var3] == null) {
                        this.field3861[0][var2][var3] = new SceneTile(0);
                    }
                }
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nu.p(" + ')');
        }
    }

    public void method2445(class321 var1, int var2) {
        try {
            if (this.field3901 < 65391) {
                class639 var3 = var1.field1046;
                this.field3903[this.field3901] = var1;
                this.field3904[this.field3901] = false;
                ++this.field3901;
                int var4 = var1.field1054;
                if (var1.field1057) {
                    var4 = 0;
                }

                int var5 = var1.field1054;
                if (var1.field1056) {
                    var5 = this.field3893 - 1;
                }

                for (int var6 = var4; var6 <= var5; ++var6) {
                    int var7 = 0;
                    int var8 = var3.method5904((byte) 46) - var3.method5907(1506691) + this.field3891 >> this.field3849;
                    if (var8 < 0) {
                        var7 -= var8;
                        var8 = 0;
                    }

                    int var9 = var3.method5904((byte) 8) + var3.method5907(-884319007) - this.field3891 >> this.field3849;
                    if (var9 >= this.field3894) {
                        var9 = this.field3894 - 1;
                    }

                    for (int var10 = var8; var10 <= var9; ++var10) {
                        short var11 = var1.field1059[var7++];
                        int var12 = (var3.method5902(823958259) - var3.method5907(-701525248) + this.field3891 >> this.field3849) + (var11 >>> 8);
                        int var13 = var12 + (var11 & 255) - 1;
                        if (var12 < 0) {
                            var12 = 0;
                        }

                        if (var13 >= this.field3859) {
                            var13 = this.field3859 - 1;
                        }

                        for (int var14 = var12; var14 <= var13; ++var14) {
                            long var15 = this.field3899[var6][var14][var10];
                            if ((var15 & 65535L) == 0L) {
                                this.field3899[var6][var14][var10] = var15 | (long) this.field3901;
                            } else if ((var15 & 4294901760L) == 0L) {
                                this.field3899[var6][var14][var10] = var15 | (long) this.field3901 << 16;
                            } else if ((var15 & 281470681743360L) == 0L) {
                                this.field3899[var6][var14][var10] = var15 | (long) this.field3901 << 32;
                            } else if ((var15 & -281474976710656L) == 0L) {
                                this.field3899[var6][var14][var10] = var15 | (long) this.field3901 << 48;
                            }
                        }
                    }
                }
            }

        } catch (RuntimeException var17) {
            throw class158.method3445(var17, "nu.bd(" + ')');
        }
    }

    public void method2446(boolean var1, int var2) {
        try {
            if (var1) {
                this.field3861 = this.oglTiles;
                this.field3862 = this.field3866;
            } else {
                this.field3861 = this.field3863;
                this.field3862 = this.field3864;
            }

            this.field3893 = this.field3861.length;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "nu.b(" + ')');
        }
    }

    public void method2447(int var1, int var2, int var3, int var4, class168 var5, int var6) {
        try {
            SceneTile var7 = this.method2406(var1, var2, var3, 1185117443);
            if (var7 != null) {
                var5.method1514(new RegionOffset((float) ((var2 << this.field3849) + this.field3891), (float) var4, (float) ((var3 << this.field3849) + this.field3891)));
                var7.opt1 = var5;
                int var8 = this.field3866 == this.field3862 ? 1 : 0;
                if (var5.method2206((byte) 13)) {
                    if (var5.method2183((short) 255)) {
                        var5.field3637 = this.interactables4[var8];
                        this.interactables4[var8] = var5;
                    } else {
                        var5.field3637 = this.interactables2[var8];
                        this.interactables2[var8] = var5;
                    }
                } else {
                    var5.field3637 = this.interactables3[var8];
                    this.interactables3[var8] = var5;
                }
            }

        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "nu.h(" + ')');
        }
    }

    public class732 method2448(int var1, int var2, int var3, byte var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 != null) {
                this.method2424(var5.wallDecoration, 1998851021);
                if (var5.wallDecoration != null) {
                    class732 var6 = var5.wallDecoration;
                    var5.wallDecoration = null;
                    return var6;
                }
            }

            return null;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.o(" + ')');
        }
    }

    public boolean method2449(class770 var1, int var2, int var3, int var4, boolean[] var5, int var6) {
        try {
            boolean var7 = false;
            if (this.field3866 != this.field3862) {
                int var8 = this.field3864[var2].method3887(var3, var4, -1298291430);

                for (int var9 = 0; var9 <= var2; ++var9) {
                    SceneGraphLevel var10 = this.field3864[var9];
                    if (var10 == null) {
                        if (var6 == 2008908432) {
                            throw new IllegalStateException();
                        }
                    } else {
                        int var11 = var8 - var10.method3887(var3, var4, -1859389272);
                        if (var5 != null) {
                            var5[var9] = var10.method3908(var1, var3, var11, var4, 0, false);
                            if (!var5[var9]) {
                                if (var6 == 2008908432) {
                                    throw new IllegalStateException();
                                }
                                continue;
                            }
                        }

                        var10.method3890(var1, var3, var11, var4, 0, false);
                        var7 = true;
                    }
                }
            }

            return var7;
        } catch (RuntimeException var12) {
            throw class158.method3445(var12, "nu.au(" + ')');
        }
    }

    public void method2450(int var1, SceneGraphLevel var2, byte var3) {
        try {
            this.field3862[var1] = var2;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.u(" + ')');
        }
    }

    public void method2451(int var1, int var2, int var3, class824 var4, int var5) {
        try {
            SceneTile var6 = this.method2406(var1, var2, var3, 996825081);
            if (var6 != null) {
                var6.opt2 = var4;
                int var7 = this.field3862 == this.field3866 ? 1 : 0;
                if (var4.method2206((byte) 13)) {
                    if (var4.method2183((short) 255)) {
                        var4.field3637 = this.interactables4[var7];
                        this.interactables4[var7] = var4;
                    } else {
                        var4.field3637 = this.interactables2[var7];
                        this.interactables2[var7] = var4;
                    }
                } else {
                    var4.field3637 = this.interactables3[var7];
                    this.interactables3[var7] = var4;
                }
            }

        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "nu.t(" + ')');
        }
    }

    public class824 method2452(int var1, int var2, int var3, byte var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            return var5 != null && var5.opt2 != null ? var5.opt2 : null;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "nu.az(" + ')');
        }
    }

    public class168 method2453(int var1, int var2, int var3, byte var4) {
        try {
            SceneTile var5 = this.field3861[var1][var2][var3];
            if (var5 == null) {
                return null;
            } else {
                class168 var6 = var5.opt1;
                var5.opt1 = null;
                this.method2424(var6, 113491731);
                return var6;
            }
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "nu.aa(" + ')');
        }
    }

    public int method2454(int var1, int var2, int var3) {
        try {
            return this.field3871 != null ? this.field3871[var1][var2] & 255 : 0;
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "nu.s(" + ')');
        }
    }
}
