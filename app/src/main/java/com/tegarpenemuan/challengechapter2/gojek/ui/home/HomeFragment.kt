package com.tegarpenemuan.challengechapter2.gojek.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.tegarpenemuan.challengechapter2.databinding.FragmentHomeGojekBinding
import com.tegarpenemuan.minichallenge2.adapter.CategoryGojek
import com.tegarpenemuan.minichallenge2.data.DummyGojek

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeGojekBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeGojekBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val adapter = CategoryGojek(DummyGojek.CATEGORY_GOJEKS)
        binding.rvCategory.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}