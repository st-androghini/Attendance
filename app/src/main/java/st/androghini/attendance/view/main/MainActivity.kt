package st.androghini.attendance.view.main

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import st.androghini.attendance.R
import st.androghini.attendance.adater.PageAdater
import st.androghini.attendance.view.detail.DetailFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /***
         *Fragment 구현
         */
        /*
        supportFragmentManager.beginTransaction()
            //.replace(R.id.fml_main , MainFragment() )
            .add(R.id.fml_main , MainFragment())
            .commit()
        */

        /*
            ViewPage 구현
         */

        val mViewPager: ViewPager = findViewById<ViewPager>(R.id.pager) as ViewPager
        val pagerAdapter = PageAdater(supportFragmentManager)



        pagerAdapter.addFragment(MainFragment())
        pagerAdapter.addFragment(DetailFragment())

        mViewPager.adapter = pagerAdapter;

        //DrawerLayout 구현
        val btn_open: Button = findViewById<Button>(R.id.open) as Button

        btn_open.setOnClickListener(this)

    }

    fun pageMove(){

        supportFragmentManager.beginTransaction()
            .replace(R.id.fml_main , DetailFragment() )
            .commit()

    }

    fun pageMove2(){

        supportFragmentManager.beginTransaction()
            .replace(R.id.fml_main , MainFragment() )
            .commit()

    }

    override fun onClick(v: View?) {

        val drawer: DrawerLayout = findViewById(R.id.drawer) as DrawerLayout
        if(!drawer.isDrawerOpen(Gravity.LEFT)){
            drawer.openDrawer(Gravity.LEFT)
        }else{
            drawer.closeDrawer(Gravity.LEFT)
        }
    }
}
