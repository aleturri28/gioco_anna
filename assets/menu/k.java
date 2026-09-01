package defpackage;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:k.class */
public final class k implements Runnable {
    private i a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private i[] f259a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f260a = h.m66b(10);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f261a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f262a;
    private int d;
    private int e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f263b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f264c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Image[] f265a;

    public k() {
        this.f261a = 0;
        this.f264c = this.f260a != null;
        this.f263b = !"nolink".equals(this.f260a);
        String strM66b = h.m66b(11);
        if (strM66b != null) {
            this.c = Integer.parseInt(strM66b) * 1000;
        }
        String strM66b2 = h.m66b(12);
        if (strM66b2 != null) {
            this.e = Integer.parseInt(strM66b2);
            if (this.e != 0) {
                byte[] bArrA = h.a("pc");
                byte[] bArr = bArrA;
                if (bArrA != null) {
                    this.d = bArr[0];
                } else {
                    bArr = new byte[1];
                }
                this.d++;
                bArr[0] = (byte) this.d;
                h.a(true);
                h.a("pc", bArr);
                if (this.d > this.e) {
                    this.f261a = 1;
                }
            }
        }
    }

    public final boolean a(int i) {
        if (!this.f264c) {
            return false;
        }
        if (i != 2) {
            if (i != 4) {
                return false;
            }
            this.f262a = false;
            this.f261a = 2;
            return true;
        }
        h.a(false);
        if (this.d > this.e) {
            this.f261a = 1;
            return true;
        }
        this.f261a = 0;
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m110a(int i) throws MIDletStateChangeException {
        if (!this.f264c) {
            return 2;
        }
        int i2 = 0;
        boolean z = false;
        if (this.f259a == null) {
            a();
        }
        if (this.a == null || this.a != this.f259a[this.f261a]) {
            this.a = this.f259a[this.f261a];
            this.a.b();
        } else {
            int[] iArrM71a = this.a.m71a(i);
            if (iArrM71a != null) {
                if (iArrM71a[1] == 1) {
                    this.f262a = true;
                    i2 = 4;
                } else if (iArrM71a[1] == 24) {
                    f.a(this.f260a);
                    i2 = 3;
                    z = true;
                } else if (iArrM71a[1] == 5) {
                    this.f262a = true;
                    i2 = 4;
                } else if (iArrM71a[1] == 6) {
                    i2 = 3;
                    z = true;
                }
            }
        }
        if (i2 != 0) {
            this.f261a = 0;
            h.m54b();
            this.a = null;
            this.f259a = null;
        }
        if (z) {
            try {
                f.a().destroyApp(false);
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    public final void a(Graphics graphics) {
        if (this.f264c && this.a != null) {
            this.a.a(graphics, 0, 0);
        }
    }

    public final void a(int i, int i2) {
        if (this.f264c && this.a != null) {
            this.a.c(i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    @Override // java.lang.Runnable
    public final void run() throws MIDletStateChangeException {
        f.a(this.f260a);
    }

    public final void a() {
        String strM57a;
        String string;
        String strM57a2;
        this.f265a = new Image[]{h.m53a(65543)};
        String strM57a3 = h.m57a(183);
        if (this.e > 0) {
            strM57a3 = new StringBuffer().append(strM57a3).append("\\n").append(h.a(h.m57a(186), new String[]{new StringBuffer().append("").append((this.e - this.d) + 1).toString()})).toString();
            strM57a = this.d > this.e ? h.m57a(185) : h.m57a(184);
        } else {
            strM57a = h.m57a(184);
        }
        if (this.f263b) {
            h.a(24, 181, null, 0);
            string = new StringBuffer().append(strM57a).append("\\n").append(h.m57a(187)).toString();
            strM57a2 = h.m57a(190);
        } else {
            string = new StringBuffer().append(strM57a).append("\\n").append(h.m57a(188)).toString();
            strM57a2 = h.m57a(188);
        }
        this.f259a = new i[3];
        this.f259a[0] = f.m25a();
        this.f259a[0].a(1, 2, 0);
        this.f259a[0].a(h.m57a(182), (Image) null, 1);
        this.f259a[0].a(0, 1, (String) null, this.f265a, 0);
        this.f259a[0].a(1, 1, strM57a3, (Image[]) null, 0);
        this.f259a[0].a(1, 0);
        this.f259a[0].b(h.e(), h.a());
        this.f259a[1] = f.m25a();
        this.f259a[1].a(1, 2, 0);
        this.f259a[1].a(h.m57a(182), (Image) null, 1);
        this.f259a[1].a(0, 1, (String) null, this.f265a, 0);
        this.f259a[1].a(1, 1, string, (Image[]) null, 0);
        if (this.f263b) {
            this.f259a[1].a(24, 0);
        }
        this.f259a[1].a(6, 1);
        this.f259a[1].b(h.e(), h.a());
        this.f259a[2] = f.m25a();
        this.f259a[2].a(1, 2, 0);
        this.f259a[2].a(h.m57a(182), (Image) null, 1);
        this.f259a[2].a(0, 1, (String) null, this.f265a, 0);
        this.f259a[2].a(1, 1, strM57a2, (Image[]) null, 0);
        if (this.f263b) {
            this.f259a[2].a(24, 0);
        }
        if (this.d > this.e) {
            this.f259a[2].a(6, 1);
        } else {
            this.f259a[2].a(5, 1);
        }
        this.f259a[2].b(h.e(), h.a());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m111a(int i) {
        if (!this.f262a || this.c == 0) {
            return;
        }
        this.b += i;
        if (this.b > this.c) {
            this.f261a = 1;
            this.f262a = false;
            f.a().a(5);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final String m112a() {
        if (this.f264c) {
            return h.m57a(189);
        }
        return null;
    }
}
