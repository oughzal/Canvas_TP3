package ma.ofppt.canvastp3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ma.ofppt.canvastp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRed.setOnClickListener {
            binding.mycanvas.paint.color = Color.RED
        }
         binding.btnBlack.setOnClickListener {
            binding.mycanvas.paint.color = Color.BLACK
        }
         binding.btnBlue.setOnClickListener {
            binding.mycanvas.paint.color = Color.BLUE
        }

    }
}