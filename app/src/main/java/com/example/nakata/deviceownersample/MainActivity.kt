package com.example.nakata.deviceownersample

import android.app.admin.DevicePolicyManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Admin.isDeviceOwner(this)) {
            admin.text = "Device Owner"
            Log.e("####", "device owner")
        } else {
            admin.text = "Not Device Owner"
            Log.e("####", "not device owner")
        }


        password_reset.setOnClickListener {
            try {
                Admin.getDevicePolicyManager(this)
                    .resetPassword(null, DevicePolicyManager.RESET_PASSWORD_REQUIRE_ENTRY)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        wipe_device.setOnClickListener {
            try {
                Admin.getDevicePolicyManager(this).wipeData(DevicePolicyManager.WIPE_RESET_PROTECTION_DATA)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


    }

}
