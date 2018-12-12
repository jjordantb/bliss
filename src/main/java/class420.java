public class class420 {
   public int field9692 = -1;
   boolean field9693;
   boolean field9694;
   int[] field9695;
   int field9696 = 0;
   public String field9697 = null;
   int field9698 = 0;
   public boolean field9699;
   public byte[] field9700;
   public byte field9701;
   public byte field9702;
   public byte field9703;
   public int field9704;
   long[] field9705;
   long field9706;
   class6 field9707;
   int[] field9708;
   public int[] field9709;
   long[] field9710;
   public String[] field9711;
   public int field9712;
   public int field9713 = -1;
   public String[] field9714;
   public byte field9715;
   static byte field9716 = 126;
   static byte field9717 = 127;
   static int field9718 = 5;
   static byte field9719 = 125;
   static byte field9720 = 0;
   public static byte field9721 = -1;
   static int field9722;
   public static int field9723;

   void method5774(int var1, byte var2) {
      try {
         if (this.field9693) {
            if (this.field9705 != null) {
               class901.method6352(this.field9705, 0, this.field9705 = new long[var1], 0, this.field9704);
            } else {
               this.field9705 = new long[var1];
            }
         }

         if (this.field9694) {
            if (this.field9714 != null) {
               class901.method6351(this.field9714, 0, this.field9714 = new String[var1], 0, this.field9704);
            } else {
               this.field9714 = new String[var1];
            }
         }

         if (this.field9700 != null) {
            class901.method6350(this.field9700, 0, this.field9700 = new byte[var1], 0, this.field9704);
         } else {
            this.field9700 = new byte[var1];
         }

         if (this.field9708 != null) {
            class901.method6355(this.field9708, 0, this.field9708 = new int[var1], 0, this.field9704);
         } else {
            this.field9708 = new int[var1];
         }

         if (this.field9709 != null) {
            class901.method6355(this.field9709, 0, this.field9709 = new int[var1], 0, this.field9704);
         } else {
            this.field9709 = new int[var1];
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.a(" + ')');
      }
   }

   void method5775(int var1, int var2) {
      try {
         if (this.field9693) {
            if (this.field9710 != null) {
               class901.method6352(this.field9710, 0, this.field9710 = new long[var1], 0, this.field9712);
            } else {
               this.field9710 = new long[var1];
            }
         }

         if (this.field9694) {
            if (this.field9711 != null) {
               class901.method6351(this.field9711, 0, this.field9711 = new String[var1], 0, this.field9712);
            } else {
               this.field9711 = new String[var1];
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.f(" + ')');
      }
   }

   public int method5776(String var1, int var2) {
      try {
         if (var1 != null && var1.length() != 0) {
            for(int var3 = 0; var3 < this.field9704; ++var3) {
               if (this.field9714[var3].equals(var1)) {
                  return var3;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.b(" + ')');
      }
   }

   public int method5777(int var1, int var2, int var3, int var4) {
      try {
         int var5 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
         return (this.field9708[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "gp.p(" + ')');
      }
   }

   public Integer method5778(int var1, byte var2) {
      try {
         if (this.field9707 == null) {
            return null;
         } else {
            class568 var3 = this.field9707.method2942((long)var1);
            return var3 != null && var3 instanceof class722 ? new Integer(((class722)var3).field3631) : null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.i(" + ')');
      }
   }

   public Integer method5779(int var1, int var2, int var3, int var4) {
      try {
         if (this.field9707 == null) {
            return null;
         } else {
            class568 var5 = this.field9707.method2942((long)var1);
            if (var5 != null && var5 instanceof class722) {
               int var6 = var3 == 31 ? -1 : (1 << 1 + var3) - 1;
               return new Integer((((class722)var5).field3631 & var6) >>> var2);
            } else {
               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "gp.k(" + ')');
      }
   }

   public String method5780(int var1, int var2) {
      try {
         if (this.field9707 == null) {
            return null;
         } else {
            class568 var3 = this.field9707.method2942((long)var1);
            return var3 != null && var3 instanceof class437 ? (String)((class437)var3).field7515 : null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.u(" + ')');
      }
   }

   public int[] method5781(byte var1) {
      try {
         if (this.field9695 == null) {
            String[] var2 = new String[this.field9704];
            this.field9695 = new int[this.field9704];

            for(int var3 = 0; var3 < this.field9704; this.field9695[var3] = var3++) {
               var2[var3] = this.field9714[var3];
            }

            class983.method1893(var2, this.field9695, -43867253);
         }

         return this.field9695;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.x(" + ')');
      }
   }

   void method5782(long var1, String var3, int var4, int var5) {
      try {
         if (var3 != null && var3.length() == 0) {
            var3 = null;
         }

         if (this.field9693 != var1 > 0L) {
            throw new RuntimeException("");
         } else if (var3 != null != this.field9694) {
            throw new RuntimeException("");
         } else {
            if (var1 > 0L && (this.field9705 == null || this.field9704 >= this.field9705.length) || var3 != null && (this.field9714 == null || this.field9704 >= this.field9714.length)) {
               this.method5774(5 + this.field9704, (byte)1);
            }

            if (this.field9705 != null) {
               this.field9705[this.field9704] = var1;
            }

            if (this.field9714 != null) {
               this.field9714[this.field9704] = var3;
            }

            if (-1 == this.field9692) {
               this.field9692 = this.field9704;
               this.field9700[this.field9704] = 126;
            } else {
               this.field9700[this.field9704] = 0;
            }

            this.field9708[this.field9704] = 0;
            this.field9709[this.field9704] = var4;
            ++this.field9704;
            this.field9695 = null;
         }
      } catch (RuntimeException var7) {
         throw class158.method3445(var7, "gp.r(" + ')');
      }
   }

   void method5783(int var1) {
      try {
         if (this.field9704 == 0) {
            this.field9692 = -1;
            this.field9713 = -1;
         } else {
            this.field9692 = -1;
            this.field9713 = -1;
            int var2 = 0;
            byte var3 = this.field9700[0];

            for(int var4 = 1; var4 < this.field9704; ++var4) {
               if (this.field9700[var4] > var3) {
                  if (var3 == 125) {
                     this.field9713 = var2;
                  }

                  var2 = var4;
                  var3 = this.field9700[var4];
               } else if (-1 == this.field9713 && this.field9700[var4] == 125) {
                  this.field9713 = var4;
               }
            }

            this.field9692 = var2;
            if (-1 != this.field9692) {
               this.field9700[this.field9692] = 126;
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gp.n(" + ')');
      }
   }

   void method5784(long var1, String var3, int var4) {
      try {
         if (var3 != null && var3.length() == 0) {
            var3 = null;
         }

         if (this.field9693 != var1 > 0L) {
            throw new RuntimeException("");
         } else if (var3 != null != this.field9694) {
            throw new RuntimeException("");
         } else {
            if (var1 > 0L && (this.field9710 == null || this.field9712 >= this.field9710.length) || var3 != null && (this.field9711 == null || this.field9712 >= this.field9711.length)) {
               this.method5775(5 + this.field9712, -112321245);
            }

            if (this.field9710 != null) {
               this.field9710[this.field9712] = var1;
            }

            if (this.field9711 != null) {
               this.field9711[this.field9712] = var3;
            }

            ++this.field9712;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "gp.s(" + ')');
      }
   }

   boolean method5785(int var1, String var2, byte var3) {
      try {
         if (var2 == null) {
            var2 = "";
         } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
         }

         if (this.field9707 != null) {
            class568 var4 = this.field9707.method2942((long)var1);
            if (var4 != null) {
               if (var4 instanceof class437) {
                  class437 var5 = (class437)var4;
                  if (var5.field7515 instanceof String) {
                     if (var2.equals(var5.field7515)) {
                        return false;
                     }

                     var5.method545(-1460969981);
                     var5.method545(-1460969981);
                     this.field9707.method2947(new class437(var2), var5.field641);
                     return true;
                  }
               }

               var4.method545(-1460969981);
            }
         } else {
            this.field9707 = new class6(4);
         }

         this.field9707.method2947(new class437(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "gp.e(" + ')');
      }
   }

   boolean method5786(int var1, int var2, byte var3) {
      try {
         if (this.field9707 != null) {
            class568 var4 = this.field9707.method2942((long)var1);
            if (var4 != null) {
               if (var4 instanceof class722) {
                  class722 var5 = (class722)var4;
                  if (var2 == var5.field3631) {
                     return false;
                  }

                  var5.field3631 = var2;
                  return true;
               }

               var4.method545(-1460969981);
            }
         } else {
            this.field9707 = new class6(4);
         }

         this.field9707.method2947(new class722(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "gp.h(" + ')');
      }
   }

   boolean method5787(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (this.field9707 != null) {
            class568 var9 = this.field9707.method2942((long)var1);
            if (var9 != null) {
               if (var9 instanceof class722) {
                  class722 var10 = (class722)var9;
                  if (var2 == (var10.field3631 & var8)) {
                     return false;
                  }

                  var10.field3631 &= ~var8;
                  var10.field3631 |= var2;
                  return true;
               }

               var9.method545(-1460969981);
            }
         } else {
            this.field9707 = new class6(4);
         }

         this.field9707.method2947(new class722(var2), (long)var1);
         return true;
      } catch (RuntimeException var13) {
         throw class158.method3445(var13, "gp.v(" + ')');
      }
   }

   boolean method5788(int var1, long var2) {
      try {
         if (this.field9707 != null) {
            class568 var4 = this.field9707.method2942((long)var1);
            if (var4 != null) {
               if (var4 instanceof class852) {
                  class852 var5 = (class852)var4;
                  if (var5.field8727 == var2) {
                     return false;
                  }

                  var5.field8727 = var2;
                  return true;
               }

               var4.method545(-1460969981);
            }
         } else {
            this.field9707 = new class6(4);
         }

         this.field9707.method2947(new class852(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "gp.g(" + ')');
      }
   }

   void method5789(InputStream var1, byte var2) {
      try {
         int var3 = var1.method6371();
         if (var3 >= 1 && var3 <= 5) {
            int var4 = var1.method6371();
            if ((var4 & 1) != 0) {
               this.field9693 = true;
            }

            if ((var4 & 2) != 0) {
               this.field9694 = true;
            }

            if (!this.field9693) {
               this.field9705 = null;
               this.field9710 = null;
            }

            if (!this.field9694) {
               this.field9714 = null;
               this.field9711 = null;
            }

            this.field9696 = var1.method6420((byte)-76);
            this.field9698 = var1.method6420((byte)-65);
            if (var3 <= 3 && this.field9698 != 0) {
               this.field9698 += 16912800;
            }

            this.field9704 = var1.method6374();
            this.field9712 = var1.method6371();
            this.field9697 = var1.method6379(-1963300431);
            if (var3 >= 4) {
               var1.method6420((byte)83);
            }

            this.field9699 = var1.method6371() == 1;
            this.field9715 = var1.method6372(-12558881);
            this.field9701 = var1.method6372(-12558881);
            this.field9702 = var1.method6372(-12558881);
            this.field9703 = var1.method6372(-12558881);
            int var5;
            if (this.field9704 > 0) {
               if (this.field9693 && (this.field9705 == null || this.field9705.length < this.field9704)) {
                  this.field9705 = new long[this.field9704];
               }

               if (this.field9694 && (this.field9714 == null || this.field9714.length < this.field9704)) {
                  this.field9714 = new String[this.field9704];
               }

               if (this.field9700 == null || this.field9700.length < this.field9704) {
                  this.field9700 = new byte[this.field9704];
               }

               if (this.field9708 == null || this.field9708.length < this.field9704) {
                  this.field9708 = new int[this.field9704];
               }

               if (this.field9709 == null || this.field9709.length < this.field9704) {
                  this.field9709 = new int[this.field9704];
               }

               for(var5 = 0; var5 < this.field9704; ++var5) {
                  if (this.field9693) {
                     this.field9705[var5] = var1.method6375((short)10823);
                  }

                  if (this.field9694) {
                     this.field9714[var5] = var1.method6429(-517364695);
                  }

                  this.field9700[var5] = var1.method6372(-12558881);
                  if (var3 >= 2) {
                     this.field9708[var5] = var1.method6420((byte)-36);
                  }

                  if (var3 >= 5) {
                     this.field9709[var5] = var1.method6374();
                  } else {
                     this.field9709[var5] = 0;
                  }
               }

               this.method5783(-1189925710);
            }

            if (this.field9712 > 0) {
               if (this.field9693 && (this.field9710 == null || this.field9710.length < this.field9712)) {
                  this.field9710 = new long[this.field9712];
               }

               if (this.field9694 && (this.field9711 == null || this.field9711.length < this.field9712)) {
                  this.field9711 = new String[this.field9712];
               }

               for(var5 = 0; var5 < this.field9712; ++var5) {
                  if (this.field9693) {
                     this.field9710[var5] = var1.method6375((short)4192);
                  }

                  if (this.field9694) {
                     this.field9711[var5] = var1.method6429(-517364695);
                  }
               }
            }

            if (var3 >= 3) {
               var5 = var1.method6374();
               if (var5 > 0) {
                  this.field9707 = new class6(var5 < 16 ? class18.method3687(var5, (byte)16) : 16);

                  while(var5-- > 0) {
                     int var6 = var1.method6420((byte)-32);
                     int var7 = var6 & 1073741823;
                     int var8 = var6 >>> 30;
                     if (var8 == 0) {
                        int var9 = var1.method6420((byte)-111);
                        this.field9707.method2947(new class722(var9), (long)var7);
                     } else if (var8 == 1) {
                        long var10 = var1.method6375((short)2486);
                        this.field9707.method2947(new class852(var10), (long)var7);
                     } else if (var8 == 2) {
                        String var13 = var1.method6379(478616247);
                        this.field9707.method2947(new class437(var13), (long)var7);
                     }
                  }
               }
            }

         } else {
            throw new RuntimeException("" + var3);
         }
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "gp.c(" + ')');
      }
   }

   public class420(InputStream var1) {
      this.method5789(var1, (byte)-58);
   }

   void method5790(int var1, int var2) {
      try {
         --this.field9712;
         if (this.field9712 == 0) {
            this.field9710 = null;
            this.field9711 = null;
         } else {
            if (this.field9710 != null) {
               class901.method6352(this.field9710, var1 + 1, this.field9710, var1, this.field9712 - var1);
            }

            if (this.field9711 != null) {
               class901.method6351(this.field9711, var1 + 1, this.field9711, var1, this.field9712 - var1);
            }
         }

      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.z(" + ')');
      }
   }

   public Long method5791(int var1, int var2) {
      try {
         if (this.field9707 == null) {
            return null;
         } else {
            class568 var3 = this.field9707.method2942((long)var1);
            return var3 != null && var3 instanceof class852 ? new Long(((class852)var3).field8727) : null;
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.d(" + ')');
      }
   }

   int method5792(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var7 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.field9708[var1];
         if (var2 == (var9 & var8)) {
            return -1;
         } else {
            var9 &= ~var8;
            this.field9708[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw class158.method3445(var10, "gp.t(" + ')');
      }
   }

   void method5793(int var1, byte var2) {
      try {
         if (var1 >= 0 && var1 < this.field9704) {
            --this.field9704;
            this.field9695 = null;
            if (this.field9704 == 0) {
               this.field9705 = null;
               this.field9714 = null;
               this.field9700 = null;
               this.field9708 = null;
               this.field9709 = null;
               this.field9692 = -1;
               this.field9713 = -1;
            } else {
               class901.method6350(this.field9700, var1 + 1, this.field9700, var1, this.field9704 - var1);
               class901.method6355(this.field9708, var1 + 1, this.field9708, var1, this.field9704 - var1);
               class901.method6355(this.field9709, 1 + var1, this.field9709, var1, this.field9704 - var1);
               if (this.field9705 != null) {
                  class901.method6352(this.field9705, 1 + var1, this.field9705, var1, this.field9704 - var1);
               }

               if (this.field9714 != null) {
                  class901.method6351(this.field9714, 1 + var1, this.field9714, var1, this.field9704 - var1);
               }

               if (var1 == this.field9692 || this.field9713 == var1) {
                  this.method5783(-1189925710);
               }
            }

         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "gp.q(" + ')');
      }
   }

   int method5794(int var1, byte var2, byte var3) {
      try {
         if (126 != var2 && var2 != 127) {
            if (var1 == this.field9692 && (-1 == this.field9713 || this.field9700[this.field9713] < 125)) {
               return -1;
            } else if (var2 == this.field9700[var1]) {
               return -1;
            } else {
               this.field9700[var1] = var2;
               this.method5783(-1189925710);
               return var1;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gp.y(" + ')');
      }
   }

   static final void method5795(class744 var0, int var1) {
      try {
         class730.field2661 = true;
         class806.method2842((byte)12);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "gp.ahu(" + ')');
      }
   }

   static final void method5796(int var0) {
      try {
         int var1 = class498.field8102;
         int[] var2 = class498.field8108;

         for(int var3 = 0; var3 < var1; ++var3) {
            Player var4 = class730.loaded[var2[var3]];
            if (var4 != null) {
               class232.method4664(var4, false, -1941477240);
            }
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "gp.hv(" + ')');
      }
   }

   static final void method5797(class744 var0, int var1) {
      try {
         int var2 = var0.field3161[--var0.field3156];
         class770.method2305(class507.field4015 == var0.field3154, var2, (byte)1);
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "gp.yn(" + ')');
      }
   }
}
