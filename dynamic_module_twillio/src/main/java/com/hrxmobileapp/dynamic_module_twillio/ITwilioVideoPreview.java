package com.example.dynamic_module_twillio;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEventSource;

public interface ITwilioVideoPreview extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource, ViewParent, ViewManager {
}
