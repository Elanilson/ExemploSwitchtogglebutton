package br.com.cashpago.exemplosswitchtogglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.cashpago.exemplosswitchtogglebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            switch1.setOnClickListener {
                var toglee = toggleButton.isChecked
                var switch = switch1.isChecked
                Toast.makeText(this@MainActivity,"toggle ativo: $toglee, switch ativo: $switch",Toast.LENGTH_SHORT).show()
               }



        }
    }
}