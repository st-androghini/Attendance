package st.androghini.attendance.view.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.sample_page2.*
import st.androghini.attendance.R

class SampleFragment3 : Fragment() ,View.OnClickListener{


    private var activiy:Sample? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.sample_page3, null)
        activiy = super.getActivity() as Sample

        // 처리
        return view
    }

    override fun onClick(btn : View){

        when(btn){

            btnSample_back -> {
                activiy!!.move.back()
            }


        }

    }
}