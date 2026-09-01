package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:DCTriangle.class */
public class DCTriangle extends f {
    public static boolean a;
    private static int e;
    private static int f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f1a;
    private static int g;
    public static int b;
    private static int h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f2a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static boolean f3b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static long f4a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public static long f5b;
    public static int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f6a;
    private static int i;
    private static int j;
    private static boolean d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private static boolean f7e;
    private static int k;
    private static int l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f10a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image[] f11b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f12b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static Image f13c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static Image f14d;
    private static int m;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static c f18a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static k f19a;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static boolean f20f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f0a = {50, 54, 50, 52, 51, 54, 56};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static i[] f8a = new i[23];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f9a = new int[23];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[] f15b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static int[] f16c = new int[5];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f17a = new int[2][5];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public static int f21d = -1;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static boolean f22g = true;

    private static final void e() {
        int iM56a = h.m56a(i);
        if (j == 0 && f1a == 2) {
            if (i == f0a[e]) {
                e++;
                if (e == f0a.length) {
                    e = 0;
                    a = true;
                    d(20);
                }
            } else {
                e = 0;
            }
        }
        if (a && j == 0 && iM56a == 48) {
            h.f();
            f.a().a(0);
            return;
        }
        switch (f1a) {
            case 2:
                f8a[l].c(i, j);
                if (l == 1) {
                    h.a(0, h.m51a()[f8a[1].f168c][1]);
                }
                break;
            case 3:
            case 4:
                if (j == 0) {
                    f15b[3] = 65535;
                }
                break;
            case 5:
                if (b != 2) {
                    g.m37a(i, j);
                } else {
                    j.m98a(i, j);
                }
                break;
            case 6:
                a.a(i, j);
                break;
            case 7:
                f18a.a(i, j);
                break;
            case 8:
                e.a(i, j);
                break;
            case 9:
                f19a.a(i, j);
                break;
        }
    }

    @Override // defpackage.f
    public final void a(int i2, int i3) {
        if (i3 == 2 || f15b[7] > 0) {
            return;
        }
        if (!d) {
            i = i2;
            j = i3;
            d = true;
            f7e = false;
        }
        f7e |= i2 == i && j == 0 && i3 == 1;
    }

    private static final void f() {
        if (h.m66b(3) != null) {
            f18a = h.m68a();
        }
        f19a = h.m67a();
    }

    private static final void g() {
        String[] strArr = {h.m57a(130), h.m57a(131), h.m57a(132), h.m57a(176)};
        String[] strArr2 = {h.m57a(133), h.m57a(134), h.m57a(135), h.m57a(150)};
        if (f2a == null) {
            f2a = new Image[]{h.m53a(65548), h.m53a(65549), h.m53a(65550), null};
        }
        e.a(strArr, null, strArr2, f2a);
    }

    @Override // defpackage.f
    public final void a(int i2) {
        g.a();
        j.e();
        if (i2 == 2) {
            c(0);
            return;
        }
        if (i2 != 0) {
            if (i2 == 5) {
                c(9);
                f15b[8] = 2;
                f15b[9] = 3;
                return;
            }
            return;
        }
        i.a();
        f21d = -1;
        if (f1a == 5) {
            m4b();
            return;
        }
        if (f1a == 7 || f1a == 6 || f1a == 8 || f1a == 9 || f1a != 0) {
            return;
        }
        f22g = false;
    }

    private static final void h() {
        if (j.f191a != 0) {
            j.f191a = 0;
            j.a(j.f194a, j.f195a[2], j.f195a[3], j.f193a, j.f195a[4]);
        }
        if (b == 2) {
            if (j.f249g >= 100) {
                j.d();
            }
        } else if (g.g >= 100) {
            g.m33f();
        }
    }

    @Override // defpackage.f
    /* JADX INFO: renamed from: a */
    public final int mo26a() {
        return c;
    }

    @Override // defpackage.f
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void mo1a() {
        f5b = System.currentTimeMillis();
    }

    @Override // defpackage.f
    public final int b() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String[], java.lang.String[][]] */
    @Override // defpackage.f
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String[][] mo2a() {
        return new String[]{new String[]{h.m57a(7)}, new String[]{h.m57a(8)}};
    }

    @Override // defpackage.f
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String mo3a(int i2) {
        return Integer.toString(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    @Override // defpackage.f
    public final void b(int i2) throws MIDletStateChangeException {
        if (d) {
            e();
            d = false;
            if (f7e) {
                a(i, 1);
            }
        }
        if (f != 1) {
            f15b[7] = 2;
            j();
        }
        if (f1a == 2 && k != 0) {
            f15b[7] = 2;
            i();
        }
        f4a = System.currentTimeMillis();
        int i3 = (int) (f4a - f5b);
        if (i3 >= 25) {
            c = i3;
            int iMin = Math.min(c, 200);
            f5b = f4a;
            if (f1a != 5) {
                g.i += iMin;
            }
            switch (f1a) {
                case 0:
                    m();
                    break;
                case 2:
                    l();
                    break;
                case 3:
                    int[] iArr = f15b;
                    iArr[3] = iArr[3] + c;
                    if (f15b[3] >= 3000) {
                        c(4);
                    }
                    break;
                case 4:
                    int[] iArr2 = f15b;
                    iArr2[3] = iArr2[3] + c;
                    if (f15b[3] >= 8600) {
                        d(3);
                    }
                    break;
                case 5:
                    if (b != 2) {
                        g.a(iMin);
                    } else {
                        j.a(iMin);
                    }
                    break;
                case 6:
                    if (a.a(iMin) != 0) {
                        a.a((String) null);
                        d(3);
                    }
                    break;
                case 7:
                    if (f18a.m19a(iMin) == 1) {
                        d(3);
                    }
                    break;
                case 8:
                    int iA = e.a(iMin);
                    if (iA != 0) {
                        if (iA == 1) {
                            f20f = true;
                        }
                        f2a = null;
                        e.a(null, null, null, null);
                        d(3);
                    }
                    break;
                case 9:
                    int iM110a = f19a.m110a(iMin);
                    if (iM110a != 0) {
                        f3b = iM110a == 4;
                        f8a[10] = null;
                        if (iM110a == 3 && f15b[8] == 5) {
                            d(3);
                        } else if (f15b[8] != 2) {
                            c(f15b[8]);
                        } else {
                            d(f15b[9]);
                        }
                    }
                    break;
            }
            int[] iArr3 = f15b;
            iArr3[7] = iArr3[7] - 1;
        }
    }

    public static final void c(int i2) {
        f15b[6] = 1;
        h.m54b();
        if (i2 == 5 && f19a.a(3)) {
            f15b[8] = 5;
            i2 = 9;
        }
        f15b[3] = 0;
        f = i2;
    }

    public static final void d(int i2) {
        c(2);
        k = i2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final void m4b() {
        c();
        j.m100g();
        if (b == 1 && g.f83a == 11 && g.f99f == 2) {
            g.m30d();
            g.f83a = 4;
        }
        h.c(0);
        h = b;
        d(5);
    }

    private static final void i() {
        if (f9a[k] == 0) {
            f9a[k] = l;
        }
        l = k;
        g(l);
        if (l == 3) {
            f11b = null;
            f8a[1] = null;
            f8a[2] = null;
        }
        t();
        if (l != 2 && l != 1 && !f20f) {
            if (l == 6 || l == 5) {
                m5a(-1, 1);
            } else {
                m5a(65540, -1);
            }
        }
        f20f = false;
        f8a[l].b();
        k = 0;
        f.a().mo1a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void j() {
        switch (f) {
            case 0:
                f15b[0] = 0;
                break;
            case 3:
                h.m54b();
                f15b[0] = 0;
                break;
            case 4:
                m5a(65538, 1);
                break;
            case 5:
                if (f15b[5] != 0 && h == 1) {
                    g.m29c();
                }
                f15b[5] = 0;
                break;
            case 6:
                m5a(-1, 1);
                k();
                break;
            case 7:
                m5a(-1, 1);
                f18a.m22b();
                f18a.a(0);
                f18a.m19a(1);
                break;
            case 8:
                m5a(-1, 1);
                g();
                break;
            case 9:
                m5a(-1, 1);
                f19a.a();
                break;
        }
        f1a = f;
        f = 1;
        f.a().mo1a();
    }

    private static final void k() {
        a.a();
        a.a(h.m57a(32));
    }

    private static final void f(int i2) {
        g = i2;
        if (f15b[5] != 0 && b == 2 && j.f249g >= 100) {
            if (j.f204c != 45) {
                d(21);
                return;
            } else if (j.f248f != 1) {
                d(22);
                return;
            }
        }
        if (i2 != 102) {
            b = 2;
            j.f204c = 45;
            j.c();
            c(5);
            return;
        }
        b = 1;
        if (!g.f86a) {
            g.f108b = false;
            g.k = -1;
            g.j = 0;
            g.f83a = 6;
            g.f82a[8] = 0;
        } else if (!g.m28a()) {
            g.f83a = 0;
        }
        g.l();
        c(5);
        g.k();
    }

    private static final void l() {
        i iVar = f8a[l];
        int[] iArrM71a = iVar.m71a(c);
        if (iArrM71a != null) {
            if (iArrM71a[0] == 1) {
                int i2 = iArrM71a[1];
                if (i2 > 0 && i2 < 23) {
                    d(i2);
                } else if (i2 == 103) {
                    c(7);
                } else if (i2 == 104) {
                    c(8);
                } else if (i2 == 105) {
                    c(6);
                } else if (i2 == 109) {
                    f15b[8] = 2;
                    f15b[9] = 3;
                    f19a.a(4);
                    c(9);
                } else if (i2 == 110) {
                    j.c();
                    c(5);
                } else if (i2 == 102) {
                    f(102);
                } else if (i2 == 108) {
                    f(108);
                } else if (i2 == 107) {
                    c(5);
                    if (b == 2) {
                        j.h();
                    } else {
                        g.m29c();
                    }
                } else if (i2 == 106) {
                    h.m63b(iVar.m73a(2));
                    boolean z = h.d() != 0;
                    boolean z2 = z;
                    if (z) {
                        h.f();
                    }
                    if (z2) {
                        h.a(65541, 1);
                    }
                } else if (i2 == 114) {
                    boolean z3 = iVar.m73a(3) != 0;
                    boolean z4 = z3;
                    h.b(z3);
                    if (z4) {
                        h.c(200);
                    }
                } else if (i2 == 100) {
                    f15b[4] = iVar.f168c;
                    h.m61a(f15b[4]);
                    s();
                    n();
                } else if (i2 == 101) {
                    f15b[4] = iVar.f168c;
                    h.m61a(f15b[4]);
                    b(2, 6);
                    s();
                    f8a = new i[23];
                    g(7);
                    h();
                }
            } else if (iArrM71a[0] == 0) {
                int i3 = iArrM71a[1];
                switch (l) {
                    case 2:
                        if (i3 != 2) {
                            h.m63b(0);
                        } else if (h.d() == 0) {
                            h.m63b(3);
                        }
                        b(3, -1);
                        break;
                    case 3:
                        d(4);
                        break;
                    case 4:
                    case 17:
                        if (i3 != 2) {
                            d(f9a[l]);
                        } else {
                            f.a().c = true;
                        }
                        break;
                    case 5:
                        f15b[5] = 1;
                        b(2, 3);
                        break;
                    case 6:
                        b(2, f9a[l]);
                        break;
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        if (i3 == 5) {
                            d(f9a[l]);
                        }
                        break;
                    case 8:
                        if (i3 != 2) {
                            d(f9a[l]);
                        } else {
                            f15b[2] = 1;
                            b(2, 3);
                        }
                        break;
                    case 21:
                        if (i3 != 2) {
                            d(f9a[l]);
                        } else {
                            f15b[5] = 0;
                            f(g);
                        }
                        break;
                    case 22:
                        if (i3 != 2) {
                            d(f9a[l]);
                        } else {
                            f15b[5] = 0;
                            f(g);
                        }
                        break;
                }
            }
        }
        o();
    }

    public static final void c() {
        f15b[7] = 2;
        h.m54b();
        f15b[6] = 1;
        h.m52a();
    }

    private static final void m() {
        int i2 = f15b[0];
        if (i2 == 10) {
            b.m13b();
            j.a();
            h.a(j.f201a);
            r();
            s();
        } else if (i2 == 20) {
            f11b = new Image[]{h.m53a(65545), b.m14a(131081), h.m53a(65544)};
            f14d = h.m53a(65542);
        } else if (i2 != 30) {
            if (i2 == 40) {
                j.a(h.m50a(65536), 38);
            } else if (i2 == 50) {
                g.b();
                g.j();
            } else if (i2 == 60) {
                g.m34g();
                j.a(false);
            } else if (i2 == 70) {
                f();
            } else if (i2 == 80) {
                f12b = b.m14a(524291);
            }
        }
        int[] iArr = f15b;
        iArr[0] = iArr[0] + 10;
        if (f15b[0] == 100) {
            if (f15b[1] == 0) {
                d(1);
            } else {
                n();
            }
        }
    }

    private static final void n() {
        if (!f19a.a(2)) {
            d(2);
            return;
        }
        c(9);
        f15b[8] = 2;
        f15b[9] = 2;
    }

    public static final void b(int i2, int i3) {
        boolean z = !f3b;
        j.b = 0;
        c();
        if (!a && z) {
            q();
        }
        if (f15b[2] == 1) {
            m++;
            g.m32e();
            j.f199a = false;
            f15b[2] = 0;
            f15b[5] = 0;
        }
        h.a(z);
        g.i();
        h.a(true);
        p();
        f.a().mo1a();
        f = i2;
        k = i3;
    }

    private static final void o() {
        int iD = h.d();
        char c2 = 6;
        int i2 = 2;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (f8a[c2] != null) {
                f8a[c2].d(2, iD);
                f8a[c2].d(3, h.m49a() ? 1 : 0);
            }
            c2 = 5;
        }
    }

    private static final void p() {
        int i2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeBoolean(j.f199a);
            dataOutputStream.write(h.d());
            dataOutputStream.write(f15b[4]);
            dataOutputStream.writeBoolean(h.m49a());
            dataOutputStream.writeInt(m);
            i2 = 5;
        } catch (Exception unused) {
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            dataOutputStream.writeInt(f16c[i2]);
            dataOutputStream.writeInt(f17a[0][i2]);
            dataOutputStream.writeInt(f17a[1][i2]);
            h.a("s", byteArrayOutputStream.toByteArray());
        }
        int i3 = 13;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            } else {
                dataOutputStream.writeByte(g.f82a[i3]);
            }
            h.a("s", byteArrayOutputStream.toByteArray());
        }
        dataOutputStream.close();
        h.a("s", byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final boolean m5a(int i2, int i3) {
        if (i2 == f21d || !f22g) {
            f22g = true;
            return false;
        }
        if (h.d() != 0) {
            if (i2 == -1) {
                h.f();
            } else {
                h.a(i2, i3);
                h.m59c();
            }
        }
        f21d = i2;
        f22g = true;
        return true;
    }

    private static final void q() {
        int iM45b = g.m45b();
        int iM90a = j.m90a();
        int[] iArr = f17a[1];
        int[] iArr2 = f17a[0];
        if (iM45b > iArr[4]) {
            boolean z = false;
            int i2 = 5;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                if (f16c[i2] == m) {
                    z = true;
                    if (iM45b > iArr[i2]) {
                        iArr[i2] = iM45b;
                    }
                }
            }
            if (!z) {
                f16c[4] = m;
                iArr[4] = iM45b;
            }
        }
        iArr2[4] = Math.max(iArr2[4], iM90a);
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4 - i3; i4++) {
                if (iArr[i4 + 1] > iArr[i4]) {
                    int i5 = iArr[i4];
                    iArr[i4] = iArr[i4 + 1];
                    iArr[i4 + 1] = i5;
                    int i6 = f16c[i4];
                    f16c[i4] = f16c[i4 + 1];
                    f16c[i4 + 1] = i6;
                }
                if (iArr2[i4 + 1] > iArr2[i4]) {
                    int i7 = iArr2[i4];
                    iArr2[i4] = iArr2[i4 + 1];
                    iArr2[i4 + 1] = i7;
                }
            }
        }
        if (h.m66b(3) == null) {
            return;
        }
        f18a.a();
        int i8 = 5;
        while (true) {
            i8--;
            if (i8 < 0) {
                return;
            }
            f18a.a(1, new int[]{iArr[i8]}, null);
            f18a.a(0, new int[]{iArr2[i8]}, null);
        }
    }

    public static final void e(int i2) {
        if (h.m66b(3) == null || a || f3b) {
            return;
        }
        f18a.a(-1, new int[]{Math.max(1, i2)}, null);
        f.a().mo1a();
    }

    private static final void r() {
        byte[] bArrA = h.a("s");
        h.m63b(3);
        h.b(true);
        m = 1;
        f15b[4] = h.b();
        f15b[1] = 0;
        if (h.m66b(7) != null || h.m51a().length == 1) {
            f15b[1] = 1;
        }
        if (bArrA == null) {
            return;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArrA));
            j.f199a = dataInputStream.readBoolean();
            h.m63b(dataInputStream.read());
            f15b[1] = 1;
            f15b[4] = dataInputStream.read();
            h.m61a(f15b[4]);
            h.b(dataInputStream.readBoolean());
            m = dataInputStream.readInt();
            int i2 = 5;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                f16c[i2] = dataInputStream.readInt();
                f17a[0][i2] = dataInputStream.readInt();
                f17a[1][i2] = dataInputStream.readInt();
            }
            int i3 = 13;
            while (true) {
                i3--;
                if (i3 < 0) {
                    dataInputStream.close();
                    return;
                }
                g.f82a[i3] = dataInputStream.readByte();
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(Graphics graphics, boolean z) {
        int iA = h.a();
        int iE = h.e();
        i.a(graphics, 0, 13670964, 6699277, 1);
        j.a(graphics, f12b, 0, 0, iE, iA);
        if (z) {
            graphics.drawImage(f14d, iE >> 1, iA >> 1, 3);
        }
    }

    @Override // defpackage.f
    public final void a(Graphics graphics) {
        int iE = h.e();
        int iA = h.a();
        switch (f1a) {
            case 0:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, iE, iA);
                i.a(graphics, f15b[0], true);
                break;
            case 2:
                int iC = f8a[l].f154b + h.c();
                if (l == 1 || l == 2) {
                    graphics.setColor(16777215);
                    graphics.fillRect(0, 0, iE, iA);
                } else {
                    g.a(graphics);
                    if (l == 3) {
                        graphics.drawImage(f14d, iE >> 1, (iA - iC) >> 1, 3);
                    }
                }
                f8a[l].a(graphics, 0, iA - iC);
                break;
            case 3:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, iE, iA);
                graphics.drawImage(f11b[0], iE >> 1, iA >> 1, 3);
                break;
            case 4:
                graphics.setColor(16777215);
                graphics.fillRect(0, 0, iE, iA);
                graphics.drawImage(f11b[2], iE >> 1, iA >> 1, 3);
                break;
            case 5:
                if (b != 2) {
                    g.b(graphics);
                } else {
                    j.b(graphics);
                }
                break;
            case 6:
                a(graphics, false);
                a.a(graphics);
                break;
            case 7:
                a(graphics, false);
                f18a.a(graphics);
                break;
            case 8:
                a(graphics, false);
                e.a(graphics);
                break;
            case 9:
                a(graphics, false);
                f19a.a(graphics);
                break;
        }
        if (f15b[6] == 1) {
            if (f1a != 0) {
                graphics.setClip(0, 0, iE, iA);
                i.a(graphics, 50, false);
            }
            f15b[6] = 0;
        }
    }

    private static final void s() {
        if (f6a == null) {
            f6a = b.m14a(131075);
        }
        h.a(3, 157, null, 1);
        h.a(4, 158, null, 1);
        h.a(8, 159, null, 4);
        h.a(10, 160, null, 2);
        h.a(21, 161, null, 0);
        h.a(13, 171, null, 2);
        h.a(1, 162, null, 0);
        h.a(0, 163, null, 0);
        h.a(2, 164, null, 0);
        h.a(5, 165, null, 2);
        h.a(6, 166, null, 3);
        h.a(7, 167, null, 2);
        h.a(9, 168, f6a, 2);
        h.a(11, 169, null, 2);
        h.a(14, 172, null, 0);
        h.a(22, 173, null, 0);
        h.a(23, 174, null, 0);
        h.a(25, 175, null, 2);
        h.a(12, 170, null, 0);
    }

    private static final void g(int i2) {
        int i3;
        int iA = h.a() - h.c();
        if (f8a[i2] == null || i2 == 5 || i2 == 3) {
            f.d();
            i iVar = new i();
            if (i2 == 3) {
                iVar.a(0, 10, 0);
                iVar.a(0, 0);
                iVar.a(6, 1);
                int i4 = 0;
                String strM112a = f19a.m112a();
                if (strM112a != null) {
                    i4 = 0 + 1;
                    iVar.a(0, 0, strM112a, m7a(65558), 109);
                }
                if (f15b[5] != 0) {
                    iVar.a(i4, 0, h.m57a(5), m7a(65560), 107);
                    i4++;
                }
                int i5 = i4;
                int i6 = i4 + 1;
                iVar.a(i5, 0, h.m57a(4), m7a(65562), 108);
                int i7 = i6 + 1;
                iVar.a(i6, 0, h.m57a(3), m7a(65564), 102);
                if (h.m66b(3) != null) {
                    i3 = i7 + 1;
                    iVar.a(i7, 0, f18a.m23a(), m7a(65566), 103);
                } else {
                    i3 = i7 + 1;
                    iVar.a(i7, 0, h.m57a(6), m7a(65566), 14);
                }
                int i8 = i3;
                int i9 = i3 + 1;
                iVar.a(i8, 0, h.m57a(9), m7a(65568), 6);
                if (h.m66b(5) != null) {
                    i9++;
                    iVar.a(i9, 0, h.m57a(176), m7a(65558), 104);
                }
                if (h.m66b(6) != null) {
                    int i10 = i9;
                    i9++;
                    iVar.a(i10, 0, h.m57a(177), m7a(65570), 105);
                }
                iVar.a(i9, 0, h.m57a(12), m7a(65572), 9);
                iVar.a(i9 + 1, 0, h.m57a(10), m7a(65574), 10);
                iA -= f14d.getHeight() + 8;
            } else if (i2 == 1) {
                String[][] strArrM51a = h.m51a();
                iVar.a(0, strArrM51a.length, 3);
                iVar.a(0, 0);
                int length = strArrM51a.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else {
                        iVar.a(length, 0, strArrM51a[length][0], (Image[]) null, 100);
                    }
                }
                iVar.a(j.d);
                iVar.f187d = 9486550;
            } else if (i2 == 2) {
                iVar.a(1, 2, 3);
                iVar.a(2, 0);
                iVar.a(7, 1);
                iVar.a(0, 1, "\\n", new Image[]{f11b[1], f11b[1], f11b[1]}, -1);
                iVar.a(1, 1, h.m57a(156), (Image[]) null, -1);
                iVar.a(j.d);
            } else if (i2 == 4) {
                iVar.a(1, 1, 3);
                iVar.a(h.m57a(13), (Image) null, 1);
                iVar.a(2, 0);
                iVar.a(7, 1);
                iVar.a(0, 1, h.m57a(22), (Image[]) null, -1);
            } else if (i2 == 21) {
                iVar.a(1, 1, 3);
                iVar.a(h.m57a(147), (Image) null, 1);
                iVar.a(2, 0);
                iVar.a(7, 1);
                iVar.a(0, 1, h.m57a(148), (Image[]) null, -1);
            } else if (i2 == 22) {
                iVar.a(1, 1, 3);
                iVar.a(h.m57a(147), (Image) null, 1);
                iVar.a(2, 0);
                iVar.a(7, 1);
                iVar.a(0, 1, h.m57a(149), (Image[]) null, -1);
            } else if (i2 == 5) {
                iVar.a(0, 4, 0);
                iVar.a(h.m57a(14), (Image) null, 1);
                iVar.a(0, 0);
                iVar.a(13, 1);
                iVar.a(0, 0, h.m57a(16), m7a(65560), 107);
                if (b == 2) {
                    iVar.a(1, 0, h.m57a(23), m7a(131079), 110);
                }
                a(iVar);
            } else if (i2 == 6) {
                iVar.a(0, 5, 0);
                iVar.a(h.m57a(9), (Image) null, 1);
                iVar.a(0, 0);
                iVar.a(5, 1);
                iVar.a(0, 0, h.m57a(15), m7a(131087), 8);
                a(iVar);
                if (h.m51a().length > 1) {
                    iVar.a(4, 0, h.m57a(11), m7a(131090), 7);
                }
            } else if (i2 == 7) {
                String[][] strArrM51a2 = h.m51a();
                iVar.a(0, strArrM51a2.length, 3);
                iVar.a(h.m57a(11), (Image) null, 1);
                iVar.a(0, 0);
                iVar.a(5, 1);
                int length2 = strArrM51a2.length;
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    } else {
                        iVar.a(length2, 0, strArrM51a2[length2][0], (Image[]) null, 101);
                    }
                }
            } else if (i2 == 8) {
                iVar.a(1, 1, 3);
                iVar.a(h.m57a(15), (Image) null, 1);
                iVar.a(2, 0);
                iVar.a(7, 1);
                iVar.a(0, 1, h.m57a(17), (Image[]) null, -1);
            } else if (i2 == 9) {
                iVar.a(0, 4, 0);
                iVar.a(h.m57a(12), (Image) null, 1);
                iVar.a(0, 0);
                iVar.a(5, 1);
                iVar.a(0, 0, h.m57a(24), m7a(65572), 11);
                iVar.a(1, 0, h.m57a(26), m7a(65572), 12);
                iVar.a(2, 0, h.m57a(28), m7a(65572), 13);
                iVar.a(3, 0, h.m57a(30), m7a(65572), 19);
            } else if (i2 == 10) {
                iVar = f3b ? m6a(10, 19) : m6a(10, 18);
                f13c = b.m14a(131077);
                iVar.a(1, 1, (String) null, new Image[]{f13c}, -1);
                iVar.a(2, 1, h.m57a(20), (Image[]) null, -1);
            } else if (i2 == 11) {
                iVar = m6a(24, 25);
            } else if (i2 == 12) {
                iVar = m6a(26, 27);
            } else if (i2 == 19) {
                iVar.a(1, 1, 0);
                iVar.a(h.m57a(30), (Image) null, 1);
                String[] strArr = new String[7];
                int length3 = strArr.length;
                while (true) {
                    length3--;
                    if (length3 < 0) {
                        break;
                    } else {
                        strArr[length3] = Integer.toString(j.f250c[38 + length3] / 768);
                    }
                }
                iVar.a(0, 1, h.a(h.m57a(31), strArr), (Image[]) null, -1);
                iVar.a(5, 1);
            } else if (i2 == 13) {
                iVar = m6a(28, 29);
            } else if (i2 == 20) {
                iVar = m6a(44, 44);
            } else if (i2 == 14) {
                iVar.a(0, 2, 0);
                iVar.a(h.m57a(6), (Image) null, 1);
                iVar.a(0, 0, h.m57a(7), (Image[]) null, 15);
                iVar.a(1, 0, h.m57a(8), (Image[]) null, 16);
                iVar.a(0, 0);
                iVar.a(5, 1);
            } else if (i2 == 15) {
                iVar.a(1, 5, 0);
                iVar.a(h.m57a(7), (Image) null, 1);
                iVar.a(5, 1);
            } else {
                iVar.a(1, 5, 0);
                iVar.a(h.m57a(8), (Image) null, 1);
                iVar.a(5, 1);
            }
            iVar.b(h.e(), iA);
            f8a[i2] = iVar;
        }
        o();
    }

    private static final void t() {
        if (l != 15 && l != 16) {
            return;
        }
        int[] iArr = f17a[1];
        if (l == 15) {
            iArr = f17a[0];
        }
        String strM57a = h.m57a(34);
        int i2 = 5;
        while (true) {
            i2--;
            if (i2 < 0) {
                f8a[l].b(h.e(), h.a() - h.c());
                return;
            }
            f8a[l].a(i2, 1, h.a(strM57a, new String[]{Integer.toString(i2 + 1), Integer.toString(iArr[i2])}), (Image[]) null, -1);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final i m6a(int i2, int i3) {
        i iVar = new i();
        iVar.a(1, 3, 0);
        iVar.a(h.m57a(i2), (Image) null, 1);
        iVar.a(0, 1, h.m57a(i3), (Image[]) null, -1);
        iVar.a(5, 1);
        return iVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final b m7a(int i2) {
        if (f10a == null) {
            f10a = new Hashtable();
        }
        Integer num = new Integer(i2);
        b bVar = (b) f10a.get(num);
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b(b.a(new int[]{i2, i2, i2}), false);
            f10a.put(num, bVar2);
        }
        return bVar2;
    }

    private static final void a(i iVar) {
        String[] strArr = {h.m57a(151), h.m57a(152)};
        m7a(131089);
        iVar.a(2, h.m57a(154), m7a(131073), 0, 5, 106);
        m7a(131083);
        iVar.a(3, h.m57a(155), m7a(65576), strArr, (b) null, 114);
    }
}
