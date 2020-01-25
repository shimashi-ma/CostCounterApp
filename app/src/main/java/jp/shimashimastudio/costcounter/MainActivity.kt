package jp.shimashimastudio.costcounter

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.fab
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    //ListAdapterを保持するプロパティを定義しておく
    private lateinit var mListAdapter: ListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ボタンを押したら新規作成画面へ遷移する
        fab.setOnClickListener {
            val intent = Intent(this@MainActivity,SettingActivity::class.java)
            startActivity(intent)
        }

        // ListViewの設定
        mListAdapter = ListAdapter(this@MainActivity)

        reloadListView()
    }

    private fun reloadListView() {
        // 後でTaskクラスに変更する
        val taskList = mutableListOf("aaa", "bbb", "ccc")

        mListAdapter.monolist = taskList
        listView1.adapter = mListAdapter
        mListAdapter.notifyDataSetChanged()
    }

}
