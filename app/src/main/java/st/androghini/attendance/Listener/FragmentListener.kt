package st.androghini.attendance.Listener

import android.app.Activity
import android.view.View
import androidx.fragment.app.Fragment


abstract class FragmentListener(): View.OnClickListener, Fragment(){

    abstract val activiy:Activity


    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}