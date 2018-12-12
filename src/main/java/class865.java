public class class865 {
   public int field8983;
   class677 field8984;
   public String field8985;
   int[] field8986;
   int[][] field8987;
   public int field8988 = 0;
   public int field8989 = 0;
   int[] field8990;
   public int field8991;
   int[] field8992;
   public int[] field8993;
   public int[][] field8994;
   class6 field8995;
   public int[] field8996;
   int[] field8997;
   int[][] field8998;
   public String[] field8999;
   public int[] field9000;
   int[] field9001;
   public String field9002;
   public String[] field9003;
   public boolean field9004 = false;
   public int field9005 = -301919677;

   void method5321(class907 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method6371();
            if (var3 == 0) {
               return;
            }

            this.method5322(var1, var3, -1109459912);
         }
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pi.a(" + ')');
      }
   }

   void method5322(class907 var1, int var2, int var3) {
      try {
         if (1 == var2) {
            this.field9002 = var1.method6413(681479919);
         } else if (2 == var2) {
            this.field8985 = var1.method6413(681479919);
         } else {
            int var4;
            int var5;
            if (var2 == 3) {
               var4 = var1.method6371();
               this.field8987 = new int[var4][3];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8987[var5][0] = var1.method6374();
                  this.field8987[var5][1] = var1.method6420((byte)34);
                  this.field8987[var5][2] = var1.method6420((byte)72);
               }
            } else if (4 == var2) {
               var4 = var1.method6371();
               this.field8998 = new int[var4][3];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8998[var5][0] = var1.method6374();
                  this.field8998[var5][1] = var1.method6420((byte)-80);
                  this.field8998[var5][2] = var1.method6420((byte)-11);
               }
            } else if (var2 == 5) {
               var1.method6374();
            } else if (6 == var2) {
               this.field8988 = var1.method6371() * -1975598225;
            } else if (7 == var2) {
               this.field8989 = var1.method6371() * 203571345;
            } else if (8 == var2) {
               this.field9004 = true;
            } else if (9 == var2) {
               this.field8991 = var1.method6371() * 1044902997;
            } else if (10 == var2) {
               var4 = var1.method6371();
               this.field8992 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8992[var5] = var1.method6420((byte)87);
               }
            } else if (12 == var2) {
               var1.method6420((byte)85);
            } else if (var2 == 13) {
               var4 = var1.method6371();
               this.field8993 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8993[var5] = var1.method6374();
               }
            } else if (var2 == 14) {
               var4 = var1.method6371();
               this.field8994 = new int[var4][2];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8994[var5][0] = var1.method6371();
                  this.field8994[var5][1] = var1.method6371();
               }
            } else if (15 == var2) {
               this.field8983 = var1.method6374() * 96808193;
            } else if (var2 == 17) {
               this.field9005 = var1.method6423(1235052657) * 301919677;
            } else if (var2 == 18) {
               var4 = var1.method6371();
               this.field8996 = new int[var4];
               this.field8997 = new int[var4];
               this.field8990 = new int[var4];
               this.field8999 = new String[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field8996[var5] = var1.method6420((byte)8);
                  this.field8997[var5] = var1.method6420((byte)-38);
                  this.field8990[var5] = var1.method6420((byte)-23);
                  this.field8999[var5] = var1.method6379(-1449039258);
               }
            } else if (var2 == 19) {
               var4 = var1.method6371();
               this.field9000 = new int[var4];
               this.field9001 = new int[var4];
               this.field8986 = new int[var4];
               this.field9003 = new String[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field9000[var5] = var1.method6420((byte)111);
                  this.field9001[var5] = var1.method6420((byte)-1);
                  this.field8986[var5] = var1.method6420((byte)-36);
                  this.field9003[var5] = var1.method6379(166034178);
               }
            } else if (var2 == 249) {
               var4 = var1.method6371();
               if (this.field8995 == null) {
                  var5 = class18.method3687(var4, (byte)16);
                  this.field8995 = new class6(var5);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  boolean var6 = var1.method6371() == 1;
                  int var7 = var1.method6390((byte)-5);
                  Object var8;
                  if (var6) {
                     var8 = new class437(var1.method6379(-1573991402));
                  } else {
                     var8 = new class722(var1.method6420((byte)-24));
                  }

                  this.field8995.method2947((class568)var8, (long)var7);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "pi.f(" + ')');
      }
   }

   void method5323(int var1) {
      try {
         if (this.field8985 == null) {
            this.field8985 = this.field9002;
         }

      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pi.b(" + ')');
      }
   }

   public boolean method5324(class415 var1, int var2) {
      try {
         int var3;
         if (this.field8987 != null) {
            for(var3 = 0; var3 < this.field8987.length; ++var3) {
               if (var1.method5655(this.field8987[var3][0], (byte)19) >= this.field8987[var3][1]) {
                  return true;
               }
            }
         }

         if (this.field8998 != null) {
            for(var3 = 0; var3 < this.field8998.length; ++var3) {
               if (var1.method5653(this.field8998[var3][0], (byte)36) >= this.field8998[var3][1]) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pi.k(" + ')');
      }
   }

   public boolean method5325(class415 var1, int var2) {
      try {
         int var3;
         if (this.field8987 != null) {
            for(var3 = 0; var3 < this.field8987.length; ++var3) {
               if (var1.method5655(this.field8987[var3][0], (byte)99) >= this.field8987[var3][2]) {
                  return true;
               }
            }
         }

         if (this.field8998 != null) {
            for(var3 = 0; var3 < this.field8998.length; ++var3) {
               if (var1.method5653(this.field8998[var3][0], (byte)110) >= this.field8998[var3][2]) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pi.d(" + ')');
      }
   }

   public boolean method5326(class415 var1, int[] var2, byte var3) {
      try {
         if (this.field8984.method4225(var1, -2006575627) < this.field8983 * 1327747841) {
            return false;
         } else {
            int var4;
            if (this.field8994 != null) {
               for(var4 = 0; var4 < this.field8994.length; ++var4) {
                  if (var2[this.field8994[var4][0]] < this.field8994[var4][1]) {
                     return false;
                  }
               }
            }

            if (this.field8993 != null) {
               for(var4 = 0; var4 < this.field8993.length; ++var4) {
                  if (!this.field8984.method4224(this.field8993[var4], 245040087).method5325(var1, -1717639697)) {
                     return false;
                  }
               }
            }

            int var5;
            if (this.field8996 != null) {
               for(var4 = 0; var4 < this.field8996.length; ++var4) {
                  var5 = var1.method5655(this.field8996[var4], (byte)22);
                  if (var5 < this.field8997[var4] || var5 > this.field8990[var4]) {
                     return false;
                  }
               }
            }

            if (this.field9000 != null) {
               for(var4 = 0; var4 < this.field9000.length; ++var4) {
                  var5 = var1.method5653(this.field9000[var4], (byte)25);
                  if (var5 < this.field9001[var4] || var5 > this.field8986[var4]) {
                     return false;
                  }
               }
            }

            return true;
         }
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "pi.u(" + ')');
      }
   }

   public boolean method5327(class415 var1, int var2, int var3) {
      try {
         if (this.field9000 != null && var2 >= 0 && var2 < this.field9000.length) {
            int var4 = var1.method5653(this.field9000[var2], (byte)61);
            return var4 >= this.field9001[var2] && var4 <= this.field8986[var2];
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.s(" + ')');
      }
   }

   public boolean method5328(int[] var1, int var2, byte var3) {
      try {
         if (this.field8994 != null && var2 >= 0 && var2 < this.field8994.length) {
            return var1[this.field8994[var2][0]] >= this.field8994[var2][1];
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.r(" + ')');
      }
   }

   public boolean method5329(class415 var1, int var2, int var3) {
      try {
         if (this.field8993 != null && var2 >= 0 && var2 < this.field8993.length) {
            return this.field8984.method4224(this.field8993[var2], 245040087).method5325(var1, -1717639697);
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.q(" + ')');
      }
   }

   public boolean method5330(class415 var1, int var2, int var3) {
      try {
         if (this.field8996 != null && var2 >= 0 && var2 < this.field8996.length) {
            int var4 = var1.method5655(this.field8996[var2], (byte)126);
            return var4 >= this.field8997[var2] && var4 <= this.field8990[var2];
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.n(" + ')');
      }
   }

   public int method5331(int var1, int var2, byte var3) {
      try {
         if (this.field8995 == null) {
            return var2;
         } else {
            class722 var4 = (class722)this.field8995.method2942((long)var1);
            return var4 == null ? var2 : var4.field3631 * -774922497;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.p(" + ')');
      }
   }

   public boolean method5332(class415 var1, int var2) {
      try {
         return this.field8984.method4225(var1, -1427823636) >= this.field8983 * 1327747841;
      } catch (RuntimeException var4) {
         throw class158.method3445(var4, "pi.x(" + ')');
      }
   }

   public String method5333(int var1, String var2, int var3) {
      try {
         if (this.field8995 == null) {
            return var2;
         } else {
            class437 var4 = (class437)this.field8995.method2942((long)var1);
            return var4 == null ? var2 : (String)var4.field7515;
         }
      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "pi.i(" + ')');
      }
   }

   static final void method5334(class744 var0, byte var1) {
      try {
         int var2 = var0.field3161[(var0.field3156 -= -391880689) * 681479919];
         var0.field3161[(var0.field3156 += -391880689) * 681479919 - 1] = var0.field3169.field9709[var2];
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pi.xd(" + ')');
      }
   }

   public static void method5335(int var0, int var1) {
      try {
         class75.field1494 = 925615037 * var0;
         class564.field863.method2977();
      } catch (RuntimeException var3) {
         throw class158.method3445(var3, "pi.v(" + ')');
      }
   }
}
