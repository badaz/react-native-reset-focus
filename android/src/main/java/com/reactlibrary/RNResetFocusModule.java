
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNResetFocusModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNResetFocusModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void resetFocus() {
      Activity currentActivity = (Activity)(reactContext.getCurrentActivity().getWindow().getDecorView()).findViewById(android.R.id.content).getContext();
      View focusedView = currentActivity.getCurrentFocus();

      if (focusedView != null) {
          focusedView.clearFocus();
      }
      reactContext.getCurrentActivity().getWindow().getDecorView().findViewById(android.R.id.content).requestFocusFromTouch();
  }

  @Override
  public String getName() {
    return "RNResetFocus";
  }
}