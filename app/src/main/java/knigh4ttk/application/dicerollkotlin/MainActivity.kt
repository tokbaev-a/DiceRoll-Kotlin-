package knigh4ttk.application.dicerollkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var firstDice: ImageView
    private lateinit var secondDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = getString(R.string.let_roll)
        rollButton.setOnClickListener{
            rollDice()
            firstDice.setImageResource(rollDice())
            rollDice()
            secondDice.setImageResource(rollDice())
        }

        this.firstDice = findViewById(R.id.first_dice)
        this.secondDice = findViewById(R.id.second_dice)
    }

    private fun rollDice(): Int {
        return when (java.util.Random().nextInt(6)+1) {
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5
            else -> R.drawable.ic_dice_6
        }
    }


}