package tw.edu.pu.csim.wang.tzuyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"

    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = “Hello tcyang”

        TestMaster()
    }

    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"
        TestDEV()
    }

    fun TestDEV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支"
    }
}

override fun onTouchEvent(event: MotionEvent?): Boolean {
    var txv:TextView = findViewById<TextView>(R.id.txv)
    txv.text = "tcyangpu修改螢幕觸控"
    return true
}
