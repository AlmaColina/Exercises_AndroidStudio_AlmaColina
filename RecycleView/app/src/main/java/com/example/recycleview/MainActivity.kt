package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Conectar con la recycle view y asignar el adapter, que necesita una lista de contactos
        //Ahora le paso una lista de contactos vacia y luego puedo rellenarla
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        val contact = ArrayList<Contact>()
        val c1 = Contact("Manuel", true)
        val c2 = Contact("Ana", false)
        contact.add(c1)
        contact.add(c2)
        //Le asigno el adapter y el layout
        recyclerView.adapter = ContactAdapter(contact)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}