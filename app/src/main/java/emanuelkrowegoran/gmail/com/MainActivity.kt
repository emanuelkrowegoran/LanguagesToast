package emanuelkrowegoran.gmail.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.R.layout.simple_list_item_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //menghubungkan kelas kt dengan kelas xml

//data yang digunkan->array
        val languages =
            //membuat varible languages
                listOf("Java","Kotlin","Javascript","PHP","Pyhton")
        //membuat list dan mengisi konten adapter
        lv_languages.adapter = ArrayAdapter(this,simple_list_item_1, languages)
        //membuat simple list view

        //membuat event click listener
        lv_languages.setOnItemClickListener {parent, view,position, id ->
            Toast.makeText(this, "Anda memilih :${languages[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
