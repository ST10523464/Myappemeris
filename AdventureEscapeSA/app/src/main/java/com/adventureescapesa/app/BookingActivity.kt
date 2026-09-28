package com.adventureescapesa.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// This screen works out a quote for the customer.
// It is all done in Kotlin - no HTML is used here because this
// screen needs to react to what the user types and picks.
class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val radioGroupItems = findViewById<RadioGroup>(R.id.radioGroupItems)
        val editNumberOfBookings = findViewById<EditText>(R.id.editNumberOfBookings)
        val textResult = findViewById<TextView>(R.id.textResult)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnCalculate.setOnClickListener {

            // Step 1: work out the price of the item the user picked
            val pricePerBooking: Int = when (radioGroupItems.checkedRadioButtonId) {
                R.id.radioUltimate -> 1500
                R.id.radioFamily -> 1500
                R.id.radioMountain -> 1500
                R.id.radioCorporate -> 1500
                R.id.radioZiplining -> 750
                R.id.radioKayaking -> 500
                R.id.radioRockClimbing -> 500
                else -> 0
            }

            // Step 2: read the number of bookings the user typed in
            val bookingsText = editNumberOfBookings.text.toString()

            if (bookingsText.isEmpty()) {
                Toast.makeText(this, "Please enter the number of bookings", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val numberOfBookings = bookingsText.toInt()

            if (numberOfBookings <= 0) {
                Toast.makeText(this, "Number of bookings must be at least 1", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Step 3: work out the subtotal before any discount
            val subtotal = pricePerBooking * numberOfBookings

            // Step 4: work out the discount, based on the rules:
            // 1 booking = no discount, 2 = 5%, 3 = 10%, more than 3 = 15%
            val discountPercent: Int = when {
                numberOfBookings == 1 -> 0
                numberOfBookings == 2 -> 5
                numberOfBookings == 3 -> 10
                else -> 15
            }

            val discountAmount = subtotal * discountPercent / 100
            val total = subtotal - discountAmount

            // Step 5: show the result on screen
            textResult.text = "Bookings: $numberOfBookings\n" +
                    "Subtotal: R$subtotal\n" +
                    "Discount: $discountPercent% (-R$discountAmount)\n" +
                    "Total to pay: R$total"
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
