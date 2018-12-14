public class class849 implements class478 {
    public static int field8567;
    class180 field8562;
    class180 field8563;
    class414[] field8564;
    int field8565;
    class170 field8566 = new class170(256);

    public class849(class180 var1, class180 var2, class180 var3) {
        this.field8563 = var2;
        this.field8562 = var3;
        InputStream var4 = new InputStream(var1.method3285(0, 0, (byte) -117));
        this.field8565 = var4.method6374();
        this.field8564 = new class414[this.field8565];

        int var5;
        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (var4.method6371() == 1) {
                this.field8564[var5] = new class414();
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9378 = var4.method6371() == 0;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9372 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9392 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9388 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9387 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9383 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9390 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9386 = (short) var4.method6374();
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9389 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9363 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9381 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9398 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9391 = var4.method6372(-12558881);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9394 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9395 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9397 = var4.method6371() == 1;
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9373 = var4.method6371();
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9385 = var4.method6420((byte) -86);
            }
        }

        for (var5 = 0; var5 < this.field8565; ++var5) {
            if (this.field8564[var5] != null) {
                this.field8564[var5].field9382 = var4.method6371();
            }
        }

    }

    static void method4782(InputStream var0, int var1, byte var2) {
        try {
            if (class69.field1839 != null) {
                try {
                    class69.field1839.method6156(0L);
                    class69.field1839.method6150(var0.field10375, var1, 24, 1376397510);
                } catch (Exception var4) {
                    ;
                }
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kk.s(" + ')');
        }
    }

    static final void method4783(class20 var0, class744 var1, byte var2) {
        try {
            int var3 = var0.field6425;
            switch (var3) {
                case 0:
                    class620.method5268(var1, 1886334997);
                    break;
                case 1:
                    class671.method4236(var1, -1417072633);
                    break;
                case 2:
                    class646.method5500(var1, (byte) 3);
                    break;
                case 3:
                    class262.method4531(var1, 160260662);
                    break;
                case 4:
                    class575.method126(var1, 643983095);
                    break;
                case 5:
                    class759.method2723(var1, (byte) -113);
                    break;
                case 6:
                    class983.method1892(var1, (byte) -4);
                    break;
                case 7:
                    class819.method2934(var1, 1614076153);
                    break;
                case 8:
                    class807.method2832(var1, 34918569);
                    break;
                case 9:
                    class652.method5638(var1, -1591618981);
                    break;
                case 10:
                    class379.method967(var1, 1874097605);
                    break;
                case 11:
                    class176.method3164(var1, 1842241343);
                    break;
                case 12:
                    class222.method4107(var1, -21181767);
                    break;
                case 13:
                    class974.method1785(var1, (byte) 0);
                    break;
                case 14:
                    class979.method1833(var1, 235162027);
                    break;
                case 15:
                    class51.method1533(var1, -86584801);
                    break;
                case 16:
                    class506.method2600(var1, (byte) -90);
                    break;
                case 17:
                    class259.method4476(var1, 634507100);
                    break;
                case 18:
                    class528.method2241(var1, (byte) -54);
                    break;
                case 19:
                    class122.method1607(var1, (byte) -21);
                    break;
                case 20:
                    class827.method5355(false, var1, -363590707);
                    break;
                case 21:
                    class152.method3402(var1, -781222749);
                    break;
                case 22:
                    class405.method5476(var1, (byte) -60);
                    break;
                case 23:
                    class749.method2526(var1, 2016232538);
                    break;
                case 24:
                    class932.method6300(var1, -222608844);
                    break;
                case 25:
                    class467.method4000(var1, -203050393);
                    break;
                case 26:
                    RegionBase.method1148(var1, -482311284);
                    break;
                case 27:
                    class166.method3684(var1, (byte) 3);
                    break;
                case 28:
                    class120.method1503(var1, 1109542946);
                    break;
                case 29:
                    class82.method922(var1, -1863888446);
                    break;
                case 30:
                    class890.method5557(var1, 1619027642);
                    break;
                case 31:
                    class128.method1588(var1, (byte) 124);
                    break;
                case 32:
                    ObjectDefinition.method1497(var1, 2030703145);
                    break;
                case 33:
                    class220.method4041(var1, 1258630165);
                    break;
                case 34:
                    class650.method5632(var1, -681129098);
                    break;
                case 35:
                    class133.method997(var1, -1294753740);
                    break;
                case 36:
                    class984.method1879(var1, -1869876979);
                    break;
                case 37:
                    class64.method1261(var1, (byte) -58);
                    break;
                case 38:
                    class516.method2728(var1, 1627929937);
                    break;
                case 39:
                    class932.method6297(var1, -228970027);
                    break;
                case 40:
                    class418.method5684(var1, (byte) 14);
                    break;
                case 41:
                    class890.method5556(var1, -696461477);
                    break;
                case 42:
                    class285.method6662(var1, 1214558813);
                    break;
                case 43:
                    class630.method5891(var1, (short) 8192);
                    break;
                case 44:
                    class593.method1236(var1, -1861936891);
                    break;
                case 45:
                    class374.method1004(var1, (byte) 60);
                    break;
                case 46:
                    class128.method1587(var1, -722526422);
                    break;
                case 47:
                    class281.method6688(var1, -108666201);
                    break;
                case 48:
                    class34.method3325(var1, 324071475);
                    break;
                case 49:
                    class526.method2230(var1, 187155990);
                    break;
                case 50:
                    class461.method3991(var1, 91701348);
                    break;
                case 51:
                    class535.method2281(var1, 2109866215);
                    break;
                case 52:
                    Node.method547(var1, 2042171286);
                    break;
                case 53:
                    class759.method2722(var1, 1533652292);
                    break;
                case 54:
                    class158.method3440(var1, (short) 8164);
                    break;
                case 55:
                    class509.method2533(var1, 313304404);
                    break;
                case 56:
                    class8.method3019(var1, (byte) -106);
                    break;
                case 57:
                    SceneTile.method3730(var1, (byte) 41);
                    break;
                case 58:
                    class976.method1822(var1, (byte) 5);
                    break;
                case 59:
                    class488.method4737(var1, 2013834634);
                    break;
                case 60:
                    class20.method3419(var1, 1918373858);
                    break;
                case 61:
                    class91.method496(var1, -150040976);
                    break;
                case 62:
                    class348.method189(var1, -154562081);
                    break;
                case 63:
                    class147.method1142(var1, 1055812729);
                    break;
                case 64:
                    class229.method4581(var1, -707253931);
                    break;
                case 65:
                    class394.method3414(var1, -2021527194);
                    break;
                case 66:
                    class932.method6302(var1, -1073260406);
                    break;
                case 67:
                    class422.method5725(var1, (byte) -10);
                    break;
                case 68:
                    class91.method499(var1, -1342896505);
                    break;
                case 69:
                    class205.method4313(var1, (byte) 99);
                    break;
                case 70:
                    class623.method5318(var1, 16711935);
                    break;
                case 71:
                    class556.method432(var1, -1770680499);
                    break;
                case 72:
                    class262.method4532(var1, -1304712976);
                    break;
                case 73:
                    class75.method1121(var1, 414231437);
                    break;
                case 74:
                    class72.method1071(var1, -376889697);
                    break;
                case 75:
                    class363.method1628(var1, 1227356013);
                    break;
                case 76:
                    class285.method6665(var1, -1692610452);
                    break;
                case 77:
                    class544.method2372(var1, (byte) 99);
                    break;
                case 78:
                    class613.method5206(var1, 1657034884);
                    break;
                case 79:
                    class49.method3092(var1, -1637643820);
                    break;
                case 80:
                    class660.method5748(var1, 1907054965);
                    break;
                case 81:
                    class161.method3552(var1, -437772689);
                    break;
                case 82:
                    class646.method5501(var1, (short) -16904);
                    break;
                case 83:
                    class27.method3470(var1, -1165523118);
                    break;
                case 84:
                    class962.method2130(var1, (byte) 4);
                    break;
                case 85:
                    class384.method1083(var1, -1527633075);
                    break;
                case 86:
                    class304.method2391(var1, -366698818);
                    break;
                case 87:
                    class192.method3744(var1, 1472787952);
                    break;
                case 88:
                    class258.method4443(var1, -1263173218);
                    break;
                case 89:
                    class188.method3343(var1, (byte) 3);
                    break;
                case 90:
                    class792.method441(var1, 629926500);
                    break;
                case 91:
                    class527.method2250(var1, -804751535);
                    break;
                case 92:
                    class127.method1599(var1, (byte) -1);
                    break;
                case 93:
                    class590.method1218(var1, 488342739);
                    break;
                case 94:
                    class414.method5599(var1, 1329583265);
                    break;
                case 95:
                    class322.method817(var1, (byte) -1);
                    break;
                case 96:
                    class962.method2127(var1, (byte) 8);
                    break;
                case 97:
                    class98.method527(var1, -1249709514);
                    break;
                case 98:
                    class631.method5864(var1, (byte) 115);
                    break;
                case 99:
                    class209.method3773(var1, -638149953);
                    break;
                case 100:
                    class904.method6337(var1, -89442935);
                    break;
                case 101:
                    class622.method5339(var1, 33554432);
                    break;
                case 102:
                    class431.method4255(var1, -1999716721);
                    break;
                case 103:
                    class278.method6627(var1, (byte) -1);
                    break;
                case 104:
                    class370.method876(var1, (byte) 107);
                    break;
                case 105:
                    class103.method152(var1, (byte) -62);
                    break;
                case 106:
                    class498.method4493(var1, 212782017);
                    break;
                case 107:
                    class228.method4588(var1, 1283992094);
                    break;
                case 108:
                    class256.method4488(var1, 1106590955);
                    break;
                case 109:
                    class808.method2890(var1, (short) 128);
                    break;
                case 110:
                    class718.method2069(var1, (byte) 70);
                    break;
                case 111:
                    class140.method1046(var1, 1244635689);
                    break;
                case 112:
                    class370.method878(var1, (short) -17232);
                    break;
                case 113:
                    class527.method2251(var1, 1617556739);
                    break;
                case 114:
                    class51.method1529(var1, 65280);
                    break;
                case 115:
                    class382.method1057(var1, -329170988);
                    break;
                case 116:
                    class877.method5927(var1, 446965448);
                    break;
                case 117:
                    class660.method5747(var1, -1932663501);
                    break;
                case 118:
                    class870.method5885(var1, 1654342607);
                    break;
                case 119:
                    class71.method1091(var1, (byte) -32);
                    break;
                case 120:
                    class193.method3739(var1, (short) 20736);
                    break;
                case 121:
                    class697.method3826(var1, (byte) 2);
                    break;
                case 122:
                    class107.method1200(var1, (byte) 123);
                    break;
                case 123:
                    class461.method3993(var1, -757452101);
                    break;
                case 124:
                    class670.method4154(var1, (byte) 0);
                    break;
                case 125:
                    class829.method5359(var1, 34037);
                    break;
                case 126:
                    class157.method3516(var1, 453807485);
                    break;
                case 127:
                    class835.method5449(var1, -2073331694);
                    break;
                case 128:
                    class51.method1526(var1, -2131789274);
                    break;
                case 129:
                    Widget.method843(var1, (short) -13358);
                    break;
                case 130:
                    class153.method3395(var1, -373892482);
                    break;
                case 131:
                    class606.method4791(var1, -1792546982);
                    break;
                case 132:
                    class794.method465(var1, 142669671);
                    break;
                case 133:
                    class929.method6264(var1, (byte) 59);
                    break;
                case 134:
                    class230.method4609(var1, (byte) -2);
                    break;
                case 135:
                    class878.method5921(var1, (byte) 0);
                    break;
                case 136:
                    class213.method3809(var1, 2010644047);
                    break;
                case 137:
                    class804.method2827(var1, (byte) 77);
                    break;
                case 138:
                    class279.method6613(var1, -1316439840);
                    break;
                case 139:
                    class21.method3415(var1, -565005069);
                    break;
                case 140:
                    class396.method3496(var1, 653083066);
                    break;
                case 141:
                    Animation.method3566(var1, (byte) 94);
                    break;
                case 142:
                    class452.method3869(var1, (byte) 66);
                    break;
                case 143:
                    class258.method4441(var1, -408282382);
                    break;
                case 144:
                    class264.method4567(var1, -497088182);
                    break;
                case 145:
                    class140.method1050(var1, -1543760692);
                    break;
                case 146:
                    class223.method4103(var1, (byte) 6);
                    break;
                case 147:
                    class458.method3831(var1, -1778181559);
                    break;
                case 148:
                    class856.method5199(var1, -1285165607);
                    break;
                case 149:
                    class593.method1232(var1, (byte) -28);
                    break;
                case 150:
                    class370.method879(var1, 160159488);
                    break;
                case 151:
                    class245.method4770(var1, (byte) -124);
                    break;
                case 152:
                    class679.method4269(var1, -65274044);
                    break;
                case 153:
                    class747.method2611(var1, -910857161);
                    break;
                case 154:
                    class419.method5642(var1, -337488765);
                    break;
                case 155:
                    class752.method2641(var1, 1765557209);
                    break;
                case 156:
                    class49.method3094(var1, (byte) 0);
                    break;
                case 157:
                    class295.method6517(var1, 2107357347);
                    break;
                case 158:
                    class14.method3602(var1, (short) 23545);
                    break;
                case 159:
                    class575.method128(var1, (byte) 12);
                    break;
                case 160:
                    class147.method1140(var1, 1989025146);
                    break;
                case 161:
                    class916.method6464(var1, 725918867);
                    break;
                case 162:
                    class936.method6277(var1, (byte) 120);
                    break;
                case 163:
                    class64.method1264(var1, (byte) 13);
                    break;
                case 164:
                    class49.method3093(var1, (byte) 68);
                    break;
                case 165:
                    class916.method6459(var1, (byte) 23);
                    break;
                case 166:
                    class111.method1357(var1, -766298444);
                    break;
                case 167:
                    class209.method3772(var1, -244580695);
                    break;
                case 168:
                    class766.method2758(var1, -324310435);
                    break;
                case 169:
                    class880.method6178(var1, -1780855139);
                    break;
                case 170:
                    class819.method2935(var1, (byte) -57);
                    break;
                case 171:
                    class154.method3485(var1, -1265306290);
                    break;
                case 172:
                    class64.method1263(var1, 1539423531);
                    break;
                case 173:
                    class500.method1860(var1, 1775155824);
                    break;
                case 174:
                    class716.method2046(var1, -1463033456);
                    break;
                case 175:
                    class111.method1359(var1, -238433266);
                    break;
                case 176:
                    class456.method3793(var1, (byte) -11);
                    break;
                case 177:
                    class140.method1044(var1, (byte) -93);
                    break;
                case 178:
                    class123.method1635(var1, -804156383);
                    break;
                case 179:
                    class402.method6162(var1, 790586565);
                    break;
                case 180:
                    class969.method1697(var1, (byte) 0);
                    break;
                case 181:
                    class788.method2397(var1, 1811899353);
                    break;
                case 182:
                    class649.method5541(var1, -361996998);
                    break;
                case 183:
                    class935.method6304(var1, (byte) -10);
                    break;
                case 184:
                    class637.method5938(var1, 976089394);
                    break;
                case 185:
                    class979.method1830(var1, (byte) 53);
                    break;
                case 186:
                    class323.method539(var1, (byte) 68);
                    break;
                case 187:
                    class677.method4226(var1, (byte) 0);
                    break;
                case 188:
                    class390.method3424(var1, -1528134592);
                    break;
                case 189:
                    class99.method533(var1, 2111285614);
                    break;
                case 190:
                    class474.method4670(var1, 1704821490);
                    break;
                case 191:
                    class616.method5214(var1, (byte) -26);
                    break;
                case 192:
                    class745.method2598(var1, 1249914677);
                    break;
                case 193:
                    class873.method5871(var1, -1405576915);
                    break;
                case 194:
                    class725.method1744(var1, 226567906);
                    break;
                case 195:
                    class508.method2501(var1, 714261686);
                    break;
                case 196:
                    class640.method6186(var1, -1321769737);
                    break;
                case 197:
                    class449.method3765(var1, (byte) 50);
                    break;
                case 198:
                    class506.method2601(var1, (byte) 66);
                    break;
                case 199:
                    class472.method4613(var1, -2071927175);
                    break;
                case 200:
                    class59.method1618(var1, (byte) 0);
                    break;
                case 201:
                    class650.method5633(var1, (byte) -2);
                    break;
                case 202:
                    RegionBase.method1150(var1, -977446922);
                    break;
                case 203:
                    class899.method5663(var1, 1481079560);
                    break;
                case 204:
                    class606.method4792(var1, -136975475);
                    break;
                case 205:
                    class221.method4034(var1, 1908327045);
                    break;
                case 206:
                    InputStream.method6430(var1, -2026462971);
                    break;
                case 207:
                    class621.method5265(var1, -1578658682);
                    break;
                case 208:
                    class844.method5097(var1, (byte) 0);
                    break;
                case 209:
                    class540.method2462(var1, 808940697);
                    break;
                case 210:
                    class118.method1464(var1, (short) 407);
                    break;
                case 211:
                    class636.method5911(var1, 2102352706);
                    break;
                case 212:
                    class379.method965(var1, 1815980418);
                    break;
                case 213:
                    class167.method3697(var1, (byte) -66);
                    break;
                case 214:
                    class104.method145(var1, -1293094134);
                    break;
                case 215:
                    class310.method455(var1, (byte) 42);
                    break;
                case 216:
                    class230.method4607(var1, (byte) 49);
                    break;
                case 217:
                    class924.method6253(var1, -1536454750);
                    break;
                case 218:
                    class59.method1615(var1, 2128499801);
                    break;
                case 219:
                    class1.method2988(var1, 762547962);
                    break;
                case 220:
                    class544.method2365(var1, (byte) 94);
                    break;
                case 221:
                    class702.method1968(var1, (short) 12012);
                    break;
                case 222:
                    class467.method4001(var1, (short) -31539);
                    break;
                case 223:
                    class490.method4436(var1, 65535);
                    break;
                case 224:
                    class962.method2129(var1, (byte) 58);
                    break;
                case 225:
                    class295.method6516(var1, 961292935);
                    break;
                case 226:
                    class139.method980(var1, Integer.MAX_VALUE);
                    break;
                case 227:
                    class321.method853(var1, -545924684);
                    break;
                case 228:
                    class601.method5453(var1, (short) 21540);
                    break;
                case 229:
                    class188.method3345(var1, -191581955);
                    break;
                case 230:
                    class971.method1788(var1, (byte) 2);
                    break;
                case 231:
                    class72.method1072(var1, -2093041337);
                    break;
                case 232:
                    class309.method362(var1, -1686782391);
                    break;
                case 233:
                    class373.method914(var1, -1471111842);
                    break;
                case 234:
                    class725.method1746(var1, (short) -32045);
                    break;
                case 235:
                    class590.method1217(var1, 996473161);
                    break;
                case 236:
                    class192.method3743(var1, -2002879237);
                    break;
                case 237:
                    class341.method256(var1, 1005616800);
                    break;
                case 238:
                    class373.method912(var1, (byte) -1);
                    break;
                case 239:
                    class822.method5366(var1, (short) 25267);
                    break;
                case 240:
                    class866.method5842(var1, (byte) -18);
                    break;
                case 241:
                    class766.method2760(var1, -856511828);
                    break;
                case 242:
                    class118.method1467(var1, 1598506169);
                    break;
                case 243:
                    class14.method3601(var1, 1522863227);
                    break;
                case 244:
                    class807.method2829(var1, (byte) 127);
                    break;
                case 245:
                    IterableSceneEntity.method3538(var1, 1668251844);
                    break;
                case 246:
                    class374.method1000(var1, 1331529655);
                    break;
                case 247:
                    class95.method524(var1, (byte) -95);
                    break;
                case 248:
                    class184.method3241(var1, -144646695);
                    break;
                case 249:
                    class15.method3685(var1, -1107806402);
                    break;
                case 250:
                    class289.method6696(var1, -1632544821);
                    break;
                case 251:
                    class193.method3738(var1, (byte) 51);
                    break;
                case 252:
                    class35.method3338(var1, (byte) 4);
                    break;
                case 253:
                    class69.method1336(var1, -1967579697);
                    break;
                case 254:
                    class550.method438(var1, -165929881);
                    break;
                case 255:
                    SceneTile.method3729(var1, (short) -3403);
                    break;
                case 256:
                    class606.method4788(var1, 1777073458);
                    break;
                case 257:
                    class16.method3680(var1, 255626399);
                    break;
                case 258:
                    class348.method190(var1, (byte) 45);
                    break;
                case 259:
                    class118.method1466(var1, -480140156);
                    break;
                case 260:
                    class122.method1609(var1, -650016061);
                    break;
                case 261:
                    class405.method5480(var1, 1881970779);
                    break;
                case 262:
                    class26.method3480(var1, 1719418232);
                    break;
                case 263:
                    class43.method3067(var1, 1456302474);
                    break;
                case 264:
                    class717.method2029(var1, (byte) 119);
                    break;
                case 265:
                    class554.method425(var1, -1024414196);
                    break;
                case 266:
                    class769.method2258(var1, -324928119);
                    break;
                case 267:
                    class924.method6251(var1, (byte) 38);
                    break;
                case 268:
                    class255.method4497(var1, -506105871);
                    break;
                case 269:
                    class147.method1143(var1, (byte) 18);
                    break;
                case 270:
                    SceneTile.method3731(var1, 1782137342);
                    break;
                case 271:
                    SceneTile.method3727(var1, -43109205);
                    break;
                case 272:
                    class283.method6643(var1, -780233072);
                    break;
                case 273:
                    class827.method5355(true, var1, -363590707);
                    break;
                case 274:
                    class379.method966(var1, (byte) 1);
                    break;
                case 275:
                    class614.method5190(var1, 713140978);
                    break;
                case 276:
                    class240.method4715(var1, (short) -22967);
                    break;
                case 277:
                    class969.method1692(var1, 267792839);
                    break;
                case 278:
                    class507.method2512(var1, 358767270);
                    break;
                case 279:
                    class928.method6204(var1, (byte) 59);
                    break;
                case 280:
                    class727.method1686(var1, (byte) -75);
                    break;
                case 281:
                    class352.method1405(var1, (byte) 7);
                    break;
                case 282:
                    class979.method1831(var1, 385051775);
                    break;
                case 283:
                    class502.method1894(var1, (byte) 3);
                    break;
                case 284:
                    class848.method5067(var1, (byte) 13);
                    break;
                case 285:
                    class762.method2809(var1, -925250372);
                    break;
                case 286:
                    class237.method4652(var1, (short) 24198);
                    break;
                case 287:
                    class139.method981(var1, 36160);
                    break;
                case 288:
                    class390.method3425(var1, -1235548702);
                    break;
                case 289:
                    class170.method3075(var1, 468134532);
                    break;
                case 290:
                    class238.method4647(var1, (byte) -120);
                    break;
                case 291:
                    class770.method2306(var1, -269779966);
                    break;
                case 292:
                    class24.method3465(var1, -2123395188);
                    break;
                case 293:
                    class657.method5660(var1, 97341898);
                    break;
                case 294:
                    class422.method5721(var1, -203144845);
                    break;
                case 295:
                    class537.method2318(var1, (short) 256);
                    break;
                case 296:
                    class480.method4704(var1, 1817420178);
                    break;
                case 297:
                    class44.method3083(var1, 1513696936);
                    break;
                case 298:
                    class616.method5212(var1, (byte) 105);
                    break;
                case 299:
                    class352.method1402(var1, -608750771);
                    break;
                case 300:
                    class809.method2887(var1, 153105452);
                    break;
                case 301:
                    class162.method3542(var1, -2054877304);
                    break;
                case 302:
                    class24.method3463(var1, (byte) 31);
                    break;
                case 303:
                    class505.method2608(var1, -1739436796);
                    break;
                case 304:
                    class290.method6523(var1, (byte) 75);
                    break;
                case 305:
                    class422.method5723(var1, -2054633703);
                    break;
                case 306:
                    class283.method6644(var1, 2139400204);
                    break;
                case 307:
                    class423.method5709(var1, (byte) 1);
                    break;
                case 308:
                    class363.method1631(var1, 1568365221);
                    break;
                case 309:
                    SceneGraphLevel.method3921(var1, 1834807226);
                    break;
                case 310:
                    class69.method1340(var1, 1814353346);
                    break;
                case 311:
                    class323.method540(var1, -101938309);
                    break;
                case 312:
                    class392.method3384(var1, (byte) 33);
                    break;
                case 313:
                    class637.method5937(var1, -999116991);
                    break;
                case 314:
                    class91.method500(var1, -1182176969);
                    break;
                case 315:
                    class830.method5371(var1, (byte) -3);
                    break;
                case 316:
                    class844.method5096(var1, 1472475830);
                    break;
                case 317:
                    class64.method1265(var1, (byte) 36);
                    break;
                case 318:
                    class764.method2744(var1, 1508830307);
                    break;
                case 319:
                    class374.method1006(var1, -1405796213);
                    break;
                case 320:
                    class601.method5451(var1, 399647801);
                    break;
                case 321:
                    SceneGraphLevel.method3919(var1, (byte) 113);
                    break;
                case 322:
                    class184.method3240(var1, 1153201304);
                    break;
                case 323:
                    class547.method378(var1, (byte) -49);
                    break;
                case 324:
                    class128.method1583(var1, 426828596);
                    break;
                case 325:
                    class167.method3696(var1, (byte) 1);
                    break;
                case 326:
                    class730.method1771(var1, -295386469);
                    break;
                case 327:
                    class459.method3966(var1, 1191012288);
                    break;
                case 328:
                    class151.method3372(var1, (byte) -92);
                    break;
                case 329:
                    class823.method5361(var1, 1590012191);
                    break;
                case 330:
                    class614.method5194(var1, -119884610);
                    break;
                case 331:
                    class914.method6443(var1, (byte) -32);
                    break;
                case 332:
                    class610.method5141(var1, -1778992606);
                    break;
                case 333:
                    class591.method1216(var1, -779773002);
                    break;
                case 334:
                    class811.method2926(var1, 1121890391);
                    break;
                case 335:
                    class75.method1120(var1, -620691306);
                    break;
                case 336:
                    class321.method852(var1, -1892964721);
                    break;
                case 337:
                    class170.method3073(var1, -2038015765);
                    break;
                case 338:
                    class456.method3795(var1, 2066365370);
                    break;
                case 339:
                    class78.method1126(true, var1, (byte) 32);
                    break;
                case 340:
                    class416.method5646(var1, (short) 255);
                    break;
                case 341:
                    class176.method3165(var1, 1103915043);
                    break;
                case 342:
                    class972.method1774(var1, 1479753938);
                    break;
                case 343:
                    class283.method6647(var1, 938982895);
                    break;
                case 344:
                    class309.method363(var1, (short) 17995);
                    break;
                case 345:
                    class539.method2338(var1, (byte) 14);
                    break;
                case 346:
                    class679.method4273(var1, 1833702224);
                    break;
                case 347:
                    SceneGraphLevel.method3918(var1, 869562677);
                    break;
                case 348:
                    class188.method3344(var1, (byte) -50);
                    break;
                case 349:
                    class26.method3484(var1, (byte) 48);
                    break;
                case 350:
                    class22.method3437(var1, 1482326728);
                    break;
                case 351:
                    class622.method5336(var1, 1693961887);
                    break;
                case 352:
                    class902.method6349(var1, -1327440948);
                    break;
                case 353:
                    class220.method4042(var1, -1481455503);
                    break;
                case 354:
                    class71.method1085(var1, 160198488);
                    break;
                case 355:
                    class296.method6507(var1, -608870658);
                    break;
                case 356:
                    class776.method2297(var1, (byte) 3);
                    break;
                case 357:
                    class984.method1881(var1, 548702636);
                    break;
                case 358:
                    class574.method134(var1, (byte) -100);
                    break;
                case 359:
                    class587.method163(var1, 400834602);
                    break;
                case 360:
                    class191.method3723(var1, -295013935);
                    break;
                case 361:
                    class695.method3939(var1, (byte) 71);
                    break;
                case 362:
                    class157.method3517(var1, -1182944505);
                    break;
                case 363:
                    class342.method222(var1, -667200070);
                    break;
                case 364:
                    class984.method1877(var1, 328121411);
                    break;
                case 365:
                    class390.method3423(var1, -203050393);
                    break;
                case 366:
                    class507.method2513(var1, -562613117);
                    break;
                case 367:
                    class844.method5101(var1, 1402373589);
                    break;
                case 368:
                    class792.method439(var1, 1640833554);
                    break;
                case 369:
                    class636.method5914(var1, (byte) 27);
                    break;
                case 370:
                    class935.method6307(var1, (byte) -122);
                    break;
                case 371:
                    class229.method4580(var1, -1220300405);
                    break;
                case 372:
                    class455.method3816(var1, (byte) 0);
                    break;
                case 373:
                    class405.method5479(var1, -2073212206);
                    break;
                case 374:
                    Node.method548(var1, 16711680);
                    break;
                case 375:
                    class437.method4265(var1, (byte) 0);
                    break;
                case 376:
                    class382.method1059(var1, 1701364570);
                    break;
                case 377:
                    class695.method3940(var1, (short) 255);
                    break;
                case 378:
                    class363.method1630(var1, 2032904299);
                    break;
                case 379:
                    class403.method6147(var1, (byte) -126);
                    break;
                case 380:
                    class341.method251(var1, (byte) 58);
                    break;
                case 381:
                    class51.method1534(var1, (byte) -55);
                    break;
                case 382:
                    class671.method4235(var1, 171074418);
                    break;
                case 383:
                    class45.method3081(var1, 2015972128);
                    break;
                case 384:
                    class727.method1689(var1, -66945990);
                    break;
                case 385:
                    class402.method6161(var1, -53605842);
                    break;
                case 386:
                    class379.method962(var1, -75695930);
                    break;
                case 387:
                    class363.method1627(var1, (byte) -24);
                    break;
                case 388:
                    class503.method2585(var1, 353945325);
                    break;
                case 389:
                    class643.method6118(var1, -2034157659);
                    break;
                case 390:
                    class184.method3243(var1, 1493641779);
                    break;
                case 391:
                    class449.method3763(var1, (byte) 67);
                    break;
                case 392:
                    class783.method2494(var1, 1280461944);
                    break;
                case 393:
                    class616.method5215(var1, -553176479);
                    break;
                case 394:
                    class353.method1380(var1, (byte) -105);
                    break;
                case 395:
                    class289.method6695(var1, 666003369);
                    break;
                case 396:
                    class98.method529(var1, (byte) -102);
                    break;
                case 397:
                    class411.method5592(var1, 2119227597);
                    break;
                case 398:
                    class553.method452(var1, -515096992);
                    break;
                case 399:
                    class650.method5634(var1, 2090017645);
                    break;
                case 400:
                    class616.method5216(var1, 1876479737);
                    break;
                case 401:
                    class182.method3308(var1, (byte) 8);
                    break;
                case 402:
                    class498.method4492(var1, 948155510);
                    break;
                case 403:
                    class503.method2582(var1, 1264157631);
                    break;
                case 404:
                    class660.method5749(var1, -1921461819);
                    break;
                case 405:
                    Widget.method842(var1, 1496269925);
                    break;
                case 406:
                    class507.method2508(var1, (short) -27108);
                    break;
                case 407:
                    class762.method2810(var1, (byte) 0);
                    break;
                case 408:
                    class729.method1702(var1, 1379762103);
                    break;
                case 409:
                    class99.method534(var1, 1428164357);
                    break;
                case 410:
                    class559.method476(var1, -714445191);
                    break;
                case 411:
                    class775.method2269(var1, 1876162341);
                    break;
                case 412:
                    class351.method1225(var1, (byte) 49);
                    break;
                case 413:
                    method4785(var1, 1625353844);
                    break;
                case 414:
                    class788.method2395(var1, 1753243897);
                    break;
                case 415:
                    class827.method5358(var1, 1677157923);
                    break;
                case 416:
                    class691.method3780(var1, 589434309);
                    break;
                case 417:
                    class289.method6694(var1, 610314);
                    break;
                case 418:
                    class466.method4008(var1, (byte) -75);
                    break;
                case 419:
                    class182.method3305(var1, (short) -15290);
                    break;
                case 420:
                    class675.method4168(var1, 1665047418);
                    break;
                case 421:
                    class200.method4350(var1, -1413098683);
                    break;
                case 422:
                    class529.method2218(var1, (short) 3390);
                    break;
                case 423:
                    class572.method109(var1, -912871679);
                    break;
                case 424:
                    class122.method1606(var1, (byte) 118);
                    break;
                case 425:
                    class157.method3518(var1, (short) 256);
                    break;
                case 426:
                    class502.method1897(var1, 1835732629);
                    break;
                case 427:
                    class197.method3715(var1, (byte) -1);
                    break;
                case 428:
                    class508.method2499(var1, -80531025);
                    break;
                case 429:
                    class617.method5169(var1, (short) 8819);
                    break;
                case 430:
                    class747.method2612(var1, -1547428014);
                    break;
                case 431:
                    class420.method5797(var1, -1212653763);
                    break;
                case 432:
                    class932.method6301(var1, 1680245596);
                    break;
                case 433:
                    class969.method1691(var1, 207023539);
                    break;
                case 434:
                    class221.method4035(var1, (byte) -33);
                    break;
                case 435:
                    class296.method6511(var1, -1083138642);
                    break;
                case 436:
                    class589.method215(var1, (byte) -76);
                    break;
                case 437:
                    class793.method435(var1, (short) 30614);
                    break;
                case 438:
                    class354.method1452(var1, 16711935);
                    break;
                case 439:
                    class197.method3716(var1, -1472785364);
                    break;
                case 440:
                    class4.method2962(var1, -1145564068);
                    break;
                case 441:
                    class516.method2725(var1, (byte) -98);
                    break;
                case 442:
                    class285.method6661(var1, 812106257);
                    break;
                case 443:
                    class459.method3967(var1, (byte) 75);
                    break;
                case 444:
                    class593.method1234(var1, -2139639407);
                    break;
                case 445:
                    class930.method6269(var1, (byte) 6);
                    break;
                case 446:
                    class492.method4393(var1, -1604346519);
                    break;
                case 447:
                    class138.method993(var1, -1154101528);
                    break;
                case 448:
                    class814.method2928(var1, (byte) 50);
                    break;
                case 449:
                    class295.method6518(var1, -2055730235);
                    break;
                case 450:
                    class11.method3573(var1, 1241977323);
                    break;
                case 451:
                    class865.method5334(var1, (byte) -11);
                    break;
                case 452:
                    class23.method3427(var1, -1272242750);
                    break;
                case 453:
                    class616.method5217(var1, -2123966800);
                    break;
                case 454:
                    class576.method68(var1, 1314670869);
                    break;
                case 455:
                    class394.method3412(var1, 730022430);
                    break;
                case 456:
                    class544.method2366(var1, -778701321);
                    break;
                case 457:
                    class562.method811(var1, 1197670421);
                    break;
                case 458:
                    class154.method3489(var1, 49468000);
                    break;
                case 459:
                    class758.method2737(var1, (short) 107);
                    break;
                case 460:
                    InputStream.method6432(var1, -1138840838);
                    break;
                case 461:
                    class543.method2377(var1, (byte) 40);
                    break;
                case 462:
                    class978.method1846(var1, (byte) 7);
                    break;
                case 463:
                    class722.method2132(var1, (byte) 0);
                    break;
                case 464:
                    class304.method2390(var1, 1985942898);
                    break;
                case 465:
                    class603.method5084(var1, -1669324348);
                    break;
                case 466:
                    class5.method2960(var1, -1070853222);
                    break;
                case 467:
                    class191.method3722(var1, (byte) 1);
                    break;
                case 468:
                    class762.method2811(var1, -1832984147);
                    break;
                case 469:
                    class51.method1527(var1, (byte) 0);
                    break;
                case 470:
                    class553.method451(var1, -1965462704);
                    break;
                case 471:
                    class945.method2008(var1, -254589789);
                    break;
                case 472:
                    class553.method450(var1, 1738337222);
                    break;
                case 473:
                    class374.method1002(var1, (byte) 9);
                    break;
                case 474:
                    Widget.method844(var1, -1301901080);
                    break;
                case 475:
                    class622.method5337(var1, -1655827378);
                    break;
                case 476:
                    SceneGraphLevel.method3922(var1, -44637055);
                    break;
                case 477:
                    class495.method4483(var1, 425438776);
                    break;
                case 478:
                    class677.method4229(var1, (byte) -7);
                    break;
                case 479:
                    class295.method6519(var1, 128914215);
                    break;
                case 480:
                    class63.method1252(var1, (byte) 66);
                    break;
                case 481:
                    class794.method466(var1, (byte) 5);
                    break;
                case 482:
                    class888.method5531(var1, 1537225107);
                    break;
                case 483:
                    class610.method5140(var1, (byte) 93);
                    break;
                case 484:
                    class495.method4485(var1, -2049257801);
                    break;
                case 485:
                    class599.method1288(var1, (byte) 0);
                    break;
                case 486:
                    class5.method2958(var1, -1987644438);
                    break;
                case 487:
                    class646.method5498(var1, (byte) 33);
                    break;
                case 488:
                    class591.method1215(var1, 1989150042);
                    break;
                case 489:
                    class839.method5403(var1, (byte) 0);
                    break;
                case 490:
                    class819.method2936(var1, -1676514191);
                    break;
                case 491:
                    class924.method6256(var1, 1509971477);
                    break;
                case 492:
                    class345.method158(var1, (byte) 32);
                    break;
                case 493:
                    class84.method941(var1, -947251780);
                    break;
                case 494:
                    class86.method951(var1, (byte) 1);
                    break;
                case 495:
                    class281.method6689(var1, 569527875);
                    break;
                case 496:
                    class362.method1510(var1, -1618595821);
                    break;
                case 497:
                    class532.method2270(var1, 1255982811);
                    break;
                case 498:
                    class110.method1385(var1, (byte) 1);
                    break;
                case 499:
                    class640.method6188(var1, 884899016);
                    break;
                case 500:
                    class474.method4668(var1, (byte) 119);
                    break;
                case 501:
                    class170.method3077(var1, -2137349879);
                    break;
                case 502:
                    class78.method1127(var1, -787313655);
                    break;
                case 503:
                    class98.method528(var1, (byte) 1);
                    break;
                case 504:
                    class808.method2889(var1, (byte) 35);
                    break;
                case 505:
                    class407.method5535(var1, (byte) 64);
                    break;
                case 506:
                    class971.method1791(var1, (byte) -79);
                    break;
                case 507:
                    class416.method5650(var1, 1473056296);
                    break;
                case 508:
                    class770.method2303(var1, 691482692);
                    break;
                case 509:
                    class81.method866(var1, -590826729);
                    break;
                case 510:
                    class232.method4662(var1, (byte) -118);
                    break;
                case 511:
                    class19.method3369(var1, -1725650797);
                    break;
                case 512:
                    class706.method1934(var1, -677601316);
                    break;
                case 513:
                    class396.method3497(var1, 1718702464);
                    break;
                case 514:
                    class246.method4732(var1, -989156519);
                    break;
                case 515:
                    class342.method219(var1, 1578867315);
                    break;
                case 516:
                    class250.method4392(var1, 1640153392);
                    break;
                case 517:
                    class154.method3490(var1, -2108878548);
                    break;
                case 518:
                    class431.method4252(var1, (byte) 107);
                    break;
                case 519:
                    class24.method3464(var1, -1522097129);
                    break;
                case 520:
                    class86.method946(var1, 1510367089);
                    break;
                case 521:
                    class804.method2825(var1, 1611489031);
                    break;
                case 522:
                    class153.method3390(var1, -2074346365);
                    break;
                case 523:
                    class923.method6261(var1, 1041006938);
                    break;
                case 524:
                    class503.method2583(var1, 729067456);
                    break;
                case 525:
                    class283.method6646(var1, 1361398288);
                    break;
                case 526:
                    class95.method526(var1, 1872262310);
                    break;
                case 527:
                    class958.method2055(var1, (byte) -8);
                    break;
                case 528:
                    class928.method6203(var1, -1196081168);
                    break;
                case 529:
                    class599.method1290(var1, (byte) -114);
                    break;
                case 530:
                    class509.method2532(var1, 681479919);
                    break;
                case 531:
                    class1.method2985(var1, -1833396945);
                    break;
                case 532:
                    class469.method4022(var1, -1984597489);
                    break;
                case 533:
                    class110.method1387(var1, (byte) -1);
                    break;
                case 534:
                    class831.method5385(var1, 1209234986);
                    break;
                case 535:
                    class368.method1558(var1, (byte) -58);
                    break;
                case 536:
                    class589.method214(var1, -1031088519);
                    break;
                case 537:
                    class870.method5886(var1, 1517185146);
                    break;
                case 538:
                    class562.method810(var1, -229728299);
                    break;
                case 539:
                    RegionBase.method1149(var1, -1169366763);
                    break;
                case 540:
                    class909.method6438(var1, (byte) -103);
                    break;
                case 541:
                    class112.method1444(var1, 1579454524);
                    break;
                case 542:
                    class814.method2929(var1, (byte) 119);
                    break;
                case 543:
                    class769.method2259(var1, 809344003);
                    break;
                case 544:
                    class647.method5484(var1, (byte) 2);
                    break;
                case 545:
                    class472.method4614(var1, (byte) 1);
                    break;
                case 546:
                    class23.method3426(var1, -1380187850);
                    break;
                case 547:
                    class152.method3400(var1, 1279201719);
                    break;
                case 548:
                    class379.method961(var1, 555070552);
                    break;
                case 549:
                    class528.method2243(var1, -1985989501);
                    break;
                case 550:
                    class304.method2393(var1, 1549739808);
                    break;
                case 551:
                    class382.method1060(var1, 1608506793);
                    break;
                case 552:
                    class534.method2292(var1, (short) 4096);
                    break;
                case 553:
                    class881.method6169(var1, (byte) 24);
                    break;
                case 554:
                    Interactable.method2209(var1, (byte) -124);
                    break;
                case 555:
                    class622.method5338(var1, -1371982645);
                    break;
                case 556:
                    class394.method3411(var1, 1277374745);
                    break;
                case 557:
                    class425.method5731(var1, -2105152167);
                    break;
                case 558:
                    class51.method1536(var1, 497619825);
                    break;
                case 559:
                    class403.method6146(var1, 980097961);
                    break;
                case 560:
                    class279.method6614(var1, 372399345);
                    break;
                case 561:
                    class684.method4385(var1, -20883238);
                    break;
                case 562:
                    class98.method530(var1, -163805694);
                    break;
                case 563:
                    class18.method3688(var1, (byte) -118);
                    break;
                case 564:
                    class830.method5372(var1, -1493833726);
                    break;
                case 565:
                    class971.method1792(var1, 16711935);
                    break;
                case 566:
                    class814.method2930(var1, (short) 7888);
                    break;
                case 567:
                    class381.method1063(var1, (byte) -56);
                    break;
                case 568:
                    class120.method1502(var1, 1239918673);
                    break;
                case 569:
                    class167.method3695(var1, (byte) -2);
                    break;
                case 570:
                    class417.method5688(var1, -1476818364);
                    break;
                case 571:
                    class617.method5168(var1, -2141806690);
                    break;
                case 572:
                    class474.method4667(var1, 1242108112);
                    break;
                case 573:
                    class502.method1895(var1, 432669795);
                    break;
                case 574:
                    class76.method1113(var1, (byte) -55);
                    break;
                case 575:
                    class710.method2027(var1, 1273815113);
                    break;
                case 576:
                    class414.method5598(var1, (byte) -100);
                    break;
                case 577:
                    class228.method4590(var1, -1477453650);
                    break;
                case 578:
                    WidgetContainer.method895(var1, 200632723);
                    break;
                case 579:
                    class807.method2831(var1, (byte) 32);
                    break;
                case 580:
                    class861.method5349(var1, -1628700959);
                    break;
                case 581:
                    class844.method5099(var1, 621780015);
                    break;
                case 582:
                    class529.method2215(var1, 2015451573);
                    break;
                case 583:
                    class374.method1003(var1, (byte) -26);
                    break;
                case 584:
                    class71.method1086(var1, (byte) 15);
                    break;
                case 585:
                    class11.method3571(var1, -1382775658);
                    break;
                case 586:
                    class58.method1580(var1, -1927156197);
                    break;
                case 587:
                    class222.method4108(var1, (byte) 7);
                    break;
                case 588:
                    class19.method3368(var1, -1535402774);
                    break;
                case 589:
                    class14.method3600(var1, -634229301);
                    break;
                case 590:
                    class602.method5089(var1, (byte) 3);
                    break;
                case 591:
                    InputStream.method6434(var1, (byte) 0);
                    break;
                case 592:
                    class807.method2828(var1, -1662998366);
                    break;
                case 593:
                    class455.method3818(var1, 493346371);
                    break;
                case 594:
                    class880.method6174(var1, (byte) 0);
                    break;
                case 595:
                    SceneGraph.method2455(var1, (byte) 0);
                    break;
                case 596:
                    class143.method1175(var1, 1373771263);
                    break;
                case 597:
                    class296.method6506(var1, 369466225);
                    break;
                case 598:
                    class111.method1358(var1, -1837595972);
                    break;
                case 599:
                    class296.method6512(var1, -1820516849);
                    break;
                case 600:
                    class771.method2301(var1, (byte) 0);
                    break;
                case 601:
                    class182.method3304(var1, (byte) -4);
                    break;
                case 602:
                    class285.method6664(var1, (byte) 49);
                    break;
                case 603:
                    class764.method2746(var1, (byte) 2);
                    break;
                case 604:
                    class830.method5373(var1, -1762858678);
                    break;
                case 605:
                    class485.method4765(var1, (byte) -1);
                    break;
                case 606:
                    class647.method5485(var1, 1817737811);
                    break;
                case 607:
                    class381.method1062(var1, 1341452421);
                    break;
                case 608:
                    class353.method1382(var1, 1137861739);
                    break;
                case 609:
                    class909.method6435(var1, 1302049828);
                    break;
                case 610:
                    class127.method1598(var1, -1776680288);
                    break;
                case 611:
                    class684.method4384(var1, 2066622299);
                    break;
                case 612:
                    class86.method944(var1, -97691689);
                    break;
                case 613:
                    class637.method5934(var1, -1505297330);
                    break;
                case 614:
                    class75.method1119(var1, 183366610);
                    break;
                case 615:
                    class705.method1941(var1, (byte) 2);
                    break;
                case 616:
                    class495.method4486(var1, (short) 924);
                    break;
                case 617:
                    class843.method5460(var1, (short) 6900);
                    break;
                case 618:
                    class962.method2128(var1, (byte) 1);
                    break;
                case 619:
                    class492.method4394(var1, 344545663);
                    break;
                case 620:
                    class498.method4494(var1, (byte) 1);
                    break;
                case 621:
                    class141.method1095(var1, -379600420);
                    break;
                case 622:
                    class636.method5917(var1, (byte) 101);
                    break;
                case 623:
                    class321.method851(var1, -46636878);
                    break;
                case 624:
                    Node.method549(var1, (byte) 3);
                    break;
                case 625:
                    class744.method1901(var1, (byte) 1);
                    break;
                case 626:
                    class497.method4503(var1, 230037894);
                    break;
                case 627:
                    class629.method5809(var1, 157170275);
                    break;
                case 628:
                    class691.method3781(var1, 837325077);
                    break;
                case 629:
                    class129.method864(var1, -57827276);
                    break;
                case 630:
                    class779.method2325(var1, 524569581);
                    break;
                case 631:
                    class363.method1626(var1, (byte) -103);
                    break;
                case 632:
                    class948.method1937(var1, (short) 10691);
                    break;
                case 633:
                    class91.method497(var1, -1475821456);
                    break;
                case 634:
                    class519.method2668(var1, 1824559253);
                    break;
                case 635:
                    class509.method2531(var1, -2120575589);
                    break;
                case 636:
                    class49.method3091(var1, 1170915000);
                    break;
                case 637:
                    class921.method6250(var1, (byte) 25);
                    break;
                case 638:
                    class397.method3476(var1, (byte) 81);
                    break;
                case 639:
                    class807.method2830(var1, (byte) -112);
                    break;
                case 640:
                    class860.method5353(var1, 857283388);
                    break;
                case 641:
                    class679.method4266(var1, 1432495495);
                    break;
                case 642:
                    class250.method4390(var1, -828375289);
                    break;
                case 643:
                    class439.method4279(var1, (byte) 54);
                    break;
                case 644:
                    class625.method5825(var1, 583840352);
                    break;
                case 645:
                    class811.method2922(var1, (byte) 53);
                    break;
                case 646:
                    class35.method3336(var1, (byte) 6);
                    break;
                case 647:
                    class309.method364(var1, (byte) 12);
                    break;
                case 648:
                    class329.method20(var1, 969361751);
                    break;
                case 649:
                    class362.method1507(var1, (byte) 74);
                    break;
                case 650:
                    class299.method6553(var1, 1002819645);
                    break;
                case 651:
                    class923.method6259(var1, (byte) -67);
                    break;
                case 652:
                    class115.method1277(var1, -628325139);
                    break;
                case 653:
                    class200.method4353(var1, -2115838866);
                    break;
                case 654:
                    class928.method6202(var1, 990309833);
                    break;
                case 655:
                    class662.method5803(var1, (byte) 90);
                    break;
                case 656:
                    class572.method108(var1, -599828153);
                    break;
                case 657:
                    class874.method5859(var1, 1161176530);
                    break;
                case 658:
                    class193.method3737(var1, (byte) 74);
                    break;
                case 659:
                    class176.method3163(var1, -1953346525);
                    break;
                case 660:
                    class649.method5542(var1, 720237508);
                    break;
                case 661:
                    class428.method4152(var1, -828736304);
                    break;
                case 662:
                    class449.method3759(var1, (byte) 106);
                    break;
                case 663:
                    class192.method3741(var1, (short) -20131);
                    break;
                case 664:
                    class657.method5661(var1, 2108750118);
                    break;
                case 665:
                    class747.method2614(var1, -1018588903);
                    break;
                case 666:
                    class691.method3779(var1, 164651912);
                    break;
                case 667:
                    class843.method5463(var1, -405876281);
                    break;
                case 668:
                    class480.method4703(var1, -551831325);
                    break;
                case 669:
                    InputStream.method6431(var1, 149863973);
                    break;
                case 670:
                    class431.method4253(var1, 1075825682);
                    break;
                case 671:
                    class534.method2291(var1, -2024594230);
                    break;
                case 672:
                    class527.method2252(var1, 116413311);
                    break;
                case 673:
                    class495.method4482(var1, -1871209659);
                    break;
                case 674:
                    class99.method535(var1, -845925987);
                    break;
                case 675:
                    class979.method1832(var1, -1852366243);
                    break;
                case 676:
                    class881.method6170(var1, (byte) 99);
                    break;
                case 677:
                    class309.method359(var1, 1806116976);
                    break;
                case 678:
                    class429.method4147(var1, -294652296);
                    break;
                case 679:
                    class147.method1141(var1, -1151848154);
                    break;
                case 680:
                    class515.method2692(var1, (short) 9216);
                    break;
                case 681:
                    WidgetContainer.method894(var1, 251729607);
                    break;
                case 682:
                    class226.method4027(var1, (byte) -77);
                    break;
                case 683:
                    class716.method2048(var1, (byte) 59);
                    break;
                case 684:
                    class63.method1251(var1, 2011434697);
                    break;
                case 685:
                    class312.method417(var1, -110893029);
                    break;
                case 686:
                    class140.method1048(var1, -944287579);
                    break;
                case 687:
                    class423.method5711(var1, (byte) -21);
                    break;
                case 688:
                    class576.method70(var1, (short) 28169);
                    break;
                case 689:
                    class729.method1701(var1, -1558788446);
                    break;
                case 690:
                    class180.method3288(var1, 1797236687);
                    break;
                case 691:
                    class711.method2026(var1, 1331175254);
                    break;
                case 692:
                    class935.method6306(var1, -499258986);
                    break;
                case 693:
                    class679.method4272(var1, 1215799860);
                    break;
                case 694:
                    class440.method4334(var1, 2089165884);
                    break;
                case 695:
                    class811.method2923(var1, -149495111);
                    break;
                case 696:
                    class752.method2639(var1, 332768261);
                    break;
                case 697:
                    class643.method6121(var1, -2004045552);
                    break;
                case 698:
                    class788.method2398(var1, -721681032);
                    break;
                case 699:
                    class86.method950(var1, 681479919);
                    break;
                case 700:
                    class420.method5795(var1, 685678199);
                    break;
                case 701:
                    class83.method884(var1, -1567130989);
                    break;
                case 702:
                    class809.method2886(var1, -351314526);
                    break;
                case 703:
                    class935.method6305(var1, 1846705800);
                    break;
                case 704:
                    class675.method4167(var1, 606359910);
                    break;
                case 705:
                    class418.method5681(var1, -203050393);
                    break;
                case 706:
                    class931.method6268(var1, (byte) 56);
                    break;
                case 707:
                    Animation.method3564(var1, 285928237);
                    break;
                case 708:
                    class727.method1684(var1, 1946850329);
                    break;
                case 709:
                    class122.method1604(var1, -771074006);
                    break;
                case 710:
                    class117.method1343(var1, -387333489);
                    break;
                case 711:
                    class152.method3401(var1, -1247181121);
                    break;
                case 712:
                    class322.method816(var1, 204743600);
                    break;
                case 713:
                    class670.method4157(var1, (byte) 4);
                    break;
                case 714:
                    class798.method433(var1, 1744151230);
                    break;
                case 715:
                    class279.method6616(var1, 1254374330);
                    break;
                case 716:
                    class503.method2586(var1, 1713674883);
                    break;
                case 717:
                    class258.method4442(var1, -1993582837);
                    break;
                case 718:
                    SceneGraph.method2456(var1, 2003246166);
                    break;
                case 719:
                    class78.method1126(false, var1, (byte) 32);
                    break;
                case 720:
                    class198.method3751(var1, (byte) -49);
                    break;
                case 721:
                    class237.method4656(var1, -1632400543);
                    break;
                case 722:
                    class110.method1388(var1, (byte) 100);
                    break;
                case 723:
                    class222.method4109(var1, -1756524776);
                    break;
                case 724:
                    class625.method5824(var1, (byte) 3);
                    break;
                case 725:
                    class897.method5627(var1, -1489169021);
                    break;
                case 726:
                    class396.method3498(var1, 899226295);
                    break;
                case 727:
                    class250.method4389(var1, -1982169725);
                    break;
                case 728:
                    class980.method1916(var1, -1850912835);
                    break;
                case 729:
                    class660.method5751(var1, -202201566);
                    break;
                case 730:
                    class670.method4155(var1, -276667740);
                    break;
                case 731:
                    class858.method5222(var1, (short) 30667);
                    break;
                case 732:
                    class839.method5404(var1, (byte) -22);
                    break;
                case 733:
                    class759.method2724(var1, 1756443644);
                    break;
                case 734:
                    class385.method1182(var1, 665095786);
                    break;
                case 735:
                    class721.method2153(var1, (byte) -11);
                    break;
                case 736:
                    class979.method1836(var1, (byte) 36);
                    break;
                case 737:
                    class716.method2049(var1, 1643819642);
                    break;
                case 738:
                    class621.method5263(var1, (byte) -92);
                    break;
                case 739:
                    class980.method1918(var1, 1436328977);
                    break;
                case 740:
                    class593.method1233(var1, -1666187924);
                    break;
                case 741:
                    class576.method69(var1, (byte) 99);
                    break;
                case 742:
                    class538.method2342(var1, 1132221892);
                    break;
                case 743:
                    class535.method2279(var1, 1968907370);
                    break;
                case 744:
                    class899.method5664(var1, (byte) -126);
                    break;
                case 745:
                    class540.method2467(var1, (byte) 81);
                    break;
                case 746:
                    class919.method6487(var1, (short) 18840);
                    break;
                case 747:
                    class516.method2726(var1, (byte) -13);
                    break;
                case 748:
                    class83.method883(var1, (byte) 98);
                    break;
                case 749:
                    class540.method2463(var1, (byte) -15);
                    break;
                case 750:
                    class501.method1907(var1, (byte) 1);
                    break;
                case 751:
                    class574.method130(var1, (byte) 0);
                    break;
                case 752:
                    class264.method4565(var1, -1972349882);
                    break;
                case 753:
                    class721.method2154(var1, -631405272);
                    break;
                case 754:
                    class602.method5087(var1, -866602563);
                    break;
                case 755:
                    class191.method3725(var1, (byte) -82);
                    break;
                case 756:
                    class529.method2214(var1, -1086298177);
                    break;
                case 757:
                    class744.method1902(var1, 663211790);
                    break;
                case 758:
                    class111.method1356(var1, -1528160101);
                    break;
                case 759:
                    class610.method5142(var1, 65408);
                    break;
                case 760:
                    class980.method1914(var1, (byte) 0);
                    break;
                case 761:
                    class783.method2495(var1, 1200807731);
                    break;
                case 762:
                    class636.method5916(var1, (short) 1888);
                    break;
                case 763:
                    class676.method4161(var1, 1338052859);
                    break;
                case 764:
                    class610.method5137(var1, -2133026799);
                    break;
                case 765:
                    class241.method4706(var1, -1319700500);
                    break;
                case 766:
                    class830.method5376(var1, (byte) 3);
                    break;
                case 767:
                    class744.method1904(var1, 1378939686);
                    break;
                case 768:
                    class606.method4789(var1, -1092945905);
                    break;
                case 769:
                    class644.method6164(var1, (byte) 56);
                    break;
                case 770:
                    class128.method1584(var1, -1800796092);
                    break;
                case 771:
                    class71.method1089(var1, (byte) 12);
                    break;
                case 772:
                    class949.method1954(var1, -1856120485);
                    break;
                case 773:
                    class417.method5692(var1, (byte) 21);
                    break;
                case 774:
                    class207.method3754(var1, 223416426);
                    break;
                case 775:
                    class599.method1289(var1, (byte) 29);
                    break;
                case 776:
                    class59.method1616(var1, -569391443);
                    break;
                case 777:
                    class976.method1821(var1, -774922497);
                    break;
                case 778:
                    class385.method1179(var1, (byte) -44);
                    break;
                case 779:
                    class643.method6120(var1, 1722178877);
                    break;
                case 780:
                    class510.method2623(var1, -1171406662);
                    break;
                case 781:
                    class935.method6303(var1, 1296723312);
                    break;
                case 782:
                    class649.method5544(var1, (byte) 3);
                    break;
                case 783:
                    class197.method3717(var1, (byte) -4);
                    break;
                case 784:
                    class495.method4481(var1, (byte) 107);
                    break;
                case 785:
                    class134.method1036(var1, 1347279720);
                    break;
                case 786:
                    class503.method2584(var1, (short) -23521);
                    break;
                case 787:
                    class614.method5192(var1, -2146822245);
                    break;
                case 788:
                    class312.method419(var1, (byte) -128);
                    break;
                case 789:
                    class122.method1605(var1, (byte) -7);
                    break;
                case 790:
                    class417.method5689(var1, (byte) 1);
                    break;
                case 791:
                    class283.method6645(var1, 1621691163);
                    break;
                case 792:
                    class949.method1953(var1, -1676993823);
                    break;
                case 793:
                    class984.method1880(var1, (short) 205);
                    break;
                case 794:
                    class670.method4156(var1, 814786304);
                    break;
                case 795:
                    class147.method1139(var1, (byte) 2);
                    break;
                case 796:
                    class978.method1843(var1, (byte) 120);
                    break;
                case 797:
                    class277.method6635(var1, -242671131);
                    break;
                case 798:
                    class115.method1273(var1, 1800478518);
                    break;
                case 799:
                    class449.method3764(var1, (byte) -123);
                    break;
                case 800:
                    class125.method1562(var1, 919959672);
                    break;
                case 801:
                    class321.method854(var1, -861418612);
                    break;
                case 802:
                    class839.method5402(var1, 16777472);
                    break;
                case 803:
                    class255.method4496(var1, -11258305);
                    break;
                case 804:
                    class335.method42(var1, 134903413);
                    break;
                case 805:
                    class374.method999(var1, (byte) 122);
                    break;
                case 806:
                    class861.method5351(var1, (byte) 20);
                    break;
                case 807:
                    class474.method4666(var1, (short) 23733);
                    break;
                case 808:
                    class167.method3698(var1, 1822800004);
                    break;
                case 809:
                    class416.method5651(var1, (byte) 100);
                    break;
                case 810:
                    class646.method5499(var1, (byte) 9);
                    break;
                case 811:
                    class810.method2897(var1, -34631048);
                    break;
                case 812:
                    class915.method6440(var1, -2116277832);
                    break;
                case 813:
                    class912.method6483(var1, (byte) 84);
                    break;
                case 814:
                    class76.method1110(var1, (byte) 75);
                    break;
                case 815:
                    class182.method3309(var1, -2035886315);
                    break;
                case 816:
                    class399.method3527(var1, (short) -2418);
                    break;
                case 817:
                    class405.method5477(var1, 1268832178);
                    break;
                case 818:
                    class167.method3700(var1, -491927235);
                    break;
                case 819:
                    class844.method5098(var1, (byte) 26);
                    break;
                case 820:
                    class386.method1166(var1, 881308872);
                    break;
                case 821:
                    class56.method1547(var1, (byte) 71);
                    break;
                case 822:
                    class932.method6298(var1, 1178461027);
                    break;
                case 823:
                    class535.method2283(var1, (short) -6564);
                    break;
                case 824:
                    class684.method4381(var1, 949483828);
                    break;
                case 825:
                    class405.method5475(var1, 1017276543);
                    break;
                case 826:
                    class543.method2374(var1, (byte) 25);
                    break;
                case 827:
                    class899.method5662(var1, (byte) 67);
                    break;
                case 828:
                    class118.method1460(var1, (byte) 4);
                    break;
                case 829:
                    class749.method2524(var1, (short) -88);
                    break;
                case 830:
                    class403.method6148(var1, -930002462);
                    break;
                case 831:
                    class170.method3074(var1, 1863966908);
                    break;
                case 832:
                    class981.method1933(var1, -847776836);
                    break;
                case 833:
                    class220.method4045(var1, 953984780);
                    break;
                case 834:
                    class870.method5887(var1, -1989095211);
                    break;
                case 835:
                    class348.method191(var1, -1450243199);
                    break;
                case 836:
                    class110.method1384(var1, (byte) -82);
                    break;
                case 837:
                    class718.method2068(var1, (byte) 13);
                    break;
                case 838:
                    class965.method1717(var1, -1549389992);
                    break;
                case 839:
                    class614.method5189(var1, 1883790668);
                    break;
                case 840:
                    class882.method6192(var1, -1414751661);
                    break;
                case 841:
                    class931.method6267(var1, (byte) 0);
                    break;
                case 842:
                    class354.method1453(var1, (byte) -73);
                    break;
                case 843:
                    class106.method173(var1, (byte) 7);
                    break;
                case 844:
                    class69.method1338(var1, (byte) -125);
                    break;
                case 845:
                    class679.method4267(var1, 423870940);
                    break;
                case 846:
                    class213.method3813(var1, 806715823);
                    break;
                case 847:
                    class278.method6629(var1, -126992068);
                    break;
                case 848:
                    class161.method3550(var1, 1265641201);
                    break;
                case 849:
                    class264.method4566(var1, (byte) -15);
                    break;
                case 850:
                    class846.method5124(var1, -563614549);
                    break;
                case 851:
                    class397.method3477(var1, -1244133594);
                    break;
                case 852:
                    SceneGraphLevel.method3920(var1, 1444913105);
                    break;
                case 853:
                    class932.method6295(var1, (byte) -73);
                    break;
                case 854:
                    class874.method5854(var1, -1184080464);
                    break;
                case 855:
                    SceneTile.method3728(var1, (byte) 1);
                    break;
                case 856:
                    class51.method1525(var1, 1504628080);
                    break;
                case 857:
                    class461.method3990(var1, (byte) 97);
                    break;
                case 858:
                    class622.method5342(var1, -72078372);
                    break;
                case 859:
                    class413.method5610(var1, (short) -156);
                    break;
                case 860:
                    class228.method4587(var1, 706835646);
                    break;
                case 861:
                    class72.method1073(var1, -1529756171);
                    break;
                case 862:
                    class27.method3471(var1, (short) 11117);
                    break;
                case 863:
                    class143.method1174(var1, -1661899204);
                    break;
                case 864:
                    class544.method2367(var1, (byte) 127);
                    break;
                case 865:
                    class78.method1124(var1, -865836133);
                    break;
                case 866:
                    class718.method2074(var1, (byte) -75);
                    break;
                case 867:
                    class250.method4391(var1, -2025451044);
                    break;
                case 868:
                    class296.method6508(var1, (byte) 24);
                    break;
                case 869:
                    class378.method972(var1, -2046295095);
                    break;
                case 870:
                    class154.method3486(var1, 1574880083);
                    break;
                case 871:
                    class669.method4120(var1, -1416602836);
                    break;
                case 872:
                    class933.method6287(var1, (byte) -111);
                    break;
                case 873:
                    class969.method1696(var1, 953966748);
                    break;
                case 874:
                    class110.method1386(var1, -1605491196);
                    break;
                case 875:
                    class122.method1602(var1, 330356398);
                    break;
                case 876:
                    class971.method1787(var1, 1960137295);
                    break;
                case 877:
                    class482.method4717(var1, -831062827);
                    break;
                case 878:
                    class662.method5804(var1, -300761909);
                    break;
                case 879:
                    class906.method6343(var1, 1791596559);
                    break;
                case 880:
                    class924.method6255(var1, -1459171449);
                    break;
                case 881:
                    class831.method5382(var1, 1885494312);
                    break;
                case 882:
                    class139.method982(var1, -973474154);
                    break;
                case 883:
                    class752.method2643(var1, 66496622);
                    break;
                case 884:
                    class646.method5503(var1, 786056537);
                    break;
                case 885:
                    class823.method5363(var1, 2080573625);
                    break;
                case 886:
                    class647.method5490(var1, 1029059146);
                    break;
                case 887:
                    class422.method5720(var1, -590295822);
                    break;
                case 888:
                    class407.method5537(var1, -2131036874);
                    break;
                case 889:
                    class788.method2396(var1, (byte) 1);
                    break;
                case 890:
                    class606.method4790(var1, -1113867771);
                    break;
                case 891:
                    class396.method3504(var1, (byte) 115);
                    break;
                case 892:
                    class4.method2963(var1, 2118681676);
                    break;
                case 893:
                    class909.method6437(var1, -311375034);
                    break;
                case 894:
                    class341.method261(var1, -1718722194);
                    break;
                case 895:
                    class215.method3833(var1, (byte) 1);
                    break;
                case 896:
                    class984.method1878(var1, -506105871);
                    break;
                case 897:
                    class86.method947(var1, 199578213);
                    break;
                case 898:
                    class474.method4665(var1, (short) 940);
                    break;
                case 899:
                    class304.method2392(var1, (byte) 33);
                    break;
                case 900:
                    class495.method4484(var1, 256135967);
                    break;
                case 901:
                    class870.method5888(var1, -1918176970);
                    break;
                case 902:
                    class607.method4780(var1, (byte) 121);
                    break;
                case 903:
                    RegionBase.method1147(var1, 1719357541);
                    break;
                case 904:
                    class28.method3534(var1, 1844978034);
                    break;
                case 905:
                    class341.method254(var1, 911404958);
                    break;
                case 906:
                    class500.method1861(var1, -1394910424);
                    break;
                case 907:
                    class904.method6335(var1, -1508997346);
                    break;
                case 908:
                    class223.method4105(var1, (byte) 0);
                    break;
                case 909:
                    class51.method1528(var1, (byte) 8);
                    break;
                case 910:
                    class692.method3777(var1, (byte) -63);
                    break;
                case 911:
                    class977.method1816(var1, -58370938);
                    break;
                case 912:
                    class422.method5722(var1, -2147483647);
                    break;
                case 913:
                    class153.method3391(var1, (byte) 14);
                    break;
                case 914:
                    class860.method5354(var1, (short) -2807);
                    break;
                case 915:
                    class853.method5158(var1, (byte) 9);
                    break;
                case 916:
                    class77.method1134(var1, -1992730141);
                    break;
                case 917:
                    class237.method4654(var1, -1722740585);
                    break;
                case 918:
                    class886.method6165(var1, 1454638245);
                    break;
                case 919:
                    class808.method2893(var1, (byte) 12);
                    break;
                case 920:
                    class675.method4166(var1, (byte) 16);
                    break;
                case 921:
                    class881.method6168(var1, -2117013943);
                    break;
                case 922:
                    class86.method945(var1, -87259897);
                    break;
                case 923:
                    class758.method2736(var1, 1438080396);
                    break;
                case 924:
                    class600.method5465(var1, -1595463960);
                    break;
                case 925:
                    class695.method3938(var1, -1553923921);
                    break;
                case 926:
                    class271.method6595(var1, (byte) 1);
                    break;
                case 927:
                    class689.method4321(var1, (byte) 53);
                    break;
                case 928:
                    class969.method1695(var1, (byte) -123);
                    break;
                case 929:
                    Widget.method841(var1, (short) -3148);
                    break;
                case 930:
                    RegionBase.method1155(var1, 1971452733);
                    break;
                case 931:
                    WidgetContainer.method891(var1, (byte) 105);
                    break;
                case 932:
                    class617.method5170(var1, -766567275);
                    break;
                case 933:
                    class785.method2381(var1, -435039707);
                    break;
                case 934:
                    class209.method3771(var1, (byte) -49);
                    break;
                case 935:
                    class692.method3778(var1, 202864030);
                    break;
                case 936:
                    class216.method3827(var1, 469166159);
                    break;
                case 937:
                    class416.method5648(var1, -743929031);
                    break;
                case 938:
                    class646.method5505(var1, (byte) 15);
                    break;
                case 939:
                    class890.method5558(var1, (byte) -23);
                    break;
                case 940:
                    class754.method2661(var1, -979669979);
                    break;
                case 941:
                    class508.method2500(var1, 1843731564);
                    break;
                case 942:
                    class103.method155(var1, -1629026488);
                    break;
                case 943:
                    class621.method5262(var1, 2041694879);
                    break;
                case 944:
                    class399.method3528(var1, -468496886);
                    break;
                case 945:
                    class590.method1221(var1, -506105871);
                    break;
                case 946:
                    class490.method4438(var1, -199910593);
                    break;
                case 947:
                    Widget.method840(var1, 2069476162);
                    break;
                case 948:
                    class263.method4515(var1, 253995269);
                    break;
                case 949:
                    class197.method3714(var1, -2105578672);
                    break;
                case 950:
                    class418.method5682(var1, 2001824513);
                    break;
                case 951:
                    class407.method5540(var1, (byte) -79);
                    break;
                case 952:
                    class874.method5855(var1, -2088416900);
                    break;
                case 953:
                    class384.method1081(var1, (byte) 98);
                    break;
                case 954:
                    class399.method3531(var1, -250517882);
                    break;
                case 955:
                    class877.method5928(var1, -2005000447);
                    break;
                case 956:
                    class649.method5543(var1, -1239172072);
                    break;
                case 957:
                    class321.method856(var1, -1588549216);
                    break;
                case 958:
                    class77.method1135(var1, -847832283);
                    break;
                case 959:
                    class152.method3403(var1, -1352744007);
                    break;
                case 960:
                    class547.method380(var1, (short) 19235);
                    break;
                case 961:
                    class972.method1772(var1, (byte) -35);
                    break;
                case 962:
                    class616.method5213(var1, -1776517803);
                    break;
                case 963:
                    class82.method916(var1, -177676721);
                    break;
                case 964:
                    class502.method1898(var1, -2036843330);
                    break;
                case 965:
                    class507.method2509(var1, 1204781466);
                    break;
                case 966:
                    class890.method5561(var1, 1842008339);
                    break;
                case 967:
                    class693.method3878(var1, -607084087);
                    break;
                case 968:
                    class374.method1001(var1, 2064208526);
                    break;
                case 969:
                    class122.method1601(var1, -175137631);
                    break;
                case 970:
                    class151.method3373(var1, 710185134);
                    break;
                case 971:
                    class342.method218(var1, (byte) -83);
                    break;
                case 972:
                    class502.method1896(var1, -1584588285);
                    break;
                case 973:
                    class882.method6193(var1, 604783087);
                    break;
                case 974:
                    class161.method3548(var1, (short) 25223);
                    break;
                case 975:
                    class670.method4158(var1, (byte) 0);
                    break;
                case 976:
                    class140.method1047(var1, -1233866115);
                    break;
                case 977:
                    class379.method963(var1, 563539438);
                    break;
                case 978:
                    class283.method6642(var1, -1739605096);
                    break;
                case 979:
                    class718.method2073(var1, (byte) 12);
                    break;
                case 980:
                    class843.method5461(var1, 1815292651);
                    break;
                case 981:
                    class341.method260(var1, (byte) 34);
                    break;
                case 982:
                    class120.method1504(var1, (byte) 124);
                    break;
                case 983:
                    class108.method1199(var1, -16711936);
                    break;
                case 984:
                    class247.method4723(var1, 1747589661);
                    break;
                case 985:
                    class379.method960(var1, -1050961141);
                    break;
                case 986:
                    class739.method1793(var1, -1409129616);
                    break;
                case 987:
                    class602.method5086(var1, (byte) -1);
                    break;
                case 988:
                    class727.method1685(var1, 1786794242);
                    break;
                case 989:
                    class851.method5149(var1, 437625390);
                    break;
                case 990:
                    class822.method5369(var1, 1552766611);
                    break;
                case 991:
                    class843.method5459(var1, (byte) 71);
                    break;
                case 992:
                    class721.method2152(var1, 717687403);
                    break;
                case 993:
                    class958.method2054(var1, 1193516012);
                    break;
                default:
                    throw new RuntimeException();
            }

        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kk.g(" + ')');
        }
    }

    static final void method4784(Widget var0, WidgetContainer var1, class744 var2, int var3) {
        try {
            var0.field909 = 5;
            var0.field876 = var2.field3161[--var2.field3156];
            if (-1 == var0.field879 && !var1.closed) {
                class535.method2284(var0.field867, 1872852053);
            }

        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kk.if(" + ')');
        }
    }

    static final void method4785(class744 var0, int var1) {
        try {
            class237 var2 = var0.field3178 ? var0.field3164 : var0.field3163;
            Widget var3 = var2.field8255;
            WidgetContainer var4 = var2.field8254;
            class611.method5157(var3, var4, var0, -1389112437);
        } catch (RuntimeException var5) {
            throw class158.method3445(var5, "kk.nb(" + ')');
        }
    }

    public int method4628(int var1) {
        try {
            return this.field8565;
        } catch (RuntimeException var3) {
            throw class158.method3445(var3, "kk.a(" + ')');
        }
    }

    public void method4627(int var1) {
    }

    public class414 method4625(int var1, int var2) {
        try {
            return this.field8564[var1];
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kk.k(" + ')');
        }
    }

    public int[] method4622(int var1, float var2, int var3, int var4, boolean var5, int var6) {
        try {
            int[] var7 = this.method4781(var1, 1119072054).method1841(this.field8562, this, (double) var2, var3, var4, var5, this.field8564[var1].field9398, -1817838295);
            return var7;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "kk.b(" + ')');
        }
    }

    public int[] method4623(int var1, float var2, int var3, int var4, boolean var5, byte var6) {
        try {
            int[] var7 = this.method4781(var1, 1019997631).method1839(this.field8562, this, (double) var2, var3, var4, this.field8564[var1].field9398, -524170328);
            return var7;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "kk.p(" + ')');
        }
    }

    class736 method4781(int var1, int var2) {
        try {
            class345 var3 = this.field8566.method3070((long) var1);
            if (var3 != null) {
                return (class736) var3;
            } else {
                byte[] var4 = this.field8563.method3264(var1, (byte) 51);
                if (var4 == null) {
                    return null;
                } else {
                    class736 var5 = new class736(new InputStream(var4));
                    this.field8566.method3072(var5, (long) var1);
                    return var5;
                }
            }
        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "kk.w(" + ')');
        }
    }

    public boolean method4621(int var1, short var2) {
        try {
            class736 var3 = this.method4781(var1, 709398631);
            return var3 != null && var3.method1838(this.field8562, this, (byte) -26);
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "kk.f(" + ')');
        }
    }

    public float[] method4632(int var1, float var2, int var3, int var4, boolean var5, byte var6) {
        try {
            float[] var7 = this.method4781(var1, -1967108124).method1840(this.field8562, this, var3, var4, this.field8564[var1].field9398, -1481337578);
            return var7;
        } catch (RuntimeException var8) {
            throw class158.method3445(var8, "kk.i(" + ')');
        }
    }
}
