package st.androghini.attendance.Listener

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import st.androghini.attendance.util.Dialog
import st.androghini.attendance.util.Move

abstract class ActivityListener() : View.OnClickListener, AppCompatActivity(){

    abstract var fgm: FragmentManager

    var move: Move = Move(fgm)
    val dialog: Dialog = Dialog(this) //alert

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}