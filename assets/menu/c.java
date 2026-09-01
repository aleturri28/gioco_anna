package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:c.class */
public final class c implements Runnable, CommandListener {
    private static String[][] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f43a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][][] f44a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[] f45a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f46a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Thread f47a;
    private static boolean b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[][][] f48a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int[][] f49a;
    private boolean c = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f50a;
    private boolean d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private i f51a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private i[] f52a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f53b;
    private boolean e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static final String[] f54b = {"", "createAccount", "login", "reportStats", "getLeaderBoard", "createValidatedAccount", "findAccountByPhoneNumber"};

    public c() {
        f45a = new int[24];
        f46a = new String[15];
        f45a[18] = -7;
        f45a[0] = f.a().mo2a().length;
        f45a[1] = 1;
        f44a = new int[f45a[0]][6][f45a[1]];
        f43a = h.m66b(3) == null;
        if (!f43a) {
            f49a = new int[f45a[0] + 1][4];
            f46a[0] = "";
            f46a[11] = "";
            f46a[3] = "";
            f46a[1] = "";
            f46a[4] = "";
            f46a[12] = "1028";
            f46a[13] = "yes";
            f46a[5] = "0";
            f46a[6] = h.m66b(2);
            f46a[7] = new StringBuffer().append("").append(System.getProperty("microedition-locale")).toString();
            f45a[21] = 0;
            f45a[22] = f45a[0] - 1;
        }
        f50a = new StringBuffer().append("hs").append(f46a[12]).toString();
        d();
    }

    public final int a(int i, int[] iArr, String str) {
        if (i != -1) {
            f45a[13] = i;
            f45a[19] = a(i, iArr);
            return f45a[19];
        }
        int[] iArr2 = f45a;
        iArr2[8] = iArr2[8] + iArr[0];
        c();
        return 0;
    }

    public final boolean a(int i) {
        this.d = i == 1;
        if (f43a) {
            if (f45a[0] == 1 || this.d) {
                f45a[18] = 1;
                return true;
            }
        } else {
            if (this.d && (f46a[3].equals("") || f46a[3] == null)) {
                f45a[18] = 5;
                return true;
            }
            if (this.d) {
                f45a[18] = 12;
                f46a[11] = h.m57a(217);
                f45a[9] = 3;
                this.e = true;
                return true;
            }
        }
        f45a[18] = 0;
        return true;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m19a(int i) {
        int iB = 0;
        if (this.f52a == null) {
            if (f43a) {
                f();
            } else {
                e();
            }
        }
        if (this.e) {
            f47a = new Thread(this);
            f47a.start();
            this.e = false;
        }
        if (this.f51a != this.f52a[f45a[18]] || this.c) {
            this.f51a = this.f52a[f45a[18]];
            this.c = false;
            if (f43a) {
                if (f45a[18] == 1) {
                    if (this.d || f45a[0] <= 1) {
                        this.f53b[1] = -7;
                    } else {
                        this.f53b[1] = 0;
                    }
                    this.f51a.a(a[f45a[13]][0], (Image) null, 1);
                    String string = "";
                    for (int i2 = 1; i2 <= 5; i2++) {
                        string = new StringBuffer().append(string).append(m20a(f45a[13], i2)).toString();
                        if (i2 < 5) {
                            string = new StringBuffer().append(string).append("\\n").toString();
                        }
                    }
                    this.f51a.a(0, 1, string, (Image[]) null, -1);
                    this.f51a.b(h.e(), h.a());
                }
                this.f51a.b();
            } else {
                if (f45a[18] == 0 && this.d) {
                    this.f53b[0] = -7;
                    if (f46a[3].equals("")) {
                        this.f52a[0].a(2);
                    } else {
                        this.f52a[0].a(2, 0, new StringBuffer().append(h.m57a(194)).append(" (").append(f46a[1]).append(")").toString(), (Image[]) null, 3);
                    }
                    this.f52a[0].b(h.e(), h.a());
                } else if (f45a[18] == 0) {
                    if (f46a[3].equals("")) {
                        this.f52a[0].a(2);
                    } else {
                        this.f52a[0].a(2, 0, new StringBuffer().append(h.m57a(194)).append(" (").append(f46a[1]).append(")").toString(), (Image[]) null, 3);
                    }
                    this.f52a[0].b(h.e(), h.a());
                } else {
                    if (f45a[18] == 14 || f45a[18] == 15) {
                        this.f51a.a(a[f45a[13]][0], (Image) null, 1);
                        this.f51a.a(0, 1, b(), (Image[]) null, -1);
                    } else if (f45a[18] == 12) {
                        this.f51a.a(0, 1, f46a[11], (Image[]) null, -1);
                    } else if (f45a[18] == 16) {
                        this.f51a.a(h.m57a(211), (Image) null, 1);
                        this.f51a.a(0, 1, f46a[11], (Image[]) null, -1);
                    } else if (f45a[18] == 13) {
                        this.f52a[13].a(0, 1, h.a(h.m57a(207), new String[]{f46a[1]}), (Image[]) null, -1);
                    } else if (f45a[18] == 11) {
                        int iM72a = this.f52a[11].m72a();
                        this.f52a[11].a(0, 0, f46a[1], h.m57a(202), (Image[]) null, 12, -1);
                        this.f52a[11].a(1, 3, "", h.m57a(204), (Image[]) null, 4, -1);
                        this.f51a.b(h.e(), h.a());
                        this.f52a[11].b(iM72a);
                    } else if (f45a[18] == 3 || f45a[18] == 4 || f45a[18] == 5 || f45a[18] == 7 || f45a[18] == 9 || f45a[18] == 10) {
                    }
                    this.f51a.b(h.e(), h.a());
                }
                this.f51a.b();
            }
        } else {
            int[] iArrM71a = this.f51a.m71a(i);
            if (iArrM71a != null) {
                iB = f43a ? b(iArrM71a) : a(iArrM71a);
            }
        }
        return iB;
    }

    public final void a(Graphics graphics) {
        if (this.f51a != null) {
            this.f51a.a(graphics, 0, 0);
        }
    }

    public final void a(int i, int i2) {
        if (this.f51a != null) {
            boolean z = false;
            if (i2 == 0 && h.m56a(i) == 53) {
                if (f45a[18] == 15) {
                    f45a[13] = (f45a[13] + 1) % (f45a[0] + 2);
                    this.c = true;
                    z = true;
                } else if (f45a[18] == 14) {
                    f45a[13] = (f45a[13] + 1) % f45a[0];
                    this.c = true;
                    z = true;
                }
            }
            if (z) {
                return;
            }
            this.f51a.c(i, i2);
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[PHI: r8
      0x0071: PHI (r8v3 int) = (r8v1 int), (r8v4 int) binds: [B:12:0x0047, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(int r6, int[] r7) {
        /*
            r5 = this;
            r0 = 6
            r8 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        Lb:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L21
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
            int r10 = r10 + 1
            goto Lb
        L21:
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            int[][][] r1 = defpackage.c.f44a
            r2 = r6
            r1 = r1[r2]
            r2 = 4
            r1 = r1[r2]
            r2 = 0
            r1 = r1[r2]
            if (r0 <= r1) goto L9d
            r0 = 4
            r10 = r0
        L34:
            r0 = r10
            if (r0 < 0) goto L97
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            int[][][] r1 = defpackage.c.f44a
            r2 = r6
            r1 = r1[r2]
            r2 = r10
            r1 = r1[r2]
            r2 = 0
            r1 = r1[r2]
            if (r0 <= r1) goto L71
            int[][][] r0 = defpackage.c.f44a
            r1 = r6
            r0 = r0[r1]
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int[][][] r2 = defpackage.c.f44a
            r3 = r6
            r2 = r2[r3]
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
            int r8 = r8 + (-1)
            r0 = r10
            if (r0 != 0) goto L71
            int[][][] r0 = defpackage.c.f44a
            r1 = r6
            r0 = r0[r1]
            r1 = r10
            r2 = r9
            r0[r1] = r2
            goto L97
        L71:
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            int[][][] r1 = defpackage.c.f44a
            r2 = r6
            r1 = r1[r2]
            r2 = r10
            r1 = r1[r2]
            r2 = 0
            r1 = r1[r2]
            if (r0 > r1) goto L91
            int[][][] r0 = defpackage.c.f44a
            r1 = r6
            r0 = r0[r1]
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            r2 = r9
            r0[r1] = r2
            goto L97
        L91:
            int r10 = r10 + (-1)
            goto L34
        L97:
            c()
            goto L9f
        L9d:
            r0 = -1
            return r0
        L9f:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.a(int, int[]):int");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m20a(int i, int i2) {
        String string = new StringBuffer().append(i2).append(". ").toString();
        for (int i3 = 0; i3 < 1; i3++) {
            string = new StringBuffer().append(string).append(f.a().mo3a(f44a[f45a[13]][i2 - 1][0])).toString();
            if (i2 != 0) {
                string = new StringBuffer().append(string).append(" ").toString();
            }
        }
        return string;
    }

    private static void c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (f43a) {
                for (int i = 0; i < f45a[0]; i++) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        for (int i3 = 0; i3 < f45a[1]; i3++) {
                            dataOutputStream.writeInt(f44a[i][i2][i3]);
                        }
                    }
                }
            } else {
                dataOutputStream.writeInt(f45a[6]);
                dataOutputStream.writeInt(f45a[7]);
                dataOutputStream.writeInt(f45a[8]);
                dataOutputStream.writeUTF(f46a[1]);
                dataOutputStream.writeUTF(f46a[3]);
                for (int i4 = 0; i4 < f45a[0]; i4++) {
                    for (int i5 = 0; i5 < 5; i5++) {
                        for (int i6 = 0; i6 < f45a[1]; i6++) {
                            dataOutputStream.writeInt(f44a[i4][i5][i6]);
                        }
                    }
                }
            }
            h.a(f50a, byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    private static void d() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h.a(f50a));
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            if (f43a) {
                for (int i = 0; i < f45a[0]; i++) {
                    for (int i2 = 0; i2 < 5; i2++) {
                        for (int i3 = 0; i3 < f45a[1]; i3++) {
                            f44a[i][i2][i3] = dataInputStream.readInt();
                        }
                    }
                }
            } else {
                f45a[6] = dataInputStream.readInt();
                f45a[7] = dataInputStream.readInt();
                f45a[8] = dataInputStream.readInt();
                f46a[1] = dataInputStream.readUTF();
                f46a[3] = dataInputStream.readUTF();
                for (int i4 = 0; i4 < f45a[0]; i4++) {
                    for (int i5 = 0; i5 < 5; i5++) {
                        for (int i6 = 0; i6 < f45a[1]; i6++) {
                            f44a[i4][i5][i6] = dataInputStream.readInt();
                        }
                    }
                }
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        } catch (Exception unused) {
        }
    }

    private void e() {
        String[][] strArrMo2a = f.a().mo2a();
        a = new String[f45a[0] + 2][1];
        for (int i = f45a[0] - 1; i >= 0; i--) {
            a[i] = strArrMo2a[i];
        }
        a[f45a[0]] = new String[]{h.m57a(223), h.m57a(222)};
        a[f45a[0] + 1] = new String[]{h.m57a(214), ""};
        this.f52a = new i[17];
        this.f53b = new int[17];
        for (int i2 = 16; i2 >= 0; i2--) {
            this.f52a[i2] = f.m25a();
        }
        this.f52a[0].a(0, 4, 0);
        this.f52a[0].a(h.m57a(191), (Image) null, 1);
        if (f45a[0] > 1) {
            this.f52a[0].a(0, 0, h.m57a(192), (Image[]) null, 1);
        } else {
            this.f52a[0].a(0, 0, h.m57a(192), (Image[]) null, 14);
        }
        this.f52a[0].a(1, 0, h.m57a(193), (Image[]) null, 5);
        this.f52a[0].a(3, 0, h.m57a(196), (Image[]) null, 4);
        this.f52a[0].a(0, 0);
        this.f52a[0].a(5, 1);
        this.f53b[0] = -7;
        if (f45a[0] > 1) {
            this.f52a[1].a(0, f45a[0], 0);
            this.f52a[1].a(h.m57a(192), (Image) null, 1);
            for (int i3 = 0; i3 < f45a[0]; i3++) {
                this.f52a[1].a(i3, 0, a[i3][0], (Image[]) null, i3);
            }
            this.f52a[1].a(0, 0);
            this.f52a[1].a(5, 1);
            this.f53b[1] = 0;
        }
        this.f52a[2].a(0, f45a[0] + 2, 0);
        this.f52a[2].a(h.m57a(191), (Image) null, 1);
        for (int i4 = 0; i4 < f45a[0] + 2; i4++) {
            this.f52a[2].a(i4, 0, a[i4][0], (Image[]) null, i4);
        }
        this.f52a[2].a(0, 0);
        this.f52a[2].a(5, 1);
        this.f53b[2] = 0;
        this.f52a[3].a(1, 1, 0);
        this.f52a[3].a(h.m57a(194), (Image) null, 1);
        this.f52a[3].a(0, 1, h.m57a(195), (Image[]) null, -1);
        this.f52a[3].a(2, 0);
        this.f52a[3].a(7, 1);
        this.f53b[3] = 0;
        this.f52a[4].a(1, 1, 0);
        this.f52a[4].a(h.m57a(196), (Image) null, 1);
        this.f52a[4].a(0, 1, h.m57a(197), (Image[]) null, -1);
        this.f52a[4].a(5, 1);
        this.f53b[4] = 0;
        this.f52a[5].a(1, 1, 0);
        this.f52a[5].a(h.m57a(198), (Image) null, 1);
        this.f52a[5].a(0, 1, h.m57a(199), (Image[]) null, -1);
        this.f52a[5].a(1, 0);
        this.f52a[5].a(5, 1);
        this.f53b[5] = 0;
        this.f52a[6].a(0, 2, 0);
        this.f52a[6].a(h.m57a(191), (Image) null, 1);
        this.f52a[6].a(0, 0, h.m57a(201), (Image[]) null, 7);
        this.f52a[6].a(1, 0, h.m57a(208), (Image[]) null, 10);
        this.f52a[6].a(0, 0);
        this.f52a[6].a(5, 1);
        this.f53b[6] = 0;
        this.f52a[7].a(1, 1, 0);
        this.f52a[7].a(h.m57a(201), (Image) null, 1);
        this.f52a[7].a(0, 1, h.m57a(200), (Image[]) null, -1);
        this.f52a[7].a(1, 0);
        this.f52a[7].a(5, 1);
        this.f53b[7] = 8;
        this.f52a[8].a(0, 3, 0);
        this.f52a[8].a(h.m57a(201), (Image) null, 1);
        this.f52a[8].a(0, 0, "", h.m57a(202), (Image[]) null, 12, -1);
        String strM66b = h.m66b(8);
        String str = strM66b;
        if (strM66b == null || str.equals("")) {
            str = "+";
        }
        this.f52a[8].a(1, 2, str, h.m57a(203), (Image[]) null, 20, -1);
        this.f52a[8].a(2, 0, h.m57a(201), (Image[]) null, 9);
        this.f52a[8].a(1, 0);
        this.f52a[8].a(5, 1);
        this.f53b[8] = 6;
        this.f52a[9].a(1, 1, 0);
        this.f52a[9].a(h.m57a(213), (Image) null, 1);
        this.f52a[9].a(0, 1, h.m57a(205), (Image[]) null, -1);
        this.f52a[9].a(11, 1);
        this.f53b[9] = 13;
        this.f52a[10].a(1, 1, 0);
        this.f52a[10].a(h.m57a(208), (Image) null, 1);
        this.f52a[10].a(0, 1, h.m57a(209), (Image[]) null, -1);
        this.f52a[10].a(1, 0);
        this.f52a[10].a(5, 1);
        this.f53b[10] = 11;
        this.f52a[11].a(0, 3, 0);
        this.f52a[11].a(h.m57a(208), (Image) null, 1);
        this.f52a[11].a(0, 0, "", h.m57a(202), (Image[]) null, 12, -1);
        this.f52a[11].a(1, 3, "", h.m57a(204), (Image[]) null, 4, -1);
        this.f52a[11].a(2, 0, h.m57a(208), (Image[]) null, 12);
        this.f52a[11].a(1, 0);
        this.f52a[11].a(5, 1);
        this.f53b[11] = 6;
        this.f52a[12].a(1, 1, 0);
        this.f52a[12].a(h.m57a(213), (Image) null, 1);
        this.f52a[12].a(0, 1, h.m57a(210), (Image[]) null, -1);
        this.f52a[12].a(11, 1);
        this.f53b[12] = 2;
        this.f52a[13].a(1, 1, 0);
        this.f52a[13].a(h.m57a(206), (Image) null, 1);
        this.f52a[13].a(1, 0);
        this.f53b[13] = 0;
        this.f52a[14].a(1, 1, 0);
        if (f45a[0] > 1) {
            this.f52a[14].a(12, 0);
        }
        this.f52a[14].a(5, 1);
        if (f45a[0] > 1) {
            this.f53b[14] = 1;
        } else {
            this.f53b[14] = 0;
        }
        this.f52a[15].a(1, 1, 0);
        this.f52a[15].a(12, 0);
        this.f52a[15].a(5, 1);
        this.f53b[15] = 2;
        this.f52a[16].a(1, 1, 0);
        this.f52a[16].a(5, 1);
        this.f53b[16] = 0;
        for (int i5 = 16; i5 >= 0; i5--) {
            if (i5 != 1 || f45a[0] > 1) {
                this.f52a[i5].b(h.e(), h.a());
            }
        }
    }

    private int a(int[] iArr) {
        int i = 0;
        if (iArr[0] == 0) {
            if (iArr[1] == 1) {
                if (f45a[18] == 5) {
                    f45a[18] = 6;
                } else if (f45a[18] == 10 || f45a[18] == 7 || f45a[18] == 13) {
                    f45a[18] = this.f53b[f45a[18]];
                    if (f45a[18] == 12) {
                        f46a[11] = h.m57a(217);
                        f45a[9] = 2;
                        this.e = true;
                    }
                }
            } else if (iArr[1] == 5) {
                if (f45a[18] == 10 || f45a[18] == 7) {
                    f45a[18] = 6;
                } else {
                    f45a[18] = this.f53b[f45a[18]];
                    if (f45a[18] == -7) {
                        i = 1;
                        this.f51a = null;
                        this.f52a = null;
                    }
                }
            } else if (iArr[1] == 2) {
                if (f45a[18] == 3) {
                    f45a[18] = 0;
                    f46a[3] = "";
                    f45a[6] = 0;
                    c();
                }
            } else if (iArr[1] == 7) {
                if (f45a[18] == 3) {
                    f45a[18] = 0;
                }
            } else if (iArr[1] == 11) {
                if (f45a[18] == 12 || f45a[18] == 9) {
                    b = true;
                    f45a[18] = 0;
                }
            } else if (iArr[1] == 12) {
                if (f45a[18] == 15) {
                    f45a[13] = (f45a[13] + 1) % (f45a[0] + 2);
                    this.c = true;
                } else if (f45a[18] == 14) {
                    f45a[13] = (f45a[13] + 1) % f45a[0];
                    this.c = true;
                }
            }
        } else if (iArr[0] == 1) {
            if (f45a[18] == 11) {
                if (iArr[1] == 12) {
                    f46a[1] = this.f52a[11].m74a(0);
                    f46a[4] = this.f52a[11].m74a(1);
                    f45a[18] = 12;
                    f46a[11] = h.m57a(217);
                    f45a[9] = 2;
                    this.e = true;
                }
            } else if (f45a[18] == 8) {
                if (iArr[1] == 9) {
                    f46a[1] = this.f52a[8].m74a(0);
                    f46a[2] = this.f52a[8].m74a(1);
                    f45a[18] = 9;
                    f46a[11] = h.m57a(217);
                    f45a[9] = 1;
                    this.e = true;
                }
            } else if (f45a[18] == 0) {
                f45a[13] = 0;
                if (iArr[1] != 5 || f46a[3].equals("")) {
                    f45a[18] = iArr[1];
                } else {
                    f45a[18] = 12;
                    f46a[11] = h.m57a(217);
                    f45a[9] = 3;
                    this.e = true;
                }
            } else if (f45a[18] == 1) {
                f45a[13] = iArr[1];
                f45a[18] = 14;
            } else if (f45a[18] == 2) {
                f45a[13] = iArr[1];
                f45a[18] = 15;
            } else if (f45a[18] == 6) {
                f45a[18] = iArr[1];
            }
        }
        return i;
    }

    private static String b() {
        StringBuffer stringBuffer = new StringBuffer("");
        if (f45a[18] == 14) {
            for (int i = 0; i < 5; i++) {
                stringBuffer.append(i + 1);
                stringBuffer.append(". ");
                for (int i2 = 0; i2 < f45a[1]; i2++) {
                    stringBuffer.append(" ");
                    stringBuffer.append(f.a().mo3a(f44a[f45a[13]][i][i2]));
                    if (i2 < f45a[1] - 1) {
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(h.m57a(215));
            stringBuffer.append(": ");
            stringBuffer.append(f45a[8]);
        } else if (f45a[13] < f45a[0]) {
            for (int i3 = 0; i3 < f49a[f45a[13]][0]; i3++) {
                stringBuffer.append(f48a[f45a[13]][i3][0]);
                stringBuffer.append(". ");
                stringBuffer.append(f48a[f45a[13]][i3][1]);
                stringBuffer.append(": ");
                for (int i4 = 2; i4 < f49a[f45a[13]][1]; i4++) {
                    try {
                        stringBuffer.append(f.a().mo3a(Integer.parseInt(f48a[f45a[13]][i3][i4])));
                    } catch (NumberFormatException unused) {
                        stringBuffer.append(f48a[f45a[13]][i3][i4]);
                    }
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(h.a(h.m57a(216), new String[]{new StringBuffer().append("").append(f49a[f45a[13]][2]).toString(), new StringBuffer().append("").append(f49a[f45a[13]][3]).toString()}));
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f46a[0]);
        } else if (f45a[13] == f45a[0]) {
            for (int i5 = 0; i5 < f49a[f45a[13]][0]; i5++) {
                stringBuffer.append(f48a[f45a[13]][i5][0]);
                stringBuffer.append(". ");
                stringBuffer.append(f48a[f45a[13]][i5][1]);
                stringBuffer.append(": ");
                for (int i6 = 2; i6 < f49a[f45a[13]][1]; i6++) {
                    stringBuffer.append(f48a[f45a[13]][i5][i6]);
                }
                stringBuffer.append("\\n");
            }
            stringBuffer.append("\\n");
            stringBuffer.append(h.a(h.m57a(216), new String[]{new StringBuffer().append("").append(f49a[f45a[13]][2]).toString(), new StringBuffer().append("").append(f49a[f45a[13]][3]).toString()}));
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f46a[0]);
        } else {
            stringBuffer.append(h.m57a(225));
            stringBuffer.append(": ");
            stringBuffer.append(f46a[1]);
            stringBuffer.append("\\n\\n");
            stringBuffer.append(h.m57a(2));
            stringBuffer.append(" ");
            stringBuffer.append(h.m57a(222));
            stringBuffer.append(": ");
            stringBuffer.append(f45a[5]);
            stringBuffer.append("\\n");
            stringBuffer.append(h.m57a(224));
            stringBuffer.append(": ");
            stringBuffer.append(f45a[4]);
            stringBuffer.append("\\n\\n");
            stringBuffer.append(f46a[0]);
        }
        return stringBuffer.toString();
    }

    private void f() {
        a = f.a().mo2a();
        this.f52a = new i[17];
        this.f53b = new int[17];
        if (f45a[0] != 1) {
            this.f52a[0] = f.m25a();
            this.f53b[0] = -7;
            this.f52a[0].a(0, f45a[0], 0);
            this.f52a[0].a(h.m57a(218), (Image) null, 1);
            for (int i = 0; i < f45a[0]; i++) {
                this.f52a[0].a(i, 0, a[i][0], (Image[]) null, i);
            }
            this.f52a[0].a(0, 0);
            this.f52a[0].a(5, 1);
            this.f52a[0].b(h.e(), h.a());
        }
        this.f52a[1] = f.m25a();
        this.f52a[1].a(1, 1, 0);
        this.f52a[1].a(5, 1);
    }

    private int b(int[] iArr) {
        int i = 0;
        if (iArr[0] == 0) {
            if (iArr[1] == 5) {
                f45a[18] = this.f53b[f45a[18]];
                if (f45a[18] == -7) {
                    i = 1;
                    this.f51a = null;
                    this.f52a = null;
                }
            }
        } else if (iArr[0] == 1 && f45a[18] == 0) {
            f45a[13] = iArr[1];
            f45a[18] = 1;
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(11:100|5|SW:6|86|12|14|94|15|98|17|19)|1e7|51|90|78|80|92|81|105|83|3) */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.run():void");
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static String m21c() {
        StringBuffer stringBuffer = new StringBuffer("{");
        for (int i = 0; i < f45a[0]; i++) {
            if (i > 0) {
                stringBuffer.append(",");
            }
            stringBuffer.append(new StringBuffer().append("\"T-").append(i).append("\":{\"key\":\"T-").append(i).append("-C-0\",\"order\":\"d\",\"table\":[").toString());
            for (int i2 = 0; i2 < f45a[1]; i2++) {
                if (i2 > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(new StringBuffer().append("{\"T-").append(i).append("-C-").append(i2).append("\":[").append(f44a[i][0][i2]).append("]}").toString());
            }
            stringBuffer.append("]}");
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public final void a() {
        for (int i = 0; i < f45a[0]; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < f45a[1]; i3++) {
                    f44a[i][i2][i3] = 0;
                }
            }
        }
        c();
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final void m22b() {
        this.f52a = null;
        this.c = true;
        if (f43a) {
            f();
        } else {
            e();
        }
        if (f45a[18] != -7) {
            this.f51a = this.f52a[f45a[18]];
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m23a() {
        return f43a ? h.m57a(218) : h.m57a(191);
    }
}
