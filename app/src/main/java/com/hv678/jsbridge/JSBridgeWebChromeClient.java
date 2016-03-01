package com.hv678.jsbridge;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by wuxm on 2016/3/1.
 * E-mail 380510218@qq.com
 */
public class JSBridgeWebChromeClient extends WebChromeClient {

    @Override
    public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        result.confirm(JSBridge.callJava(view,message));
        return super.onJsPrompt(view, url, message, defaultValue, result);
    }
}
