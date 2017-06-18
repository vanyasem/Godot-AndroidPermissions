# Godot-AndroidPermissions
This is an Android module for [Godot Engine](https://github.com/okamstudio/godot).

This module can request runtime Android permissions introduced in Android 6.0 (API level 23).

## Installation
- Copy `permissions` folder inside the `modules` directory of the Godot source.

- In order to use callbacks, you will need to slightly modify the Godot source. Open `platform/android/java/src/org/godotengine/godot/Godot.java` and look for 
```java
@Override protected void onActivityResult (int requestCode, int resultCode, Intent data) {
    ...
};
```

Add that after `onActivityResult`:
```java
@Override public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    for(int i=0;i<singleton_count;i++) {
        singletons[i].onMainRequestPermissionsResult(requestCode,permissions,grantResults);
    }
};
```
---
Then look for
```java
protected void onMainActivityResult(int requestCode, int resultCode, Intent data) {

}
```

And add that after `onMainActivityResult`:
```java
protected void onMainRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {

}
```

- You must [recompile](https://godot.readthedocs.io/en/stable/development/compiling/compiling_for_android.html) Godot for Android.

- Finally, you need to include the module in your `engine.cfg` (if you have more than one module separate them by comma):
```
[android]
modules="org/godotengine/godot/AndroidPermissions"
```

## How to use

First of all, make sure you understand how to work with Android permissions. Things to look for:
- You don't need to request access for a permission if it's not in [the list](https://developer.android.com/guide/topics/permissions/requesting.html#normal-dangerous).
- Permissions stack in [groups](https://developer.android.com/guide/topics/permissions/requesting.html#perm-groups). If you have access to a permission in a particular group, others will be granted automatically (you still must enable them in your `export.cfg`).
- User can revoke access to any permission at any time. Make sure your app is ready for that.

Now to the fun part. Here's an example on how to use the module:
```python
var permissions = null
func _ready():
    if Globals.has_singleton("AndroidPermissions"):
        permissions = Globals.get_singleton("AndroidPermissions")
        permissions.init(get_instance_ID(), false)

        # No need to check here whether a permission was granted or not
        # All necessary checks are performed by the method itself
        permissions.requestWriteExternalStoragePermission()
    pass

# Called when a request dialog is finished
func _on_request_premission_result(request_code, permissions, granted):
    if request_code == 23 and granted:
        write_to_storage()
    pass

func write_to_storage():
    if permissions != null:
        if permissions.isWriteExternalStoragePermissionGranted():
            # Write something nifty to external storage
            pass
        else:
            # Permission is not granted, boo
            pass
    pass
```

## API Reference
The following methods are available:

```python
# Init AndroidPermissions
# @param int instanceId The instance id from Godot (get_instance_ID())
# @param boolean debug Indicates whether a debug mode should be enabled
init(instanceId, debug)

# Permission request finished callback
# @param int request_code Request code
# @param String permissions Name of the permission requested
# @param boolean granted Was the permission granted
_on_request_premission_result(request_code, permissions, granted)

# Request Permission methods
requestReadCalendarPermission()
requestWriteCalendarPermission()
requestCameraPermission()
requestReadContactsPermission()
requestWriteContactsPermission()
requestGetAccountsPermission()
requestAccessFineLocationPermission()
requestAccessCoarseLocationPermission()
requestRecordAudioPermission()
requestReadPhoneStatePermission()
requestCallPhonePermission()
requestReadCallLogPermission()
requestWriteCallLogPermission()
requestAddVoicemailPermission()
requestUseSipPermission()
requestProcessOutgoingCallsPermission()
requestBodySensorsPermission()
requestSendSmsPermission()
requestReceiveSmsPermission()
requestReadSmsPermission()
requestReceiveWapPushPermission()
requestReceiveMmsPermission()
requestReadExternalStoragePermission()
requestWriteExternalStoragePermission()

# Is Permission granted methods
isReadCalendarPermissionGranted() Boolean
isWriteCalendarPermissionGranted() Boolean
isCameraPermissionGranted() Boolean
isReadContactsPermissionGranted() Boolean
isWriteContactsPermissionGranted() Boolean
isGetAccountsPermissionGranted() Boolean
isAccessFineLocationPermissionGranted() Boolean
isAccessCoarseLocationPermissionGranted() Boolean
isRecordAudioPermissionGranted() Boolean
isReadPhoneStatePermissionGranted() Boolean
isCallPhonePermissionGranted() Boolean
isReadCallLogPermissionGranted() Boolean
isWriteCallLogPermissionGranted() Boolean
isAddVoicemailPermissionGranted() Boolean
isUseSipPermissionGranted() Boolean
isProcessOutgoingCallsPermissionGranted() Boolean
isBodySensorsPermissionGranted() Boolean
isSendSmsPermissionGranted() Boolean
isReceiveSmsPermissionGranted() Boolean
isReadSmsPermissionGranted() Boolean
isReceiveWapPushPermissionGranted() Boolean
isReceiveMmsPermissionGranted() Boolean
isReadExternalStoragePermissionGranted() Boolean
isWriteExternalStoragePermissionGranted() Boolean

# Request codes
    # CALENDAR GROUP
PERMISSION_REQUEST_READ_CALENDAR = 0;
PERMISSION_REQUEST_WRITE_CALENDAR = 1;
    # CAMERA GROUP
PERMISSION_REQUEST_CAMERA = 2;
    # CONTACTS GROUP
PERMISSION_REQUEST_READ_CONTACTS = 3;
PERMISSION_REQUEST_WRITE_CONTACTS = 4;
PERMISSION_REQUEST_GET_ACCOUNTS = 5;
    # LOCATION GROUP
PERMISSION_REQUEST_ACCESS_FINE_LOCATION = 6;
PERMISSION_REQUEST_ACCESS_COARSE_LOCATION = 7;
    # MICROPHONE GROUP
PERMISSION_REQUEST_RECORD_AUDIO = 8;
    # PHONE GROUP
PERMISSION_REQUEST_READ_PHONE_STATE = 9;
PERMISSION_REQUEST_CALL_PHONE = 10;
PERMISSION_REQUEST_READ_CALL_LOG = 11;
PERMISSION_REQUEST_WRITE_CALL_LOG = 12;
PERMISSION_REQUEST_ADD_VOICEMAIL = 13;
PERMISSION_REQUEST_USE_SIP = 14;
PERMISSION_REQUEST_PROCESS_OUTGOING_CALLS = 15;
    # SENSORS GROUP
PERMISSION_REQUEST_BODY_SENSORS = 16;
    # SMS GROUP
PERMISSION_REQUEST_SEND_SMS = 17;
PERMISSION_REQUEST_RECEIVE_SMS = 18;
PERMISSION_REQUEST_READ_SMS = 19;
PERMISSION_REQUEST_RECEIVE_WAP_PUSH = 20;
PERMISSION_REQUEST_RECEIVE_MMS = 21;
    # STORAGE GROUP
PERMISSION_REQUEST_READ_EXTERNAL_STORAGE = 22;
PERMISSION_REQUEST_WRITE_EXTERNAL_STORAGE = 23;
```
