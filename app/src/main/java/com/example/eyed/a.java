package com.example.eyed;

import android.os.Build;
import android.webkit.PermissionRequest;

import androidx.annotation.RequiresApi;

interface a {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    void onPermissionRequest(PermissionRequest request);
}
