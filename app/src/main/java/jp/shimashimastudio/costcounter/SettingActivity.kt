package jp.shimashimastudio.costcounter

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_setting.*
import android.app.DatePickerDialog
import android.util.Log

class SettingActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        calenderbutton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.calenderbutton -> showDatePickerDialog()
        }
    }


    private fun showDatePickerDialog(){
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener(){view, year, month, dayOfMonth->
                Log.d("UI_PARTS", "$year/${month+1}/$dayOfMonth")

                val year = year.toString()
                val month = month.toString()
                val dayOfMonth = dayOfMonth.toString()

                todaytext.text = year + month + dayOfMonth

            },
            2020,
            1,
            1
        )
        datePickerDialog.show()
    }

}
