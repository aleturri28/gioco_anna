package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:g.class */
public final class g {
    private static int m;
    private static int n;
    private static int o;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean[][] f81a;
    private static byte[] d;
    private static int r;
    private static int s;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f83a;
    private static int t;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static int f84b;
    private static int u;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int f85c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f86a;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int f87d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f88a;
    private static int v;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static byte[][] f89b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static short[][] f90a;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public static int f91e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static b f93b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static b f94c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b[] f95a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static b[] f96b;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static b f97d;
    private static int w;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    public static int f99f;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f100c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static b[] f101c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static b[] f102d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static b[] f103e;
    public static int g;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f104c;
    private static int E;
    private static int F;
    private static int G;
    public static int h;
    private static int H;
    private static int I;
    private static int J;
    public static int i;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b[][] f105a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f106a;
    private static int K;
    private static int L;
    public static int j;
    private static int M;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean f108b;
    public static int k;
    private static int N;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static int[] f109e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int[] f110f;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static b f111e;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static b f112f;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static b f113g;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static b[] f114f;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static b f115h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[][] f116a;
    private static int O;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int[] f117g;

    /* JADX INFO: renamed from: i, reason: collision with other field name */
    private static b f119i;

    /* JADX INFO: renamed from: j, reason: collision with other field name */
    private static b f120j;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static b[] f121g;

    /* JADX INFO: renamed from: k, reason: collision with other field name */
    private static b f122k;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static b[] f123h;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static byte[] f124g;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[][] f125b;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static boolean f126d;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String[][] f127c;
    public static int l;
    private static int P;
    private static int Q;
    private static int R;
    private static int S;
    private static int T;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean[] f130a;
    private static byte[] b = {9, 14, 3, 14, 4, 14, 5, 14, 6, 14, 8, 14, 7, 14, 14, 8, 13, 17, 15, 11, 17, 18, 20, 20, 23, 2, 16, 1, 18, 7, 24, 22, 25, 24, 12, 6, 21, 0, 19, 4, 22, 12, 26, 23, 31, 25, 32, 21, 27, 19, 33, 5, 34, 10};
    private static byte[] c = {0, 3, 1, 15, 2, 13, 10, 9, 11, 16};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final int[][] f79b = {new int[]{37, 0, 1, -1, 107, 1, 12, 76, 241, 0, 2, -1, 495, 2, -1, -1}, new int[]{115, 0, 3, -1, 276, 1, 15, 77, 501, 0, 4, -1, 817, 1, 17, 78, 1259, 1, 18, 79, 1877, 1, 22, 80, 2743, 2, -1, -1, 3955, 1, 19, 81}, new int[]{160, 1, 31, 83, 352, 0, 5, -1, 582, 1, 20, 84, 859, 0, 6, -1, 1191, 1, 25, 82, 1589, 1, 13, 85, 2067, 1, 14, 86, 2640, 1, 24, 87, 3328, 1, 32, 88, 4153, 1, 26, 89, 5144, 2, -1, -1, 6333, 1, 27, 90, 7759, 1, 33, 91}};
    private static final byte[][] a = {new byte[]{0, 1, 2, 7, 8}, new byte[]{0, 1, 2, 3, 4, 7, 8}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8}};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f80a = {92, 0, 93, 9300, 94, 10400, 95, 11700, 96, 13300, 97, 15200};
    private static int p = h.a();
    private static int q = h.e();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static byte[] f82a = new byte[13];
    private static final byte[] e = {3, 5, 6};

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean[] f92b = new boolean[e[2] * e[2]];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[] f98b = new int[2];
    private static byte[] f = new byte[2];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static int[] f107d = {112, 113, 114, 115};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final int[][] f118a = {new int[]{524293, 524295, 524300, 524305, 524310, 524311, 524312}, new int[]{524313, 524314, 524315, 524316, 524317, 524318, 524319}, new int[]{524320, 524321, 524322, 524323, 524324, 524325, 524326}, new int[]{524327, 524328, 524329, 524330, 524331, 524332, 524333}, new int[]{524334, 524335, 524336, 524337, 524338, 524339, 524340}, new int[]{524341, 524342, 524343, 524344, 524345, 524346, 524347}, new int[]{524348, 524349, 524350, 524351, 524352, 524353, 524354}, new int[]{524355}, new int[]{524357}, new int[]{524360}, new int[]{524362}, new int[]{524366}, new int[]{524367}};

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int[] f128h = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static byte[] f129h = {28, 29, 30};

    private g() {
    }

    private static final void b(int i2, int i3) {
        int[] iArrM17a = f88a.m17a(0);
        f128h[0] = iArrM17a[0] + (q >> 1) + (i2 * 29) + ((i3 * 29) >> 1) + (i3 >> 1);
        f128h[1] = ((iArrM17a[1] + v) - (22 * i3)) - 0;
    }

    private static final int c() {
        return a[f84b][P];
    }

    private static final int d() {
        if (f83a == 6 || f83a == 14) {
            return 0;
        }
        return (f83a == 1 || f83a == 10 || f83a == 2 || f83a == 5 || f83a == 4 || f83a == 3 || f83a == 9 || f83a == 11 || f83a == 13) ? 2 : 1;
    }

    private static final void c(Graphics graphics) {
        byte[] bArr = f89b[f84b];
        int i2 = t;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            b(0, i2);
            int i3 = f128h[0];
            int i4 = f128h[1];
            for (int i5 = 0; i5 < t - i2; i5++) {
                byte b2 = bArr[(i2 * t) + i5];
                byte b3 = b2;
                if (b2 != 9) {
                    b3 = 9;
                } else if (f92b[(i2 * t) + i5]) {
                    b3 = 12;
                }
                a(graphics, i3, i4, b3);
                i3 += 29;
            }
        }
    }

    private static final void d(Graphics graphics) {
        byte[] bArr = f89b[f84b];
        int i2 = t;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            b(0, i2);
            int i3 = f128h[0];
            int i4 = f128h[1];
            for (int i5 = 0; i5 < t - i2; i5++) {
                byte b2 = bArr[(i2 * t) + i5];
                if (b2 != 9) {
                    f105a[b2 & 15][b2 >> 4].a(graphics, i3, i4, i5 << 8);
                }
                i3 += 29;
            }
        }
    }

    private static final void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        int iAbs = Math.abs(i2 - i4);
        int iAbs2 = Math.abs(i3 - i5);
        int iMax = Math.max(iAbs, iAbs2) + (Math.min(iAbs, iAbs2) >> 1);
        int i8 = iMax / 5;
        int i9 = (-i8) + ((((B % 1000) * i8) * 2) / 1000);
        int i10 = ((i5 - i3) << 8) / iMax;
        int i11 = (-((i4 - i2) << 8)) / iMax;
        for (int i12 = 0; i12 < i8; i12++) {
            int iMax2 = Math.max(Math.min((j.m104b(((i12 * 45) + ((i12 + 3) * (i12 + 1))) + (B >> 1)) * ((j.m104b((i12 << 5) + (B >> 1)) * 5) >> 10)) >> 10, i12 << 1), (-i12) << 1);
            int i13 = i2 + (((i4 - i2) * i12) / i8) + ((i10 * iMax2) >> 8);
            int i14 = i3 + (((i5 - i3) * i12) / i8) + ((i11 * iMax2) >> 8);
            if (i12 >= i9 && i12 < i9 + 20) {
                graphics.setColor(16776960);
                if (iAbs2 > iAbs) {
                    graphics.drawLine(i6 - 1, i7, i13 - 1, i14);
                    graphics.drawLine(i6 + 1, i7, i13 + 1, i14);
                } else {
                    graphics.drawLine(i6, i7 - 1, i13, i14 - 1);
                    graphics.drawLine(i6, i7 + 1, i13, i14 + 1);
                }
                graphics.setColor(16777215);
                graphics.drawLine(i6, i7, i13, i14);
            }
            i6 = i13;
            i7 = i14;
        }
    }

    private static final void a(Graphics graphics, int i2, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 15) <= 6) {
            i5 = i4 >> 4;
        }
        f105a[i4 & 15][i5].a(graphics, i2, i3);
    }

    private static final void a(Graphics graphics, int i2) {
        int iE = f121g[0].e();
        int iAbs = iE - ((iE * (Math.abs(B) % 700)) / 700);
        f121g[0].a(graphics, 4 + iAbs, i2);
        f121g[1].a(graphics, (q - 4) - iAbs, i2);
    }

    private static final void e(Graphics graphics) {
        int i2 = F;
        if (d() == 2) {
            f101c[1].a(graphics, 0, 0);
            int iE = q - f101c[3].e();
            int iE2 = f101c[1].e();
            while (true) {
                int i3 = iE2;
                if (i3 >= iE) {
                    break;
                }
                f101c[5].a(graphics, i3, 0);
                iE2 = i3 + f101c[5].e();
            }
            f101c[3].a(graphics, iE, 0);
            f101c[0].a(graphics, q >> 1, 0);
        } else {
            int iA = j.f201a.a();
            int iMax = 0;
            int i4 = 3;
            while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                } else {
                    iMax = Math.max(iMax, f127c[i4].length * iA);
                }
            }
            String[] strArr = f127c[f84b];
            int iC = (p - h.c()) - iMax;
            j.a(graphics, strArr, iC + ((iMax - (strArr.length * iA)) >> 1), iMax, j.f201a);
            a(graphics, iC + (iMax >> 1));
            i2 = f104c[f84b];
        }
        int i5 = q >> 1;
        int[] iArrM17a = f101c[4].m17a(1);
        j.a(graphics, i2, 10000, i5 + iArrM17a[0], iArrM17a[1], 1);
        if (f83a == 1 && f82a[3] == 1 && C % 1000 < 500) {
            return;
        }
        int iE3 = e();
        f101c[4].a(graphics, i5, 0);
        int[] iArrM17a2 = f101c[4].m17a(0);
        graphics.setClip(i5 + iArrM17a2[0], 0, (Math.min(iE3, i2) * iArrM17a2[2]) / iE3, p);
        f101c[6].a(graphics, i5, 0);
        graphics.setClip(0, 0, q, p);
        if (f() < iE3) {
            f101c[2].a(graphics, i5 + iArrM17a2[0] + ((f() * iArrM17a2[2]) / iE3), 0);
        }
    }

    private static final int e() {
        int i2 = 0;
        while (f79b[f84b][i2 + 1] != 2) {
            i2 += 4;
        }
        return f79b[f84b][i2];
    }

    private static int f() {
        for (int i2 = 0; i2 < f81a[f84b].length; i2++) {
            if (!f81a[f84b][i2]) {
                return f79b[f84b][i2 * 4];
            }
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0005 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void a(byte[] r8, javax.microedition.lcdui.Graphics r9) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g.a(byte[], javax.microedition.lcdui.Graphics):void");
    }

    public static final void a(Graphics graphics) {
        b bVar = f123h[0 + f84b];
        int i2 = 21;
        if (f84b == 1) {
            i2 = 16;
        } else if (f84b == 2) {
            i2 = 23;
        }
        if (f83a == 15) {
            i2 = 16;
            n = 1000;
        }
        graphics.setClip(0, 0, q, p);
        if (DCTriangle.f1a != 5) {
            int[] iArrM17a = f123h[3].m17a(2);
            int i3 = iArrM17a[0];
            int i4 = iArrM17a[1];
            int i5 = iArrM17a[2] >> 1;
            int i6 = iArrM17a[3] >> 1;
            int i7 = i3 + i5;
            int i8 = i4 + i6;
            int i9 = i;
            int iM105c = i8 + ((j.m105c(i9) * (i6 - (p >> 1))) >> 10);
            r = i7 + ((j.m105c(i9 + 16384) * (i5 - (q >> 1))) >> 10);
            s = iM105c;
        } else if (f83a == 7) {
            r = m46c(T);
            s = m47d(T);
        } else {
            int i10 = 21;
            if (u == 1) {
                i10 = 16;
            } else if (u == 2) {
                i10 = 23;
            }
            b bVar2 = f123h[0 + f84b];
            int iM46c = (m46c(i2) - bVar.c()) + (bVar.e() >> 1);
            int iM47d = (m47d(i2) - bVar.d()) + (bVar.f() >> 1);
            int iM46c2 = (m46c(i10) - bVar2.c()) + (bVar2.e() >> 1);
            int iM47d2 = (m47d(i10) - bVar2.d()) + (bVar2.f() >> 1);
            int i11 = 1000000 - ((1000 - n) * (1000 - n));
            r = iM46c2 + (((iM46c - iM46c2) * i11) / 1000000);
            s = iM47d2 + (((iM47d - iM47d2) * i11) / 1000000);
        }
        r -= q >> 1;
        s -= p >> 1;
        r = Math.min(675 - q, Math.max(0, r));
        s = Math.min(450 - p, Math.max(0, s));
        if (q > 675) {
            r = (q - 675) >> 1;
        }
        if (p > 450) {
            s = (p - 450) >> 1;
        }
        if (q > 675 || p > 450) {
            DCTriangle.a(graphics, false);
        }
        f123h[16].b(((f123h[16].a() - 1) * m44j()) / 100);
        a(c, graphics);
        a(b, graphics);
        for (int i12 = 0; i12 < f129h.length; i12++) {
            int i13 = 36000 - (i12 * 5000);
            f122k.a(graphics, ((((i % i13) * (675 + (q << 1))) / i13) - q) - r, m47d((int) f129h[i12]) - s);
        }
        if (f83a == 7 && DCTriangle.f1a == 5) {
            int iMax = Math.max(h.c(), (p - 450) >> 1);
            graphics.setColor(0);
            graphics.fillRect(0, 0, q, iMax);
            graphics.fillRect(0, p - iMax, q, iMax);
        }
    }

    private static final boolean a(int i2, int i3, int i4) {
        int[] iArr = f79b[i4];
        for (int length = iArr.length - 4; length >= 0; length -= 4) {
            if ((iArr[length + 1] & i2) != 0 && iArr[length + 2] == i3) {
                return !f81a[i4][length / 4];
            }
        }
        return false;
    }

    private static final void b(Graphics graphics, int i2, int i3, int i4) {
        int[] iArrM17a = f88a.m17a(i4);
        int i5 = q >> 1;
        f102d[i2].a(graphics, i5 + iArrM17a[0], v + iArrM17a[1]);
        int[] iArrM17a2 = f88a.m17a(i4 + 1);
        j.a(graphics, i3, 1000, i5 + iArrM17a2[0], v + iArrM17a2[1], 4);
    }

    public static final void b(Graphics graphics) {
        if (g < 100) {
            DCTriangle.a(graphics, true);
            i.a(graphics, g, false);
            return;
        }
        if (j.f191a == 0 || j.f254b) {
            boolean z2 = (B & 1023) < 512;
            if (d() == 2) {
                Graphics graphics2 = j.f205a.getGraphics();
                if (j.f254b) {
                    j.a(graphics2, f106a, 0, 0, q, p);
                }
                graphics = graphics;
                graphics.drawImage(j.f205a, 0, 0, 20);
                c(graphics);
                d(graphics);
                int[] iArrM17a = f88a.m17a(5);
                f103e[c()].a(graphics, (q >> 1) + iArrM17a[0], v + iArrM17a[1]);
                e(graphics);
                if (z2 && (f83a == 1 || ((f83a == 4 && c() != 8) || f83a == 11))) {
                    for (int i2 = 0; i2 < t; i2++) {
                        for (int i3 = 0; i3 < t - i2; i3++) {
                            int i4 = (i2 * t) + i3;
                            if (f92b[i4] && f89b[f84b][i4] != 9) {
                                b(i3, i2);
                                a(graphics, f128h[0], f128h[1], 12);
                            }
                        }
                    }
                }
                if (f83a == 1) {
                    int i5 = x + (y * t);
                    b(graphics, f89b[f84b][i5] & 15, f90a[f84b][i5], 1);
                    b(graphics, l & 15, f91e, 3);
                    b(x, y);
                    int i6 = f128h[0];
                    int i7 = f128h[1];
                    b(z, A);
                    a(graphics, f128h[0] + (((i6 - f128h[0]) * m) / 400), ((f128h[1] + (((i7 - f128h[1]) * m) / 400)) - 7) + ((j.m104b(B >> 3) * 22) >> 12), l);
                } else if (f83a == 11) {
                    int i8 = (y * t) + x;
                    if (f99f == 0) {
                        b(graphics, f89b[f84b][i8] & 15, f90a[f84b][i8], 1);
                        b(graphics, 9, 0, 3);
                    } else if (f99f == 1) {
                        b(graphics, f89b[f84b][f98b[0]] & 15, f90a[f84b][f98b[0]], 1);
                        if (i8 != f98b[0]) {
                            b(graphics, f89b[f84b][i8] & 15, f90a[f84b][i8], 3);
                        } else {
                            b(graphics, 9, 0, 3);
                        }
                    }
                } else {
                    b(graphics, 9, 0, 1);
                    b(graphics, 9, 0, 3);
                }
                if (f119i.a != Integer.MAX_VALUE) {
                    b(0, 0);
                    int i9 = f119i.a >> 8;
                    int i10 = f128h[1] + 22;
                    f119i.a(graphics, i9, i10);
                    if (f83a == 10) {
                        int[] iArrM17a2 = f119i.m17a(0);
                        int i11 = i9 + iArrM17a2[0];
                        int i12 = i10 + iArrM17a2[1];
                        b(x, y);
                        a(graphics, i11 + ((f119i.f * (f128h[0] - i11)) / 1000), i12 + ((f119i.f * (f128h[1] - i12)) / 1000), l);
                    }
                }
            } else if (f83a == 14 || f83a == 6) {
                f(graphics);
            } else {
                a(graphics);
                if (f83a == 15) {
                    if (B < 200) {
                        int[] iArr = {16777215, 16776960, 16777215};
                        int i13 = B / 100;
                        int i14 = B % 100;
                        int i15 = 100 - i14;
                        int i16 = iArr[i13];
                        int i17 = iArr[i13 + 1];
                        graphics.setColor((((((i16 >> 16) * i15) + ((i17 >> 16) * i14)) / 100) << 16) | ((((((i16 >> 8) & 255) * i15) + (((i17 >> 8) & 255) * i14)) / 100) << 8) | ((((i16 & 255) * i15) + ((i17 & 255) * i14)) / 100));
                        graphics.fillRect(0, 0, q, p);
                    }
                } else if (f83a == 0) {
                    e(graphics);
                }
            }
            switch (f83a) {
                case 2:
                    b(x, y);
                    a(graphics, f128h[0], f128h[1] - (((1500 - J) * 22) / 3000), l);
                    break;
                case 5:
                    b(x, y);
                    if (((G >> 8) >> 4) >= 5) {
                        f95a[1].a(graphics, f128h[0], f128h[1]);
                    } else {
                        f95a[0].a(graphics, f128h[0], f128h[1]);
                    }
                    break;
                case 11:
                    if (f99f == 1) {
                        b(f98b[0] % t, f98b[0] / t);
                        a(graphics, f128h[0] - 14, f128h[1] - 11, f128h[0] + 14, f128h[1] - 11);
                        a(graphics, f128h[0] + 14, f128h[1] + 11, f128h[0] - 14, f128h[1] + 11);
                        a(graphics, f128h[0] + 14, f128h[1] - 11, f128h[0] + 14, f128h[1] + 11);
                        a(graphics, f128h[0] - 14, f128h[1] + 11, f128h[0] - 14, f128h[1] - 11);
                        int i18 = f128h[0];
                        int i19 = f128h[1];
                        if (z2) {
                            for (int i20 = 0; i20 < t; i20++) {
                                for (int i21 = 0; i21 < t - i20; i21++) {
                                    b(i21, i20);
                                    if (f92b[(i20 * t) + i21]) {
                                        a(graphics, f128h[0], f128h[1], 12);
                                    }
                                }
                            }
                        }
                        if (f92b[(y * t) + x]) {
                            b(x, y);
                            H = (i18 + f128h[0]) >> 1;
                            I = (i19 + f128h[1]) >> 1;
                            if (f128h[0] != i18 || f128h[1] != i19) {
                                a(graphics, f128h[0], f128h[1], i18, i19);
                            }
                        }
                    }
                    if (f99f == 2) {
                        int i22 = f98b[0] / t;
                        int i23 = f98b[0] - (i22 * t);
                        int i24 = f98b[1] / t;
                        int i25 = f98b[1] - (i24 * t);
                        b(i23, i22);
                        int i26 = f128h[0];
                        int i27 = f128h[1];
                        b(i25, i24);
                        int i28 = f128h[0];
                        int i29 = f128h[1];
                        if (f100c) {
                            a(graphics, i26 + ((w * (i28 - i26)) / 1000), i27 + ((w * (i29 - i27)) / 1000), f[0]);
                        } else {
                            int i30 = (w * 128) / 1000;
                            int i31 = (i26 + i28) >> 1;
                            int i32 = (i27 + i29) >> 1;
                            int i33 = i26 - i31;
                            int i34 = i27 - i32;
                            int i35 = i28 - i31;
                            int i36 = i29 - i32;
                            int iM106d = i31 + (((i33 * j.m106d(i30)) - (i34 * j.m104b(i30))) >> 10);
                            int iM104b = i32 + (((i33 * j.m104b(i30)) + (i34 * j.m106d(i30))) >> 10);
                            int iM106d2 = i31 + (((i35 * j.m106d(i30)) - (i36 * j.m104b(i30))) >> 10);
                            int iM104b2 = i32 + (((i35 * j.m104b(i30)) + (i36 * j.m106d(i30))) >> 10);
                            a(graphics, iM106d, iM104b, f[0]);
                            a(graphics, iM106d2, iM104b2, f[1]);
                        }
                    } else {
                        b(x, y);
                        int i37 = f128h[0];
                        int i38 = f128h[1];
                        b(z, A);
                        f97d.a(graphics, f128h[0] + (((i37 - f128h[0]) * m) / 400), f128h[1] + (((i38 - f128h[1]) * m) / 400));
                    }
                    break;
            }
            if (d() == 2) {
                if (h >= 1 && h < 1000) {
                    j.a(graphics, E, -1, H - (j.a((Graphics) null, E, -1, 0, 0, 1) >> 1), I + (((-h) * 22) / 1000), 1);
                }
                if (f83a == 4) {
                    g(graphics);
                }
            }
        }
        j.a(graphics);
    }

    private static final void m() {
        if (f83a == 4) {
            l = c();
        }
        int length = f92b.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else {
                f92b[length] = false;
            }
        }
        if (l == 8) {
            return;
        }
        byte[] bArr = f89b[f84b];
        int i2 = t;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            int i3 = t - i2;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    int i4 = (i2 * t) + i3;
                    if (l == 7) {
                        if (f99f == 1) {
                            f92b[i4] = a(f98b[0], (i2 * t) + i3);
                        } else if (bArr[i4] != 9) {
                            int i5 = t;
                            while (true) {
                                i5--;
                                if (i5 >= 0) {
                                    int i6 = t - i5;
                                    while (true) {
                                        i6--;
                                        if (i6 >= 0) {
                                            int i7 = (i5 * t) + i6;
                                            if (i4 != i7 && a(i7, i4)) {
                                                f92b[i4] = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (d[l & 15] != 0) {
                        f92b[i4] = b(i3, i2, l);
                    }
                }
            }
        }
    }

    private static final void b(int i2) {
        if (K != 2 && f83a != 14) {
            if (K == 0) {
                j.a((b) null, 116, (String[]) null, 2);
                return;
            } else {
                if (K == 1) {
                    j.a((b) null, 117, (String[]) null, 2);
                    return;
                }
                return;
            }
        }
        if (f108b) {
            M += i2;
            f111e.m11a(i2);
            if (M > 3000 * f116a[k].length) {
                f108b = false;
                M = 0;
                return;
            }
            return;
        }
        M -= i2;
        if (f83a != 6) {
            j += i2;
            if (f115h.i < 42 && j >= f110f[0] && k < 2) {
                j = f110f[0];
            }
            if (f115h.i < 60 && j >= f110f[1] && k < 3) {
                j = f110f[0];
            }
            f115h.m11a(i2);
            if (j >= f110f[0] && f115h.i >= 42) {
                c(2);
            }
            if (j >= f110f[1] && f115h.i >= 60) {
                c(3);
            }
            if (j >= 12000) {
                d(8);
                return;
            }
            return;
        }
        N = f114f[1].i;
        j += i2;
        f114f[1].m11a(i2);
        f114f[0].m11a(i2);
        if (N != f114f[1].i) {
            f114f[0].a(0, false);
        }
        if (f114f[0].i < 18 && j >= f109e[0] && k < 0) {
            j = f109e[0];
        }
        if (f114f[0].i < 50 && j >= f109e[1] && k < 1) {
            j = f109e[1];
        }
        if (j >= f109e[0] && f114f[1].i >= 18) {
            c(0);
        }
        if (j >= f109e[1] && f114f[1].i >= 50) {
            c(1);
        }
        if (j >= 17000) {
            K = 3;
            d(15);
        }
    }

    private static final void b(Graphics graphics, int i2) {
        if (M < -1000 || i2 < 0) {
            return;
        }
        graphics.setColor(16769709);
        int iA = j.f201a.a();
        int iMin = (Math.min(0, M) * (O + f112f.f())) / 1000;
        graphics.fillRect(0, 0, q, O + iMin);
        int iE = 0;
        while (true) {
            int i3 = iE;
            if (i3 >= q) {
                break;
            }
            f112f.a(graphics, i3, O + iMin);
            iE = i3 + f112f.e();
        }
        int i4 = M % 3000;
        int i5 = M / 3000;
        if (M < 0) {
            i5 = -1;
        }
        int iMin2 = (2 * iA) - Math.min((iA * i5) + ((Math.max(i4 - 2500, 0) * iA) / 500), iA * (f116a[i2].length - 1));
        for (int i6 = 0; i6 < f116a[i2].length; i6++) {
            if (i6 <= i5) {
                int i7 = q;
                if (i6 == i5) {
                    i7 = (i4 * q) / 2500;
                }
                graphics.setClip(0, 0, q, O);
                int length = f116a[i2][i6].length();
                int i8 = 0;
                int length2 = f116a[i2][i6].length();
                if (i6 == i5) {
                    int iMin3 = Math.min(length2, (i4 * f117g[i2]) / 2500);
                    length = iMin3;
                    if (iMin3 < 0) {
                        length = 0;
                    }
                    int i9 = 2500 / f117g[i2];
                    i8 = ((i4 % i9) * (iA >> 2)) / i9;
                }
                String strSubstring = f116a[i2][i6].substring(0, length);
                j.f201a.a(graphics, strSubstring, 4, iMin2, 20);
                if (length < length2) {
                    int iA2 = 4 + j.f201a.a(strSubstring);
                    int i10 = iMin2;
                    f111e.a(graphics, i7, i10);
                    j.f201a.a(graphics, f116a[i2][i6].charAt(length), iA2, i10 - i8, 20);
                }
                iMin2 += j.f201a.a();
            }
        }
        graphics.setClip(0, 0, q, p);
    }

    private static final void c(int i2) {
        if (f108b || i2 <= k) {
            return;
        }
        f108b = true;
        M = -1000;
        k = i2;
    }

    private static final void f(Graphics graphics) {
        int iE;
        int[] iArrM17a;
        if (K != 2 && f83a != 14) {
            a(graphics);
            return;
        }
        i.a(graphics, 0, 15513729, 15444839, 1);
        b bVar = f115h;
        if (f83a == 6) {
            bVar = f114f[1];
            iE = (-bVar.c()) + ((Math.min(j, 15000) * (bVar.e() - q)) / 17000);
        } else {
            iE = (-bVar.c()) + ((j * (bVar.e() - q)) / 12000);
        }
        int iE2 = f113g.e();
        int iF = f113g.f();
        int iAbs = (-iE2) + (Math.abs(65535 - iE) % iE2);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= p) {
                break;
            }
            int i4 = iAbs;
            while (true) {
                int i5 = i4;
                if (i5 < q) {
                    f113g.a(graphics, i5, i3);
                    i4 = i5 + iE2;
                }
            }
            i2 = i3 + iF;
        }
        bVar.a(graphics, -iE, p >> 1);
        if (f83a == 6 && (iArrM17a = bVar.m17a(1)) != null && !f114f[0].f35c && !f108b) {
            f114f[0].a(graphics, (-iE) + iArrM17a[0], (p >> 1) + iArrM17a[1]);
        }
        b(graphics, k);
    }

    private static final void g(Graphics graphics) {
        int iMin = 600 - Math.min(B, 600);
        int i2 = Q + ((((p + 22) - Q) * ((iMin * iMin) / 600)) / 600) + 0;
        a(graphics, i2);
        int iE = f121g[0].e() + 8 + f121g[0].e();
        graphics.setClip(iE, 0, q - (iE << 1), p);
        int i3 = (q >> 1) - ((m * 37) / 400);
        for (int i4 = 0; i4 < a[f84b].length; i4++) {
            byte b2 = a[f84b][i4];
            int i5 = i2;
            if (i4 == P) {
                i5 -= 5;
            }
            a(graphics, i3, i5, b2 | 16);
            if (i4 == P) {
                f105a[10][0].a(graphics, i3, i5);
            }
            if (d[b2] == 0) {
                f94c.a(graphics, i3, i5);
            } else if (d[b2] == 1) {
                f105a[11][0].a(graphics, i3, i5);
            }
            i3 += 37;
        }
        graphics.setClip(0, 0, q, p);
        j.a(graphics, f125b[c()], i2 + 13, g(), j.f201a);
    }

    public static final void a() {
        q = h.e();
        p = h.a();
    }

    public static final void b() {
        f121g = new b[]{j.m109b(655399), j.m109b(655402)};
    }

    private static final void n() {
        f.d();
        a();
        if (g == 10) {
            k();
            h.c(0);
            DCTriangle.m5a(-1, 1);
            m35h();
            j.b();
        } else if (d() == 0) {
            if (g == 20) {
                t();
                if (!f86a) {
                    m34g();
                }
            } else if (g == 30) {
                f110f = new int[2];
                f115h = j.m108a(655380);
                f115h.a(0, false);
                f112f = j.m108a(655394);
                f113g = j.m108a(655396);
                f111e = j.m108a(655398);
                f110f[0] = (12000 * ((f115h.c() + f115h.m17a(0)[0]) - (q >> 1))) / (f115h.e() - q);
                f110f[1] = (12000 * ((f115h.c() + f115h.m17a(1)[0]) - (q >> 1))) / (f115h.e() - q);
                O = 3 * j.f201a.a();
            }
        } else if (d() != 1) {
            byte[] bArr = a[f84b];
            byte b2 = bArr[bArr.length - 3];
            if (g == 20) {
                f105a = new b[f118a.length][0];
                for (int i2 = 0; i2 < f118a.length; i2++) {
                    if (i2 <= b2 || i2 > 6) {
                        f105a[i2] = new b[f118a[i2].length];
                        for (int i3 = 0; i3 < f118a[i2].length; i3++) {
                            f105a[i2][i3] = j.m108a(f118a[i2][i3]);
                        }
                    }
                }
            } else if (g == 30) {
                f97d = j.m108a(393283);
                f106a = b.m14a(458779);
                f93b = j.m108a(655482);
            } else if (g == 40) {
                int[] iArr = {524378, 524379, 524380, 524381, 524382, 524383, 524384, -1, -1, 524413};
                f102d = new b[10];
                for (int i4 = 0; i4 < 10; i4++) {
                    if (iArr[i4] != -1 && (i4 <= b2 || i4 > 6)) {
                        f102d[i4] = j.m108a(iArr[i4]);
                    }
                }
            } else if (g == 50) {
                if (f83a == 10) {
                    f119i = j.m108a(655420);
                    f119i.a = ((-f119i.e()) + f119i.c()) << 8;
                } else {
                    f119i = new b();
                    f119i.a = Integer.MAX_VALUE;
                }
            } else if (g == 60) {
                int[] iArr2 = {655405, 655407, 655411, 655412, 655413, 655414, 655415, 655416};
                f103e = new b[10];
                for (int i5 = 0; i5 < 8; i5++) {
                    if (i5 <= b2 || i5 > 6) {
                        f103e[i5] = j.m108a(iArr2[i5]);
                    }
                }
                f103e[8] = f103e[7];
                f103e[9] = f103e[7];
            } else if (g == 70) {
                f88a = j.m108a(new int[]{655417, 655419, 655418}[f84b]);
            } else if (g == 80) {
                f95a = new b[]{j.m108a(393264), j.m108a(393258)};
                f95a[1].a(0, false);
                f95a[1].m11a(65535);
            }
        } else if (g != 50) {
            if (g == 60) {
                if (f83a == 0) {
                    b[] bVarArr = new b[6];
                    bVarArr[0] = j.m108a(327718);
                    bVarArr[1] = null;
                    bVarArr[2] = j.m108a(327717);
                    bVarArr[3] = f85c < 1 ? j.m108a(327723) : null;
                    bVarArr[4] = j.m108a(327715);
                    bVarArr[5] = f85c < 2 ? j.m108a(327720) : null;
                    f96b = bVarArr;
                }
            } else if (g == 70 && f83a == 7) {
                f120j = j.m108a(327724);
            }
        }
        if (g == 90) {
            if (f83a != 7) {
                boolean z2 = d() == 2;
                b[] bVarArr2 = new b[7];
                bVarArr2[0] = z2 ? j.m108a(655423) : null;
                bVarArr2[1] = z2 ? j.m108a(655425) : null;
                bVarArr2[2] = j.a(new int[]{655428, 655430});
                bVarArr2[3] = z2 ? j.m108a(655431) : null;
                bVarArr2[4] = j.m108a(655432);
                bVarArr2[5] = z2 ? j.m108a(655434) : null;
                bVarArr2[6] = j.m108a(655436);
                f101c = bVarArr2;
                f94c = j.m108a(393257);
            }
            f121g[0].f34b = false;
            f121g[0].b(f121g[0].a() - 1);
            f121g[1].f34b = false;
            f121g[1].b(f121g[1].a() - 1);
            v();
            m33f();
        }
        g += 10;
        if (g == 100) {
            System.gc();
            h.m59c();
            b.f41a = null;
            j.a(false);
            d(f83a);
            f.a().mo1a();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m28a() {
        return f83a == 3 || f83a == 5 || f83a == 8 || f83a == 12 || f83a == 13 || f83a == 1 || f83a == 2 || f83a == 3 || f83a == 7 || f83a == 10 || f83a == 14;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static final void m29c() {
        if (g < 100) {
            g = 0;
            return;
        }
        DCTriangle.m5a(-1, 1);
        o();
        j.a(false);
        k();
    }

    private static final void o() {
        if (j.m102a()) {
            return;
        }
        if (f83a != 6 && f83a != 15 && f83a != 14) {
            if (f83a == 7) {
                DCTriangle.m5a(65537, 1);
                return;
            } else {
                DCTriangle.m5a(65540, -1);
                return;
            }
        }
        if (K >= 2 || f83a == 14) {
            if (L >= 15000) {
                DCTriangle.m5a(65540, -1);
            } else if (DCTriangle.m5a(65537, 1)) {
                L = 0;
            }
        }
    }

    private static final int g() {
        int iMax = 0;
        int length = f125b.length;
        while (true) {
            length--;
            if (length < 0) {
                return iMax;
            }
            iMax = Math.max(f125b[length].length * j.f201a.a(), iMax);
        }
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static final void m30d() {
        byte[] bArr = f89b[f84b];
        bArr[f98b[1]] = f[0];
        if (f100c) {
            return;
        }
        bArr[f98b[0]] = f[1];
    }

    private static final int h() {
        if (f85c < 3) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < f80a.length; i3 += 2) {
            if (m45b() >= f80a[i3 + 1]) {
                i2 = i3;
            }
        }
        return i2 / 2;
    }

    public static final void a(int i2) {
        int iH;
        if (g < 100) {
            n();
            return;
        }
        C += i2;
        if (d() == 2) {
            Q = p - ((24 + g()) + h.c());
            v = 52 + ((Q - 52) >> 1);
            Q += 11;
        }
        if (f83a == 6 || f83a == 15 || f83a == 14) {
            if (DCTriangle.f21d == 65537) {
                L += f.a().mo26a();
            }
            o();
        }
        j.b = Math.max(0, j.b - i2);
        if (j.f191a != 0) {
            j.c(i2);
            j.b = 0;
            if (f83a != 1 || f82a[3] != 1) {
                return;
            } else {
                j.f254b = true;
            }
        }
        j.f257h += DCTriangle.c;
        if (f83a != 7) {
            j.a(f121g, i2);
        }
        if (f85c >= 3 && ((f83a == 4 || f83a == 0) && (iH = h()) > o)) {
            o = iH;
            DCTriangle.b(5, 0);
            j.a((b) null, f80a[(o * 2) + 0], (String[]) null, 2);
            return;
        }
        if (f83a == 4) {
            int i3 = P * 400;
            int iAbs = i2 * Math.abs(P - R);
            if (i3 < m) {
                m = Math.max(m - iAbs, i3);
            } else {
                m = Math.min(m + iAbs, i3);
            }
        } else {
            m = Math.min(m + i2, 400);
        }
        n = Math.min(n + i2, 1000);
        B += i2;
        if (d() == 2) {
            for (int i4 = 0; i4 < 9; i4++) {
                j.a(f105a[i4], i2);
            }
            if (h >= 1) {
                h += i2;
            }
            j.a(f103e, i2);
        }
        switch (f83a) {
            case 0:
                if (m39a(5)) {
                    j.a((b) null, 59, (String[]) null, 2);
                } else {
                    j.a(f96b, i2);
                }
                break;
            case 1:
                if (m39a(2)) {
                    j.a((b) null, 56, (String[]) null, 2);
                } else if (m39a(3)) {
                    j.a((b) null, 57, (String[]) null, 2);
                } else if ((l & 15) != 0 && m39a(9)) {
                    j.a(f105a[12][0], 111, (String[]) null, 2);
                }
                break;
            case 2:
                J += i2;
                if (J > 1500) {
                    int i5 = G & 255;
                    f89b[f84b][i5] = (byte) (G >> 8);
                    f90a[f84b][i5] = (short) f91e;
                    J = 0;
                    v();
                    if (d[7] == 0) {
                        d[7] = 1;
                    }
                    E = f104c[f84b] - F;
                    f95a[1].a(0, false);
                    d(5);
                    h = 1;
                }
                break;
            case 3:
                j.a((b) null, 62, (String[]) null, 2);
                break;
            case 4:
                if (F != f104c[f84b]) {
                    d(5);
                } else if (d[1] == 1 && m39a(0)) {
                    j.a(f93b, 51, (String[]) null, 2);
                } else if (d[2] == 1 && m39a(10)) {
                    j.a((b) null, 110, (String[]) null, 2);
                } else if (f84b == 2 && m39a(11)) {
                    j.a((b) null, 61, (String[]) null, 2);
                } else {
                    l = c();
                }
                break;
            case 5:
                j.a(f95a, i2);
                if (f101c[2].f34b) {
                    int iMax = Math.max(1, i2 / 3);
                    if (DCTriangle.a) {
                        iMax *= 20;
                    }
                    if (F > f104c[f84b]) {
                        F = Math.max(F - iMax, f104c[f84b]);
                    } else {
                        F = Math.min(F + iMax, f104c[f84b]);
                        int iF = f();
                        if (F >= iF) {
                            F = iF;
                            f101c[2].a(1, false);
                        } else if (F == f104c[f84b]) {
                            boolean z2 = m43a(f84b) == 100;
                            boolean z3 = z2;
                            boolean z4 = z2 && F >= e() && f85c == f84b;
                            if (DCTriangle.a) {
                                z4 |= f85c == 2 && m43a(0) == 100 && m43a(1) == 100 && m43a(2) == 100;
                            }
                            if (z4) {
                                f85c++;
                                if (f85c == 3) {
                                    p();
                                }
                            }
                            DCTriangle.b(5, 0);
                            j.f254b = true;
                            if (z3) {
                                if (z4 && f85c < 3) {
                                    d(9);
                                } else if (!f126d && f85c < 3) {
                                    j.a((b) null, 50, (String[]) null, 1);
                                    d(4);
                                }
                            }
                            if (f83a == 5) {
                                d(4);
                            }
                        }
                    }
                } else if (f101c[2].f35c && f95a[1].f35c) {
                    f101c[2].a(0, true);
                    u();
                }
                break;
            case 6:
            case 14:
                b(i2);
                break;
            case 7:
                if (m39a(5)) {
                    j.a((b) null, 59, (String[]) null, 2);
                } else {
                    f120j.m11a(i2);
                    if (D == 0) {
                        h.c(3000);
                    }
                    D += i2;
                    if (D >= 5000) {
                        j.a((b) null, f79b[f84b][S + 3], (String[]) null, 2);
                    }
                }
                break;
            case 8:
                o = h();
                int i6 = f80a[(o * 2) + 0];
                int i7 = j.f257h / 1000;
                j.a((b) null, i6, 98, new String[]{Integer.toString(m45b()), Integer.toString(j.f258i), Integer.toString(j.f256d[0]), Integer.toString(j.f256d[1]), Integer.toString(j.f256d[2]), Integer.toString(i7 / 60), Integer.toString((i7 % 60) / 10), Integer.toString(i7 % 10)}, 2);
                break;
            case 9:
                j.a((b) null, 60, (String[]) null, 2);
                j.b(65537);
                break;
            case 11:
                if (f99f == 2) {
                    w += i2;
                    if (w > 1000) {
                        m30d();
                        d(4);
                    }
                }
                break;
            case 12:
                j.a(f123h[17], 75, (String[]) null, 2);
                break;
            case 13:
                j.a(f103e[f79b[f84b][S + 2]], 47, (String[]) null, 2);
                j.b(65537);
                break;
            case 15:
                if (B >= 4000 && K == 3) {
                    m39a(5);
                    j.a((b) null, 59, (String[]) null, 2);
                    B = 4000;
                    K = 4;
                } else if (B >= 8000) {
                    s();
                }
                break;
        }
        if (d() != 2) {
            i += i2;
            j.a(f123h, i2);
            return;
        }
        int length = f118a.length;
        while (true) {
            length--;
            if (length < 0) {
                j.a(f101c, i2);
                int i8 = q << 7;
                if (f119i.d != 0) {
                    f119i.f += i2;
                    if (f119i.f >= 1000) {
                        f119i.a++;
                        f119i.d = 0;
                        d(1);
                        return;
                    }
                    return;
                }
                if (f119i.a != Integer.MAX_VALUE) {
                    f119i.m11a(i2);
                    int i9 = f119i.a;
                    f119i.a += i2 * 8;
                    if (f119i.a < i8 || i9 >= i8) {
                        return;
                    }
                    f119i.a = i8;
                    f119i.d = 1;
                    return;
                }
                return;
            }
            j.a(f105a[length], i2);
        }
    }

    private static boolean a(int i2, int i3) {
        boolean z2 = false;
        if (i2 != i3) {
            byte[] bArr = f89b[f84b];
            byte b2 = bArr[i2];
            byte b3 = bArr[i3];
            bArr[i2] = b3;
            bArr[i3] = b2;
            z2 = true;
            int i4 = t;
            loop0: while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                }
                int i5 = t - i4;
                while (true) {
                    i5--;
                    if (i5 >= 0) {
                        int i6 = bArr[(i4 * t) + i5] & 15;
                        if (i6 != 9 && m41a(i5, i4) < i6) {
                            z2 = false;
                            break loop0;
                        }
                    }
                }
            }
            bArr[i2] = b2;
            bArr[i3] = b3;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static final boolean m31b(int i2, int i3) {
        int i4 = i2 & 15;
        int i5 = i2 >> 4;
        do {
            i5--;
            if (i5 < 0) {
                return false;
            }
        } while ((i4 + i5) % 6 != i3);
        return true;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static final void m32e() {
        f82a = new byte[13];
        h.a("pm", (byte[]) null);
        j();
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public static final void m33f() {
        int iE = ((q - 16) - (f121g[0].e() << 1)) - (f121g[0].e() << 1);
        if (d() == 1) {
            if (f83a != 7) {
                int[] iArr = {126, 127, 128};
                f127c = new String[3];
                for (int i2 = 0; i2 < 3; i2++) {
                    f127c[i2] = i.a(h.m57a(iArr[i2]), j.f201a, iE);
                }
                return;
            }
            return;
        }
        if (d() != 0) {
            int[] iArr2 = {137, 138, 139, 140, 141, 142, 143, 38, 39};
            f125b = new String[iArr2.length];
            for (int i3 = 0; i3 < iArr2.length; i3++) {
                String strM57a = h.m57a(iArr2[i3]);
                if (i3 <= 6) {
                    strM57a = h.a(strM57a, new String[]{Integer.toString(j.f250c[38 + i3] / 768)});
                }
                f125b[i3] = i.a(strM57a, j.f201a, iE);
            }
            return;
        }
        f116a = new String[f107d.length];
        f117g = new int[f116a.length];
        for (int i4 = 0; i4 < f116a.length; i4++) {
            f116a[i4] = i.a(h.m57a(f107d[i4]), j.f201a, q - 8);
            for (int i5 = 0; i5 < f116a[i4].length; i5++) {
                f117g[i4] = Math.max(f117g[i4], f116a[i4][i5].length());
            }
        }
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public static final void m34g() {
        f124g = h.m50a(720927);
        f122k = j.m107a(65578, false);
        int[] iArr = {327711, 327713, 327687, 262201, 262244, 262248, 262240, 262246, 262242, 393236, 393222, 393270, 393272, 393262, 393281, 393265, 393216, 393279, 393285, 393288, 458755, 458757, 393290, 458788, 524289, 655483};
        f123h = new b[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            f123h[i2] = j.m107a(iArr[i2], false);
        }
    }

    /* JADX INFO: renamed from: h, reason: collision with other method in class */
    public static final void m35h() {
        if (g >= 100) {
            g = 0;
        }
        f125b = (String[][]) null;
        f127c = (String[][]) null;
        f106a = null;
    }

    private static final void p() {
        f108b = false;
        j = 0;
        M = -1000;
        k = 1;
        d(14);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m36a() {
        int i2 = 13;
        do {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        } while (f82a[i2] != 1);
        f82a[i2] = 2;
        return i2;
    }

    private static void q() {
        int length = f81a.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int length2 = f81a[length].length;
            while (true) {
                length2--;
                if (length2 >= 0) {
                    f81a[length][length2] = true;
                }
            }
        }
        f85c = 2;
        int length3 = d.length;
        while (true) {
            length3--;
            if (length3 < 0) {
                f86a = true;
                return;
            }
            d[length3] = 2;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final void m37a(int i2, int i3) {
        if (g >= 100) {
            int iM56a = h.m56a(i2);
            boolean z2 = i3 == 0 && iM56a == 53;
            boolean z3 = false;
            if (i3 == 3) {
                if (i2 == 13) {
                    j.f254b = true;
                    DCTriangle.d(3);
                    return;
                } else {
                    int iM58b = h.m58b(i2);
                    z2 |= iM58b == 0;
                    z3 = iM58b == 2;
                }
            }
            if (DCTriangle.a && i3 == 0) {
                if (d() == 2) {
                    if (iM56a == 35) {
                        int iC = c();
                        if (iC <= 6) {
                            int iM101a = j.m101a(6);
                            f91e = (iM101a * j.f250c[iC + 38]) / 768;
                            l = iC | (iM101a << 4);
                            d(1);
                        }
                    } else if (iM56a == 42) {
                        byte[] bArr = a[f84b];
                        byte b2 = bArr[bArr.length - 3];
                        int i4 = t;
                        while (true) {
                            i4--;
                            if (i4 < 0) {
                                break;
                            }
                            int i5 = t - i4;
                            while (true) {
                                i5--;
                                if (i5 >= 0) {
                                    f89b[f84b][(i4 * t) + i5] = (byte) (96 | b2);
                                    f90a[f84b][(i4 * t) + i5] = (short) (j.f250c[b2 + 38] >> 7);
                                }
                            }
                        }
                        f126d = true;
                        j.f254b = true;
                        v();
                        d(5);
                    }
                } else if (iM56a == 42) {
                    q();
                }
            }
            if (j.f191a != 0) {
                if (j.f191a != 500) {
                    if (z2) {
                        j.c(500);
                        return;
                    }
                    return;
                }
                j.f192a.c(i2, i3);
                if (z2 || z3) {
                    int iM36a = m36a();
                    j.f();
                    if (f83a == 8) {
                        d(12);
                        return;
                    }
                    if (f83a == 9) {
                        f84b++;
                        d(0);
                        return;
                    }
                    if (f83a == 6) {
                        if (K == 0) {
                            K = 1;
                            k();
                            return;
                        } else {
                            if (K == 1) {
                                K = 2;
                                k();
                                return;
                            }
                            return;
                        }
                    }
                    if (f83a == 13) {
                        j.b = 0;
                        d(5);
                        return;
                    }
                    if (f83a == 7) {
                        if (iM36a != -1) {
                            k();
                            return;
                        }
                        j.b = 0;
                        h = 0;
                        d(5);
                        return;
                    }
                    if (f83a == 12) {
                        if (z2) {
                            d(0);
                            return;
                        } else {
                            f83a = 4;
                            DCTriangle.d(3);
                            return;
                        }
                    }
                    if (f83a == 3) {
                        d(5);
                        return;
                    } else {
                        a(0);
                        k();
                        return;
                    }
                }
                return;
            }
            if (f83a == 7) {
                if (z2) {
                    D = 65535;
                    return;
                }
                return;
            }
            if (f83a == 14) {
                if (z2) {
                    if (f108b) {
                        M = 0;
                        f108b = false;
                        return;
                    }
                    if (j < f110f[0] || f115h.i < 42) {
                        f115h.b(42);
                        j = f110f[0];
                        return;
                    } else if (j >= f110f[1] && f115h.i >= 60) {
                        d(8);
                        return;
                    } else {
                        f115h.b(60);
                        j = f110f[1];
                        return;
                    }
                }
                return;
            }
            if (f83a == 15) {
                if (z2) {
                    B += 4000;
                    return;
                }
                return;
            }
            if (f83a == 1 || f83a == 11) {
                if (f83a != 1) {
                    if (z2) {
                        int i6 = (y * t) + x;
                        if (f99f == 0) {
                            if (f89b[f84b][i6] != 9) {
                                int[] iArr = f98b;
                                int i7 = f99f;
                                f99f = i7 + 1;
                                iArr[i7] = i6;
                                m();
                            } else {
                                j.a((b) null, 42, (String[]) null, 1);
                            }
                        } else if (f99f == 1) {
                            if (f92b[i6]) {
                                int[] iArr2 = f98b;
                                int i8 = f99f;
                                f99f = i8 + 1;
                                iArr2[i8] = i6;
                                f[0] = f89b[f84b][f98b[0]];
                                f89b[f84b][f98b[0]] = 9;
                                short s2 = f90a[f84b][i6];
                                f90a[f84b][i6] = f90a[f84b][f98b[0]];
                                f90a[f84b][f98b[0]] = s2;
                                f100c = f89b[f84b][i6] == 9;
                                if (!f100c) {
                                    f[1] = f89b[f84b][i6];
                                    f89b[f84b][i6] = 9;
                                    w = 0;
                                }
                                j.f254b = true;
                                k();
                            } else if (f98b[0] == i6) {
                                z3 = true;
                            } else {
                                j.a((b) null, 41, (String[]) null, 1);
                            }
                        }
                    }
                    if (z3) {
                        if (f99f == 1) {
                            f99f = 0;
                            m();
                        } else if (f99f == 0) {
                            d(4);
                        }
                    }
                } else if (z2) {
                    w();
                } else if (z3) {
                    m();
                    d(4);
                }
                if (i3 == 0) {
                    z = x;
                    A = y;
                    if (iM56a == 52) {
                        int i9 = x - 1;
                        x = i9;
                        if (i9 < 0) {
                            x = (t - y) - 1;
                        }
                        m = 0;
                        return;
                    }
                    if (iM56a == 54) {
                        int i10 = x + 1;
                        x = i10;
                        if (i10 >= t - y) {
                            x = 0;
                        }
                        m = 0;
                        return;
                    }
                    if (iM56a == 50) {
                        int i11 = y + 1;
                        y = i11;
                        if (i11 >= t) {
                            y = 0;
                            x = t >> 1;
                        }
                        x = Math.min(x, (t - y) - 1);
                        m = 0;
                        return;
                    }
                    if (iM56a == 56) {
                        int i12 = y - 1;
                        y = i12;
                        if (i12 < 0) {
                            y = t - 1;
                            x = 0;
                        }
                        m = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            if (f83a == 0) {
                if (z2) {
                    if (f85c < f84b) {
                        j.a((b) null, 45, (String[]) null, 0);
                        return;
                    } else {
                        r();
                        d(4);
                        return;
                    }
                }
                if (i3 == 0) {
                    int i13 = f84b;
                    if (iM56a == 52) {
                        f84b += 2;
                        f121g[0].a(0, false);
                    } else if (iM56a == 54) {
                        f84b++;
                        f121g[1].a(0, false);
                    }
                    if (i13 != f84b) {
                        u = i13;
                        f84b %= 3;
                        n = 0;
                        j.f254b = true;
                        return;
                    }
                    return;
                }
                return;
            }
            if (f83a == 6) {
                if (z2) {
                    if (f108b) {
                        M = 0;
                        f108b = false;
                        return;
                    }
                    if (j < f109e[0] || f114f[1].i < 18) {
                        f114f[1].b(18);
                        j = f109e[0];
                        return;
                    } else if (j >= f109e[1] && f114f[1].i >= 50) {
                        j = 17000;
                        return;
                    } else {
                        f114f[1].b(50);
                        j = f109e[1];
                        return;
                    }
                }
                return;
            }
            if (f83a != 4) {
                if (f83a == 10 && z2) {
                    f119i.a = Integer.MAX_VALUE;
                    d(1);
                    return;
                }
                return;
            }
            int iC2 = c();
            if (!z2) {
                if (i3 == 0) {
                    R = P;
                    int length = a[f84b].length;
                    if (iM56a == 52) {
                        P += length - 1;
                        f121g[0].a(0, false);
                    } else if (iM56a == 54) {
                        P++;
                        f121g[1].a(0, false);
                    }
                    P %= length;
                    if (R != P) {
                        l = c();
                        j.f254b = true;
                        m();
                        return;
                    }
                    return;
                }
                return;
            }
            if (iC2 == 7) {
                if (m43a(f84b) == 0) {
                    j.a((b) null, 43, (String[]) null, 0);
                    return;
                }
                if (m38b()) {
                    f99f = 0;
                    w = 0;
                    d(11);
                } else {
                    j.a((b) null, 40, (String[]) null, 0);
                }
                d[7] = 2;
                return;
            }
            if (iC2 == 8) {
                d(0);
                return;
            }
            if (d[iC2] == 0) {
                j.a((b) null, 48, (String[]) null, 0);
            } else if (m38b()) {
                s();
            } else {
                j.a((b) null, 46, (String[]) null, 0);
            }
        }
    }

    private static void r() {
        F = f104c[f84b];
        P = 0;
        l = c();
        m = 400 * P;
        x = 0;
        y = 0;
        h = 0;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static final boolean m38b() {
        int length = f92b.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!f92b[length]);
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m39a(int i2) {
        if (f82a[i2] == 2) {
            return false;
        }
        f82a[i2] = 1;
        return true;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static final int m40b(int i2) {
        int i3 = 0;
        byte b2 = e[i2];
        byte[] bArr = f89b[i2];
        int i4 = b2;
        while (true) {
            i4--;
            if (i4 < 0) {
                return i3;
            }
            int i5 = b2 - i4;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    if (bArr[i5 + (i4 * b2)] == 9) {
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final int m41a(int i2, int i3) {
        byte[] bArr = f89b[f84b];
        int i4 = 0;
        int i5 = 6;
        while (true) {
            i5--;
            if (i5 < 0) {
                return i4;
            }
            int i6 = i2;
            int i7 = i3;
            if (i5 == 0) {
                i7--;
            } else if (i5 == 1) {
                i6--;
            } else if (i5 == 2) {
                i6--;
                i7++;
            } else if (i5 == 3) {
                i7++;
            } else if (i5 == 4) {
                i6++;
            } else {
                i6++;
                i7--;
            }
            if (i7 >= 0 && i7 < t && i6 >= 0 && i6 + i7 < t && m31b((int) bArr[(i7 * t) + i6], (i5 + 3) % 6)) {
                i4++;
            }
        }
    }

    private static void s() {
        int i2;
        int i3;
        d[l] = 2;
        int i4 = 2;
        loop0: while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            i2 = 0;
            while (i2 < t) {
                i3 = 0;
                while (i3 < t - i2) {
                    if (f92b[(i2 * t) + i3] && (i4 == 0 || f89b[f84b][(i2 * t) + i3] == 9)) {
                        break loop0;
                    } else {
                        i3++;
                    }
                }
                i2++;
            }
        }
        x = i3;
        y = i2;
        j.f204c = 38 + l;
        DCTriangle.b = 2;
        j.c();
    }

    public static final void i() {
        int i2;
        if (DCTriangle.a || !f86a) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.write(f85c);
            dataOutputStream.write(f87d);
            i2 = 3;
        } catch (IOException unused) {
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            int length = f89b[i2].length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                dataOutputStream.writeByte(f89b[i2][length]);
                dataOutputStream.writeShort(f90a[i2][length]);
            }
            int length2 = f81a[i2].length;
            while (true) {
                length2--;
                if (length2 >= 0) {
                    dataOutputStream.writeBoolean(f81a[i2][length2]);
                }
            }
            h.a("pm", byteArrayOutputStream.toByteArray());
        }
        int i3 = 9;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            } else {
                dataOutputStream.writeByte(d[i3]);
            }
            h.a("pm", byteArrayOutputStream.toByteArray());
        }
        dataOutputStream.writeInt(j.f258i);
        dataOutputStream.writeInt(j.f257h);
        int length3 = j.f256d.length;
        while (true) {
            length3--;
            if (length3 < 0) {
                break;
            } else {
                dataOutputStream.writeInt(j.f256d[length3]);
            }
            h.a("pm", byteArrayOutputStream.toByteArray());
        }
        int length4 = f130a.length;
        while (true) {
            length4--;
            if (length4 < 0) {
                break;
            } else {
                dataOutputStream.writeBoolean(f130a[length4]);
            }
            h.a("pm", byteArrayOutputStream.toByteArray());
        }
        dataOutputStream.writeByte(o);
        dataOutputStream.close();
        h.a("pm", byteArrayOutputStream.toByteArray());
    }

    private static final void t() {
        f114f = new b[]{j.m108a(524415), j.m108a(589824)};
        f114f[0].a(0, false);
        f114f[1].a(0, false);
        j = 0;
        k = -1;
        f109e = new int[2];
        f109e[0] = (17000 * ((f114f[1].c() + f114f[1].m17a(0)[0]) - (q >> 1))) / (f114f[1].e() - q);
        f109e[1] = (17000 * ((f114f[1].c() + f114f[1].m17a(1)[0]) - (q >> 1))) / (f114f[1].e() - q);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean[], boolean[][]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [short[], short[][]] */
    public static final void j() {
        DataInputStream dataInputStream;
        int i2;
        f89b = new byte[3];
        f81a = new boolean[3];
        f90a = new short[3];
        f104c = new int[3];
        int i3 = 3;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            f81a[i3] = new boolean[f79b[i3].length / 4];
            f89b[i3] = new byte[e[i3] * e[i3]];
            f90a[i3] = new short[f89b[i3].length];
            int length = f89b[i3].length;
            while (true) {
                length--;
                if (length >= 0) {
                    f89b[i3][length] = 9;
                }
            }
        }
        d = new byte[9];
        d[0] = 1;
        d[8] = 2;
        f85c = 0;
        f86a = false;
        f87d = 0;
        j.f258i = 0;
        j.f257h = 0;
        j.f256d = new int[4];
        P = 0;
        l = 0;
        f130a = new boolean[j.f250c.length];
        L = 0;
        o = -1;
        byte[] bArrA = h.a("pm");
        if (bArrA != null) {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrA));
                f85c = dataInputStream.read();
                f87d = dataInputStream.read();
                i2 = 3;
            } catch (IOException unused) {
            }
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                int length2 = f89b[i2].length;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    f89b[i2][length2] = dataInputStream.readByte();
                    f90a[i2][length2] = dataInputStream.readShort();
                }
                int length3 = f81a[i2].length;
                while (true) {
                    length3--;
                    if (length3 >= 0) {
                        f81a[i2][length3] = dataInputStream.readBoolean();
                    }
                }
                f86a = true;
            }
            int i4 = 9;
            while (true) {
                i4--;
                if (i4 < 0) {
                    break;
                } else {
                    d[i4] = dataInputStream.readByte();
                }
                f86a = true;
            }
            j.f258i = dataInputStream.readInt();
            j.f257h = dataInputStream.readInt();
            int length4 = j.f256d.length;
            while (true) {
                length4--;
                if (length4 < 0) {
                    break;
                } else {
                    j.f256d[length4] = dataInputStream.readInt();
                }
                f86a = true;
            }
            int length5 = f130a.length;
            while (true) {
                length5--;
                if (length5 < 0) {
                    break;
                } else {
                    f130a[length5] = dataInputStream.readBoolean();
                }
                f86a = true;
            }
            o = dataInputStream.readByte();
            dataInputStream.close();
            f86a = true;
        }
        v();
        for (int i5 = 0; i5 <= Math.min(f85c, 2); i5++) {
            f84b = i5;
            F = f104c[f84b];
            int iM42i = m42i();
            while (true) {
                int i6 = iM42i;
                if (i6 != -1) {
                    f81a[f84b][i6 / 4] = true;
                    if (f79b[f84b][i6 + 1] == 0) {
                        d[f79b[f84b][i6 + 2]] = 1;
                    }
                    iM42i = m42i();
                }
            }
        }
    }

    private static void d(int i2) {
        h.c(0);
        j.f254b = true;
        n = 0;
        B = 0;
        int iD = d();
        f83a = i2;
        if (d() != iD) {
            g = 0;
        }
        if (i2 == 4) {
            m = 400 * P;
        } else if (i2 == 6 || i2 == 14) {
            K = 0;
            L = 0;
        }
        if (g >= 100) {
            t = e[f84b];
            if (d() == 2) {
                m();
            }
            a(0);
            o();
        }
        k();
    }

    private static final void u() {
        int iM42i = m42i();
        S = iM42i;
        f81a[f84b][iM42i / 4] = true;
        int i2 = f79b[f84b][iM42i + 1];
        int i3 = f79b[f84b][iM42i + 2];
        if (i2 == 2) {
            if (m43a(f84b) == 100) {
                d(5);
                return;
            } else {
                d(3);
                return;
            }
        }
        if (i2 == 1) {
            T = i3;
            D = 0;
            d(7);
        } else {
            d[i3] = 1;
            P = i3;
            l = c();
            d(13);
        }
    }

    /* JADX INFO: renamed from: i, reason: collision with other method in class */
    private static final int m42i() {
        int[] iArr = f79b[f84b];
        for (int i2 = 0; i2 < iArr.length; i2 += 4) {
            if (!f81a[f84b][i2 / 4] && F >= iArr[i2]) {
                F = iArr[i2];
                return i2;
            }
        }
        return -1;
    }

    public static final void k() {
        h.m54b();
        if (g >= 100) {
            if (j.f191a != 0) {
                if (j.f191a == 500) {
                    if (f83a != 12) {
                        h.b(1, 0);
                        return;
                    } else {
                        h.b(2, 0);
                        h.b(7, 0);
                        return;
                    }
                }
                return;
            }
            if (f83a == 1) {
                h.b(22, 0);
                h.b(25, 0);
                return;
            }
            if (f83a == 0) {
                h.b(0, 0);
                h.b(13, 0);
                return;
            }
            if (f83a == 4) {
                h.b(0, 0);
                h.b(13, 0);
                return;
            }
            if (f83a == 6 || f83a == 14 || f83a == 15) {
                h.b(14, 0);
                return;
            }
            if (f83a == 10) {
                h.b(14, 0);
                return;
            }
            if (f83a == 7) {
                h.b(14, 0);
            } else {
                if (f83a != 11 || f99f == 2) {
                    return;
                }
                h.b(0, 0);
                h.b(11, 0);
            }
        }
    }

    private static boolean b(int i2, int i3, int i4) {
        return m41a(i2, i3) >= (i4 & 15);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final int m43a(int i2) {
        byte b2 = e[i2];
        int i3 = (b2 * (b2 + 1)) >> 1;
        return ((i3 - m40b(i2)) * 100) / i3;
    }

    /* JADX INFO: renamed from: j, reason: collision with other method in class */
    private static int m44j() {
        int i2 = 0;
        int iM40b = 0;
        int i3 = 3;
        while (true) {
            i3--;
            if (i3 < 0) {
                return ((i2 - iM40b) * 100) / i2;
            }
            i2 += (e[i3] * (e[i3] + 1)) >> 1;
            iM40b += m40b(i3);
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final int m45b() {
        return f104c[0] + f104c[1] + f104c[2];
    }

    private static final void v() {
        int i2 = 3;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            f104c[i2] = 0;
            byte b2 = e[i2];
            int i3 = b2;
            while (true) {
                i3--;
                if (i3 >= 0) {
                    int i4 = b2 - i3;
                    while (true) {
                        i4--;
                        if (i4 >= 0) {
                            int[] iArr = f104c;
                            iArr[i2] = iArr[i2] + f90a[i2][(i3 * b2) + i4];
                        }
                    }
                }
            }
        }
    }

    public static final void l() {
        g = 0;
        h.m54b();
    }

    private static void w() {
        if (!b(x, y, l)) {
            int i2 = l & 15;
            j.a(f103e[i2], 119, new int[]{-1, 120, 121, 122, 123, 124, 125}[i2], (String[]) null, 0);
            return;
        }
        G = (l << 8) | ((y * t) + x);
        b(x, y);
        H = f128h[0];
        I = f128h[1];
        f126d = m43a(f84b) == 100;
        d(2);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static int m46c(int i2) {
        int i3 = i2 << 1;
        int i4 = ((f124g[i3] << 8) | (f124g[i3 + 1] & 255)) + 1;
        return (short) ((f124g[i4] << 8) | (f124g[i4 + 1] & 255));
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    private static int m47d(int i2) {
        int i3 = i2 << 1;
        int i4 = (f124g[i3] << 8) | (f124g[i3 + 1] & 255);
        return (short) ((f124g[i4 + 3] << 8) | (f124g[i4 + 4] & 255));
    }
}
