/**
 * Component to orchestrate the Twilio Video connection and the various video
 * views.
 * <p>
 * Authors:
 * Ralph Pina <ralph.pina@gmail.com>
 * Jonathan Chang <slycoder@gmail.com>
 */
package com.hrxmobileapp;
import android.media.AudioManager;
import android.view.View;

import androidx.annotation.StringDef;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.ThemedReactContext;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CustomTwilioVideoMockView extends View implements LifecycleEventListener, AudioManager.OnAudioFocusChangeListener {
    private static final String TAG = "CustomTwilioVideoMockView";
    private static final String DATA_TRACK_MESSAGE_THREAD_NAME = "DataTrackMessages";
    private static final String FRONT_CAMERA_TYPE = "front";
    private static final String BACK_CAMERA_TYPE = "back";
    private boolean enableRemoteAudio = false;
    private boolean enableNetworkQualityReporting = false;
    private boolean isVideoEnabled = false;
    private boolean dominantSpeakerEnabled = false;
    private static String frontFacingDevice;
    private static String backFacingDevice;
    private boolean maintainVideoTrackInBackground = false;
    private String cameraType = "";

    @Override
    public void onAudioFocusChange(int i) {

    }

    @Override
    public void onHostResume() {

    }

    @Override
    public void onHostPause() {

    }

    @Override
    public void onHostDestroy() {

    }

    @StringDef({CustomTwilioVideoMockView.Events.ON_CAMERA_SWITCHED,
            CustomTwilioVideoMockView.Events.ON_VIDEO_CHANGED,
            CustomTwilioVideoMockView.Events.ON_AUDIO_CHANGED,
            CustomTwilioVideoMockView.Events.ON_CONNECTED,
            CustomTwilioVideoMockView.Events.ON_CONNECT_FAILURE,
            CustomTwilioVideoMockView.Events.ON_DISCONNECTED,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_CONNECTED,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_DISCONNECTED,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_ADDED_VIDEO_TRACK,
            CustomTwilioVideoMockView.Events.ON_DATATRACK_MESSAGE_RECEIVED,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_ADDED_DATA_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_REMOVED_DATA_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_REMOVED_VIDEO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_ADDED_AUDIO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_REMOVED_AUDIO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_ENABLED_VIDEO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_DISABLED_VIDEO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_ENABLED_AUDIO_TRACK,
            CustomTwilioVideoMockView.Events.ON_PARTICIPANT_DISABLED_AUDIO_TRACK,
            CustomTwilioVideoMockView.Events.ON_STATS_RECEIVED,
            CustomTwilioVideoMockView.Events.ON_NETWORK_QUALITY_LEVELS_CHANGED,
            CustomTwilioVideoMockView.Events.ON_DOMINANT_SPEAKER_CHANGED
    })
    public @interface Events {
        String ON_CAMERA_SWITCHED = "onCameraSwitched";
        String ON_VIDEO_CHANGED = "onVideoChanged";
        String ON_AUDIO_CHANGED = "onAudioChanged";
        String ON_CONNECTED = "onRoomDidConnect";
        String ON_CONNECT_FAILURE = "onRoomDidFailToConnect";
        String ON_DISCONNECTED = "onRoomDidDisconnect";
        String ON_PARTICIPANT_CONNECTED = "onRoomParticipantDidConnect";
        String ON_PARTICIPANT_DISCONNECTED = "onRoomParticipantDidDisconnect";
        String ON_DATATRACK_MESSAGE_RECEIVED = "onDataTrackMessageReceived";
        String ON_PARTICIPANT_ADDED_DATA_TRACK = "onParticipantAddedDataTrack";
        String ON_PARTICIPANT_REMOVED_DATA_TRACK = "onParticipantRemovedDataTrack";
        String ON_PARTICIPANT_ADDED_VIDEO_TRACK = "onParticipantAddedVideoTrack";
        String ON_PARTICIPANT_REMOVED_VIDEO_TRACK = "onParticipantRemovedVideoTrack";
        String ON_PARTICIPANT_ADDED_AUDIO_TRACK = "onParticipantAddedAudioTrack";
        String ON_PARTICIPANT_REMOVED_AUDIO_TRACK = "onParticipantRemovedAudioTrack";
        String ON_PARTICIPANT_ENABLED_VIDEO_TRACK = "onParticipantEnabledVideoTrack";
        String ON_PARTICIPANT_DISABLED_VIDEO_TRACK = "onParticipantDisabledVideoTrack";
        String ON_PARTICIPANT_ENABLED_AUDIO_TRACK = "onParticipantEnabledAudioTrack";
        String ON_PARTICIPANT_DISABLED_AUDIO_TRACK = "onParticipantDisabledAudioTrack";
        String ON_STATS_RECEIVED = "onStatsReceived";
        String ON_NETWORK_QUALITY_LEVELS_CHANGED = "onNetworkQualityLevelsChanged";
        String ON_DOMINANT_SPEAKER_CHANGED = "onDominantSpeakerDidChange";
    }
    // Map used to map remote data tracks to remote participants

    public CustomTwilioVideoMockView(ThemedReactContext context) {
        super(context);
    }



    // ===== LIFECYCLE EVENTS ======================================================================

    public void releaseResource() {
    }

    // ====== CONNECTING ===========================================================================

    public void connectToRoomWrapper(
            String roomName,
            String accessToken,
            boolean enableAudio,
            boolean enableVideo,
            boolean enableRemoteAudio,
            boolean enableNetworkQualityReporting,
            boolean dominantSpeakerEnabled,
            boolean maintainVideoTrackInBackground,
            String cameraType

    ) {
    }

    public void connectToRoom() {
    }

    // ====== DISCONNECTING ========================================================================

    public void disconnect() {

    }

    // ===== SEND STRING ON DATA TRACK ======================================================================
    public void sendString(String message) {

    }

    private static boolean isCurrentCameraSourceBackFacing() {
        return false;
    }

    // ===== BUTTON LISTENERS ======================================================================
    private static void setThumbnailMirror() {

    }

    public void switchCamera() {

    }

    public void toggleVideo(boolean enabled) {

    }

    public void toggleSoundSetup(boolean speaker){

    }

    public void toggleAudio(boolean enabled) {

    }

    public void toggleBluetoothHeadset(boolean enabled) {

    }

    public void toggleRemoteAudio(boolean enabled) {

    }

    public void publishLocalVideo(boolean enabled) {

    }

    public void publishLocalAudio(boolean enabled) {

    }

    public void getStats() {

    }

    public void disableOpenSLES() {
    }

    // ====== ROOM LISTENER ========================================================================

    /*
     * Room events listener
     */
    /*
     * Called when participant joins the room
     */

}