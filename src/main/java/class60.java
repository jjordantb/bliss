public class class60 extends class746 {
   int[] field1625 = new int[6];
   public int field1626 = -1312461425;
   public int field1627 = -2139727009;
   public class692 field1628;
   public int field1629 = -230300471;
   public int field1630 = 55499771;
   public int field1631 = 312753929;
   int[] field1632 = new int[6];
   public String field1633;
   public class221 field1634 = new class221(32);
   int field1635;
   public int field1636;
   public class401 field1637;
   int field1638;
   int field1639;
   int field1640;

   final void method2195(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   void method1237(int var1) {
      try {
         this.field1635 = (32 + (int)(Math.random() * 4.0D)) * -1382184985;
         this.field1638 = (3 + (int)(Math.random() * 2.0D)) * -1827850421;
         this.field1639 = (16 + (int)(Math.random() * 3.0D)) * -1891288283;
         if (class615.field8903.field9123.method5845(2100839354) == 1) {
            this.field1640 = (int)(Math.random() * 6.0D) * 818502475;
         } else {
            this.field1640 = (int)(Math.random() * 12.0D) * 818502475;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.gf(" + ')');
      }
   }

   void method2180(class848 var1) {
      if (this.field1637 != null && (this.field4092 || this.method1238(var1, 0, 498700808))) {
         class135 var2 = var1.method5048();
         var2.method1024(this.method1521());
         var2.method1018(0.0F, -5.0F, 0.0F);
         this.method2573(var1, this.field4046, var2, this.field4092, 1604637699);

         for(int var3 = 0; var3 < this.field4046.length; ++var3) {
            this.field4046[var3] = null;
         }
      }

   }

   public class719 method2165(class848 var1, byte var2) {
      return null;
   }

   class192 method2201(class848 var1, int var2) {
      try {
         if (this.field1637 != null && this.method1238(var1, 526336, -1241441124)) {
            class135 var3 = this.method1521();
            class446 var4 = this.method1511();
            class135 var5 = var1.method5048();
            int var6 = this.field4048.method5553((byte)0);
            class190 var7 = this.field3638.field3861[this.field3639][(int)var4.field7637.field5296 >> 9][(int)var4.field7637.field5299 >> 9];
            if (var7 != null && var7.field7011 != null) {
               int var8 = this.field4086 * -661498661 - var7.field7011.field9059;
               this.field4086 = (int)((float)(-661498661 * this.field4086) - (float)var8 / 10.0F) * 1394444115;
            } else {
               this.field4086 = (int)((float)(-661498661 * this.field4086) - (float)(this.field4086 * -661498661) / 10.0F) * 1394444115;
            }

            var5.method1024(var3);
            var5.method1018(0.0F, (float)(-20 - this.field4086 * -661498661), 0.0F);
            class507 var15 = this.method2554(1744135386);
            class401 var9 = this.field1637.field9924 != null ? this.field1637.method6110(class827.field9037, 1631739764) : this.field1637;
            this.field4093 = false;
            class192 var10 = null;
            if (class615.field8903.field9127.method4421(-1104068428) == 1 && var9.field9901 && var15.field4014) {
               class765 var11 = this.field4042.method2775((byte)-29) && this.field4042.method2782(-65534) ? this.field4042 : null;
               class765 var12 = !this.field4041.method2775((byte)-63) || this.field4058 && var11 != null ? null : this.field4041;
               class879 var13 = class623.method5320(var1, var6, this.field4061 * -155466425, -197572281 * this.field4037, -104151209 * this.field4038, -2095128707 * this.field1637.field9923, this.field4046[0], this.field1637.field9927 & '\uffff', this.field1637.field9889 & '\uffff', this.field1637.field9904 & 255, this.field1637.field9888 & 255, var12 != null ? var12 : var11, 1812843484);
               if (var13 != null) {
                  if (this.field3642 == null || this.field3642.length < this.field4046.length + 1) {
                     this.method2169(this.field4046.length + 1, 1538315389);
                  }

                  var10 = class221.method4033(this.method1243(1869849139), 1879615126);
                  this.field4093 = true;
                  var1.method4869(false);
                  var13.method5965(var5, this.field3642[this.field4046.length], 0);
                  var1.method4869(true);
               }
            }

            if (this.field3642 == null || this.field3642.length < this.field4046.length) {
               this.method2169(this.field4046.length, -241324715);
            }

            if (var10 == null) {
               var10 = class221.method4033(this.method1243(1869849139), 1797748717);
            }

            this.method2573(var1, this.field4046, var5, false, 879327846);

            int var16;
            for(var16 = 0; var16 < this.field4046.length; ++var16) {
               if (this.field4046[var16] != null) {
                  if (this.field1637.field9929) {
                     this.field4046[var16].method5987(this.field1635 * 1611045847, 1427249763 * this.field1638, this.field1639 * 376465581, this.field1640 * 332650083);
                  }

                  this.field4046[var16].method5965(var5, this.field3642[var16], 0);
               }
            }

            if (this.field4031 != null) {
               class874 var17 = this.field4031.method1729();
               var1.method4866(var17);
            }

            for(var16 = 0; var16 < this.field4046.length; ++var16) {
               if (this.field4046[var16] != null) {
                  this.field4093 |= this.field4046[var16].method5989();
               }

               this.field4046[var16] = null;
            }

            this.field4030 = Client.field2758 * -815465993;
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
         class765 var6 = this.field4042.method2775((byte)-97) && !this.field4042.method2782(-65534) ? this.field4042 : null;
         class765 var7 = !this.field4041.method2775((byte)-121) || this.field4058 && var6 != null ? null : this.field4041;
         int var8 = 250567115 * var5.field3993;
         int var9 = 1110265995 * var5.field3994;
         if (var8 != 0 || var9 != 0 || var5.field4006 * 1185872679 != 0 || -330229359 * var5.field4009 != 0) {
            var2 |= 7;
         }

         boolean var10 = this.field4094 != 0 && 443738891 * Client.field2866 >= this.field4069 * 1920148979 && Client.field2866 * 443738891 < this.field4070 * 1953154657;
         if (var10) {
            var2 |= 524288;
         }

         int var11 = this.field4048.method5553((byte)0);
         class879 var12 = this.field4046[0] = this.field1637.method6106(var1, var2, class283.field10614, class827.field9037, var6, var7, this.field4076, this.field4049, var11, this.field1628, this.method2560(-1491129226), false, -679459424);
         if (var12 == null) {
            return false;
         } else {
            this.field4053 = var12.method5976() * -49760597;
            var12.method5973();
            this.method2551(var12, 839093609);
            if (var8 == 0 && var9 == 0) {
               this.method2553(var11, this.method2550() << 9, this.method2550() << 9, 0, 0, 1757570363);
            } else {
               this.method2553(var11, var8, var9, -947990311 * var5.field3992, 1869548445 * var5.field3998, 1232740545);
               if (this.field4061 * -155466425 != 0) {
                  this.field4046[0].method5952(this.field4061 * -155466425);
               }

               if (this.field4037 * -197572281 != 0) {
                  this.field4046[0].method6041(-197572281 * this.field4037);
               }

               if (this.field4038 * -104151209 != 0) {
                  this.field4046[0].method5953(0, this.field4038 * -104151209, 0);
               }
            }

            if (var10) {
               var12.method5987(this.field4081, this.field4072, this.field4073, this.field4094 & 255);
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
         if (this.field1637 != null && (this.field4092 || this.method1238(var1, 0, -1205291751))) {
            class135 var3 = var1.method5048();
            var3.method1024(this.method1521());
            var3.method1018(0.0F, -5.0F, 0.0F);
            this.method2573(var1, this.field4046, var3, this.field4092, 1317836884);

            for(int var4 = 0; var4 < this.field4046.length; ++var4) {
               this.field4046[var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "ake.bb(" + ')');
      }
   }

   public final void method1239(class77 var1, int var2, short var3) {
      try {
         int var4 = this.field4085[0];
         int var5 = this.field4055[0];
         switch(var1.field1510 * 495490839) {
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

         if (this.field4042.method2775((byte)-128) && this.field4042.method2776(1057375366).field6673 * -882531177 == 1) {
            this.field4057 = null;
            this.field4042.method2777(-1, -1581174742);
         }

         int var6;
         for(var6 = 0; var6 < this.field4040.length; ++var6) {
            if (this.field4040[var6].field10341 * -967533709 != -1) {
               class745 var7 = class635.field9823.method1053(-967533709 * this.field4040[var6].field10341, -1708083255);
               if (var7.field4117 && var7.field4107 * 1505778629 != -1 && class936.field10313.method2256(var7.field4107 * 1505778629, (byte)-23).field6673 * -882531177 == 1) {
                  this.field4040[var6].field10340.method2777(-1, -1871121711);
                  this.field4040[var6].field10341 = -1313669563;
               }
            }
         }

         if (this.field4084 * 2050671733 < this.field4085.length - 1) {
            this.field4084 += -1013322787;
         }

         for(var6 = 2050671733 * this.field4084; var6 > 0; --var6) {
            this.field4085[var6] = this.field4085[var6 - 1];
            this.field4055[var6] = this.field4055[var6 - 1];
            this.field4074[var6] = this.field4074[var6 - 1];
         }

         this.field4085[0] = var4;
         this.field4055[0] = var5;
         this.field4074[0] = (byte)var2;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "ake.gk(" + ')');
      }
   }

   public void method1240(int var1, int var2, int var3, boolean var4, int var5, byte var6) {
      try {
         this.field3639 = this.field3640 = (byte)var1;
         if (Client.field2697.method5296(1132456995).method3386(var2, var3, 1587070733)) {
            ++this.field3640;
         }

         if (this.field4042.method2775((byte)-33) && this.field4042.method2776(1592092831).field6673 * -882531177 == 1) {
            this.field4057 = null;
            this.field4042.method2777(-1, -1899534119);
         }

         int var7;
         for(var7 = 0; var7 < this.field4040.length; ++var7) {
            if (-1 != this.field4040[var7].field10341 * -967533709) {
               class745 var8 = class635.field9823.method1053(-967533709 * this.field4040[var7].field10341, -1738473272);
               if (var8.field4117 && -1 != 1505778629 * var8.field4107 && class936.field10313.method2256(var8.field4107 * 1505778629, (byte)83).field6673 * -882531177 == 1) {
                  this.field4040[var7].field10340.method2777(-1, -1950379754);
                  this.field4040[var7].field10341 = -1313669563;
               }
            }
         }

         if (!var4) {
            var7 = var2 - this.field4085[0];
            int var12 = var3 - this.field4055[0];
            if (var7 >= -8 && var7 <= 8 && var12 >= -8 && var12 <= 8) {
               if (2050671733 * this.field4084 < this.field4085.length - 1) {
                  this.field4084 += -1013322787;
               }

               for(int var9 = this.field4084 * 2050671733; var9 > 0; --var9) {
                  this.field4085[var9] = this.field4085[var9 - 1];
                  this.field4055[var9] = this.field4055[var9 - 1];
                  this.field4074[var9] = this.field4074[var9 - 1];
               }

               this.field4085[0] = var2;
               this.field4055[0] = var3;
               this.field4074[0] = class647.field9228.field9230;
               return;
            }
         }

         this.field4084 = 0;
         this.field4089 = 0;
         this.field4088 = 0;
         this.field4085[0] = var2;
         this.field4055[0] = var3;
         class32 var11 = class32.method3290(this.method1511().field7637);
         var11.field5296 = (float)((var5 << 8) + (this.field4085[0] << 9));
         var11.field5299 = (float)((this.field4055[0] << 9) + (var5 << 8));
         this.method1514(var11);
         var11.method3291();
         if (this.field4031 != null) {
            this.field4031.method1720();
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
         if (-1 != -1317338937 * this.field1631) {
            return this.field1631 * -1317338937;
         } else {
            if (this.field1637.field9924 != null) {
               class401 var2 = this.field1637.method6110(class827.field9037, 1794284929);
               if (var2 != null && 525312939 * var2.field9868 != -1) {
                  return 525312939 * var2.field9868;
               }
            }

            return this.field1637.field9868 * 525312939;
         }
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.t(" + ')');
      }
   }

   public int method2555(byte var1) {
      try {
         if (this.field1637.field9924 != null) {
            class401 var2 = this.field1637.method6110(class827.field9037, 1605369279);
            if (var2 != null && -1 != 363729791 * var2.field9914) {
               return 363729791 * var2.field9914;
            }
         }

         return 363729791 * this.field1637.field9914;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.h(" + ')');
      }
   }

   int method1242() {
      return this.field1637 == null ? 0 : this.field1637.field9928 * -226722581;
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
         return this.field1637 == null ? 0 : this.field1637.field9928 * -226722581;
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
            for(var7 = 0; var7 < this.field4046.length; ++var7) {
               if (this.field4046[var7] != null) {
                  boolean var8;
                  label66: {
                     if (-226722581 * this.field1637.field9928 <= 0) {
                        label65: {
                           if (286060383 * this.field1637.field9925 == -1) {
                              if (1 == this.field1637.field9923 * -2095128707) {
                                 if (var4 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label65;
                              }
                           } else if (1 == this.field1637.field9925 * 286060383) {
                              break label65;
                           }

                           var8 = false;
                           break label66;
                        }
                     }

                     var8 = true;
                  }

                  boolean var10 = this.field4046[var7].method6097(var2, var3, var5, var8, this.field1637.field9928 * -226722581);
                  if (var10) {
                     var6 = true;
                     break;
                  }
               }
            }

            for(var7 = 0; var7 < this.field4046.length; ++var7) {
               this.field4046[var7] = null;
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
         return class6.field4931.field9532;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.by(" + ')');
      }
   }

   public class625 method2565(int var1) {
      try {
         return this.field4082 != null && this.field4082.field9748 == null ? null : this.field4082;
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.bl(" + ')');
      }
   }

   public void method1245(String var1, int var2, int var3, int var4) {
      try {
         int var5 = class854.method5151((byte)6) * class6.field4931.field9527 * -478874963;
         this.method2558(var1, var2, var3, var5, (byte)-1);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "ake.gd(" + ')');
      }
   }

   public class719 method2174(class848 var1) {
      return null;
   }

   public class719 method2175(class848 var1) {
      return null;
   }

   public int method2563() {
      if (this.field1637.field9924 != null) {
         class401 var1 = this.field1637.method6110(class827.field9037, 1815832117);
         if (var1 != null && var1.field9879 * -1575020259 != -1) {
            return var1.field9879 * -1575020259;
         }
      }

      return -1575020259 * this.field1637.field9879 != -1 ? -1575020259 * this.field1637.field9879 : super.method2170((byte)-104);
   }

   public int method2564() {
      if (this.field1637.field9924 != null) {
         class401 var1 = this.field1637.method6110(class827.field9037, 1928445532);
         if (var1 != null && var1.field9879 * -1575020259 != -1) {
            return var1.field9879 * -1575020259;
         }
      }

      return -1575020259 * this.field1637.field9879 != -1 ? -1575020259 * this.field1637.field9879 : super.method2170((byte)-11);
   }

   class192 method2177(class848 var1) {
      if (this.field1637 != null && this.method1238(var1, 526336, -1153791486)) {
         class135 var2 = this.method1521();
         class446 var3 = this.method1511();
         class135 var4 = var1.method5048();
         int var5 = this.field4048.method5553((byte)0);
         class190 var6 = this.field3638.field3861[this.field3639][(int)var3.field7637.field5296 >> 9][(int)var3.field7637.field5299 >> 9];
         if (var6 != null && var6.field7011 != null) {
            int var7 = this.field4086 * -661498661 - var6.field7011.field9059;
            this.field4086 = (int)((float)(-661498661 * this.field4086) - (float)var7 / 10.0F) * 1394444115;
         } else {
            this.field4086 = (int)((float)(-661498661 * this.field4086) - (float)(this.field4086 * -661498661) / 10.0F) * 1394444115;
         }

         var4.method1024(var2);
         var4.method1018(0.0F, (float)(-20 - this.field4086 * -661498661), 0.0F);
         class507 var13 = this.method2554(1676580874);
         class401 var8 = this.field1637.field9924 != null ? this.field1637.method6110(class827.field9037, 1779938932) : this.field1637;
         this.field4093 = false;
         class192 var9 = null;
         if (class615.field8903.field9127.method4421(-1718454976) == 1 && var8.field9901 && var13.field4014) {
            class765 var10 = this.field4042.method2775((byte)-38) && this.field4042.method2782(-65534) ? this.field4042 : null;
            class765 var11 = !this.field4041.method2775((byte)-86) || this.field4058 && var10 != null ? null : this.field4041;
            class879 var12 = class623.method5320(var1, var5, this.field4061 * -155466425, -197572281 * this.field4037, -104151209 * this.field4038, -2095128707 * this.field1637.field9923, this.field4046[0], this.field1637.field9927 & '\uffff', this.field1637.field9889 & '\uffff', this.field1637.field9904 & 255, this.field1637.field9888 & 255, var11 != null ? var11 : var10, 1812843484);
            if (var12 != null) {
               if (this.field3642 == null || this.field3642.length < this.field4046.length + 1) {
                  this.method2169(this.field4046.length + 1, -565315916);
               }

               var9 = class221.method4033(this.method1243(1869849139), 1346320693);
               this.field4093 = true;
               var1.method4869(false);
               var12.method5965(var4, this.field3642[this.field4046.length], 0);
               var1.method4869(true);
            }
         }

         if (this.field3642 == null || this.field3642.length < this.field4046.length) {
            this.method2169(this.field4046.length, -1743332566);
         }

         if (var9 == null) {
            var9 = class221.method4033(this.method1243(1869849139), 1675644085);
         }

         this.method2573(var1, this.field4046, var4, false, 969483486);

         int var14;
         for(var14 = 0; var14 < this.field4046.length; ++var14) {
            if (this.field4046[var14] != null) {
               if (this.field1637.field9929) {
                  this.field4046[var14].method5987(this.field1635 * 1611045847, 1427249763 * this.field1638, this.field1639 * 376465581, this.field1640 * 332650083);
               }

               this.field4046[var14].method5965(var4, this.field3642[var14], 0);
            }
         }

         if (this.field4031 != null) {
            class874 var15 = this.field4031.method1729();
            var1.method4866(var15);
         }

         for(var14 = 0; var14 < this.field4046.length; ++var14) {
            if (this.field4046[var14] != null) {
               this.field4093 |= this.field4046[var14].method5989();
            }

            this.field4046[var14] = null;
         }

         this.field4030 = Client.field2758 * -815465993;
         return var9;
      } else {
         return null;
      }
   }

   void method2178(class848 var1) {
      if (this.field1637 != null && (this.field4092 || this.method1238(var1, 0, -1590633829))) {
         class135 var2 = var1.method5048();
         var2.method1024(this.method1521());
         var2.method1018(0.0F, -5.0F, 0.0F);
         this.method2573(var1, this.field4046, var2, this.field4092, -935143388);

         for(int var3 = 0; var3 < this.field4046.length; ++var3) {
            this.field4046[var3] = null;
         }
      }

   }

   final boolean method2193() {
      return false;
   }

   boolean method2179(class848 var1, int var2, int var3) {
      if (this.field1637 != null && this.method1238(var1, 131072, 1720809223)) {
         class135 var4 = this.method1521();
         boolean var5 = false;

         int var6;
         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            if (this.field4046[var6] != null) {
               boolean var7;
               label57: {
                  if (-226722581 * this.field1637.field9928 <= 0) {
                     label56: {
                        if (286060383 * this.field1637.field9925 == -1) {
                           if (1 == this.field1637.field9923 * -2095128707) {
                              break label56;
                           }
                        } else if (1 == this.field1637.field9925 * 286060383) {
                           break label56;
                        }

                        var7 = false;
                        break label57;
                     }
                  }

                  var7 = true;
               }

               boolean var9 = this.field4046[var6].method6097(var2, var3, var4, var7, this.field1637.field9928 * -226722581);
               if (var9) {
                  var5 = true;
                  break;
               }
            }
         }

         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            this.field4046[var6] = null;
         }

         return var5;
      } else {
         return false;
      }
   }

   boolean method2192(class848 var1, int var2, int var3) {
      if (this.field1637 != null && this.method1238(var1, 131072, -1030471484)) {
         class135 var4 = this.method1521();
         boolean var5 = false;

         int var6;
         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            if (this.field4046[var6] != null) {
               boolean var7;
               label57: {
                  if (-226722581 * this.field1637.field9928 <= 0) {
                     label56: {
                        if (286060383 * this.field1637.field9925 == -1) {
                           if (1 == this.field1637.field9923 * -2095128707) {
                              break label56;
                           }
                        } else if (1 == this.field1637.field9925 * 286060383) {
                           break label56;
                        }

                        var7 = false;
                        break label57;
                     }
                  }

                  var7 = true;
               }

               boolean var9 = this.field4046[var6].method6097(var2, var3, var4, var7, this.field1637.field9928 * -226722581);
               if (var9) {
                  var5 = true;
                  break;
               }
            }
         }

         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            this.field4046[var6] = null;
         }

         return var5;
      } else {
         return false;
      }
   }

   public int method1246(int var1, int var2) {
      try {
         return this.field1625[var1];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ake.gh(" + ')');
      }
   }

   int method2575() {
      if (-1 != -1317338937 * this.field1631) {
         return this.field1631 * -1317338937;
      } else {
         if (this.field1637.field9924 != null) {
            class401 var1 = this.field1637.method6110(class827.field9037, 1618298715);
            if (var1 != null && 525312939 * var1.field9868 != -1) {
               return 525312939 * var1.field9868;
            }
         }

         return this.field1637.field9868 * 525312939;
      }
   }

   final void method2184() {
      throw new IllegalStateException();
   }

   final void method2185() {
      throw new IllegalStateException();
   }

   int method2574() {
      if (-1 != -1317338937 * this.field1631) {
         return this.field1631 * -1317338937;
      } else {
         if (this.field1637.field9924 != null) {
            class401 var1 = this.field1637.method6110(class827.field9037, 1807692721);
            if (var1 != null && 525312939 * var1.field9868 != -1) {
               return 525312939 * var1.field9868;
            }
         }

         return this.field1637.field9868 * 525312939;
      }
   }

   final boolean method2173(int var1) {
      return false;
   }

   int method2566() {
      if (-1 != -1317338937 * this.field1631) {
         return this.field1631 * -1317338937;
      } else {
         if (this.field1637.field9924 != null) {
            class401 var1 = this.field1637.method6110(class827.field9037, 1685758496);
            if (var1 != null && 525312939 * var1.field9868 != -1) {
               return 525312939 * var1.field9868;
            }
         }

         return this.field1637.field9868 * 525312939;
      }
   }

   int method2576() {
      if (-1 != -1317338937 * this.field1631) {
         return this.field1631 * -1317338937;
      } else {
         if (this.field1637.field9924 != null) {
            class401 var1 = this.field1637.method6110(class827.field9037, 1859138308);
            if (var1 != null && 525312939 * var1.field9868 != -1) {
               return 525312939 * var1.field9868;
            }
         }

         return this.field1637.field9868 * 525312939;
      }
   }

   public int method2577() {
      if (this.field1637.field9924 != null) {
         class401 var1 = this.field1637.method6110(class827.field9037, 1923690826);
         if (var1 != null && -1 != 363729791 * var1.field9914) {
            return 363729791 * var1.field9914;
         }
      }

      return 363729791 * this.field1637.field9914;
   }

   public class625 method2571() {
      return this.field4082 != null && this.field4082.field9748 == null ? null : this.field4082;
   }

   final boolean method2191() {
      return false;
   }

   final boolean method2207() {
      return false;
   }

   public class60(class545 var1, int var2) {
      super(var1, var2);
      this.method1237(684373346);
   }

   final boolean method2194() {
      return false;
   }

   public int method2170(byte var1) {
      try {
         if (this.field1637.field9924 != null) {
            class401 var2 = this.field1637.method6110(class827.field9037, 1652651645);
            if (var2 != null && var2.field9879 * -1575020259 != -1) {
               return var2.field9879 * -1575020259;
            }
         }

         return -1575020259 * this.field1637.field9879 != -1 ? -1575020259 * this.field1637.field9879 : super.method2170((byte)61);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "ake.bx(" + ')');
      }
   }

   int method1247() {
      return this.field1637 == null ? 0 : this.field1637.field9928 * -226722581;
   }

   public void method1248(class401 var1, int var2) {
      try {
         if (var1 != this.field1637 && class602.field8645 && class779.method2322(this.field4028 * 1888274983, 351851633)) {
            class979.method1835(2025307040);
         }

         this.field1637 = var1;
         if (this.field1637 != null) {
            this.field1633 = this.field1637.field9863;
            this.field1636 = this.field1637.field9885 * 1520279523;
         }

         if (this.field4031 != null) {
            this.field4031.method1720();
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ake.gb(" + ')');
      }
   }

   public boolean method2580() {
      return class6.field4931.field9532;
   }

   final void method2162(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "ake.bk(" + ')');
      }
   }

   int method1249() {
      return this.field1637 == null ? 0 : this.field1637.field9928 * -226722581;
   }

   public class60(class545 var1) {
      super(var1);
      this.method1237(684373346);
   }

   public boolean method2568() {
      return class6.field4931.field9532;
   }

   final void method2182(class848 var1, class963 var2, int var3, int var4, int var5, boolean var6) {
      throw new IllegalStateException();
   }

   public int method1250(int var1, byte var2) {
      try {
         return this.field1632[var1];
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "ake.ga(" + ')');
      }
   }

   boolean method2159(class848 var1, int var2, int var3) {
      if (this.field1637 != null && this.method1238(var1, 131072, 76578294)) {
         class135 var4 = this.method1521();
         boolean var5 = false;

         int var6;
         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            if (this.field4046[var6] != null) {
               boolean var7;
               label57: {
                  if (-226722581 * this.field1637.field9928 <= 0) {
                     label56: {
                        if (286060383 * this.field1637.field9925 == -1) {
                           if (1 == this.field1637.field9923 * -2095128707) {
                              break label56;
                           }
                        } else if (1 == this.field1637.field9925 * 286060383) {
                           break label56;
                        }

                        var7 = false;
                        break label57;
                     }
                  }

                  var7 = true;
               }

               boolean var9 = this.field4046[var6].method6097(var2, var3, var4, var7, this.field1637.field9928 * -226722581);
               if (var9) {
                  var5 = true;
                  break;
               }
            }
         }

         for(var6 = 0; var6 < this.field4046.length; ++var6) {
            this.field4046[var6] = null;
         }

         return var5;
      } else {
         return false;
      }
   }
}
