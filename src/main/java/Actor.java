public abstract class Actor extends Animable {

    static int field4026 = 5;
    static int field4036 = 20;
    public int field4027;
    public int field4028;
    public int field4030;
    public int field4032;
    public int field4033;
    public int field4034;
    public int field4035;
    public int field4039;
    public int[] field4043;
    public int[] field4044;
    public int[] field4045;
    public int[] field4047;
    public int[] field4049;
    public int field4050;
    public int field4051;
    public int field4052;
    public int field4054;
    public int[] field4055;
    public int[] field4056;
    public int[] field4057;
    public boolean field4058;
    public int field4059;
    public int field4060;
    public int field4062;
    public int field4063;
    public int field4064;
    public int field4065;
    public int[] field4066;
    public int field4067;
    public int field4068;
    public int field4069;
    public int field4070;
    public byte field4072;
    public byte field4073;
    public byte[] field4074;
    public class761[] field4076;
    public class879[] field4046;
    public class932[] field4040;
    public class890 field4077;
    public class890 field4075;
    public class890 field4048;
    public Animator passiveAnimator;
    public Animator activeAnimator;
    public WidgetContainer field4095;
    public int field4078;
    public int field4079;
    public int field4080;
    public byte field4081;
    public boolean field4083;
    public int field4084;
    public int[] field4085;
    public boolean field4087;
    public int field4088;
    public int field4089;
    public int field4090;
    public int[] field4091;
    public byte field4094;
    public int field4096;
    int field4029;
    int field4037;
    int field4038;
    int field4053;
    int field4061;
    int field4071;
    class726 field4031;
    class625 field4082;
    int field4086;
    boolean field4092;
    boolean field4093;
    byte field4097;

    Actor(SceneGraph var1, int var2) {
        super(var1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        this.field4029 = 1;
        this.field4053 = -32768;
        this.field4087 = true;
        this.field4033 = 0;
        this.field4034 = -1;
        this.field4035 = 0;
        this.field4086 = 0;
        this.field4097 = 0;
        this.field4066 = new int[NodeTable.field4931.field9523];
        this.field4043 = new int[NodeTable.field4931.field9523];
        this.field4044 = new int[NodeTable.field4931.field9523];
        this.field4045 = new int[NodeTable.field4931.field9523];
        this.field4091 = new int[NodeTable.field4931.field9523];
        this.field4047 = new int[NodeTable.field4931.field9523];
        this.field4080 = -1000;
        this.field4050 = -1000;
        this.field4083 = false;
        this.field4054 = -1;
        this.field4057 = null;
        this.field4058 = false;
        this.passiveAnimator = new class511(this, false);
        this.activeAnimator = new class511(this, false);
        this.field4069 = -1;
        this.field4070 = -1;
        this.field4094 = 0;
        this.field4039 = 0;
        this.field4078 = 0;
        this.field4079 = 256;
        this.field4048 = new class890();
        this.field4077 = new class890();
        this.field4075 = new class890();
        this.field4084 = 0;
        this.field4088 = 0;
        this.field4089 = 0;
        this.field4090 = 0;
        this.field4092 = false;
        this.field4093 = false;
        this.field4096 = -1;
        this.field4071 = -1;
        this.field4085 = new int[var2];
        this.field4055 = new int[var2];
        this.field4074 = new byte[var2];
        this.field4046 = new class879[5];
        this.field4040 = new class932[4];

        for (int var3 = 0; var3 < 4; ++var3) {
            this.field4040[var3] = new class932(this);
        }

        this.field4076 = new class761[class413.field9412.field1542.length];
    }

    Actor(SceneGraph var1) {
        this(var1, 10);
    }

    public void method2541(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        try {
            if (this.method2567(-1427124632)) {
                class730.method1760(this.field4095, this.field4095.method887((byte) 20), -1, var1, var2, var3, var4, var5, var6, var7, var8);
            }

        } catch (RuntimeException var11) {
            throw class158.method3445(var11, "akn.cx(" + ')');
        }
    }

    boolean method2206(byte var1) {
        return false;
    }

    public void method2542(int var1, byte var2) {
        try {
            class507 var3 = this.method2554(654212117);
            if (var3.field4002 != 0 || this.field4079 != 0) {
                this.field4048.method5554((byte) 67);
                int var4 = var1 - this.field4048.field9268 & 16383;
                if (var4 > 8192) {
                    this.field4032 = this.field4048.field9268 - (16384 - var4);
                } else {
                    this.field4032 = this.field4048.field9268 + var4;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "akn.a(" + ')');
        }
    }

    public void method2543(int var1, boolean var2, int var3) {
        try {
            class507 var4 = this.method2554(-124866780);
            if (var2 || var4.field4002 != 0 || this.field4079 != 0) {
                this.field4032 = var1 & 16383;
                this.field4048.method5552(this.field4032, -1986657311);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "akn.f(" + ')');
        }
    }

    void method2544(byte var1) {
        try {
            if (-1 != this.field4096) {
                class554.method429(this.field4096, -1417106299);
                this.field4095 = null;
                this.field4096 = -1;
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.cs(" + ')');
        }
    }

    public boolean method2545(int var1, int var2, byte var3) {
        try {
            if (this.field4049 == null) {
                if (-1 == var2) {
                    return true;
                }

                this.field4049 = new int[class413.field9412.field1542.length];

                for (int var4 = 0; var4 < class413.field9412.field1542.length; ++var4) {
                    this.field4049[var4] = -1;
                }
            }

            class507 var11 = this.method2554(-401641714);
            int var5 = 256;
            if (var11.field4000 != null && var11.field4000[var1] > 0) {
                var5 = var11.field4000[var1];
            }

            int var6;
            int var7;
            if (-1 == var2) {
                if (this.field4049[var1] == -1) {
                    return true;
                } else {
                    var6 = this.field4048.method5553((byte) 0);
                    var7 = this.field4049[var1];
                    int var8 = var6 - var7;
                    if (var8 >= -var5 && var8 <= var5) {
                        this.field4049[var1] = -1;

                        for (int var9 = 0; var9 < class413.field9412.field1542.length; ++var9) {
                            if (this.field4049[var9] != -1) {
                                return true;
                            }
                        }

                        this.field4049 = null;
                        return true;
                    } else {
                        if ((var8 <= 0 || var8 > 8192) && var8 > -8192) {
                            this.field4049[var1] = var7 - var5 & 16383;
                        } else {
                            this.field4049[var1] = var7 + var5 & 16383;
                        }

                        return false;
                    }
                }
            } else {
                if (-1 == this.field4049[var1]) {
                    this.field4049[var1] = this.field4048.method5553((byte) 0);
                }

                var6 = this.field4049[var1];
                var7 = var2 - var6;
                if (var7 >= -var5 && var7 <= var5) {
                    this.field4049[var1] = var2;
                    return true;
                } else {
                    if ((var7 <= 0 || var7 > 8192) && var7 > -8192) {
                        this.field4049[var1] = var6 - var5 & 16383;
                    } else {
                        this.field4049[var1] = var5 + var6 & 16383;
                    }

                    return false;
                }
            }
        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "akn.i(" + ')');
        }
    }

    public final void method2546(int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
        try {
            class932 var8 = this.field4040[var6];
            int var9 = var8.field10341;
            if (var1 != -1 && var9 != -1) {
                class745 var10;
                if (var9 == var1) {
                    var10 = class635.field9823.method1053(var1, -1791372939);
                    if (var10.field4117 && var10.field4107 != -1) {
                        Animation var11 = class936.field10313.method2256(var10.field4107, (byte) -43);
                        int var12 = var11.field6668;
                        if (var12 == 0) {
                            return;
                        }

                        if (2 == var12) {
                            var8.field10340.method2798(1476401100);
                            return;
                        }
                    }
                } else {
                    var10 = class635.field9823.method1053(var1, -1699460112);
                    class745 var16 = class635.field9823.method1053(var9, -1865033182);
                    if (var10.field4107 != -1 && var16.field4107 != -1) {
                        Animation var17 = class936.field10313.method2256(var10.field4107, (byte) 50);
                        Animation var13 = class936.field10313.method2256(var16.field4107, (byte) -13);
                        if (var17.field6662 < var13.field6662) {
                            return;
                        }
                    }
                }
            }

            byte var15 = 0;
            if (var1 != -1 && !class635.field9823.method1053(var1, -2139980686).field4117) {
                var15 = 2;
            }

            if (-1 != var1 && var5) {
                var15 = 1;
            }

            var8.field10341 = var1;
            var8.field10339 = var4;
            var8.field10343 = var2 >> 16;
            var8.field10342 = var3;
            var8.field10340.method2780(-1 != var1 ? class635.field9823.method1053(var1, -2144045629).field4107 * 761293581 * 1505778629 : -1, var2 & '\uffff', var15, false, (byte) 0);
        } catch (RuntimeException var14) {
            throw class158.method3445(var14, "akn.d(" + ')');
        }
    }

    public final void method2547(int var1) {
        try {
            this.field4084 = 0;
            this.field4089 = 0;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.u(" + ')');
        }
    }

    public final void method2548(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
        try {
            boolean var9 = true;
            boolean var10 = true;

            int var11;
            for (var11 = 0; var11 < NodeTable.field4931.field9523; ++var11) {
                if (this.field4044[var11] > var5) {
                    var9 = false;
                } else {
                    var10 = false;
                }
            }

            var11 = -1;
            int var12 = -1;
            int var13 = 0;
            if (var1 >= 0) {
                class399 var14 = class339.field157.method1211(var1, -1682094753);
                var12 = var14.field6576;
                var13 = var14.field6567;
            }

            int var17;
            if (var10) {
                if (var12 == -1) {
                    return;
                }

                var11 = 0;
                var17 = 0;
                if (var12 == 0) {
                    var17 = this.field4044[0];
                } else if (var12 == 1) {
                    var17 = this.field4043[0];
                }

                for (int var15 = 1; var15 < NodeTable.field4931.field9523; ++var15) {
                    if (var12 == 0) {
                        if (this.field4044[var15] < var17) {
                            var11 = var15;
                            var17 = this.field4044[var15];
                        }
                    } else if (1 == var12 && this.field4043[var15] < var17) {
                        var11 = var15;
                        var17 = this.field4043[var15];
                    }
                }

                if (var12 == 1 && var17 >= var2) {
                    return;
                }
            } else {
                if (var9) {
                    this.field4097 = 0;
                }

                for (var17 = 0; var17 < NodeTable.field4931.field9523; ++var17) {
                    byte var18 = this.field4097;
                    this.field4097 = (byte) ((this.field4097 + 1) % NodeTable.field4931.field9523);
                    if (this.field4044[var18] <= var5) {
                        var11 = var18;
                        break;
                    }
                }
            }

            if (var11 >= 0) {
                this.field4066[var11] = var1;
                this.field4043[var11] = var2;
                this.field4091[var11] = var3;
                this.field4047[var11] = var4;
                this.field4044[var11] = var6 + var5 + var13;
                this.field4045[var11] = var7;
            }

        } catch (RuntimeException var16) {
            throw class158.method3445(var16, "akn.x(" + ')');
        }
    }

    public int method2170(byte var1) {
        try {
            class507 var2 = this.method2554(219719478);
            int var3;
            if (var2.field3974 != -1) {
                var3 = var2.field3974;
            } else if (-32768 == this.field4053) {
                var3 = 200;
            } else {
                var3 = -this.field4053;
            }

            class446 var4 = this.getRegion();
            int var5 = (int) var4.regionOffset.offsetX >> 9;
            int var6 = (int) var4.regionOffset.offsetY >> 9;
            if (super.field3638 != null && var5 >= 1 && var6 >= 1 && var5 <= class730.field2697.method5271(-2008930035) - 1 && var6 <= class730.field2697.method5272(-33342416) - 1) {
                SceneTile var7 = super.field3638.field3861[super.field3639][var5][var6];
                if (var7 != null && var7.opt2 != null) {
                    return var3 + var7.opt2.field9059;
                }
            }

            return var3;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "akn.bx(" + ')');
        }
    }

    public void method2549(int var1, int var2) {
        try {
            this.field4029 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akn.r(" + ')');
        }
    }

    public int method2550() {
        try {
            return this instanceof Npc && ((Npc) this).name.equals("Chicken God") ? 5 : this.field4029;
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "akn.q(" + ')');
        }
    }

    public void method4691(int var1) {
        try {
            int var2 = (this.field4029 - 1 << 8) + 240;
            RegionOffset var3 = this.getRegion().regionOffset;
            super.field8299 = (short) ((int) var3.offsetX - var2 >> 9);
            super.field8296 = (short) ((int) var3.offsetY - var2 >> 9);
            super.field8297 = (short) ((int) var3.offsetX + var2 >> 9);
            super.field8298 = (short) ((int) var3.offsetY + var2 >> 9);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akn.ew(" + ')');
        }
    }

    void method2551(class879 var1, int var2) {
        try {
            int var3 = this.field4077.field9268;
            int var4 = this.field4075.field9268;
            if (var3 != 0 || var4 != 0) {
                int var5 = var1.method5976() / 2;
                var1.method5953(0, -var5, 0);
                var1.method6041(var3 & 16383);
                var1.method5952(var4 & 16383);
                var1.method5953(0, var5, 0);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "akn.n(" + ')');
        }
    }

    void method2552(class848 var1, class507 var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            for (int var8 = 0; var8 < this.field4040.length; ++var8) {
                byte var9 = 0;
                if (var8 == 0) {
                    var9 = 2;
                } else if (1 == var8) {
                    var9 = 5;
                } else if (var8 == 2) {
                    var9 = 1;
                } else if (3 == var8) {
                    var9 = 7;
                }

                class932 var10 = this.field4040[var8];
                if (-1 != var10.field10341 && !var10.field10340.method2782(-65534)) {
                    class745 var11 = class635.field9823.method1053(var10.field10341, -2040253952);
                    boolean var12 = var11.field4118 == 3 && (var4 != 0 || var5 != 0);
                    int var13 = var3;
                    if (var12) {
                        var13 = var3 | 7;
                    } else {
                        if (var10.field10342 != 0) {
                            var13 = var3 | 5;
                        }

                        if (var10.field10343 != 0) {
                            var13 |= 2;
                        }

                        if (var10.field10339 >= 0) {
                            var13 |= 7;
                        }
                    }

                    class879 var14 = this.field4046[var8 + 1] = var11.method2590(var1, var13, var10.field10340, var9, 2124203678);
                    if (var14 != null) {
                        if (var10.field10339 >= 0 && var2.field3968 != null && var2.field3968[var10.field10339] != null) {
                            int var15 = 0;
                            int var16 = 0;
                            int var17 = 0;
                            if (var2.field3968 != null && var2.field3968[var10.field10339] != null) {
                                var15 += var2.field3968[var10.field10339][0];
                                var16 += var2.field3968[var10.field10339][1];
                                var17 += var2.field3968[var10.field10339][2];
                            }

                            if (var2.field4011 != null && var2.field4011[var10.field10339] != null) {
                                var15 += var2.field4011[var10.field10339][0];
                                var16 += var2.field4011[var10.field10339][1];
                                var17 += var2.field4011[var10.field10339][2];
                            }

                            if (var17 != 0 || var15 != 0) {
                                int var18 = var6;
                                if (this.field4049 != null && this.field4049[var10.field10339] != -1) {
                                    var18 = this.field4049[var10.field10339];
                                }

                                int var19 = var18 + var10.field10342 * 2048 - var6 & 16383;
                                if (var19 != 0) {
                                    var14.method6016(var19);
                                }

                                int var20 = class703.field3413[var19];
                                int var21 = class703.field3404[var19];
                                int var22 = var21 * var15 + var17 * var20 >> 14;
                                var17 = var21 * var17 - var20 * var15 >> 14;
                                var15 = var22;
                            }

                            var14.method5953(var15, var16, var17);
                        } else if (var10.field10342 != 0) {
                            var14.method6016(var10.field10342 * 2048);
                        }

                        if (var10.field10343 != 0) {
                            var14.method5953(0, -var10.field10343 << 2, 0);
                        }

                        if (var12) {
                            if (this.field4061 != 0) {
                                var14.method5952(this.field4061);
                            }

                            if (this.field4037 != 0) {
                                var14.method6041(this.field4037);
                            }

                            if (this.field4038 != 0) {
                                var14.method5953(0, this.field4038, 0);
                            }
                        }
                    }
                } else {
                    this.field4046[1 + var8] = null;
                }
            }

        } catch (RuntimeException var23) {
            throw class158.method3445(var23, "akn.s(" + ')');
        }
    }

    void method2553(int var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            RegionOffset var7 = this.getRegion().regionOffset;
            int var8 = super.field8297 + super.field8299 >> 1;
            int var9 = super.field8296 + super.field8298 >> 1;
            int var10 = class703.field3413[var1];
            int var11 = class703.field3404[var1];
            int var12 = -var2 / 2;
            int var13 = -var3 / 2;
            int var14 = var12 * var11 + var10 * var13 >> 14;
            int var15 = var11 * var13 - var10 * var12 >> 14;
            int var16 = class917.method6454(var14 + (int) var7.offsetX, (int) var7.offsetY + var15, var8, var9, super.field3639, (byte) 13);
            int var17 = var2 / 2;
            int var18 = -var3 / 2;
            int var19 = var17 * var11 + var10 * var18 >> 14;
            int var20 = var18 * var11 - var17 * var10 >> 14;
            int var21 = class917.method6454(var19 + (int) var7.offsetX, (int) var7.offsetY + var20, var8, var9, super.field3639, (byte) -9);
            int var22 = -var2 / 2;
            int var23 = var3 / 2;
            int var24 = var22 * var11 + var23 * var10 >> 14;
            int var25 = var11 * var23 - var10 * var22 >> 14;
            int var26 = class917.method6454((int) var7.offsetX + var24, var25 + (int) var7.offsetY, var8, var9, super.field3639, (byte) 105);
            int var27 = var2 / 2;
            int var28 = var3 / 2;
            int var29 = var11 * var27 + var10 * var28 >> 14;
            int var30 = var28 * var11 - var10 * var27 >> 14;
            int var31 = class917.method6454(var29 + (int) var7.offsetX, var30 + (int) var7.offsetY, var8, var9, super.field3639, (byte) 97);
            int var32 = var16 < var21 ? var16 : var21;
            int var33 = var26 < var31 ? var26 : var31;
            int var34 = var21 < var31 ? var21 : var31;
            int var35 = var16 < var26 ? var16 : var26;
            this.field4061 = (int) (Math.atan2((double) (var32 - var33), (double) var3) * 2607.5945876176133D) & 16383;
            this.field4037 = (int) (Math.atan2((double) (var35 - var34), (double) var2) * 2607.5945876176133D) & 16383;
            int var36;
            if (this.field4061 != 0 && var4 != 0) {
                var36 = 16384 - var4;
                if (this.field4061 > 8192) {
                    if (this.field4061 < var36) {
                        this.field4061 = var36;
                    }
                } else if (this.field4061 > var4) {
                    this.field4061 = var4;
                }
            }

            if (this.field4037 != 0 && var5 != 0) {
                var36 = 16384 - var5;
                if (this.field4037 > 8192) {
                    if (this.field4037 < var36) {
                        this.field4037 = var36;
                    }
                } else if (this.field4037 > var5) {
                    this.field4037 = var5;
                }
            }

            this.field4038 = var16 + var31;
            if (var21 + var26 < this.field4038) {
                this.field4038 = var21 + var26;
            }

            this.field4038 = (this.field4038 >> 1) - (int) var7.field5300;
        } catch (RuntimeException var37) {
            throw class158.method3445(var37, "akn.z(" + ')');
        }
    }

    public class507 method2554(int var1) {
        try {
            int var2 = this.method2560(-40678538);
            return -1 == var2 ? class193.field7020 : class283.field10614.method3736(var2, (byte) 11);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.y(" + ')');
        }
    }

    public abstract int method2555(byte var1);

    public void method2556(int var1) {
        try {
            if (this.field4082 != null && this.field4082.field9748 != null) {
                --this.field4082.field9751;
                if (this.field4082.field9751 == 0) {
                    this.field4082.field9748 = null;
                }
            }

        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.v(" + ')');
        }
    }

    public abstract boolean method2557(byte var1);

    public void method2558(String var1, int var2, int var3, int var4, byte var5) {
        try {
            if (this.field4082 == null) {
                this.field4082 = new class625();
            }

            this.field4082.field9748 = var1;
            this.field4082.field9747 = var2;
            this.field4082.field9749 = var3;
            this.field4082.field9751 = this.field4082.field9750 = var4;
        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "akn.br(" + ')');
        }
    }

    public void method2559(int var1, int var2) {
        try {
            if (this.field4096 != this.field4071) {
                this.method2544((byte) -65);
            }

            this.field4071 = var1;
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akn.bz(" + ')');
        }
    }

    abstract int method2560(int var1);

    boolean method2561(int var1, int var2) {
        try {
            if (this.field4096 == var1) {
                return true;
            } else {
                this.field4095 = class886.method6167(var1, (int[]) null, (WidgetContainer) null, true, (byte) 3);
                if (this.field4095 == null) {
                    return false;
                } else {
                    this.field4096 = var1;
                    class932.method6294(this.field4095.widgetsCopy, -1178956884);
                    return true;
                }
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "akn.cd(" + ')');
        }
    }

    public int method2168(int var1) {
        try {
            return -32768 == this.field4053 ? 0 : this.field4053;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.bm(" + ')');
        }
    }

    public abstract class625 method2565(int var1);

    boolean method2567(int var1) {
        try {
            return this.field4071 == -1 ? false : this.method2561(this.field4071, -1999241902);
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.cm(" + ')');
        }
    }

    public void method2569(int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
        try {
            if (!this.method2567(-377564191)) {
                if (-1 != var1) {
                    class730.field2882[var1] = true;
                } else {
                    for (int var9 = 0; var9 < 113; ++var9) {
                        class730.field2882[var9] = true;
                    }
                }
            } else {
                class536.method2328(this.field4095.method887((byte) -37), -1, var2, var3, var4, var5, var6, var7, var1, false, (byte) 0);
            }

        } catch (RuntimeException var10) {
            throw class158.method3445(var10, "akn.cp(" + ')');
        }
    }

    public void method2570(int var1, int var2, boolean var3, int var4) {
        try {
            if (this.method2567(-551216163)) {
                class381.method1066(this.field4095.widgetsCopy, -1, var1, var2, var3, (short) -1055);
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "akn.cq(" + ')');
        }
    }

    boolean method2183(short var1) {
        try {
            return this.field4093;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "akn.be(" + ')');
        }
    }

    void method2573(class848 var1, class879[] var2, class135 var3, boolean var4, int var5) {
        try {
            if (!var4) {
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                int var10 = -1;
                int var11 = -1;
                class933[][] var12 = new class933[var2.length][];
                class396[][] var13 = new class396[var2.length][];

                for (int var14 = 0; var14 < var2.length; ++var14) {
                    if (var2[var14] != null) {
                        var2[var14].method6096(var3);
                        var12[var14] = var2[var14].method6089();
                        var13[var14] = var2[var14].method5941();
                        if (var12[var14] != null) {
                            var10 = var14;
                            ++var7;
                            var6 += var12[var14].length;
                        }

                        if (var13[var14] != null) {
                            var11 = var14;
                            ++var9;
                            var8 += var13[var14].length;
                        }
                    }
                }

                if ((this.field4031 == null || this.field4031.field2548) && (var7 > 0 || var9 > 0)) {
                    this.field4031 = class726.method1732(class730.field2866, true);
                }

                if (this.field4031 != null) {
                    Object var21 = null;
                    class933[] var15;
                    if (var7 == 1) {
                        var15 = var12[var10];
                    } else {
                        var15 = new class933[var6];
                        int var16 = 0;

                        for (int var17 = 0; var17 < var2.length; ++var17) {
                            if (var12[var17] != null) {
                                System.arraycopy(var12[var17], 0, var15, var16, var12[var17].length);
                                var16 += var12[var17].length;
                            }
                        }
                    }

                    Object var22 = null;
                    class396[] var23;
                    if (var9 == 1) {
                        var23 = var13[var11];
                    } else {
                        var23 = new class396[var8];
                        int var18 = 0;

                        for (int var19 = 0; var19 < var2.length; ++var19) {
                            if (var13[var19] != null) {
                                System.arraycopy(var13[var19], 0, var23, var18, var13[var19].length);
                                var18 += var13[var19].length;
                            }
                        }
                    }

                    this.field4031.method1731(var1, (long) class730.field2866, var15, var23, false);
                    this.field4092 = true;
                }
            } else if (this.field4031 != null) {
                this.field4031.method1733((long) class730.field2866);
            }

            if (this.field4031 != null) {
                this.field4031.method1727(super.field3639, super.field8299, super.field8297, super.field8296, super.field8298);
            }

        } catch (RuntimeException var20) {
            throw class158.method3445(var20, "akn.k(" + ')');
        }
    }

    public int method2578(short var1) {
        try {
            class507 var2 = this.method2554(80856829);
            int var3 = this.field4048.field9268;
            boolean var4;
            if (var2.field4002 != 0) {
                var4 = this.field4048.method5551(this.field4032, var2.field4002, var2.field4003, (byte) -24);
            } else {
                var4 = this.field4048.method5551(this.field4032, this.field4079, this.field4079, (byte) -44);
            }

            int var5 = this.field4048.field9268 - var3;
            if (var5 != 0) {
                ++this.field4078;
            } else {
                this.field4078 = 0;
                this.field4048.method5552(this.field4032, -43132362);
            }

            if (var4) {
                if (var2.field3984 != 0) {
                    if (var5 > 0) {
                        this.field4077.method5551(var2.field4006, var2.field3984, var2.field4005, (byte) -96);
                    } else {
                        this.field4077.method5551(-var2.field4006, var2.field3984, var2.field4005, (byte) -111);
                    }
                }

                if (var2.field3978 != 0) {
                    this.field4075.method5551(var2.field4009, var2.field3978, var2.field4008, (byte) -37);
                }
            } else {
                if (var2.field3984 != 0) {
                    this.field4077.method5551(0, var2.field3984, var2.field4005, (byte) -2);
                } else {
                    this.field4077.method5552(0, -1696263872);
                }

                if (var2.field3978 != 0) {
                    this.field4075.method5551(0, var2.field3978, var2.field4008, (byte) -85);
                } else {
                    this.field4075.method5552(0, -146971224);
                }
            }

            return var5;
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "akn.b(" + ')');
        }
    }

    public void method2579(int[] var1, int[] var2, int var3) {
        try {
            if (this.field4056 == null && var1 != null) {
                this.field4056 = new int[class413.field9412.field1542.length];
            } else if (var1 == null) {
                this.field4056 = null;
                return;
            }

            int var4;
            for (var4 = 0; var4 < this.field4056.length; ++var4) {
                this.field4056[var4] = -1;
            }

            for (var4 = 0; var4 < var1.length; ++var4) {
                int var5 = var2[var4];

                for (int var6 = 0; var6 < this.field4056.length; var5 >>= 1) {
                    if ((var5 & 1) != 0) {
                        this.field4056[var6] = var1[var4];
                    }

                    ++var6;
                }
            }

        } catch (RuntimeException var7) {
            throw class158.method3445(var7, "akn.p(" + ')');
        }
    }

    public int getAnimationId() {
        final Animator animator;
        if ((animator = this.activeAnimator) != null) {
            final Animation animation;
            if ((animation = animator.animation) != null) {
                return animation.id;
            }
        }
        return -1;
    }

}
