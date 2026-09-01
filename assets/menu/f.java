package defpackage;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:f.class */
public abstract class f extends MIDlet implements Runnable {
    private long a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f73a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f74a;
    private int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f75a;
    public boolean c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f76b;
    private boolean d;
    private boolean e;
    private boolean f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static f f77a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Thread f78a;
    private static boolean g;

    public f() {
        f77a = this;
        h.a(this);
        h.c(true);
    }

    public static f a() {
        return f77a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f75a) {
                this.f74a = new int[8];
                mo1a();
                h.g();
                a(2);
                this.f75a = true;
            } else if (this.e) {
                a(1);
                this.d = false;
                this.e = false;
                h.m52a();
            }
            if (!this.d && !this.c) {
                int iB = b();
                if (!g) {
                    h.m67a().m111a(mo26a());
                }
                g = false;
                b(iB);
                h.m52a();
            }
            Thread.yield();
            if (this.c || this.d) {
                synchronized (this) {
                    this.f = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Exception unused) {
            if (this.c || this.d) {
                synchronized (this) {
                    this.f = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
        } catch (Throwable th) {
            if (this.c || this.d) {
                synchronized (this) {
                    this.f = false;
                }
            } else {
                Display.getDisplay(this).callSerially(this);
            }
            throw th;
        }
        if (!this.c || this.f76b) {
            return;
        }
        h.m62e();
        h.f();
        a(3);
        notifyDestroyed();
    }

    public void destroyApp(boolean z) throws MIDletStateChangeException {
        h.m62e();
        h.f();
        this.f76b = z;
        this.c = true;
        if (z) {
            a(3);
            try {
                if (f78a != null) {
                    f78a.join();
                    f78a = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public void pauseApp() {
        if (this.d) {
            return;
        }
        h.m60d();
        h.m62e();
        a(0);
        this.d = true;
    }

    public void startApp() throws MIDletStateChangeException {
        if (!this.f75a) {
            synchronized (this) {
                if (!this.f) {
                    this.f = true;
                    Display.getDisplay(this).callSerially(this);
                }
            }
            return;
        }
        this.a = System.currentTimeMillis();
        this.e = true;
        synchronized (this) {
            if (this.d && !this.f) {
                this.f = true;
                Display.getDisplay(this).callSerially(this);
            }
        }
    }

    public abstract void a(Graphics graphics);

    public abstract void b(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i);

    /* JADX INFO: renamed from: a */
    public abstract String[][] mo2a();

    /* JADX INFO: renamed from: a */
    public abstract String mo3a(int i);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static i m25a() {
        return new i();
    }

    /* JADX INFO: renamed from: a */
    public void mo1a() {
        this.a = System.currentTimeMillis();
        this.f73a = 0;
        for (int i = 0; i < 8; i++) {
            this.f74a[i] = 40;
        }
        this.b = 320;
    }

    public int b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = (int) (jCurrentTimeMillis - this.a);
        this.a = jCurrentTimeMillis;
        this.b -= Math.min(this.f74a[this.f73a], 500);
        this.b += Math.min(i, 500);
        this.f74a[this.f73a] = i;
        this.f73a = (this.f73a + 1) & 7;
        return this.b >> 3;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public int mo26a() {
        int i = this.f73a - 1;
        int i2 = i;
        if (i < 0) {
            i2 = 7;
        }
        return this.f74a[i2];
    }

    public static void a(Displayable displayable) {
        Display.getDisplay(f77a).setCurrent(displayable);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.microedition.midlet.MIDletStateChangeException */
    public static boolean a(String str) throws MIDletStateChangeException {
        boolean z = true;
        try {
            if (f77a.platformRequest(str)) {
                f77a.destroyApp(false);
            }
        } catch (Exception unused) {
            z = false;
        }
        return z;
    }

    public static void d() {
        g = true;
    }
}
