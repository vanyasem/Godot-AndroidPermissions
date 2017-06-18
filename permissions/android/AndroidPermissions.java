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

    public void requestReadCalendarPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CALENDAR);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CALENDAR},
                    1);
        }
    }

    public void requestWriteCalendarPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CALENDAR);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CALENDAR},
                    1);
        }
    }

    public void requestCameraPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.CAMERA);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.CAMERA},
                    1);
        }
    }

    public void requestReadContactsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CONTACTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CONTACTS},
                    1);
        }
    }

    public void requestWriteContactsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CONTACTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CONTACTS},
                    1);
        }
    }

    public void requestGetAccountsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.GET_ACCOUNTS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.GET_ACCOUNTS},
                    1);
        }
    }

    public void requestAccessFineLocationPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    1);
        }
    }

    public void requestAccessCoarseLocationPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ACCESS_COARSE_LOCATION);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},
                    1);
        }
    }

    public void requestRecordAudioPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECORD_AUDIO);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECORD_AUDIO},
                    1);
        }
    }

    public void requestReadPhoneStatePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_PHONE_STATE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_PHONE_STATE},
                    1);
        }
    }

    public void requestCallPhonePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.CALL_PHONE},
                    1);
        }
    }

    public void requestReadCallLogPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_CALL_LOG);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_CALL_LOG},
                    1);
        }
    }

    public void requestWriteCallLogPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_CALL_LOG);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_CALL_LOG},
                    1);
        }
    }

    public void requestAddVoicemailPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.ADD_VOICEMAIL);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.ADD_VOICEMAIL},
                    1);
        }
    }

    public void requestUseSipPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.USE_SIP);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.USE_SIP},
                    1);
        }
    }

    public void requestProcessOutgoingCallsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.PROCESS_OUTGOING_CALLS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS},
                    1);
        }
    }

    public void requestBodySensorsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.BODY_SENSORS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.BODY_SENSORS},
                    1);
        }
    }

    public void requestSendSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.SEND_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.SEND_SMS},
                    1);
        }
    }

    public void requestReceiveSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_SMS},
                    1);
        }
    }

    public void requestReadSmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_SMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_SMS},
                    1);
        }
    }

    public void requestReceiveWapPushPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_WAP_PUSH);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_WAP_PUSH},
                    1);
        }
    }

    public void requestReceiveMmsPermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.RECEIVE_MMS);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.RECEIVE_MMS},
                    1);
        }
    }

    public void requestReadExternalStoragePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.READ_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    1);
        }
    }

    public void requestWriteExternalStoragePermission() {
        int permissionCheck =
                ContextCompat.checkSelfPermission(mActivity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    1);
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
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay!

                } else {

                    // permission denied, boo!
                }
                return;
            }

            // more cases
        }
    }
}
