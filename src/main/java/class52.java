import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import sun.net.www.protocol.http.AuthenticationInfo;

public class class52 extends class253 {
   ProxySelector field2305 = ProxySelector.getDefault();
   static String field2306 = "java.net.useSystemProxies";

   Socket method1523(String var1, int var2, String var3, int var4) throws IOException {
      try {
         Socket var5 = new Socket(var1, var2);
         var5.setSoTimeout(10000);
         OutputStream var6 = var5.getOutputStream();
         if (var3 == null) {
            var6.write(("CONNECT " + this.field7969 + ":" + 98195689 * this.field7968 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
         } else {
            var6.write(("CONNECT " + this.field7969 + ":" + this.field7968 * 98195689 + " HTTP/1.0\n" + var3 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
         }

         var6.flush();
         BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         String var8 = var7.readLine();
         if (var8 != null) {
            label59: {
               if (!var8.startsWith("HTTP/1.0 200") && !var8.startsWith("HTTP/1.1 200")) {
                  if (!var8.startsWith("HTTP/1.0 407") && !var8.startsWith("HTTP/1.1 407")) {
                     break label59;
                  }

                  int var9 = 0;
                  String var10 = "proxy-authenticate: ";

                  for(var8 = var7.readLine(); var8 != null && var9 < 50; ++var9) {
                     if (var8.toLowerCase().startsWith(var10)) {
                        var8 = var8.substring(var10.length()).trim();
                        int var11 = var8.indexOf(32);
                        if (-1 != var11) {
                           var8 = var8.substring(0, var11);
                        }

                        throw new class802(var8);
                     }

                     var8 = var7.readLine();
                  }

                  throw new class802("");
               }

               return var5;
            }
         }

         var6.close();
         var7.close();
         var5.close();
         return null;
      } catch (RuntimeException var12) {
         throw class158.method3445(var12, "aes.q(" + ')');
      }
   }

   Socket method1524(Proxy var1, int var2) throws IOException {
      try {
         if (var1.type() == Type.DIRECT) {
            return this.method4477(-1908230977);
         } else {
            SocketAddress var3 = var1.address();
            if (!(var3 instanceof InetSocketAddress)) {
               return null;
            } else {
               InetSocketAddress var4 = (InetSocketAddress)var3;
               if (var1.type() == Type.HTTP) {
                  String var16 = null;

                  try {
                     Class var6 = AuthenticationInfo.class;
                     Method var7 = var6.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
                     var7.setAccessible(true);
                     Object var8 = var7.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                     if (var8 != null) {
                        Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
                        var9.setAccessible(true);
                        if (((Boolean)var9.invoke(var8)).booleanValue()) {
                           Method var10 = var6.getDeclaredMethod("getHeaderName");
                           var10.setAccessible(true);
                           Method var11 = var6.getDeclaredMethod("getHeaderValue", URL.class, String.class);
                           var11.setAccessible(true);
                           String var12 = (String)var10.invoke(var8);
                           String var13 = (String)var11.invoke(var8, new URL("https://" + this.field7969 + "/"), "https");
                           var16 = var12 + ": " + var13;
                        }
                     }
                  } catch (Exception var14) {
                     ;
                  }

                  return this.method1523(var4.getHostName(), var4.getPort(), var16, -1832604571);
               } else if (var1.type() == Type.SOCKS) {
                  Socket var5 = new Socket(var1);
                  var5.connect(new InetSocketAddress(this.field7969, 98195689 * this.field7968));
                  return var5;
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class158.method3445(var15, "aes.r(" + ')');
      }
   }

   public Socket method4479() throws IOException {
      boolean var1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
      if (!var1) {
         System.setProperty("java.net.useSystemProxies", "true");
      }

      boolean var2 = this.field7968 * 98195689 == 443;

      List var3;
      List var4;
      try {
         var3 = this.field2305.select(new URI((var2 ? "https" : "http") + "://" + this.field7969));
         var4 = this.field2305.select(new URI((var2 ? "http" : "https") + "://" + this.field7969));
      } catch (URISyntaxException var15) {
         return this.method4477(-1850943966);
      }

      var3.addAll(var4);
      Object[] var5 = var3.toArray();
      class802 var6 = null;
      Object[] var7 = var5;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         Object var9 = var7[var8];
         Proxy var10 = (Proxy)var9;

         try {
            Socket var11 = this.method1524(var10, 1862351535);
            if (var11 != null) {
               return var11;
            }
         } catch (class802 var13) {
            var6 = var13;
         } catch (IOException var14) {
            ;
         }
      }

      if (var6 != null) {
         throw var6;
      } else {
         return this.method4477(-1772806309);
      }
   }

   public Socket method4478(int var1) throws IOException {
      try {
         boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
         if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
         }

         boolean var3 = this.field7968 * 98195689 == 443;

         List var4;
         List var5;
         try {
            var4 = this.field2305.select(new URI((var3 ? "https" : "http") + "://" + this.field7969));
            var5 = this.field2305.select(new URI((var3 ? "http" : "https") + "://" + this.field7969));
         } catch (URISyntaxException var14) {
            return this.method4477(-1954406666);
         }

         var4.addAll(var5);
         Object[] var6 = var4.toArray();
         class802 var7 = null;
         Object[] var8 = var6;

         for(int var9 = 0; var9 < var8.length; ++var9) {
            Object var10 = var8[var9];
            Proxy var11 = (Proxy)var10;

            try {
               Socket var12 = this.method1524(var11, 2044557315);
               if (var12 != null) {
                  Socket var13 = var12;
                  return var13;
               }
            } catch (class802 var15) {
               var7 = var15;
            } catch (IOException var16) {
               ;
            }
         }

         if (var7 != null) {
            throw var7;
         } else {
            return this.method4477(-2133259279);
         }
      } catch (RuntimeException var17) {
         throw class158.method3445(var17, "aes.f(" + ')');
      }
   }
}
