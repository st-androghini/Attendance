package st.androghini.attendance.view.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.sample_page2.*
import st.androghini.attendance.R

class SampleFragment2 : Fragment() ,View.OnClickListener{


    private var activiy:Sample? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        val view = inflater.inflate(R.layout.sample_page2, null)
        //val button1 = view.findViewById<Button>(R.id.button1);
        //button1.setOnClickListener(this);
        //btnSample_back
        val btn_back: Button = view.findViewById(R.id.btnSample_back) as Button
        val btn_next: Button = view.findViewById(R.id.btnSample_next) as Button

        activiy = super.getActivity() as Sample

        btn_back.setOnClickListener(this)

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