package st.androghini.attendance.view.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import st.androghini.attendance.R
import st.androghini.attendance.view.main.MainActivity
import st.androghini.attendance.view.sample.Sample


class LoginActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);

        //Kotlin 연습용 소스
        textview.text = "aaa"
        Toast.makeText(this,"메인!!", Toast.LENGTH_SHORT).show();
        /*********************************************************************************/


        //Button 등록
        val testBtn = findViewById<Button>(R.id.btn_click_me)
        val btn_samplePage = findViewById<Button>(R.id.btn_samplePage)


        testBtn.setOnClickListener(this)
        btn_samplePage.setOnClickListener(this)

    }

    override fun onClick(btn : View){

        if(btn === btn_click_me){
            val nextIntent = Intent(this, MainActivity::class.java);
            startActivity(nextIntent);
        }else if(btn === btn_samplePage){
            val nextIntent = Intent(this, Sample::class.java);
            startActivity(nextIntent);
        }



    }
}