package net.bouzuya.numberpickers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import net.bouzuya.numberpickers.databinding.NumberPickersFragmentBinding


class NumberPickersFragment : Fragment() {
    private val viewModel: NumberPickersViewModel by viewModels {
        ServiceLocator.providesNumberPickersViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return NumberPickersFragmentBinding.inflate(inflater, container, false).also { binding ->
            binding.lifecycleOwner = this
            binding.viewModel = viewModel

            binding.numberPicker1.also { numberPicker ->
                numberPicker.maxValue = 9
                numberPicker.minValue = 0
                numberPicker.wrapSelectorWheel = false
            }
            binding.numberPicker2.also { numberPicker ->
                numberPicker.maxValue = 9
                numberPicker.minValue = 0
                numberPicker.wrapSelectorWheel = false
            }
        }.root
    }
}
