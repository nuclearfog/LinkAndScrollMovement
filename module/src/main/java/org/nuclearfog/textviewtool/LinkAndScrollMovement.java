package org.nuclearfog.textviewtool;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_UP;

public class LinkAndScrollMovement extends ScrollingMovementMethod {

    private static final LinkAndScrollMovement instance = new LinkAndScrollMovement();
    private boolean clickLock;

    private LinkAndScrollMovement() {
        super();
    }


    @Override
    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        switch(event.getAction()) {
            case ACTION_DOWN:
                clickLock = false;
                break;

            case ACTION_MOVE:
                clickLock = true;
                break;

            case ACTION_UP:
                if (!clickLock) {
                    int x = (int) event.getX();
                    int y = (int) event.getY();
                    x -= widget.getTotalPaddingLeft();
                    y -= widget.getTotalPaddingTop();
                    x += widget.getScrollX();
                    y += widget.getScrollY();
                    Layout layout = widget.getLayout();
                    int line = layout.getLineForVertical(y);
                    int off = layout.getOffsetForHorizontal(line, x);
                    ClickableSpan[] link = buffer.getSpans(off, off, ClickableSpan.class);
                    if (link.length != 0) {
                        link[0].onClick(widget);
                        return true;
                    }
                }
                break;
        }
        return super.onTouchEvent(widget, buffer, event);
    }

    public static LinkAndScrollMovement getInstance() {
        return instance;
    }
}
