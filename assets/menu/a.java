package defpackage;

import javax.microedition.io.Connector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:a.class */
public final class a implements CommandListener, Runnable {
    private static i[] a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static i f23a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f24a;
    private static String b;
    private static String c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f25a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Form f26a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static TextField f27a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Command f28a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Command f29b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f30a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f31a;

    public static void a(String str) {
        b = str;
    }

    public static int a(int i) {
        int i2 = 0;
        if (f25a == -1) {
            b();
            return 2;
        }
        if (a == null) {
            a();
        }
        if (f23a == null || f23a != a[f25a]) {
            if (f25a != 1) {
                f23a = a[f25a];
                f23a.b();
                return 0;
            }
            if (f23a == null) {
                return 0;
            }
            f23a = null;
            h.m54b();
            h.c(false);
            f27a = new TextField(h.m57a(227), "", 15, 3);
            f26a = new Form(h.m57a(177));
            f26a.append(f27a);
            f26a.append(b);
            f28a = new Command(h.m57a(161), 1, 0);
            f26a.addCommand(f28a);
            f29b = new Command(h.m57a(169), 2, 0);
            f26a.addCommand(f29b);
            if (f30a == null) {
                f30a = new a();
            }
            f26a.setCommandListener(f30a);
            f.a((Displayable) f26a);
            return 0;
        }
        if (f25a == 2) {
            try {
                f24a = f27a.getString();
                if (f24a == null || f24a.equals("")) {
                    f25a = 5;
                } else {
                    if (!f31a) {
                        new Thread(new a()).start();
                        f31a = true;
                    }
                    Thread.sleep(1L);
                }
            } catch (Exception unused) {
                f25a = 4;
            }
        } else {
            int[] iArrM71a = f23a.m71a(i);
            if (iArrM71a != null) {
                if (f25a == 0) {
                    if (iArrM71a[1] == 5) {
                        i2 = 2;
                    } else {
                        f25a = 1;
                    }
                }
                if (f25a == 3 || f25a == 4) {
                    i2 = 1;
                }
                if (f25a == 5) {
                    f25a = 1;
                }
            }
        }
        if (i2 != 0) {
            b();
        }
        return i2;
    }

    public static void a() {
        if (c == null) {
            c = h.m57a(226);
        }
        a = new i[6];
        for (int i = 0; i < 6; i++) {
            String strM57a = null;
            int i2 = -1;
            int i3 = -1;
            if (i == 0) {
                strM57a = c;
                i2 = 1;
                i3 = 5;
            }
            if (i == 2) {
                strM57a = h.m57a(228);
            }
            if (i == 3) {
                strM57a = h.m57a(229);
                i2 = 1;
            }
            if (i == 4) {
                strM57a = h.m57a(231);
                i2 = 1;
            }
            if (i == 5) {
                strM57a = h.m57a(230);
                i2 = 1;
            }
            a[i] = f.m25a();
            a[i].a(1, 1, 0);
            a[i].a(h.m57a(177), (Image) null, 1);
            a[i].a(0, 1, strM57a, (Image[]) null, 0);
            a[i].b(h.e(), h.a());
            if (i2 != -1) {
                a[i].a(i2, 0);
            }
            if (i3 != -1) {
                a[i].a(i3, 1);
            }
        }
    }

    public static void a(Graphics graphics) {
        if (f23a != null) {
            f23a.a(graphics, 0, 0);
        }
    }

    public static void a(int i, int i2) {
        if (f23a != null) {
            f23a.c(i, i2);
        }
    }

    private static void b() {
        h.m54b();
        f25a = 0;
        a = null;
        f23a = null;
        b = null;
        c = null;
        f28a = null;
        f29b = null;
        f26a = null;
        f27a = null;
        f30a = null;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (f25a == 1) {
            if (command == f28a) {
                f25a = 2;
            } else {
                f25a = -1;
            }
            h.c(true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageConnection messageConnectionOpen = Connector.open(new StringBuffer().append("sms://").append(f24a).toString());
            TextMessage textMessageNewMessage = messageConnectionOpen.newMessage("text");
            textMessageNewMessage.setAddress(new StringBuffer().append("sms://").append(f24a).toString());
            textMessageNewMessage.setPayloadText(b);
            messageConnectionOpen.send(textMessageNewMessage);
            messageConnectionOpen.close();
            f25a = 3;
        } catch (Exception unused) {
            f25a = 4;
        }
        f31a = false;
    }
}
