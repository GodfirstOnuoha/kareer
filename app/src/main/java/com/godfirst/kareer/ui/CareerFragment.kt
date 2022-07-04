package com.godfirst.kareer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.godfirst.kareer.databinding.FragmentCareerBinding
import com.godfirst.kareer.models.Paths
import com.godfirst.kareer.util.Constants

class CareerFragment : Fragment() {

    private var _binding: FragmentCareerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentCareerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            backImage.setOnClickListener {
                requireActivity().onBackPressed()
            }
            contentCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.CONTENT_WRITING)
                findNavController().navigate(action)
            }
            designCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.DESIGN)
                findNavController().navigate(action)
            }
            humanCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.HUMAN_RESOURCE)
                findNavController().navigate(action)
            }
            programmingCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.PROGRAMMING)
                findNavController().navigate(action)
            }
            digitalCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.DIGITAL_MARKETING)
                findNavController().navigate(action)
            }
            customerCard.setOnClickListener {
                val action = CareerFragmentDirections.actionCareerFragmentToPathsFragment(Constants.CUSTOMER_SERVICE)
                findNavController().navigate(action)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}