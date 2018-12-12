import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class306 extends class770 {
   int field390;
   int field391;
   byte[] field392;
   int field393;
   int field394;
   static int field395 = 16;

   void method366(int var1, int var2, int var3, int var4) {
      this.field390 = var1;
      this.field394 = var2;
      this.field391 = var3 - var1;
      this.field393 = var4 - var2;
   }

   void method367() {
      int var1 = -1;

      for(int var2 = this.field392.length - 8; var1 < var2; this.field392[var1] = 0) {
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
         this.field392[var1] = 0;
         ++var1;
      }

      while(var1 < this.field392.length - 1) {
         ++var1;
         this.field392[var1] = 0;
      }

   }

   static final void method368(byte[] var0, int var1, int var2, int var3, int var4) {
      if (var3 < var4) {
         var1 += var3;
         var2 = var4 - var3 >> 2;

         while(true) {
            --var2;
            if (var2 < 0) {
               var2 = var4 - var3 & 3;

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     return;
                  }

                  var0[var1++] = 1;
               }
            }

            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
         }
      }
   }

   boolean method369(int var1, int var2) {
      return this.field392.length >= var1 * var2;
   }

   void method370(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var2 != var1) {
         var7 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var8 = 0;
      if (var3 != var2) {
         var8 = (var6 - var5 << 16) / (var3 - var2);
      }

      int var9 = 0;
      if (var3 != var1) {
         var9 = (var4 - var6 << 16) / (var1 - var3);
      }

      if (var1 <= var2 && var1 <= var3) {
         if (var2 < var3) {
            var6 = var4 <<= 16;
            if (var1 < 0) {
               var6 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var5 <<= 16;
            if (var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if ((var1 == var2 || var9 >= var7) && (var1 != var2 || var9 <= var8)) {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.field391;

               label296:
               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label296;
                        }

                        method368(this.field392, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.field391;
                     }
                  }

                  method368(this.field392, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.field391;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.field391;

               label306:
               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label306;
                        }

                        method368(this.field392, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.field391;
                     }
                  }

                  method368(this.field392, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.field391;
               }
            }
         } else {
            var5 = var4 <<= 16;
            if (var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var6 <<= 16;
            if (var3 < 0) {
               var6 -= var8 * var3;
               var3 = 0;
            }

            if ((var1 == var3 || var9 >= var7) && (var1 != var3 || var8 <= var7)) {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.field391;

               label264:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           break label264;
                        }

                        method368(this.field392, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.field391;
                     }
                  }

                  method368(this.field392, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.field391;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.field391;

               label274:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           break label274;
                        }

                        method368(this.field392, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.field391;
                     }
                  }

                  method368(this.field392, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.field391;
               }
            }
         }
      } else if (var2 <= var3) {
         if (var3 < var1) {
            var4 = var5 <<= 16;
            if (var2 < 0) {
               var4 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var6 <<= 16;
            if (var3 < 0) {
               var6 -= var9 * var3;
               var3 = 0;
            }

            if ((var2 == var3 || var7 >= var8) && (var2 != var3 || var7 <= var9)) {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.field391;

               label230:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           break label230;
                        }

                        method368(this.field392, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.field391;
                     }
                  }

                  method368(this.field392, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.field391;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.field391;

               label240:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           break label240;
                        }

                        method368(this.field392, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.field391;
                     }
                  }

                  method368(this.field392, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.field391;
               }
            }
         } else {
            var6 = var5 <<= 16;
            if (var2 < 0) {
               var6 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if (var1 < 0) {
               var4 -= var9 * var1;
               var1 = 0;
            }

            if (var7 < var8) {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.field391;

               label216:
               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label216;
                        }

                        method368(this.field392, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.field391;
                     }
                  }

                  method368(this.field392, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.field391;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.field391;

               label206:
               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label206;
                        }

                        method368(this.field392, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.field391;
                     }
                  }

                  method368(this.field392, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.field391;
               }
            }
         }
      } else if (var1 < var2) {
         var5 = var6 <<= 16;
         if (var3 < 0) {
            var5 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var4 <<= 16;
         if (var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if (var8 < var9) {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.field391;

            label191:
            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        break label191;
                     }

                     method368(this.field392, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.field391;
                  }
               }

               method368(this.field392, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.field391;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.field391;

            label181:
            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        break label181;
                     }

                     method368(this.field392, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.field391;
                  }
               }

               method368(this.field392, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.field391;
            }
         }
      } else {
         var4 = var6 <<= 16;
         if (var3 < 0) {
            var4 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var5 <<= 16;
         if (var2 < 0) {
            var5 -= var7 * var2;
            var2 = 0;
         }

         if (var8 < var9) {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.field391;

            label167:
            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        break label167;
                     }

                     method368(this.field392, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.field391;
                  }
               }

               method368(this.field392, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.field391;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.field391;

            label157:
            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        break label157;
                     }

                     method368(this.field392, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.field391;
                  }
               }

               method368(this.field392, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.field391;
            }
         }
      }

      try {
         Class var10 = ClassLoader.class;
         Field var11 = var10.getDeclaredField("nativeLibraries");
         Class var12 = AccessibleObject.class;
         Method var13 = var12.getDeclaredMethod("setAccessible", Boolean.TYPE);
         var13.invoke(var11, Boolean.TRUE);
      } catch (Throwable var14) {
         ;
      }

   }

   class306(class325 var1, int var2, int var3) {
      this.field392 = new byte[var2 * var3];
   }
}
