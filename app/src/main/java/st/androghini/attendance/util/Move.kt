package st.androghini.attendance.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

data class Move(val fgm:FragmentManager){

    private var fgmManger:FragmentManager = fgm
    /*
    constructor(fgm:FragmentManager){
        fgmManger = fgm;
    }
    */

    //Fragment 교채
    fun PageMove(viewId:Int, fg:Fragment){
        val transaction :FragmentTransaction = fgmManger.beginTransaction()
        transaction.replace(viewId, fg)
        transaction.addToBackStack(null)
        transaction.commit()

    }

    //Fragment 교채
    fun back(){

        fgmManger.popBackStack()

    }

    fun removeIndex(idx:Int){
        fgmManger.getFragments()
    }
}