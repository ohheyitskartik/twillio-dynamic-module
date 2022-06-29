/**
 * Component for Twilio Video participant views.
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

public class TwilioRemotePreviewManager extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "RNTwilioRemotePreview";
    public String myTrackSid = "";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

   /* @ReactProp(name = "scaleType")
    public void setScaleType(TwilioRemotePreview view, @Nullable String scaleType) {

      if (scaleType.equals("fit")) {
        view.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
      } else {
        view.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
      }
    }   tobefixed

    @ReactProp(name = "trackSid")
    public void setTrackId(TwilioRemotePreview view, @Nullable String trackSid) {

        Log.i("CustomTwilioVideoView", "Initialize Twilio REMOTE");
        Log.i("CustomTwilioVideoView", trackSid);
        myTrackSid = trackSid;
        CustomTwilioVideoView.registerPrimaryVideoView(view.getSurfaceViewRenderer(), trackSid);
    }*/

    private View configureView(ThemedReactContext reactContext, String myTrackSid){
        View mainView = null;
        try {
            Class mainViewCall = Class.forName("com.example.dynamic_module_twillio.TwilioRemotePreview");
            Constructor<?> constructor = mainViewCall.getConstructor(ThemedReactContext.class);
            mainView = (View) constructor.newInstance( new Object[] { reactContext,  myTrackSid });
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
        return this.configureView(reactContext, myTrackSid);
    }

    {/*
    @Override
    public Map getExportedCustomBubblingEventTypeConstants() {
      return MapBuilder.builder()
          .put(
            ON_FRAME_DIMENSIONS_CHANGED,
              MapBuilder.of(
                  "phasedRegistrationNames",
                  MapBuilder.of("bubbled", ON_FRAME_DIMENSIONS_CHANGED)))
                  .build();
  }*/}
}
