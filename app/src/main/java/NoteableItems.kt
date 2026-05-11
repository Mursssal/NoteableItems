package it372.mfahimi.proj3afahimi

import kotlin.random.Random

class NoteableItems {

    private val items: MutableList<String> = mutableListOf()

    fun addItem(item: String) {
        items.add(item)
    }

    fun getItem(): String {
        return if (items.isNotEmpty()) {
            items[Random.nextInt(items.size)]
        } else {
            "No items available"
        }
    }

    override fun toString(): String {
        return items.joinToString(separator = "\n")
    }
}