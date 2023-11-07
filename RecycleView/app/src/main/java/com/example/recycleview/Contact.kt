package com.example.recycleview;
//Val es una constante
class Contact(val name: String, val isOnline: Boolean) {
    //Función devuelve un array de <Contact>
    fun createContactList(numContact: Int) : ArrayList<Contact>{
        val contact = ArrayList<Contact>()
        //Contador
        var lastContactId = 0;
        for(i in 1..numContact){
            contact.add(Contact("Person" + ++lastContactId, i <= numContact/2))
            //del 1 al 10 son online
        }
        return contact
    }
}