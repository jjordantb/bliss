public class class206 extends Node {
    public static int field7099;
    static class373 field7064 = new class373();
    static int field7074 = 512;
    static int field7079 = 1;
    static int field7081 = 3;
    static NodeTable field7083 = new NodeTable(16);
    static int field7085 = 0;
    static int field7091 = 2;
    static class373 field7098 = new class373();
    class29 field7063;
    int field7065;
    int field7066;
    int field7067;
    int field7068;
    class436 field7069;
    int field7070;
    int field7071;
    int field7072;
    int field7073;
    int[] field7075;
    Npc field7076;
    Player field7077;
    ObjectDefinition field7078;
    boolean field7080;
    int field7082 = 0;
    int field7084;
    int field7086;
    boolean field7087;
    class29 field7088;
    class656 field7089;
    class436 field7090;
    int field7092;
    int field7093;
    boolean field7094;
    int field7095;
    class656 field7096;
    int field7097;

    void method3766(int var1) {
        try {
            int var2 = this.field7086;
            boolean var3 = this.field7087;
            if (this.field7078 != null) {
                ObjectDefinition var4 = this.field7078.method1487((class415) (class730.field2705 == 0 ? class949.field3324 : class827.field9037), 2115683030);
                if (var4 != null) {
                    this.field7086 = var4.field2254;
                    this.field7087 = var4.field2258;
                    this.field7073 = var4.field2240 << 9;
                    this.field7092 = var4.field2257;
                    this.field7093 = var4.field2259;
                    this.field7065 = var4.field2260;
                    this.field7075 = var4.field2261;
                    this.field7094 = var4.field2227;
                    this.field7095 = var4.field2271;
                    this.field7084 = var4.field2270;
                } else {
                    this.field7086 = -1;
                    this.field7087 = false;
                    this.field7073 = 0;
                    this.field7092 = 0;
                    this.field7093 = 0;
                    this.field7065 = 0;
                    this.field7075 = null;
                    this.field7094 = false;
                    this.field7095 = 256;
                    this.field7084 = 256;
                    this.field7072 = 0;
                }
            } else if (this.field7076 != null) {
                int var7 = class176.method3169(this.field7076, 2054416095);
                if (var7 != var2) {
                    this.field7086 = var7;
                    NpcDefinition var5 = this.field7076.field1637;
                    if (var5.field9924 != null) {
                        var5 = var5.method6110(class827.field9037, 1733144869);
                    }

                    if (var5 != null) {
                        this.field7073 = var5.field9876 << 9;
                        this.field7072 = var5.field9911 << 9;
                        this.field7092 = var5.field9915;
                        this.field7087 = var5.field9916;
                        this.field7095 = var5.field9897;
                        this.field7084 = var5.field9926;
                    } else {
                        this.field7072 = 0;
                        this.field7073 = 0;
                        this.field7092 = 0;
                        this.field7087 = this.field7076.field1637.field9916;
                        this.field7095 = 256;
                        this.field7084 = 256;
                    }
                }
            } else if (this.field7077 != null) {
                this.field7086 = class509.method2534(this.field7077, 906629819);
                this.field7087 = this.field7077.field3375;
                this.field7073 = this.field7077.field3393 << 9;
                this.field7072 = 0;
                this.field7092 = this.field7077.field3394;
                this.field7095 = 256;
                this.field7084 = 256;
            }

            if ((this.field7086 != var2 || var3 != this.field7087) && this.field7090 != null) {
                class56.field2321.method3875(this.field7090);
                this.field7090 = null;
                this.field7089 = null;
                this.field7088 = null;
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "abz.b(" + ')');
        }
    }
}
