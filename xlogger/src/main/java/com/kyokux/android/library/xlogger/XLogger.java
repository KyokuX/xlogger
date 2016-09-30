package com.kyokux.android.library.xlogger;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created on 2016/09/30 10:16.
 *
 * @author Han Xu
 */
public final class XLogger {

    private static final String DEFAULT_TAG = "KyokuX";

    private static boolean sEnable = true;
    private static String sTag = DEFAULT_TAG;

    /**
     * Set current log tag.
     *
     * @param tag tag to set.
     * @return true if set success, false otherwise.
     */
    public static boolean setTag(String tag) {
        if (TextUtils.isEmpty(tag)) {
            return false;
        }
        sTag = tag;
        return true;
    }

    /**
     * Open / Close all logs.
     *
     * @param enable true for open, false for close.
     */
    public static void setEnable(boolean enable) {
        sEnable = enable;
    }

    /**
     * Get current log tag.
     *
     * @return current log tag.
     */
    public static String getCurrentTag() {
        return sTag;
    }

    /**
     * Return current log state.
     *
     * @return true for open, false for close.
     */
    public static boolean isEnable() {
        return sEnable;
    }

    /**
     * Log with the common tag, default is "KyokuX", in verbose level.
     *
     * @param message log message.
     */
    public static void v(String message) {
        if (!sEnable) {
            return;
        }
        Log.v(sTag, message);
    }

    /**
     * Log with the common tag, default is "KyokuX", in debug level.
     *
     * @param message log message.
     */
    public static void d(String message) {
        if (!sEnable) {
            return;
        }
        Log.d(sTag, message);
    }

    /**
     * Log with the common tag, default is "KyokuX", in info level.
     *
     * @param message log message.
     */
    public static void i(String message) {
        if (!sEnable) {
            return;
        }
        Log.i(sTag, message);
    }

    /**
     * Log with the common tag, default is "KyokuX", in warn level.
     *
     * @param message log message.
     */
    public static void w(String message) {
        if (!sEnable) {
            return;
        }
        Log.w(sTag, message);
    }

    /**
     * Log with the common tag, default is "KyokuX", in error level.
     *
     * @param message log message.
     */
    public static void e(String message) {
        if (!sEnable) {
            return;
        }
        Log.e(sTag, message);
    }

    /**
     * Log with the special tag, in verbose level.
     *
     * @param tag log tag.
     * @param message log message.
     */
    public static void v(String tag, String message) {
        if (!sEnable) {
            return;
        }
        Log.v(tag, message);
    }

    /**
     * Log with the special tag, in debug level.
     *
     * @param tag log tag.
     * @param message log message.
     */
    public static void d(String tag, String message) {
        if (!sEnable) {
            return;
        }
        Log.d(tag, message);
    }

    /**
     * Log with the special tag, in info level.
     *
     * @param tag log tag.
     * @param message log message.
     */
    public static void i(String tag, String message) {
        if (!sEnable) {
            return;
        }
        Log.i(tag, message);
    }

    /**
     * Log with the special tag, in warn level.
     *
     * @param tag log tag.
     * @param message log message.
     */
    public static void w(String tag, String message) {
        if (!sEnable) {
            return;
        }
        Log.w(tag, message);
    }

    /**
     * Log with the special tag, in error level.
     *
     * @param tag log tag.
     * @param message log message.
     */
    public static void e(String tag, String message) {
        if (!sEnable) {
            return;
        }
        Log.e(tag, message);
    }

    private XLogger() {
        // Noninstantiable utility class.
    }
}