package rich.yang.com.xrichtext.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by yang on 2017/7/25.
 */

public class MyApplication extends Application {
    private Context mContext;
    public static MyApplication myApplication;

    public static MyApplication getInstance() {
        if (myApplication == null) {
            myApplication = new MyApplication();
        }
        return myApplication;
    }

    private MyApplication() {
        mContext = getApplicationContext();
    }

    public Context getContext() {
        return mContext;
    }
}
