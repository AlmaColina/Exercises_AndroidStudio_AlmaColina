package com.example.recycleview;
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycleview.R

class ContactAdapter(private val mContacts: List<Contact>): RecyclerView.Adapter<ContactAdapter.ViewHolder>(){
    //Guardar los contactos siempre con el recycler y el handler
    //Adapter ayuda a pintar la lista ?
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTextView: TextView = itemView.findViewById<TextView>(R.id.contact_name)
        val messageButton = itemView.findViewById<Button>(R.id.message_button)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Elementos que hay dentro del container?")
        //Cuando creamos el elemento por primera vez
        //el item_contact es lo unico que cambia = es el xml y se recicla
        //Crear inflater y pasarle el contexto, y luego pintarlo con el xml del item que hayamos creado
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_contact, parent, false)
        return ViewHolder(contactView)
        //Ya hay una vista que ponemos dentro del viewHolder
    }
    override fun getItemCount(): Int {
        TODO("Devuelve la cantidad de contactos en la lista")
        //La cantidad de elementos que quiero pintar
        return mContacts.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Se llama cada vez que se muestra una, como mapear cada objeto a la UI")
        //Cuando reciclamos
        //Buscar contacto que voy a poner segun la posicions
        //Tenemos la posicion porque es como un update se llama a cada vez que reciclamos
        //En una pantalla si hay muchos elemntos solo carga los que hay en pantalla y va recargando
        //Y pintando con los datos que le voy mandando

        val contact: Contact = mContacts.get(position)
        val textView = holder.nameTextView
        //Configurar la UI
        textView.text = contact.name
        val button = holder.messageButton
        button.text = if (contact.isOnline) "Online" else "Offline"
        button.isEnabled = contact.isOnline

    }
}