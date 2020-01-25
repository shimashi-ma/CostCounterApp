package jp.shimashimastudio.costcounter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.content.Context
import android.widget.TextView

class ListAdapter(context: Context): BaseAdapter() {

    var monolist = mutableListOf<String>() //とりあえず

    //他のxmlリソースのViewを取り扱うための仕組みであるLayoutInflaterをプロパティとして定義しておき、
    // コンストラクタを新規に追加して取得しておきます。
    private val mLayoutInflater: LayoutInflater

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    //Viewを返す
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        //getViewメソッドの引数であるconvertViewがnullのときはLayoutInflaterを使ってsimple_list_item_2からViewを取得します(エルビス演算子?:は左辺がnullの時に右辺を返します)。
        //simple_list_item_2はタイトルとサブタイトルがあるセルです。
        val view: View = convertView ?: mLayoutInflater.inflate(android.R.layout.simple_list_item_2, null)

        val textView1 = view.findViewById<TextView>(android.R.id.text1)
        val textView2 = view.findViewById<TextView>(android.R.id.text2)

        // 後でTaskクラスから情報を取得するように変更する
        textView1.text = monolist[position]

        return view
    }

    //アイテムを返す
    override fun getItem(position: Int): Any {
        return monolist[position]
    }

    //アイテムIDを返す
    override fun getItemId(position: Int): Long {
        return 0
    }

    //アイテムの数を返す
    override fun getCount(): Int {
        return monolist.size
    }

}
