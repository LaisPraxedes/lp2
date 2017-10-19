package com.example.alunos.notifyme;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by alunos on 19/10/17.
 */

public class MyFirebaseInstanceldService extends  FireBaseInstanceIdService {
    private static final String TAG = "MIdService";

    @Override
    public void onTokenRefresh(){
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token atualizado: " + refreshedToken);
        sendRegistrationToServer(refreshedToken);
    }
    private void sendRegistrationToServer(String refreshedToken){

    }

}
