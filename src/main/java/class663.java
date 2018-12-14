public abstract class class663 extends class911 {
    static int field9664 = 16;
    static int field9665 = 4;
    static int field9679 = 1;
    static int field9680 = 2;
    static int field9683 = 8;
    static int field9684 = 32;
    static int field9686 = 128;
    static class344 field9689 = new class344();
    static int field9691 = 64;
    protected class223 field9666;
    class655 field9662;
    class655 field9663;
    class655 field9667;
    float[] field9668 = new float[3];
    class655 field9669;
    class655 field9670;
    class655 field9671;
    class655 field9672;
    class655 field9673;
    class655 field9674;
    class655 field9675;
    class655 field9676;
    class655 field9677;
    class655 field9678;
    class655 field9681;
    int[] field9682;
    class655 field9685;
    int field9687;
    class655 field9688;
    class344[] field9690;

    class663(class325 var1) {
        super(var1);
        new class135();
        this.field9690 = new class344[super.field10421.field791];

        for (int var2 = 0; var2 < super.field10421.field791; ++var2) {
            this.field9690[var2] = new class344();
        }

    }

    boolean method5761(String var1) throws class934 {
        this.field9666 = super.field10421.method556(var1);
        if (this.field9666 == null) {
            throw new class934("");
        } else {
            this.field9663 = this.field9666.method4077("textureMatrix", (byte) 108);
            this.field9688 = this.field9666.method4077("modelMatrix", (byte) 117);
            this.field9662 = this.field9666.method4077("viewMatrix", (byte) 116);
            this.field9681 = this.field9666.method4077("projectionMatrix", (byte) 107);
            this.field9676 = this.field9666.method4077("modelViewMatrix", (byte) 87);
            this.field9669 = this.field9666.method4077("modelViewProjectionMatrix", (byte) 81);
            this.field9670 = this.field9666.method4077("viewProjectionMatrix", (byte) 126);
            this.field9674 = this.field9666.method4077("ambientColour", (byte) 114);
            this.field9677 = this.field9666.method4077("sunDirection", (byte) 73);
            this.field9675 = this.field9666.method4077("sunColour", (byte) 107);
            this.field9678 = this.field9666.method4077("antiSunColour", (byte) 122);
            this.field9685 = this.field9666.method4077("sunExponent", (byte) 80);
            this.field9671 = this.field9666.method4077("eyePosition", (byte) 89);
            this.field9672 = this.field9666.method4077("eyePositionOS", (byte) 79);
            this.field9673 = this.field9666.method4077("sunDirectionOS", (byte) 100);
            if (!this.method5762()) {
                this.field9666 = null;
                this.field9663 = null;
                this.field9688 = null;
                this.field9662 = null;
                this.field9681 = null;
                this.field9676 = null;
                this.field9669 = null;
                this.field9670 = null;
                this.field9674 = null;
                this.field9677 = null;
                this.field9675 = null;
                this.field9678 = null;
                this.field9685 = null;
                this.field9671 = null;
                this.field9672 = null;
                this.field9673 = null;
                return false;
            } else {
                if (this.field9666.method4058(1789586042) == null) {
                    class184 var2 = this.field9666.method4056(-1437671487);
                    if (var2 == null) {
                        throw new class934(this.field9666.method4051(232845756) + "");
                    }

                    this.field9666.method4057(var2);
                }

                this.field9687 = this.field9666.method4054(-1467018991);
                this.field9682 = new int[this.field9687];
                return true;
            }
        }
    }

    abstract boolean method5762() throws class934;

    void method6466() {
        this.field9666.method4066();
        this.field9682[this.field9666.method4059(1713213788)] = -1;
        this.method5769(0);
        this.method5771();
    }

    void method5763(class344 var1) {
        if (this.field9666 != null && this.field9666.method4100() && super.field10421.method645() == 0) {
            int var2 = this.field9666.method4059(1799039973);
            if ((this.field9682[var2] & 128) != 0 && this.field9663 != null) {
                this.field9666.method4063(this.field9663, var1, (byte) 61);
                this.field9682[var2] &= -129;
            }
        }

    }

    void method6471() {
        this.method5767(class135.field1194);
    }

    void method6467() {
        if (this.field9666 != null) {
            this.field9666.method4098();
        }

    }

    void method5764(int var1, class135 var2) {
        if (this.field9673 != null) {
            float[] var3 = new float[]{super.field10421.field727[0], super.field10421.field727[1], super.field10421.field727[2]};
            var2.method1029(var3);
            this.field9666.method4060(this.field9673, var3[0], var3[1], var3[2], 1498331649);
        }

    }

    void method5765(boolean var1) {
        if (this.field9666 != null && this.field9666.method4100()) {
            if (this.field9674 != null) {
                this.field9666.method4060(this.field9674, super.field10421.field806 * super.field10421.field735, super.field10421.field733 * super.field10421.field735, super.field10421.field734 * super.field10421.field735, 1720867292);
            }

            if (this.field9677 != null) {
                this.field9666.method4060(this.field9677, super.field10421.field727[0], super.field10421.field727[1], super.field10421.field727[2], 1461810975);
            }

            if (this.field9675 != null) {
                this.field9666.method4060(this.field9675, super.field10421.field806 * super.field10421.field808, super.field10421.field733 * super.field10421.field808, super.field10421.field734 * super.field10421.field808, 1139320433);
            }

            if (this.field9678 != null) {
                this.field9666.method4060(this.field9678, -super.field10421.field806 * super.field10421.field737, -super.field10421.field733 * super.field10421.field737, -super.field10421.field734 * super.field10421.field737, 1046940970);
            }

            if (this.field9685 != null) {
                this.field9666.method4061(this.field9685, 64.0F + Math.abs(super.field10421.field727[1]) * 928.0F, 1825088849);
            }
        }

    }

    void method6476() {
    }

    void method5766(int var1) {
        for (int var2 = 0; var2 < this.field9687; ++var2) {
            this.field9682[var2] |= 128 << var1;
        }

    }

    void method5767(class135 var1) {
        class344 var2 = super.field10421.field680;
        var2.method272(var1);
        int var3 = this.field9666.method4059(1366764376);
        if (this.field9688 != null) {
            this.field9666.method4094(this.field9688, var2, 600012267);
            this.field9682[var3] &= -2;
        }

        if (this.field9676 != null) {
            field9689.method270(var2, super.field10421.method587());
            this.field9666.method4094(this.field9676, field9689, 600012267);
            this.field9682[var3] &= -17;
        }

        if (this.field9669 != null) {
            field9689.method270(var2, super.field10421.method593());
            this.field9666.method4094(this.field9669, field9689, 600012267);
            this.field9682[var3] &= -33;
        }

        this.method5773(var3, var1);
        this.method5764(var3, var1);
    }

    void method5768() {
        if (this.field9666 != null && this.field9666.method4100()) {
            int var1 = this.field9666.method4059(1999891583);
            int var2 = this.field9682[var1];
            if ((var2 & 1) != 0 && this.field9688 != null) {
                this.field9666.method4094(this.field9688, super.field10421.method690(), 600012267);
            }

            if ((var2 & 2) != 0) {
                if (this.field9662 != null) {
                    this.field9666.method4094(this.field9662, super.field10421.method587(), 600012267);
                }

                if (this.field9671 != null) {
                    this.field9668[0] = 0.0F;
                    this.field9668[1] = 0.0F;
                    this.field9668[2] = 0.0F;
                    super.field10421.method4868().method1020(this.field9668[0], this.field9668[1], this.field9668[2], this.field9668);
                    this.field9666.method4060(this.field9671, this.field9668[0], this.field9668[1], this.field9668[2], 1289241490);
                }
            }

            if ((var2 & 16) != 0 && this.field9676 != null) {
                this.field9666.method4094(this.field9676, super.field10421.method646(), 600012267);
            }

            if ((var2 & 8) != 0 && this.field9667 != null) {
                this.field9666.method4094(this.field9667, super.field10421.method588(), 600012267);
            }

            if ((var2 & 4) != 0 && this.field9681 != null) {
                this.field9666.method4094(this.field9681, super.field10421.method560(), 600012267);
            }

            if ((var2 & 32) != 0 && this.field9669 != null) {
                field9689.method270(super.field10421.method646(), super.field10421.method560());
                this.field9666.method4094(this.field9669, field9689, 600012267);
            }

            if ((var2 & 64) != 0 && this.field9670 != null) {
                field9689.method270(super.field10421.method587(), super.field10421.method560());
                this.field9666.method4094(this.field9670, field9689, 600012267);
            }

            if (super.field10421.method645() == 0 && (this.field9682[var1] & 128) != 0 && this.field9663 != null) {
                this.field9666.method4063(this.field9663, super.field10421.method575(), (byte) 14);
                this.field9682[var1] &= -129;
            }

            this.field9682[var1] = 0;
        }

    }

    void method5769(int var1) {
        this.field9690[0].method299();
        this.method5766(var1);
    }

    void method5771() {
        this.method5765(super.field10421.field708);
        this.method5763(super.field10421.method575());
        this.method5768();
        this.method6476();
    }

    void method5773(int var1, class135 var2) {
        if (this.field9672 != null) {
            class344 var3 = super.field10421.method588();
            float[] var4 = new float[]{var3.field325[12], var3.field325[13], var3.field325[14]};
            float[] var5 = new float[]{0.0F, 0.0F, 0.0F};
            var3.method295(var5);
            float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
            super.field10421.method4868().method1031(0.0F, 0.0F, 0.0F, var6);
            var2.method1023(var4);
            this.field9666.method4060(this.field9672, var4[0], var4[1], var4[2], 1346905508);
        }

    }
}
