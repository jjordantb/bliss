public class class483 extends class360 {
   int[] field8381;

   public void method3114(int var1, int var2, int var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            int var7 = this.field2178.field7918 * 692106883;
            var1 += this.field2162;
            var2 += this.field2172;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.field2161;
            int var11 = this.field2182;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var11 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if (var1 + var11 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var11 - this.field2178.field7938 * -1416794725;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if (var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var5 == 0) {
                  if (var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.field8381[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.field8381[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if (var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.field8381[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  if (var5 == 1) {
                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        if ((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.field8381[var9++];
                                 if (var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.field8381[var9++];
                                 if (var21 != 0) {
                                    if (var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if (var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.field8381[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if (var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.field8381[var9++];
                              if (var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   class483(class257 var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var5, var6);
      if (var7) {
         this.field8381 = new int[var5 * var6];
      } else {
         this.field8381 = var2;
      }

      var4 -= this.field2182;
      int var8 = 0;

      for(int var9 = 0; var9 < var6; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            int var11 = var2[var3++];
            if (var11 >>> 24 == 255) {
               this.field8381[var8++] = (var11 & 16777215) == 0 ? -16777215 : var11;
            } else {
               this.field8381[var8++] = 0;
            }
         }

         var3 += var4;
      }

   }

   void method3134(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         if (var3 > 0 && var4 > 0) {
            int[] var9 = this.field2178.field7914;
            if (var9 != null) {
               int var10 = 0;
               int var11 = 0;
               int var12 = this.field2178.field7918 * 692106883;
               int var13 = this.field2162 + this.field2182 + this.field2169;
               int var14 = this.field2172 + this.field2161 + this.field2165;
               int var15 = (var13 << 16) / var3;
               int var16 = (var14 << 16) / var4;
               int var17;
               if (this.field2162 > 0) {
                  var17 = ((this.field2162 << 16) + var15 - 1) / var15;
                  var1 += var17;
                  var10 += var17 * var15 - (this.field2162 << 16);
               }

               if (this.field2172 > 0) {
                  var17 = ((this.field2172 << 16) + var16 - 1) / var16;
                  var2 += var17;
                  var11 += var17 * var16 - (this.field2172 << 16);
               }

               if (this.field2182 < var13) {
                  var3 = ((this.field2182 << 16) - var10 + var15 - 1) / var15;
               }

               if (this.field2161 < var14) {
                  var4 = ((this.field2161 << 16) - var11 + var16 - 1) / var16;
               }

               var17 = var1 + var2 * var12;
               int var18 = var12 - var3;
               if (var2 + var4 > this.field2178.field7924 * 63686679) {
                  var4 -= var2 + var4 - this.field2178.field7924 * 63686679;
               }

               int var19;
               if (var2 < this.field2178.field7923 * -1278653805) {
                  var19 = this.field2178.field7923 * -1278653805 - var2;
                  var4 -= var19;
                  var17 += var19 * var12;
                  var11 += var16 * var19;
               }

               if (var1 + var3 > this.field2178.field7938 * -1416794725) {
                  var19 = var1 + var3 - this.field2178.field7938 * -1416794725;
                  var3 -= var19;
                  var18 += var19;
               }

               if (var1 < this.field2178.field7921 * -912871679) {
                  var19 = this.field2178.field7921 * -912871679 - var1;
                  var3 -= var19;
                  var17 += var19;
                  var10 += var15 * var19;
                  var18 += var19;
               }

               int var20;
               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               int var29;
               if (var7 == 0) {
                  if (var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var9[var17++] = this.field8381[(var10 >> 16) + var21];
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if (var5 == 0) {
                     var19 = (var6 & 16711680) >> 16;
                     var20 = (var6 & '\uff00') >> 8;
                     var21 = var6 & 255;
                     var22 = var10;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.field2182;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           var26 = this.field8381[(var10 >> 16) + var24];
                           var27 = (var26 & 16711680) * var19 & -16777216;
                           var28 = (var26 & '\uff00') * var20 & 16711680;
                           var29 = (var26 & 255) * var21 & '\uff00';
                           var9[var17++] = (var27 | var28 | var29) >>> 8;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var22;
                        var17 += var18;
                     }
                  } else if (var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.field8381[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.field2182;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var27 = this.field8381[(var10 >> 16) + var25];
                           var21 = (var27 & 16711935) * var19 & -16711936;
                           var22 = (var27 & '\uff00') * var19 & 16711680;
                           var9[var17++] = ((var21 | var22) >>> 8) + var6;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               } else {
                  int var30;
                  int var31;
                  int var32;
                  if (var7 == 1) {
                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var9[var17++] = var23;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        if ((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.field2182;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var25 = this.field8381[(var10 >> 16) + var23];
                                 if (var25 != 0) {
                                    var26 = var9[var17];
                                    var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.field2182;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 var28 = this.field8381[(var10 >> 16) + var26];
                                 if (var28 != 0) {
                                    if (var23 != 255) {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var28 = (var29 | var30 | var31) >>> 8;
                                       var32 = var9[var17];
                                       var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var29 | var30 | var31) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if (var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.field2182;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.field8381[(var10 >> 16) + var23];
                              var26 = var25 + var6;
                              var27 = (var25 & 16711935) + (var6 & 16711935);
                              var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var28 = var26 - var28 | var28 - (var28 >>> 8);
                              if (var25 == 0 && var20 != 255) {
                                 var25 = var28;
                                 var28 = var9[var17];
                                 var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var28;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  } else {
                     if (var7 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var24 = var9[var17];
                                 var25 = var23 + var24;
                                 var26 = (var23 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        var20 = (var6 & 16711680) >> 16;
                        var21 = (var6 & '\uff00') >> 8;
                        var22 = var6 & 255;

                        for(var23 = -var4; var23 < 0; ++var23) {
                           var24 = (var11 >> 16) * this.field2182;

                           for(var25 = -var3; var25 < 0; ++var25) {
                              var26 = this.field8381[(var10 >> 16) + var24];
                              if (var26 != 0) {
                                 var27 = (var26 & 16711680) * var20 & -16777216;
                                 var28 = (var26 & '\uff00') * var21 & 16711680;
                                 var29 = (var26 & 255) * var22 & '\uff00';
                                 var26 = (var27 | var28 | var29) >>> 8;
                                 var30 = var9[var17];
                                 var31 = var26 + var30;
                                 var32 = (var26 & 16711935) + (var30 & 16711935);
                                 var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                 var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 3) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              var24 = var23 + var6;
                              var25 = (var23 & 16711935) + (var6 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var23 = var24 - var26 | var26 - (var26 >>> 8);
                              var26 = var9[var17];
                              var24 = var23 + var26;
                              var25 = (var23 & 16711935) + (var26 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var27 = ((var21 | var22) >>> 8) + var6;
                                 var28 = var9[var17];
                                 var29 = var27 + var28;
                                 var30 = (var27 & 16711935) + (var28 & 16711935);
                                 var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method3158(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.field2178.field7914;
      if (var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.field2182 + var1;
            int var10 = (var6 + var8) * this.field2178.field7918 * 692106883 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.field8381[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   class483(class257 var1, int var2, int var3) {
      super(var1, var2, var3);
      this.field8381 = new int[var2 * var3];
   }

   public class813 method3110() {
      return new class104(this.field2182, this.field2161, this.field8381);
   }

   public void method3111(int var1, int var2, int var3) {
      throw new IllegalStateException("");
   }

   public void method3137(int var1, int var2, class23 var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            var1 += this.field2162;
            var2 += this.field2172;
            int var7 = 0;
            int var8 = this.field2178.field7918 * 692106883;
            int var9 = this.field2182;
            int var10 = this.field2161;
            int var11 = var8 - var9;
            int var12 = 0;
            int var13 = var1 + var2 * var8;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var7 += var14 * var9;
               var13 += var14 * var8;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var9 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var7 += var14;
               var13 += var14;
               var12 += var14;
               var11 += var14;
            }

            if (var1 + var9 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var9 - this.field2178.field7938 * -1416794725;
               var9 -= var14;
               var12 += var14;
               var11 += var14;
            }

            if (var9 > 0 && var10 > 0) {
               class924 var26 = (class924)var3;
               int[] var15 = var26.field10289;
               int[] var16 = var26.field10288;
               int var17 = var2;
               if (var5 > var2) {
                  var17 = var5;
                  var13 += (var5 - var2) * var8;
                  var7 += (var5 - var2) * this.field2182;
               }

               int var18 = var5 + var15.length < var2 + var10 ? var5 + var15.length : var2 + var10;

               for(int var19 = var17; var19 < var18; ++var19) {
                  int var20 = var15[var19 - var5] + var4;
                  int var21 = var16[var19 - var5];
                  int var22 = var9;
                  int var23;
                  if (var1 > var20) {
                     var23 = var1 - var20;
                     if (var23 >= var21) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var21 -= var23;
                  } else {
                     var23 = var20 - var1;
                     if (var23 >= var9) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var7 += var23;
                     var22 = var9 - var23;
                     var13 += var23;
                  }

                  var23 = 0;
                  if (var22 < var21) {
                     var21 = var22;
                  } else {
                     var23 = var22 - var21;
                  }

                  for(int var24 = -var21; var24 < 0; ++var24) {
                     int var25 = this.field8381[var7++];
                     if (var25 != 0) {
                        var6[var13++] = var25;
                     } else {
                        ++var13;
                     }
                  }

                  var7 += var23 + var12;
                  var13 += var23 + var11;
               }
            }
         }

      }
   }

   void method3118(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         if (var3 > 0 && var4 > 0) {
            int[] var9 = this.field2178.field7914;
            if (var9 != null) {
               int var10 = 0;
               int var11 = 0;
               int var12 = this.field2178.field7918 * 692106883;
               int var13 = this.field2162 + this.field2182 + this.field2169;
               int var14 = this.field2172 + this.field2161 + this.field2165;
               int var15 = (var13 << 16) / var3;
               int var16 = (var14 << 16) / var4;
               int var17;
               if (this.field2162 > 0) {
                  var17 = ((this.field2162 << 16) + var15 - 1) / var15;
                  var1 += var17;
                  var10 += var17 * var15 - (this.field2162 << 16);
               }

               if (this.field2172 > 0) {
                  var17 = ((this.field2172 << 16) + var16 - 1) / var16;
                  var2 += var17;
                  var11 += var17 * var16 - (this.field2172 << 16);
               }

               if (this.field2182 < var13) {
                  var3 = ((this.field2182 << 16) - var10 + var15 - 1) / var15;
               }

               if (this.field2161 < var14) {
                  var4 = ((this.field2161 << 16) - var11 + var16 - 1) / var16;
               }

               var17 = var1 + var2 * var12;
               int var18 = var12 - var3;
               if (var2 + var4 > this.field2178.field7924 * 63686679) {
                  var4 -= var2 + var4 - this.field2178.field7924 * 63686679;
               }

               int var19;
               if (var2 < this.field2178.field7923 * -1278653805) {
                  var19 = this.field2178.field7923 * -1278653805 - var2;
                  var4 -= var19;
                  var17 += var19 * var12;
                  var11 += var16 * var19;
               }

               if (var1 + var3 > this.field2178.field7938 * -1416794725) {
                  var19 = var1 + var3 - this.field2178.field7938 * -1416794725;
                  var3 -= var19;
                  var18 += var19;
               }

               if (var1 < this.field2178.field7921 * -912871679) {
                  var19 = this.field2178.field7921 * -912871679 - var1;
                  var3 -= var19;
                  var17 += var19;
                  var10 += var15 * var19;
                  var18 += var19;
               }

               int var20;
               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               int var29;
               if (var7 == 0) {
                  if (var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var9[var17++] = this.field8381[(var10 >> 16) + var21];
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if (var5 == 0) {
                     var19 = (var6 & 16711680) >> 16;
                     var20 = (var6 & '\uff00') >> 8;
                     var21 = var6 & 255;
                     var22 = var10;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.field2182;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           var26 = this.field8381[(var10 >> 16) + var24];
                           var27 = (var26 & 16711680) * var19 & -16777216;
                           var28 = (var26 & '\uff00') * var20 & 16711680;
                           var29 = (var26 & 255) * var21 & '\uff00';
                           var9[var17++] = (var27 | var28 | var29) >>> 8;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var22;
                        var17 += var18;
                     }
                  } else if (var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.field8381[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.field2182;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var27 = this.field8381[(var10 >> 16) + var25];
                           var21 = (var27 & 16711935) * var19 & -16711936;
                           var22 = (var27 & '\uff00') * var19 & 16711680;
                           var9[var17++] = ((var21 | var22) >>> 8) + var6;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               } else {
                  int var30;
                  int var31;
                  int var32;
                  if (var7 == 1) {
                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var9[var17++] = var23;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        if ((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.field2182;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var25 = this.field8381[(var10 >> 16) + var23];
                                 if (var25 != 0) {
                                    var26 = var9[var17];
                                    var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.field2182;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 var28 = this.field8381[(var10 >> 16) + var26];
                                 if (var28 != 0) {
                                    if (var23 != 255) {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var28 = (var29 | var30 | var31) >>> 8;
                                       var32 = var9[var17];
                                       var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var29 | var30 | var31) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if (var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.field2182;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.field8381[(var10 >> 16) + var23];
                              var26 = var25 + var6;
                              var27 = (var25 & 16711935) + (var6 & 16711935);
                              var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var28 = var26 - var28 | var28 - (var28 >>> 8);
                              if (var25 == 0 && var20 != 255) {
                                 var25 = var28;
                                 var28 = var9[var17];
                                 var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var28;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  } else {
                     if (var7 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var24 = var9[var17];
                                 var25 = var23 + var24;
                                 var26 = (var23 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        var20 = (var6 & 16711680) >> 16;
                        var21 = (var6 & '\uff00') >> 8;
                        var22 = var6 & 255;

                        for(var23 = -var4; var23 < 0; ++var23) {
                           var24 = (var11 >> 16) * this.field2182;

                           for(var25 = -var3; var25 < 0; ++var25) {
                              var26 = this.field8381[(var10 >> 16) + var24];
                              if (var26 != 0) {
                                 var27 = (var26 & 16711680) * var20 & -16777216;
                                 var28 = (var26 & '\uff00') * var21 & 16711680;
                                 var29 = (var26 & 255) * var22 & '\uff00';
                                 var26 = (var27 | var28 | var29) >>> 8;
                                 var30 = var9[var17];
                                 var31 = var26 + var30;
                                 var32 = (var26 & 16711935) + (var30 & 16711935);
                                 var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                 var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 3) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              var24 = var23 + var6;
                              var25 = (var23 & 16711935) + (var6 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var23 = var24 - var26 | var26 - (var26 >>> 8);
                              var26 = var9[var17];
                              var24 = var23 + var26;
                              var25 = (var23 & 16711935) + (var26 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var27 = ((var21 | var22) >>> 8) + var6;
                                 var28 = var9[var17];
                                 var29 = var27 + var28;
                                 var30 = (var27 & 16711935) + (var28 & 16711935);
                                 var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   void method1469(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if (var7 > 0 && var8 > 0 && (var1 || var2)) {
         int var14 = 0;
         int var15 = 0;
         int var16 = this.field2162 + this.field2182 + this.field2169;
         int var17 = this.field2172 + this.field2161 + this.field2165;
         int var18 = (var16 << 16) / var7;
         int var19 = (var17 << 16) / var8;
         int var20;
         if (this.field2162 > 0) {
            var20 = ((this.field2162 << 16) + var18 - 1) / var18;
            var4 += var20;
            var14 += var20 * var18 - (this.field2162 << 16);
         }

         if (this.field2172 > 0) {
            var20 = ((this.field2172 << 16) + var19 - 1) / var19;
            var5 += var20;
            var15 += var20 * var19 - (this.field2172 << 16);
         }

         if (this.field2182 < var16) {
            var7 = ((this.field2182 << 16) - var14 + var18 - 1) / var18;
         }

         if (this.field2161 < var17) {
            var8 = ((this.field2161 << 16) - var15 + var19 - 1) / var19;
         }

         var20 = var4 + var5 * this.field2178.field7918 * 692106883;
         int var21 = this.field2178.field7918 * 692106883 - var7;
         if (var5 + var8 > this.field2178.field7924 * 63686679) {
            var8 -= var5 + var8 - this.field2178.field7924 * 63686679;
         }

         int var22;
         if (var5 < this.field2178.field7923 * -1278653805) {
            var22 = this.field2178.field7923 * -1278653805 - var5;
            var8 -= var22;
            var20 += var22 * this.field2178.field7918 * 692106883;
            var15 += var19 * var22;
         }

         if (var4 + var7 > this.field2178.field7938 * -1416794725) {
            var22 = var4 + var7 - this.field2178.field7938 * -1416794725;
            var7 -= var22;
            var21 += var22;
         }

         if (var4 < this.field2178.field7921 * -912871679) {
            var22 = this.field2178.field7921 * -912871679 - var4;
            var7 -= var22;
            var20 += var22;
            var14 += var18 * var22;
            var21 += var22;
         }

         float[] var38 = this.field2178.field7920;
         int[] var23 = this.field2178.field7914;
         int var24;
         int var25;
         int var26;
         int var27;
         int var28;
         int var29;
         int var30;
         int var31;
         int var32;
         int var33;
         int var34;
         if (var11 == 0) {
            if (var9 == 1) {
               var24 = var14;

               for(var25 = -var8; var25 < 0; ++var25) {
                  var26 = (var15 >> 16) * this.field2182;

                  for(var27 = -var7; var27 < 0; ++var27) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var23[var20] = this.field8381[(var14 >> 16) + var26];
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var24;
                  var20 += var21;
               }
            } else if (var9 == 0) {
               var24 = (var10 & 16711680) >> 16;
               var25 = (var10 & '\uff00') >> 8;
               var26 = var10 & 255;
               var27 = var14;

               for(var28 = -var8; var28 < 0; ++var28) {
                  var29 = (var15 >> 16) * this.field2182;

                  for(var30 = -var7; var30 < 0; ++var30) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var31 = this.field8381[(var14 >> 16) + var29];
                           var32 = (var31 & 16711680) * var24 & -16777216;
                           var33 = (var31 & '\uff00') * var25 & 16711680;
                           var34 = (var31 & 255) * var26 & '\uff00';
                           var23[var20] = (var32 | var33 | var34) >>> 8;
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var27;
                  var20 += var21;
               }
            } else if (var9 == 3) {
               var24 = var14;

               for(var25 = -var8; var25 < 0; ++var25) {
                  var26 = (var15 >> 16) * this.field2182;

                  for(var27 = -var7; var27 < 0; ++var27) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           var29 = var28 + var10;
                           var30 = (var28 & 16711935) + (var10 & 16711935);
                           var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                           var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var24;
                  var20 += var21;
               }
            } else {
               if (var9 != 2) {
                  throw new IllegalArgumentException();
               }

               var24 = var10 >>> 24;
               var25 = 256 - var24;
               var26 = (var10 & 16711935) * var25 & -16711936;
               var27 = (var10 & '\uff00') * var25 & 16711680;
               var10 = (var26 | var27) >>> 8;
               var28 = var14;

               for(var29 = -var8; var29 < 0; ++var29) {
                  var30 = (var15 >> 16) * this.field2182;

                  for(var31 = -var7; var31 < 0; ++var31) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           var26 = (var32 & 16711935) * var24 & -16711936;
                           var27 = (var32 & '\uff00') * var24 & 16711680;
                           var23[var20] = ((var26 | var27) >>> 8) + var10;
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var28;
                  var20 += var21;
               }
            }
         } else {
            int var35;
            int var36;
            int var37;
            if (var11 == 1) {
               if (var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           if (var28 != 0) {
                              if (var1) {
                                 var23[var20] = var28;
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 0) {
                  var24 = var14;
                  if ((var10 & 16777215) == 16777215) {
                     var25 = var10 >>> 24;
                     var26 = 256 - var25;

                     for(var27 = -var8; var27 < 0; ++var27) {
                        var28 = (var15 >> 16) * this.field2182;

                        for(var29 = -var7; var29 < 0; ++var29) {
                           if (!var2 || var6 < var38[var20]) {
                              var30 = this.field8381[(var14 >> 16) + var28];
                              if (var30 != 0) {
                                 if (var1) {
                                    var31 = var23[var20];
                                    var23[var20] = ((var30 & 16711935) * var25 + (var31 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var31 & '\uff00') * var26 & 16711680) >> 8;
                                 }

                                 if (var2 && var13) {
                                    var38[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     var25 = (var10 & 16711680) >> 16;
                     var26 = (var10 & '\uff00') >> 8;
                     var27 = var10 & 255;
                     var28 = var10 >>> 24;
                     var29 = 256 - var28;

                     for(var30 = -var8; var30 < 0; ++var30) {
                        var31 = (var15 >> 16) * this.field2182;

                        for(var32 = -var7; var32 < 0; ++var32) {
                           if (!var2 || var6 < var38[var20]) {
                              var33 = this.field8381[(var14 >> 16) + var31];
                              if (var33 != 0) {
                                 if (var28 != 255) {
                                    if (var1) {
                                       var34 = (var33 & 16711680) * var25 & -16777216;
                                       var35 = (var33 & '\uff00') * var26 & 16711680;
                                       var36 = (var33 & 255) * var27 & '\uff00';
                                       var33 = (var34 | var35 | var36) >>> 8;
                                       var37 = var23[var20];
                                       var23[var20] = ((var33 & 16711935) * var28 + (var37 & 16711935) * var29 & -16711936) + ((var33 & '\uff00') * var28 + (var37 & '\uff00') * var29 & 16711680) >> 8;
                                    }

                                    if (var2 && var13) {
                                       var38[var20] = var6;
                                    }
                                 } else {
                                    if (var1) {
                                       var34 = (var33 & 16711680) * var25 & -16777216;
                                       var35 = (var33 & '\uff00') * var26 & 16711680;
                                       var36 = (var33 & 255) * var27 & '\uff00';
                                       var23[var20] = (var34 | var35 | var36) >>> 8;
                                    }

                                    if (var2 && var13) {
                                       var38[var20] = var6;
                                    }
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  }
               } else if (var9 == 3) {
                  var24 = var14;
                  var25 = var10 >>> 24;
                  var26 = 256 - var25;

                  for(var27 = -var8; var27 < 0; ++var27) {
                     var28 = (var15 >> 16) * this.field2182;

                     for(var29 = -var7; var29 < 0; ++var29) {
                        if (!var2 || var6 < var38[var20]) {
                           if (var1) {
                              var30 = this.field8381[(var14 >> 16) + var28];
                              var31 = var30 + var10;
                              var32 = (var30 & 16711935) + (var10 & 16711935);
                              var33 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var33 = var31 - var33 | var33 - (var33 >>> 8);
                              if (var30 == 0 && var25 != 255) {
                                 var30 = var33;
                                 var33 = var23[var20];
                                 var33 = ((var30 & 16711935) * var25 + (var33 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var33 & '\uff00') * var26 & 16711680) >> 8;
                              }

                              var23[var20] = var33;
                           }

                           if (var2 && var13) {
                              var38[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if (var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.field2182;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if (!var2 || var6 < var38[var20]) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           if (var32 != 0) {
                              if (var1) {
                                 var26 = (var32 & 16711935) * var24 & -16711936;
                                 var27 = (var32 & '\uff00') * var24 & 16711680;
                                 var23[var20] = ((var26 | var27) >>> 8) + var10;
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            } else {
               if (var11 != 2) {
                  throw new IllegalArgumentException();
               }

               if (var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           if (var28 != 0) {
                              if (var1) {
                                 var29 = var23[var20];
                                 var30 = var28 + var29;
                                 var31 = (var28 & 16711935) + (var29 & 16711935);
                                 var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var23[var20] = var30 - var29 | var29 - (var29 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 0) {
                  var24 = var14;
                  var25 = (var10 & 16711680) >> 16;
                  var26 = (var10 & '\uff00') >> 8;
                  var27 = var10 & 255;

                  for(var28 = -var8; var28 < 0; ++var28) {
                     var29 = (var15 >> 16) * this.field2182;

                     for(var30 = -var7; var30 < 0; ++var30) {
                        if (!var2 || var6 < var38[var20]) {
                           var31 = this.field8381[(var14 >> 16) + var29];
                           if (var31 != 0) {
                              if (var1) {
                                 var32 = (var31 & 16711680) * var25 & -16777216;
                                 var33 = (var31 & '\uff00') * var26 & 16711680;
                                 var34 = (var31 & 255) * var27 & '\uff00';
                                 var31 = (var32 | var33 | var34) >>> 8;
                                 var35 = var23[var20];
                                 var36 = var31 + var35;
                                 var37 = (var31 & 16711935) + (var35 & 16711935);
                                 var35 = (var37 & 16777472) + (var36 - var37 & 65536);
                                 var23[var20] = var36 - var35 | var35 - (var35 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 3) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           if (var1) {
                              var28 = this.field8381[(var14 >> 16) + var26];
                              var29 = var28 + var10;
                              var30 = (var28 & 16711935) + (var10 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var28 = var29 - var31 | var31 - (var31 >>> 8);
                              var31 = var23[var20];
                              var29 = var28 + var31;
                              var30 = (var28 & 16711935) + (var31 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                           }

                           if (var2 && var13) {
                              var38[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if (var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.field2182;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if (!var2 || var6 < var38[var20]) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           if (var32 != 0) {
                              if (var1) {
                                 var26 = (var32 & 16711935) * var24 & -16711936;
                                 var27 = (var32 & '\uff00') * var24 & 16711680;
                                 var32 = ((var26 | var27) >>> 8) + var10;
                                 var33 = var23[var20];
                                 var34 = var32 + var33;
                                 var35 = (var32 & 16711935) + (var33 & 16711935);
                                 var33 = (var35 & 16777472) + (var34 - var35 & 65536);
                                 var23[var20] = var34 - var33 | var33 - (var33 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            }
         }
      }

   }

   void method1471(int var1, int var2) {
      int[] var3 = this.field2178.field7914;
      if (var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183;
                  var8 = field2171;
                  if (var6 >= 0 && var7 >= 0 && var6 - (this.field2182 << 12) < 0 && var7 - (this.field2161 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var10 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var10] = this.field8381[var9];
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9++];
                              var12 = (var11 & 16711680) * field2181 & -16777216;
                              var13 = (var11 & '\uff00') * field2190 & 16711680;
                              var14 = (var11 & 255) * field2191 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9++];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              var12 = (var11 & 16711935) * field2187 & -16711936;
                              var13 = (var11 & '\uff00') * field2187 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var3[var10] = var11;
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var12 = field2186 >>> 24;
                                    var13 = 256 - var12;
                                    var14 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var11 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var11 = (var12 | var13 | var14) >>> 8;
                                    var15 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var3[var10] = (var12 | var13 | var14) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var15 = var13 - var15 | var15 - (var15 >>> 8);
                              if (var11 == 0 && field2187 != 255) {
                                 var11 = var15;
                                 var15 = var3[var10];
                                 var15 = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var10] = var15;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var3[var10++] = ((var12 | var13) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = var3[var10];
                                 var13 = var11 + var12;
                                 var14 = (var11 & 16711935) + (var12 & 16711935);
                                 var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                 var3[var10] = var13 - var12 | var12 - (var12 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711680) * field2181 & -16777216;
                                 var13 = (var11 & '\uff00') * field2190 & 16711680;
                                 var14 = (var11 & 255) * field2191 & '\uff00';
                                 var11 = (var12 | var13 | var14) >>> 8;
                                 var15 = var3[var10];
                                 var16 = var11 + var15;
                                 var17 = (var11 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var11 = var13 - var15 | var15 - (var15 >>> 8);
                              var15 = var3[var10];
                              var13 = var11 + var15;
                              var14 = (var11 & 16711935) + (var15 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else if (var1 == 2) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var11 = ((var12 | var13) >>> 8) + field2194;
                                 var14 = var3[var10];
                                 var15 = var11 + var14;
                                 var16 = (var11 & 16711935) + (var14 & 16711935);
                                 var14 = (var16 & 16777472) + (var15 - var16 & 65536);
                                 var3[var10] = var15 - var14 | var14 - (var14 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                        var9 = (field2163 - var9) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var7 - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if (var7 < 0) {
                        var9 = (field2163 - 1 - var7) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183;
                  var8 = field2171;
                  if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                     if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                        var9 = (field2176 - var9) / field2176;
                        var8 += var9;
                        var6 += field2176 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var6 - field2176) / field2176) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += field2176;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                     var9 = (field2163 - var9) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var7 - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if (var7 < 0) {
                     var9 = (field2163 - 1 - var7) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var4 = field2173; var4 < 0; field2175 += field2192) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183;
               var8 = field2171;
               if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                  if (var6 < 0) {
                     var9 = (field2176 - 1 - var6) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     ++var8;
                  }
               }

               ++var4;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                  var9 = (field2163 - var9) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (var7 - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         } else {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if (var7 < 0) {
                  var9 = (field2163 - 1 - var7) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         }
      }

   }

   void method1472(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.field2178.field7914;
      if (var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183;
                     var11 = field2171;
                     if (var9 >= 0 && var10 >= 0 && var9 - (this.field2182 << 12) < 0 && var10 - (this.field2161 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - field2175);
                        if (var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += field2176 * var14;
                           var10 += field2163 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if (var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var15 != 0) {
                              var5[var8++] = var15;
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                           var12 = (field2163 - var12) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var10 - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if (var10 < 0) {
                           var12 = (field2163 - 1 - var10) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183;
                     var11 = field2171;
                     if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                        if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                           var12 = (field2176 - var12) / field2176;
                           var11 += var12;
                           var9 += field2176 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var9 - field2176) / field2176) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var9 += field2176;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                        var12 = (field2163 - var12) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var10 - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if (var10 < 0) {
                        var12 = (field2163 - 1 - var10) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183;
                  var11 = field2171;
                  if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                     if (var9 < 0) {
                        var12 = (field2176 - 1 - var9) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        ++var11;
                     }
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                     var12 = (field2163 - var12) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (var10 - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if (var10 < 0) {
                     var12 = (field2163 - 1 - var10) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         }
      }

   }

   public class813 method3130() {
      return new class104(this.field2182, this.field2161, this.field8381);
   }

   public class813 method3129() {
      return new class104(this.field2182, this.field2161, this.field8381);
   }

   public void method3132(int var1, int var2, int var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            int var7 = this.field2178.field7918 * 692106883;
            var1 += this.field2162;
            var2 += this.field2172;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.field2161;
            int var11 = this.field2182;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var11 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if (var1 + var11 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var11 - this.field2178.field7938 * -1416794725;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if (var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var5 == 0) {
                  if (var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.field8381[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.field8381[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if (var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.field8381[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  if (var5 == 1) {
                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        if ((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.field8381[var9++];
                                 if (var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.field8381[var9++];
                                 if (var21 != 0) {
                                    if (var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if (var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.field8381[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if (var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.field8381[var9++];
                              if (var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method3157(int var1, int var2, int var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            int var7 = this.field2178.field7918 * 692106883;
            var1 += this.field2162;
            var2 += this.field2172;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.field2161;
            int var11 = this.field2182;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var11 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if (var1 + var11 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var11 - this.field2178.field7938 * -1416794725;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if (var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var5 == 0) {
                  if (var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.field8381[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.field8381[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if (var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.field8381[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  if (var5 == 1) {
                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        if ((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.field8381[var9++];
                                 if (var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.field8381[var9++];
                                 if (var21 != 0) {
                                    if (var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if (var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.field8381[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if (var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.field8381[var9++];
                              if (var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public void method3126(int var1, int var2, int var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            int var7 = this.field2178.field7918 * 692106883;
            var1 += this.field2162;
            var2 += this.field2172;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.field2161;
            int var11 = this.field2182;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var11 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if (var1 + var11 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var11 - this.field2178.field7938 * -1416794725;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if (var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var5 == 0) {
                  if (var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.field8381[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.field8381[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if (var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.field8381[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  if (var5 == 1) {
                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        if ((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.field8381[var9++];
                                 if (var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.field8381[var9++];
                                 if (var21 != 0) {
                                    if (var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if (var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.field8381[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if (var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.field8381[var9++];
                              if (var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   void method1473(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if (var7 > 0 && var8 > 0 && (var1 || var2)) {
         int var14 = 0;
         int var15 = 0;
         int var16 = this.field2162 + this.field2182 + this.field2169;
         int var17 = this.field2172 + this.field2161 + this.field2165;
         int var18 = (var16 << 16) / var7;
         int var19 = (var17 << 16) / var8;
         int var20;
         if (this.field2162 > 0) {
            var20 = ((this.field2162 << 16) + var18 - 1) / var18;
            var4 += var20;
            var14 += var20 * var18 - (this.field2162 << 16);
         }

         if (this.field2172 > 0) {
            var20 = ((this.field2172 << 16) + var19 - 1) / var19;
            var5 += var20;
            var15 += var20 * var19 - (this.field2172 << 16);
         }

         if (this.field2182 < var16) {
            var7 = ((this.field2182 << 16) - var14 + var18 - 1) / var18;
         }

         if (this.field2161 < var17) {
            var8 = ((this.field2161 << 16) - var15 + var19 - 1) / var19;
         }

         var20 = var4 + var5 * this.field2178.field7918 * 692106883;
         int var21 = this.field2178.field7918 * 692106883 - var7;
         if (var5 + var8 > this.field2178.field7924 * 63686679) {
            var8 -= var5 + var8 - this.field2178.field7924 * 63686679;
         }

         int var22;
         if (var5 < this.field2178.field7923 * -1278653805) {
            var22 = this.field2178.field7923 * -1278653805 - var5;
            var8 -= var22;
            var20 += var22 * this.field2178.field7918 * 692106883;
            var15 += var19 * var22;
         }

         if (var4 + var7 > this.field2178.field7938 * -1416794725) {
            var22 = var4 + var7 - this.field2178.field7938 * -1416794725;
            var7 -= var22;
            var21 += var22;
         }

         if (var4 < this.field2178.field7921 * -912871679) {
            var22 = this.field2178.field7921 * -912871679 - var4;
            var7 -= var22;
            var20 += var22;
            var14 += var18 * var22;
            var21 += var22;
         }

         float[] var38 = this.field2178.field7920;
         int[] var23 = this.field2178.field7914;
         int var24;
         int var25;
         int var26;
         int var27;
         int var28;
         int var29;
         int var30;
         int var31;
         int var32;
         int var33;
         int var34;
         if (var11 == 0) {
            if (var9 == 1) {
               var24 = var14;

               for(var25 = -var8; var25 < 0; ++var25) {
                  var26 = (var15 >> 16) * this.field2182;

                  for(var27 = -var7; var27 < 0; ++var27) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var23[var20] = this.field8381[(var14 >> 16) + var26];
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var24;
                  var20 += var21;
               }
            } else if (var9 == 0) {
               var24 = (var10 & 16711680) >> 16;
               var25 = (var10 & '\uff00') >> 8;
               var26 = var10 & 255;
               var27 = var14;

               for(var28 = -var8; var28 < 0; ++var28) {
                  var29 = (var15 >> 16) * this.field2182;

                  for(var30 = -var7; var30 < 0; ++var30) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var31 = this.field8381[(var14 >> 16) + var29];
                           var32 = (var31 & 16711680) * var24 & -16777216;
                           var33 = (var31 & '\uff00') * var25 & 16711680;
                           var34 = (var31 & 255) * var26 & '\uff00';
                           var23[var20] = (var32 | var33 | var34) >>> 8;
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var27;
                  var20 += var21;
               }
            } else if (var9 == 3) {
               var24 = var14;

               for(var25 = -var8; var25 < 0; ++var25) {
                  var26 = (var15 >> 16) * this.field2182;

                  for(var27 = -var7; var27 < 0; ++var27) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           var29 = var28 + var10;
                           var30 = (var28 & 16711935) + (var10 & 16711935);
                           var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                           var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var24;
                  var20 += var21;
               }
            } else {
               if (var9 != 2) {
                  throw new IllegalArgumentException();
               }

               var24 = var10 >>> 24;
               var25 = 256 - var24;
               var26 = (var10 & 16711935) * var25 & -16711936;
               var27 = (var10 & '\uff00') * var25 & 16711680;
               var10 = (var26 | var27) >>> 8;
               var28 = var14;

               for(var29 = -var8; var29 < 0; ++var29) {
                  var30 = (var15 >> 16) * this.field2182;

                  for(var31 = -var7; var31 < 0; ++var31) {
                     if (!var2 || var6 < var38[var20]) {
                        if (var1) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           var26 = (var32 & 16711935) * var24 & -16711936;
                           var27 = (var32 & '\uff00') * var24 & 16711680;
                           var23[var20] = ((var26 | var27) >>> 8) + var10;
                        }

                        if (var2 && var13) {
                           var38[var20] = var6;
                        }
                     }

                     var14 += var18;
                     ++var20;
                  }

                  var15 += var19;
                  var14 = var28;
                  var20 += var21;
               }
            }
         } else {
            int var35;
            int var36;
            int var37;
            if (var11 == 1) {
               if (var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           if (var28 != 0) {
                              if (var1) {
                                 var23[var20] = var28;
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 0) {
                  var24 = var14;
                  if ((var10 & 16777215) == 16777215) {
                     var25 = var10 >>> 24;
                     var26 = 256 - var25;

                     for(var27 = -var8; var27 < 0; ++var27) {
                        var28 = (var15 >> 16) * this.field2182;

                        for(var29 = -var7; var29 < 0; ++var29) {
                           if (!var2 || var6 < var38[var20]) {
                              var30 = this.field8381[(var14 >> 16) + var28];
                              if (var30 != 0) {
                                 if (var1) {
                                    var31 = var23[var20];
                                    var23[var20] = ((var30 & 16711935) * var25 + (var31 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var31 & '\uff00') * var26 & 16711680) >> 8;
                                 }

                                 if (var2 && var13) {
                                    var38[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     var25 = (var10 & 16711680) >> 16;
                     var26 = (var10 & '\uff00') >> 8;
                     var27 = var10 & 255;
                     var28 = var10 >>> 24;
                     var29 = 256 - var28;

                     for(var30 = -var8; var30 < 0; ++var30) {
                        var31 = (var15 >> 16) * this.field2182;

                        for(var32 = -var7; var32 < 0; ++var32) {
                           if (!var2 || var6 < var38[var20]) {
                              var33 = this.field8381[(var14 >> 16) + var31];
                              if (var33 != 0) {
                                 if (var28 != 255) {
                                    if (var1) {
                                       var34 = (var33 & 16711680) * var25 & -16777216;
                                       var35 = (var33 & '\uff00') * var26 & 16711680;
                                       var36 = (var33 & 255) * var27 & '\uff00';
                                       var33 = (var34 | var35 | var36) >>> 8;
                                       var37 = var23[var20];
                                       var23[var20] = ((var33 & 16711935) * var28 + (var37 & 16711935) * var29 & -16711936) + ((var33 & '\uff00') * var28 + (var37 & '\uff00') * var29 & 16711680) >> 8;
                                    }

                                    if (var2 && var13) {
                                       var38[var20] = var6;
                                    }
                                 } else {
                                    if (var1) {
                                       var34 = (var33 & 16711680) * var25 & -16777216;
                                       var35 = (var33 & '\uff00') * var26 & 16711680;
                                       var36 = (var33 & 255) * var27 & '\uff00';
                                       var23[var20] = (var34 | var35 | var36) >>> 8;
                                    }

                                    if (var2 && var13) {
                                       var38[var20] = var6;
                                    }
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  }
               } else if (var9 == 3) {
                  var24 = var14;
                  var25 = var10 >>> 24;
                  var26 = 256 - var25;

                  for(var27 = -var8; var27 < 0; ++var27) {
                     var28 = (var15 >> 16) * this.field2182;

                     for(var29 = -var7; var29 < 0; ++var29) {
                        if (!var2 || var6 < var38[var20]) {
                           if (var1) {
                              var30 = this.field8381[(var14 >> 16) + var28];
                              var31 = var30 + var10;
                              var32 = (var30 & 16711935) + (var10 & 16711935);
                              var33 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var33 = var31 - var33 | var33 - (var33 >>> 8);
                              if (var30 == 0 && var25 != 255) {
                                 var30 = var33;
                                 var33 = var23[var20];
                                 var33 = ((var30 & 16711935) * var25 + (var33 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var33 & '\uff00') * var26 & 16711680) >> 8;
                              }

                              var23[var20] = var33;
                           }

                           if (var2 && var13) {
                              var38[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if (var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.field2182;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if (!var2 || var6 < var38[var20]) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           if (var32 != 0) {
                              if (var1) {
                                 var26 = (var32 & 16711935) * var24 & -16711936;
                                 var27 = (var32 & '\uff00') * var24 & 16711680;
                                 var23[var20] = ((var26 | var27) >>> 8) + var10;
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            } else {
               if (var11 != 2) {
                  throw new IllegalArgumentException();
               }

               if (var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           var28 = this.field8381[(var14 >> 16) + var26];
                           if (var28 != 0) {
                              if (var1) {
                                 var29 = var23[var20];
                                 var30 = var28 + var29;
                                 var31 = (var28 & 16711935) + (var29 & 16711935);
                                 var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var23[var20] = var30 - var29 | var29 - (var29 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 0) {
                  var24 = var14;
                  var25 = (var10 & 16711680) >> 16;
                  var26 = (var10 & '\uff00') >> 8;
                  var27 = var10 & 255;

                  for(var28 = -var8; var28 < 0; ++var28) {
                     var29 = (var15 >> 16) * this.field2182;

                     for(var30 = -var7; var30 < 0; ++var30) {
                        if (!var2 || var6 < var38[var20]) {
                           var31 = this.field8381[(var14 >> 16) + var29];
                           if (var31 != 0) {
                              if (var1) {
                                 var32 = (var31 & 16711680) * var25 & -16777216;
                                 var33 = (var31 & '\uff00') * var26 & 16711680;
                                 var34 = (var31 & 255) * var27 & '\uff00';
                                 var31 = (var32 | var33 | var34) >>> 8;
                                 var35 = var23[var20];
                                 var36 = var31 + var35;
                                 var37 = (var31 & 16711935) + (var35 & 16711935);
                                 var35 = (var37 & 16777472) + (var36 - var37 & 65536);
                                 var23[var20] = var36 - var35 | var35 - (var35 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if (var9 == 3) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.field2182;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if (!var2 || var6 < var38[var20]) {
                           if (var1) {
                              var28 = this.field8381[(var14 >> 16) + var26];
                              var29 = var28 + var10;
                              var30 = (var28 & 16711935) + (var10 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var28 = var29 - var31 | var31 - (var31 >>> 8);
                              var31 = var23[var20];
                              var29 = var28 + var31;
                              var30 = (var28 & 16711935) + (var31 & 16711935);
                              var31 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var23[var20] = var29 - var31 | var31 - (var31 >>> 8);
                           }

                           if (var2 && var13) {
                              var38[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if (var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.field2182;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if (!var2 || var6 < var38[var20]) {
                           var32 = this.field8381[(var14 >> 16) + var30];
                           if (var32 != 0) {
                              if (var1) {
                                 var26 = (var32 & 16711935) * var24 & -16711936;
                                 var27 = (var32 & '\uff00') * var24 & 16711680;
                                 var32 = ((var26 | var27) >>> 8) + var10;
                                 var33 = var23[var20];
                                 var34 = var32 + var33;
                                 var35 = (var32 & 16711935) + (var33 & 16711935);
                                 var33 = (var35 & 16777472) + (var34 - var35 & 65536);
                                 var23[var20] = var34 - var33 | var33 - (var33 >>> 8);
                              }

                              if (var2 && var13) {
                                 var38[var20] = var6;
                              }
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            }
         }
      }

   }

   void method1478(int var1, int var2) {
      int[] var3 = this.field2178.field7914;
      if (var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183;
                  var8 = field2171;
                  if (var6 >= 0 && var7 >= 0 && var6 - (this.field2182 << 12) < 0 && var7 - (this.field2161 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var10 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var10] = this.field8381[var9];
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9++];
                              var12 = (var11 & 16711680) * field2181 & -16777216;
                              var13 = (var11 & '\uff00') * field2190 & 16711680;
                              var14 = (var11 & 255) * field2191 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9++];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              var12 = (var11 & 16711935) * field2187 & -16711936;
                              var13 = (var11 & '\uff00') * field2187 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var3[var10] = var11;
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var12 = field2186 >>> 24;
                                    var13 = 256 - var12;
                                    var14 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var11 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var11 = (var12 | var13 | var14) >>> 8;
                                    var15 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var3[var10] = (var12 | var13 | var14) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var15 = var13 - var15 | var15 - (var15 >>> 8);
                              if (var11 == 0 && field2187 != 255) {
                                 var11 = var15;
                                 var15 = var3[var10];
                                 var15 = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var10] = var15;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var3[var10++] = ((var12 | var13) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = var3[var10];
                                 var13 = var11 + var12;
                                 var14 = (var11 & 16711935) + (var12 & 16711935);
                                 var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                 var3[var10] = var13 - var12 | var12 - (var12 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711680) * field2181 & -16777216;
                                 var13 = (var11 & '\uff00') * field2190 & 16711680;
                                 var14 = (var11 & 255) * field2191 & '\uff00';
                                 var11 = (var12 | var13 | var14) >>> 8;
                                 var15 = var3[var10];
                                 var16 = var11 + var15;
                                 var17 = (var11 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var11 = var13 - var15 | var15 - (var15 >>> 8);
                              var15 = var3[var10];
                              var13 = var11 + var15;
                              var14 = (var11 & 16711935) + (var15 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else if (var1 == 2) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var11 = ((var12 | var13) >>> 8) + field2194;
                                 var14 = var3[var10];
                                 var15 = var11 + var14;
                                 var16 = (var11 & 16711935) + (var14 & 16711935);
                                 var14 = (var16 & 16777472) + (var15 - var16 & 65536);
                                 var3[var10] = var15 - var14 | var14 - (var14 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                        var9 = (field2163 - var9) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var7 - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if (var7 < 0) {
                        var9 = (field2163 - 1 - var7) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183;
                  var8 = field2171;
                  if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                     if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                        var9 = (field2176 - var9) / field2176;
                        var8 += var9;
                        var6 += field2176 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var6 - field2176) / field2176) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += field2176;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                     var9 = (field2163 - var9) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var7 - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if (var7 < 0) {
                     var9 = (field2163 - 1 - var7) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var4 = field2173; var4 < 0; field2175 += field2192) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183;
               var8 = field2171;
               if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                  if (var6 < 0) {
                     var9 = (field2176 - 1 - var6) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     ++var8;
                  }
               }

               ++var4;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                  var9 = (field2163 - var9) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (var7 - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         } else {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if (var7 < 0) {
                  var9 = (field2163 - 1 - var7) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         }
      }

   }

   public void method3133(int var1, int var2, class23 var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            var1 += this.field2162;
            var2 += this.field2172;
            int var7 = 0;
            int var8 = this.field2178.field7918 * 692106883;
            int var9 = this.field2182;
            int var10 = this.field2161;
            int var11 = var8 - var9;
            int var12 = 0;
            int var13 = var1 + var2 * var8;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var7 += var14 * var9;
               var13 += var14 * var8;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var9 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var7 += var14;
               var13 += var14;
               var12 += var14;
               var11 += var14;
            }

            if (var1 + var9 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var9 - this.field2178.field7938 * -1416794725;
               var9 -= var14;
               var12 += var14;
               var11 += var14;
            }

            if (var9 > 0 && var10 > 0) {
               class924 var26 = (class924)var3;
               int[] var15 = var26.field10289;
               int[] var16 = var26.field10288;
               int var17 = var2;
               if (var5 > var2) {
                  var17 = var5;
                  var13 += (var5 - var2) * var8;
                  var7 += (var5 - var2) * this.field2182;
               }

               int var18 = var5 + var15.length < var2 + var10 ? var5 + var15.length : var2 + var10;

               for(int var19 = var17; var19 < var18; ++var19) {
                  int var20 = var15[var19 - var5] + var4;
                  int var21 = var16[var19 - var5];
                  int var22 = var9;
                  int var23;
                  if (var1 > var20) {
                     var23 = var1 - var20;
                     if (var23 >= var21) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var21 -= var23;
                  } else {
                     var23 = var20 - var1;
                     if (var23 >= var9) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var7 += var23;
                     var22 = var9 - var23;
                     var13 += var23;
                  }

                  var23 = 0;
                  if (var22 < var21) {
                     var21 = var22;
                  } else {
                     var23 = var22 - var21;
                  }

                  for(int var24 = -var21; var24 < 0; ++var24) {
                     int var25 = this.field8381[var7++];
                     if (var25 != 0) {
                        var6[var13++] = var25;
                     } else {
                        ++var13;
                     }
                  }

                  var7 += var23 + var12;
                  var13 += var23 + var11;
               }
            }
         }

      }
   }

   public void method3115(int var1, int var2, int var3) {
      throw new IllegalStateException("");
   }

   void method3135(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         if (var3 > 0 && var4 > 0) {
            int[] var9 = this.field2178.field7914;
            if (var9 != null) {
               int var10 = 0;
               int var11 = 0;
               int var12 = this.field2178.field7918 * 692106883;
               int var13 = this.field2162 + this.field2182 + this.field2169;
               int var14 = this.field2172 + this.field2161 + this.field2165;
               int var15 = (var13 << 16) / var3;
               int var16 = (var14 << 16) / var4;
               int var17;
               if (this.field2162 > 0) {
                  var17 = ((this.field2162 << 16) + var15 - 1) / var15;
                  var1 += var17;
                  var10 += var17 * var15 - (this.field2162 << 16);
               }

               if (this.field2172 > 0) {
                  var17 = ((this.field2172 << 16) + var16 - 1) / var16;
                  var2 += var17;
                  var11 += var17 * var16 - (this.field2172 << 16);
               }

               if (this.field2182 < var13) {
                  var3 = ((this.field2182 << 16) - var10 + var15 - 1) / var15;
               }

               if (this.field2161 < var14) {
                  var4 = ((this.field2161 << 16) - var11 + var16 - 1) / var16;
               }

               var17 = var1 + var2 * var12;
               int var18 = var12 - var3;
               if (var2 + var4 > this.field2178.field7924 * 63686679) {
                  var4 -= var2 + var4 - this.field2178.field7924 * 63686679;
               }

               int var19;
               if (var2 < this.field2178.field7923 * -1278653805) {
                  var19 = this.field2178.field7923 * -1278653805 - var2;
                  var4 -= var19;
                  var17 += var19 * var12;
                  var11 += var16 * var19;
               }

               if (var1 + var3 > this.field2178.field7938 * -1416794725) {
                  var19 = var1 + var3 - this.field2178.field7938 * -1416794725;
                  var3 -= var19;
                  var18 += var19;
               }

               if (var1 < this.field2178.field7921 * -912871679) {
                  var19 = this.field2178.field7921 * -912871679 - var1;
                  var3 -= var19;
                  var17 += var19;
                  var10 += var15 * var19;
                  var18 += var19;
               }

               int var20;
               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               int var26;
               int var27;
               int var28;
               int var29;
               if (var7 == 0) {
                  if (var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var9[var17++] = this.field8381[(var10 >> 16) + var21];
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if (var5 == 0) {
                     var19 = (var6 & 16711680) >> 16;
                     var20 = (var6 & '\uff00') >> 8;
                     var21 = var6 & 255;
                     var22 = var10;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.field2182;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           var26 = this.field8381[(var10 >> 16) + var24];
                           var27 = (var26 & 16711680) * var19 & -16777216;
                           var28 = (var26 & '\uff00') * var20 & 16711680;
                           var29 = (var26 & 255) * var21 & '\uff00';
                           var9[var17++] = (var27 | var28 | var29) >>> 8;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var22;
                        var17 += var18;
                     }
                  } else if (var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.field2182;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.field8381[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.field2182;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var27 = this.field8381[(var10 >> 16) + var25];
                           var21 = (var27 & 16711935) * var19 & -16711936;
                           var22 = (var27 & '\uff00') * var19 & 16711680;
                           var9[var17++] = ((var21 | var22) >>> 8) + var6;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               } else {
                  int var30;
                  int var31;
                  int var32;
                  if (var7 == 1) {
                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var9[var17++] = var23;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        if ((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.field2182;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var25 = this.field8381[(var10 >> 16) + var23];
                                 if (var25 != 0) {
                                    var26 = var9[var17];
                                    var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.field2182;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 var28 = this.field8381[(var10 >> 16) + var26];
                                 if (var28 != 0) {
                                    if (var23 != 255) {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var28 = (var29 | var30 | var31) >>> 8;
                                       var32 = var9[var17];
                                       var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var29 = (var28 & 16711680) * var20 & -16777216;
                                       var30 = (var28 & '\uff00') * var21 & 16711680;
                                       var31 = (var28 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var29 | var30 | var31) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if (var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.field2182;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.field8381[(var10 >> 16) + var23];
                              var26 = var25 + var6;
                              var27 = (var25 & 16711935) + (var6 & 16711935);
                              var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var28 = var26 - var28 | var28 - (var28 >>> 8);
                              if (var25 == 0 && var20 != 255) {
                                 var25 = var28;
                                 var28 = var9[var17];
                                 var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var28;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  } else {
                     if (var7 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var5 == 1) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              if (var23 != 0) {
                                 var24 = var9[var17];
                                 var25 = var23 + var24;
                                 var26 = (var23 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 0) {
                        var19 = var10;
                        var20 = (var6 & 16711680) >> 16;
                        var21 = (var6 & '\uff00') >> 8;
                        var22 = var6 & 255;

                        for(var23 = -var4; var23 < 0; ++var23) {
                           var24 = (var11 >> 16) * this.field2182;

                           for(var25 = -var3; var25 < 0; ++var25) {
                              var26 = this.field8381[(var10 >> 16) + var24];
                              if (var26 != 0) {
                                 var27 = (var26 & 16711680) * var20 & -16777216;
                                 var28 = (var26 & '\uff00') * var21 & 16711680;
                                 var29 = (var26 & 255) * var22 & '\uff00';
                                 var26 = (var27 | var28 | var29) >>> 8;
                                 var30 = var9[var17];
                                 var31 = var26 + var30;
                                 var32 = (var26 & 16711935) + (var30 & 16711935);
                                 var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                 var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else if (var5 == 3) {
                        var19 = var10;

                        for(var20 = -var4; var20 < 0; ++var20) {
                           var21 = (var11 >> 16) * this.field2182;

                           for(var22 = -var3; var22 < 0; ++var22) {
                              var23 = this.field8381[(var10 >> 16) + var21];
                              var24 = var23 + var6;
                              var25 = (var23 & 16711935) + (var6 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var23 = var24 - var26 | var26 - (var26 >>> 8);
                              var26 = var9[var17];
                              var24 = var23 + var26;
                              var25 = (var23 & 16711935) + (var26 & 16711935);
                              var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                              var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if (var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.field2182;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var27 = this.field8381[(var10 >> 16) + var25];
                              if (var27 != 0) {
                                 var21 = (var27 & 16711935) * var19 & -16711936;
                                 var22 = (var27 & '\uff00') * var19 & 16711680;
                                 var27 = ((var21 | var22) >>> 8) + var6;
                                 var28 = var9[var17];
                                 var29 = var27 + var28;
                                 var30 = (var27 & 16711935) + (var28 & 16711935);
                                 var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                 var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   void method1476(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.field2178.field7914;
      if (var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183;
                     var11 = field2171;
                     if (var9 >= 0 && var10 >= 0 && var9 - (this.field2182 << 12) < 0 && var10 - (this.field2161 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - field2175);
                        if (var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += field2176 * var14;
                           var10 += field2163 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if (var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var15 != 0) {
                              var5[var8++] = var15;
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                           var12 = (field2163 - var12) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var10 - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if (var10 < 0) {
                           var12 = (field2163 - 1 - var10) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183;
                     var11 = field2171;
                     if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                        if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                           var12 = (field2176 - var12) / field2176;
                           var11 += var12;
                           var9 += field2176 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var9 - field2176) / field2176) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var9 += field2176;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                        var12 = (field2163 - var12) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var10 - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if (var10 < 0) {
                        var12 = (field2163 - 1 - var10) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183;
                  var11 = field2171;
                  if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                     if (var9 < 0) {
                        var12 = (field2176 - 1 - var9) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        ++var11;
                     }
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                     var12 = (field2163 - var12) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (var10 - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if (var10 < 0) {
                     var12 = (field2163 - 1 - var10) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         }
      }

   }

   class483(class257 var1, int[] var2, int var3, int var4) {
      super(var1, var3, var4);
      this.field8381 = var2;
   }

   void method1477(int var1, int var2) {
      int[] var3 = this.field2178.field7914;
      if (var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183;
                  var8 = field2171;
                  if (var6 >= 0 && var7 >= 0 && var6 - (this.field2182 << 12) < 0 && var7 - (this.field2161 << 12) < 0) {
                     for(; var8 < 0; ++var8) {
                        var9 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var10 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var10] = this.field8381[var9];
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9++];
                              var12 = (var11 & 16711680) * field2181 & -16777216;
                              var13 = (var11 & '\uff00') * field2190 & 16711680;
                              var14 = (var11 & 255) * field2191 & '\uff00';
                              var3[var10] = (var12 | var13 | var14) >>> 8;
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9++];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              var12 = (var11 & 16711935) * field2187 & -16711936;
                              var13 = (var11 & '\uff00') * field2187 & 16711680;
                              var3[var10] = ((var12 | var13) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var3[var10] = var11;
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var12 = field2186 >>> 24;
                                    var13 = 256 - var12;
                                    var14 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var11 & '\uff00') * var12 + (var14 & '\uff00') * var13 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var11 = (var12 | var13 | var14) >>> 8;
                                    var15 = var3[var10];
                                    var3[var10] = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var12 = (var11 & 16711680) * field2181 & -16777216;
                                    var13 = (var11 & '\uff00') * field2190 & 16711680;
                                    var14 = (var11 & 255) * field2191 & '\uff00';
                                    var3[var10] = (var12 | var13 | var14) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var15 = var13 - var15 | var15 - (var15 >>> 8);
                              if (var11 == 0 && field2187 != 255) {
                                 var11 = var15;
                                 var15 = var3[var10];
                                 var15 = ((var11 & 16711935) * field2187 + (var15 & 16711935) * field2188 & -16711936) + ((var11 & '\uff00') * field2187 + (var15 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var10] = var15;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var3[var10++] = ((var12 | var13) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = var3[var10];
                                 var13 = var11 + var12;
                                 var14 = (var11 & 16711935) + (var12 & 16711935);
                                 var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                                 var3[var10] = var13 - var12 | var12 - (var12 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711680) * field2181 & -16777216;
                                 var13 = (var11 & '\uff00') * field2190 & 16711680;
                                 var14 = (var11 & 255) * field2191 & '\uff00';
                                 var11 = (var12 | var13 | var14) >>> 8;
                                 var15 = var3[var10];
                                 var16 = var11 + var15;
                                 var17 = (var11 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var10] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var11 = this.field8381[var9];
                              var12 = field2186;
                              var13 = var11 + var12;
                              var14 = (var11 & 16711935) + (var12 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var11 = var13 - var15 | var15 - (var15 >>> 8);
                              var15 = var3[var10];
                              var13 = var11 + var15;
                              var14 = (var11 & 16711935) + (var15 & 16711935);
                              var15 = (var14 & 16777472) + (var13 - var14 & 65536);
                              var3[var10] = var13 - var15 | var15 - (var15 >>> 8);
                           } else if (var1 == 2) {
                              var11 = this.field8381[var9];
                              if (var11 != 0) {
                                 var12 = (var11 & 16711935) * field2187 & -16711936;
                                 var13 = (var11 & '\uff00') * field2187 & 16711680;
                                 var11 = ((var12 | var13) >>> 8) + field2194;
                                 var14 = var3[var10];
                                 var15 = var11 + var14;
                                 var16 = (var11 & 16711935) + (var14 & 16711935);
                                 var14 = (var16 & 16777472) + (var15 - var16 & 65536);
                                 var3[var10] = var15 - var14 | var14 - (var14 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var4;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                        var9 = (field2163 - var9) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var7 - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if (var6 >= 0 && var6 - (this.field2182 << 12) < 0) {
                     if (var7 < 0) {
                        var9 = (field2163 - 1 - var7) / field2163;
                        var8 += var9;
                        var7 += field2163 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var7 += field2163;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183;
                  var8 = field2171;
                  if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                     if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                        var9 = (field2176 - var9) / field2176;
                        var8 += var9;
                        var6 += field2176 * var9;
                        var5 += var9;
                     }

                     if ((var9 = (var6 - field2176) / field2176) > var8) {
                        var8 = var9;
                     }

                     while(var8 < 0) {
                        var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                        var11 = var5++;
                        if (var2 == 0) {
                           if (var1 == 1) {
                              var3[var11] = this.field8381[var10];
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10++];
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10++];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11] = ((var13 | var14) >>> 8) + field2194;
                           }
                        } else if (var2 == 1) {
                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var3[var11] = var12;
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 if ((field2186 & 16777215) == 16777215) {
                                    var13 = field2186 >>> 24;
                                    var14 = 256 - var13;
                                    var15 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                                 } else if (field2187 != 255) {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var12 = (var13 | var14 | var15) >>> 8;
                                    var16 = var3[var11];
                                    var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                                 } else {
                                    var13 = (var12 & 16711680) * field2181 & -16777216;
                                    var14 = (var12 & '\uff00') * field2190 & 16711680;
                                    var15 = (var12 & 255) * field2191 & '\uff00';
                                    var3[var11] = (var13 | var14 | var15) >>> 8;
                                 }
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var16 = var14 - var16 | var16 - (var16 >>> 8);
                              if (var12 == 0 && field2187 != 255) {
                                 var12 = var16;
                                 var16 = var3[var11];
                                 var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              }

                              var3[var11] = var16;
                           } else {
                              if (var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                              }
                           }
                        } else {
                           if (var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if (var1 == 1) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = var3[var11];
                                 var14 = var12 + var13;
                                 var15 = (var12 & 16711935) + (var13 & 16711935);
                                 var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                                 var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                              }
                           } else if (var1 == 0) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var17 = var12 + var16;
                                 var18 = (var12 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if (var1 == 3) {
                              var12 = this.field8381[var10];
                              var13 = field2186;
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var12 = var14 - var16 | var16 - (var16 >>> 8);
                              var16 = var3[var11];
                              var14 = var12 + var16;
                              var15 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                           } else if (var1 == 2) {
                              var12 = this.field8381[var10];
                              if (var12 != 0) {
                                 var13 = (var12 & 16711935) * field2187 & -16711936;
                                 var14 = (var12 & '\uff00') * field2187 & 16711680;
                                 var12 = ((var13 | var14) >>> 8) + field2194;
                                 var15 = var3[var11];
                                 var16 = var12 + var15;
                                 var17 = (var12 & 16711935) + (var15 & 16711935);
                                 var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                                 var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                              }
                           }
                        }

                        var6 += field2176;
                        ++var8;
                     }
                  }

                  ++var4;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                     var9 = (field2163 - var9) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var7 - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var4 = field2173; var4 < 0; field2175 += field2192) {
                  var5 = field2175;
                  var6 = field2160 + field2184;
                  var7 = field2183 + field2185;
                  var8 = field2171;
                  if ((var9 = var6 - (this.field2182 << 12)) >= 0) {
                     var9 = (field2176 - var9) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (var6 - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  if (var7 < 0) {
                     var9 = (field2163 - 1 - var7) / field2163;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var7 += field2163 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     var7 += field2163;
                     ++var8;
                  }

                  ++var4;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var4 = field2173; var4 < 0; field2175 += field2192) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183;
               var8 = field2171;
               if (var7 >= 0 && var7 - (this.field2161 << 12) < 0) {
                  if (var6 < 0) {
                     var9 = (field2176 - 1 - var6) / field2176;
                     var8 += var9;
                     var6 += field2176 * var9;
                     var5 += var9;
                  }

                  if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                     var8 = var9;
                  }

                  while(var8 < 0) {
                     var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                     var11 = var5++;
                     if (var2 == 0) {
                        if (var1 == 1) {
                           var3[var11] = this.field8381[var10];
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10++];
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var3[var11] = (var13 | var14 | var15) >>> 8;
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10++];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11] = ((var13 | var14) >>> 8) + field2194;
                        }
                     } else if (var2 == 1) {
                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var3[var11] = var12;
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              if ((field2186 & 16777215) == 16777215) {
                                 var13 = field2186 >>> 24;
                                 var14 = 256 - var13;
                                 var15 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                              } else if (field2187 != 255) {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var12 = (var13 | var14 | var15) >>> 8;
                                 var16 = var3[var11];
                                 var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                              } else {
                                 var13 = (var12 & 16711680) * field2181 & -16777216;
                                 var14 = (var12 & '\uff00') * field2190 & 16711680;
                                 var15 = (var12 & 255) * field2191 & '\uff00';
                                 var3[var11] = (var13 | var14 | var15) >>> 8;
                              }
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var16 = var14 - var16 | var16 - (var16 >>> 8);
                           if (var12 == 0 && field2187 != 255) {
                              var12 = var16;
                              var16 = var3[var11];
                              var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           }

                           var3[var11] = var16;
                        } else {
                           if (var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                           }
                        }
                     } else {
                        if (var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if (var1 == 1) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = var3[var11];
                              var14 = var12 + var13;
                              var15 = (var12 & 16711935) + (var13 & 16711935);
                              var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                              var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                           }
                        } else if (var1 == 0) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var17 = var12 + var16;
                              var18 = (var12 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if (var1 == 3) {
                           var12 = this.field8381[var10];
                           var13 = field2186;
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var12 = var14 - var16 | var16 - (var16 >>> 8);
                           var16 = var3[var11];
                           var14 = var12 + var16;
                           var15 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                        } else if (var1 == 2) {
                           var12 = this.field8381[var10];
                           if (var12 != 0) {
                              var13 = (var12 & 16711935) * field2187 & -16711936;
                              var14 = (var12 & '\uff00') * field2187 & 16711680;
                              var12 = ((var13 | var14) >>> 8) + field2194;
                              var15 = var3[var11];
                              var16 = var12 + var15;
                              var17 = (var12 & 16711935) + (var15 & 16711935);
                              var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                              var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                           }
                        }
                     }

                     var6 += field2176;
                     ++var8;
                  }
               }

               ++var4;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if ((var9 = var7 - (this.field2161 << 12)) >= 0) {
                  var9 = (field2163 - var9) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (var7 - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         } else {
            for(var4 = field2173; var4 < 0; ++var4) {
               var5 = field2175;
               var6 = field2160 + field2184;
               var7 = field2183 + field2185;
               var8 = field2171;
               if (var6 < 0) {
                  var9 = (field2176 - 1 - var6) / field2176;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var6 - (this.field2182 << 12) - field2176) / field2176) > var8) {
                  var8 = var9;
               }

               if (var7 < 0) {
                  var9 = (field2163 - 1 - var7) / field2163;
                  var8 += var9;
                  var6 += field2176 * var9;
                  var7 += field2163 * var9;
                  var5 += var9;
               }

               if ((var9 = (1 + var7 - (this.field2161 << 12) - field2163) / field2163) > var8) {
                  var8 = var9;
               }

               while(var8 < 0) {
                  var10 = (var7 >> 12) * this.field2182 + (var6 >> 12);
                  var11 = var5++;
                  if (var2 == 0) {
                     if (var1 == 1) {
                        var3[var11] = this.field8381[var10];
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10++];
                        var13 = (var12 & 16711680) * field2181 & -16777216;
                        var14 = (var12 & '\uff00') * field2190 & 16711680;
                        var15 = (var12 & 255) * field2191 & '\uff00';
                        var3[var11] = (var13 | var14 | var15) >>> 8;
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10++];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        var13 = (var12 & 16711935) * field2187 & -16711936;
                        var14 = (var12 & '\uff00') * field2187 & 16711680;
                        var3[var11] = ((var13 | var14) >>> 8) + field2194;
                     }
                  } else if (var2 == 1) {
                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var3[var11] = var12;
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           if ((field2186 & 16777215) == 16777215) {
                              var13 = field2186 >>> 24;
                              var14 = 256 - var13;
                              var15 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var12 & '\uff00') * var13 + (var15 & '\uff00') * var14 & 16711680) >> 8;
                           } else if (field2187 != 255) {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var12 = (var13 | var14 | var15) >>> 8;
                              var16 = var3[var11];
                              var3[var11] = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                           } else {
                              var13 = (var12 & 16711680) * field2181 & -16777216;
                              var14 = (var12 & '\uff00') * field2190 & 16711680;
                              var15 = (var12 & 255) * field2191 & '\uff00';
                              var3[var11] = (var13 | var14 | var15) >>> 8;
                           }
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var16 = var14 - var16 | var16 - (var16 >>> 8);
                        if (var12 == 0 && field2187 != 255) {
                           var12 = var16;
                           var16 = var3[var11];
                           var16 = ((var12 & 16711935) * field2187 + (var16 & 16711935) * field2188 & -16711936) + ((var12 & '\uff00') * field2187 + (var16 & '\uff00') * field2188 & 16711680) >> 8;
                        }

                        var3[var11] = var16;
                     } else {
                        if (var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var3[var11++] = ((var13 | var14) >>> 8) + field2194;
                        }
                     }
                  } else {
                     if (var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var1 == 1) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = var3[var11];
                           var14 = var12 + var13;
                           var15 = (var12 & 16711935) + (var13 & 16711935);
                           var13 = (var15 & 16777472) + (var14 - var15 & 65536);
                           var3[var11] = var14 - var13 | var13 - (var13 >>> 8);
                        }
                     } else if (var1 == 0) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711680) * field2181 & -16777216;
                           var14 = (var12 & '\uff00') * field2190 & 16711680;
                           var15 = (var12 & 255) * field2191 & '\uff00';
                           var12 = (var13 | var14 | var15) >>> 8;
                           var16 = var3[var11];
                           var17 = var12 + var16;
                           var18 = (var12 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if (var1 == 3) {
                        var12 = this.field8381[var10];
                        var13 = field2186;
                        var14 = var12 + var13;
                        var15 = (var12 & 16711935) + (var13 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var12 = var14 - var16 | var16 - (var16 >>> 8);
                        var16 = var3[var11];
                        var14 = var12 + var16;
                        var15 = (var12 & 16711935) + (var16 & 16711935);
                        var16 = (var15 & 16777472) + (var14 - var15 & 65536);
                        var3[var11] = var14 - var16 | var16 - (var16 >>> 8);
                     } else if (var1 == 2) {
                        var12 = this.field8381[var10];
                        if (var12 != 0) {
                           var13 = (var12 & 16711935) * field2187 & -16711936;
                           var14 = (var12 & '\uff00') * field2187 & 16711680;
                           var12 = ((var13 | var14) >>> 8) + field2194;
                           var15 = var3[var11];
                           var16 = var12 + var15;
                           var17 = (var12 & 16711935) + (var15 & 16711935);
                           var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                           var3[var11] = var16 - var15 | var15 - (var15 >>> 8);
                        }
                     }
                  }

                  var6 += field2176;
                  var7 += field2163;
                  ++var8;
               }

               field2160 += field2177;
               field2183 += field2179;
               field2175 += field2192;
            }
         }
      }

   }

   void method1474(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.field2178.field7914;
      if (var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183;
                     var11 = field2171;
                     if (var9 >= 0 && var10 >= 0 && var9 - (this.field2182 << 12) < 0 && var10 - (this.field2161 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - field2175);
                        if (var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += field2176 * var14;
                           var10 += field2163 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if (var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var15 != 0) {
                              var5[var8++] = var15;
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                           var12 = (field2163 - var12) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var10 - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if (var10 < 0) {
                           var12 = (field2163 - 1 - var10) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183;
                     var11 = field2171;
                     if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                        if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                           var12 = (field2176 - var12) / field2176;
                           var11 += var12;
                           var9 += field2176 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var9 - field2176) / field2176) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var9 += field2176;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                        var12 = (field2163 - var12) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var10 - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if (var10 < 0) {
                        var12 = (field2163 - 1 - var10) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183;
                  var11 = field2171;
                  if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                     if (var9 < 0) {
                        var12 = (field2176 - 1 - var9) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        ++var11;
                     }
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                     var12 = (field2163 - var12) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (var10 - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if (var10 < 0) {
                     var12 = (field2163 - 1 - var10) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         }
      }

   }

   void method1475(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.field2178.field7914;
      if (var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if (field2176 == 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183;
                     var11 = field2171;
                     if (var9 >= 0 && var10 >= 0 && var9 - (this.field2182 << 12) < 0 && var10 - (this.field2161 << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - field2175);
                        if (var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += field2176 * var14;
                           var10 += field2163 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if (var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var15 != 0) {
                              var5[var8++] = var15;
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                           var12 = (field2163 - var12) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var10 - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if (var9 >= 0 && var9 - (this.field2182 << 12) < 0) {
                        if (var10 < 0) {
                           var12 = (field2163 - 1 - var10) / field2163;
                           var11 += var12;
                           var10 += field2163 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var10 += field2163;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2160 += field2177;
               }
            }
         } else if (field2176 < 0) {
            if (field2163 == 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183;
                     var11 = field2171;
                     if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                        if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                           var12 = (field2176 - var12) / field2176;
                           var11 += var12;
                           var9 += field2176 * var12;
                           var8 += var12;
                        }

                        if ((var12 = (var9 - field2176) / field2176) > var11) {
                           var11 = var12;
                        }

                        var13 = var1[var7] - var3;
                        var14 = -var2[var7];
                        var15 = var13 - (var8 - field2175);
                        if (var15 > 0) {
                           var8 += var15;
                           var11 += var15;
                           var9 += field2176 * var15;
                           var10 += field2163 * var15;
                        } else {
                           var14 -= var15;
                        }

                        if (var11 < var14) {
                           var11 = var14;
                        }

                        while(var11 < 0) {
                           var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                           if (var16 != 0) {
                              var5[var8++] = var16;
                           } else {
                              ++var8;
                           }

                           var9 += field2176;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  field2183 += field2179;
               }
            } else if (field2163 < 0) {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                        var12 = (field2163 - var12) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var10 - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            } else {
               for(var6 = field2173; var6 < 0; field2175 += field2192) {
                  var7 = var6 + var4;
                  if (var7 >= 0) {
                     if (var7 >= var1.length) {
                        break;
                     }

                     var8 = field2175;
                     var9 = field2160 + field2184;
                     var10 = field2183 + field2185;
                     var11 = field2171;
                     if ((var12 = var9 - (this.field2182 << 12)) >= 0) {
                        var12 = (field2176 - var12) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (var9 - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     if (var10 < 0) {
                        var12 = (field2163 - 1 - var10) / field2163;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var10 += field2163 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        var10 += field2163;
                        ++var11;
                     }
                  }

                  ++var6;
                  field2160 += field2177;
                  field2183 += field2179;
               }
            }
         } else if (field2163 == 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183;
                  var11 = field2171;
                  if (var10 >= 0 && var10 - (this.field2161 << 12) < 0) {
                     if (var9 < 0) {
                        var12 = (field2176 - 1 - var9) / field2176;
                        var11 += var12;
                        var9 += field2176 * var12;
                        var8 += var12;
                     }

                     if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                        var11 = var12;
                     }

                     var13 = var1[var7] - var3;
                     var14 = -var2[var7];
                     var15 = var13 - (var8 - field2175);
                     if (var15 > 0) {
                        var8 += var15;
                        var11 += var15;
                        var9 += field2176 * var15;
                        var10 += field2163 * var15;
                     } else {
                        var14 -= var15;
                     }

                     if (var11 < var14) {
                        var11 = var14;
                     }

                     while(var11 < 0) {
                        var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                        if (var16 != 0) {
                           var5[var8++] = var16;
                        } else {
                           ++var8;
                        }

                        var9 += field2176;
                        ++var11;
                     }
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else if (field2163 < 0) {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if ((var12 = var10 - (this.field2161 << 12)) >= 0) {
                     var12 = (field2163 - var12) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (var10 - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         } else {
            for(var6 = field2173; var6 < 0; field2175 += field2192) {
               var7 = var6 + var4;
               if (var7 >= 0) {
                  if (var7 >= var1.length) {
                     break;
                  }

                  var8 = field2175;
                  var9 = field2160 + field2184;
                  var10 = field2183 + field2185;
                  var11 = field2171;
                  if (var9 < 0) {
                     var12 = (field2176 - 1 - var9) / field2176;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var9 - (this.field2182 << 12) - field2176) / field2176) > var11) {
                     var11 = var12;
                  }

                  if (var10 < 0) {
                     var12 = (field2163 - 1 - var10) / field2163;
                     var11 += var12;
                     var9 += field2176 * var12;
                     var10 += field2163 * var12;
                     var8 += var12;
                  }

                  if ((var12 = (1 + var10 - (this.field2161 << 12) - field2163) / field2163) > var11) {
                     var11 = var12;
                  }

                  var13 = var1[var7] - var3;
                  var14 = -var2[var7];
                  var15 = var13 - (var8 - field2175);
                  if (var15 > 0) {
                     var8 += var15;
                     var11 += var15;
                     var9 += field2176 * var15;
                     var10 += field2163 * var15;
                  } else {
                     var14 -= var15;
                  }

                  if (var11 < var14) {
                     var11 = var14;
                  }

                  while(var11 < 0) {
                     var16 = this.field8381[(var10 >> 12) * this.field2182 + (var9 >> 12)];
                     if (var16 != 0) {
                        var5[var8++] = var16;
                     } else {
                        ++var8;
                     }

                     var9 += field2176;
                     var10 += field2163;
                     ++var11;
                  }
               }

               ++var6;
               field2160 += field2177;
               field2183 += field2179;
            }
         }
      }

   }

   public void method3107(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.field2178.field7914;
      if (var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.field2182 + var1;
            int var10 = (var6 + var8) * this.field2178.field7918 * 692106883 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.field8381[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   public void method3148(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.field2178.field7914;
      if (var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.field2182 + var1;
            int var10 = (var6 + var8) * this.field2178.field7918 * 692106883 + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.field8381[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   public void method3131(int var1, int var2, int var3, int var4, int var5) {
      if (this.field2178.method4444()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.field2178.field7914;
         if (var6 != null) {
            int var7 = this.field2178.field7918 * 692106883;
            var1 += this.field2162;
            var2 += this.field2172;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.field2161;
            int var11 = this.field2182;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if (var2 < this.field2178.field7923 * -1278653805) {
               var14 = this.field2178.field7923 * -1278653805 - var2;
               var10 -= var14;
               var2 = this.field2178.field7923 * -1278653805;
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if (var2 + var10 > this.field2178.field7924 * 63686679) {
               var10 -= var2 + var10 - this.field2178.field7924 * 63686679;
            }

            if (var1 < this.field2178.field7921 * -912871679) {
               var14 = this.field2178.field7921 * -912871679 - var1;
               var11 -= var14;
               var1 = this.field2178.field7921 * -912871679;
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if (var1 + var11 > this.field2178.field7938 * -1416794725) {
               var14 = var1 + var11 - this.field2178.field7938 * -1416794725;
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if (var11 > 0 && var10 > 0) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var5 == 0) {
                  if (var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                           var6[var8++] = this.field8381[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.field8381[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.field8381[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if (var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.field8381[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if (var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.field8381[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var24;
                  int var25;
                  if (var5 == 1) {
                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        if ((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.field8381[var9++];
                                 if (var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.field8381[var9++];
                                 if (var21 != 0) {
                                    if (var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if (var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.field8381[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if (var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if (var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if (var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              if (var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.field8381[var9++];
                              if (var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if (var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.field8381[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if (var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.field8381[var9++];
                              if (var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
