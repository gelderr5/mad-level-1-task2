package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityTruthTableForConjunctionBinding

class TruthTableForConjunction : AppCompatActivity() {

    private lateinit var binding: ActivityTruthTableForConjunctionBinding
    private var correctAnswer1: String = "T"
    private var correctAnswer2: String = "F"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthTableForConjunctionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnSubmit.setOnClickListener() {
            checkAnswers();
        }
    }

    private fun checkAnswers() {
        val answer1 = binding.etR1C2.text.toString()
        val answer2 = binding.etR2C2.text.toString()
        val answer3 = binding.etR3C2.text.toString()
        val answer4 = binding.etR4C2.text.toString()
        var rightAnswers = 0

        if (answer1 == correctAnswer1)
            rightAnswers += 1
        if (answer2 == correctAnswer2)
            rightAnswers += 1
        if (answer3 == correctAnswer2)
            rightAnswers += 1
        if (answer4 == correctAnswer2)
            rightAnswers += 1

        displayMessage(rightAnswers)
    }

    private fun displayMessage(rightAnswers: Int) {
        if (rightAnswers == 4)
            Toast.makeText(this, "You have all answers right!", Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "You have $rightAnswers answers right", Toast.LENGTH_LONG).show()
    }
}
