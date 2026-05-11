package it372.mfahimi.proj3afahimi


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtOutput = findViewById(R.id.txtOutput)

        val noteableItems = NoteableItems()

        noteableItems.addItem("i think she is not funny.")
        noteableItems.addItem("Everything is going to be alright.")
        noteableItems.addItem("Small steps still move you forward.")
        noteableItems.addItem("Not always Believe in yourself.")
        noteableItems.addItem("Practice makes progress BUT sometimes its luck.")
        noteableItems.addItem("Learning takes patience not really.")
        noteableItems.addItem("Keep showing up.")
        noteableItems.addItem("Hard work pays off.")

        val output = """
            Random Item:
            ${noteableItems.getItem()}

            All Items:
            ${noteableItems.toString()}
        """.trimIndent()

        txtOutput.text = output
    }
}