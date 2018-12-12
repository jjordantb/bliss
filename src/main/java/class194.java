import jaggl.OpenGL;

public class class194 extends class184 {
   boolean field6974;
   float[] field6975;
   static int field6976 = 13;
   class608 field6977;
   class588 field6978;
   int field6979;
   int field6980;
   static int[] field6981 = new int[2];
   static int field6982 = 35632;
   int[] field6983;
   int[] field6984;
   static float[] field6985 = new float[16];
   int field6986;
   String field6987;
   static int field6988 = 35633;
   float[] field6989;
   float[] field6990;
   String field6991;
   float[] field6992;
   static boolean field6993 = !class194.class.desiredAssertionStatus();

   class194(class608 var1, class220 var2) {
      this.field6979 = 0;
      this.field6980 = 0;
      this.field6986 = 0;
      this.field6974 = false;
      this.field6983 = new int[13];
      super.field5229 = var2.field7353;
      StringBuilder var3 = new StringBuilder();
      class27[] var4;
      int var5;
      class27 var6;
      if (var2.field7352 != null) {
         super.field5227 = var2.field7352;
         if (var2.field7355 != null) {
            var4 = var2.field7355;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.field6486 + " " + var6.field6485 + '\n');
            }
         }

         var3.append(new String(var1.method5079(super.field5227)));
         this.field6991 = var3.toString();
      }

      if (var2.field7354 != null) {
         super.field5228 = var2.field7354;
         var3.setLength(0);
         if (var2.field7356 != null) {
            var4 = var2.field7356;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.field6486 + " " + var6.field6485 + '\n');
            }
         }

         var3.append(new String(var1.method5079(super.field5228)));
         this.field6987 = var3.toString();
      }

      class901.method6354(this.field6983, 0, this.field6983.length, -1);
   }

   void method3178(class655 var1, float var2, float var3, float var4) {
      int var5 = ((class315)var1).method430();
      if (var5 != -1 && (this.field6992[var5] != var2 || this.field6990[var5] != var3 || this.field6975[var5] != var4)) {
         this.field6992[var5] = var2;
         this.field6990[var5] = var3;
         this.field6975[var5] = var4;
         if (var1.method5613(585186904) != class495.field8013) {
            throw new class286(var1, "");
         }

         OpenGL.glUniform3f(var5, var2, var3, var4);
      }

   }

   void method3192(class655 var1, float var2) {
      int var3 = ((class315)var1).method430();
      if (var3 != -1 && this.field6992[var3] != var2) {
         this.field6992[var3] = var2;
         if (var1.method5613(33040871) != class495.field7995 && var1.method5613(-548966323) != class495.field8041) {
            throw new class286(var1, "");
         }

         OpenGL.glUniform1f(var3, var2);
      }

   }

   void method3177(class655 var1, float var2, float var3) {
      int var4 = ((class315)var1).method430();
      if (var4 != -1 && (this.field6992[var4] != var2 || this.field6990[var4] != var3)) {
         this.field6992[var4] = var2;
         this.field6990[var4] = var3;
         if (var1.method5613(155730318) != class495.field8067) {
            throw new class286(var1, "");
         }

         OpenGL.glUniform2f(var4, var2, var3);
      }

   }

   void method3186(int var1, float[] var2, int var3) {
      OpenGL.glUniform4fv(var1, var3, var2, 0);
   }

   void method3179(class655 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((class315)var1).method430();
      if (var6 != -1 && (this.field6992[var6] != var2 || this.field6990[var6] != var3 || this.field6975[var6] != var4 || this.field6989[var6] != var5)) {
         this.field6992[var6] = var2;
         this.field6990[var6] = var3;
         this.field6975[var6] = var4;
         this.field6989[var6] = var5;
         if (var1.method5613(-1326694725) != class495.field8019) {
            throw new class286(var1, "");
         }

         OpenGL.glUniform4f(var6, var2, var3, var4, var5);
      }

   }

   void method3180(class655 var1, float[] var2, int var3) {
      int var4 = ((class315)var1).method430();
      if (var4 != -1) {
         OpenGL.glUniform4fv(var4, var3, var2, 0);
      }

   }

   void method3208(class655 var1, class344 var2) {
      if (!field6993 && var1.method5613(1145351512) != class495.field7981) {
         throw new AssertionError();
      } else {
         int var3 = ((class315)var1).method430();
         if (var3 != -1) {
            OpenGL.glUniform2fv(var3, 4, var2.method289(field6985), 0);
         }

      }
   }

   void method3182(class655 var1, class344 var2) {
      if (!field6993 && var1.method5613(-1304354022) != class495.field8014) {
         throw new AssertionError();
      } else {
         int var3 = ((class315)var1).method430();
         if (var3 != -1) {
            OpenGL.glUniform4fv(var3, 4, var2.method300(field6985), 0);
         }

      }
   }

   void method3184(int var1, float var2, float var3, float var4) {
      OpenGL.glUniform3f(var1, var2, var3, var4);
   }

   void method3185(int var1, float var2, float var3, float var4, float var5) {
      OpenGL.glUniform4f(var1, var2, var3, var4, var5);
   }

   void method3187(int var1, class344 var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method292(field6985), 0);
   }

   void method3175(int var1, class344 var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method289(field6985), 0);
   }

   void method3189(int var1, class344 var2) {
      OpenGL.glUniform4fv(var1, 4, var2.method300(field6985), 0);
   }

   void method3190(int var1, int var2, class659 var3) {
      this.field6977.method616(var2);
      this.field6977.method617(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   public void method2755() {
      if (this.field6979 != 0) {
         this.field6977.method5082(this.field6979);
         if (this.field6980 != 0) {
            this.field6977.method5075((long)this.field6980);
         }

         if (this.field6986 != 0) {
            this.field6977.method5075((long)this.field6986);
         }

         this.field6979 = 0;
         this.field6980 = 0;
         this.field6986 = 0;
      }

   }

   void method3183(class655 var1, int var2, class659 var3) {
      int var4 = ((class315)var1).method430();
      if (var4 != -1) {
         if (var3 == null) {
            var3 = this.field6977.field754;
         }

         if (var2 < this.field6977.field791) {
            this.field6977.method616(var2);
            this.field6977.method617((class659)var3);
         } else {
            OpenGL.glActiveTexture('蓀' + var2);
            OpenGL.glBindTexture(((class714)var3).field3598, ((class714)var3).field3600);
         }

         if (this.field6984[var4] != var2) {
            this.field6984[var4] = var2;
            OpenGL.glUniform1i(var4, var2);
         }
      }

   }

   class194(class608 var1, class588 var2, class220 var3) {
      this(var1, var3);
      this.field6978 = var2;
      this.field6977 = var1;
   }

   int method3713(int var1, String var2, String var3) {
      if (var2 == null) {
         return 0;
      } else {
         int var4 = OpenGL.glCreateShader(var1);
         OpenGL.glShaderSource(var4, var2);
         OpenGL.glCompileShader(var4);
         OpenGL.glGetShaderiv(var4, 35713, field6981, 0);
         if (field6981[0] == 0) {
            OpenGL.glDeleteShader(var4);
            var4 = 0;
         }

         return var4;
      }
   }

   public boolean method3237() {
      if (this.field6974) {
         return true;
      } else {
         this.field6977.field8618 = null;
         this.field6980 = this.method3713(35633, this.field6991, super.field5227);
         this.field6986 = this.method3713(35632, this.field6987, super.field5228);
         if (this.field6980 != 0 && this.field6986 != 0) {
            this.field6979 = OpenGL.glCreateProgram();
            if (this.field6980 != 0) {
               OpenGL.glAttachShader(this.field6979, this.field6980);
            }

            if (this.field6986 != 0) {
               OpenGL.glAttachShader(this.field6979, this.field6986);
            }

            OpenGL.glLinkProgram(this.field6979);
            OpenGL.glGetProgramiv(this.field6979, 35714, field6981, 0);
            if (field6981[0] == 0) {
               if (this.field6980 != 0) {
                  OpenGL.glDetachShader(this.field6979, this.field6980);
                  OpenGL.glDeleteShader(this.field6980);
               }

               if (this.field6986 != 0) {
                  OpenGL.glDetachShader(this.field6979, this.field6986);
                  OpenGL.glDeleteShader(this.field6986);
               }

               OpenGL.glDeleteProgram(this.field6979);
               return false;
            } else {
               OpenGL.glUseProgram(this.field6979);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.field6978.method4054(-1467018991); ++var2) {
                  if (this.field6978.method4095(var2, 1618766328) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if (var1 == -1) {
                  return false;
               } else {
                  var2 = 0;
                  int var3 = 0;

                  int var4;
                  class655 var5;
                  class495 var6;
                  int var7;
                  for(var4 = 0; var4 < this.field6978.method4049(-851486259); ++var4) {
                     var5 = this.field6978.method4078(var4, 444661617);
                     if (var5 != null) {
                        var5.method5619(var1);
                        var6 = var5.method5613(1111290915);
                        var7 = ((class315)var5).field494[var1];
                        if (var6 != class495.field7995 && var6 != class495.field8041 && var6 != class495.field8067 && var6 != class495.field8013 && var6 != class495.field8019) {
                           var3 = Math.max(var7, var3);
                        } else {
                           var2 = Math.max(var7, var2);
                        }
                     }
                  }

                  for(var4 = 0; var4 < this.field6978.method4076((byte)-85); ++var4) {
                     var5 = this.field6978.method4096(var4, 1888215794);
                     if (var5 != null) {
                        var5.method5619(var1);
                        var6 = var5.method5613(-1614356298);
                        var7 = ((class315)var5).field494[var1];
                        if (var6 != class495.field7995 && var6 != class495.field8041 && var6 != class495.field8067 && var6 != class495.field8013 && var6 != class495.field8019) {
                           var3 = Math.max(var7, var3);
                        } else {
                           var2 = Math.max(var7, var2);
                        }
                     }
                  }

                  this.field6992 = new float[var2 + 1];
                  this.field6990 = new float[var2 + 1];
                  this.field6975 = new float[var2 + 1];
                  this.field6989 = new float[var2 + 1];
                  this.field6984 = new int[var3 + 1];

                  for(var4 = 0; var4 < this.field6984.length; ++var4) {
                     this.field6984[var4] = -1;
                  }

                  this.field6991 = null;
                  this.field6987 = null;
                  this.field6974 = true;
                  return true;
               }
            }
         } else {
            if (this.field6980 != 0) {
               OpenGL.glDeleteShader(this.field6980);
            }

            if (this.field6986 != 0) {
               OpenGL.glDeleteShader(this.field6986);
            }

            return false;
         }
      }
   }
}
