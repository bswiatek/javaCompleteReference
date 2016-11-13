package awt.TextLayout;

import java.applet.Applet;
import java.awt.*;
import java.util.StringTokenizer;

public class TextLayout extends Applet {
    final int LEFT = 0;
    final int RIGHT = 1;
    final int CENTER = 2;
    final int LEFTRIGHT = 3;
    int align;
    Font f;
    Dimension d;
    FontMetrics fm;
    int fontSize;
    int fh, bl;
    int space;
    String text;

    public void init() {
        setBackground(Color.white);
        text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, <p> totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.";
        fontSize = 14;
        align = LEFT;
        addMouseListener(new MyMouseAdapter(this));
    }

    public void paint(Graphics g) {
        update(g);
    }

    public void update(Graphics g){
        d = getSize();
        g.setColor(getBackground());
        g.fillRect(0,0,d.width,d.height);
        f = new Font("Serif", Font.PLAIN, fontSize);
        g.setFont(f);
        if(fm == null) {
            fm = g.getFontMetrics();
            bl = fm.getAscent();
            fh = bl + fm.getDescent();
            space = fm.stringWidth(" ");
        }
        g.setColor(Color.black);
        StringTokenizer st = new StringTokenizer(text);

        int x =0;
        int nextx;
        int y = 0;
        String word, sp;
        int wordCount = 0;
        String line = " ";
        while(st.hasMoreTokens()) {
            word = st.nextToken();
            if(word.equals("<p>")) {
                drawString(g, line, wordCount, fm.stringWidth(line), y+bl);
                line = "";
                wordCount = 0;
                x = 0;
                y = y + (fh * 2);
            }
            else {
                int w = fm.stringWidth(word);
                if(( nextx = (x+space+w)) > d.width ) {
                    drawString(g, line, wordCount, fm.stringWidth(line), y+bl);
                    line = "";
                    wordCount = 0;
                    x = 0;
                    y = y + fh;
                }
                if (x != 0) {
                    sp = " ";
                }
                else {
                    sp = "";
                }
                line = line + sp + word;
                x = x + space + w;
                wordCount++;
            }
        }
        drawString(g, line, wordCount, fm.stringWidth(line), y+bl);
    }

    private void drawString(Graphics g, String line, int wc, int lineW, int y) {
        switch(align) {
            case LEFT:
                g.drawString(line, 0, y);
                break;
            case RIGHT:
                g.drawString(line, d.width-lineW, y);
                break;
            case CENTER:
                g.drawString(line, (d.width-lineW)/2,y);
                break;
            case LEFTRIGHT:
                int toFill = (int)((d.width - lineW)/wc);
                int nudge = d.width - lineW - (toFill*wc);
                int s = fm.stringWidth(" ");
                StringTokenizer st = new StringTokenizer(line);
                int x = 0;
                while(st.hasMoreTokens()) {
                    String word = st.nextToken();
                    g.drawString(word, x, y);
                    if(nudge>0) {
                        x = x + fm.stringWidth(word) + space + toFill + 1;
                        nudge--;
                    }
                    else
                    {
                        x = x + fm.stringWidth(word) + space + toFill;
                    }
                }
                break;
        }
    }


}
