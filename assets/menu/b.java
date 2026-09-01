package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:b.class */
public final class b {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private short[][] f33a;
    public int h;
    public int i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f34b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public boolean f35c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[][] f40a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int[] f41a;
    private static int l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final boolean f32a = "null".equals("null");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image[] f36a = new Image[0];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Vector f37a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Vector f38b = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static Vector f39c = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int[][] f42b = new int[8][4];

    public b(short[][] sArr, boolean z) {
        this.f33a = sArr;
        int length = this.f33a.length;
        while (true) {
            length--;
            if (length < 0) {
                a(0, z);
                return;
            } else if (sArr[length] != null) {
                a(sArr[length], 1);
            }
        }
    }

    public b() {
    }

    public final int a() {
        return this.f33a[this.h][4];
    }

    public static final short[] a(int i) {
        int i2;
        short s;
        byte[] bArrM50a = h.m50a(i);
        int i3 = (bArrM50a[0] << 8) | (bArrM50a[1] & 255);
        boolean z = (i3 & 16384) == 16384;
        boolean z2 = (i3 & 32768) == 32768;
        short[] sArr = new short[(short) (i3 & (-49153))];
        int i4 = 2;
        sArr[4] = 1;
        if (z) {
            i4 = 2 + 1;
            sArr[4] = bArrM50a[2];
        }
        if (z2) {
            int i5 = i4;
            sArr[0] = bArrM50a[i5];
            int i6 = i4 + 1 + 1;
            sArr[1] = bArrM50a[r13];
            int i7 = i6 + 1;
            sArr[2] = (short) (bArrM50a[i6] & 255);
            i2 = i7 + 1;
            sArr[3] = (short) (bArrM50a[i7] & 255);
        } else {
            int i8 = i4;
            int i9 = i4 + 1;
            int i10 = i9 + 1;
            sArr[0] = (short) ((bArrM50a[i8] << 8) | (bArrM50a[i9] & 255));
            int i11 = i10 + 1;
            int i12 = bArrM50a[i10] << 8;
            int i13 = i11 + 1;
            sArr[1] = (short) (i12 | (bArrM50a[i11] & 255));
            int i14 = i13 + 1;
            int i15 = bArrM50a[i13] << 8;
            int i16 = i14 + 1;
            sArr[2] = (short) (i15 | (bArrM50a[i14] & 255));
            int i17 = i16 + 1;
            int i18 = bArrM50a[i16] << 8;
            i2 = i17 + 1;
            sArr[3] = (short) (i18 | (bArrM50a[i17] & 255));
        }
        short s2 = (short) (5 + (sArr[4] << 1));
        for (int i19 = 0; i19 < sArr[4]; i19++) {
            short s3 = s2;
            short s4 = -1;
            short s5 = Short.MAX_VALUE;
            if (z) {
                int i20 = i2;
                int i21 = i2 + 1;
                s4 = bArrM50a[i20];
                int i22 = i21 + 1;
                int i23 = bArrM50a[i21] << 8;
                i2 = i22 + 1;
                s5 = (short) (i23 | (bArrM50a[i22] & 255));
            }
            if (s4 == -1) {
                int i24 = i2;
                int i25 = i2 + 1;
                short s6 = (short) (bArrM50a[i24] & 255);
                i2 = i25 + 1;
                short s7 = (short) (bArrM50a[i25] & 255);
                short s8 = s2;
                short s9 = (short) (s2 + 1);
                sArr[s8] = s7;
                while (true) {
                    short s10 = (short) (s7 - 1);
                    s7 = s10;
                    if (s10 < 0) {
                        break;
                    }
                    short s11 = (short) (s9 + 1);
                    int i26 = i2;
                    int i27 = i2 + 1;
                    sArr[s9] = (short) (bArrM50a[i26] & 255);
                    if (z2) {
                        short s12 = (short) (s11 + 1);
                        sArr[s11] = bArrM50a[i27];
                        short s13 = (short) (s12 + 1);
                        int i28 = i27 + 1 + 1;
                        sArr[s12] = bArrM50a[r13];
                        short s14 = (short) (s13 + 1);
                        int i29 = i28 + 1;
                        sArr[s13] = (short) (bArrM50a[i28] & 255);
                        s9 = (short) (s14 + 1);
                        i2 = i29 + 1;
                        sArr[s14] = (short) (bArrM50a[i29] & 255);
                    } else {
                        short s15 = (short) (s11 + 1);
                        int i30 = i27 + 1;
                        int i31 = bArrM50a[i27] << 8;
                        int i32 = i30 + 1;
                        sArr[s11] = (short) (i31 | (bArrM50a[i30] & 255));
                        short s16 = (short) (s15 + 1);
                        int i33 = i32 + 1;
                        int i34 = bArrM50a[i32] << 8;
                        int i35 = i33 + 1;
                        sArr[s15] = (short) (i34 | (bArrM50a[i33] & 255));
                        short s17 = (short) (s16 + 1);
                        int i36 = i35 + 1;
                        int i37 = bArrM50a[i35] << 8;
                        int i38 = i36 + 1;
                        sArr[s16] = (short) (i37 | (bArrM50a[i36] & 255));
                        s9 = (short) (s17 + 1);
                        int i39 = i38 + 1;
                        int i40 = bArrM50a[i38] << 8;
                        i2 = i39 + 1;
                        sArr[s17] = (short) (i40 | (bArrM50a[i39] & 255));
                    }
                }
                short s18 = s9;
                s2 = (short) (s9 + 1);
                sArr[s18] = s6;
                while (true) {
                    short s19 = (short) (s6 - 1);
                    s6 = s19;
                    if (s19 >= 0) {
                        short s20 = (short) (bArrM50a[i2] & 7);
                        short s21 = (short) (s2 + 1);
                        sArr[s2] = s20;
                        int i41 = ((bArrM50a[i2] >> 3) & 7) + 1;
                        int i42 = i2;
                        int i43 = i2 + 1;
                        int i44 = (bArrM50a[i42] >> 6) & 3;
                        if (s20 == 0) {
                            int i45 = i43 + 1;
                            int i46 = bArrM50a[i43] << 24;
                            int i47 = i45 + 1;
                            int i48 = i46 | (bArrM50a[i45] << 16);
                            int i49 = i47 + 1;
                            int i50 = i48 | (bArrM50a[i47] << 8);
                            int i51 = i49 + 1;
                            int i52 = i50 | (bArrM50a[i49] & 255);
                            short s22 = 0;
                            if (f32a) {
                                i51++;
                                s22 = (short) (bArrM50a[i51] & 255);
                            }
                            if (z2) {
                                short s23 = (short) (s21 + 1);
                                int i53 = i51;
                                sArr[s21] = bArrM50a[i53];
                                s = (short) (s23 + 1);
                                i2 = i51 + 1 + 1;
                                sArr[s23] = bArrM50a[r13];
                            } else {
                                short s24 = (short) (s21 + 1);
                                int i54 = i51;
                                int i55 = i51 + 1;
                                int i56 = i55 + 1;
                                sArr[s21] = (short) ((bArrM50a[i54] << 8) | (bArrM50a[i55] & 255));
                                s = (short) (s24 + 1);
                                int i57 = i56 + 1;
                                int i58 = bArrM50a[i56] << 8;
                                i2 = i57 + 1;
                                sArr[s24] = (short) (i58 | (bArrM50a[i57] & 255));
                            }
                            short s25 = s;
                            s2 = (short) (s + 1);
                            sArr[s25] = (short) m15a(i52, (int) s22, i44, i41);
                        } else {
                            short s26 = (short) (s21 + 1);
                            int i59 = i43 + 1;
                            sArr[s21] = (short) (bArrM50a[i43] & 65535);
                            short s27 = (short) (s26 + 1);
                            int i60 = i59 + 1;
                            int i61 = bArrM50a[i59] << 8;
                            int i62 = i60 + 1;
                            sArr[s26] = (short) (i61 | (bArrM50a[i60] & 255));
                            if (z2) {
                                short s28 = (short) (s27 + 1);
                                sArr[s27] = bArrM50a[i62];
                                short s29 = (short) (s28 + 1);
                                int i63 = i62 + 1 + 1;
                                sArr[s28] = bArrM50a[r13];
                                if (s20 == 5) {
                                    short s30 = (short) (s29 + 1);
                                    sArr[s29] = bArrM50a[i63];
                                    short s31 = (short) (s30 + 1);
                                    sArr[s30] = bArrM50a[r13];
                                    short s32 = (short) (s31 + 1);
                                    sArr[s31] = bArrM50a[r13];
                                    s2 = (short) (s32 + 1);
                                    i2 = i63 + 1 + 1 + 1 + 1;
                                    sArr[s32] = bArrM50a[r13];
                                } else if (s20 == 3) {
                                    short s33 = (short) (s29 + 1);
                                    sArr[s29] = bArrM50a[i63];
                                    s2 = (short) (s33 + 1);
                                    i2 = i63 + 1 + 1;
                                    sArr[s33] = bArrM50a[r13];
                                } else {
                                    short s34 = (short) (s29 + 1);
                                    int i64 = i63 + 1;
                                    sArr[s29] = (short) (bArrM50a[i63] & 255);
                                    s2 = (short) (s34 + 1);
                                    i2 = i64 + 1;
                                    sArr[s34] = (short) (bArrM50a[i64] & 255);
                                }
                            } else {
                                short s35 = (short) (s27 + 1);
                                int i65 = i62 + 1;
                                int i66 = bArrM50a[i62] << 8;
                                int i67 = i65 + 1;
                                sArr[s27] = (short) (i66 | (bArrM50a[i65] & 255));
                                short s36 = (short) (s35 + 1);
                                int i68 = i67 + 1;
                                int i69 = bArrM50a[i67] << 8;
                                int i70 = i68 + 1;
                                sArr[s35] = (short) (i69 | (bArrM50a[i68] & 255));
                                short s37 = (short) (s36 + 1);
                                int i71 = i70 + 1;
                                int i72 = bArrM50a[i70] << 8;
                                int i73 = i71 + 1;
                                sArr[s36] = (short) (i72 | (bArrM50a[i71] & 255));
                                s2 = (short) (s37 + 1);
                                int i74 = i73 + 1;
                                int i75 = bArrM50a[i73] << 8;
                                i2 = i74 + 1;
                                sArr[s37] = (short) (i75 | (bArrM50a[i74] & 255));
                                if (s20 == 5) {
                                    short s38 = (short) (s2 + 1);
                                    int i76 = i2 + 1;
                                    int i77 = bArrM50a[i2] << 8;
                                    int i78 = i76 + 1;
                                    sArr[s2] = (short) (i77 | (bArrM50a[i76] & 255));
                                    s2 = (short) (s38 + 1);
                                    int i79 = i78 + 1;
                                    int i80 = bArrM50a[i78] << 8;
                                    i2 = i79 + 1;
                                    sArr[s38] = (short) (i80 | (bArrM50a[i79] & 255));
                                }
                            }
                        }
                    }
                }
            } else {
                s3 = (short) (sArr[5 + (s4 << 1)] | Short.MIN_VALUE);
            }
            sArr[5 + (i19 << 1)] = s3;
            sArr[6 + (i19 << 1)] = s5;
        }
        return sArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [short[], short[][]] */
    public static final short[][] a(int[] iArr) {
        ?? r0 = new short[iArr.length];
        for (int i = 0; i < r0.length; i++) {
            r0[i] = a(iArr[i]);
        }
        return r0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final short[] m10a() {
        return this.f33a[this.h];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m11a(int i) {
        short[] sArr = this.f33a[this.h];
        short s = sArr[6 + (this.i << 1)];
        this.k += i;
        while (this.k >= s) {
            this.k -= s;
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= sArr[4]) {
                this.i = 0;
                if (!this.f34b) {
                    this.f35c = true;
                    this.i = sArr[4] - 1;
                }
            }
            s = sArr[6 + (this.i << 1)];
        }
        this.j = sArr[5 + (this.i << 1)] & Short.MAX_VALUE;
    }

    public final void a(Graphics graphics, int i, int i2, int i3) {
        int i4 = this.j;
        int i5 = this.i;
        int i6 = this.k;
        m11a(i3);
        a(graphics, i, i2);
        this.k = i6;
        this.i = i5;
        this.j = i4;
    }

    public final void a(Graphics graphics, int i, int i2) {
        short[] sArr = this.f33a[this.h];
        int i3 = i - sArr[0];
        int i4 = i2 - sArr[1];
        int i5 = this.j + (sArr[this.j] * 5) + 1;
        int i6 = sArr[i5];
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            }
            int i7 = i5 + 1;
            short s = sArr[i7];
            if (s == 0) {
                int i8 = i7 + 1;
                int i9 = sArr[i8] + i3;
                int i10 = i8 + 1;
                int i11 = sArr[i10] + i4;
                i5 = i10 + 1;
                short s2 = sArr[i5];
                Image image = f36a[s2 & 2047];
                int i12 = s2 >>> 13;
                if (i12 != 0) {
                    int i13 = 0;
                    if ((i12 & 1) != 0) {
                        i13 = 2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 |= 1;
                    }
                    graphics.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), i13, i9, i11, 20);
                } else {
                    graphics.drawImage(image, i9, i11, 20);
                }
            } else {
                int i14 = i7 + 1;
                int i15 = sArr[i14] << 16;
                int i16 = i14 + 1;
                graphics.setColor(i15 | (sArr[i16] & 65535));
                if (s == 3) {
                    int i17 = i16 + 1;
                    int i18 = i3 + sArr[i17];
                    int i19 = i17 + 1;
                    int i20 = i4 + sArr[i19];
                    int i21 = i19 + 1;
                    int i22 = i3 + sArr[i21];
                    i5 = i21 + 1;
                    graphics.drawLine(i18, i20, i22, i4 + sArr[i5]);
                } else if (s == 2) {
                    int i23 = i16 + 1;
                    int i24 = i3 + sArr[i23];
                    int i25 = i23 + 1;
                    int i26 = i4 + sArr[i25];
                    int i27 = i25 + 1;
                    short s3 = sArr[i27];
                    i5 = i27 + 1;
                    graphics.drawRect(i24, i26, s3, sArr[i5]);
                } else if (s == 1) {
                    int i28 = i16 + 1;
                    int i29 = i3 + sArr[i28];
                    int i30 = i28 + 1;
                    int i31 = i4 + sArr[i30];
                    int i32 = i30 + 1;
                    short s4 = sArr[i32];
                    i5 = i32 + 1;
                    graphics.fillRect(i29, i31, s4, sArr[i5]);
                } else if (s == 5) {
                    int i33 = i16 + 1;
                    int i34 = i3 + sArr[i33];
                    int i35 = i33 + 1;
                    int i36 = i4 + sArr[i35];
                    int i37 = i35 + 1;
                    int i38 = i3 + sArr[i37];
                    int i39 = i37 + 1;
                    int i40 = i4 + sArr[i39];
                    int i41 = i39 + 1;
                    int i42 = i3 + sArr[i41];
                    i5 = i41 + 1;
                    a(graphics, i34, i36, i38, i40, i42, i4 + sArr[i5]);
                } else {
                    int i43 = i16 + 1;
                    int i44 = i3 + sArr[i43];
                    int i45 = i43 + 1;
                    int i46 = i4 + sArr[i45];
                    int i47 = i45 + 1;
                    short s5 = sArr[i47];
                    i5 = i47 + 1;
                    a(graphics, i44, i46, s5, sArr[i5]);
                }
            }
        }
    }

    private static void a(Graphics graphics, int i, int i2, int i3, int i4) {
        int i5 = i4 * i4;
        int i6 = (i4 << 8) / i3;
        int i7 = i6 * i6;
        for (int i8 = -i4; i8 <= 0; i8++) {
            int i9 = i5 - (i8 * i8);
            int i10 = i3 + ((i8 * (i7 >> 3)) >> 16);
            while (true) {
                if (i10 < 0) {
                    break;
                }
                if ((((i10 * i10) * i7) >> 16) <= i9) {
                    graphics.fillRect((i - i10) - 1, i2 + i8, (i10 << 1) | 1, 1);
                    graphics.fillRect((i - i10) - 1, (i2 - i8) - 0, (i10 << 1) | 1, 1);
                    break;
                }
                i10--;
            }
        }
    }

    private static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int clipY;
        if (i2 > i6) {
            i2 = i6;
            i6 = i2;
            i = i5;
            i5 = i;
        }
        if (i2 > i4) {
            i4 = i2;
            i2 = i4;
            i3 = i;
            i = i3;
        }
        if (i4 > i6) {
            int i7 = i4;
            i4 = i6;
            i6 = i7;
            int i8 = i3;
            i3 = i5;
            i5 = i8;
        }
        int clipX = graphics.getClipX();
        if (i >= clipX || i3 >= clipX || i5 >= clipX) {
            int clipWidth = clipX + graphics.getClipWidth();
            if ((i < clipWidth || i3 < clipWidth || i5 < clipWidth) && i6 >= (clipY = graphics.getClipY()) && i4 < clipY + graphics.getClipHeight()) {
                int i9 = i << 16;
                int i10 = i3 << 16;
                int i11 = i5 << 16;
                int iMax = (i11 - i9) / Math.max(i6 - i2, 1);
                int iMax2 = (i10 - i9) / Math.max(i4 - i2, 1);
                int iMax3 = (i11 - i10) / Math.max(i6 - i4, 1);
                int iMin = Math.min(i4, clipY + graphics.getClipHeight());
                int iMin2 = Math.min(i6, clipY + graphics.getClipHeight());
                int i12 = i9;
                int i13 = i9;
                int i14 = i2;
                if (iMin < clipY) {
                    i12 += iMax * (iMin - i14);
                    i14 = iMin;
                } else if (i14 < clipY) {
                    i12 += iMax * (clipY - i14);
                    i13 += iMax2 * (clipY - i14);
                    i14 = clipY;
                }
                if (iMax <= iMax2) {
                    while (i14 < iMin) {
                        int i15 = i14;
                        i14++;
                        graphics.fillRect(i12 >> 16, i15, (i13 >> 16) - (i12 >> 16), 1);
                        i12 += iMax;
                        i13 += iMax2;
                    }
                } else {
                    while (i14 < iMin) {
                        int i16 = i14;
                        i14++;
                        graphics.fillRect(i13 >> 16, i16, (i12 >> 16) - (i13 >> 16), 1);
                        i12 += iMax;
                        i13 += iMax2;
                    }
                }
                int i17 = i10;
                if (i14 < clipY) {
                    i12 += iMax * (clipY - i14);
                    i17 += iMax3 * (clipY - i14);
                    i14 = clipY;
                }
                if (i17 >= i12) {
                    while (i14 < iMin2) {
                        int i18 = i14;
                        i14++;
                        graphics.fillRect(i12 >> 16, i18, (i17 >> 16) - (i12 >> 16), 1);
                        i12 += iMax;
                        i17 += iMax3;
                    }
                    return;
                }
                while (i14 < iMin2) {
                    int i19 = i14;
                    i14++;
                    graphics.fillRect(i17 >> 16, i19, (i12 >> 16) - (i17 >> 16), 1);
                    i12 += iMax;
                    i17 += iMax3;
                }
            }
        }
    }

    public final void a(int i, boolean z) {
        this.h = i;
        b(0);
        this.f34b = z;
    }

    public final int b() {
        return this.f33a.length;
    }

    public final void b(int i) {
        this.j = this.f33a[this.h][5 + (i << 1)] & Short.MAX_VALUE;
        this.i = i;
        this.f35c = false;
        this.k = 0;
    }

    public final int c() {
        return this.f33a[this.h][0];
    }

    public final int d() {
        return this.f33a[this.h][1];
    }

    public final int e() {
        return this.f33a[this.h][2];
    }

    public final int f() {
        return this.f33a[this.h][3];
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m12a() {
        if (this.f33a == null) {
            return;
        }
        int length = this.f33a.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (this.f33a[length] != null) {
                a(this.f33a[length], -1);
            }
        }
        int size = f37a.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f33a = (short[][]) null;
                return;
            } else if (((Integer) f37a.elementAt(size)).intValue() <= 0 && f36a[size] != null) {
                f37a.setElementAt(new Integer(0), size);
                f36a[size] = null;
                f38b.setElementAt(new Integer(-1), size);
            }
        }
    }

    private static Image a(int i, int i2, int i3, int i4) {
        byte[] bArrM50a;
        if (f32a) {
            byte[] bArrM50a2 = h.m50a(i);
            int i5 = (bArrM50a2[0] << 8) | (bArrM50a2[1] & 255);
            int i6 = (bArrM50a2[2] << 8) | (bArrM50a2[3] & 255);
            bArrM50a = (i2 & 2047) < 254 ? a(f40a[i2 & 2047], bArrM50a2, i5, i6, -1, 12, i3, i4) : a(null, bArrM50a2, i5, i6, 255, 4, i3, i4);
        } else {
            bArrM50a = h.m50a(i);
        }
        return Image.createImage(bArrM50a, 0, bArrM50a.length);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [int[], int[][]] */
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static final void m13b() {
        if (f32a) {
            byte[] bArrM50a = h.m50a(720926);
            int i = 0 + 1 + 1 + 1 + 1;
            f40a = new int[((bArrM50a[0] & 255) << 24) | ((bArrM50a[1] & 255) << 16) | ((bArrM50a[2] & 255) << 8) | (bArrM50a[3] & 255)];
            for (int i2 = 0; i2 < f40a.length; i2++) {
                int i3 = i;
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArrM50a[i3] & 255) << 24) | ((bArrM50a[i4] & 255) << 16);
                int i7 = i5 + 1;
                int i8 = i6 | ((bArrM50a[i5] & 255) << 8);
                i = i7 + 1;
                byte[] bArrM50a2 = h.m50a(i8 | (bArrM50a[i7] & 255));
                int length = bArrM50a2.length / 3;
                f40a[i2] = new int[length];
                while (true) {
                    length--;
                    if (length >= 0) {
                        f40a[i2][length] = ((bArrM50a2[length * 3] & 255) << 24) | ((bArrM50a2[(length * 3) + 1] & 255) << 16) | ((bArrM50a2[(length * 3) + 2] & 255) << 8) | 255;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static final Image m14a(int i) {
        byte[] bArrM50a = h.m50a(i);
        return a((bArrM50a[1] << 24) | (bArrM50a[2] << 16) | (bArrM50a[3] << 8) | (bArrM50a[4] & 255), bArrM50a[5] & 255, 0, 1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static final int m15a(int i, int i2, int i3, int i4) {
        int i5 = i2 | ((i4 - 1) << 11);
        int iA = a(i, i5);
        if (iA != -1) {
            return iA | (i3 << 13);
        }
        int iA2 = a(-1, 0);
        int i6 = iA2;
        if (iA2 != -1) {
            f38b.setElementAt(new Integer(i), i6);
            f39c.setElementAt(new Integer(i5), i6);
        } else {
            int length = f36a.length;
            i6 = length;
            Image[] imageArr = new Image[length + 1];
            System.arraycopy(f36a, 0, imageArr, 0, i6);
            f36a = imageArr;
            f38b.addElement(new Integer(i));
            f39c.addElement(new Integer(i5));
            f37a.addElement(new Integer(0));
        }
        f36a[i6] = a(i, i5, 0, i4);
        if (!f32a) {
            return i6;
        }
        f39c.setElementAt(new Integer(i5), i6);
        return i6 | (i3 << 13);
    }

    private static final void a(short[] sArr, int i) {
        int i2 = sArr[4];
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            short s = sArr[5 + (i2 << 1)];
            if (s >= 0) {
                int i3 = s + (sArr[s] * 5) + 1;
                int i4 = i3 + 1;
                int i5 = sArr[i3];
                while (true) {
                    i5--;
                    if (i5 >= 0) {
                        short s2 = sArr[i4];
                        if (s2 == 0) {
                            int i6 = i4 + 3;
                            i4 = i6 + 1;
                            int i7 = sArr[i6] & 2047;
                            f37a.setElementAt(new Integer(((Integer) f37a.elementAt(i7)).intValue() + i), i7);
                        } else {
                            i4 += 7;
                            if (s2 == 5) {
                                i4 += 2;
                            }
                        }
                    }
                }
            }
        }
    }

    private static final int a(int i, int i2) {
        int size = f38b.size();
        while (true) {
            size--;
            if (size < 0 || (((Integer) f38b.elementAt(size)).intValue() == i && (i == -1 || i2 == ((Integer) f39c.elementAt(size)).intValue()))) {
                break;
            }
        }
        return size;
    }

    public static final byte[] a(int[] iArr, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = (i5 & 1) > 0;
        boolean z2 = (i5 & 2) > 0;
        boolean z3 = i3 == -1;
        boolean z4 = z3;
        int i7 = z3 ? 1 : 4;
        int i8 = z4 ? 1 : 4;
        int i9 = 65531 - (65531 % ((i * i7) + 1));
        int i10 = (i * i2 * i7) + i2;
        int i11 = ((i10 - 1) / i9) + 1;
        int i12 = 6 + i10 + (i11 * 5);
        byte[] bArr2 = new byte[69 + (z4 ? (3 * iArr.length) + 25 : 0) + i12];
        bArr2[0] = -119;
        bArr2[1] = 80;
        bArr2[2] = 78;
        bArr2[3] = 71;
        bArr2[4] = 13;
        bArr2[5] = 10;
        bArr2[6] = 26;
        bArr2[7] = 10;
        bArr2[11] = 13;
        bArr2[12] = 73;
        bArr2[13] = 72;
        bArr2[14] = 68;
        bArr2[15] = 82;
        bArr2[18] = (byte) (i >> 8);
        bArr2[19] = (byte) i;
        bArr2[22] = (byte) (i2 >> 8);
        bArr2[23] = (byte) i2;
        bArr2[24] = 8;
        if (i3 != -1) {
            bArr2[25] = 6;
        } else {
            bArr2[25] = 3;
        }
        int iA = a(bArr2, 12, 17);
        bArr2[29] = (byte) (iA >> 24);
        bArr2[30] = (byte) (iA >> 16);
        bArr2[31] = (byte) (iA >> 8);
        bArr2[32] = (byte) iA;
        int i13 = 33;
        if (i3 == -1) {
            int length = iArr.length * 3;
            bArr2[35] = (byte) (length >> 8);
            bArr2[36] = (byte) length;
            bArr2[37] = 80;
            bArr2[38] = 76;
            bArr2[39] = 84;
            bArr2[40] = 69;
            int i14 = 41;
            int i15 = 0;
            while (i15 < iArr.length) {
                int i16 = i14;
                int i17 = i14 + 1;
                bArr2[i16] = (byte) (iArr[i15] >> 24);
                int i18 = i17 + 1;
                bArr2[i17] = (byte) (iArr[i15] >> 16);
                i14 = i18 + 1;
                int i19 = i15;
                i15++;
                bArr2[i18] = (byte) (iArr[i19] >> 8);
            }
            int iA2 = a(bArr2, (i14 - length) - 4, length + 4);
            int i20 = i14;
            int i21 = i14 + 1;
            bArr2[i20] = (byte) (iA2 >>> 24);
            int i22 = i21 + 1;
            bArr2[i21] = (byte) (iA2 >>> 16);
            int i23 = i22 + 1;
            bArr2[i22] = (byte) (iA2 >>> 8);
            bArr2[i23] = (byte) iA2;
            int i24 = i23 + 1 + 3;
            int i25 = i24 + 1;
            bArr2[i24] = 1;
            int i26 = i25 + 1;
            bArr2[i25] = 116;
            int i27 = i26 + 1;
            bArr2[i26] = 82;
            int i28 = i27 + 1;
            bArr2[i27] = 78;
            bArr2[i28] = 83;
            int i29 = i28 + 1 + 1;
            int iA3 = a(bArr2, i29 - 5, 5);
            int i30 = i29 + 1;
            bArr2[i29] = (byte) (iA3 >>> 24);
            int i31 = i30 + 1;
            bArr2[i30] = (byte) (iA3 >>> 16);
            int i32 = i31 + 1;
            bArr2[i31] = (byte) (iA3 >>> 8);
            i13 = i32 + 1;
            bArr2[i32] = (byte) iA3;
        }
        int i33 = i13;
        int i34 = i13 + 1;
        bArr2[i33] = (byte) (i12 >> 24);
        int i35 = i34 + 1;
        bArr2[i34] = (byte) (i12 >> 16);
        int i36 = i35 + 1;
        bArr2[i35] = (byte) (i12 >> 8);
        int i37 = i36 + 1;
        bArr2[i36] = (byte) i12;
        int i38 = i37 + 1;
        bArr2[i37] = 73;
        int i39 = i38 + 1;
        bArr2[i38] = 68;
        int i40 = i39 + 1;
        bArr2[i39] = 65;
        int i41 = i40 + 1;
        bArr2[i40] = 84;
        int i42 = i41 + 1;
        bArr2[i41] = 120;
        int i43 = i42 + 1;
        bArr2[i42] = 1;
        int iA4 = 1;
        int i44 = i9;
        int i45 = 0;
        for (int i46 = 0; i46 < i11; i46++) {
            if (i46 == i11 - 1) {
                bArr2[i43] = 1;
                i44 = i10 % i9;
            }
            int i47 = i43 + 1;
            int i48 = i47 + 1;
            bArr2[i47] = (byte) i44;
            int i49 = i48 + 1;
            bArr2[i48] = (byte) (i44 >> 8);
            int i50 = i44 ^ 65535;
            int i51 = i49 + 1;
            bArr2[i49] = (byte) i50;
            i43 = i51 + 1;
            bArr2[i51] = (byte) (i50 >> 8);
            int i52 = 0;
            while (i45 < i2 && i52 < i44) {
                i52++;
                i43++;
                int i53 = (z2 ? (i2 - i45) - i6 : i45) * i;
                for (int i54 = 0; i54 < i; i54++) {
                    int i55 = i4 + ((i53 + (z ? (i - i54) - i6 : i54)) * i8);
                    int i56 = i43;
                    i43++;
                    bArr2[i56] = bArr[i55];
                    if (i3 != -1) {
                        int i57 = i43 + 1;
                        int i58 = i55 + 1;
                        bArr2[i43] = bArr[i58];
                        int i59 = i57 + 1;
                        int i60 = i58 + 1;
                        bArr2[i57] = bArr[i60];
                        i43 = i59 + 1;
                        bArr2[i59] = bArr[i60 + 1];
                    }
                    i52 += i7;
                }
                i45++;
            }
            iA4 = a(bArr2, i43 - i44, i44, iA4);
        }
        int i61 = i43;
        int i62 = i43 + 1;
        bArr2[i61] = (byte) (iA4 >>> 24);
        int i63 = i62 + 1;
        bArr2[i62] = (byte) (iA4 >>> 16);
        int i64 = i63 + 1;
        bArr2[i63] = (byte) (iA4 >>> 8);
        int i65 = i64 + 1;
        bArr2[i64] = (byte) iA4;
        int iA5 = a(bArr2, i37, i65 - i37);
        int i66 = i65 + 1;
        bArr2[i65] = (byte) (iA5 >>> 24);
        int i67 = i66 + 1;
        bArr2[i66] = (byte) (iA5 >>> 16);
        int i68 = i67 + 1;
        bArr2[i67] = (byte) (iA5 >>> 8);
        bArr2[i68] = (byte) iA5;
        int i69 = i68 + 1 + 4;
        int i70 = i69 + 1;
        bArr2[i69] = 73;
        int i71 = i70 + 1;
        bArr2[i70] = 69;
        int i72 = i71 + 1;
        bArr2[i71] = 78;
        int i73 = i72 + 1;
        bArr2[i72] = 68;
        int i74 = i73 + 1;
        bArr2[i73] = -82;
        int i75 = i74 + 1;
        bArr2[i74] = 66;
        bArr2[i75] = 96;
        bArr2[i75 + 1] = -126;
        return bArr2;
    }

    private static int a(byte[] bArr, int i, int i2, int i3) {
        int i4 = i3 >>> 16;
        int i5 = i3 & 65535;
        int i6 = i2 + i;
        int i7 = i;
        while (i7 < i6) {
            int i8 = i7;
            i7++;
            i5 = (i5 + (bArr[i8] & 255)) % 65521;
            i4 = (i4 + i5) % 65521;
        }
        return (i4 << 16) + i5;
    }

    private static final int a(byte[] bArr, int i, int i2) {
        if (f41a == null) {
            f41a = new int[256];
            for (int i3 = 0; i3 < 256; i3++) {
                int i4 = i3;
                int i5 = 8;
                while (true) {
                    i5--;
                    if (i5 >= 0) {
                        i4 = (i4 & 1) != 0 ? (-306674912) ^ (i4 >>> 1) : i4 >>> 1;
                        f41a[i3] = i4;
                    }
                }
            }
        }
        int i6 = -1;
        int i7 = i2 + i;
        while (i < i7) {
            i6 = f41a[(i6 ^ bArr[i]) & 255] ^ (i6 >>> 8);
            i++;
        }
        return i6 ^ (-1);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m16a(Graphics graphics, int i, int i2) {
        int i3;
        short[] sArr = this.f33a[this.h];
        int i4 = i2 - sArr[1];
        return i4 > graphics.getClipY() - sArr[3] && i4 < graphics.getClipY() + graphics.getClipHeight() && (i3 = i - sArr[0]) > graphics.getClipX() - sArr[2] && i3 < graphics.getClipX() + graphics.getClipWidth();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int[] m17a(int i) {
        short[] sArr = this.f33a[this.h];
        int i2 = this.j;
        int i3 = i2 + 1;
        int i4 = sArr[i2];
        while (true) {
            i4--;
            if (i4 < 0) {
                return null;
            }
            if (sArr[i3] == i) {
                int[][] iArr = f42b;
                int i5 = l;
                l = i5 + 1;
                int[] iArr2 = iArr[i5 & 7];
                int i6 = i3 + 1;
                iArr2[0] = sArr[i6];
                int i7 = i6 + 1;
                iArr2[1] = sArr[i7];
                int i8 = i7 + 1;
                iArr2[2] = sArr[i8];
                iArr2[3] = sArr[i8 + 1];
                return iArr2;
            }
            i3 += 5;
        }
    }
}
