public class class114 {
    public static int field1722 = 1;
    public static int field1723 = 2;
    public static int field1755 = -1;
    static class1 field1721 = new class1(64);
    static class180 field1727;
    static int field1767 = 0;
    public boolean field1724 = false;
    public int field1725 = 0;
    public short field1726;
    public short field1728;
    public int[] field1729;
    public int field1730;
    public int field1732;
    public int field1734 = -1;
    public int[] field1735;
    public int field1737;
    public int field1738 = -1;
    public boolean field1742 = true;
    public int field1743;
    public int field1746 = -1;
    public int field1747;
    public int field1748;
    public int field1749;
    public int field1750;
    public int field1751;
    public int[] field1752;
    public int field1753;
    public int[] field1754;
    public int field1756 = -2;
    public int field1757 = -2;
    public int field1758 = 0;
    public short field1759;
    public boolean field1760 = true;
    public int field1761 = -1;
    public int field1762;
    public int field1763 = 0;
    public int field1764;
    public int field1765 = -1;
    public boolean field1766 = true;
    public boolean field1768 = false;
    public boolean field1769 = true;
    public boolean field1770 = false;
    public int field1771;
    public int field1773;
    public int field1774;
    public int field1775;
    public int field1776;
    public int field1777;
    public int field1779 = -1;
    public boolean field1780 = true;
    public short field1781;
    public int field1782;
    public boolean field1783 = true;
    public int field1784;
    public int field1785;
    public int field1786;
    public int field1787;
    public int field1788;
    public int field1789;
    public int field1790;
    public int field1791;
    public int field1792;
    int field1731;
    int field1733;
    int field1736 = 100;
    int field1739 = 100;
    int field1740;
    int field1741;
    int field1744 = 100;
    int field1745 = 100;
    int field1772;
    int field1778;

    static final void method1295(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        try {
            if (class730.field2705 == 3) {
                int var8 = class498.field8102;
                int[] var9 = class498.field8108;

                int var10;
                for (var10 = 0; var10 < var8; ++var10) {
                    Player var11 = class730.loaded[var9[var10]];
                    if (var11 != null) {
                        var11.method2569(var0, var1, var2, var3, var4, var5, var6, (byte) 12);
                    }
                }

                for (var10 = 0; var10 < class730.field2684; ++var10) {
                    int var14 = class730.field2680[var10];
                    class437 var12 = (class437) class730.field2677.method2942((long) var14);
                    if (var12 != null) {
                        ((Actor) var12.field7515).method2569(var0, var1, var2, var3, var4, var5, var6, (byte) 12);
                    }
                }
            }

        } catch (RuntimeException var13) {
            throw class158.method3445(var13, "hp.js(" + ')');
        }
    }

    static void method1296(byte var0) {
        try {
            class682.field7698.method2941((byte) -40);
            class682.field7684.method2710(1028697182);
            class682.field7715.method2710(1342386694);
        } catch (RuntimeException var2) {
            throw class158.method3445(var2, "hp.f(" + ')');
        }
    }

    void method1292(InputStream var1, byte var2) {
        try {
            while (true) {
                int var3 = var1.method6371();
                if (var3 == 0) {
                    return;
                }

                this.method1293(var1, var3, (short) 3276);
            }
        } catch (RuntimeException var4) {
            throw class158.method3445(var4, "hp.b(" + ')');
        }
    }

    void method1293(InputStream var1, int var2, short var3) {
        try {
            if (1 == var2) {
                this.field1726 = (short) var1.method6374();
                this.field1759 = (short) var1.method6374();
                this.field1728 = (short) var1.method6374();
                this.field1781 = (short) var1.method6374();
                byte var4 = 3;
                this.field1726 = (short) (this.field1726 << var4);
                this.field1759 = (short) (this.field1759 << var4);
                this.field1728 = (short) (this.field1728 << var4);
                this.field1781 = (short) (this.field1781 << var4);
            } else if (2 == var2) {
                var1.method6371();
            } else if (3 == var2) {
                this.field1730 = var1.method6420((byte) 43);
                this.field1764 = var1.method6420((byte) -103);
            } else if (var2 == 4) {
                this.field1725 = var1.method6371();
                this.field1753 = var1.method6372(-12558881);
            } else if (5 == var2) {
                this.field1775 = this.field1737 = var1.method6374() << 12 << 2;
            } else if (6 == var2) {
                this.field1740 = var1.method6420((byte) 100);
                this.field1741 = var1.method6420((byte) -15);
            } else if (7 == var2) {
                this.field1747 = var1.method6374();
                this.field1748 = var1.method6374();
            } else if (var2 == 8) {
                this.field1749 = var1.method6374();
                this.field1750 = var1.method6374();
            } else {
                int var5;
                int var7;
                if (9 == var2) {
                    var7 = var1.method6371();
                    this.field1729 = new int[var7];

                    for (var5 = 0; var5 < var7; ++var5) {
                        this.field1729[var5] = var1.method6374();
                    }
                } else if (10 == var2) {
                    var7 = var1.method6371();
                    this.field1735 = new int[var7];

                    for (var5 = 0; var5 < var7; ++var5) {
                        this.field1735[var5] = var1.method6374();
                    }
                } else if (12 == var2) {
                    this.field1756 = var1.method6372(-12558881);
                } else if (var2 == 13) {
                    this.field1757 = var1.method6372(-12558881);
                } else if (14 == var2) {
                    this.field1758 = var1.method6374();
                } else if (15 == var2) {
                    this.field1746 = var1.method6374();
                } else if (var2 == 16) {
                    this.field1742 = var1.method6371() == 1;
                    this.field1761 = var1.method6374();
                    this.field1765 = var1.method6374();
                    this.field1760 = var1.method6371() == 1;
                } else if (var2 == 17) {
                    this.field1779 = var1.method6374();
                } else if (18 == var2) {
                    this.field1743 = var1.method6420((byte) 24);
                } else if (var2 == 19) {
                    this.field1763 = var1.method6371();
                } else if (var2 == 20) {
                    this.field1744 = var1.method6371();
                } else if (21 == var2) {
                    this.field1745 = var1.method6371();
                } else if (var2 == 22) {
                    this.field1734 = var1.method6420((byte) -1);
                } else if (23 == var2) {
                    this.field1736 = var1.method6371();
                } else if (24 == var2) {
                    this.field1766 = false;
                } else if (25 == var2) {
                    var7 = var1.method6371();
                    this.field1752 = new int[var7];

                    for (var5 = 0; var5 < var7; ++var5) {
                        this.field1752[var5] = var1.method6374();
                    }
                } else if (var2 == 26) {
                    this.field1783 = false;
                } else if (var2 == 27) {
                    this.field1738 = var1.method6374() << 12 << 2;
                } else if (var2 == 28) {
                    this.field1739 = var1.method6371();
                } else if (29 == var2) {
                    var1.method6367(1655872053);
                } else if (30 == var2) {
                    this.field1724 = true;
                } else if (var2 == 31) {
                    this.field1775 = var1.method6374() << 12 << 2;
                    this.field1737 = var1.method6374() << 12 << 2;
                } else if (32 == var2) {
                    this.field1780 = false;
                } else if (33 == var2) {
                    this.field1768 = true;
                } else if (34 == var2) {
                    this.field1769 = false;
                }
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "hp.p(" + ')');
        }
    }

    void method1294(int var1) {
        try {
            if (this.field1756 > -2 || this.field1757 > -2) {
                this.field1770 = true;
            }

            this.field1771 = this.field1740 >> 16 & 255;
            this.field1772 = this.field1741 >> 16 & 255;
            this.field1773 = this.field1772 - this.field1771;
            this.field1774 = this.field1740 >> 8 & 255;
            this.field1731 = this.field1741 >> 8 & 255;
            this.field1776 = this.field1731 - this.field1774;
            this.field1777 = this.field1740 & 255;
            this.field1733 = this.field1741 & 255;
            this.field1762 = this.field1733 - this.field1777;
            this.field1732 = this.field1740 >> 24 & 255;
            this.field1778 = this.field1741 >> 24 & 255;
            this.field1782 = this.field1778 - this.field1732;
            if (this.field1743 != 0) {
                this.field1792 = this.field1744 * this.field1748 / 100;
                this.field1751 = this.field1748 * this.field1745 / 100;
                if (this.field1792 == 0) {
                    this.field1792 = 1;
                }

                this.field1785 = ((this.field1743 >> 16 & 255) - (this.field1773 / 2 + this.field1771) << 8) / this.field1792;
                this.field1786 = ((this.field1743 >> 8 & 255) - (this.field1774 + this.field1776 / 2) << 8) / this.field1792;
                this.field1787 = ((this.field1743 & 255) - (this.field1777 + this.field1762 / 2) << 8) / this.field1792;
                if (this.field1751 == 0) {
                    this.field1751 = 1;
                }

                this.field1788 = ((this.field1743 >> 24 & 255) - (this.field1732 + this.field1782 / 2) << 8) / this.field1751;
                this.field1785 += this.field1785 > 0 ? -4 : 4;
                this.field1786 += this.field1786 > 0 ? -4 : 4;
                this.field1787 += this.field1787 > 0 ? -4 : 4;
                this.field1788 += this.field1788 > 0 ? -4 : 4;
            }

            if (this.field1734 != -1) {
                this.field1789 = this.field1736 * this.field1748 / 100;
                if (this.field1789 == 0) {
                    this.field1789 = 1;
                }

                this.field1790 = (this.field1734 - (this.field1730 + (this.field1764 - this.field1730) / 2)) / this.field1789;
            }

            if (this.field1738 != -1) {
                this.field1791 = this.field1739 * this.field1748 / 100;
                if (this.field1791 == 0) {
                    this.field1791 = 1;
                }

                this.field1784 = (this.field1738 - ((this.field1737 - this.field1775) / 2 + this.field1775)) / this.field1791;
            }

        } catch (RuntimeException var6) {
            throw class158.method3445(var6, "hp.i(" + ')');
        }
    }
}
