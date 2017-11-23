
package com.reactlibrary;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.lang.Runnable;


public class RNResetFocusModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNResetFocusModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void resetFocus() {
      final Activity currentActivity = reactContext.getCurrentActivity();

      currentActivity.runOnUiThread(new Runnable() {
          public void run() {
              View focusedView = currentActivity.getCurrentFocus();

              if (focusedView != null) {
                  focusedView.clearFocus();
              }

              currentActivity.getWindow().getDecorView().findViewById(android.R.id.content).requestFocusFromTouch();
          }
      });

  }

  @Override
  public String getName() {
    return "RNResetFocus";
  }
}