package st.androghini.attendance.view.sample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.sample_page1.*
import st.androghini.attendance.Listener.FragmentListener
import st.androghini.attendance.R

class SampleFragment1 : FragmentListener(){

    override val activiy by lazy {
        super.getActivity() as Sample

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.sample_page1, null)
        val next: Button = view.findViewById<Button>(R.id.btnSample1_next)
        val alert: Button = view.findViewById<Button>(R.id.btnAlertPage1)
        next.setOnClickListener(this)
        alert.setOnClickListener(this)


        // 처리
        return view
    }

    override fun onClick(v: View?) {
        when(v){

            btnSample1_next ->{

                activiy.move.PageMove(R.id.fml_sample, SampleFragment2())

            }

            btnAlertPage1 ->{
                activiy.dialog.alert("Alertt",  {} )
            }


        }
    }
}