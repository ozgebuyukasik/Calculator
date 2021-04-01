ackage com.ozgebuyukasik.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.ozgebuyukasik.kotlinlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var firstNumber : Int? = null
    var secondNumber : Int? = null
    var resultText : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun addition(view : View){
        firstNumber = binding.firstNumberInput.text.toString().toIntOrNull()
        secondNumber = binding.secondNumberInput.text.toString().toIntOrNull()
        if(firstNumber == null || secondNumber == null){
            println("Invalid inputs!")
        }
        else{
            val result = firstNumber!! + secondNumber!!
            resultText = "Result : ${result}"
            binding.resultText.text = resultText
        }
    }
    fun substraction(view : View){
        firstNumber = binding.firstNumberInput.text.toString().toIntOrNull()
        secondNumber = binding.secondNumberInput.text.toString().toIntOrNull()
        if(firstNumber == null || secondNumber == null){
            println("Invalid inputs!")
        }
        else{
            val result = firstNumber!! - secondNumber!!
            resultText = "Result : ${result}"
            binding.resultText.text = resultText
        }
    }
    fun multiply(view : View){
        firstNumber = binding.firstNumberInput.text.toString().toIntOrNull()
        secondNumber = binding.secondNumberInput.text.toString().toIntOrNull()
        if(firstNumber == null || secondNumber == null){
            println("Invalid inputs!")
        }
        else{
            val result = firstNumber!! * secondNumber!!
            resultText = "Result : ${result}"
            binding.resultText.text = resultText
        }
    }
    fun division(view : View){
        firstNumber = binding.firstNumberInput.text.toString().toIntOrNull()
        secondNumber = binding.secondNumberInput.text.toString().toIntOrNull()
        if(firstNumber == null || secondNumber == null){
            println("Invalid inputs!")
        }
        else{
            val result = firstNumber!! / secondNumber!!
            resultText = "Result : ${result}"
            binding.resultText.text = resultText
        }
    }

}