package net.bouzuya.numberpickers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import net.bouzuya.numberpickers.databinding.NumberPickersFragmentBinding


class NumberPickersFragment : Fragment() {

    companion object {
        fun newInstance() = NumberPickersFragment()
    }

    private val viewModel: NumberPickersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return NumberPickersFragmentBinding.inflate(inflater, container, false).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel
            binding.numberPicker1.maxValue = 9
            binding.numberPicker1.minValue = 0
            binding.numberPicker1.wrapSelectorWheel = false
        }.root
    }
}
