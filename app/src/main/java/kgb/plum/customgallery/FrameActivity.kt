package kgb.plum.customgallery

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kgb.plum.customgallery.databinding.ActivityFrameBinding

class FrameActivity : AppCompatActivity() {

    private lateinit  var binding : ActivityFrameBinding
    private lateinit var frameAdapter: FrameAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFrameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = (intent.getStringArrayExtra("images") ?: emptyArray()).map{ uriString -> FrameItem(Uri.parse(uriString))}.toList()
        frameAdapter = FrameAdapter(images)

        binding.viewPager.adapter = frameAdapter

        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPager
        ){
            tab, position ->
            binding.viewPager.currentItem = tab.position
        }.attach()
    }
}