package uz.uskunalar.uz.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.item_viewpager2_top.*
import uz.uskunalar.uz.R

class ViewPager2TopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_viewpager2_top, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            imageViewPager2Top.setImageResource(it.getInt("color"))
//            tvTitle.text = "Item ${it.getInt("color")}"

        }
    }

    companion object {
        fun newInstance(color: Int): ViewPager2TopFragment {
            val fragment = ViewPager2TopFragment()
            fragment.arguments = Bundle().apply {
                putInt("color", color)
//                this?.putString("")
            }


            return fragment
        }
    }

}