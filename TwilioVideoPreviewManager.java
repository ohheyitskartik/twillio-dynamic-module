/**
 * Component for Twilio Video local views.
 * <p>
 * Authors:
 * Jonathan Chang <slycoder@gmail.com>
 */

package com.hrxmobileapp;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

//import tvi.webrtc.RendererCommon; tobefixed

//import static com.twiliorn.library.RNVideoViewGroup.Events.ON_FRAME_DIMENSIONS_CHANGED;

public class TwilioVideoPreviewManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "RNTwilioVideoPreview";

    @Override
    public String getName() {
        return REACT_CLASS;
    }
    /*
        @ReactProp(name = "scaleType")
        public void setScaleType(TwilioVideoPreview view, @Nullable String scaleType) {
          if (scaleType.equals("fit")) {
              //view.setScalingTypeFIT();   tobefixed

          } else {
            view.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
           //view.setScalingTypeFILL();
          }
        }
    */
    {/*
    @Override
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> map = MapBuilder.of(
                ON_FRAME_DIMENSIONS_CHANGED, MapBuilder.of("registrationName", ON_FRAME_DIMENSIONS_CHANGED)
        );

        return map;
    }*/}

    private View configureView(ThemedReactContext reactContext){
        View mainView = null;
        try {
            Class mainViewCall = Class.forName("com.example.dynamic_module_twillio.TwilioVideoPreview");
            Constructor<?> constructor = mainViewCall.getConstructor(ThemedReactContext.class);
            mainView = (View) constructor.newInstance(reactContext);
        }catch (IllegalAccessException e) {
            Log.e("DynamicModule Ref Call", e.toString());
        }catch (InstantiationException e){
            Log.e("DynamicModule Ref Call", e.toString());
        }catch (NoSuchMethodException e){
            Log.e("DynamicModule Ref Call", e.toString());
        }catch (InvocationTargetException e){
            Log.e("DynamicModule Ref Call", e.toString());
        }catch (ClassNotFoundException e){
            Log.e("DynamicModule Ref Call", e.toString());
        }
        return mainView;
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        return this.configureView(reactContext);
    }
}
