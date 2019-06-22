package st.androghini.attendance.view.sample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.sample.*
import st.androghini.attendance.Listener.ActivityListener
import st.androghini.attendance.R
import st.androghini.attendance.util.Dialog

class Sample : ActivityListener(){
    var activityDialog:Dialog = dialog

    override var fgm: FragmentManager
        get( ) = supportFragmentManager
        set(value) {supportFragmentManager}

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample)

        val btn_alert: Button = findViewById(R.id.alert)
        val btn_confirm: Button = findViewById(R.id.confirm)
        val btn_next: Button = findViewById(R.id.next)

        btn_alert.setOnClickListener(this)
        btn_confirm.setOnClickListener(this)
        btn_next.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when(v){

            alert ->{
//                dialog.alert("테스트-Alert", ::fun_callback_alert )
                dialog.alert("test") { fun_callback_alert() }
            }

            confirm ->{
                dialog.confirm("테스트-Alert", ::fun_callback_alert , ::fun_cancel_callback_alert)
                //dialog.callbackText(::fun_aaa)
            }

            next ->{
                move.PageMove(R.id.fml_sample, SampleFragment1())
            }
        }

    }


    /**
     *
     * callback 영역
     *
     * */
    fun fun_callback_alert() {
        Toast.makeText(this, "확인!!", Toast.LENGTH_SHORT).show();
    }

    fun fun_cancel_callback_alert() {
        Toast.makeText(this, "취소!!", Toast.LENGTH_SHORT).show();
    }



}
