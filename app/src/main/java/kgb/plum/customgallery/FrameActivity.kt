package kgb.plum.customgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kgb.plum.customgallery.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {

    private lateinit  var binding : ActivityFrameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}