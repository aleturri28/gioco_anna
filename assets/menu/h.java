package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:h.class */
public final class h extends GameCanvas implements PlayerListener {
    private static f a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f131a;
    private static boolean b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static int f132a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f133a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Image f134a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static int f135b;
    private static int c;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String f136b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Image f137b;
    private static int d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Hashtable f138a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static h f139a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static d f140a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f141a = {"audio/midi", "audio/wav", "audio/amr", "audio/mpeg"};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Player f142a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static Player f143b;
    private static int e;
    private static int f;
    private static int g;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static boolean f144c;
    private static int h;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String f145c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static byte[] f146a;
    private static int i;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static String[] f147b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String[][] f148a;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private static String[] f149c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private static boolean f150d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static k f151a;

    public h() {
        super(false);
        setFullScreenMode(true);
    }

    public final void keyPressed(int i2) {
        if (i2 == -6 || i2 == -6) {
            if (f132a != -1) {
                a.a(f132a, 3);
            }
        } else if (i2 != -7 && i2 != -7) {
            a.a(i2, 0);
        } else if (c != -1) {
            a.a(c, 3);
        }
    }

    private static void a(Player player) {
        if (player != null) {
            try {
                player.close();
            } catch (Exception unused) {
            }
        }
    }

    public static int a() {
        return f139a.getHeight();
    }

    public static DataInputStream a(int i2) {
        if (i2 != -1) {
            return new DataInputStream(new ByteArrayInputStream(m50a(i2)));
        }
        return null;
    }

    public static byte[] a(String str) {
        f.d();
        byte[] record = null;
        try {
            RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, false);
            record = recordStoreOpenRecordStore.getRecord(1);
            recordStoreOpenRecordStore.closeRecordStore();
        } catch (Exception unused) {
        }
        return record;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m49a() {
        return f144c;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m50a(int i2) {
        byte[] bArrB = null;
        if (i2 != -1) {
            m55a(new StringBuffer().append("r").append(i2 >>> 16).toString());
            bArrB = b(i2 & 65535);
        }
        return bArrB;
    }

    private static Player a(int i2, int i3, int i4) {
        Player player = null;
        try {
            Player playerM65a = m65a(i2);
            player = playerM65a;
            if (playerM65a.getState() != 300) {
                player.prefetch();
            }
            player.setLoopCount(i3);
            VolumeControl control = player.getControl("VolumeControl");
            if (control != null) {
                control.setLevel(i4 * 20);
            }
            player.start();
        } catch (Exception unused) {
        }
        return player;
    }

    public static int b() {
        return i;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String[][] m51a() {
        return f148a;
    }

    private static byte[] b(int i2) {
        int length = f146a.length;
        int iM64c = m64c(4);
        int iM64c2 = m64c(8 + (i2 * 4));
        int iM64c3 = i2 == iM64c - 1 ? length - iM64c2 : m64c((8 + (i2 * 4)) + 4) - iM64c2;
        byte[] bArr = new byte[iM64c3];
        System.arraycopy(f146a, iM64c2, bArr, 0, iM64c3);
        return bArr;
    }

    public static String a(String str, String[] strArr) {
        try {
            if (strArr.length == 1) {
                str = a(str, "%U", strArr[0]);
            } else {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    str = a(str, new StringBuffer().append("%").append(i2).append("U").toString(), strArr[i2]);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m52a() {
        Graphics graphics = f139a.getGraphics();
        a.a(graphics);
        a(graphics);
        f139a.flushGraphics();
    }

    public static void a(boolean z) {
        f150d = !z;
    }

    public final void showNotify() {
        if (b) {
            b = false;
        } else {
            try {
                a.startApp();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Image m53a(int i2) {
        Image imageCreateImage = null;
        if (i2 != -1) {
            byte[] bArrM50a = m50a(i2);
            imageCreateImage = Image.createImage(bArrM50a, 0, bArrM50a.length);
        }
        return imageCreateImage;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m54b() {
        f132a = -1;
        f134a = null;
        f133a = null;
        c = -1;
        f137b = null;
        f136b = null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m55a(String str) {
        if (str.equals(f145c)) {
        }
        f.d();
        f145c = str;
        try {
            switch (h) {
                case 0:
                    f146a = new byte[4];
                    InputStream resourceAsStream = f139a.getClass().getResourceAsStream(str);
                    resourceAsStream.read(f146a, 0, 4);
                    int iM64c = m64c(0);
                    f146a = new byte[iM64c];
                    for (int i2 = 4; i2 < iM64c; i2 += resourceAsStream.read(f146a, i2, iM64c - i2)) {
                    }
                    resourceAsStream.close();
                    break;
                case 1:
                    f146a = a(str);
                    break;
            }
        } catch (Exception unused) {
            f145c = null;
            f146a = null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static int m56a(int i2) {
        if ((i2 >= 48 && i2 <= 57) || i2 == 42 || i2 == 35) {
            return i2;
        }
        int gameAction = 0;
        try {
            gameAction = f139a.getGameAction(i2);
        } catch (Exception unused) {
        }
        if (gameAction != 0) {
            return gameAction == 8 ? 53 : gameAction == 1 ? 50 : gameAction == 6 ? 56 : gameAction == 2 ? 52 : gameAction == 5 ? 54 : 0;
        }
        return 0;
    }

    public static int c() {
        return f140a.a() + 2 + 2;
    }

    public static int d() {
        return f;
    }

    public static void a(int i2, int i3, Image image, int i4) {
        f138a.put(new Integer(0 | i2), new Integer(i3));
        f138a.put(new Integer(16777216 | i2), m57a(i3));
        if (image != null) {
            f138a.put(new Integer(33554432 | i2), image);
        }
        f138a.put(new Integer(50331648 | i2), new Integer(i4));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m57a(int i2) {
        String utf = null;
        if (i2 != -1) {
            try {
                m55a(new StringBuffer().append("l").append(i).append("_").append(i2 >>> 16).toString());
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(b(i2 & 65535)));
                utf = dataInputStream.readUTF();
                dataInputStream.close();
            } catch (Exception unused) {
            }
        }
        return utf;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static int m58b(int i2) {
        return ((Integer) f138a.get(new Integer(50331648 | i2))).intValue();
    }

    public static void b(boolean z) {
        if (!z) {
            Display.getDisplay(a).vibrate(0);
        }
        f144c = z;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static void m59c() {
        f145c = null;
        f146a = null;
    }

    private static void h() {
        if (f == 0 || f143b == null) {
            return;
        }
        try {
            if (f143b.getState() == 0) {
                f143b = a(e, g, f);
            } else {
                f143b.start();
            }
        } catch (Exception unused) {
        }
    }

    public static int e() {
        return f139a.getWidth();
    }

    public static void a(int i2, int i3) {
        if (f == 0 || i2 == -1) {
            return;
        }
        m62e();
        f();
        g = i3;
        f143b = a(i2, i3, f);
        e = i2;
    }

    public static void a(String str, byte[] bArr) {
        f.d();
        if (f150d) {
            return;
        }
        try {
            RecordStore.deleteRecordStore(str);
        } catch (Exception unused) {
        }
        if (bArr != null) {
            try {
                RecordStore recordStoreOpenRecordStore = RecordStore.openRecordStore(str, true);
                recordStoreOpenRecordStore.addRecord(bArr, 0, bArr.length);
                recordStoreOpenRecordStore.closeRecordStore();
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(d dVar) {
        f140a = dVar;
    }

    public static void b(int i2, int i3) {
        String str = (String) f138a.get(new Integer(16777216 | i2));
        Image image = (Image) f138a.get(new Integer(33554432 | i2));
        int iIntValue = ((Integer) f138a.get(new Integer(50331648 | i2))).intValue();
        boolean z = true;
        int i4 = -1;
        if (i3 == 0) {
            if (iIntValue == 0 || iIntValue == 1) {
                if (f132a != -1) {
                    if (iIntValue < f135b) {
                        i4 = f132a;
                    } else {
                        z = false;
                    }
                }
            } else if (c == -1) {
                z = false;
            } else if (iIntValue > d) {
                i4 = c;
                z = false;
            }
            if (i4 != -1) {
                m54b();
                if (z) {
                    b(i4, 3);
                } else {
                    b(i4, 1);
                }
            }
        } else if (i3 != 1) {
            z = false;
        }
        if (z) {
            f132a = i2;
            f134a = image;
            f133a = str;
            f135b = iIntValue;
            return;
        }
        c = i2;
        f137b = image;
        f136b = str;
        d = iIntValue;
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static void m60d() {
        if (f143b != null) {
            try {
                f143b.stop();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m61a(int i2) {
        i = i2;
    }

    public static void c(boolean z) {
        if (!z) {
            f131a = true;
            return;
        }
        f131a = false;
        b = true;
        f.a((Displayable) f139a);
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static void m62e() {
        a(f142a);
        f142a = null;
    }

    public final void keyRepeated(int i2) {
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 2);
    }

    public final void paint(Graphics graphics) {
    }

    public final void playerUpdate(Player player, String str, Object obj) {
    }

    public final void keyReleased(int i2) {
        if (i2 == -6 || i2 == -6 || i2 == -7 || i2 == -7) {
            return;
        }
        a.a(i2, 1);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m63b(int i2) {
        f = i2;
        if (f == 0) {
            f();
        } else {
            a(f143b);
            h();
        }
    }

    private static String a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf(str2);
        return iIndexOf >= 0 ? new StringBuffer().append(str.substring(0, iIndexOf)).append(str3).append(str.substring(iIndexOf + str2.length())).toString() : str;
    }

    public static void c(int i2) {
        if (f144c) {
            Display.getDisplay(a).vibrate(i2);
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    private static int m64c(int i2) {
        return ((f146a[i2] & 255) << 24) | ((f146a[i2 + 1] & 255) << 16) | ((f146a[i2 + 2] & 255) << 8) | (f146a[i2 + 3] & 255);
    }

    public static void a(f fVar) {
        if (f139a == null) {
            f139a = new h();
        }
        a = fVar;
    }

    public static void f() {
        a(f143b);
        e = -1;
        f143b = null;
    }

    public final void hideNotify() {
        try {
            if (f131a) {
                return;
            }
            a.pauseApp();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static Player m65a(int i2) {
        try {
            Player playerCreatePlayer = Manager.createPlayer(new ByteArrayInputStream(m50a(i2)), f141a[m69f()]);
            playerCreatePlayer.addPlayerListener(f139a);
            return playerCreatePlayer;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h.g():void");
    }

    public static void a(int i2, String str) {
        f138a.put(new Integer(16777216 | i2), str);
        if (f132a == i2) {
            f133a = str;
        }
        if (c == i2) {
            f136b = str;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m66b(int i2) {
        return f149c[i2 - 1];
    }

    private static void a(Graphics graphics) {
        graphics.setClip(0, 0, e(), a());
        int iA = a() - 2;
        if (f132a != -1) {
            if (f134a != null) {
                graphics.drawImage(f134a, 2, iA - f134a.getHeight(), 20);
            } else {
                f140a.a(graphics, f133a, 2, iA, 36);
            }
        }
        if (c != -1) {
            if (f137b != null) {
                graphics.drawImage(f137b, (e() - 2) - f137b.getWidth(), iA - f137b.getHeight(), 20);
            } else {
                f140a.a(graphics, f136b, (e() - 2) - f140a.a(f136b), iA, 36);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static k m67a() {
        if (f151a == null) {
            f151a = new k();
        }
        return f151a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static c m68a() {
        return new c();
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    private static int m69f() {
        return 0;
    }

    static {
        String[] strArr = {".mid", ".wav", ".amr", ".mp3"};
    }
}
