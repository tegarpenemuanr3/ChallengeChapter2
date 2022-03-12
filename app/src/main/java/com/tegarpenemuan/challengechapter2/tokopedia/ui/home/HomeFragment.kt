package com.tegarpenemuan.challengechapter2.tokopedia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tegarpenemuan.challengechapter2.databinding.FragmentHomeTokopediaBinding
import com.tegarpenemuan.challengechapter2.tokopedia.data.DummyVideoTokped
import com.tegarpenemuan.minichallenge2.adapter.CategoryTokped
import com.tegarpenemuan.minichallenge2.adapter.SlideTokped
import com.tegarpenemuan.minichallenge2.adapter.VideoTokped
import com.tegarpenemuan.minichallenge2.data.DummyTokped
import com.tegarpenemuan.minichallenge2.data.DummyTokpedSlider

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeTokopediaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeTokopediaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val adapter = CategoryTokped(DummyTokped.CATEGORY_TOKPEDS)
        binding.rvCategory.adapter = adapter

        val adapter_slide = SlideTokped(DummyTokpedSlider.SLIDER_TOKPEDS)
        binding.rvSlider.adapter = adapter_slide

        val adapter2 = CategoryTokped(DummyTokped.CATEGORY_TOKPEDS)
        binding.rvCategory2.adapter = adapter2

        val adapter_video = VideoTokped(DummyVideoTokped.VIDEO_TOKPEDS)
        binding.rvVideo.adapter = adapter_video

        val adapter_video2 = VideoTokped(DummyVideoTokped.VIDEO_TOKPEDS)
        binding.rvVideo2.adapter = adapter_video2


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}