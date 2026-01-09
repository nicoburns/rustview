package org.linebender.android.viewdemo;

import android.content.Context;

public final class DemoView extends RustView {
    @Override
    protected native long newViewPeer(Context context);

    public DemoView(Context context) {
        super(context);
    }
}
