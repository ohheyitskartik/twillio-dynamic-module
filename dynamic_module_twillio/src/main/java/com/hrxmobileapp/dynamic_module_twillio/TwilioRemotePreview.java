package com.example.dynamic_module_twillio;

import android.util.Log;

import com.facebook.react.uimanager.ThemedReactContext;
import com.example.dynamic_module_twillio.RNVideoViewGroup;


public class TwilioRemotePreview extends RNVideoViewGroup {

    private static final String TAG = "TwilioRemotePreview";


    public TwilioRemotePreview(ThemedReactContext context, String trackSid) {
        super(context);
        Log.i("CustomTwilioVideoView", "Remote Prview Construct");
        Log.i("CustomTwilioVideoView", trackSid);


        CustomTwilioVideoView.registerPrimaryVideoView(this.getSurfaceViewRenderer(), trackSid);
    }
}
