import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class464 extends class770 {
   int field7377;
   int field7378;
   int field7379;
   static int field7380 = 16;
   int field7381;
   byte[] field7382;

   boolean method4110(int var1, int var2) {
      return this.field7382.length >= var1 * var2;
   }

   void method4111() {
      int var1 = -1;

      for(int var2 = this.field7382.length - 8; var1 < var2; this.field7382[var1] = 0) {
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
         this.field7382[var1] = 0;
         ++var1;
      }

      while(var1 < this.field7382.length - 1) {
         ++var1;
         this.field7382[var1] = 0;
      }

   }

   void method4112(int var1, int var2, int var3, int var4, int var5, int var6) {
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
               var1 *= this.field7378;

               label296:
               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label296;
                        }

                        method4113(this.field7382, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.field7378;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.field7378;

               label306:
               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label306;
                        }

                        method4113(this.field7382, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.field7378;
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
               var1 *= this.field7378;

               label264:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           break label264;
                        }

                        method4113(this.field7382, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.field7378;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.field7378;

               label274:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           break label274;
                        }

                        method4113(this.field7382, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.field7378;
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
               var2 *= this.field7378;

               label230:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           break label230;
                        }

                        method4113(this.field7382, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.field7378;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.field7378;

               label240:
               while(true) {
                  --var3;
                  if (var3 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           break label240;
                        }

                        method4113(this.field7382, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.field7378;
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
               var2 *= this.field7378;

               label216:
               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label216;
                        }

                        method4113(this.field7382, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.field7378;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.field7378;

               label206:
               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           break label206;
                        }

                        method4113(this.field7382, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.field7378;
                     }
                  }

                  method4113(this.field7382, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.field7378;
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
            var3 *= this.field7378;

            label191:
            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        break label191;
                     }

                     method4113(this.field7382, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.field7378;
                  }
               }

               method4113(this.field7382, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.field7378;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.field7378;

            label181:
            while(true) {
               --var1;
               if (var1 < 0) {
                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        break label181;
                     }

                     method4113(this.field7382, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.field7378;
                  }
               }

               method4113(this.field7382, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.field7378;
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
            var3 *= this.field7378;

            label167:
            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        break label167;
                     }

                     method4113(this.field7382, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.field7378;
                  }
               }

               method4113(this.field7382, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.field7378;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.field7378;

            label157:
            while(true) {
               --var2;
               if (var2 < 0) {
                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        break label157;
                     }

                     method4113(this.field7382, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.field7378;
                  }
               }

               method4113(this.field7382, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.field7378;
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

   static final void method4113(byte[] var0, int var1, int var2, int var3, int var4) {
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

   class464(class13 var1, int var2, int var3) {
      this.field7382 = new byte[var2 * var3];
   }

   void method4114(int var1, int var2, int var3, int var4) {
      this.field7377 = var1;
      this.field7381 = var2;
      this.field7378 = var3 - var1;
      this.field7379 = var4 - var2;
   }
}
