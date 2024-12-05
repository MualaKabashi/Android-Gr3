package com.cacttus.androidgr3

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.cacttus.androidgr3.adapters.SingerAdapter
import com.cacttus.androidgr3.models.Singer

class ComplexListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.complex_list)

        var complexList = findViewById<ListView>(R.id.complex_list)


        var singerList = listOf(
            Singer(R.drawable.gjesti, "Gjesti", 28),
            Singer(R.drawable.dua_lipa, "Dua Lipa", 25),
            Singer(R.drawable.bebe_rexha, "Bebe Rexha", 35),
            Singer(R.drawable.adele, "Adele", 38),
            Singer(R.drawable.lyrical_son, "Lyrical Son", 40),
            Singer(R.drawable.mc_kresha, "Mc Kresha", 42),
            Singer(R.drawable.beyonce, "BEYONCE", 40),
            Singer(R.drawable.billie_eilish, "Billie Eilish", 25),
            Singer(R.drawable.fifty_cent, "50 Cent", 34),
        )

        var singerAdapter = SingerAdapter(this, singerList)

        complexList.adapter = singerAdapter

        complexList.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${singerList[position].name} is clicked", Toast.LENGTH_SHORT)
                .show()
        }
    }
}