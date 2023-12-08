package com.apps.gerashchekolab3.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.apps.gerashchekolab3.databinding.FragmentListBinding
import com.apps.gerashchekolab3.ui.recyclerview.HeroAdapter
import com.apps.gerashchekolab3.ui.viewmodel.RecycleViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    val detailViewModel: RecycleViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclers.setHasFixedSize(true)
        binding.recyclers.layoutManager = LinearLayoutManager(requireContext())
        detailViewModel.projectsLiveData.observe(viewLifecycleOwner) { status ->
            binding.recyclers.adapter = HeroAdapter(requireContext(), status)
        }
    }
}