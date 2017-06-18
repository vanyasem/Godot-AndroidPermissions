package org.godotengine.godot;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.widget.Toast;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.io.File;

public class AndroidPermissions extends Godot.SingletonBase {

    static public Godot.SingletonBase initialize(Activity pActivity) {
        return new AndroidPermissions(pActivity);
    }

    public AndroidPermissions(Activity pActivity) {
        //register class name and functions to bind
        registerClass("AndroidPermissions", new String[] {
                "init", "requestReadCalendarPermission", "requestWriteCalendarPermission", "requestCameraPermission",
                "requestReadContactsPermission", "requestWriteContactsPermission", "requestGetAccountsPermission",
                "requestAccessFineLocationPermission", "requestAccessCoarseLocationPermission", "requestRecordAudioPermission",
                "requestReadPhoneStatePermission", "requestCallPhonePermission", "requestReadCallLogPermission",
                "requestWriteCallLogPermission", "requestAddVoicemailPermission", "requestUseSipPermission",
                "requestProcessOutgoingCallsPermission", "requestBodySensorsPermission", "requestSendSmsPermission",
                "requestReceiveSmsPermission", "requestReadSmsPermission", "requestReceiveWapPushPermission",
                "requestReceiveMmsPermission", "requestReadExternalStoragePermission", "requestWriteExternalStoragePermission"
        });
        mActivity = pActivity;
    }

    private Activity mActivity;
    private int mInstanceId;
    private boolean mDebug;
    
    public void init(final int instanceId, final boolean debug) {
        mInstanceId = instanceId;
        mDebug = debug;
    }

    /* CALENDAR GROUP */
    private static final int PERMISSION_REQUEST_READ_CALENDAR = 0;
    private static final int PERMISSION_REQUEST_WRITE_CALENDAR = 1;
    /* CAMERA GROUP */
    private static final int PERMISSION_REQUEST_CAMERA = 2;
    /* CONTACTS GROUP */
    private static final int PERMISSION_REQUEST_READ_CONTACTS = 3;
    private static final int PERMISSION_REQUEST_WRITE_CONTACTS = 4;
    private static final int PERMISSION_REQUEST_GET_ACCOUNTS = 5;
    /* LOCATION GROUP */
    private static final int PERMISSION_REQUEST_ACCESS_FINE_LOCATION = 6;
    private static final int PERMISSION_REQUEST_ACCESS_COARSE_LOCATION = 7;
    /* MICROPHONE GROUP */
    private static final int PERMISSION_REQUEST_RECORD_AUDIO = 8;
    /* PHONE GROUP */
    private static final int PERMISSION_REQUEST_READ_PHONE_STATE = 9;
    private static final int PERMISSION_REQUEST_CALL_PHONE = 10;
    private static final int PERMISSION_REQUEST_READ_CALL_LOG = 11;
    private static final int PERMISSION_REQUEST_WRITE_CALL_LOG = 12;
    private static final int PERMISSION_REQUEST_ADD_VOICEMAIL = 13;
    private static final int PERMISSION_REQUEST_USE_SIP = 14;
    private static final int PERMISSION_REQUEST_PROCESS_OUTGOING_CALLS = 15;
    /* SENSORS GROUP */
    private static final int PERMISSION_REQUEST_BODY_SENSORS = 16;
    /* SMS GROUP */
    private static final int PERMISSION_REQUEST_SEND_SMS = 17;
    private static final int PERMISSION_REQUEST_RECEIVE_SMS = 18;
    private static final int PERMISSION_REQUEST_READ_SMS = 19;
    private static final int PERMISSION_REQUEST_RECEIVE_WAP_PUSH = 20;
    private static final int PERMISSION_REQUEST_RECEIVE_MMS = 21;
    /* STORAGE GROUP */
    private static final int PERMISSION_REQUEST_READ_EXTERNAL_STORAGE = 22;
    private static final int PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE = 23;

    public void requestReadCalendarPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CALENDAR);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CALENDAR},
                    PERMISSION_REQUEST_READ_CALENDAR);
        }
    }

    public void requestWriteCalendarPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CALENDAR);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CALENDAR},
                    PERMISSION_REQUEST_WRITE_CALENDAR);
        }
    }

    public void requestCameraPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.CAMERA);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.CAMERA},
                    PERMISSION_REQUEST_CAMERA);
        }
    }

    public void requestReadContactsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CONTACTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CONTACTS},
                    PERMISSION_REQUEST_READ_CONTACTS);
        }
    }

    public void requestWriteContactsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CONTACTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CONTACTS},
                    PERMISSION_REQUEST_WRITE_CONTACTS);
        }
    }

    public void requestGetAccountsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.GET_ACCOUNTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.GET_ACCOUNTS},
                    PERMISSION_REQUEST_GET_ACCOUNTS);
        }
    }

    public void requestAccessFineLocationPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSION_REQUEST_ACCESS_FINE_LOCATION);
        }
    }

    public void requestAccessCoarseLocationPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    PERMISSION_REQUEST_ACCESS_COARSE_LOCATION);
        }
    }

    public void requestRecordAudioPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECORD_AUDIO);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECORD_AUDIO},
                    PERMISSION_REQUEST_RECORD_AUDIO);
        }
    }

    public void requestReadPhoneStatePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_PHONE_STATE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_PHONE_STATE},
                    PERMISSION_REQUEST_READ_PHONE_STATE);
        }
    }

    public void requestCallPhonePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.CALL_PHONE},
                    PERMISSION_REQUEST_CALL_PHONE);
        }
    }

    public void requestReadCallLogPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CALL_LOG);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CALL_LOG},
                    PERMISSION_REQUEST_READ_CALL_LOG);
        }
    }

    public void requestWriteCallLogPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CALL_LOG);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CALL_LOG},
                    PERMISSION_REQUEST_WRITE_CALL_LOG);
        }
    }

    public void requestAddVoicemailPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ADD_VOICEMAIL);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ADD_VOICEMAIL},
                    PERMISSION_REQUEST_ADD_VOICEMAIL);
        }
    }

    public void requestUseSipPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.USE_SIP);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.USE_SIP},
                    PERMISSION_REQUEST_USE_SIP);
        }
    }

    public void requestProcessOutgoingCallsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.PROCESS_OUTGOING_CALLS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS},
                    PERMISSION_REQUEST_PROCESS_OUTGOING_CALLS);
        }
    }

    public void requestBodySensorsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.BODY_SENSORS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.BODY_SENSORS},
                    PERMISSION_REQUEST_BODY_SENSORS);
        }
    }

    public void requestSendSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.SEND_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.SEND_SMS},
                    PERMISSION_REQUEST_SEND_SMS);
        }
    }

    public void requestReceiveSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_SMS},
                    PERMISSION_REQUEST_RECEIVE_SMS);
        }
    }

    public void requestReadSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_SMS},
                    PERMISSION_REQUEST_READ_SMS);
        }
    }

    public void requestReceiveWapPushPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_WAP_PUSH);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_WAP_PUSH},
                    PERMISSION_REQUEST_RECEIVE_WAP_PUSH);
        }
    }

    public void requestReceiveMmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_MMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_MMS},
                    PERMISSION_REQUEST_RECEIVE_MMS);
        }
    }

    public void requestReadExternalStoragePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    PERMISSION_REQUEST_READ_EXTERNAL_STORAGE);
        }
    }

    public void requestWriteExternalStoragePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE);
        }
    }

    private void showDebugToast(final String message) {
        if(mDebug) {
            mActivity.runOnUiThread(new Runnable() {
                public void run() {
                    Toast.makeText(mActivity, message, Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    protected void onMainRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        showDebugToast("onRequestPermissionsResult");
        boolean granted = grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED;
        GodotLib.calldeferred(mInstanceId, "_on_request_premission_result", new Object[]{requestCode, permissions, granted});
        return;
    }
}
