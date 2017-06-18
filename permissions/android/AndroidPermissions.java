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
                "init",

                "requestReadCalendarPermission", "requestWriteCalendarPermission", "requestCameraPermission",
                "requestReadContactsPermission", "requestWriteContactsPermission", "requestGetAccountsPermission",
                "requestAccessFineLocationPermission", "requestAccessCoarseLocationPermission", "requestRecordAudioPermission",
                "requestReadPhoneStatePermission", "requestCallPhonePermission", "requestReadCallLogPermission",
                "requestWriteCallLogPermission", "requestAddVoicemailPermission", "requestUseSipPermission",
                "requestProcessOutgoingCallsPermission", "requestBodySensorsPermission", "requestSendSmsPermission",
                "requestReceiveSmsPermission", "requestReadSmsPermission", "requestReceiveWapPushPermission",
                "requestReceiveMmsPermission", "requestReadExternalStoragePermission", "requestWriteExternalStoragePermission",

                "isReadCalendarPermissionGranted", "isWriteCalendarPermissionGranted", "isCameraPermissionGranted",
                "isReadContactsPermissionGranted", "isWriteContactsPermissionGranted", "isGetAccountsPermissionGranted",
                "isAccessFineLocationPermissionGranted", "isAccessCoarseLocationPermissionGranted", "isRecordAudioPermissionGranted",
                "isReadPhoneStatePermissionGranted", "isCallPhonePermissionGranted", "isReadCallLogPermissionGranted",
                "isWriteCallLogPermissionGranted", "isAddVoicemailPermissionGranted", "isUseSipPermissionGranted",
                "isProcessOutgoingCallsPermissionGranted", "isBodySensorsPermissionGranted", "isSendSmsPermissionGranted",
                "isReceiveSmsPermissionGranted", "isReadSmsPermissionGranted", "isReceiveWapPushPermissionGranted",
                "isReceiveMmsPermissionGranted", "isReadExternalStoragePermissionGranted", "isWriteExternalStoragePermissionGranted"
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
        requestPermission(Manifest.permission.READ_CALENDAR, PERMISSION_REQUEST_READ_CALENDAR);
    }

    public void requestWriteCalendarPermission() {
        requestPermission(Manifest.permission.WRITE_CALENDAR, PERMISSION_REQUEST_WRITE_CALENDAR);
    }

    public void requestCameraPermission() {
        requestPermission(Manifest.permission.CAMERA, PERMISSION_REQUEST_CAMERA);
    }

    public void requestReadContactsPermission() {
        requestPermission(Manifest.permission.READ_CONTACTS, PERMISSION_REQUEST_READ_CONTACTS);
    }

    public void requestWriteContactsPermission() {
        requestPermission(Manifest.permission.WRITE_CONTACTS, PERMISSION_REQUEST_WRITE_CONTACTS);
    }

    public void requestGetAccountsPermission() {
        requestPermission(Manifest.permission.GET_ACCOUNTS, PERMISSION_REQUEST_GET_ACCOUNTS);
    }

    public void requestAccessFineLocationPermission() {
        requestPermission(Manifest.permission.ACCESS_FINE_LOCATION, PERMISSION_REQUEST_ACCESS_FINE_LOCATION);
    }

    public void requestAccessCoarseLocationPermission() {
        requestPermission(Manifest.permission.ACCESS_COARSE_LOCATION, PERMISSION_REQUEST_ACCESS_COARSE_LOCATION);
    }

    public void requestRecordAudioPermission() {
        requestPermission(Manifest.permission.RECORD_AUDIO, PERMISSION_REQUEST_RECORD_AUDIO);
    }

    public void requestReadPhoneStatePermission() {
        requestPermission(Manifest.permission.READ_PHONE_STATE, PERMISSION_REQUEST_READ_PHONE_STATE);
    }

    public void requestCallPhonePermission() {
        requestPermission(Manifest.permission.CALL_PHONE, PERMISSION_REQUEST_CALL_PHONE);
    }

    public void requestReadCallLogPermission() {
        requestPermission(Manifest.permission.READ_CALL_LOG, PERMISSION_REQUEST_READ_CALL_LOG);
    }

    public void requestWriteCallLogPermission() {
        requestPermission(Manifest.permission.WRITE_CALL_LOG, PERMISSION_REQUEST_WRITE_CALL_LOG);
    }

    public void requestAddVoicemailPermission() {
        requestPermission(Manifest.permission.ADD_VOICEMAIL, PERMISSION_REQUEST_ADD_VOICEMAIL);
    }

    public void requestUseSipPermission() {
        requestPermission(Manifest.permission.USE_SIP, PERMISSION_REQUEST_USE_SIP);
    }

    public void requestProcessOutgoingCallsPermission() {
        requestPermission(Manifest.permission.PROCESS_OUTGOING_CALLS, PERMISSION_REQUEST_PROCESS_OUTGOING_CALLS);
    }

    public void requestBodySensorsPermission() {
        requestPermission(Manifest.permission.BODY_SENSORS, PERMISSION_REQUEST_BODY_SENSORS);
    }

    public void requestSendSmsPermission() {
        requestPermission(Manifest.permission.SEND_SMS, PERMISSION_REQUEST_SEND_SMS);
    }

    public void requestReceiveSmsPermission() {
        requestPermission(Manifest.permission.RECEIVE_SMS, PERMISSION_REQUEST_RECEIVE_SMS);
    }

    public void requestReadSmsPermission() {
        requestPermission(Manifest.permission.READ_SMS, PERMISSION_REQUEST_READ_SMS);
    }

    public void requestReceiveWapPushPermission() {
        requestPermission(Manifest.permission.RECEIVE_WAP_PUSH, PERMISSION_REQUEST_RECEIVE_WAP_PUSH);
    }

    public void requestReceiveMmsPermission() {
        requestPermission(Manifest.permission.RECEIVE_MMS, PERMISSION_REQUEST_RECEIVE_MMS);
    }

    public void requestReadExternalStoragePermission() {
        requestPermission(Manifest.permission.READ_EXTERNAL_STORAGE, PERMISSION_REQUEST_READ_EXTERNAL_STORAGE);
    }

    public void requestWriteExternalStoragePermission() {
        requestPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE);
    }


    public boolean isWriteCalendarPermissionGranted() {
        return checkPermission(Manifest.permission.WRITE_CALENDAR);
    }

    public boolean isCameraPermissionGranted() {
        return checkPermission(Manifest.permission.CAMERA);
    }

    public boolean isReadContactsPermissionGranted() {
        return checkPermission(Manifest.permission.READ_CONTACTS);
    }

    public boolean isWriteContactsPermissionGranted() {
        return checkPermission(Manifest.permission.WRITE_CONTACTS);
    }

    public boolean isGetAccountsPermissionGranted() {
        return checkPermission(Manifest.permission.GET_ACCOUNTS);
    }

    public boolean isAccessFineLocationPermissionGranted() {
        return checkPermission(Manifest.permission.ACCESS_FINE_LOCATION);
    }

    public boolean isAccessCoarseLocationPermissionGranted() {
        return checkPermission(Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    public boolean isRecordAudioPermissionGranted() {
        return checkPermission(Manifest.permission.RECORD_AUDIO);
    }

    public boolean isReadPhoneStatePermissionGranted() {
        return checkPermission(Manifest.permission.READ_PHONE_STATE);
    }

    public boolean isCallPhonePermissionGranted() {
        return checkPermission(Manifest.permission.CALL_PHONE);
    }

    public boolean isReadCallLogPermissionGranted() {
        return checkPermission(Manifest.permission.READ_CALL_LOG);
    }

    public boolean isWriteCallLogPermissionGranted() {
        return checkPermission(Manifest.permission.WRITE_CALL_LOG);
    }

    public boolean isAddVoicemailPermissionGranted() {
        return checkPermission(Manifest.permission.ADD_VOICEMAIL);
    }

    public boolean isUseSipPermissionGranted() {
        return checkPermission(Manifest.permission.USE_SIP);
    }

    public boolean isProcessOutgoingCallsPermissionGranted() {
        return checkPermission(Manifest.permission.PROCESS_OUTGOING_CALLS);
    }

    public boolean isBodySensorsPermissionGranted() {
        return checkPermission(Manifest.permission.BODY_SENSORS);
    }

    public boolean isSendSmsPermissionGranted() {
        return checkPermission(Manifest.permission.SEND_SMS);
    }

    public boolean isReceiveSmsPermissionGranted() {
        return checkPermission(Manifest.permission.RECEIVE_SMS);
    }

    public boolean isReadSmsPermissionGranted() {
        return checkPermission(Manifest.permission.READ_SMS);
    }

    public boolean isReceiveWapPushPermissionGranted() {
        return checkPermission(Manifest.permission.RECEIVE_WAP_PUSH);
    }

    public boolean isReceiveMmsPermissionGranted() {
        return checkPermission(Manifest.permission.RECEIVE_MMS);
    }

    public boolean isReadExternalStoragePermissionGranted() {
        return checkPermission(Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    public boolean isWriteExternalStoragePermissionGranted() {
        return checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }


    private void requestPermission(String permission, int requestCode) {
        if (!checkPermission(permission)) {
            ActivityCompat.requestPermissions(mActivity, new String[]{permission}, requestCode);
        }
    }

    private boolean checkPermission(String permission) {
        int permissionCheck = ContextCompat.checkSelfPermission(mActivity, permission);
        return permissionCheck == PackageManager.PERMISSION_GRANTED;
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
