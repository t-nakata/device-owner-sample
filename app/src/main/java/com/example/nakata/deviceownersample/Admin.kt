package com.example.nakata.deviceownersample

import android.app.admin.DeviceAdminReceiver
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent

class Admin : DeviceAdminReceiver() {
    override fun onEnabled(context: Context?, intent: Intent?) {
        super.onEnabled(context, intent)
    }


    companion object {
        fun getAdminComponentName(context: Context): ComponentName {
            return ComponentName(context, Admin::class.java)
        }

        fun isDeviceOwner(context: Context): Boolean {
            return getDevicePolicyManager(context).isAdminActive(Admin.getAdminComponentName(context))
        }

        fun getDevicePolicyManager(context: Context): DevicePolicyManager {
            return context.getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
        }
    }
}