public class Npc extends Actor {
    public int field1626 = -1;
    public int field1627 = -1;
    public class692 field1628;
    public int field1629 = 1;
    public int field1630 = 1;
    public int field1631 = -1;
    public String name;
    public class221 field1634 = new class221(32);
    public int field1636;
    public NpcDefinition field1637;
    int[] field1625 = new int[6];
    int[] field1632 = new int[6];
    int field1635;
    int field1638;
    int field1639;
    int field1640;

    public Npc(SceneGraph var1, int var2) {
        super(var1, var2);
        this.method1237(684373346);
    }

    public Npc(SceneGraph var1) {
        super(var1);
        this.method1237(684373346);
    }

    void method1237(int var1) {
        try {
            this.field1635 = 32 + (int) (Math.random() * 4.0D);
            this.field1638 = 3 + (int) (Math.random() * 2.0D);
            this.field1639 = 16 + (int) (Math.random() * 3.0D);
            if (class615.field8903.field9123.method5845(2100839354) == 1) {
                this.field1640 = (int) (Math.random() * 6.0D);
            } else {
                this.field1640 = (int) (Math.random() * 12.0D);
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.gf(" + ')');
        }
    }

    public class719 method2165(class848 var1, byte var2) {
        return null;
    }

    class192 method2201(class848 var1, int var2) {
        try {
            if (this.field1637 != null && this.method1238(var1, 526336, -1241441124)) {
                class135 var3 = this.method1521();
                class446 var4 = this.getRegion();
                class135 var5 = var1.method5048();
                int var6 = super.field4048.method5553((byte) 0);
                SceneTile var7 = super.field3638.field3861[super.field3639][(int) var4.regionOffset.offsetX >> 9][(int) var4.regionOffset.offsetY >> 9];
                if (var7 != null && var7.opt2 != null) {
                    int var8 = super.field4086 - var7.opt2.field9059;
                    super.field4086 = (int) ((float) super.field4086 - (float) var8 / 10.0F);
                } else {
                    super.field4086 = (int) ((float) super.field4086 - (float) super.field4086 / 10.0F);
                }

                var5.method1024(var3);
                var5.method1018(0.0F, (float) (-20 - super.field4086), 0.0F);
                class507 var15 = this.method2554(1744135386);
                NpcDefinition var9 = this.field1637.field9924 != null ? this.field1637.method6110(class827.field9037, 1631739764) : this.field1637;
                super.field4093 = false;
                class192 var10 = null;
                if (class615.field8903.field9127.method4421(-1104068428) == 1 && var9.field9901 && var15.field4014) {
                    Animator var11 = super.activeAnimator.method2775((byte) -29) && super.activeAnimator.method2782(-65534) ? super.activeAnimator : null;
                    Animator var12 = !super.passiveAnimator.method2775((byte) -63) || super.field4058 && var11 != null ? null : super.passiveAnimator;
                    class879 var13 = class623.method5320(var1, var6, super.field4061, super.field4037, super.field4038, this.field1637.field9923, super.field4046[0], this.field1637.field9927 & '\uffff', this.field1637.field9889 & '\uffff', this.field1637.field9904 & 255, this.field1637.field9888 & 255, var12 != null ? var12 : var11, 1812843484);
                    if (var13 != null) {
                        if (super.field3642 == null || super.field3642.length < super.field4046.length + 1) {
                            this.method2169(super.field4046.length + 1, 1538315389);
                        }

                        var10 = class221.method4033(this.method1243(1869849139), 1879615126);
                        super.field4093 = true;
                        var1.method4869(false);
                        var13.method5965(var5, super.field3642[super.field4046.length], 0);
                        var1.method4869(true);
                    }
                }

                if (super.field3642 == null || super.field3642.length < super.field4046.length) {
                    this.method2169(super.field4046.length, -241324715);
                }

                if (var10 == null) {
                    var10 = class221.method4033(this.method1243(1869849139), 1797748717);
                }

                this.method2573(var1, super.field4046, var5, false, 879327846);

                int var16;
                for (var16 = 0; var16 < super.field4046.length; ++var16) {
                    if (super.field4046[var16] != null) {
                        if (this.field1637.field9929) {
                            super.field4046[var16].method5987(this.field1635, this.field1638, this.field1639, this.field1640);
                        }

                        super.field4046[var16].method5965(var5, super.field3642[var16], 0);
                    }
                }

                if (super.field4031 != null) {
                    class874 var17 = super.field4031.method1729();
                    var1.method4866(var17);
                }

                for (var16 = 0; var16 < super.field4046.length; ++var16) {
                    if (super.field4046[var16] != null) {
                        super.field4093 |= super.field4046[var16].method5989();
                    }

                    super.field4046[var16] = null;
                }

                super.field4030 = class730.field2758;
                return var10;
            } else {
                return null;
            }
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "ake.bo(" + ')');
        }
    }

    boolean method1238(class848 var1, int var2, int var3) {
        try {
            int var4 = var2;
            class507 var5 = this.method2554(979705538);
            Animator var6 = super.activeAnimator.method2775((byte) -97) && !super.activeAnimator.method2782(-65534) ? super.activeAnimator : null;
            Animator var7 = !super.passiveAnimator.method2775((byte) -121) || super.field4058 && var6 != null ? null : super.passiveAnimator;
            int var8 = var5.field3993;
            int var9 = var5.field3994;
            if (var8 != 0 || var9 != 0 || var5.field4006 != 0 || var5.field4009 != 0) {
                var2 |= 7;
            }

            boolean var10 = super.field4094 != 0 && class730.field2866 >= super.field4069 && class730.field2866 < super.field4070;
            if (var10) {
                var2 |= 524288;
            }

            int var11 = super.field4048.method5553((byte) 0);
            class879 var12 = super.field4046[0] = this.field1637.method6106(var1, var2, class283.field10614, class827.field9037, var6, var7, super.field4076, super.field4049, var11, this.field1628, this.method2560(-1491129226), false, -679459424);
            if (var12 == null) {
                return false;
            } else {
                super.field4053 = var12.method5976();
                var12.method5973();
                this.method2551(var12, 839093609);
                if (var8 == 0 && var9 == 0) {
                    this.method2553(var11, this.method2550() << 9, this.method2550() << 9, 0, 0, 1757570363);
                } else {
                    this.method2553(var11, var8, var9, var5.field3992, var5.field3998, 1232740545);
                    if (super.field4061 != 0) {
                        super.field4046[0].method5952(super.field4061);
                    }

                    if (super.field4037 != 0) {
                        super.field4046[0].method6041(super.field4037);
                    }

                    if (super.field4038 != 0) {
                        super.field4046[0].method5953(0, super.field4038, 0);
                    }
                }

                if (var10) {
                    var12.method5987(super.field4081, super.field4072, super.field4073, super.field4094 & 255);
                }

                this.method2552(var1, var5, var4, var8, var9, var11, 614564932);
                return true;
            }
        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "ake.gx(" + ')');
        }
    }

    void method2164(class848 var1, int var2) {
        try {
            if (this.field1637 != null && (super.field4092 || this.method1238(var1, 0, -1205291751))) {
                class135 var3 = var1.method5048();
                var3.method1024(this.method1521());
                var3.method1018(0.0F, -5.0F, 0.0F);
                this.method2573(var1, super.field4046, var3, super.field4092, 1317836884);

                for (int var4 = 0; var4 < super.field4046.length; ++var4) {
                    super.field4046[var4] = null;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "ake.bb(" + ')');
        }
    }

    public final void method1239(class77 var1, int var2, short var3) {
        try {
            int var4 = super.field4085[0];
            int var5 = super.field4055[0];
            switch (var1.field1510) {
                case 0:
                    ++var4;
                    --var5;
                    break;
                case 1:
                    --var4;
                    break;
                case 2:
                    --var5;
                    break;
                case 3:
                    ++var4;
                    ++var5;
                    break;
                case 4:
                    --var4;
                    ++var5;
                    break;
                case 5:
                    --var4;
                    --var5;
                    break;
                case 6:
                    ++var4;
                    break;
                case 7:
                    ++var5;
            }

            if (super.activeAnimator.method2775((byte) -128) && super.activeAnimator.method2776(1057375366).field6673 == 1) {
                super.field4057 = null;
                super.activeAnimator.method2777(-1, -1581174742);
            }

            int var6;
            for (var6 = 0; var6 < super.field4040.length; ++var6) {
                if (super.field4040[var6].field10341 != -1) {
                    class745 var7 = class635.field9823.method1053(super.field4040[var6].field10341, -1708083255);
                    if (var7.field4117 && var7.field4107 != -1 && class936.field10313.method2256(var7.field4107, (byte) -23).field6673 == 1) {
                        super.field4040[var6].field10340.method2777(-1, -1871121711);
                        super.field4040[var6].field10341 = -1; // idk this one
                    }
                }
            }

            if (super.field4084 < super.field4085.length - 1) {
                ++super.field4084;
            }

            for (var6 = super.field4084; var6 > 0; --var6) {
                super.field4085[var6] = super.field4085[var6 - 1];
                super.field4055[var6] = super.field4055[var6 - 1];
                super.field4074[var6] = super.field4074[var6 - 1];
            }

            super.field4085[0] = var4;
            super.field4055[0] = var5;
            super.field4074[0] = (byte) var2;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "ake.gk(" + ')');
        }
    }

    public void method1240(int var1, int var2, int var3, boolean var4, int var5, byte var6) {
        try {
            super.field3639 = super.field3640 = (byte) var1;
            if (class730.field2697.method5296(1132456995).method3386(var2, var3, 1587070733)) {
                ++super.field3640;
            }

            if (super.activeAnimator.method2775((byte) -33) && super.activeAnimator.method2776(1592092831).field6673 == 1) {
                super.field4057 = null;
                super.activeAnimator.method2777(-1, -1899534119);
            }

            int var7;
            for (var7 = 0; var7 < super.field4040.length; ++var7) {
                if (-1 != super.field4040[var7].field10341) {
                    class745 var8 = class635.field9823.method1053(super.field4040[var7].field10341, -1738473272);
                    if (var8.field4117 && -1 != var8.field4107 && class936.field10313.method2256(var8.field4107, (byte) 83).field6673 == 1) {
                        super.field4040[var7].field10340.method2777(-1, -1950379754);
                        super.field4040[var7].field10341 = -1;
                    }
                }
            }

            if (!var4) {
                var7 = var2 - super.field4085[0];
                int var12 = var3 - super.field4055[0];
                if (var7 >= -8 && var7 <= 8 && var12 >= -8 && var12 <= 8) {
                    if (super.field4084 < super.field4085.length - 1) {
                        ++super.field4084;
                    }

                    for (int var9 = super.field4084; var9 > 0; --var9) {
                        super.field4085[var9] = super.field4085[var9 - 1];
                        super.field4055[var9] = super.field4055[var9 - 1];
                        super.field4074[var9] = super.field4074[var9 - 1];
                    }

                    super.field4085[0] = var2;
                    super.field4055[0] = var3;
                    super.field4074[0] = class647.field9228.field9230;
                    return;
                }
            }

            super.field4084 = 0;
            super.field4089 = 0;
            super.field4088 = 0;
            super.field4085[0] = var2;
            super.field4055[0] = var3;
            RegionOffset var11 = RegionOffset.translate(this.getRegion().regionOffset);
            var11.offsetX = (float) ((var5 << 8) + (super.field4085[0] << 9));
            var11.offsetY = (float) ((super.field4055[0] << 9) + (var5 << 8));
            this.method1514(var11);
            var11.method3291();
            if (super.field4031 != null) {
                super.field4031.method1720();
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "ake.gr(" + ')');
        }
    }

    public final boolean method1241(int var1) {
        try {
            return this.field1637 != null;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.gy(" + ')');
        }
    }

    int method2560(int var1) {
        try {
            if (-1 != this.field1631) {
                return this.field1631;
            } else {
                if (this.field1637.field9924 != null) {
                    NpcDefinition var2 = this.field1637.method6110(class827.field9037, 1794284929);
                    if (var2 != null && var2.field9868 != -1) {
                        return var2.field9868;
                    }
                }

                return this.field1637.field9868;
            }
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.t(" + ')');
        }
    }

    public int method2555(byte var1) {
        try {
            if (this.field1637.field9924 != null) {
                NpcDefinition var2 = this.field1637.method6110(class827.field9037, 1605369279);
                if (var2 != null && -1 != var2.field9914) {
                    return var2.field9914;
                }
            }

            return this.field1637.field9914;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.h(" + ')');
        }
    }

    boolean method1243(int var1) {
        try {
            return this.field1637.field9899;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.gu(" + ')');
        }
    }

    int method2163(byte var1) {
        try {
            return this.field1637 == null ? 0 : this.field1637.field9928;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.dh(" + ')');
        }
    }

    boolean method2157(class848 var1, int var2, int var3, byte var4) {
        try {
            if (this.field1637 != null && this.method1238(var1, 131072, -1046532898)) {
                class135 var5 = this.method1521();
                boolean var6 = false;

                int var7;
                for (var7 = 0; var7 < super.field4046.length; ++var7) {
                    if (super.field4046[var7] != null) {
                        boolean var8;
                        label66:
                        {
                            if (this.field1637.field9928 <= 0) {
                                label65:
                                {
                                    if (this.field1637.field9925 == -1) {
                                        if (1 == this.field1637.field9923) {
                                            if (var4 != 1) {
                                                throw new IllegalStateException();
                                            }
                                            break label65;
                                        }
                                    } else if (1 == this.field1637.field9925) {
                                        break label65;
                                    }

                                    var8 = false;
                                    break label66;
                                }
                            }

                            var8 = true;
                        }

                        boolean var10 = super.field4046[var7].method6097(var2, var3, var5, var8, this.field1637.field9928);
                        if (var10) {
                            var6 = true;
                            break;
                        }
                    }
                }

                for (var7 = 0; var7 < super.field4046.length; ++var7) {
                    super.field4046[var7] = null;
                }

                return var6;
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "ake.bu(" + ')');
        }
    }

    final void method2205(byte var1) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.bq(" + ')');
        }
    }

    public void method1244(int var1, int var2, int var3, int var4) {
        try {
            this.field1625[var1] = var2;
            this.field1632[var1] = var3;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ake.gz(" + ')');
        }
    }

    public boolean method2557(byte var1) {
        try {
            return NodeTable.field4931.field9532;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.by(" + ')');
        }
    }

    public class625 method2565(int var1) {
        try {
            return super.field4082 != null && super.field4082.field9748 == null ? null : super.field4082;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.bl(" + ')');
        }
    }

    public void method1245(String var1, int var2, int var3, int var4) {
        try {
            int var5 = class854.method5151((byte) 6) * NodeTable.field4931.field9527;
            this.method2558(var1, var2, var3, var5, (byte) -1);
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "ake.gd(" + ')');
        }
    }

    public int method1246(int var1, int var2) {
        try {
            return this.field1625[var1];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ake.gh(" + ')');
        }
    }

    final boolean method2173(int var1) {
        return false;
    }

    public int method2170(byte var1) {
        try {
            if (this.field1637.field9924 != null) {
                NpcDefinition var2 = this.field1637.method6110(class827.field9037, 1652651645);
                if (var2 != null && var2.field9879 != -1) {
                    return var2.field9879;
                }
            }

            return this.field1637.field9879 != -1 ? -1575020259 * this.field1637.field9879 * 1816293685 : super.method2170((byte) 61);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "ake.bx(" + ')');
        }
    }

    public void method1248(NpcDefinition var1, int var2) {
        try {
            if (var1 != this.field1637 && class602.field8645 && class779.method2322(super.field4028, 351851633)) {
                class979.method1835(2025307040);
            }

            this.field1637 = var1;
            if (this.field1637 != null) {
                this.name = this.field1637.name;
                this.field1636 = this.field1637.field9885;
            }

            if (super.field4031 != null) {
                super.field4031.method1720();
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ake.gb(" + ')');
        }
    }

    final void method2162(class848 var1, Interactable var2, int var3, int var4, int var5, boolean var6, int var7) {
        try {
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class158.method3445(var9, "ake.bk(" + ')');
        }
    }

    public int method1250(int var1, byte var2) {
        try {
            return this.field1632[var1];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "ake.ga(" + ')');
        }
    }

    public Tile getLocation() {
        RegionOffset region = this.getRegion().regionOffset;
        RegionBase var4 = class730.field2697.getRegionBase(681479919);
        int x = ((int) region.offsetX >> 9) + var4.baseX;
        int y = ((int) region.offsetY >> 9) + var4.baseY;
        return new Tile(x, y);
    }

}
