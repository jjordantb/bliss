public abstract class class352 {
   static int field1931 = 34;
   static int field1932 = 1;
   static int field1933 = 2;
   static int field1934 = 3;
   static int field1935 = 64;
   static int field1936 = 5;
   static int field1937 = 6;
   static int field1938 = 7;
   static int field1939 = 38;
   static int field1940 = 9;
   static int field1941 = 65;
   static int field1942 = 11;
   static int field1943 = 12;
   static int field1944 = 68;
   static int field1945 = 13;
   static int field1946 = 18;
   static int field1947 = 19;
   static int field1948 = 20;
   static int field1949 = 100;
   static int field1950 = 22;
   public static int field1951 = 84;
   static int field1952 = 24;
   static int field1953 = 25;
   static int field1954 = 26;
   static int field1955 = 27;
   static int field1956 = 71;
   static int field1957 = 33;
   static int field1958 = 55;
   static int field1959 = 32;
   static int field1960 = 90;
   static int field1961 = 37;
   public static int field1962 = 101;
   public static int field1963 = 86;
   static int field1964 = 40;
   static int field1965 = 41;
   static int field1966 = 42;
   static int field1967 = 43;
   static int field1968 = 48;
   static int field1969 = 49;
   static int field1970 = 50;
   static int field1971 = 74;
   static int field1972 = 52;
   static int field1973 = 53;
   static int field1974 = 10;
   static int field1975 = 4;
   static int field1976 = 56;
   static int field1977 = 57;
   static int field1978 = 58;
   static int field1979 = 39;
   static int field1980 = 54;
   static int field1981 = 8;
   public static int field1982 = 67;
   static int field1983 = 17;
   static int field1984 = 35;
   static int field1985 = 70;
   static int field1986 = 69;
   static int field1987 = 98;
   static int field1988 = 73;
   public static int field1989 = 80;
   public static int field1990 = 81;
   public static int field1991 = 82;
   static int field1992 = 83;
   static int field1993 = 23;
   public static int field1994 = 85;
   static int field1995 = 51;
   static int field1996 = 59;
   static int field1997 = 36;
   static int field1998 = 28;
   static int field1999 = 87;
   static int field2000 = 88;
   static int field2001 = 89;
   static int field2002 = 21;
   static int field2003 = 91;
   public static int field2004 = 96;
   public static int field2005 = 97;
   public static int field2006 = 66;
   static int field2007 = 99;
   static int field2008 = 16;
   static int field2009 = 72;
   public static int field2010 = 102;
   public static int field2011 = 103;
   public static int field2012 = 104;
   public static int field2013 = 105;

   public abstract boolean method1392(int var1, int var2);

   public abstract class742 method1393(byte var1);

   public abstract void method1394(int var1);

   public abstract void method1398(int var1);

   static final void method1402(class744 var0, int var1) {
      try {
         int var2 = class488.field8421;
         int var3 = class849.field8567;
         int var4 = -1;
         if (class53.field2311) {
            class125[] var5 = class528.method2244((byte)-2);

            for(int var6 = 0; var6 < var5.length; ++var6) {
               class125 var7 = var5[var6];
               if (var2 == var7.field2325 && var7.field2327 == var3) {
                  var4 = var6;
                  break;
               }
            }
         }

         var0.field3161[++var0.field3156 - 1] = var4;
      } catch (RuntimeException var8) {
         throw class158.method3445(var8, "nl.aeu(" + ')');
      }
   }

   static final void method1403(Widget var0, WidgetContainer var1, class744 var2, int var3) {
      try {
         if (4 == var0.field869) {
            class912.method6480(var0, var1, var2, (short)8629);
         }

      } catch (RuntimeException var5) {
         throw class158.method3445(var5, "nl.gx(" + ')');
      }
   }

   static void method1404(class848 var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         var0.method4833(var1, var2, var3, var4, var5, (byte)7);
         var0.method4833(1 + var1, 1 + var2, var3 - 2, 16, var6, (byte)7);
         var0.method4832(1 + var1, 18 + var2, var3 - 2, var4 - 19, var6, -1588493317);
      } catch (RuntimeException var9) {
         throw class158.method3445(var9, "nl.aq(" + ')');
      }
   }

   static final void method1405(class744 var0, byte var1) {
      try {
         String var2 = (String)var0.field3157[--var0.field3158];
         var0.field3156 -= 2;
         int var3 = var0.field3161[var0.field3156];
         int var4 = var0.field3161[var0.field3156 + 1];
         class230 var5 = class398.method3539(class526.field3666, var4, 0, (byte)49);
         var0.field3161[++var0.field3156 - 1] = var5.method4600(var2, var3, class324.field621, -1274509130);
      } catch (RuntimeException var6) {
         throw class158.method3445(var6, "nl.zn(" + ')');
      }
   }
}
