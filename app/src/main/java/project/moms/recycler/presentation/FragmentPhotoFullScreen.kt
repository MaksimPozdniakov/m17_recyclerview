package project.moms.recycler.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import project.moms.recycler.R
import project.moms.recycler.databinding.FragmentPhotoFulScreenBinding


class FragmentPhotoFullScreen : Fragment() {
    private var _binding : FragmentPhotoFulScreenBinding? = null
    private val binding : FragmentPhotoFulScreenBinding
        get() {
            return _binding!!
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_photo_ful_screen, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}