package st.androghini.attendance.adater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PageAdater(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


    var mNumOfTabs: Int = 0

    private val mFragmentList = ArrayList<Fragment>()


    override fun getItem(position: Int): Fragment? {

        return mFragmentList[position]
        /*when(position){

            1 -> {
                val detail:Fragment = DetailFragment() as Fragment;
                return detail;
            }

            2 -> {
                val main:Fragment = MainFragment() as Fragment;
                return main;
            }

            else -> {
                return null ;
            }
        }
        return null ;*/
    }

    fun addFragment(fragment: Fragment) {
        mFragmentList.add(fragment)
    }

    override fun getCount(): Int {

        return mFragmentList.size;
    }

}