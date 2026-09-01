package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:e.class */
public final class e implements Runnable {
    private static i a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static i[] f64a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f65a;
    private static int b = 0;
    private static int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static int f66a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[] f67a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[] f68b = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static i f69b = null;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static i f70c = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f71a = null;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f72b = null;

    public static int a(int i) {
        int i2 = 0;
        f66a += i;
        if (f67a.length == 0) {
            return 2;
        }
        i iVar = null;
        if (b >= 0) {
            iVar = f64a[b];
        } else if (b == -1) {
            iVar = f69b;
        } else if (b == -2) {
            iVar = f70c;
        }
        if (a == null || a != iVar) {
            a = iVar;
            a.b();
        } else {
            int[] iArrM71a = a.m71a(i);
            if (iArrM71a != null) {
                if (b < 0) {
                    if (b == -2) {
                        b = c;
                    } else {
                        i2 = 2;
                    }
                } else if (iArrM71a[1] == 5) {
                    i2 = 2;
                } else {
                    f65a = f67a[b];
                    if (f65a == null) {
                        c = b;
                        b = -2;
                    } else if (f.a(f65a)) {
                        i2 = 1;
                    } else {
                        b = -1;
                    }
                }
            }
        }
        if (i2 != 0) {
            b = 0;
            h.m54b();
            a = null;
            f64a = null;
        }
        return i2;
    }

    public static void a(Graphics graphics) {
        if (b < 0) {
            if (b == -1) {
                f69b.a(graphics, 0, 0);
            }
            if (b == -2) {
                f70c.a(graphics, 0, 0);
                return;
            }
            return;
        }
        if (a != null) {
            a.a(graphics, f72b.getWidth() + 5, 0);
            if (b == -1 || f67a.length <= 1) {
                return;
            }
            int i = (f66a / 40) % 5;
            if (b > 0) {
                graphics.drawImage(f71a, 5 - i, h.a() / 2, 6);
            }
            if (b < f67a.length - 1) {
                graphics.drawImage(f72b, (h.e() - 5) + i, h.a() / 2, 10);
            }
        }
    }

    public static void a(int i, int i2) {
        if (a != null) {
            if (f64a != null) {
                int iM56a = 0;
                if (i2 == 0) {
                    iM56a = h.m56a(i);
                }
                if (b >= 0) {
                    if (iM56a == 52) {
                        b--;
                        if (b < 0) {
                            b = f64a.length - 1;
                        }
                    } else if (iM56a == 54) {
                        b++;
                        if (b > f64a.length - 1) {
                            b = 0;
                        }
                    }
                }
            }
            a.c(i, i2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (f.a(f65a)) {
            return;
        }
        b = -1;
    }

    private static String[] a() {
        String strM66b = h.m66b(5);
        if (strM66b == null) {
            return new String[]{"none"};
        }
        int i = 0;
        int i2 = 0;
        int length = 0;
        while (true) {
            int i3 = length;
            if (i3 >= strM66b.length()) {
                break;
            }
            i2++;
            if (strM66b.startsWith("none!.!", i3) || strM66b.substring(i3).equals("none")) {
                length = i3 + "none".length() + "!.!".length();
            } else {
                i++;
                int iIndexOf = strM66b.indexOf("!.!", i3);
                if (iIndexOf == -1) {
                    break;
                }
                length = iIndexOf + "!.!".length();
            }
        }
        if (i == 0) {
            return new String[0];
        }
        f68b = new String[i2];
        int length2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iIndexOf2 = strM66b.indexOf("!.!", length2);
            int length3 = iIndexOf2;
            if (iIndexOf2 == -1) {
                length3 = strM66b.length();
            }
            if (length2 < length3) {
                f68b[i4] = strM66b.substring(length2, length3);
            } else {
                f68b[i4] = "nolink";
            }
            length2 = length3 + "!.!".length();
        }
        f67a = new String[i];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            if (!"none".equals(f68b[i6])) {
                if ("nolink".equals(f68b[i6])) {
                    f67a[i5] = null;
                } else {
                    f67a[i5] = new StringBuffer().append(f68b[i6]).append("&aid=").append("1028").append("&clk=0&car=").append(h.m66b(2)).append("&lng=").append(h.m57a(179)).toString();
                }
                i5++;
            }
        }
        return f67a;
    }

    public static void a(String[] strArr, Image[] imageArr, String[] strArr2, Image[] imageArr2) {
        f71a = h.m53a(65546);
        f72b = h.m53a(65547);
        h.a(24, 181, null, 0);
        int width = f71a.getWidth() + f72b.getWidth() + 10;
        f64a = new i[a().length];
        int i = 0;
        for (int i2 = 0; i2 < f68b.length; i2++) {
            if (!"none".equals(f68b[i2])) {
                i iVarM25a = f.m25a();
                iVarM25a.a(1, 2, 0);
                Image image = null;
                if (imageArr != null && imageArr[i2] != null) {
                    image = imageArr[i2];
                }
                String str = null;
                if (strArr != null && strArr[i2] != null) {
                    str = strArr[i2];
                }
                Image image2 = null;
                if (imageArr2 != null && imageArr2[i2] != null) {
                    image2 = imageArr2[i2];
                }
                String str2 = null;
                if (strArr2 != null && strArr2[i2] != null) {
                    str2 = strArr2[i2];
                }
                iVarM25a.a(str, image, 1);
                if (image2 != null) {
                    iVarM25a.a(0, 1, (String) null, new Image[]{image2}, 0);
                    iVarM25a.a(1, 1, str2, (Image[]) null, 0);
                } else {
                    iVarM25a.a(0, 1, str2, (Image[]) null, 0);
                }
                iVarM25a.a(24, 0);
                iVarM25a.a(5, 1);
                iVarM25a.b(h.e() - width, h.a());
                f64a[i] = iVarM25a;
                i++;
            }
        }
        f70c = f.m25a();
        f70c.a(1, 1, 0);
        f70c.a(h.m57a(176), (Image) null, 1);
        f70c.a(0, 1, h.m57a(180), (Image[]) null, 0);
        f70c.a(1, 0);
        f70c.b(h.e(), h.a());
        f69b = f.m25a();
        f69b.a(1, 1, 0);
        f69b.a(h.m57a(176), (Image) null, 1);
        f69b.a(0, 1, h.m57a(178), (Image[]) null, 0);
        f69b.a(1, 0);
        f69b.b(h.e(), h.a());
    }
}
