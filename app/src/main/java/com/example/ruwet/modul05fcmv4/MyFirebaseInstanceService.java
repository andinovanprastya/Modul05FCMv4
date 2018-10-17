package com.example.ruwet.modul05fcmv4;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

public class MyFirebaseInstanceService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        // Membuat class baru karena error jika mengikuti modul
        // Solusi cari di google
        // Token akan berubah ketika apk diinstall ulang
        String token = FirebaseInstanceId.getInstance().getToken();
//        Log.d(TAG, "NEW_TOKEN" + token);
        Log.d("NEW_TOKEN", token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken);
    }
}
