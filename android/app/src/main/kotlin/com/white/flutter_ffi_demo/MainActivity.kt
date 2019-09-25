package com.white.flutter_ffi_demo

import android.os.Bundle
import android.util.Log

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import java.nio.IntBuffer

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
//    val retry = IntBuffer.allocate(1)
//    JnaTools.INSTANCE.getAge(retry)
//    Log.d("liuyx","jna getAge:"+retry.array()[0]);

    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
  }
}
