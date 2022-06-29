package com.example.dynamic_module_twillio;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.example.dynamic_module_twillio.RNVideoViewGroup;

import tvi.webrtc.RendererCommon;

public class TwilioVideoPreview extends RNVideoViewGroup {

    private static final String TAG = "TwilioVideoPreview";

    public void setScaleTypeFIT(){
        this.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
    }
    public void setScaleTypeFILL(){
        this.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
    }

    public TwilioVideoPreview(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        CustomTwilioVideoView.registerThumbnailVideoView(this.getSurfaceViewRenderer());
        this.getSurfaceViewRenderer().applyZOrder(true);
    }

}



