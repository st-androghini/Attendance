package st.androghini.attendance.view.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fargment_detail.*
import st.androghini.attendance.R
import st.androghini.attendance.view.main.MainActivity

class DetailFragment : Fragment(), View.OnClickListener
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.fargment_detail, null)
        //val testBtn = findViewById<Button>(R.id.)
        //val button1 = view.findViewById<Button>(R.id.button1);
        //button1.setOnClickListener(this);
        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener(this);
        // 처리
        return view
    }

    override fun onClick(v: View?) {

        if(v === button2){

            //Main Activity 접근
            val activiy: MainActivity = super.getActivity() as MainActivity;
            activiy.pageMove2();
        }
    }
}