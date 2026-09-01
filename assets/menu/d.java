package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* JADX INFO: loaded from: pyramidblo_s4v92x6z.jar:d.class */
public final class d {
    private Image a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Font f55a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f56a;
    private int b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private short[] f57a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private short[] f58b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private byte[] f59a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private byte[] f60b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private byte[] f61c;
    private int d;
    private int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f62a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f63a;

    public d(Image image, DataInputStream dataInputStream, Font font, int i, int i2, boolean z) {
        if (image == null) {
            this.d = i;
            this.e = i2;
            this.f62a = z;
            this.f55a = font;
            return;
        }
        this.a = image;
        try {
            int i3 = dataInputStream.readShort();
            this.f56a = dataInputStream.readByte();
            this.b = dataInputStream.readByte();
            this.c = dataInputStream.readByte();
            int i4 = 1;
            while (i4 < (i3 << 2) / 3) {
                i4 <<= 1;
            }
            a(i4);
            this.f57a = new short[i3];
            this.f58b = new short[i3];
            this.f59a = new byte[i3];
            this.f60b = new byte[i3];
            this.f61c = new byte[i3];
            while (i3 > 0) {
                int i5 = dataInputStream.read();
                char c = dataInputStream.readChar();
                while (true) {
                    int i6 = i5;
                    i5 = i6 - 1;
                    if (i6 > 0) {
                        i3--;
                        this.f57a[i3] = (short) dataInputStream.read();
                        this.f58b[i3] = dataInputStream.readShort();
                        this.f59a[i3] = dataInputStream.readByte();
                        this.f60b[i3] = dataInputStream.readByte();
                        this.f61c[i3] = dataInputStream.readByte();
                        char c2 = c;
                        c = (char) (c + 1);
                        a(c2, (short) i3);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    private int b(char c) {
        int iC = c(c);
        int iC2 = iC;
        if (iC == -1) {
            iC2 = c(' ');
        }
        return iC2;
    }

    public final int a(String str) {
        if (this.a == null) {
            return this.f55a.stringWidth(str);
        }
        int i = 0;
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f59a[b(str.charAt(length))] + this.f56a;
        }
    }

    public final int a(char c) {
        if (this.a == null) {
            return this.f55a.charWidth(c);
        }
        return this.f59a[b(c)] + this.f56a;
    }

    public final int a() {
        return this.a == null ? this.f62a ? this.f55a.getHeight() + 2 : this.f55a.getHeight() : this.b + this.c;
    }

    public final void a(Graphics graphics, String str, int i, int i2, int i3) {
        if (this.a == null) {
            graphics.setFont(this.f55a);
            if (this.f62a) {
                if ((i3 & 16) != 0) {
                    i2++;
                } else if ((i3 & 32) != 0) {
                    i2--;
                }
                graphics.setColor(this.e);
                graphics.drawString(str, i, i2 - 1, i3);
                graphics.drawString(str, i - 1, i2, i3);
                graphics.drawString(str, i + 1, i2, i3);
                graphics.drawString(str, i, i2 + 1, i3);
            }
            graphics.setColor(this.d);
            graphics.drawString(str, i, i2, i3);
            return;
        }
        if ((i3 & 1) != 0) {
            i -= a(str) >> 1;
        }
        if ((i3 & 16) != 0) {
            i2 += this.b;
        } else if ((i3 & 32) != 0) {
            i2 -= this.c;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            int iB = b(cCharAt);
            byte b = this.f59a[iB];
            if (cCharAt != ' ') {
                byte b2 = this.f61c[iB];
                byte b3 = this.f60b[iB];
                int i5 = clipX + clipWidth;
                int i6 = clipY + clipHeight;
                int iMax = Math.max(clipX, i);
                int iMax2 = Math.max(clipY, i2 - b2);
                graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i5, i + b)) - iMax, Math.max(iMax2, Math.min(i6, (i2 - b2) + b3)) - iMax2);
                graphics.drawImage(this.a, i - this.f57a[iB], (i2 - this.f58b[iB]) - b2, 20);
            }
            i += b + this.f56a;
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    public final void a(Graphics graphics, char c, int i, int i2, int i3) {
        if (this.a == null) {
            graphics.setFont(this.f55a);
            if (this.f62a) {
                if ((i3 & 16) != 0) {
                    i2++;
                } else if ((i3 & 32) != 0) {
                    i2--;
                }
                graphics.setColor(this.e);
                graphics.drawChar(c, i, i2 - 1, i3);
                graphics.drawChar(c, i - 1, i2, i3);
                graphics.drawChar(c, i + 1, i2, i3);
                graphics.drawChar(c, i, i2 + 1, i3);
            }
            graphics.setColor(this.d);
            graphics.drawChar(c, i, i2, i3);
            return;
        }
        if ((i3 & 1) != 0) {
            i -= a(c) >> 1;
        } else if ((i3 & 8) != 0) {
            i -= a(c);
        }
        if ((i3 & 16) != 0) {
            i2 += this.b;
        } else if ((i3 & 32) != 0) {
            i2 -= this.c;
        }
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int iB = b(c);
        byte b = this.f59a[iB];
        if (c != ' ') {
            byte b2 = this.f61c[iB];
            byte b3 = this.f60b[iB];
            int i4 = clipX + clipWidth;
            int i5 = clipY + clipHeight;
            int iMax = Math.max(clipX, i);
            int iMax2 = Math.max(clipY, i2 - b2);
            graphics.setClip(iMax, iMax2, Math.max(iMax, Math.min(i4, i + b)) - iMax, Math.max(iMax2, Math.min(i5, (i2 - b2) + b3)) - iMax2);
            graphics.drawImage(this.a, i - this.f57a[iB], (i2 - this.f58b[iB]) - b2, 20);
        }
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
    }

    private void a(int i) {
        this.f63a = new int[i];
    }

    private void a(char c, short s) {
        int iD = d(c);
        for (int i = 0; i < this.f63a.length; i++) {
            if (this.f63a[iD & (this.f63a.length - 1)] == 0) {
                this.f63a[iD & (this.f63a.length - 1)] = (c << 16) | (s & 65535);
                return;
            }
            iD++;
        }
    }

    private int c(char c) {
        int i;
        int iD = d(c);
        for (int i2 = 0; i2 < this.f63a.length && (i = this.f63a[iD & (this.f63a.length - 1)]) != 0; i2++) {
            if ((i >>> 16) == c) {
                return i & 65535;
            }
            iD++;
        }
        return -1;
    }

    private static int d(char c) {
        return (c + 4660) * (c + 17185);
    }
}
