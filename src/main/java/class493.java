public class class493 {
    static int field7852 = 2;
    static int field7855 = 38400;
    static int field7856 = 1;
    static int field7857 = 8;
    static int field7859 = 12;
    static int field7860 = 2001;
    static int field7861 = -2001;
    int field7853 = 0;
    class728 field7854;
    int field7858;

    class493(class728 var1) {
        this.field7854 = var1;
    }

    final boolean method4427(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        if (var1 <= 2001 && var2 <= 2001 && var3 <= 2001 && var4 <= 2001 && var5 <= 2001 && var6 <= 2001) {
            if (var1 >= -2001 && var2 >= -2001 && var3 >= -2001 && var4 >= -2001 && var5 >= -2001 && var6 >= -2001) {
                int var10;
                if (this.field7858 == 2) {
                    var10 = var4 + var1 * this.field7854.field2479;
                    if (var10 >= 0 && var10 < this.field7854.field2475.length && (var7 << 8) - '阀' < this.field7854.field2475[var10]) {
                        return false;
                    }

                    var10 = var5 + var2 * this.field7854.field2479;
                    if (var10 >= 0 && var10 < this.field7854.field2475.length && (var8 << 8) - '阀' < this.field7854.field2475[var10]) {
                        return false;
                    }

                    var10 = var6 + var3 * this.field7854.field2479;
                    if (var10 >= 0 && var10 < this.field7854.field2475.length && (var9 << 8) - '阀' < this.field7854.field2475[var10]) {
                        return false;
                    }
                }

                var10 = var5 - var4;
                int var11 = var2 - var1;
                int var12 = var6 - var4;
                int var13 = var3 - var1;
                int var14 = var8 - var7;
                int var15 = var9 - var7;
                if (var1 < var2 && var3 < var3) {
                    --var1;
                    if (var2 > var3) {
                        ++var2;
                    } else {
                        ++var3;
                    }
                } else if (var2 < var3) {
                    --var2;
                    if (var1 > var3) {
                        ++var1;
                    } else {
                        ++var3;
                    }
                } else {
                    --var3;
                    if (var1 > var2) {
                        ++var1;
                    } else {
                        ++var2;
                    }
                }

                int var16 = 0;
                if (var2 != var1) {
                    var16 = (var5 - var4 << 12) / (var2 - var1);
                }

                int var17 = 0;
                if (var3 != var2) {
                    var17 = (var6 - var5 << 12) / (var3 - var2);
                }

                int var18 = 0;
                if (var3 != var1) {
                    var18 = (var4 - var6 << 12) / (var1 - var3);
                }

                int var19 = var10 * var13 - var12 * var11;
                if (var19 == 0) {
                    return false;
                } else {
                    int var20 = (var14 * var13 - var15 * var11 << 8) / var19;
                    int var21 = (var15 * var10 - var14 * var12 << 8) / var19;
                    if (var1 <= var2 && var1 <= var3) {
                        if (var1 >= this.field7854.field2480) {
                            return true;
                        } else {
                            if (var2 > this.field7854.field2480) {
                                var2 = this.field7854.field2480;
                            }

                            if (var3 > this.field7854.field2480) {
                                var3 = this.field7854.field2480;
                            }

                            var7 = (var7 << 8) - var20 * var4 + var20;
                            if (var2 < var3) {
                                var6 = var4 <<= 12;
                                if (var1 < 0) {
                                    var6 -= var18 * var1;
                                    var4 -= var16 * var1;
                                    var7 -= var21 * var1;
                                    var1 = 0;
                                }

                                var5 <<= 12;
                                if (var2 < 0) {
                                    var5 -= var17 * var2;
                                    var2 = 0;
                                }

                                if (var1 != var2 && var18 < var16 || var1 == var2 && var18 > var17) {
                                    var3 -= var2;
                                    var2 -= var1;
                                    var1 *= this.field7854.field2479;

                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            while (true) {
                                                --var3;
                                                if (var3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var1, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var6 += var18;
                                                var5 += var17;
                                                var7 += var21;
                                                var1 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var1, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var6 += var18;
                                        var4 += var16;
                                        var7 += var21;
                                        var1 += this.field7854.field2479;
                                    }
                                } else {
                                    var3 -= var2;
                                    var2 -= var1;
                                    var1 *= this.field7854.field2479;

                                    while (true) {
                                        --var2;
                                        if (var2 < 0) {
                                            while (true) {
                                                --var3;
                                                if (var3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var1, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var6 += var18;
                                                var5 += var17;
                                                var7 += var21;
                                                var1 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var1, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var6 += var18;
                                        var4 += var16;
                                        var7 += var21;
                                        var1 += this.field7854.field2479;
                                    }
                                }
                            } else {
                                var5 = var4 <<= 12;
                                if (var1 < 0) {
                                    var5 -= var18 * var1;
                                    var4 -= var16 * var1;
                                    var7 -= var21 * var1;
                                    var1 = 0;
                                }

                                var6 <<= 12;
                                if (var3 < 0) {
                                    var6 -= var17 * var3;
                                    var3 = 0;
                                }

                                if ((var1 == var3 || var18 >= var16) && (var1 != var3 || var17 <= var16)) {
                                    var2 -= var3;
                                    var3 -= var1;
                                    var1 *= this.field7854.field2479;

                                    while (true) {
                                        --var3;
                                        if (var3 < 0) {
                                            while (true) {
                                                --var2;
                                                if (var2 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var1, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var6 += var17;
                                                var4 += var16;
                                                var7 += var21;
                                                var1 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var1, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var5 += var18;
                                        var4 += var16;
                                        var7 += var21;
                                        var1 += this.field7854.field2479;
                                    }
                                } else {
                                    var2 -= var3;
                                    var3 -= var1;
                                    var1 *= this.field7854.field2479;

                                    while (true) {
                                        --var3;
                                        if (var3 < 0) {
                                            while (true) {
                                                --var2;
                                                if (var2 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var1, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var6 += var17;
                                                var4 += var16;
                                                var7 += var21;
                                                var1 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var1, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var5 += var18;
                                        var4 += var16;
                                        var7 += var21;
                                        var1 += this.field7854.field2479;
                                    }
                                }
                            }
                        }
                    } else if (var2 <= var3) {
                        if (var2 >= this.field7854.field2480) {
                            return true;
                        } else {
                            if (var3 > this.field7854.field2480) {
                                var3 = this.field7854.field2480;
                            }

                            if (var1 > this.field7854.field2480) {
                                var1 = this.field7854.field2480;
                            }

                            var8 = (var8 << 8) - var20 * var5 + var20;
                            if (var3 < var1) {
                                var4 = var5 <<= 12;
                                if (var2 < 0) {
                                    var4 -= var16 * var2;
                                    var5 -= var17 * var2;
                                    var8 -= var21 * var2;
                                    var2 = 0;
                                }

                                var6 <<= 12;
                                if (var3 < 0) {
                                    var6 -= var18 * var3;
                                    var3 = 0;
                                }

                                if (var2 != var3 && var16 < var17 || var2 == var3 && var16 > var18) {
                                    var1 -= var3;
                                    var3 -= var2;
                                    var2 *= this.field7854.field2479;

                                    while (true) {
                                        --var3;
                                        if (var3 < 0) {
                                            while (true) {
                                                --var1;
                                                if (var1 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var2, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var4 += var16;
                                                var6 += var18;
                                                var8 += var21;
                                                var2 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var2, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var4 += var16;
                                        var5 += var17;
                                        var8 += var21;
                                        var2 += this.field7854.field2479;
                                    }
                                } else {
                                    var1 -= var3;
                                    var3 -= var2;
                                    var2 *= this.field7854.field2479;

                                    while (true) {
                                        --var3;
                                        if (var3 < 0) {
                                            while (true) {
                                                --var1;
                                                if (var1 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var2, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var4 += var16;
                                                var6 += var18;
                                                var8 += var21;
                                                var2 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var2, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var4 += var16;
                                        var5 += var17;
                                        var8 += var21;
                                        var2 += this.field7854.field2479;
                                    }
                                }
                            } else {
                                var6 = var5 <<= 12;
                                if (var2 < 0) {
                                    var6 -= var16 * var2;
                                    var5 -= var17 * var2;
                                    var8 -= var21 * var2;
                                    var2 = 0;
                                }

                                var4 <<= 12;
                                if (var1 < 0) {
                                    var4 -= var18 * var1;
                                    var1 = 0;
                                }

                                if (var16 < var17) {
                                    var3 -= var1;
                                    var1 -= var2;
                                    var2 *= this.field7854.field2479;

                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            while (true) {
                                                --var3;
                                                if (var3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var2, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var4 += var18;
                                                var5 += var17;
                                                var8 += var21;
                                                var2 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var2, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var6 += var16;
                                        var5 += var17;
                                        var8 += var21;
                                        var2 += this.field7854.field2479;
                                    }
                                } else {
                                    var3 -= var1;
                                    var1 -= var2;
                                    var2 *= this.field7854.field2479;

                                    while (true) {
                                        --var1;
                                        if (var1 < 0) {
                                            while (true) {
                                                --var3;
                                                if (var3 < 0) {
                                                    return true;
                                                }

                                                if (!this.method4428(this.field7854.field2475, var2, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                                    return false;
                                                }

                                                var4 += var18;
                                                var5 += var17;
                                                var8 += var21;
                                                var2 += this.field7854.field2479;
                                            }
                                        }

                                        if (!this.method4428(this.field7854.field2475, var2, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var8, var20, this.field7854.field2479)) {
                                            return false;
                                        }

                                        var6 += var16;
                                        var5 += var17;
                                        var8 += var21;
                                        var2 += this.field7854.field2479;
                                    }
                                }
                            }
                        }
                    } else if (var3 >= this.field7854.field2480) {
                        return true;
                    } else {
                        if (var1 > this.field7854.field2480) {
                            var1 = this.field7854.field2480;
                        }

                        if (var2 > this.field7854.field2480) {
                            var2 = this.field7854.field2480;
                        }

                        var9 = (var9 << 8) - var20 * var6 + var20;
                        if (var1 < var2) {
                            var5 = var6 <<= 12;
                            if (var3 < 0) {
                                var5 -= var17 * var3;
                                var6 -= var18 * var3;
                                var9 -= var21 * var3;
                                var3 = 0;
                            }

                            var4 <<= 12;
                            if (var1 < 0) {
                                var4 -= var16 * var1;
                                var1 = 0;
                            }

                            if (var17 < var18) {
                                var2 -= var1;
                                var1 -= var3;
                                var3 *= this.field7854.field2479;

                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        while (true) {
                                            --var2;
                                            if (var2 < 0) {
                                                return true;
                                            }

                                            if (!this.method4428(this.field7854.field2475, var3, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                                return false;
                                            }

                                            var5 += var17;
                                            var4 += var16;
                                            var9 += var21;
                                            var3 += this.field7854.field2479;
                                        }
                                    }

                                    if (!this.method4428(this.field7854.field2475, var3, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                        return false;
                                    }

                                    var5 += var17;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.field7854.field2479;
                                }
                            } else {
                                var2 -= var1;
                                var1 -= var3;
                                var3 *= this.field7854.field2479;

                                while (true) {
                                    --var1;
                                    if (var1 < 0) {
                                        while (true) {
                                            --var2;
                                            if (var2 < 0) {
                                                return true;
                                            }

                                            if (!this.method4428(this.field7854.field2475, var3, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                                return false;
                                            }

                                            var5 += var17;
                                            var4 += var16;
                                            var9 += var21;
                                            var3 += this.field7854.field2479;
                                        }
                                    }

                                    if (!this.method4428(this.field7854.field2475, var3, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                        return false;
                                    }

                                    var5 += var17;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.field7854.field2479;
                                }
                            }
                        } else {
                            var4 = var6 <<= 12;
                            if (var3 < 0) {
                                var4 -= var17 * var3;
                                var6 -= var18 * var3;
                                var9 -= var21 * var3;
                                var3 = 0;
                            }

                            var5 <<= 12;
                            if (var2 < 0) {
                                var5 -= var16 * var2;
                                var2 = 0;
                            }

                            if (var17 < var18) {
                                var1 -= var2;
                                var2 -= var3;
                                var3 *= this.field7854.field2479;

                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        while (true) {
                                            --var1;
                                            if (var1 < 0) {
                                                return true;
                                            }

                                            if (!this.method4428(this.field7854.field2475, var3, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                                return false;
                                            }

                                            var5 += var16;
                                            var6 += var18;
                                            var9 += var21;
                                            var3 += this.field7854.field2479;
                                        }
                                    }

                                    if (!this.method4428(this.field7854.field2475, var3, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                        return false;
                                    }

                                    var4 += var17;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.field7854.field2479;
                                }
                            } else {
                                var1 -= var2;
                                var2 -= var3;
                                var3 *= this.field7854.field2479;

                                while (true) {
                                    --var2;
                                    if (var2 < 0) {
                                        while (true) {
                                            --var1;
                                            if (var1 < 0) {
                                                return true;
                                            }

                                            if (!this.method4428(this.field7854.field2475, var3, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                                return false;
                                            }

                                            var5 += var16;
                                            var6 += var18;
                                            var9 += var21;
                                            var3 += this.field7854.field2479;
                                        }
                                    }

                                    if (!this.method4428(this.field7854.field2475, var3, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var9, var20, this.field7854.field2479)) {
                                        return false;
                                    }

                                    var4 += var17;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.field7854.field2479;
                                }
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    final boolean method4428(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        if (var5 > var8) {
            var5 = var8;
        }

        if (var4 < 0) {
            var4 = 0;
        }

        if (var4 >= var5) {
            return true;
        } else {
            var2 += var4 - 1;
            var3 = var5 - var4 >> 2;
            var6 += var7 * var4;
            if (this.field7858 == 1) {
                this.field7853 += var3;

                while (true) {
                    --var3;
                    if (var3 < 0) {
                        var3 = var5 - var4 & 3;

                        while (true) {
                            --var3;
                            if (var3 < 0) {
                                return true;
                            }

                            ++var2;
                            if (var6 < var1[var2]) {
                                var1[var2] = var6;
                            }

                            var6 += var7;
                        }
                    }

                    ++var2;
                    if (var6 < var1[var2]) {
                        var1[var2] = var6;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        var1[var2] = var6;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        var1[var2] = var6;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        var1[var2] = var6;
                    }

                    var6 += var7;
                }
            } else {
                var6 -= 38400;

                while (true) {
                    --var3;
                    if (var3 < 0) {
                        var3 = var5 - var4 & 3;

                        while (true) {
                            --var3;
                            if (var3 < 0) {
                                return true;
                            }

                            ++var2;
                            if (var6 < var1[var2]) {
                                return false;
                            }

                            var6 += var7;
                        }
                    }

                    ++var2;
                    if (var6 < var1[var2]) {
                        return false;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        return false;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        return false;
                    }

                    var6 += var7;
                    ++var2;
                    if (var6 < var1[var2]) {
                        return false;
                    }

                    var6 += var7;
                }
            }
        }
    }
}
