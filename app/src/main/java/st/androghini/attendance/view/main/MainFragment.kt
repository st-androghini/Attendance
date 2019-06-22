package st.androghini.attendance.view.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import st.androghini.attendance.R

class MainFragment : Fragment() ,View.OnClickListener{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        val view = inflater.inflate(R.layout.fragment_main, null)
        //val testBtn = findViewById<Button>(R.id.)
        val button1 = view.findViewById<Button>(R.id.button1);
        button1.setOnClickListener(this);

        // 처리
        return view
    }

    override fun onClick(btn : View){


        if(btn === button1){

            //Main Activity 접근
            val activiy:MainActivity = super.getActivity() as MainActivity;
            activiy.pageMove();
        }
    }
}