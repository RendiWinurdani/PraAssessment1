package org.d3if4084.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import org.d3if4084.praassesment.databinding.ActivityMainBinding
import org.d3if4084.praassesment.databinding.FragmentPraAssessmentBinding

/**
 * A simple [Fragment] subclass.
 */
class PraAssessment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPraAssessmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_pra_assessment,
            container, false
        )
        binding.bPersegipanjang.setOnClickListener {v:View->
            v.findNavController().navigate(R.id.action_praAssessment_to_persegiPanjang)
        }

        binding.bSegitiga.setOnClickListener {v:View->
            v.findNavController().navigate(R.id.action_praAssessment_to_segitiga)
        }
        return binding.root
    }




}
