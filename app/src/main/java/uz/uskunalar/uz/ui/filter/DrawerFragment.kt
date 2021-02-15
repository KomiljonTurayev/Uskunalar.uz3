package uz.uskunalar.uz.ui.filter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import uz.uskunalar.uz.R

class DrawerFragment : Fragment() {
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drawer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager2 = view.findViewById(R.id.pager)

        val cAdapter = PagerAdapter(this)
        viewPager2.isUserInputEnabled = false
        viewPager2.setCurrentItem(0,true)

        viewPager2.adapter = cAdapter


    }

    fun changePage(page:Int){
        viewPager2.setCurrentItem(page,true)
    }

}