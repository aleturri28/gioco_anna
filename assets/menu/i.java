package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:i.class */
public final class i {
    private static d a;
    private static d b;
    private static int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static b[] f152a;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f153a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f154b;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f155a;
    private static int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f157b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private StringBuffer[] f158a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private char[] f159a;
    private int v;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f160b;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static char[][][] f161a = {new char[]{new char[]{'0'}, new char[]{'1'}, new char[]{'A', 'B', 'C', '2'}, new char[]{'D', 'E', 'F', '3'}, new char[]{'G', 'H', 'I', '4'}, new char[]{'J', 'K', 'L', '5'}, new char[]{'M', 'N', 'O', '6'}, new char[]{'P', 'Q', 'R', 'S', '7'}, new char[]{'T', 'U', 'V', '8'}, new char[]{'W', 'X', 'Y', 'Z', '9'}}, new char[]{new char[]{'0'}, new char[]{'1'}, new char[]{'2'}, new char[]{'3'}, new char[]{'4'}, new char[]{'5'}, new char[]{'6'}, new char[]{'7'}, new char[]{'8'}, new char[]{'9'}}, new char[]{new char[]{'0'}, new char[]{'1'}, new char[]{'2'}, new char[]{'3'}, new char[]{'4'}, new char[]{'5'}, new char[]{'6'}, new char[]{'7'}, new char[]{'8'}, new char[]{'9'}}};
    private int A;
    private int B;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private d f162c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f163c;
    private int C;
    private int D;
    private int E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f164a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[] f165a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image f166a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b f167a;
    private int G;
    private int[] d;
    private int H;
    private int I;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f168c;
    private int J;
    private int K;
    private int L;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int[] f169e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private int[] f170f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private int[] f171g;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private int[] f172h;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private int[] f173i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private int[] f174j;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[][] f175a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private b[] f176b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[] f177b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String[][] f178a;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private int[] f179k;

    /* JADX INFO: renamed from: l, reason: collision with other field name */
    private int[] f180l;

    /* JADX INFO: renamed from: m, reason: collision with other field name */
    private int[] f181m;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private String[][] f182b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private Image[][] f183b;

    /* JADX INFO: renamed from: n, reason: collision with other field name */
    private int[] f184n;

    /* JADX INFO: renamed from: o, reason: collision with other field name */
    private int[] f185o;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private b[] f186c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static d f188d;
    private int M;
    private int N;
    private int O;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f156a = new int[2];
    private final int[] c = new int[2];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f187d = 16310828;

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v19, types: [javax.microedition.lcdui.Image[], javax.microedition.lcdui.Image[][]] */
    public final void a(int i, int i2, int i3) {
        if (f152a == null) {
            f152a = new b[]{j.m109b(720920), j.m109b(720923)};
            f152a[0].a(0, false);
            f152a[1].a(0, false);
        }
        this.f = i;
        this.f168c = -1;
        this.o = 0;
        n = 0;
        this.A = i3;
        this.p = 0;
        this.C = i3;
        this.f160b = false;
        this.f169e = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            this.f169e[i4] = -1;
        }
        this.f177b = new String[i2];
        this.f178a = new String[i2];
        this.f170f = new int[i2];
        this.f179k = new int[i2];
        this.f175a = new Image[i2];
        this.f176b = new b[i2];
        this.g = i2;
        this.F = 1;
        this.f163c = false;
        this.K = 1;
        this.c[0] = -1;
        this.c[1] = -1;
        a(b);
    }

    public final void a(int i, int i2) {
        this.c[i2] = i;
    }

    public final void a(String str, Image image, int i) {
        this.f163c = true;
        this.f164a = str;
        this.f166a = image;
        this.C = i;
    }

    public static void a() {
        n = 0;
    }

    public final void a(int i, int i2, String str, Image[] imageArr, int i3) {
        if (this.f169e[i] != -1) {
            a(i);
        }
        this.f169e[i] = i2;
        this.f170f[i] = i3;
        this.f175a[i] = imageArr;
        this.f177b[i] = str;
    }

    public final void a(int i, int i2, String str, b bVar, int i3) {
        a(i, i2, str, (Image[]) null, i3);
        this.f176b[i] = bVar;
    }

    public final void a(int i, int i2, String str, String str2, Image[] imageArr, int i3, int i4) {
        a(i, 3, str2, imageArr, i4);
        if (this.f157b == null) {
            this.f157b = new int[this.g];
            this.f158a = new StringBuffer[this.g];
        }
        if (this.f159a == null || i3 > this.f159a.length) {
            this.f159a = new char[i3];
        }
        this.f158a[i] = new StringBuffer(i3);
        switch (i2) {
            case 0:
                this.f157b[i] = 0;
                break;
            case 2:
                this.f157b[i] = 1;
                break;
            case 3:
                this.f157b[i] = 2;
                break;
        }
        if (str != null) {
            this.f158a[i].append(str);
        }
    }

    public final void a(int i, String str, b bVar, String[] strArr, b bVar2, int i2) {
        a(i, 5, str, bVar, i2);
        a(i, strArr, (Image[]) null, 0, Math.max(strArr != null ? strArr.length : 0, bVar2 != null ? bVar2.b() : 0));
        this.f186c[i] = bVar2;
    }

    public final void a(int i, String str, b bVar, int i2, int i3, int i4) {
        a(i, 4, str, bVar, i4);
        a(i, (String[]) null, (Image[]) null, i2, i3 + 1);
    }

    public final void a(int i) {
        if (this.f169e[i] != -1 && this.f168c == i) {
            this.f168c = m75b(i);
            if (this.f168c < i) {
                this.f168c = c(i);
            }
        }
        if (this.f175a != null) {
            this.f175a[i] = null;
        }
        if (this.f183b != null) {
            this.f183b[i] = null;
        }
        if (this.f176b != null) {
            this.f176b[i] = null;
        }
        if (this.f186c != null) {
            this.f186c[i] = null;
        }
        this.f178a[i] = null;
        this.f169e[i] = -1;
    }

    public final void b(int i, int i2) {
        this.f153a = i;
        this.f154b = i2;
        this.h = 6;
        this.j = i - 12;
        c();
        d();
        this.l = this.k / this.m;
        if (this.f168c == -1) {
            this.f168c = 0;
        }
        this.f168c = m75b(this.f168c);
        if (this.f168c != -1) {
            this.f168c = c(this.f168c);
        }
        this.o = 0;
        if (this.f168c != -1) {
            b(this.f168c);
        }
    }

    private void c() {
        if (!this.f163c) {
            this.G = 0;
            return;
        }
        int iE = 0;
        int iF = 0;
        if (this.f166a != null) {
            iE = this.f166a.getWidth() + 8;
            iF = this.f166a.getHeight();
        }
        if (this.f167a != null) {
            iE = this.f167a.e() + 8;
            iF = this.f167a.f();
        }
        this.I = iE;
        this.G = Math.max(e, iF) + 4;
        int i = iE;
        if (this.f164a != null) {
            this.f165a = new String[]{this.f164a};
        }
        if (this.f165a != null) {
            int iMax = 0;
            for (int i2 = 0; i2 < this.f165a.length; i2++) {
                iMax = Math.max(iMax, a.a(this.f165a[i2]));
            }
            this.H = Math.min(iMax, (this.f153a - i) - 8) + 8;
            i += this.H;
            this.f164a = null;
        }
        this.d = new int[]{(this.C & 1) != 0 ? (this.f153a - i) >> 1 : 0, 0, i, this.G};
    }

    private void d() {
        int iF = f152a[0].f() << 1;
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        boolean z2 = false;
        if (this.f == 0) {
            for (int i = 0; i < this.g; i++) {
                Image[] imageArr = this.f175a[i];
                if (imageArr != null) {
                    for (int i2 = 0; i2 < imageArr.length; i2++) {
                        if (imageArr[i2] != null) {
                            iMax = Math.max(iMax, imageArr[i2].getWidth() + 8);
                            iMax2 = Math.max(iMax2, imageArr[i2].getHeight() + 4);
                        }
                    }
                }
                b bVar = this.f176b[i];
                if (bVar != null) {
                    for (int i3 = 0; i3 < bVar.b(); i3++) {
                        bVar.a(i3, true);
                        iMax = Math.max(iMax, bVar.e() + 8);
                        iMax2 = Math.max(iMax2, bVar.f() + 4);
                    }
                }
                z |= this.f169e[i] == 3;
                z2 |= this.f169e[i] == 4 || this.f169e[i] == 5;
                if (this.f169e[i] == 5) {
                    Image[] imageArr2 = this.f183b[i];
                    if (imageArr2 != null) {
                        for (int i4 = 0; i4 < imageArr2.length; i4++) {
                            if (imageArr2[i4] != null) {
                                iMax2 = Math.max(iMax2, imageArr2[i4].getHeight() + 4);
                            }
                        }
                    }
                    b bVar2 = this.f186c[i];
                    if (bVar2 != null) {
                        for (int i5 = 0; i5 < bVar2.b(); i5++) {
                            bVar2.a(i5, true);
                            iMax2 = Math.max(iMax2, bVar2.f() + 4);
                        }
                    }
                }
            }
        }
        this.f171g = new int[this.g * 4];
        this.f174j = new int[this.g];
        this.f173i = new int[this.g];
        if (this.f != 0) {
            this.f172h = new int[this.g];
        }
        if (z2) {
            this.f181m = new int[this.g];
            this.f180l = new int[this.g];
        }
        this.m = Math.max(iMax2, this.B + 4);
        if (z) {
            this.u = this.B + 2 + 4 + 0;
            this.m += this.u;
        }
        e(iMax, iMax2);
        int i6 = this.f163c ? 0 : 0 + 4;
        for (int i7 = 0; i7 < this.g; i7++) {
            if ((this.A & 1) != 0) {
                this.f171g[(i7 * 4) + 0] = (this.j - this.f171g[(i7 * 4) + 2]) >> 1;
            }
        }
        this.i = this.G + i6;
        int iMin = Math.min((this.f154b - this.i) - 4, (h.a() - this.i) - h.c());
        int i8 = iMin - iF;
        boolean z3 = false;
        do {
            this.i = this.G + i6;
            if (z3) {
                this.i += iF >> 1;
                this.k = i8;
                this.r = this.f153a >> 1;
                this.s = this.i - (iF >> 1);
                this.t = this.i + this.k;
            } else {
                this.k = iMin;
            }
            if (this.f != 0) {
                this.i += 2;
                this.k -= 4;
                int i9 = this.B + 1;
                this.i += (this.k % i9) >> 1;
                this.k = (this.k / i9) * i9;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.g; i11++) {
                this.f171g[(i11 * 4) + 1] = i10;
                i10 += this.f171g[(i11 * 4) + 3];
                if (this.f != 0 && i10 != 0) {
                    i10 = (((i10 - 1) / (this.B + 1)) + 1) * (this.B + 1);
                }
            }
            if (this.g > 0) {
                this.q = this.f171g[((this.g - 1) * 4) + 1] + this.f171g[((this.g - 1) * 4) + 3];
            }
            if (z3) {
                z3 = false;
            } else if (this.q > this.k) {
                z3 = true;
            } else if (this.f == 0 && i8 / this.m >= 3) {
                z3 = true;
            } else if (this.f != 0 && i8 / (this.B + 1) >= 3) {
                z3 = true;
            }
        } while (z3);
    }

    private void e(int i, int i2) {
        int i3 = 0;
        while (i3 < this.g) {
            int iE = 0;
            int iF = 0;
            if (this.f == 0) {
                iE = i;
                iF = i2;
            } else {
                if (this.f175a[i3] != null) {
                    iE = this.f175a[i3][0].getWidth() + 8;
                    iF = this.f175a[i3][0].getHeight();
                }
                if (this.f176b[i3] != null) {
                    iE = this.f176b[i3].e() + 8;
                    iF = this.f176b[i3].f();
                }
            }
            this.f174j[i3] = iE;
            int i4 = 0;
            int iMax = iF;
            if (this.f169e[i3] == 5) {
                int iMax2 = 0;
                Image[] imageArr = this.f183b[i3];
                if (imageArr != null) {
                    for (int i5 = 0; i5 < imageArr.length; i5++) {
                        if (imageArr[i5] != null) {
                            iMax2 = Math.max(iMax2, imageArr[i5].getWidth() + 8);
                        }
                    }
                }
                b bVar = this.f186c[i3];
                if (bVar != null) {
                    for (int i6 = 0; i6 < bVar.b(); i6++) {
                        bVar.a(i6, true);
                        iMax2 = Math.max(iMax2, bVar.e() + 8);
                    }
                }
                this.f181m[i3] = iMax2;
                int iMax3 = 0;
                if (this.f182b[i3] != null) {
                    for (int i7 = 0; i7 < this.f182b[i3].length; i7++) {
                        String str = this.f182b[i3][i7];
                        if (str != null) {
                            iMax3 = Math.max(iMax3, this.f162c.a(str));
                        }
                    }
                    iMax3 += 8;
                }
                this.f180l[i3] = iMax3;
                i4 = 0 + iMax2 + iMax3;
            }
            if (this.f169e[i3] == 4) {
                int i8 = 6 + ((this.f185o[i3] - 2) * 7) + 8;
                this.f181m[i3] = i8;
                this.f180l[i3] = 0;
                i4 += i8;
            }
            int iE2 = 0;
            int iF2 = 0;
            if (this.f != 0) {
                if (this.f175a[i3] != null) {
                    iE2 = this.f175a[i3][0].getWidth() + 8;
                    iF2 = ((this.f175a[i3][0].getHeight() - 1) / (this.B + 1)) + 1;
                }
                if (this.f176b[i3] != null) {
                    iE2 = this.f176b[i3].e() + 8;
                    iF2 = ((this.f176b[i3].f() - 1) / (this.B + 1)) + 1;
                }
                this.f172h[i3] = iF2;
            }
            if (this.f == 0) {
                i4 += iE;
            }
            String[] strArrA = this.f178a[i3];
            if (this.f177b[i3] != null) {
                if (this.f == 0) {
                    strArrA = new String[]{this.f177b[i3]};
                } else {
                    int i9 = (this.j - 8) - i4;
                    f188d = this.f162c;
                    strArrA = a(this.f177b[i3], i9, iE2, iF2);
                }
            }
            if (strArrA != null) {
                int iMax4 = 0;
                for (int i10 = 0; i10 < strArrA.length; i10++) {
                    int iA = this.f162c.a(strArrA[i10]);
                    if (i10 < iF2) {
                        iA += iE2;
                    }
                    iMax4 = Math.max(iMax4, iA);
                }
                this.f173i[i3] = Math.min(iMax4, (this.j - i4) - 8) + 8;
                i4 += this.f173i[i3];
                iMax = Math.max(iMax, (i3 == -2 || this.f == 0) ? this.B + 4 : (this.B * strArrA.length) + (1 * strArrA.length));
                this.f177b[i3] = null;
                this.f178a[i3] = strArrA;
            } else if (this.f175a[i3] == null && this.f176b[i3] == null) {
                iMax = 0;
            }
            if (this.f != 0 && strArrA == null) {
                i4 += iE;
            }
            if (this.f169e[i3] == 5 || this.f169e[i3] == 4) {
                i4 = this.j;
            }
            if (this.f == 0 && iMax > 0) {
                iMax = this.m;
            }
            this.f171g[(i3 * 4) + 2] = i4;
            this.f171g[(i3 * 4) + 3] = iMax;
            i3++;
        }
    }

    public final void b() {
        f152a[0].b(1);
        f152a[1].b(1);
        h.m54b();
        if (this.f168c != -1 && this.f169e[this.f168c] == 3) {
            h.b(3, 0);
        } else if (this.c[0] != -1) {
            h.b(this.c[0], 0);
        }
        if (this.c[1] != -1) {
            h.b(this.c[1], 0);
        }
        if (this.f != 0) {
            this.o = 0;
        }
        this.E = 0;
        this.L = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m71a(int i) {
        j.a(f152a, i);
        if (this.w > 0) {
            this.w -= i;
        }
        this.z += i;
        if (n != 0 && this.q > this.k) {
            this.p += i;
            int i2 = (this.p * (this.B + 1)) / 300;
            this.p -= (i2 * 300) / (this.B + 1);
            if (n == 2) {
                this.o -= i2;
            } else if (n == 1) {
                this.o += i2;
            }
            this.o = Math.max(this.o, 0);
            this.o = Math.min(this.o, this.q - this.k);
        }
        if (this.f163c && this.f165a != null) {
            m76c(i);
        }
        for (int i3 = 0; i3 < this.g; i3++) {
            f(i3, i);
        }
        if (!this.f155a) {
            return null;
        }
        this.f155a = false;
        return this.f156a;
    }

    public final void a(Graphics graphics, int i, int i2) {
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        graphics.setClip(i, i2, this.f153a, this.f154b);
        if (this.f163c) {
            a(graphics, i + this.d[0], i2 + this.d[1], this.d[3]);
        }
        if ((this.A & 2) != 0 && this.q < this.k) {
            i2 += (this.k - this.q) >> 1;
        }
        if (this.f == 0) {
            for (int i3 = 0; i3 < this.g; i3++) {
                int i4 = i + this.h + this.f171g[(i3 * 4) + 0];
                int i5 = this.f171g[(i3 * 4) + 1] - this.o;
                int i6 = this.f171g[(i3 * 4) + 2];
                int i7 = this.f171g[(i3 * 4) + 3];
                if (i5 >= 0 && i5 + i7 <= this.k) {
                    int i8 = i5 + i2 + this.i;
                    graphics.setClip(i + this.h, i2 + this.i, this.j, this.k);
                    a(graphics, i3, i4, i8, i6, i7, i);
                }
            }
        } else {
            for (int i9 = 0; i9 < this.g; i9++) {
                int i10 = this.h + this.f171g[(i9 * 4) + 0];
                int i11 = (this.i + this.f171g[(i9 * 4) + 1]) - this.o;
                int i12 = this.f171g[(i9 * 4) + 2];
                int i13 = this.f171g[(i9 * 4) + 3];
                if (i11 + i13 >= this.i && i11 < this.i + this.k) {
                    graphics.setClip(i + this.h, i2 + this.i, this.j, this.k);
                    a(graphics, i9, i + i10, i2 + i11, i12, i13, i);
                }
            }
        }
        boolean z = this.o > 0;
        boolean z2 = this.o + this.k < this.q;
        graphics.setClip(i, i2, this.f153a, this.f154b);
        if (z) {
            int i14 = i + this.r;
            int i15 = i2 + this.s;
            if (n == 2) {
                f152a[0].b(0);
            }
            f152a[0].a(graphics, i14, i15);
        }
        if (z2) {
            int i16 = i + this.r;
            int i17 = i2 + this.t;
            if (n == 1) {
                f152a[1].b(0);
            }
            f152a[1].a(graphics, i16, i17);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void c(int i, int i2) {
        int i3 = -1;
        if (!this.f155a) {
            switch (i2) {
                case 0:
                    int iM56a = h.m56a(i);
                    if (!this.f160b) {
                        if (this.f == 0 && (this.f169e[this.f168c] == 4 || this.f169e[this.f168c] == 5)) {
                            int i4 = this.f184n[this.f168c];
                            if (iM56a == 52) {
                                int[] iArr = this.f184n;
                                int i5 = this.f168c;
                                iArr[i5] = iArr[i5] - 1;
                            } else if (iM56a == 54) {
                                int[] iArr2 = this.f184n;
                                int i6 = this.f168c;
                                iArr2[i6] = iArr2[i6] + 1;
                            }
                            if (this.f169e[this.f168c] == 4) {
                                this.f184n[this.f168c] = Math.max(Math.min(this.f184n[this.f168c], this.f185o[this.f168c] - 1), 0);
                            } else {
                                this.f184n[this.f168c] = (this.f184n[this.f168c] + this.f185o[this.f168c]) % this.f185o[this.f168c];
                            }
                            if (this.f184n[this.f168c] != i4) {
                                i3 = 1;
                            }
                        }
                        if (iM56a != 53) {
                            if (iM56a == 50) {
                                if (this.f == 0) {
                                    int iC = c(this.f168c);
                                    if (iC != -1) {
                                        b(iC);
                                        b();
                                    }
                                } else {
                                    n = 2;
                                }
                                f152a[0].b(0);
                            } else if (iM56a == 56) {
                                if (this.f == 0) {
                                    int iM75b = m75b(this.f168c);
                                    if (iM75b != -1) {
                                        b(iM75b);
                                        b();
                                    }
                                } else {
                                    n = 1;
                                }
                                f152a[1].b(0);
                            }
                        } else if (this.f != 0) {
                            i3 = 0;
                            i = this.c[0];
                        } else if (this.f169e[this.f168c] == 0) {
                            i3 = 1;
                        } else if (this.f169e[this.f168c] == 5 || this.f169e[this.f168c] == 4) {
                            this.f184n[this.f168c] = (this.f184n[this.f168c] + 1) % this.f185o[this.f168c];
                            i3 = 1;
                        } else if (this.f169e[this.f168c] == 3) {
                            a(!this.f160b);
                            if (!this.f160b) {
                                i3 = 1;
                            }
                        }
                    } else if (i >= 48 && i <= 57) {
                        int i7 = this.f157b[this.f168c];
                        int i8 = i - 48;
                        if (i == this.y && this.w > 0 && f161a[i7][i8].length > 1) {
                            this.x++;
                            if (this.x >= f161a[i7][i8].length) {
                                this.x = 0;
                            }
                            this.f158a[this.f168c].setCharAt(this.v - 1, f161a[i7][i8][this.x]);
                        } else if (this.f158a[this.f168c].length() < this.f158a[this.f168c].capacity()) {
                            this.x = 0;
                            this.f158a[this.f168c].insert(this.v, f161a[i7][i8][this.x]);
                            this.v++;
                        }
                        this.w = 750;
                        this.y = i;
                    } else if (iM56a != 52) {
                        if (iM56a != 54) {
                            if (iM56a == 53) {
                                a(!this.f160b);
                            } else if (i == -8 && this.v > 0) {
                                StringBuffer stringBuffer = this.f158a[this.f168c];
                                int i9 = this.v - 1;
                                this.v = i9;
                                stringBuffer.deleteCharAt(i9);
                            }
                        } else if (this.f160b) {
                            this.v = Math.min(this.v + 1, this.f158a[this.f168c].length());
                        }
                    } else if (this.f160b) {
                        this.v = Math.max(this.v - 1, 0);
                    }
                    break;
                case 1:
                    n = 0;
                    break;
                case 3:
                    if (this.f != 0) {
                        i3 = 0;
                    } else {
                        if (i == 3 && this.f169e[this.f168c] == 3) {
                            a(true);
                        } else if (i == 1 && this.f160b) {
                            a(false);
                        } else if (i == 8 && this.f160b && this.v > 0) {
                            StringBuffer stringBuffer2 = this.f158a[this.f168c];
                            int i10 = this.v - 1;
                            this.v = i10;
                            stringBuffer2.deleteCharAt(i10);
                        }
                        if (i == this.c[0]) {
                            if (this.f169e[this.f168c] == 4 || this.f169e[this.f168c] == 5) {
                                this.f184n[this.f168c] = (this.f184n[this.f168c] + 1) % this.f185o[this.f168c];
                            }
                            i3 = 1;
                        } else if (i == this.c[1]) {
                            i3 = 0;
                        }
                    }
                    break;
            }
        }
        if (i3 != -1) {
            this.f155a = true;
            this.f156a[0] = i3;
            if (i3 == 1) {
                this.f156a[1] = this.f170f[this.f168c];
            } else {
                this.f156a[1] = i;
            }
        }
    }

    public final void b(int i) {
        this.f168c = i;
        this.L = 0;
        this.J = 0;
        this.K = 0;
        if (this.q > this.k) {
            int i2 = this.o / this.m;
            int i3 = this.q / this.m;
            int i4 = this.f171g[(i * 4) + 1] / this.m;
            this.o = Math.min(Math.max(Math.min(Math.max(i2, i4 - (this.l >> 1)), i4 - ((this.l - 1) >> 1)), 0), i3 - this.l) * this.m;
        } else {
            this.o = 0;
        }
        this.K = 0;
        this.J = 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m72a() {
        return this.f168c;
    }

    public final void d(int i, int i2) {
        this.f184n[i] = i2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m73a(int i) {
        return this.f184n[i];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m74a(int i) {
        if (this.f169e[i] == 3) {
            return this.f158a[i].toString();
        }
        return null;
    }

    public final void a(d dVar) {
        this.f162c = dVar;
        this.B = dVar.a();
    }

    public static void a(d dVar, d dVar2) {
        a = dVar;
        e = a.a();
        b = dVar2;
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4) {
        int iA = h.a();
        int iE = h.e();
        int i5 = i2 & 16711680;
        int i6 = (((i3 & 16711680) - (i2 & 16711680)) * i4) / iA;
        int i7 = (i2 & 65280) << 8;
        int i8 = ((((i3 & 65280) << 8) - ((i2 & 65280) << 8)) * i4) / iA;
        int i9 = (i2 & 255) << 16;
        int i10 = ((((i3 & 255) << 16) - ((i2 & 255) << 16)) * i4) / iA;
        while (i < iA) {
            graphics.setColor((i5 & 16711680) | ((i7 >> 8) & 65280) | (i9 >> 16));
            graphics.fillRect(0, i, iE, i4 + 0);
            i5 += i6;
            i7 += i8;
            i9 += i10;
            i += i4;
        }
    }

    public static final void a(Graphics graphics, int i, boolean z) {
        int iE = h.e();
        int iA = h.a();
        int i2 = (118 * iE) / 176;
        int iMax = Math.max((3 * iA) / 208, 3);
        int i3 = iMax + 2;
        int i4 = (iE - i2) >> 1;
        int iC = (iA - h.c()) - i3;
        if (z) {
            iC = (iA - i3) >> 1;
            graphics.setColor(0);
            graphics.drawRect(i4 - 2, iC - 2, i2 + 3, iMax + 3);
        } else {
            graphics.setColor(16777215);
            graphics.fillRect(i4 - 1, iC - 1, i2 + 2, iMax + 2);
            graphics.setColor(3609876);
            graphics.fillRect(i4, iC, i2, iMax);
            graphics.setColor(12593408);
        }
        graphics.fillRect(i4, iC, Math.max(1, (i2 * i) / 100), iMax);
    }

    private static String[] a(String str, int i, int i2, int i3) {
        char[] cArr = {'.', '/'};
        int i4 = 0;
        int i5 = 0;
        int length = str.length();
        Vector vector = new Vector();
        int i6 = 0;
        while (i5 < length) {
            int iIndexOf = str.indexOf("\\n", i4);
            i5 = iIndexOf;
            if (iIndexOf == -1) {
                i5 = length;
            }
            boolean z = false;
            while (!z) {
                int i7 = i4;
                int iA = 0;
                int i8 = -1;
                int i9 = i;
                if (i6 < i3) {
                    i9 -= i2;
                }
                while (iA < i9 && i7 < i5) {
                    char cCharAt = str.charAt(i7);
                    iA += f188d.a(cCharAt);
                    i7++;
                    if (cCharAt == ' ') {
                        i8 = i7;
                    }
                }
                if (i7 == i5 && iA <= i9) {
                    z = true;
                } else if (i8 != -1) {
                    i7 = i8 - 1;
                } else {
                    i7--;
                    int i10 = i7;
                    while (true) {
                        if (i10 <= i4) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i10);
                        int length2 = cArr.length;
                        do {
                            length2--;
                            if (length2 >= 0) {
                            }
                        } while (cCharAt2 != cArr[length2]);
                        i7 = i10 + 1;
                        break;
                        i10--;
                    }
                }
                vector.addElement(str.substring(i4, i7));
                i6++;
                if (z && i7 < length) {
                    i7 += 2;
                } else if (i8 != -1) {
                    i7++;
                }
                i4 = i7;
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        f188d = null;
        return strArr;
    }

    public static String[] a(String str, d dVar, int i) {
        f188d = dVar;
        return a(str, i, 0, 0);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private int m75b(int i) {
        int i2 = this.g;
        do {
            i = (i + 1) % this.g;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m77a(i));
        return i;
    }

    private int c(int i) {
        if (i == -1) {
            i = 0;
        }
        int i2 = this.g;
        do {
            i = ((i + this.g) - 1) % this.g;
            int i3 = i2;
            i2 = i3 - 1;
            if (i3 <= 0) {
                return -1;
            }
        } while (!m77a(i));
        return i;
    }

    private void a(boolean z) {
        if (!z) {
            this.f160b = false;
            b(this.f168c);
            b();
        } else {
            this.f160b = true;
            h.m54b();
            h.b(1, 0);
            h.b(8, 0);
            this.v = this.f158a[this.f168c].length();
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [javax.microedition.lcdui.Image[], javax.microedition.lcdui.Image[][]] */
    private void a(int i, String[] strArr, Image[] imageArr, int i2, int i3) {
        if (this.f184n == null) {
            this.f184n = new int[this.g];
            this.f185o = new int[this.g];
            this.f182b = new String[this.g];
            this.f183b = new Image[this.g];
            this.f186c = new b[this.g];
        }
        this.f182b[i] = strArr;
        this.f184n[i] = i2;
        this.f185o[i] = i3;
        this.f183b[i] = imageArr;
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        b bVarM7a;
        Image image = null;
        if (i == -2) {
            image = this.f166a;
        } else if (this.f175a[i] != null) {
            if (this.f179k[i] == 0) {
                image = this.f168c == i ? this.f175a[i][1] : this.f175a[i][0];
            } else if (this.f179k[i] == 1) {
                image = this.f175a[i][2];
            }
        }
        if (image != null) {
            int width = i2 + ((i4 - image.getWidth()) >> 1);
            int height = i3;
            if (this.f == 0) {
                height += (i5 - image.getHeight()) >> 1;
            } else if (i != -2 && this.f178a[i] != null && this.f178a[i].length > this.f172h[i]) {
                int i6 = (this.f172h[i] * (this.B + 1)) - 1;
                if (image.getHeight() > i6) {
                    i6++;
                }
                height += (i6 - image.getHeight()) >> 1;
            }
            graphics.drawImage(image, width, height, 20);
        }
        int i7 = -1;
        if (i == -2) {
            bVarM7a = this.f167a;
            i7 = 0;
        } else {
            b bVar = this.f176b[i];
            bVarM7a = bVar;
            if (bVar != null) {
                if (this.f179k[i] == 0) {
                    i7 = this.f168c == i ? 1 : 0;
                } else if (this.f179k[i] == 1) {
                    i7 = 2;
                }
                if (i7 != -1 && this.f != 0 && i7 != bVarM7a.h) {
                    bVarM7a.a(i7, true);
                }
            }
        }
        if (bVarM7a == null || i7 == -1) {
            return;
        }
        if (bVarM7a == DCTriangle.m7a(131073)) {
            if (this.f184n[i] == 0) {
                bVarM7a = DCTriangle.m7a(131089);
            }
        } else if (bVarM7a == DCTriangle.m7a(65576) && this.f184n[i] == 0) {
            bVarM7a = DCTriangle.m7a(131083);
        }
        if (i7 != bVarM7a.h) {
            bVarM7a.a(i7, true);
        }
        int iE = i2 + ((i4 - bVarM7a.e()) >> 1);
        int iF = i3;
        if (this.f == 0) {
            iF += (i5 - bVarM7a.f()) >> 1;
        } else if (i != -2 && this.f178a[i] != null && this.f178a[i].length > this.f172h[i]) {
            int i8 = (this.f172h[i] * (this.B + 1)) - 1;
            if (bVarM7a.f() > i8) {
                i8++;
            }
            iF += (i8 - bVarM7a.f()) >> 1;
        }
        bVarM7a.a(graphics, iE + bVarM7a.c(), iF + bVarM7a.d());
    }

    private void b(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        d dVar;
        String[] strArr = i == -2 ? this.f165a : this.f178a[i];
        if (strArr != null) {
            int iMin = i2 + 4;
            if (i == -2) {
                i6 = e;
                dVar = a;
            } else {
                i6 = this.B;
                dVar = this.f162c;
            }
            if (i == -2 || this.f == 0) {
                int i7 = i3 + ((i5 - i6) >> 1);
                int iA = dVar.a(strArr[0]);
                boolean z = iA <= i4 - 8;
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                if (!z) {
                    int i8 = clipX + clipWidth;
                    int i9 = clipY + clipHeight;
                    int iMax = Math.max(clipX, iMin);
                    int iMax2 = Math.max(clipY, i3);
                    int i10 = iMax - 1;
                    graphics.setClip(i10, iMax2, Math.max(iMax, Math.min(i8, iMin + (i4 - 8))) - i10, Math.max(iMax2, Math.min(i9, i3 + i5)) - iMax2);
                    if (i == -2) {
                        if (this.D >= 0) {
                            iMin -= Math.min(iA - (this.H - 8), this.D);
                        }
                    } else if (i == this.f168c && this.J >= 0) {
                        iMin -= Math.min(iA - (this.f173i[i] - 8), this.J);
                    }
                }
                dVar.a(graphics, strArr[0], iMin, i7, 20);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                return;
            }
            int i11 = i6 + 1;
            int clipY2 = graphics.getClipY();
            int clipHeight2 = graphics.getClipHeight();
            int i12 = i3 < clipY2 ? (clipY2 - i3) / i11 : 0;
            int i13 = (clipY2 + clipHeight2) - (i3 + (i12 * i11));
            int iMin2 = Math.min(i12 + (i13 == 0 ? 0 : ((i13 - 1) / i11) + 1), this.f178a[i].length);
            int i14 = 0;
            int i15 = 0;
            if (this.f != 0) {
                i14 = this.f174j[i];
                i15 = this.f172h[i];
            }
            for (int i16 = i12; i16 < iMin2; i16++) {
                String str = this.f178a[i][i16];
                int iA2 = iMin;
                int i17 = i3 + (i11 * i16);
                if (i16 < i15) {
                    iA2 += i14;
                } else if ((this.A & 1) != 0) {
                    iA2 += ((i4 - dVar.a(str)) >> 1) - 4;
                }
                dVar.a(graphics, str, iA2, i17, 20);
            }
        }
    }

    private void a(Graphics graphics, int i, int i2, int i3) {
        int i4 = this.H;
        int i5 = this.I;
        a(graphics, -2, i, i2, i5, i3);
        b(graphics, -2, i + i5, i2, i4, i3);
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f173i[i];
        int i8 = this.f174j[i];
        if (this.f != 0 && i7 > 0) {
            i8 = 0;
        }
        if (this.f == 0 && i == this.f168c) {
            graphics.setColor(this.f187d);
            graphics.fillRect(i6 + this.h, i3, this.j, i5);
        }
        if (this.f169e[i] == 3) {
            i5 -= this.u;
        }
        a(graphics, i, i2, i3, this.f174j[i], i5);
        b(graphics, i, i2 + i8, i3, i7, i5);
        if (this.f169e[i] == 5) {
            e(graphics, i, i2, i3, i4, i5);
        }
        if (this.f169e[i] == 4) {
            d(graphics, i, i2, i3, i4, i5);
        }
        if (this.f169e[i] == 3) {
            c(graphics, i, i2 + 4, i3 + i5, this.j - 8, this.u - 2);
        }
    }

    private void c(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f160b && this.f168c == i) {
            i6 = 10748416;
            i7 = 16747008;
            i8 = 16777215;
        } else {
            i6 = 16777215;
            i7 = 3355443;
            i8 = 11711154;
        }
        graphics.setColor(i6);
        graphics.drawRect(i2, i3, i4 - 1, i5 - 1);
        graphics.setColor(i7);
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 3, i5 - 3);
        graphics.setColor(i8);
        graphics.fillRect(i2 + 2, i3 + 2, i4 - 4, i5 - 4);
        boolean z = this.z % 1000 > 500;
        int iA = i2 + 4;
        int i9 = i3 + 2 + 0;
        int i10 = i4 - 8;
        this.f158a[i].getChars(0, this.f158a[i].length(), this.f159a, 0);
        int i11 = 0;
        int iA2 = this.f157b[i] == 1 ? 0 + this.f162c.a('+') : 0;
        for (int i12 = 0; i12 < this.f158a[i].length(); i12++) {
            iA2 += this.f162c.a(this.f159a[i12]);
            if (i12 == this.v - 1) {
                i11 = iA2;
            }
        }
        if (this.f160b && i == this.f168c) {
            iA2 += this.f162c.a('_');
        }
        boolean z2 = iA2 <= i10;
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        if (!z2) {
            int i13 = clipX + clipWidth;
            int iMax = Math.max(clipX, iA);
            graphics.setClip(iMax, clipY, Math.max(iMax, Math.min(i13, iA + i10)) - iMax, clipHeight);
            if (this.f160b && i == this.f168c) {
                iA -= Math.max(Math.min((i11 + (i10 >> 1)) - i10, iA2 - i10), 0);
            }
        }
        if (this.f157b[i] == 1) {
            this.f162c.a(graphics, '+', iA, i9, 20);
            iA += this.f162c.a('+');
        }
        int iA3 = iA;
        for (int i14 = 0; i14 < this.f158a[i].length(); i14++) {
            this.f162c.a(graphics, this.f159a[i14], iA3, i9, 20);
            iA3 += this.f162c.a(this.f159a[i14]);
        }
        if (this.f160b && i == this.f168c && z && this.w <= 0 && this.v < this.f158a[i].capacity()) {
            for (int i15 = 0; i15 < this.v; i15++) {
                iA += this.f162c.a(this.f159a[i15]);
            }
            this.f162c.a(graphics, '_', iA, i9, 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void d(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i2 + i4) - this.f180l[i]) - this.f181m[i];
        int i7 = this.f185o[i] - 1;
        int i8 = this.f184n[i];
        for (int i9 = 1; i9 <= i7; i9++) {
            int i10 = i6 + ((i9 - 1) * 7) + 4;
            int i11 = i3 + ((i5 + this.B) >> 1);
            int i12 = (this.B / i7) * i9;
            if (i8 >= i9) {
                graphics.setColor(15956299);
            } else {
                graphics.setColor(8475904);
            }
            graphics.fillRect(i10, i11 - i12, 6, i12);
        }
    }

    private void e(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        String str;
        Image image;
        int i6 = this.f180l[i];
        int i7 = this.f181m[i];
        int i8 = ((i2 + i4) - i6) - i7;
        int i9 = this.f184n[i];
        if (this.f183b[i] != null && (image = this.f183b[i][i9]) != null) {
            graphics.drawImage(image, i8 + (i7 >> 1), i3 + (i5 >> 1), 3);
        }
        if (this.f186c[i] != null) {
            b bVar = this.f186c[i];
            if (i9 != bVar.h) {
                bVar.a(i9, true);
            }
            bVar.a(graphics, i8 + bVar.c() + ((i7 - bVar.e()) >> 1), i3 + bVar.d() + ((i5 - bVar.f()) >> 1));
        }
        if (this.f182b[i] == null || (str = this.f182b[i][i9]) == null) {
            return;
        }
        this.f162c.a(graphics, str, i8 + i7 + 4, i3 + ((i5 - this.B) >> 1), 20);
    }

    private void b(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            this.M = 0;
            return;
        }
        int i5 = i4 + 25;
        this.O -= i;
        while (this.O < 0) {
            if (this.N == 1) {
                this.M++;
            } else {
                this.M--;
            }
            if (this.M > i5) {
                this.M = i5;
                this.N = 0;
            } else if (this.M < -25) {
                this.M = -25;
                this.N = 1;
            }
            this.O += 40;
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private void m76c(int i) {
        if (this.f167a != null) {
            this.f167a.m11a(i);
        }
        if (this.f165a != null) {
            this.O = this.E;
            this.M = this.D;
            this.N = this.F;
            b(i, a.a(this.f165a[0]), this.H - 8);
            this.D = this.M;
            this.F = this.N;
            this.E = this.O;
        }
    }

    private void f(int i, int i2) {
        if (this.f176b[i] != null && this.f176b[i] != null) {
            this.f176b[i].m11a(i2);
        }
        if (this.f186c != null && this.f186c[i] != null) {
            this.f186c[i].m11a(i2);
        }
        if (i != this.f168c || this.f178a[i] == null) {
            return;
        }
        this.O = this.L;
        String[] strArr = this.f178a[i];
        if (strArr != null) {
            this.M = this.J;
            this.N = this.K;
            b(i2, this.f162c.a(strArr[0]), this.f173i[i] - 8);
            this.J = this.M;
            this.K = this.N;
        }
        this.L = this.O;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m77a(int i) {
        return this.f169e[i] == 0 || this.f169e[i] == 3 || this.f169e[i] == 4 || this.f169e[i] == 5;
    }
}
