package cat.copernic.jreyesb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val LOG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG,"onCreate()")
    }


    override fun onResume(){
        super.onResume()
        Log.d(LOG,"onResume()")

    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG,"onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG,"onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG,"onDestroy()")
    }
}