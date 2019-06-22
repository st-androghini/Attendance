package st.androghini.attendance.util

import android.app.Activity
import android.app.AlertDialog
import st.androghini.attendance.R

data class Dialog(val activity:Activity) {


    /**
     * @param 메세지
     * @param callback:Object
     */
    fun alert(mag:String, function: () -> Any ){

        val alertBuilder:AlertDialog.Builder = AlertDialog.Builder(activity)
        alertBuilder.setMessage(mag)
        alertBuilder.setPositiveButton(R.string.ok){ _,_->
            function()
        }

        _show(alertBuilder)
    }


    /**
     *
     *  @param 메세지
     *  @param 확인 callback: Object
     *  @param 취소 callback: Ojfect
     *
     */
    fun confirm(mag:String, confirm: () -> Unit, cancel: () -> Any){
        val alertBuilder:AlertDialog.Builder = AlertDialog.Builder(activity)
        alertBuilder.setMessage(mag)

        alertBuilder.setPositiveButton(R.string.ok){ _,_->
            confirm()
        }

        alertBuilder.setNegativeButton(R.string.cancel){ _,_->
            cancel()
        }

        _show(alertBuilder)
    }

    fun popup(){
        /**
         * 커프텀 팝업 구현
         */
    }

    fun _show(builder:AlertDialog.Builder){
        val alertDialog:AlertDialog = builder.create();
        alertDialog.show();
    }


}