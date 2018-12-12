package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {
   long peer;
   private Hashtable a;
   private Thread f;
   private static Hashtable b = new Hashtable();
   public static int p = 5120;
   public static int i = 5121;
   public static int k = 5122;
   public static int d = 5123;
   public static int u = 5124;
   public static int x = 5125;
   public static int r = 5126;
   public static int q = 0;
   public static int n = 1;
   public static int s = 2;
   public static int z = 3;
   public static int y = 4;
   public static int t = 5;
   public static int h = 6;
   public static int v = 7;
   public static int g = 5888;
   public static int e = 5889;
   public static int c = 5890;
   public static int m = 2832;
   public static int w = 2834;
   public static int j = 6913;
   public static int o = 6914;
   public static int l = 1028;
   public static int ax = 1029;
   public static int aa = 2884;
   public static int ak = 4864;
   public static int ae = 515;
   public static int ao = 516;
   public static int ad = 2929;
   public static int av = 6402;
   public static int at = 2896;
   public static int ah = 16384;
   public static int ai = 16385;
   public static int al = 16386;
   public static int az = 4615;
   public static int as = 4616;
   public static int ap = 4617;
   public static int af = 4608;
   public static int aw = 4609;
   public static int ab = 4611;
   public static int aj = 5634;
   public static int ay = 2899;
   public static int aq = 1032;
   public static int ag = 7425;
   public static int an = 2903;
   public static int au = 260;
   public static int ar = 3008;
   public static int ac = 3042;
   public static int am = 0;
   public static int bd = 1;
   public static int bf = 768;
   public static int be = 769;
   public static int by = 770;
   public static int bm = 771;
   public static int bc = 774;
   public static int bx = 2912;
   public static int bo = 2917;
   public static int bb = 2914;
   public static int bl = 2918;
   public static int bu = 2915;
   public static int bw = 2916;
   public static int bk = 9729;
   public static int bq = 7681;
   public static int bg = 6406;
   public static int bs = 6409;
   public static int bp = 6410;
   public static int bv = 6144;
   public static int bh = 6407;
   public static int bn = 6408;
   public static int bi = 2982;
   public static int ba = 3156;
   public static int bt = 4353;
   public static int bj = 3089;
   public static int br = 3348;
   public static int bz = 3349;
   public static int cm = 3352;
   public static int cd = 3353;
   public static int cs = 3354;
   public static int cx = 3355;
   public static int cl = 3317;
   public static int cj = 3314;
   public static int co = 8960;
   public static int cw = 8704;
   public static int cv = 3552;
   public static int cy = 3553;
   public static int cz = 10242;
   public static int cg = 10243;
   public static int ck = 10240;
   public static int cn = 10241;
   public static int ch = 8705;
   public static int ct = 3168;
   public static int cc = 3169;
   public static int ca = 9472;
   public static int ci = 9984;
   public static int ce = 9987;
   public static int cb = 9217;
   public static int cr = 9473;
   public static int cu = 9216;
   public static int cp = 9474;
   public static int cq = 8448;
   public static int cf = 9728;
   public static int dh = 10497;
   public static int dg = 8192;
   public static int dl = 8193;
   public static int dq = 8194;
   public static int ds = 8195;
   public static int dp = 3170;
   public static int dd = 3171;
   public static int dx = 7936;
   public static int dc = 7937;
   public static int dk = 7938;
   private static int db = 7939;
   public static int dn = 256;
   public static int do1 = 1024;
   public static int da = 2048;
   public static int dm = 16384;
   public static int du = 32830;
   public static int dv = 32834;
   public static int di = 32852;
   public static int df = 32859;
   public static int dz = 32884;
   public static int dt = 32885;
   public static int dj = 32886;
   public static int dr = 32888;
   public static int de = 32879;
   public static int dy = 33639;
   public static int dw = 32993;
   public static int ee = 33071;
   public static int ef = 33984;
   public static int eu = 33985;
   public static int ew = 34018;
   public static int en = 32925;
   public static int et = 34065;
   public static int ev = 34066;
   public static int eg = 34067;
   public static int ex = 34069;
   public static int ek = 34070;
   public static int em = 34071;
   public static int ec = 34072;
   public static int eb = 34073;
   public static int ey = 34074;
   public static int ez = 34160;
   public static int el = 34161;
   public static int eq = 34162;
   public static int ep = 34176;
   public static int ei = 34178;
   public static int ej = 34184;
   public static int ed = 34186;
   public static int ea = 34192;
   public static int eh = 34200;
   public static int es = 34163;
   public static int eo = 34165;
   public static int er = 34023;
   public static int fy = 34166;
   public static int fb = 34167;
   public static int fh = 34168;
   public static int fn = 34479;
   public static int fg = 33189;
   public static int fa = 33190;
   public static int fo = 35001;
   public static int fi = 34929;
   public static int fv = 34930;
   public static int fm = 35632;
   public static int ff = 35633;
   public static int fd = 34336;
   public static int ft = 34379;
   public static int fu = 34933;
   public static int fl = 34820;
   public static int fs = 34962;
   public static int fr = 34963;
   public static int fz = 35040;
   public static int fc = 35044;
   public static int fw = 35713;
   public static int fk = 35714;
   public static int fe = 35716;
   public static int fj = 35633;
   public static int fp = 35632;
   public static int fq = 34037;
   public static int fx = 5131;
   public static int gt = 34836;
   public static int gc = 34837;
   public static int gl = 34838;
   public static int gq = 34840;
   public static int gp = 34841;
   public static int gn = 34842;
   public static int ge = 34843;
   public static int gm = 34844;
   public static int go = 34846;
   public static int gg = 34847;
   public static int gv = 33777;
   public static int gw = 33779;
   public static int gj = 36053;
   public static int gs = 36064;
   public static int gi = 36096;
   public static int gf = 36160;
   public static int gb = 36161;
   public static int gx = 36008;
   public static int gk = 36219;

   public native long init(Canvas var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public native boolean arePbuffersAvailable();

   public boolean a(String var1) {
      if (this.a == null) {
         this.a = new Hashtable();
         String var2 = glGetString(7939);
         int var3 = 0;

         while(true) {
            int var4 = var2.indexOf(32, var3);
            if (-1 == var4) {
               String var6 = var2.substring(var3).trim();
               if (var6.length() != 0) {
                  this.a.put(var6, var6);
               }
               break;
            }

            String var5 = var2.substring(var3, var4).trim();
            if (var5.length() != 0) {
               this.a.put(var5, var5);
            }

            var3 = var4 + 1;
         }
      }

      return this.a.containsKey(var1);
   }

   public synchronized boolean f() {
      Thread var1 = Thread.currentThread();
      if (this.attachPeer()) {
         OpenGL var2 = (OpenGL)b.put(var1, this);
         if (var2 != null) {
            var2.f = null;
         }

         this.f = var1;
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean b() {
      if (this.f != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         b.remove(this.f);
         this.f = null;
         return true;
      }
   }

   private native boolean attachPeer();

   private native void detachPeer();

   public native long prepareSurface(Canvas var1);

   public native void surfaceResized(long var1);

   public native void releaseSurface(Canvas var1, long var2);

   public native boolean setSurface(long var1);

   public native long createPbuffer(int var1, int var2);

   public native void releasePbuffer(long var1);

   public native void setPbuffer(long var1);

   public native void swapBuffers(long var1);

   public native void setSwapInterval(int var1);

   public native void release();

   public static native void glEnable(int var0);

   public static native void glDisable(int var0);

   public static native void glCullFace(int var0);

   public static native void glPushAttrib(int var0);

   public static native void glPopAttrib();

   public static native void glShadeModel(int var0);

   public static native void glHint(int var0, int var1);

   public static native void glFinish();

   public static native void glFlush();

   public static native void glClear(int var0);

   public static native void glClearColor(float var0, float var1, float var2, float var3);

   public static native void glClearDepth(float var0);

   public static native void glDepthFunc(int var0);

   public static native void glDepthMask(boolean var0);

   public static native void glDepthRange(float var0, float var1);

   public static native void glAlphaFunc(int var0, float var1);

   public static native void glColorMask(boolean var0, boolean var1, boolean var2, boolean var3);

   public static native void glReadBuffer(int var0);

   public static native void glDrawBuffer(int var0);

   public static native void glDrawBuffersARB(int var0, int[] var1, int var2);

   public static native void glMatrixMode(int var0);

   public static native void glPushMatrix();

   public static native void glPopMatrix();

   public static native void glLoadIdentity();

   public static native void glOrtho(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glFrustum(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glTranslatef(float var0, float var1, float var2);

   public static native void glRotatef(float var0, float var1, float var2, float var3);

   public static native void glScalef(float var0, float var1, float var2);

   public static native void glLoadMatrixf(float[] var0, int var1);

   public static native void glMultMatrixf(float[] var0, int var1);

   public static native void glViewport(int var0, int var1, int var2, int var3);

   public static native void glScissor(int var0, int var1, int var2, int var3);

   public static native int glGenLists(int var0);

   public static native void glDeleteLists(int var0, int var1);

   public static native void glNewList(int var0, int var1);

   public static native void glEndList();

   public static native void glCallList(int var0);

   public static native void glBegin(int var0);

   public static native void glVertex2i(int var0, int var1);

   public static native void glVertex2f(float var0, float var1);

   public static native void glVertex3f(float var0, float var1, float var2);

   public static native void glNormal3f(float var0, float var1, float var2);

   public static native void glColor3f(float var0, float var1, float var2);

   public static native void glColor4f(float var0, float var1, float var2, float var3);

   public static native void glColor3ub(byte var0, byte var1, byte var2);

   public static native void glColor4ub(byte var0, byte var1, byte var2, byte var3);

   public static native void glTexCoord2i(int var0, int var1);

   public static native void glTexCoord3i(int var0, int var1, int var2);

   public static native void glTexCoord2f(float var0, float var1);

   public static native void glTexCoord3f(float var0, float var1, float var2);

   public static native void glMultiTexCoord2i(int var0, int var1, int var2);

   public static native void glMultiTexCoord3i(int var0, int var1, int var2, int var3);

   public static native void glMultiTexCoord2f(int var0, float var1, float var2);

   public static native void glRasterPos2i(int var0, int var1);

   public static native void glEnd();

   public static native void glEnableClientState(int var0);

   public static native void glDisableClientState(int var0);

   public static native void glClientActiveTexture(int var0);

   public static native void glVertexPointer(int var0, int var1, int var2, long var3);

   public static native void glNormalPointer(int var0, int var1, long var2);

   public static native void glColorPointer(int var0, int var1, int var2, long var3);

   public static native void glTexCoordPointer(int var0, int var1, int var2, long var3);

   public static native void glVertexAttribPointer(int var0, int var1, int var2, boolean var3, int var4, long var5);

   public static native void glEnableVertexAttribArray(int var0);

   public static native void glDisableVertexAttribArray(int var0);

   public static native void glBindAttribLocation(int var0, int var1, String var2);

   public static native int glGetAttribLocation(int var0, String var1);

   public static native void glGenBuffersARB(int var0, int[] var1, int var2);

   public static native void glBindBufferARB(int var0, int var1);

   public static native void glBufferDataARBa(int var0, int var1, long var2, int var4);

   public static native void glBufferDataARBub(int var0, int var1, byte[] var2, int var3, int var4);

   public static native void glBufferSubDataARBa(int var0, int var1, int var2, long var3);

   public static native void glBufferSubDataARBub(int var0, int var1, int var2, byte[] var3, int var4);

   public static native long glMapBufferARB(int var0, int var1);

   public static native boolean glUnmapBufferARB(int var0);

   public static native void glDeleteBuffersARB(int var0, int[] var1, int var2);

   public static native void glLineWidth(float var0);

   public static native void glPointSize(float var0);

   public static native void glPolygonMode(int var0, int var1);

   public static native void glDrawArrays(int var0, int var1, int var2);

   public static native void glDrawElements(int var0, int var1, int var2, long var3);

   public static native void glGenTextures(int var0, int[] var1, int var2);

   public static native void glDeleteTextures(int var0, int[] var1, int var2);

   public static native void glActiveTexture(int var0);

   public static native void glBindTexture(int var0, int var1);

   public static native void glTexEnvi(int var0, int var1, int var2);

   public static native void glTexEnvf(int var0, int var1, float var2);

   public static native void glTexEnvfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexGeni(int var0, int var1, int var2);

   public static native void glTexGenfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexParameterf(int var0, int var1, float var2);

   public static native void glTexParameteri(int var0, int var1, int var2);

   public static native void glGetTexImagei(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glGetTexImageub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native float glGetTexLevelParameterfv(int var0, int var1, int var2);

   public static native int glGetTexLevelParameteriv(int var0, int var1, int var2);

   public static native void glGetTexImage(int var0, int var1, int var2, int var3, byte[] var4);

   public static native void glTexImage1Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glCopyTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glTexImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glTexSubImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexSubImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexSubImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glCopyTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public static native void glTexImage3Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte[] var9, int var10);

   public static native void glCompressedTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyPixels(int var0, int var1, int var2, int var3, int var4);

   public static native void glReadPixelsi(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7);

   public static native void glReadPixelsub(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7);

   public static native void glDrawPixelsi(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glDrawPixelsub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native void glPixelZoom(float var0, float var1);

   public static native void glPixelStorei(int var0, int var1);

   public static native void glPixelTransferf(int var0, float var1);

   public static native void glColorMaterial(int var0, int var1);

   public static native void glLightf(int var0, int var1, float var2);

   public static native void glLightfv(int var0, int var1, float[] var2, int var3);

   public static native void glLightModelfv(int var0, float[] var1, int var2);

   public static native void glMaterialfv(int var0, int var1, float[] var2, int var3);

   public static native void glFogi(int var0, int var1);

   public static native void glFogf(int var0, float var1);

   public static native void glFogfv(int var0, float[] var1, int var2);

   public static native void glBlendFunc(int var0, int var1);

   public static native void glBlendFuncSeparate(int var0, int var1, int var2, int var3);

   public static native void glBlendColor(float var0, float var1, float var2, float var3);

   public static native void glGenFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindFramebufferEXT(int var0, int var1);

   public static native void glFramebufferTexture2DEXT(int var0, int var1, int var2, int var3, int var4);

   public static native void glFramebufferTexture3DEXT(int var0, int var1, int var2, int var3, int var4, int var5);

   public static native void glFramebufferRenderbufferEXT(int var0, int var1, int var2, int var3);

   public static native int glCheckFramebufferStatusEXT(int var0);

   public static native void glBlitFramebufferEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   public static native void glGenerateMipmapEXT(int var0);

   public static native void glGenRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindRenderbufferEXT(int var0, int var1);

   public static native void glRenderbufferStorageEXT(int var0, int var1, int var2, int var3);

   public static native void glRenderbufferStorageMultisampleEXT(int var0, int var1, int var2, int var3, int var4);

   public static native int glGenProgramARB();

   public static native void glDeleteProgramARB(int var0);

   public static native void glBindProgramARB(int var0, int var1);

   public static native void glProgramStringARB(int var0, int var1, String var2);

   public static native void glProgramRawARB(int var0, int var1, byte[] var2);

   public static native void glProgramLocalParameter4fARB(int var0, int var1, float var2, float var3, float var4, float var5);

   public static native void glProgramLocalParameter4fvARB(int var0, int var1, float[] var2, int var3);

   public static native void glGetProgramivARB(int var0, int var1, int[] var2, int var3);

   public static native int glCreateProgram();

   public static native int glCreateShader(int var0);

   public static native void glDeleteProgram(int var0);

   public static native void glDeleteShader(int var0);

   public static native void glShaderSource(int var0, String var1);

   public static native void glCompileShader(int var0);

   public static native void glAttachShader(int var0, int var1);

   public static native void glDetachShader(int var0, int var1);

   public static native void glLinkProgram(int var0);

   public static native void glUseProgram(int var0);

   public static native int glGetUniformLocation(int var0, String var1);

   public static native void glUniform1i(int var0, int var1);

   public static native void glUniform1f(int var0, float var1);

   public static native void glUniform2f(int var0, float var1, float var2);

   public static native void glUniform3f(int var0, float var1, float var2, float var3);

   public static native void glUniform4f(int var0, float var1, float var2, float var3, float var4);

   public static native void glUniform1fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform2fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform3fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform4fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniformMatrix2fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix3fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix4fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glGetProgramiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetShaderiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetProgramInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native void glGetShaderInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native int glGetError();

   public static native String glGetString(int var0);

   public static native void glGetFloatv(int var0, float[] var1, int var2);

   public static native void glGetIntegerv(int var0, int[] var1, int var2);

   public static native void glStencilFunc(int var0, int var1, int var2);

   public static native void glStencilOp(int var0, int var1, int var2);
}
