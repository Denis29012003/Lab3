package com.apps.gerashchekolab3.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.apps.gerashchekolab3.R
import com.apps.gerashchekolab3.databinding.FragmentStartBinding
import com.apps.gerashchekolab3.ui.viewmodel.FirstViewModel
import com.apps.gerashchekolab3.ui.viewmodel.RecycleViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    private val viewModel by viewModels<FirstViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            viewModel.start()
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.destination.observe(viewLifecycleOwner) { status ->
            if (status != null) {
                val action = StartFragmentDirections.actionFirstFragmentToDetailFragment()
                findNavController().navigate(action)
            }
        }


    }
}